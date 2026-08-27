import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.net.URL;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeoutException;
import java.util.function.Function;
import org.slf4j.Logger;

public class eqn extends eqo {
   private static final Logger b = LogUtils.getLogger();
   private static final ui c = ui.c("mco.connect.connecting");
   private final eno d;
   private final ezd e;

   public eqn(ezd $$0, eno $$1) {
      this.e = $$0;
      this.d = $$1;
   }

   @Override
   public void run() {
      enp $$0;
      try {
         $$0 = this.f();
      } catch (CancellationException var4) {
         b.info("User aborted connecting to realms");
         return;
      } catch (eok var5) {
         switch (var5.a.a()) {
            case 6002:
               a(new eps(this.e, this.d));
               return;
            case 6006:
               boolean $$3 = ero.O().b(this.d.g);
               a(
                  (ezd)($$3
                     ? new eov(this.e, this.d.a, this.d.m == eno.d.b)
                     : new epb(ui.c("mco.brokenworld.nonowner.title"), ui.c("mco.brokenworld.nonowner.error"), this.e))
               );
               return;
            default:
               this.a(var5);
               b.error("Couldn't connect to world", var5);
               return;
         }
      } catch (TimeoutException var6) {
         this.a(ui.c("mco.errorMessage.connectionFailure"));
         return;
      } catch (Exception var7) {
         b.error("Couldn't connect to world", var7);
         this.a(var7);
         return;
      }

      boolean $$7 = $$0.b != null && $$0.c != null;
      ezd $$8 = (ezd)($$7 ? this.a($$0, this::a) : this.a($$0));
      a($$8);
   }

   @Override
   public ui a() {
      return c;
   }

   private enp f() throws eok, TimeoutException, CancellationException {
      emx $$0 = emx.a();

      for (int $$1 = 0; $$1 < 40; $$1++) {
         if (this.d()) {
            throw new CancellationException();
         }

         try {
            return $$0.c(this.d.a);
         } catch (eol var4) {
            a((long)var4.c);
         }
      }

      throw new TimeoutException();
   }

   public epe a(enp $$0) {
      return new epf(this.e, new eqk(this.e, this.d, $$0));
   }

   private epd a(enp $$0, Function<enp, ezd> $$1) {
      BooleanConsumer $$2 = $$2x -> {
         if (!$$2x) {
            a(this.e);
         } else {
            this.b($$0).thenRun(() -> a($$1.apply($$0))).exceptionally($$1xx -> {
               ero.O().ac().a();
               b.error("Failed to download resource pack from {}", $$0, $$1xx);
               a(new epb(ui.c("mco.download.resourcePack.fail"), this.e));
               return null;
            });
         }
      };
      return new epd($$2, epd.a.b, ui.c("mco.configure.world.resourcepack.question.line1"), ui.c("mco.configure.world.resourcepack.question.line2"), true);
   }

   private CompletableFuture<?> b(enp $$0) {
      try {
         return ero.O().ac().a(new URL($$0.b), $$0.c, false);
      } catch (Exception var4) {
         CompletableFuture<Void> $$2 = new CompletableFuture<>();
         $$2.completeExceptionally(var4);
         return $$2;
      }
   }
}
