import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.net.URL;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.Function;
import org.slf4j.Logger;

public class epu extends epv {
   private static final Logger b = LogUtils.getLogger();
   private static final tm c = tm.c("mco.connect.connecting");
   private final emw d;
   private final eyk e;
   private final ema f;
   private final ReentrantLock g;

   public epu(ema $$0, eyk $$1, emw $$2, ReentrantLock $$3) {
      this.e = $$1;
      this.f = $$0;
      this.d = $$2;
      this.g = $$3;
   }

   @Override
   public void run() {
      emx $$0;
      try {
         $$0 = this.f();
      } catch (CancellationException var4) {
         b.info("User aborted connecting to realms");
         return;
      } catch (ens var5) {
         switch (var5.a.a()) {
            case 6002:
               a(new epa(this.e, this.f, this.d));
               return;
            case 6006:
               boolean $$3 = eqv.O().b(this.d.g);
               a(
                  (eyk)($$3
                     ? new eod(this.e, this.f, this.d.a, this.d.m == emw.c.b)
                     : new eoj(tm.c("mco.brokenworld.nonowner.title"), tm.c("mco.brokenworld.nonowner.error"), this.e))
               );
               return;
            default:
               this.a(var5);
               b.error("Couldn't connect to world", var5);
               return;
         }
      } catch (TimeoutException var6) {
         this.a(tm.c("mco.errorMessage.connectionFailure"));
         return;
      } catch (Exception var7) {
         b.error("Couldn't connect to world", var7);
         this.a(var7);
         return;
      }

      boolean $$7 = $$0.b != null && $$0.c != null;
      eyk $$8 = (eyk)($$7 ? this.a($$0, this::a) : this.a($$0));
      a($$8);
   }

   @Override
   public tm a() {
      return c;
   }

   private emx f() throws ens, TimeoutException, CancellationException {
      emf $$0 = emf.a();

      for (int $$1 = 0; $$1 < 40; $$1++) {
         if (this.d()) {
            throw new CancellationException();
         }

         try {
            return $$0.c(this.d.a);
         } catch (ent var4) {
            a((long)var4.c);
         }
      }

      throw new TimeoutException();
   }

   public eom a(emx $$0) {
      return new eon(this.e, new eps(this.e, this.d, $$0));
   }

   private eol a(emx $$0, Function<emx, eyk> $$1) {
      BooleanConsumer $$2 = $$2x -> {
         try {
            if ($$2x) {
               this.b($$0).thenRun(() -> a($$1.apply($$0))).exceptionally($$1xx -> {
                  eqv.O().ac().a();
                  b.error("Failed to download resource pack from {}", $$0, $$1xx);
                  a(new eoj(tm.c("mco.download.resourcePack.fail"), this.e));
                  return null;
               });
               return;
            }

            a(this.e);
         } finally {
            if (this.g.isHeldByCurrentThread()) {
               this.g.unlock();
            }
         }
      };
      return new eol($$2, eol.a.b, tm.c("mco.configure.world.resourcepack.question.line1"), tm.c("mco.configure.world.resourcepack.question.line2"), true);
   }

   private CompletableFuture<?> b(emx $$0) {
      try {
         return eqv.O().ac().a(new URL($$0.b), $$0.c, false);
      } catch (Exception var4) {
         CompletableFuture<Void> $$2 = new CompletableFuture<>();
         $$2.completeExceptionally(var4);
         return $$2;
      }
   }
}
