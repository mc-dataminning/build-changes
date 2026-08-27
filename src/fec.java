import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.Lifecycle;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.io.IOException;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fec {
   private static final Logger a = LogUtils.getLogger();
   private final ero b;
   private final ecy c;

   public fec(ero $$0, ecy $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public void a(ezd $$0, String $$1) {
      try {
         this.a($$0, $$1, false, true);
      } catch (OutOfMemoryError var8) {
         asw.b();
         System.gc();
         String $$3 = "Ran out of memory trying to read level data of world folder \"" + $$1 + "\"";
         a.error(LogUtils.FATAL_MARKER, $$3);
         OutOfMemoryError $$4 = new OutOfMemoryError("Ran out of memory reading level data");
         $$4.initCause(var8);
         o $$5 = o.a($$4, $$3);
         p $$6 = $$5.a("World details");
         $$6.a("World folder", $$1);
         throw new y($$5);
      }
   }

   public void a(String $$0, crd $$1, dmi $$2, Function<ip, dmf> $$3) {
      ecy.c $$4 = this.a($$0);
      if ($$4 != null) {
         aoe $$5 = aoh.a($$4);
         crs $$6 = $$1.g();

         try {
            agq.d $$7 = new agq.d($$5, $$6, false, false);
            agr $$8 = this.a($$7, $$3x -> {
               dmf.b $$4x = $$3.apply($$3x.c()).a($$3x.d().d(jz.aJ));
               return new agq.b<>(new edc($$1, $$2, $$4x.d(), $$4x.a()), $$4x.b());
            }, agr::new);
            this.b.a($$0, $$4, $$5, $$8, true);
         } catch (Exception var10) {
            a.warn("Failed to load datapacks, can't proceed with server load", var10);
            a($$4, $$0);
         }
      }
   }

   @Nullable
   private ecy.c a(String $$0) {
      try {
         return this.c.d($$0);
      } catch (IOException var3) {
         a.warn("Failed to read level {} data", $$0, var3);
         evq.a(this.b, $$0);
         this.b.a(null);
         return null;
      } catch (ehu var4) {
         a.warn("{}", var4.getMessage());
         this.b.a(eyt.a(null));
         return null;
      }
   }

   public void a(ecy.c $$0, agg $$1, ij<agf> $$2, ede $$3) {
      aoe $$4 = aoh.a($$0);
      aoj $$5 = (aoj)new agq.d($$4, $$3.F(), false, false).a().getSecond();
      this.b.a($$0.b(), $$0, $$4, new agr($$5, $$1, $$2, $$3), true);
   }

   private agr a(ecy.c $$0, boolean $$1, aoe $$2) throws Exception {
      agq.d $$3 = this.b($$0, $$1, $$2);
      return this.a($$3, $$1x -> {
         DynamicOps<sn> $$2x = afu.a(sf.a, $$1x.c());
         io<djl> $$3x = $$1x.d().d(jz.aJ);
         Pair<ede, dmf.b> $$4 = $$0.a($$2x, $$1x.b(), $$3x, $$1x.c().d());
         if ($$4 == null) {
            throw new IllegalStateException("Failed to load world");
         } else {
            return new agq.b<>((ede)$$4.getFirst(), ((dmf.b)$$4.getSecond()).b());
         }
      }, agr::new);
   }

   public Pair<crd, fea> a(ecy.c $$0) throws Exception {
      aoe $$1 = aoh.a($$0);
      agq.d $$2 = this.b($$0, false, $$1);

      record a(crd a, dmi b, io<djl> c) {
      }

      return this.a($$2, $$1x -> {
         DynamicOps<sn> $$2x = afu.a(sf.a, $$1x.c());
         io<djl> $$3 = new ik<>(jz.aJ, Lifecycle.stable()).l();
         Pair<ede, dmf.b> $$4 = $$0.a($$2x, $$1x.b(), $$3, $$1x.c().d());
         if ($$4 == null) {
            throw new IllegalStateException("Failed to load world");
         } else {
            return new agq.b<>(new a(((ede)$$4.getFirst()).L(), ((ede)$$4.getFirst()).A(), ((dmf.b)$$4.getSecond()).c()), $$1x.d());
         }
      }, ($$0x, $$1x, $$2x, $$3) -> {
         $$0x.close();
         return Pair.of($$3.a, new fea($$3.b, new dmf($$3.c), $$2x, $$1x, $$3.a.g()));
      });
   }

   private agq.d b(ecy.c $$0, boolean $$1, aoe $$2) {
      crs $$3 = $$0.e();
      if ($$3 == null) {
         throw new IllegalStateException("Failed to load data pack config");
      } else {
         return new agq.d($$2, $$3, $$1, false);
      }
   }

   public agr a(ecy.c $$0, boolean $$1) throws Exception {
      aoe $$2 = aoh.a($$0);
      return this.a($$0, $$1, $$2);
   }

   private <D, R> R a(agq.d $$0, agq.f<D> $$1, agq.e<D, R> $$2) throws Exception {
      agq.c $$3 = new agq.c($$0, dv.a.c, 2);
      CompletableFuture<R> $$4 = agq.a($$3, $$1, $$2, ac.f(), this.b);
      this.b.c($$4::isDone);
      return $$4.get();
   }

   private void a(ezd $$0, String $$1, boolean $$2, boolean $$3) {
      ecy.c $$4 = this.a($$1);
      if ($$4 != null) {
         aoe $$5 = aoh.a($$4);

         agr $$6;
         try {
            $$6 = this.a($$4, $$2, $$5);
         } catch (Exception var11) {
            a.warn("Failed to load level data or datapacks, can't proceed with server load", var11);
            if (!$$2) {
               this.b.a(new eyc(() -> this.a($$0, $$1, true, $$3)));
            } else {
               this.b
                  .a(
                     new exr(
                        () -> this.b.a(null), ui.c("datapackFailure.safeMode.failed.title"), ui.c("datapackFailure.safeMode.failed.description"), uh.l, true
                     )
                  );
            }

            a($$4, $$1);
            return;
         }

         ede $$9 = $$6.d();
         boolean $$10 = $$9.A().e();
         boolean $$11 = $$9.D() != Lifecycle.stable();
         if (!$$3 || !$$10 && !$$11) {
            this.b.ac().a($$4).thenApply($$0x -> true).exceptionallyComposeAsync($$0x -> {
               a.warn("Failed to load pack: ", $$0x);
               return this.a();
            }, this.b).thenAcceptAsync($$5x -> {
               if ($$5x) {
                  this.b.a($$1, $$4, $$5, $$6, false);
               } else {
                  $$6.close();
                  a($$4, $$1);
                  this.b.ac().a().thenRunAsync(() -> this.b.a($$0), this.b);
               }
            }, this.b).exceptionally($$0x -> {
               this.b.a(o.a($$0x, "Load world"));
               return null;
            });
         } else {
            this.a($$0, $$1, $$10, () -> this.a($$0, $$1, $$2, false));
            $$6.close();
            a($$4, $$1);
         }
      }
   }

   private CompletableFuture<Boolean> a() {
      CompletableFuture<Boolean> $$0 = new CompletableFuture<>();
      this.b.a(new exx($$0::complete, ui.c("multiplayer.texturePrompt.failure.line1"), ui.c("multiplayer.texturePrompt.failure.line2"), uh.i, uh.e));
      return $$0;
   }

   private static void a(ecy.c $$0, String $$1) {
      try {
         $$0.close();
      } catch (IOException var3) {
         a.warn("Failed to unlock access to level {}", $$1, var3);
      }
   }

   private void a(ezd $$0, String $$1, boolean $$2, Runnable $$3) {
      ui $$4;
      ui $$5;
      if ($$2) {
         $$4 = ui.c("selectWorld.backupQuestion.customized");
         $$5 = ui.c("selectWorld.backupWarning.customized");
      } else {
         $$4 = ui.c("selectWorld.backupQuestion.experimental");
         $$5 = ui.c("selectWorld.backupWarning.experimental");
      }

      this.b.a(new exs($$0, ($$2x, $$3x) -> {
         if ($$2x) {
            fdu.a(this.c, $$1);
         }

         $$3.run();
      }, $$4, $$5, false));
   }

   public static void a(ero $$0, fds $$1, Lifecycle $$2, Runnable $$3, boolean $$4) {
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
         $$0.a(new exx($$5, ui.c("selectWorld.warning.experimental.title"), ui.c("selectWorld.warning.experimental.question")));
      } else {
         $$0.a(new exx($$5, ui.c("selectWorld.warning.deprecated.title"), ui.c("selectWorld.warning.deprecated.question")));
      }
   }
}
