import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.Lifecycle;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.io.IOException;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fht {
   private static final Logger a = LogUtils.getLogger();
   private final eva b;
   private final egf c;

   public fht(eva $$0, egf $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public void a(String $$0, ctm $$1, dph $$2, Function<iu, dpe> $$3, fct $$4) {
      this.b.d(new fbz(vd.c("selectWorld.data_read")));
      egf.c $$5 = this.a($$0);
      if ($$5 != null) {
         apn $$6 = apq.a($$5);
         cuc $$7 = $$1.g();

         try {
            ahy.d $$8 = new ahy.d($$6, $$7, false, false);
            ahz $$9 = this.a($$8, $$3x -> {
               dpe.b $$4x = $$3.apply($$3x.c()).a($$3x.d().d(ke.aN));
               return new ahy.b<>(new egj($$1, $$2, $$4x.d(), $$4x.a()), $$4x.b());
            }, ahz::new);
            this.b.a($$5, $$6, $$9, true);
         } catch (Exception var11) {
            a.warn("Failed to load datapacks, can't proceed with server load", var11);
            $$5.a();
            this.b.a($$4);
         }
      }
   }

   @Nullable
   private egf.c a(String $$0) {
      try {
         return this.c.d($$0);
      } catch (IOException var3) {
         a.warn("Failed to read level {} data", $$0, var3);
         ezf.a(this.b, $$0);
         this.b.a(null);
         return null;
      } catch (elb var4) {
         a.warn("{}", var4.getMessage());
         this.b.a(fci.a(() -> this.b.a(null)));
         return null;
      }
   }

   public void a(egf.c $$0, ahn $$1, io<ahm> $$2, egl $$3) {
      apn $$4 = apq.a($$0);
      aps $$5 = (aps)new ahy.d($$4, $$3.F(), false, false).a().getSecond();
      this.b.a($$0, $$4, new ahz($$5, $$1, $$2, $$3), true);
   }

   public ahz a(Dynamic<?> $$0, boolean $$1, apn $$2) throws Exception {
      ahy.d $$3 = egf.a($$0, $$2, $$1);
      return this.a($$3, $$1x -> {
         it<dmk> $$2x = $$1x.d().d(ke.aN);
         egc $$3x = egf.a($$0, $$1x.b(), $$2x, $$1x.c());
         return new ahy.b<>($$3x.a(), $$3x.b().b());
      }, ahz::new);
   }

   public Pair<ctm, fhr> a(egf.c $$0) throws Exception {
      apn $$1 = apq.a($$0);
      Dynamic<?> $$2 = $$0.f();
      ahy.d $$3 = egf.a($$2, $$1, false);

      record a(ctm a, dph b, it<dmk> c) {
      }

      return this.a($$3, $$1x -> {
         it<dmk> $$2x = new ip<>(ke.aN, Lifecycle.stable()).l();
         egc $$3x = egf.a($$2, $$1x.b(), $$2x, $$1x.c());
         return new ahy.b<>(new a($$3x.a().L(), $$3x.a().A(), $$3x.b().c()), $$1x.d());
      }, ($$0x, $$1x, $$2x, $$3x) -> {
         $$0x.close();
         return Pair.of($$3x.a, new fhr($$3x.b, new dpe($$3x.c), $$2x, $$1x, $$3x.a.g()));
      });
   }

   private <D, R> R a(ahy.d $$0, ahy.f<D> $$1, ahy.e<D, R> $$2) throws Exception {
      ahy.c $$3 = new ahy.c($$0, dt.a.c, 2);
      CompletableFuture<R> $$4 = ahy.a($$3, $$1, $$2, ac.f(), this.b);
      this.b.c($$4::isDone);
      return $$4.get();
   }

   private void a(egf.c $$0, boolean $$1, Runnable $$2, Runnable $$3) {
      vd $$4;
      vd $$5;
      if ($$1) {
         $$4 = vd.c("selectWorld.backupQuestion.customized");
         $$5 = vd.c("selectWorld.backupWarning.customized");
      } else {
         $$4 = vd.c("selectWorld.backupQuestion.experimental");
         $$5 = vd.c("selectWorld.backupWarning.experimental");
      }

      this.b.a(new fbh($$3, ($$2x, $$3x) -> {
         if ($$2x) {
            fhl.a($$0);
         }

         $$2.run();
      }, $$4, $$5, false));
   }

   public static void a(eva $$0, fhj $$1, Lifecycle $$2, Runnable $$3, boolean $$4) {
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
         $$0.a(new fbm($$5, vd.c("selectWorld.warning.experimental.title"), vd.c("selectWorld.warning.experimental.question")));
      } else {
         $$0.a(new fbm($$5, vd.c("selectWorld.warning.deprecated.title"), vd.c("selectWorld.warning.deprecated.question")));
      }
   }

   public void a(String $$0, Runnable $$1) {
      this.b.d(new fbz(vd.c("selectWorld.data_read")));
      egf.c $$2 = this.a($$0);
      if ($$2 != null) {
         this.a($$2, $$1);
      }
   }

   private void a(egf.c $$0, Runnable $$1) {
      this.b.d(new fbz(vd.c("selectWorld.data_read")));

      Dynamic<?> $$2;
      egg $$3;
      try {
         $$2 = $$0.f();
         $$3 = $$0.a($$2);
      } catch (sw | tc | IOException var10) {
         this.b.a(new fcs(this.b, $$2x -> {
            if ($$2x) {
               this.a($$0, $$1);
            } else {
               $$0.a();
               $$1.run();
            }
         }, $$0));
         return;
      } catch (OutOfMemoryError var11) {
         aug.b();
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
         this.b.a(new fbg($$1, vd.c("selectWorld.incompatible.title").b(-65536), vd.a("selectWorld.incompatible.description", $$3.k())));
      } else {
         egg.a $$12 = $$3.o();
         if ($$12.a()) {
            String $$13 = "selectWorld.backupQuestion." + $$12.c();
            String $$14 = "selectWorld.backupWarning." + $$12.c();
            vr $$15 = vd.c($$13);
            if ($$12.b()) {
               $$15.b(-2142128);
            }

            vd $$16 = vd.a($$14, $$3.k(), aa.b().c());
            this.b.a(new fbh(() -> {
               $$0.a();
               $$1.run();
            }, ($$3x, $$4) -> {
               if ($$3x) {
                  fhl.a($$0);
               }

               this.a($$0, $$2, false, true, $$1);
            }, $$15, $$16, false));
         } else {
            this.a($$0, $$2, false, true, $$1);
         }
      }
   }

   private void a(egf.c $$0, Dynamic<?> $$1, boolean $$2, boolean $$3, Runnable $$4) {
      this.b.d(new fbz(vd.c("selectWorld.resource_load")));
      apn $$5 = apq.a($$0);

      ahz $$6;
      try {
         $$6 = this.a($$1, $$2, $$5);
      } catch (Exception var11) {
         a.warn("Failed to load level data or datapacks, can't proceed with server load", var11);
         if (!$$2) {
            this.b.a(new fbr(() -> {
               $$0.a();
               $$4.run();
            }, () -> this.a($$0, $$1, true, $$3, $$4)));
         } else {
            $$0.a();
            this.b.a(new fbg($$4, vd.c("datapackFailure.safeMode.failed.title"), vd.c("datapackFailure.safeMode.failed.description"), vc.k, true));
         }

         return;
      }

      egl $$9 = $$6.d();
      boolean $$10 = $$9.A().e();
      boolean $$11 = $$9.D() != Lifecycle.stable();
      if (!$$3 || !$$10 && !$$11) {
         this.b.ab().a($$0).thenApply($$0x -> true).exceptionallyComposeAsync($$0x -> {
            a.warn("Failed to load pack: ", $$0x);
            return this.a();
         }, this.b).thenAcceptAsync($$4x -> {
            if ($$4x) {
               this.b.a($$0, $$5, $$6, false);
            } else {
               $$6.close();
               $$0.a();
               this.b.ab().a().thenRunAsync($$4, this.b);
            }
         }, this.b).exceptionally($$0x -> {
            this.b.a(o.a($$0x, "Load world"));
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
      this.b.a(new fbm($$0::complete, vd.c("multiplayer.texturePrompt.failure.line1"), vd.c("multiplayer.texturePrompt.failure.line2"), vc.i, vc.e));
      return $$0;
   }
}
