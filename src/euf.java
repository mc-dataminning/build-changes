import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.net.URL;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeoutException;
import java.util.function.Function;
import org.slf4j.Logger;

public class euf extends eug {
   private static final vf b = vf.c("multiplayer.applyingPack");
   private static final UUID c = UUID.fromString("08c3b151-90fb-4c09-b6cf-0548364671bb");
   private static final Logger d = LogUtils.getLogger();
   private static final vf e = vf.c("mco.connect.connecting");
   private final erg f;
   private final fcz g;

   public euf(fcz $$0, erg $$1) {
      this.g = $$0;
      this.f = $$1;
   }

   @Override
   public void run() {
      erh $$0;
      try {
         $$0 = this.f();
      } catch (CancellationException var4) {
         d.info("User aborted connecting to realms");
         return;
      } catch (esc var5) {
         switch (var5.a.a()) {
            case 6002:
               a(new etk(this.g, this.f));
               return;
            case 6006:
               boolean $$3 = evg.O().b(this.f.g);
               a(
                  (fcz)($$3
                     ? new esn(this.g, this.f.a, this.f.m == erg.d.b)
                     : new est(vf.c("mco.brokenworld.nonowner.title"), vf.c("mco.brokenworld.nonowner.error"), this.g))
               );
               return;
            default:
               this.a(var5);
               d.error("Couldn't connect to world", var5);
               return;
         }
      } catch (TimeoutException var6) {
         this.a(vf.c("mco.errorMessage.connectionFailure"));
         return;
      } catch (Exception var7) {
         d.error("Couldn't connect to world", var7);
         this.a(var7);
         return;
      }

      boolean $$7 = $$0.b != null && $$0.c != null;
      fcz $$8 = (fcz)($$7 ? this.a($$0, this::a) : this.a($$0));
      a($$8);
   }

   @Override
   public vf a() {
      return e;
   }

   private erh f() throws esc, TimeoutException, CancellationException {
      eqp $$0 = eqp.a();

      for (int $$1 = 0; $$1 < 40; $$1++) {
         if (this.d()) {
            throw new CancellationException();
         }

         try {
            return $$0.c(this.f.a);
         } catch (esd var4) {
            a((long)var4.c);
         }
      }

      throw new TimeoutException();
   }

   public esw a(erh $$0) {
      return new esx(this.g, new euc(this.g, this.f, $$0));
   }

   private esv a(erh $$0, Function<erh, fcz> $$1) {
      BooleanConsumer $$2 = $$2x -> {
         if (!$$2x) {
            a(this.g);
         } else {
            a(new fcf(b));
            this.b($$0).thenRun(() -> a($$1.apply($$0))).exceptionally($$1xx -> {
               evg.O().ac().i();
               d.error("Failed to download resource pack from {}", $$0, $$1xx);
               a(new est(vf.c("mco.download.resourcePack.fail"), this.g));
               return null;
            });
         }
      };
      return new esv($$2, esv.a.b, vf.c("mco.configure.world.resourcepack.question.line1"), vf.c("mco.configure.world.resourcepack.question.line2"), true);
   }

   private CompletableFuture<?> b(erh $$0) {
      try {
         gha $$1 = evg.O().ac();
         CompletableFuture<Void> $$2 = $$1.b(c);
         $$1.g();
         $$1.a(c, new URL($$0.b), $$0.c);
         return $$2;
      } catch (Exception var4) {
         CompletableFuture<Void> $$4 = new CompletableFuture<>();
         $$4.completeExceptionally(var4);
         return $$4;
      }
   }
}
