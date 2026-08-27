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

public class fhz {
   private static final Logger a = LogUtils.getLogger();
   private static final UUID b = UUID.fromString("640a6a92-b6cb-48a0-b391-831586500359");
   private final evg c;
   private final egl d;

   public fhz(evg $$0, egl $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   public void a(String $$0, cts $$1, dpn $$2, Function<iu, dpk> $$3, fcz $$4) {
      this.c.d(new fcf(vf.c("selectWorld.data_read")));
      egl.c $$5 = this.a($$0);
      if ($$5 != null) {
         aps $$6 = apv.a($$5);
         cui $$7 = $$1.g();

         try {
            aib.d $$8 = new aib.d($$6, $$7, false, false);
            aic $$9 = this.a($$8, $$3x -> {
               dpk.b $$4x = $$3.apply($$3x.c()).a($$3x.d().d(ke.aN));
               return new aib.b<>(new egp($$1, $$2, $$4x.d(), $$4x.a()), $$4x.b());
            }, aic::new);
            this.c.a($$5, $$6, $$9, true);
         } catch (Exception var11) {
            a.warn("Failed to load datapacks, can't proceed with server load", var11);
            $$5.a();
            this.c.a($$4);
         }
      }
   }

   @Nullable
   private egl.c a(String $$0) {
      try {
         return this.d.d($$0);
      } catch (IOException var3) {
         a.warn("Failed to read level {} data", $$0, var3);
         ezl.a(this.c, $$0);
         this.c.a(null);
         return null;
      } catch (elh var4) {
         a.warn("{}", var4.getMessage());
         this.c.a(fco.a(() -> this.c.a(null)));
         return null;
      }
   }

   public void a(egl.c $$0, ahq $$1, io<ahp> $$2, egr $$3) {
      aps $$4 = apv.a($$0);
      apx $$5 = (apx)new aib.d($$4, $$3.F(), false, false).a().getSecond();
      this.c.a($$0, $$4, new aic($$5, $$1, $$2, $$3), true);
   }

   public aic a(Dynamic<?> $$0, boolean $$1, aps $$2) throws Exception {
      aib.d $$3 = egl.a($$0, $$2, $$1);
      return this.a($$3, $$1x -> {
         it<dmq> $$2x = $$1x.d().d(ke.aN);
         egi $$3x = egl.a($$0, $$1x.b(), $$2x, $$1x.c());
         return new aib.b<>($$3x.a(), $$3x.b().b());
      }, aic::new);
   }

   public Pair<cts, fhx> a(egl.c $$0) throws Exception {
      aps $$1 = apv.a($$0);
      Dynamic<?> $$2 = $$0.f();
      aib.d $$3 = egl.a($$2, $$1, false);

      record a(cts a, dpn b, it<dmq> c) {
      }

      return this.a($$3, $$1x -> {
         it<dmq> $$2x = new ip<>(ke.aN, Lifecycle.stable()).l();
         egi $$3x = egl.a($$2, $$1x.b(), $$2x, $$1x.c());
         return new aib.b<>(new a($$3x.a().L(), $$3x.a().A(), $$3x.b().c()), $$1x.d());
      }, ($$0x, $$1x, $$2x, $$3x) -> {
         $$0x.close();
         return Pair.of($$3x.a, new fhx($$3x.b, new dpk($$3x.c), $$2x, $$1x, $$3x.a.g()));
      });
   }

   private <D, R> R a(aib.d $$0, aib.f<D> $$1, aib.e<D, R> $$2) throws Exception {
      aib.c $$3 = new aib.c($$0, dt.a.c, 2);
      CompletableFuture<R> $$4 = aib.a($$3, $$1, $$2, ac.f(), this.c);
      this.c.c($$4::isDone);
      return $$4.get();
   }

   private void a(egl.c $$0, boolean $$1, Runnable $$2, Runnable $$3) {
      vf $$4;
      vf $$5;
      if ($$1) {
         $$4 = vf.c("selectWorld.backupQuestion.customized");
         $$5 = vf.c("selectWorld.backupWarning.customized");
      } else {
         $$4 = vf.c("selectWorld.backupQuestion.experimental");
         $$5 = vf.c("selectWorld.backupWarning.experimental");
      }

      this.c.a(new fbn($$3, ($$2x, $$3x) -> {
         if ($$2x) {
            fhr.a($$0);
         }

         $$2.run();
      }, $$4, $$5, false));
   }

   public static void a(evg $$0, fhp $$1, Lifecycle $$2, Runnable $$3, boolean $$4) {
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
         $$0.a(new fbs($$5, vf.c("selectWorld.warning.experimental.title"), vf.c("selectWorld.warning.experimental.question")));
      } else {
         $$0.a(new fbs($$5, vf.c("selectWorld.warning.deprecated.title"), vf.c("selectWorld.warning.deprecated.question")));
      }
   }

