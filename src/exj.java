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

public class exj extends exk {
   private static final vs b = vs.c("multiplayer.applyingPack");
   private static final Logger c = LogUtils.getLogger();
   private static final vs d = vs.c("mco.connect.connecting");
   private final euk e;
   private final fgh f;

   public exj(fgh $$0, euk $$1) {
      this.f = $$0;
      this.e = $$1;
   }

   @Override
   public void run() {
      eul $$0;
      try {
         $$0 = this.f();
      } catch (CancellationException var4) {
         c.info("User aborted connecting to realms");
         return;
      } catch (evg var5) {
         switch (var5.a.a()) {
            case 6002:
               a(new ewo(this.f, this.e));
               return;
            case 6006:
               boolean $$3 = eyk.P().b(this.e.g);
               a(
                  (fgh)($$3
                     ? new evr(this.f, this.e.a, this.e.m == euk.d.b)
                     : new evx(vs.c("mco.brokenworld.nonowner.title"), vs.c("mco.brokenworld.nonowner.error"), this.f))
               );
               return;
            default:
               this.a(var5);
               c.error("Couldn't connect to world", var5);
               return;
         }
      } catch (TimeoutException var6) {
         this.a(vs.c("mco.errorMessage.connectionFailure"));
         return;
      } catch (Exception var7) {
         c.error("Couldn't connect to world", var7);
         this.a(var7);
         return;
      }

      boolean $$7 = $$0.b != null && $$0.c != null;
      fgh $$8 = (fgh)($$7 ? this.a($$0, a(this.e), this::a) : this.a($$0));
      a($$8);
   }

   private static UUID a(euk $$0) {
      return $$0.o != null
         ? UUID.nameUUIDFromBytes(("minigame:" + $$0.o).getBytes(StandardCharsets.UTF_8))
         : UUID.nameUUIDFromBytes(("realms:" + $$0.c + ":" + $$0.n).getBytes(StandardCharsets.UTF_8));
   }

   @Override
   public vs a() {
      return d;
   }

   private eul f() throws evg, TimeoutException, CancellationException {
      ett $$0 = ett.a();

      for (int $$1 = 0; $$1 < 40; $$1++) {
         if (this.d()) {
            throw new CancellationException();
         }

         try {
            return $$0.c(this.e.a);
         } catch (evh var4) {
            a((long)var4.c);
         }
      }

      throw new TimeoutException();
   }

   public ewa a(eul $$0) {
      return new ewb(this.f, new exg(this.f, this.e, $$0));
   }

   private evz a(eul $$0, UUID $$1, Function<eul, fgh> $$2) {
      BooleanConsumer $$3 = $$3x -> {
         if (!$$3x) {
            a(this.f);
         } else {
            a(new ffn(b));
            this.a($$0, $$1).thenRun(() -> a($$2.apply($$0))).exceptionally($$1xx -> {
               eyk.P().ad().i();
               c.error("Failed to download resource pack from {}", $$0, $$1xx);
               a(new evx(vs.c("mco.download.resourcePack.fail"), this.f));
               return null;
            });
         }
      };
      return new evz($$3, evz.a.b, vs.c("mco.configure.world.resourcepack.question.line1"), vs.c("mco.configure.world.resourcepack.question.line2"), true);
   }

   private CompletableFuture<?> a(eul $$0, UUID $$1) {
      try {
         gko $$2 = eyk.P().ad();
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
