import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.net.URL;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.Function;
import org.slf4j.Logger;

public class epp extends epq {
   private static final Logger b = LogUtils.getLogger();
   private static final ti c = ti.c("mco.connect.connecting");
   private final emr d;
   private final eyf e;
   private final elv f;
   private final ReentrantLock g;

   public epp(elv $$0, eyf $$1, emr $$2, ReentrantLock $$3) {
      this.e = $$1;
      this.f = $$0;
      this.d = $$2;
      this.g = $$3;
   }

   @Override
   public void run() {
      ems $$0;
      try {
         $$0 = this.f();
      } catch (CancellationException var4) {
         b.info("User aborted connecting to realms");
         return;
      } catch (enn var5) {
         switch (var5.a.a()) {
            case 6002:
               a(new eov(this.e, this.f, this.d));
               return;
            case 6006:
               boolean $$3 = eqq.O().b(this.d.g);
               a(
                  (eyf)($$3
                     ? new eny(this.e, this.f, this.d.a, this.d.m == emr.c.b)
                     : new eoe(ti.c("mco.brokenworld.nonowner.title"), ti.c("mco.brokenworld.nonowner.error"), this.e))
               );
               return;
            default:
               this.a(var5);
               b.error("Couldn't connect to world", var5);
               return;
         }
      } catch (TimeoutException var6) {
         this.a(ti.c("mco.errorMessage.connectionFailure"));
         return;
      } catch (Exception var7) {
         b.error("Couldn't connect to world", var7);
         this.a(var7);
         return;
      }

      boolean $$7 = $$0.b != null && $$0.c != null;
      eyf $$8 = (eyf)($$7 ? this.a($$0, this::a) : this.a($$0));
      a($$8);
   }

   @Override
   public ti a() {
      return c;
   }

   private ems f() throws enn, TimeoutException, CancellationException {
      ema $$0 = ema.a();

      for (int $$1 = 0; $$1 < 40; $$1++) {
         if (this.d()) {
            throw new CancellationException();
         }

         try {
            return $$0.c(this.d.a);
         } catch (eno var4) {
            a((long)var4.c);
         }
      }

      throw new TimeoutException();
   }

   public eoh a(ems $$0) {
      return new eoi(this.e, new epn(this.e, this.d, $$0));
   }

   private eog a(ems $$0, Function<ems, eyf> $$1) {
      BooleanConsumer $$2 = $$2x -> {
         try {
            if ($$2x) {
               this.b($$0).thenRun(() -> a($$1.apply($$0))).exceptionally($$1xx -> {
                  eqq.O().ac().a();
                  b.error("Failed to download resource pack from {}", $$0, $$1xx);
                  a(new eoe(ti.c("mco.download.resourcePack.fail"), this.e));
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
      return new eog($$2, eog.a.b, ti.c("mco.configure.world.resourcepack.question.line1"), ti.c("mco.configure.world.resourcepack.question.line2"), true);
   }

   private CompletableFuture<?> b(ems $$0) {
      try {
         return eqq.O().ac().a(new URL($$0.b), $$0.c, false);
      } catch (Exception var4) {
         CompletableFuture<Void> $$2 = new CompletableFuture<>();
         $$2.completeExceptionally(var4);
         return $$2;
      }
   }
}