   public void a(String $$0, Runnable $$1) {
      this.c.d(new fcf(vf.c("selectWorld.data_read")));
      egl.c $$2 = this.a($$0);
      if ($$2 != null) {
         this.a($$2, $$1);
      }
   }

   private void a(egl.c $$0, Runnable $$1) {
      this.c.d(new fcf(vf.c("selectWorld.data_read")));

      Dynamic<?> $$2;
      egm $$3;
      try {
         $$2 = $$0.f();
         $$3 = $$0.a($$2);
      } catch (sy | te | IOException var10) {
         this.c.a(new fcy(this.c, $$2x -> {
            if ($$2x) {
               this.a($$0, $$1);
            } else {
               $$0.a();
               $$1.run();
            }
         }, $$0));
         return;
      } catch (OutOfMemoryError var11) {
         aul.b();
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
         this.c.a(new fbm($$1, vf.c("selectWorld.incompatible.title").b(-65536), vf.a("selectWorld.incompatible.description", $$3.k())));
      } else {
         egm.a $$12 = $$3.o();
         if ($$12.a()) {
            String $$13 = "selectWorld.backupQuestion." + $$12.c();
            String $$14 = "selectWorld.backupWarning." + $$12.c();
            vt $$15 = vf.c($$13);
            if ($$12.b()) {
               $$15.b(-2142128);
            }

            vf $$16 = vf.a($$14, $$3.k(), aa.b().c());
            this.c.a(new fbn(() -> {
               $$0.a();
               $$1.run();
            }, ($$3x, $$4) -> {
               if ($$3x) {
                  fhr.a($$0);
               }

               this.a($$0, $$2, false, true, $$1);
            }, $$15, $$16, false));
         } else {
            this.a($$0, $$2, false, true, $$1);
         }
      }
   }

   public CompletableFuture<Void> a(gha $$0, egl.c $$1) {
      Path $$2 = $$1.a(egj.k);
      if (Files.exists($$2) && !Files.isDirectory($$2)) {
         $$0.f();
         CompletableFuture<Void> $$3 = $$0.b(b);
         $$0.a(b, $$2);
         return $$3;
      } else {
         return CompletableFuture.completedFuture(null);
      }
   }

   private void a(egl.c $$0, Dynamic<?> $$1, boolean $$2, boolean $$3, Runnable $$4) {
      this.c.d(new fcf(vf.c("selectWorld.resource_load")));
      aps $$5 = apv.a($$0);

      aic $$6;
      try {
         $$6 = this.a($$1, $$2, $$5);
      } catch (Exception var12) {
         a.warn("Failed to load level data or datapacks, can't proceed with server load", var12);
         if (!$$2) {
            this.c.a(new fbx(() -> {
               $$0.a();
               $$4.run();
            }, () -> this.a($$0, $$1, true, $$3, $$4)));
         } else {
            $$0.a();
            this.c.a(new fbm($$4, vf.c("datapackFailure.safeMode.failed.title"), vf.c("datapackFailure.safeMode.failed.description"), ve.k, true));
         }

         return;
      }

      egr $$9 = $$6.d();
      boolean $$10 = $$9.A().e();
      boolean $$11 = $$9.D() != Lifecycle.stable();
      if (!$$3 || !$$10 && !$$11) {
         gha $$12 = this.c.ac();
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
      this.c.a(new fbs($$0::complete, vf.c("multiplayer.texturePrompt.failure.line1"), vf.c("multiplayer.texturePrompt.failure.line2"), ve.i, ve.e));
      return $$0;
   }
}
