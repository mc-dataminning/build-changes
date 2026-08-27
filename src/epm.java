import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.net.URL;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.Function;
import org.slf4j.Logger;

public class epm extends epn {
   private static final Logger c = LogUtils.getLogger();
   private final emo d;
   private final exv e;
   private final els f;
   private final ReentrantLock g;

   public epm(els $$0, exv $$1, emo $$2, ReentrantLock $$3) {
      this.e = $$1;
      this.f = $$0;
      this.d = $$2;
      this.g = $$3;
   }

   @Override
   public void run() {
      this.b(te.c("mco.connect.connecting"));

      emp $$0;
      try {
         $$0 = this.e();
      } catch (CancellationException var4) {
         c.info("User aborted connecting to realms");
         return;
      } catch (enk var5) {
         switch (var5.a.a()) {
            case 6002:
               a(new eos(this.e, this.f, this.d));
               return;
            case 6006:
               boolean $$3 = eqn.N().b(this.d.g);
               a(
                  (exv)($$3
                     ? new enw(this.e, this.f, this.d.a, this.d.m == emo.c.b)
                     : new eoc(te.c("mco.brokenworld.nonowner.title"), te.c("mco.brokenworld.nonowner.error"), this.e))
               );
               return;
            default:
               this.a(var5);
               c.error("Couldn't connect to world", var5);
               return;
         }
      } catch (TimeoutException var6) {
         this.a(te.c("mco.errorMessage.connectionFailure"));
         return;
      } catch (Exception var7) {
         c.error("Couldn't connect to world", var7);
         this.a(var7);
         return;
      }

      boolean $$7 = $$0.b != null && $$0.c != null;
      exv $$8 = (exv)($$7 ? this.a($$0, this::a) : this.a($$0));
      a($$8);
   }

   private emp e() throws enk, TimeoutException, CancellationException {
      elx $$0 = elx.a();

      for (int $$1 = 0; $$1 < 40; $$1++) {
         if (this.c()) {
            throw new CancellationException();
         }

         try {
            return $$0.c(this.d.a);
         } catch (enl var4) {
            a((long)var4.c);
         }
      }

      throw new TimeoutException();
   }

   public eof a(emp $$0) {
      return new eof(this.e, new epk(this.e, this.d, $$0));
   }

   private eoe a(emp $$0, Function<emp, exv> $$1) {
      BooleanConsumer $$2 = $$2x -> {
         try {
            if ($$2x) {
               this.b($$0).thenRun(() -> a($$1.apply($$0))).exceptionally($$1xx -> {
                  eqn.N().ab().a();
                  c.error("Failed to download resource pack from {}", $$0, $$1xx);
                  a(new eoc(te.c("mco.download.resourcePack.fail"), this.e));
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
      return new eoe($$2, eoe.a.b, te.c("mco.configure.world.resourcepack.question.line1"), te.c("mco.configure.world.resourcepack.question.line2"), true);
   }

   private CompletableFuture<?> b(emp $$0) {
      try {
         return eqn.N().ab().a(new URL($$0.b), $$0.c, false);
      } catch (Exception var4) {
         CompletableFuture<Void> $$2 = new CompletableFuture<>();
         $$2.completeExceptionally(var4);
         return $$2;
      }
   }
}
