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

public class ffz {
   private static final Logger a = LogUtils.getLogger();
   private final eti b;
   private final ees c;

   public ffz(eti $$0, ees $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public void a(String $$0, csj $$1, dnu $$2, Function<it, dnr> $$3, faz $$4) {
      this.b.d(new faf(uv.c("selectWorld.data_read")));
      ees.c $$5 = this.a($$0);
      if ($$5 != null) {
         aow $$6 = aoz.a($$5);
         csy $$7 = $$1.g();

         try {
            ahh.d $$8 = new ahh.d($$6, $$7, false, false);
            ahi $$9 = this.a($$8, $$3x -> {
               dnr.b $$4x = $$3.apply($$3x.c()).a($$3x.d().d(kd.aK));
               return new ahh.b<>(new eew($$1, $$2, $$4x.d(), $$4x.a()), $$4x.b());
            }, ahi::new);
            this.b.a($$5, $$6, $$9, true);
         } catch (Exception var11) {
            a.warn("Failed to load datapacks, can't proceed with server load", var11);
            $$5.a();
            this.b.a($$4);
         }
      }
   }

   @Nullable
   private ees.c a(String $$0) {
      try {
         return this.c.d($$0);
      } catch (IOException var3) {
         a.warn("Failed to read level {} data", $$0, var3);
         exl.a(this.b, $$0);
         this.b.a(null);
         return null;
      } catch (ejo var4) {
         a.warn("{}", var4.getMessage());
         this.b.a(fao.a(() -> this.b.a(null)));
         return null;
      }
   }

   public void a(ees.c $$0, agw $$1, in<agv> $$2, eey $$3) {
      aow $$4 = aoz.a($$0);
      apb $$5 = (apb)new ahh.d($$4, $$3.F(), false, false).a().getSecond();
      this.b.a($$0, $$4, new ahi($$5, $$1, $$2, $$3), true);
   }

   public ahi a(Dynamic<?> $$0, boolean $$1, aow $$2) throws Exception {
      ahh.d $$3 = ees.a($$0, $$2, $$1);
      return this.a($$3, $$1x -> {
         is<dkx> $$2x = $$1x.d().d(kd.aK);
         eep $$3x = ees.a($$0, $$1x.b(), $$2x, $$1x.c());
         return new ahh.b<>($$3x.a(), $$3x.b().b());
      }, ahi::new);
   }

   public Pair<csj, ffx> a(ees.c $$0) throws Exception {
      aow $$1 = aoz.a($$0);
      Dynamic<?> $$2 = $$0.f();
      ahh.d $$3 = ees.a($$2, $$1, false);

      record a(csj a, dnu b, is<dkx> c) {
      }

      return this.a($$3, $$1x -> {
         is<dkx> $$2x = new io<>(kd.aK, Lifecycle.stable()).l();
         eep $$3x = ees.a($$2, $$1x.b(), $$2x, $$1x.c());
         return new ahh.b<>(new a($$3x.a().L(), $$3x.a().A(), $$3x.b().c()), $$1x.d());
      }, ($$0x, $$1x, $$2x, $$3x) -> {
         $$0x.close();
         return Pair.of($$3x.a, new ffx($$3x.b, new dnr($$3x.c), $$2x, $$1x, $$3x.a.g()));
      });
   }

   private <D, R> R a(ahh.d $$0, ahh.f<D> $$1, ahh.e<D, R> $$2) throws Exception {
      ahh.c $$3 = new ahh.c($$0, dv.a.c, 2);
      CompletableFuture<R> $$4 = ahh.a($$3, $$1, $$2, ac.f(), this.b);
      this.b.c($$4::isDone);
      return $$4.get();
   }

   private void a(ees.c $$0, boolean $$1, Runnable $$2, Runnable $$3) {
      uv $$4;
      uv $$5;
      if ($$1) {
         $$4 = uv.c("selectWorld.backupQuestion.customized");
         $$5 = uv.c("selectWorld.backupWarning.customized");
      } else {
         $$4 = uv.c("selectWorld.backupQuestion.experimental");
         $$5 = uv.c("selectWorld.backupWarning.experimental");
      }

      this.b.a(new ezn($$3, ($$2x, $$3x) -> {
         if ($$2x) {
            ffr.a($$0);
         }

         $$2.run();
      }, $$4, $$5, false));
   }

   public static void a(eti $$0, ffp $$1, Lifecycle $$2, Runnable $$3, boolean $$4) {
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
         $$0.a(new ezs($$5, uv.c("selectWorld.warning.experimental.title"), uv.c("selectWorld.warning.experimental.question")));
      } else {
         $$0.a(new ezs($$5, uv.c("selectWorld.warning.deprecated.title"), uv.c("selectWorld.warning.deprecated.question")));
      }
   }

   public void a(String $$0, Runnable $$1) {
      this.b.d(new faf(uv.c("selectWorld.data_read")));
      ees.c $$2 = this.a($$0);
      if ($$2 != null) {
         this.a($$2, $$1);
      }
   }

   private void a(ees.c $$0, Runnable $$1) {
      this.b.d(new faf(uv.c("selectWorld.data_read")));

      Dynamic<?> $$2;
      eet $$3;
      try {
         $$2 = $$0.f();
         $$3 = $$0.a($$2);
      } catch (so | su | IOException var10) {
         this.b.a(new fay(this.b, $$2x -> {
            if ($$2x) {
               this.a($$0, $$1);
            } else {
               $$0.a();
               $$1.run();
            }
         }, $$0));
         return;
      } catch (OutOfMemoryError var11) {
         ato.b();
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
         this.b.a(new ezm($$1, uv.c("selectWorld.incompatible.title").b(-65536), uv.a("selectWorld.incompatible.description", $$3.k())));
      } else {
         eet.a $$12 = $$3.o();
         if ($$12.a()) {
            String $$13 = "selectWorld.backupQuestion." + $$12.c();
            String $$14 = "selectWorld.backupWarning." + $$12.c();
            vj $$15 = uv.c($$13);
            if ($$12.b()) {
               $$15.b(-2142128);
            }

            uv $$16 = uv.a($$14, $$3.k(), aa.b().c());
            this.b.a(new ezn(() -> {
               $$0.a();
               $$1.run();
            }, ($$3x, $$4) -> {
               if ($$3x) {
                  ffr.a($$0);
               }

               this.a($$0, $$2, false, true, $$1);
            }, $$15, $$16, false));
         } else {
            this.a($$0, $$2, false, true, $$1);
         }
      }
   }

   private void a(ees.c $$0, Dynamic<?> $$1, boolean $$2, boolean $$3, Runnable $$4) {
      this.b.d(new faf(uv.c("selectWorld.resource_load")));
      aow $$5 = aoz.a($$0);

      ahi $$6;
      try {
         $$6 = this.a($$1, $$2, $$5);
      } catch (Exception var11) {
         a.warn("Failed to load level data or datapacks, can't proceed with server load", var11);
         if (!$$2) {
            this.b.a(new ezx(() -> {
               $$0.a();
               $$4.run();
            }, () -> this.a($$0, $$1, true, $$3, $$4)));
         } else {
            $$0.a();
            this.b.a(new ezm($$4, uv.c("datapackFailure.safeMode.failed.title"), uv.c("datapackFailure.safeMode.failed.description"), uu.k, true));
         }

         return;
      }

      eey $$9 = $$6.d();
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
      this.b.a(new ezs($$0::complete, uv.c("multiplayer.texturePrompt.failure.line1"), uv.c("multiplayer.texturePrompt.failure.line2"), uu.i, uu.e));
      return $$0;
   }
}
