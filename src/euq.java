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

public class euq extends eur {
   private static final vg b = vg.c("multiplayer.applyingPack");
   private static final Logger c = LogUtils.getLogger();
   private static final vg d = vg.c("mco.connect.connecting");
   private final err e;
   private final fdm f;

   public euq(fdm $$0, err $$1) {
      this.f = $$0;
      this.e = $$1;
   }

   @Override
   public void run() {
      ers $$0;
      try {
         $$0 = this.f();
      } catch (CancellationException var4) {
         c.info("User aborted connecting to realms");
         return;
      } catch (esn var5) {
         switch (var5.a.a()) {
            case 6002:
               a(new etv(this.f, this.e));
               return;
            case 6006:
               boolean $$3 = evr.O().b(this.e.g);
               a(
                  (fdm)($$3
                     ? new esy(this.f, this.e.a, this.e.m == err.d.b)
                     : new ete(vg.c("mco.brokenworld.nonowner.title"), vg.c("mco.brokenworld.nonowner.error"), this.f))
               );
               return;
            default:
               this.a(var5);
               c.error("Couldn't connect to world", var5);
               return;
         }
      } catch (TimeoutException var6) {
         this.a(vg.c("mco.errorMessage.connectionFailure"));
         return;
      } catch (Exception var7) {
         c.error("Couldn't connect to world", var7);
         this.a(var7);
         return;
      }

      boolean $$7 = $$0.b != null && $$0.c != null;
      fdm $$8 = (fdm)($$7 ? this.a($$0, a(this.e), this::a) : this.a($$0));
      a($$8);
   }

   private static UUID a(err $$0) {
      return $$0.o != null
         ? UUID.nameUUIDFromBytes(("minigame:" + $$0.o).getBytes(StandardCharsets.UTF_8))
         : UUID.nameUUIDFromBytes(("realms:" + $$0.c + ":" + $$0.n).getBytes(StandardCharsets.UTF_8));
   }

   @Override
   public vg a() {
      return d;
   }

   private ers f() throws esn, TimeoutException, CancellationException {
      era $$0 = era.a();

      for (int $$1 = 0; $$1 < 40; $$1++) {
         if (this.d()) {
            throw new CancellationException();
         }

         try {
            return $$0.c(this.e.a);
         } catch (eso var4) {
            a((long)var4.c);
         }
      }

      throw new TimeoutException();
   }

   public eth a(ers $$0) {
      return new eti(this.f, new eun(this.f, this.e, $$0));
   }

   private etg a(ers $$0, UUID $$1, Function<ers, fdm> $$2) {
      BooleanConsumer $$3 = $$3x -> {
         if (!$$3x) {
            a(this.f);
         } else {
            a(new fcs(b));
            this.a($$0, $$1).thenRun(() -> a($$2.apply($$0))).exceptionally($$1xx -> {
               evr.O().ac().i();
               c.error("Failed to download resource pack from {}", $$0, $$1xx);
               a(new ete(vg.c("mco.download.resourcePack.fail"), this.f));
               return null;
            });
         }
      };
      return new etg($$3, etg.a.b, vg.c("mco.configure.world.resourcepack.question.line1"), vg.c("mco.configure.world.resourcepack.question.line2"), true);
   }

   private CompletableFuture<?> a(ers $$0, UUID $$1) {
      try {
         ghq $$2 = evr.O().ac();
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
