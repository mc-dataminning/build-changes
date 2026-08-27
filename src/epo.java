import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.net.URL;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeoutException;
import java.util.function.Function;
import org.slf4j.Logger;

public class epo extends epp {
   private static final Logger b = LogUtils.getLogger();
   private static final tl c = tl.c("mco.connect.connecting");
   private final emq d;
   private final eye e;

   public epo(eye $$0, emq $$1) {
      this.e = $$0;
      this.d = $$1;
   }

   @Override
   public void run() {
      emr $$0;
      try {
         $$0 = this.f();
      } catch (CancellationException var4) {
         b.info("User aborted connecting to realms");
         return;
      } catch (enm var5) {
         switch (var5.a.a()) {
            case 6002:
               a(new eou(this.e, this.d));
               return;
            case 6006:
               boolean $$3 = eqp.O().b(this.d.g);
               a(
                  (eye)($$3
                     ? new enx(this.e, this.d.a, this.d.m == emq.c.b)
                     : new eod(tl.c("mco.brokenworld.nonowner.title"), tl.c("mco.brokenworld.nonowner.error"), this.e))
               );
               return;
            default:
               this.a(var5);
               b.error("Couldn't connect to world", var5);
               return;
         }
      } catch (TimeoutException var6) {
         this.a(tl.c("mco.errorMessage.connectionFailure"));
         return;
      } catch (Exception var7) {
         b.error("Couldn't connect to world", var7);
         this.a(var7);
         return;
      }

      boolean $$7 = $$0.b != null && $$0.c != null;
      eye $$8 = (eye)($$7 ? this.a($$0, this::a) : this.a($$0));
      a($$8);
   }

   @Override
   public tl a() {
      return c;
   }

   private emr f() throws enm, TimeoutException, CancellationException {
      elz $$0 = elz.a();

      for (int $$1 = 0; $$1 < 40; $$1++) {
         if (this.d()) {
            throw new CancellationException();
         }

         try {
            return $$0.c(this.d.a);
         } catch (enn var4) {
            a((long)var4.c);
         }
      }

      throw new TimeoutException();
   }

   public eog a(emr $$0) {
      return new eoh(this.e, new epm(this.e, this.d, $$0));
   }

   private eof a(emr $$0, Function<emr, eye> $$1) {
      BooleanConsumer $$2 = $$2x -> {
         if (!$$2x) {
            a(this.e);
         } else {
            this.b($$0).thenRun(() -> a($$1.apply($$0))).exceptionally($$1xx -> {
               eqp.O().ac().a();
               b.error("Failed to download resource pack from {}", $$0, $$1xx);
               a(new eod(tl.c("mco.download.resourcePack.fail"), this.e));
               return null;
            });
         }
      };
      return new eof($$2, eof.a.b, tl.c("mco.configure.world.resourcepack.question.line1"), tl.c("mco.configure.world.resourcepack.question.line2"), true);
   }

   private CompletableFuture<?> b(emr $$0) {
      try {
         return eqp.O().ac().a(new URL($$0.b), $$0.c, false);
      } catch (Exception var4) {
         CompletableFuture<Void> $$2 = new CompletableFuture<>();
         $$2.completeExceptionally(var4);
         return $$2;
      }
   }
}
