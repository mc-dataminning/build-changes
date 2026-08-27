import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.net.URL;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.Function;
import org.slf4j.Logger;

public class epl extends epm {
   private static final Logger c = LogUtils.getLogger();
   private final emn d;
   private final exz e;
   private final elr f;
   private final ReentrantLock g;

   public epl(elr $$0, exz $$1, emn $$2, ReentrantLock $$3) {
      this.e = $$1;
      this.f = $$0;
      this.d = $$2;
      this.g = $$3;
   }

   @Override
   public void run() {
      this.b(tf.c("mco.connect.connecting"));

      emo $$0;
      try {
         $$0 = this.e();
      } catch (CancellationException var4) {
         c.info("User aborted connecting to realms");
         return;
      } catch (enj var5) {
         switch (var5.a.a()) {
            case 6002:
               a(new eor(this.e, this.f, this.d));
               return;
            case 6006:
               boolean $$3 = eqm.O().b(this.d.g);
               a(
                  (exz)($$3
                     ? new env(this.e, this.f, this.d.a, this.d.m == emn.c.b)
                     : new eob(tf.c("mco.brokenworld.nonowner.title"), tf.c("mco.brokenworld.nonowner.error"), this.e))
               );
               return;
            default:
               this.a(var5);
               c.error("Couldn't connect to world", var5);
               return;
         }
      } catch (TimeoutException var6) {
         this.a(tf.c("mco.errorMessage.connectionFailure"));
         return;
      } catch (Exception var7) {
         c.error("Couldn't connect to world", var7);
         this.a(var7);
         return;
      }

      boolean $$7 = $$0.b != null && $$0.c != null;
      exz $$8 = (exz)($$7 ? this.a($$0, this::a) : this.a($$0));
      a($$8);
   }

   private emo e() throws enj, TimeoutException, CancellationException {
      elw $$0 = elw.a();

      for (int $$1 = 0; $$1 < 40; $$1++) {
         if (this.c()) {
            throw new CancellationException();
         }

         try {
            return $$0.c(this.d.a);
         } catch (enk var4) {
            a((long)var4.c);
         }
      }

      throw new TimeoutException();
   }

   public eoe a(emo $$0) {
      return new eoe(this.e, new epj(this.e, this.d, $$0));
   }

   private eod a(emo $$0, Function<emo, exz> $$1) {
      BooleanConsumer $$2 = $$2x -> {
         try {
            if ($$2x) {
               this.b($$0).thenRun(() -> a($$1.apply($$0))).exceptionally($$1xx -> {
                  eqm.O().ac().a();
                  c.error("Failed to download resource pack from {}", $$0, $$1xx);
                  a(new eob(tf.c("mco.download.resourcePack.fail"), this.e));
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
      return new eod($$2, eod.a.b, tf.c("mco.configure.world.resourcepack.question.line1"), tf.c("mco.configure.world.resourcepack.question.line2"), true);
   }

   private CompletableFuture<?> b(emo $$0) {
      try {
         return eqm.O().ac().a(new URL($$0.b), $$0.c, false);
      } catch (Exception var4) {
         CompletableFuture<Void> $$2 = new CompletableFuture<>();
         $$2.completeExceptionally(var4);
         return $$2;
      }
   }
}
