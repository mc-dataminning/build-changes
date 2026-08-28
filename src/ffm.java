import com.mojang.logging.LogUtils;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeoutException;
import java.util.function.Function;
import org.slf4j.Logger;

public class ffm extends ffn {
   private static final wz b = wz.c("multiplayer.applyingPack");
   private static final Logger c = LogUtils.getLogger();
   private static final wz d = wz.c("mco.connect.connecting");
   private final fcp e;
   private final fod f;

   public ffm(fod $$0, fcp $$1) {
      this.f = $$0;
      this.e = $$1;
   }

   @Override
   public void run() {
      fcq $$0;
      try {
         $$0 = this.f();
      } catch (CancellationException var4) {
         c.info("User aborted connecting to realms");
         return;
      } catch (fdj var5) {
         switch (var5.a.a()) {
            case 6002:
               a(new fer(this.f, this.e));
               return;
            case 6006:
               boolean $$3 = fgo.Q().b(this.e.g);
               a(
                  (fod)($$3
                     ? new fdv(this.f, this.e.a, this.e.i())
                     : new feb(wz.c("mco.brokenworld.nonowner.title"), wz.c("mco.brokenworld.nonowner.error"), this.f))
               );
               return;
            default:
               this.a(var5);
               c.error("Couldn't connect to world", var5);
               return;
         }
      } catch (TimeoutException var6) {
         this.a(wz.c("mco.errorMessage.connectionFailure"));
         return;
      } catch (Exception var7) {
         c.error("Couldn't connect to world", var7);
         this.a(var7);
         return;
      }

      boolean $$7 = $$0.b != null && $$0.c != null;
      fod $$8 = (fod)($$7 ? this.a($$0, a(this.e), this::a) : this.a($$0));
      a($$8);
   }

   private static UUID a(fcp $$0) {
      return $$0.o != null
         ? UUID.nameUUIDFromBytes(("minigame:" + $$0.o).getBytes(StandardCharsets.UTF_8))
         : UUID.nameUUIDFromBytes(("realms:" + $$0.c + ":" + $$0.n).getBytes(StandardCharsets.UTF_8));
   }

   @Override
   public wz a() {
      return d;
   }

   private fcq f() throws fdj, TimeoutException, CancellationException {
      fby $$0 = fby.a();

      for (int $$1 = 0; $$1 < 40; $$1++) {
         if (this.d()) {
            throw new CancellationException();
         }

         try {
            return $$0.c(this.e.a);
         } catch (fdk var4) {
            a((long)var4.c);
         }
      }

      throw new TimeoutException();
   }

   public fed a(fcq $$0) {
      return new fee(this.f, new ffj(this.f, this.e, $$0));
   }

   private fjo a(fcq $$0, UUID $$1, Function<fcq, fod> $$2) {
      wz $$3 = wz.c("mco.configure.world.resourcepack.question");
      return fej.a(this.f, $$3, $$3x -> {
         a(new fno(b));
         this.a($$0, $$1).thenRun(() -> a($$2.apply($$0))).exceptionally($$1xx -> {
            fgo.Q().ae().i();
            c.error("Failed to download resource pack from {}", $$0, $$1xx);
            a(new feb(wz.c("mco.download.resourcePack.fail"), this.f));
            return null;
         });
      });
   }

   private CompletableFuture<?> a(fcq $$0, UUID $$1) {
      try {
         gtc $$2 = fgo.Q().ae();
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
