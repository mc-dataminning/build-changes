import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.net.URL;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeoutException;
import java.util.function.Function;
import org.slf4j.Logger;

public class esc extends esd {
   private static final Logger b = LogUtils.getLogger();
   private static final ur c = ur.c("mco.connect.connecting");
   private final epd d;
   private final fau e;

   public esc(fau $$0, epd $$1) {
      this.e = $$0;
      this.d = $$1;
   }

   @Override
   public void run() {
      epe $$0;
      try {
         $$0 = this.f();
      } catch (CancellationException var4) {
         b.info("User aborted connecting to realms");
         return;
      } catch (epz var5) {
         switch (var5.a.a()) {
            case 6002:
               a(new erh(this.e, this.d));
               return;
            case 6006:
               boolean $$3 = etd.N().b(this.d.g);
               a(
                  (fau)($$3
                     ? new eqk(this.e, this.d.a, this.d.m == epd.d.b)
                     : new eqq(ur.c("mco.brokenworld.nonowner.title"), ur.c("mco.brokenworld.nonowner.error"), this.e))
               );
               return;
            default:
               this.a(var5);
               b.error("Couldn't connect to world", var5);
               return;
         }
      } catch (TimeoutException var6) {
         this.a(ur.c("mco.errorMessage.connectionFailure"));
         return;
      } catch (Exception var7) {
         b.error("Couldn't connect to world", var7);
         this.a(var7);
         return;
      }

      boolean $$7 = $$0.b != null && $$0.c != null;
      fau $$8 = (fau)($$7 ? this.a($$0, this::a) : this.a($$0));
      a($$8);
   }

   @Override
   public ur a() {
      return c;
   }

   private epe f() throws epz, TimeoutException, CancellationException {
      eom $$0 = eom.a();

      for (int $$1 = 0; $$1 < 40; $$1++) {
         if (this.d()) {
            throw new CancellationException();
         }

         try {
            return $$0.c(this.d.a);
         } catch (eqa var4) {
            a((long)var4.c);
         }
      }

      throw new TimeoutException();
   }

   public eqt a(epe $$0) {
      return new equ(this.e, new erz(this.e, this.d, $$0));
   }

   private eqs a(epe $$0, Function<epe, fau> $$1) {
      BooleanConsumer $$2 = $$2x -> {
         if (!$$2x) {
            a(this.e);
         } else {
            this.b($$0).thenRun(() -> a($$1.apply($$0))).exceptionally($$1xx -> {
               etd.N().ab().a();
               b.error("Failed to download resource pack from {}", $$0, $$1xx);
               a(new eqq(ur.c("mco.download.resourcePack.fail"), this.e));
               return null;
            });
         }
      };
      return new eqs($$2, eqs.a.b, ur.c("mco.configure.world.resourcepack.question.line1"), ur.c("mco.configure.world.resourcepack.question.line2"), true);
   }

   private CompletableFuture<?> b(epe $$0) {
      try {
         return etd.N().ab().a(new URL($$0.b), $$0.c, false);
      } catch (Exception var4) {
         CompletableFuture<Void> $$2 = new CompletableFuture<>();
         $$2.completeExceptionally(var4);
         return $$2;
      }
   }
}
