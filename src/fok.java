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

public class fok extends fol {
   private static final wy b = wy.c("multiplayer.applyingPack");
   private static final Logger c = LogUtils.getLogger();
   private static final wy d = wy.c("mco.connect.connecting");
   private final flp e;
   private final fyn f;

   public fok(fyn $$0, flp $$1) {
      this.f = $$0;
      this.e = $$1;
   }

   @Override
   public void run() {
      flq $$0;
      try {
         $$0 = this.f();
      } catch (CancellationException var4) {
         c.info("User aborted connecting to realms");
         return;
      } catch (fmk var5) {
         switch (var5.a.a()) {
            case 6002:
               a(new fnr(this.f, this.e));
               return;
            case 6006:
               boolean $$3 = fpo.Q().b(this.e.g);
               a(
                  (fyn)($$3
                     ? new fmw(this.f, this.e.a, this.e.i())
                     : new fnc(wy.c("mco.brokenworld.nonowner.title"), wy.c("mco.brokenworld.nonowner.error"), this.f))
               );
               return;
            default:
               this.a(var5);
               c.error("Couldn't connect to world", var5);
               return;
         }
      } catch (TimeoutException var6) {
         this.a(wy.c("mco.errorMessage.connectionFailure"));
         return;
      } catch (Exception var7) {
         c.error("Couldn't connect to world", var7);
         this.a(var7);
         return;
      }

      if ($$0.a == null) {
         this.a(wy.c("mco.errorMessage.connectionFailure"));
      } else {
         boolean $$7 = $$0.b != null && $$0.c != null;
         fyn $$8 = (fyn)($$7 ? this.a($$0, a(this.e), this::a) : this.a($$0));
         a($$8);
      }
   }

   private static UUID a(flp $$0) {
      return $$0.q != null
         ? UUID.nameUUIDFromBytes(("minigame:" + $$0.q).getBytes(StandardCharsets.UTF_8))
         : UUID.nameUUIDFromBytes(("realms:" + Objects.requireNonNullElse($$0.c, "") + ":" + $$0.p).getBytes(StandardCharsets.UTF_8));
   }

   @Override
   public wy a() {
      return d;
   }

   private flq f() throws fmk, TimeoutException, CancellationException {
      fko $$0 = fko.a();

      for (int $$1 = 0; $$1 < 40; $$1++) {
         if (this.d()) {
            throw new CancellationException();
         }

         try {
            return $$0.c(this.e.a);
         } catch (fml var4) {
            a((long)var4.c);
         }
      }

      throw new TimeoutException();
   }

   public fne a(flq $$0) {
      return new fnf(this.f, new foi(this.f, this.e, $$0));
   }

   private ftx a(flq $$0, UUID $$1, Function<flq, fyn> $$2) {
      wy $$3 = wy.c("mco.configure.world.resourcepack.question");
      return fnk.a(this.f, $$3, $$3x -> {
         a(new fxy(b));
         this.a($$0, $$1).thenRun(() -> a($$2.apply($$0))).exceptionally($$1xx -> {
            fpo.Q().af().i();
            c.error("Failed to download resource pack from {}", $$0, $$1xx);
            a(new fnc(wy.c("mco.download.resourcePack.fail"), this.f));
            return null;
         });
      });
   }

   private CompletableFuture<?> a(flq $$0, UUID $$1) {
      try {
         if ($$0.b == null) {
            return CompletableFuture.failedFuture(new IllegalStateException("resourcePackUrl was null"));
         } else if ($$0.c == null) {
            return CompletableFuture.failedFuture(new IllegalStateException("resourcePackHash was null"));
         } else {
            hmj $$2 = fpo.Q().af();
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
