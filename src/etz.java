import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.net.URL;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeoutException;
import java.util.function.Function;
import org.slf4j.Logger;

public class etz extends eua {
   private static final Logger b = LogUtils.getLogger();
   private static final vd c = vd.c("mco.connect.connecting");
   private final era d;
   private final fct e;

   public etz(fct $$0, era $$1) {
      this.e = $$0;
      this.d = $$1;
   }

   @Override
   public void run() {
      erb $$0;
      try {
         $$0 = this.f();
      } catch (CancellationException var4) {
         b.info("User aborted connecting to realms");
         return;
      } catch (erw var5) {
         switch (var5.a.a()) {
            case 6002:
               a(new ete(this.e, this.d));
               return;
            case 6006:
               boolean $$3 = eva.N().b(this.d.g);
               a(
                  (fct)($$3
                     ? new esh(this.e, this.d.a, this.d.m == era.d.b)
                     : new esn(vd.c("mco.brokenworld.nonowner.title"), vd.c("mco.brokenworld.nonowner.error"), this.e))
               );
               return;
            default:
               this.a(var5);
               b.error("Couldn't connect to world", var5);
               return;
         }
      } catch (TimeoutException var6) {
         this.a(vd.c("mco.errorMessage.connectionFailure"));
         return;
      } catch (Exception var7) {
         b.error("Couldn't connect to world", var7);
         this.a(var7);
         return;
      }

      boolean $$7 = $$0.b != null && $$0.c != null;
      fct $$8 = (fct)($$7 ? this.a($$0, this::a) : this.a($$0));
      a($$8);
   }

   @Override
   public vd a() {
      return c;
   }

   private erb f() throws erw, TimeoutException, CancellationException {
      eqj $$0 = eqj.a();

      for (int $$1 = 0; $$1 < 40; $$1++) {
         if (this.d()) {
            throw new CancellationException();
         }

         try {
            return $$0.c(this.d.a);
         } catch (erx var4) {
            a((long)var4.c);
         }
      }

      throw new TimeoutException();
   }

   public esq a(erb $$0) {
      return new esr(this.e, new etw(this.e, this.d, $$0));
   }

   private esp a(erb $$0, Function<erb, fct> $$1) {
      BooleanConsumer $$2 = $$2x -> {
         if (!$$2x) {
            a(this.e);
         } else {
            this.b($$0).thenRun(() -> a($$1.apply($$0))).exceptionally($$1xx -> {
               eva.N().ab().a();
               b.error("Failed to download resource pack from {}", $$0, $$1xx);
               a(new esn(vd.c("mco.download.resourcePack.fail"), this.e));
               return null;
            });
         }
      };
      return new esp($$2, esp.a.b, vd.c("mco.configure.world.resourcepack.question.line1"), vd.c("mco.configure.world.resourcepack.question.line2"), true);
   }

   private CompletableFuture<?> b(erb $$0) {
      try {
         return eva.N().ab().a(new URL($$0.b), $$0.c, false);
      } catch (Exception var4) {
         CompletableFuture<Void> $$2 = new CompletableFuture<>();
         $$2.completeExceptionally(var4);
         return $$2;
      }
   }
}
