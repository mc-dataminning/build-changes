import com.mojang.logging.LogUtils;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeoutException;
import java.util.function.Function;
import org.slf4j.Logger;

public class fkh extends fki {
   private static final wp b = wp.c("multiplayer.applyingPack");
   private static final Logger c = LogUtils.getLogger();
   private static final wp d = wp.c("mco.connect.connecting");
   private final fhm e;
   private final fum f;

   public fkh(fum $$0, fhm $$1) {
      this.f = $$0;
      this.e = $$1;
   }

   @Override
   public void run() {
      fhn $$0;
      try {
         $$0 = this.f();
      } catch (CancellationException var4) {
         c.info("User aborted connecting to realms");
         return;
      } catch (fih var5) {
         switch (var5.a.a()) {
            case 6002:
               a(new fjo(this.f, this.e));
               return;
            case 6006:
               boolean $$3 = flk.Q().b(this.e.g);
               a(
                  (fum)($$3
                     ? new fit(this.f, this.e.a, this.e.i())
                     : new fiz(wp.c("mco.brokenworld.nonowner.title"), wp.c("mco.brokenworld.nonowner.error"), this.f))
               );
               return;
            default:
               this.a(var5);
               c.error("Couldn't connect to world", var5);
               return;
         }
      } catch (TimeoutException var6) {
         this.a(wp.c("mco.errorMessage.connectionFailure"));
         return;
      } catch (Exception var7) {
         c.error("Couldn't connect to world", var7);
         this.a(var7);
         return;
      }

      if ($$0.a == null) {
         this.a(wp.c("mco.errorMessage.connectionFailure"));
      } else {
         boolean $$7 = $$0.b != null && $$0.c != null;
         fum $$8 = (fum)($$7 ? this.a($$0, a(this.e), this::a) : this.a($$0));
         a($$8);
      }
   }

   private static UUID a(fhm $$0) {
      return $$0.q != null
         ? UUID.nameUUIDFromBytes(("minigame:" + $$0.q).getBytes(StandardCharsets.UTF_8))
         : UUID.nameUUIDFromBytes(("realms:" + Objects.requireNonNullElse($$0.c, "") + ":" + $$0.p).getBytes(StandardCharsets.UTF_8));
   }

   @Override
   public wp a() {
      return d;
   }

   private fhn f() throws fih, TimeoutException, CancellationException {
      fgl $$0 = fgl.a();

      for (int $$1 = 0; $$1 < 40; $$1++) {
         if (this.d()) {
            throw new CancellationException();
         }

         try {
            return $$0.c(this.e.a);
         } catch (fii var4) {
            a((long)var4.c);
         }
      }

      throw new TimeoutException();
   }

   public fjb a(fhn $$0) {
      return new fjc(this.f, new fkf(this.f, this.e, $$0));
   }

   private fpw a(fhn $$0, UUID $$1, Function<fhn, fum> $$2) {
      wp $$3 = wp.c("mco.configure.world.resourcepack.question");
      return fjh.a(this.f, $$3, $$3x -> {
         a(new ftx(b));
         this.a($$0, $$1).thenRun(() -> a($$2.apply($$0))).exceptionally($$1xx -> {
            flk.Q().af().i();
            c.error("Failed to download resource pack from {}", $$0, $$1xx);
            a(new fiz(wp.c("mco.download.resourcePack.fail"), this.f));
            return null;
         });
      });
   }

   private CompletableFuture<?> a(fhn $$0, UUID $$1) {
      try {
         if ($$0.b == null) {
            return CompletableFuture.failedFuture(new IllegalStateException("resourcePackUrl was null"));
         } else if ($$0.c == null) {
            return CompletableFuture.failedFuture(new IllegalStateException("resourcePackHash was null"));
         } else {
            hhs $$2 = flk.Q().af();
            CompletableFuture<Void> $$3 = $$2.b($$1);
            $$2.g();
            $$2.a($$1, new URL($$0.b), $$0.c);
            return $$3;
         }
      } catch (Exception var5) {
         return CompletableFuture.failedFuture(var5);
      }
   }
}
