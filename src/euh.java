import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeoutException;
import java.util.function.Function;
import org.slf4j.Logger;

public class euh extends eui {
   private static final vf b = vf.c("multiplayer.applyingPack");
   private static final Logger c = LogUtils.getLogger();
   private static final vf d = vf.c("mco.connect.connecting");
   private final eri e;
   private final fdb f;

   public euh(fdb $$0, eri $$1) {
      this.f = $$0;
      this.e = $$1;
   }

   @Override
   public void run() {
      erj $$0;
      try {
         $$0 = this.f();
      } catch (CancellationException var4) {
         c.info("User aborted connecting to realms");
         return;
      } catch (ese var5) {
         switch (var5.a.a()) {
            case 6002:
               a(new etm(this.f, this.e));
               return;
            case 6006:
               boolean $$3 = evi.O().b(this.e.g);
               a(
                  (fdb)($$3
                     ? new esp(this.f, this.e.a, this.e.m == eri.d.b)
                     : new esv(vf.c("mco.brokenworld.nonowner.title"), vf.c("mco.brokenworld.nonowner.error"), this.f))
               );
               return;
            default:
               this.a(var5);
               c.error("Couldn't connect to world", var5);
               return;
         }
      } catch (TimeoutException var6) {
         this.a(vf.c("mco.errorMessage.connectionFailure"));
         return;
      } catch (Exception var7) {
         c.error("Couldn't connect to world", var7);
         this.a(var7);
         return;
      }

      boolean $$7 = $$0.b != null && $$0.c != null;
      fdb $$8 = (fdb)($$7 ? this.a($$0, a(this.e), this::a) : this.a($$0));
      a($$8);
   }

   private static UUID a(eri $$0) {
      return $$0.o != null
         ? UUID.nameUUIDFromBytes(("minigame:" + $$0.o).getBytes(StandardCharsets.UTF_8))
         : UUID.nameUUIDFromBytes(("realms:" + $$0.c + ":" + $$0.n).getBytes(StandardCharsets.UTF_8));
   }

   @Override
   public vf a() {
      return d;
   }

   private erj f() throws ese, TimeoutException, CancellationException {
      eqr $$0 = eqr.a();

      for (int $$1 = 0; $$1 < 40; $$1++) {
         if (this.d()) {
            throw new CancellationException();
         }

         try {
            return $$0.c(this.e.a);
         } catch (esf var4) {
            a((long)var4.c);
         }
      }

      throw new TimeoutException();
   }

   public esy a(erj $$0) {
      return new esz(this.f, new eue(this.f, this.e, $$0));
   }

   private esx a(erj $$0, UUID $$1, Function<erj, fdb> $$2) {
      BooleanConsumer $$3 = $$3x -> {
         if (!$$3x) {
            a(this.f);
         } else {
            a(new fch(b));
            this.a($$0, $$1).thenRun(() -> a($$2.apply($$0))).exceptionally($$1xx -> {
               evi.O().ac().i();
               c.error("Failed to download resource pack from {}", $$0, $$1xx);
               a(new esv(vf.c("mco.download.resourcePack.fail"), this.f));
               return null;
            });
         }
      };
      return new esx($$3, esx.a.b, vf.c("mco.configure.world.resourcepack.question.line1"), vf.c("mco.configure.world.resourcepack.question.line2"), true);
   }

   private CompletableFuture<?> a(erj $$0, UUID $$1) {
      try {
         ghc $$2 = evi.O().ac();
         CompletableFuture<Void> $$3 = $$2.b($$1);
         $$2.g();
         $$2.a($$1, new URL($$0.b), $$0.c);
         return $$3;
      } catch (Exception var5) {
         CompletableFuture<Void> $$5 = new CompletableFuture<>();
         $$5.completeExceptionally(var5);
         return $$5;
      }
   }
}
