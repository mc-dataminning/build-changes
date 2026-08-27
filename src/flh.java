import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.Lifecycle;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class flh {
   private static final Logger a = LogUtils.getLogger();
   private static final UUID b = UUID.fromString("640a6a92-b6cb-48a0-b391-831586500359");
   private final eyk c;
   private final ejo d;

   public flh(eyk $$0, ejo $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   public void a(String $$0, cwi $$1, dso $$2, Function<iy, dsl> $$3, fgh $$4) {
      this.c.d(new ffn(vs.c("selectWorld.data_read")));
      ejo.c $$5 = this.a($$0);
      if ($$5 != null) {
         arq $$6 = art.a($$5);
         cwy $$7 = $$1.g();

         try {
            ajx.d $$8 = new ajx.d($$6, $$7, false, false);
            ajy $$9 = this.a($$8, $$3x -> {
               dsl.b $$4x = $$3.apply($$3x.c()).a($$3x.d().d(ki.aO));
               return new ajx.b<>(new ejs($$1, $$2, $$4x.d(), $$4x.a()), $$4x.b());
            }, ajy::new);
            this.c.a($$5, $$6, $$9, true);
         } catch (Exception var11) {
            a.warn("Failed to load datapacks, can't proceed with server load", var11);
            $$5.a();
            this.c.a($$4);
         }
      }
   }

   @Nullable
   private ejo.c a(String $$0) {
      try {
         return this.d.d($$0);
      } catch (IOException var3) {
         a.warn("Failed to read level {} data", $$0, var3);
         fcs.a(this.c, $$0);
         this.c.a(null);
         return null;
      } catch (eok var4) {
         a.warn("{}", var4.getMessage());
         this.c.a(ffw.a(() -> this.c.a(null)));
         return null;
      }
   }

   public void a(ejo.c $$0, ajm $$1, is<ajl> $$2, eju $$3) {
      arq $$4 = art.a($$0);
      arv $$5 = (arv)new ajx.d($$4, $$3.D(), false, false).a().getSecond();
      this.c.a($$0, $$4, new ajy($$5, $$1, $$2, $$3), true);
   }

   public ajy a(Dynamic<?> $$0, boolean $$1, arq $$2) throws Exception {
      ajx.d $$3 = ejo.a($$0, $$2, $$1);
      return this.a($$3, $$1x -> {
         ix<dpr> $$2x = $$1x.d().d(ki.aO);
         ejl $$3x = ejo.a($$0, $$1x.b(), $$2x, $$1x.c());
         return new ajx.b<>($$3x.a(), $$3x.b().b());
      }, ajy::new);
   }

   public Pair<cwi, flf> a(ejo.c $$0) throws Exception {
      arq $$1 = art.a($$0);
      Dynamic<?> $$2 = $$0.f();
      ajx.d $$3 = ejo.a($$2, $$1, false);

      record a(cwi a, dso b, ix<dpr> c) {
      }

      return this.a($$3, $$1x -> {
         ix<dpr> $$2x = new it<>(ki.aO, Lifecycle.stable()).l();
         ejl $$3x = ejo.a($$2, $$1x.b(), $$2x, $$1x.c());
         return new ajx.b<>(new a($$3x.a().J(), $$3x.a().y(), $$3x.b().c()), $$1x.d());
      }, ($$0x, $$1x, $$2x, $$3x) -> {
         $$0x.close();
         return Pair.of($$3x.a, new flf($$3x.b, new dsl($$3x.c), $$2x, $$1x, $$3x.a.g()));
      });
   }

   private <D, R> R a(ajx.d $$0, ajx.f<D> $$1, ajx.e<D, R> $$2) throws Exception {
      ajx.c $$3 = new ajx.c($$0, dv.a.c, 2);
      CompletableFuture<R> $$4 = ajx.a($$3, $$1, $$2, ac.f(), this.c);
      this.c.c($$4::isDone);
      return $$4.get();
   }

   private void a(ejo.c $$0, boolean $$1, Runnable $$2, Runnable $$3) {
      vs $$4;
      vs $$5;
      if ($$1) {
         $$4 = vs.c("selectWorld.backupQuestion.customized");
         $$5 = vs.c("selectWorld.backupWarning.customized");
      } else {
         $$4 = vs.c("selectWorld.backupQuestion.experimental");
         $$5 = vs.c("selectWorld.backupWarning.experimental");
      }

      this.c.a(new fev($$3, ($$2x, $$3x) -> {
         if ($$2x) {
            fkz.a($$0);
         }

         $$2.run();
      }, $$4, $$5, false));
   }

   public static void a(eyk $$0, fkx $$1, Lifecycle $$2, Runnable $$3, boolean $$4) {
      BooleanConsumer $$5 = $$3x -> {
         if ($$3x) {
            $$3.run();
         } else {
            $$0.a($$1);
         }
      };
      if ($$4 || $$2 == Lifecycle.stable()) {
         $$3.run();
      } else if ($$2 == Lifecycle.experimental()) {
         $$0.a(new ffa($$5, vs.c("selectWorld.warning.experimental.title"), vs.c("selectWorld.warning.experimental.question")));
      } else {
         $$0.a(new ffa($$5, vs.c("selectWorld.warning.deprecated.title"), vs.c("selectWorld.warning.deprecated.question")));
      }
   }

   public void a(String $$0, Runnable $$1) {
      this.c.d(new ffn(vs.c("selectWorld.data_read")));
      ejo.c $$2 = this.a($$0);
      if ($$2 != null) {
         this.a($$2, $$1);
      }
   }

   private void a(ejo.c $$0, Runnable $$1) {
      this.c.d(new ffn(vs.c("selectWorld.data_read")));

      Dynamic<?> $$2;
      ejp $$3;
      try {
         $$2 = $$0.f();
         $$3 = $$0.a($$2);
      } catch (tj | tp | IOException var10) {
         this.c.a(new fgg(this.c, $$2x -> {
            if ($$2x) {
               this.a($$0, $$1);
            } else {
               $$0.a();
               $$1.run();
            }
         }, $$0));
         return;
      } catch (OutOfMemoryError var11) {
         awk.b();
         System.gc();
         String $$6 = "Ran out of memory trying to read level data of world folder \"" + $$0.d() + "\"";
         a.error(LogUtils.FATAL_MARKER, $$6);
         OutOfMemoryError $$7 = new OutOfMemoryError("Ran out of memory reading level data");
         $$7.initCause(var11);
         o $$8 = o.a($$7, $$6);
         p $$9 = $$8.a("World details");
         $$9.a("World folder", $$0.d());
         throw new y($$8);
      }

      if (!$$3.r()) {
         $$0.a();
         this.c.a(new feu($$1, vs.c("selectWorld.incompatible.title").b(-65536), vs.a("selectWorld.incompatible.description", $$3.k())));
      } else {
         ejp.a $$12 = $$3.o();
         if ($$12.a()) {
            String $$13 = "selectWorld.backupQuestion." + $$12.c();
            String $$14 = "selectWorld.backupWarning." + $$12.c();
            wg $$15 = vs.c($$13);
            if ($$12.b()) {
               $$15.b(-2142128);
            }

            vs $$16 = vs.a($$14, $$3.k(), aa.b().c());
            this.c.a(new fev(() -> {
               $$0.a();
               $$1.run();
            }, ($$3x, $$4) -> {
               if ($$3x) {
                  fkz.a($$0);
               }

               this.a($$0, $$2, false, true, $$1);
            }, $$15, $$16, false));
         } else {
            this.a($$0, $$2, false, true, $$1);
         }
      }
   }

   public CompletableFuture<Void> a(gko $$0, ejo.c $$1) {
      Path $$2 = $$1.a(ejm.k);
      if (Files.exists($$2) && !Files.isDirectory($$2)) {
         $$0.f();
         CompletableFuture<Void> $$3 = $$0.b(b);
         $$0.a(b, $$2);
         return $$3;
      } else {
         return CompletableFuture.completedFuture(null);
      }
   }

   private void a(ejo.c $$0, Dynamic<?> $$1, boolean $$2, boolean $$3, Runnable $$4) {
      this.c.d(new ffn(vs.c("selectWorld.resource_load")));
      arq $$5 = art.a($$0);

      ajy $$6;
      try {
         $$6 = this.a($$1, $$2, $$5);
      } catch (Exception var12) {
         a.warn("Failed to load level data or datapacks, can't proceed with server load", var12);
         if (!$$2) {
            this.c.a(new fff(() -> {
               $$0.a();
               $$4.run();
            }, () -> this.a($$0, $$1, true, $$3, $$4)));
         } else {
            $$0.a();
            this.c.a(new feu($$4, vs.c("datapackFailure.safeMode.failed.title"), vs.c("datapackFailure.safeMode.failed.description"), vr.k, true));
         }

         return;
      }

      eju $$9 = $$6.d();
      boolean $$10 = $$9.y().e();
      boolean $$11 = $$9.B() != Lifecycle.stable();
      if (!$$3 || !$$10 && !$$11) {
         gko $$12 = this.c.ad();
         this.a($$12, $$0).thenApply($$0x -> true).exceptionallyComposeAsync($$0x -> {
            a.warn("Failed to load pack: ", $$0x);
            return this.a();
         }, this.c).thenAcceptAsync($$5x -> {
            if ($$5x) {
               this.c.a($$0, $$5, $$6, false);
            } else {
               $$6.close();
               $$0.a();
               $$12.e();
               $$4.run();
            }
         }, this.c).exceptionally($$0x -> {
            this.c.a(o.a($$0x, "Load world"));
            return null;
         });
      } else {
         this.a($$0, $$10, () -> this.a($$0, $$1, $$2, false, $$4), () -> {
            $$0.a();
            $$4.run();
         });
         $$6.close();
      }
   }

   private CompletableFuture<Boolean> a() {
      CompletableFuture<Boolean> $$0 = new CompletableFuture<>();
      this.c.a(new ffa($$0::complete, vs.c("multiplayer.texturePrompt.failure.line1"), vs.c("multiplayer.texturePrompt.failure.line2"), vr.i, vr.e));
      return $$0;
   }
}
