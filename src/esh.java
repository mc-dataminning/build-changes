import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.net.URL;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeoutException;
import java.util.function.Function;
import org.slf4j.Logger;

public class esh extends esi {
   private static final Logger b = LogUtils.getLogger();
   private static final uv c = uv.c("mco.connect.connecting");
   private final epi d;
   private final faz e;

   public esh(faz $$0, epi $$1) {
      this.e = $$0;
      this.d = $$1;
   }

   @Override
   public void run() {
      epj $$0;
      try {
         $$0 = this.f();
      } catch (CancellationException var4) {
         b.info("User aborted connecting to realms");
         return;
      } catch (eqe var5) {
         switch (var5.a.a()) {
            case 6002:
               a(new erm(this.e, this.d));
               return;
            case 6006:
               boolean $$3 = eti.N().b(this.d.g);
               a(
                  (faz)($$3
                     ? new eqp(this.e, this.d.a, this.d.m == epi.d.b)
                     : new eqv(uv.c("mco.brokenworld.nonowner.title"), uv.c("mco.brokenworld.nonowner.error"), this.e))
               );
               return;
            default:
               this.a(var5);
               b.error("Couldn't connect to world", var5);
               return;
         }
      } catch (TimeoutException var6) {
         this.a(uv.c("mco.errorMessage.connectionFailure"));
         return;
      } catch (Exception var7) {
         b.error("Couldn't connect to world", var7);
         this.a(var7);
         return;
      }

      boolean $$7 = $$0.b != null && $$0.c != null;
      faz $$8 = (faz)($$7 ? this.a($$0, this::a) : this.a($$0));
      a($$8);
   }

   @Override
   public uv a() {
      return c;
   }

   private epj f() throws eqe, TimeoutException, CancellationException {
      eor $$0 = eor.a();

      for (int $$1 = 0; $$1 < 40; $$1++) {
         if (this.d()) {
            throw new CancellationException();
         }

         try {
            return $$0.c(this.d.a);
         } catch (eqf var4) {
            a((long)var4.c);
         }
      }

      throw new TimeoutException();
   }

   public eqy a(epj $$0) {
      return new eqz(this.e, new ese(this.e, this.d, $$0));
   }

   private eqx a(epj $$0, Function<epj, faz> $$1) {
      BooleanConsumer $$2 = $$2x -> {
         if (!$$2x) {
            a(this.e);
         } else {
            this.b($$0).thenRun(() -> a($$1.apply($$0))).exceptionally($$1xx -> {
               eti.N().ab().a();
               b.error("Failed to download resource pack from {}", $$0, $$1xx);
               a(new eqv(uv.c("mco.download.resourcePack.fail"), this.e));
               return null;
            });
         }
      };
      return new eqx($$2, eqx.a.b, uv.c("mco.configure.world.resourcepack.question.line1"), uv.c("mco.configure.world.resourcepack.question.line2"), true);
   }

   private CompletableFuture<?> b(epj $$0) {
      try {
         return eti.N().ab().a(new URL($$0.b), $$0.c, false);
      } catch (Exception var4) {
         CompletableFuture<Void> $$2 = new CompletableFuture<>();
         $$2.completeExceptionally(var4);
         return $$2;
      }
   }
}
