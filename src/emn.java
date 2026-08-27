import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.net.URL;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.Function;
import org.slf4j.Logger;

public class emn extends emo {
   private static final Logger c = LogUtils.getLogger();
   private final ejq d;
   private final euq e;
   private final eiu f;
   private final ReentrantLock g;

   public emn(eiu $$0, euq $$1, ejq $$2, ReentrantLock $$3) {
      this.e = $$1;
      this.f = $$0;
      this.d = $$2;
      this.g = $$3;
   }

   @Override
   public void run() {
      this.b(sw.c("mco.connect.connecting"));

      ejr $$0;
      try {
         $$0 = this.e();
      } catch (CancellationException var4) {
         c.info("User aborted connecting to realms");
         return;
      } catch (ekm var5) {
         switch (var5.a(-1)) {
            case 6002:
               a(new elt(this.e, this.f, this.d));
               return;
            case 6006:
               boolean $$3 = this.d.g.equals(enn.N().U().b());
               a(
                  (euq)($$3
                     ? new eky(this.e, this.f, this.d.a, this.d.m == ejq.c.b)
                     : new ele(sw.c("mco.brokenworld.nonowner.title"), sw.c("mco.brokenworld.nonowner.error"), this.e))
               );
               return;
            default:
               this.a(var5.toString());
               c.error("Couldn't connect to world", var5);
               return;
         }
      } catch (TimeoutException var6) {
         this.a(sw.c("mco.errorMessage.connectionFailure"));
         return;
      } catch (Exception var7) {
         c.error("Couldn't connect to world", var7);
         this.a(var7.getLocalizedMessage());
         return;
      }

      boolean $$7 = $$0.b != null && $$0.c != null;
      euq $$8 = (euq)($$7 ? this.a($$0, this::a) : this.a($$0));
      a($$8);
   }

   private ejr e() throws ekm, TimeoutException, CancellationException {
      eiz $$0 = eiz.a();

      for (int $$1 = 0; $$1 < 40; $$1++) {
         if (this.c()) {
            throw new CancellationException();
         }

         try {
            return $$0.c(this.d.a);
         } catch (ekn var4) {
            a((long)var4.e);
         }
      }

      throw new TimeoutException();
   }

   public elh a(ejr $$0) {
      return new elh(this.e, new eml(this.e, this.d, $$0));
   }

   private elg a(ejr $$0, Function<ejr, euq> $$1) {
      BooleanConsumer $$2 = $$2x -> {
         try {
            if ($$2x) {
               this.b($$0).thenRun(() -> a($$1.apply($$0))).exceptionally($$1xx -> {
                  enn.N().ab().a();
                  c.error("Failed to download resource pack from {}", $$0, $$1xx);
                  a(new ele(sw.c("mco.download.resourcePack.fail"), this.e));
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
      return new elg($$2, elg.a.b, sw.c("mco.configure.world.resourcepack.question.line1"), sw.c("mco.configure.world.resourcepack.question.line2"), true);
   }

   private CompletableFuture<?> b(ejr $$0) {
      try {
         return enn.N().ab().a(new URL($$0.b), $$0.c, false);
      } catch (Exception var4) {
         CompletableFuture<Void> $$2 = new CompletableFuture<>();
         $$2.completeExceptionally(var4);
         return $$2;
      }
   }
}
