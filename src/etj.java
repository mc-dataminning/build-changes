import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.net.URL;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeoutException;
import java.util.function.Function;
import org.slf4j.Logger;

public class etj extends etk {
   private static final Logger b = LogUtils.getLogger();
   private static final vb c = vb.c("mco.connect.connecting");
   private final eqk d;
   private final fcc e;

   public etj(fcc $$0, eqk $$1) {
      this.e = $$0;
      this.d = $$1;
   }

   @Override
   public void run() {
      eql $$0;
      try {
         $$0 = this.f();
      } catch (CancellationException var4) {
         b.info("User aborted connecting to realms");
         return;
      } catch (erg var5) {
         switch (var5.a.a()) {
            case 6002:
               a(new eso(this.e, this.d));
               return;
            case 6006:
               boolean $$3 = euk.N().b(this.d.g);
               a(
                  (fcc)($$3
                     ? new err(this.e, this.d.a, this.d.m == eqk.d.b)
                     : new erx(vb.c("mco.brokenworld.nonowner.title"), vb.c("mco.brokenworld.nonowner.error"), this.e))
               );
               return;
            default:
               this.a(var5);
               b.error("Couldn't connect to world", var5);
               return;
         }
      } catch (TimeoutException var6) {
         this.a(vb.c("mco.errorMessage.connectionFailure"));
         return;
      } catch (Exception var7) {
         b.error("Couldn't connect to world", var7);
         this.a(var7);
         return;
      }

      boolean $$7 = $$0.b != null && $$0.c != null;
      fcc $$8 = (fcc)($$7 ? this.a($$0, this::a) : this.a($$0));
      a($$8);
   }

   @Override
   public vb a() {
      return c;
   }

   private eql f() throws erg, TimeoutException, CancellationException {
      ept $$0 = ept.a();

      for (int $$1 = 0; $$1 < 40; $$1++) {
         if (this.d()) {
            throw new CancellationException();
         }

         try {
            return $$0.c(this.d.a);
         } catch (erh var4) {
            a((long)var4.c);
         }
      }

      throw new TimeoutException();
   }

   public esa a(eql $$0) {
      return new esb(this.e, new etg(this.e, this.d, $$0));
   }

   private erz a(eql $$0, Function<eql, fcc> $$1) {
      BooleanConsumer $$2 = $$2x -> {
         if (!$$2x) {
            a(this.e);
         } else {
            this.b($$0).thenRun(() -> a($$1.apply($$0))).exceptionally($$1xx -> {
               euk.N().ab().a();
               b.error("Failed to download resource pack from {}", $$0, $$1xx);
               a(new erx(vb.c("mco.download.resourcePack.fail"), this.e));
               return null;
            });
         }
      };
      return new erz($$2, erz.a.b, vb.c("mco.configure.world.resourcepack.question.line1"), vb.c("mco.configure.world.resourcepack.question.line2"), true);
   }

   private CompletableFuture<?> b(eql $$0) {
      try {
         return euk.N().ab().a(new URL($$0.b), $$0.c, false);
      } catch (Exception var4) {
         CompletableFuture<Void> $$2 = new CompletableFuture<>();
         $$2.completeExceptionally(var4);
         return $$2;
      }
   }
}
