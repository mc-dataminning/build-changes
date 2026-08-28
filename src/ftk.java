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

public class ftk {
   private static final Logger a = LogUtils.getLogger();
   private static final UUID b = UUID.fromString("640a6a92-b6cb-48a0-b391-831586500359");
   private final fgm c;
   private final erd d;

   public ftk(fgm $$0, erd $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   public void a(String $$0, dda $$1, dzw $$2, Function<ka, dzt> $$3, fob $$4) {
      this.c.d(new fnm(wz.c("selectWorld.data_read")));
      erd.c $$5 = this.a($$0);
      if ($$5 != null) {
         atp $$6 = ats.a($$5);
         ddr $$7 = $$1.g();

         try {
            alo.d $$8 = new alo.d($$6, $$7, false, false);
            alp $$9 = this.a($$8, $$3x -> {
               dzt.b $$4x = $$3.apply($$3x.c()).a($$3x.d().d(lu.bb));
               return new alo.b<>(new erh($$1, $$2, $$4x.d(), $$4x.a()), $$4x.b());
            }, alp::new);
            this.c.a($$5, $$6, $$9, true);
         } catch (Exception var11) {
            a.warn("Failed to load datapacks, can't proceed with server load", var11);
            $$5.c();
            this.c.a($$4);
         }
      }
   }

   @Nullable
   private erd.c a(String $$0) {
      try {
         return this.d.d($$0);
      } catch (IOException var3) {
         a.warn("Failed to read level {} data", $$0, var3);
         fks.a(this.c, $$0);
         this.c.a(null);
         return null;
      } catch (ewp var4) {
         a.warn("{}", var4.getMessage());
         this.c.a(fnt.a(() -> this.c.a(null)));
         return null;
      }
   }

   public void a(erd.c $$0, alc $$1, jt<ala> $$2, erj $$3) {
      atp $$4 = ats.a($$0);
      atu $$5 = (atu)new alo.d($$4, $$3.D(), false, false).a().getSecond();
      this.c.a($$0, $$4, new alp($$5, $$1, $$2, $$3), true);
   }

   public alp a(Dynamic<?> $$0, boolean $$1, atp $$2) throws Exception {
      alo.d $$3 = erd.a($$0, $$2, $$1);
      return this.a($$3, $$1x -> {
         jz<dwz> $$2x = $$1x.d().d(lu.bb);
         era $$3x = erd.a($$0, $$1x.b(), $$2x, $$1x.c());
         return new alo.b<>($$3x.a(), $$3x.b().b());
      }, alp::new);
   }

   public Pair<dda, fti> a(erd.c $$0) throws Exception {
      atp $$1 = ats.a($$0);
      Dynamic<?> $$2 = $$0.h();
      alo.d $$3 = erd.a($$2, $$1, false);

      record a(dda a, dzw b, jz<dwz> c) {
      }

      return this.a($$3, $$1x -> {
         jz<dwz> $$2x = new ju<>(lu.bb, Lifecycle.stable()).m();
         era $$3x = erd.a($$2, $$1x.b(), $$2x, $$1x.c());
         return new alo.b<>(new a($$3x.a().J(), $$3x.a().y(), $$3x.b().c()), $$1x.d());
      }, ($$0x, $$1x, $$2x, $$3x) -> {
         $$0x.close();
         return Pair.of($$3x.a, new fti($$3x.b, new dzt($$3x.c), $$2x, $$1x, $$3x.a.g()));
      });
   }

   private <D, R> R a(alo.d $$0, alo.f<D> $$1, alo.e<D, R> $$2) throws Exception {
      alo.c $$3 = new alo.c($$0, eu.a.c, 2);
      CompletableFuture<R> $$4 = alo.a($$3, $$1, $$2, ad.g(), this.c);
      this.c.b($$4::isDone);
      return $$4.get();
   }

   private void a(erd.c $$0, boolean $$1, Runnable $$2, Runnable $$3) {
      wz $$4;
      wz $$5;
      if ($$1) {
         $$4 = wz.c("selectWorld.backupQuestion.customized");
         $$5 = wz.c("selectWorld.backupWarning.customized");
      } else {
         $$4 = wz.c("selectWorld.backupQuestion.experimental");
         $$5 = wz.c("selectWorld.backupWarning.experimental");
      }

      this.c.a(new fmv($$3, ($$2x, $$3x) -> {
         if ($$2x) {
            ftc.a($$0);
         }

         $$2.run();
      }, $$4, $$5, false));
   }

   public static void a(fgm $$0, fta $$1, Lifecycle $$2, Runnable $$3, boolean $$4) {
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
         $$0.a(new fmz($$5, wz.c("selectWorld.warning.experimental.title"), wz.c("selectWorld.warning.experimental.question")));
      } else {
         $$0.a(new fmz($$5, wz.c("selectWorld.warning.deprecated.title"), wz.c("selectWorld.warning.deprecated.question")));
      }
   }

   public void a(String $$0, Runnable $$1) {
      this.c.d(new fnm(wz.c("selectWorld.data_read")));
      erd.c $$2 = this.a($$0);
      if ($$2 != null) {
         this.a($$2, $$1);
      }
   }

   private void a(erd.c $$0, Runnable $$1) {
      this.c.d(new fnm(wz.c("selectWorld.data_read")));

      Dynamic<?> $$2;
      ere $$3;
      try {
         $$2 = $$0.h();
         $$3 = $$0.a($$2);
      } catch (um | us | IOException var10) {
         this.c.a(new foa(this.c, $$2x -> {
            if ($$2x) {
               this.a($$0, $$1);
            } else {
               $$0.c();
               $$1.run();
            }
         }, $$0));
         return;
      } catch (OutOfMemoryError var11) {
         aym.b();
         System.gc();
         String $$6 = "Ran out of memory trying to read level data of world folder \"" + $$0.f() + "\"";
         a.error(LogUtils.FATAL_MARKER, $$6);
         OutOfMemoryError $$7 = new OutOfMemoryError("Ran out of memory reading level data");
         $$7.initCause(var11);
         o $$8 = o.a($$7, $$6);
         p $$9 = $$8.a("World details");
         $$9.a("World folder", $$0.f());
         throw new z($$8);
      }

      this.a($$0, $$3, $$2, $$1);
   }

   private void a(erd.c $$0, ere $$1, Dynamic<?> $$2, Runnable $$3) {
      if (!$$1.r()) {
         $$0.c();
         this.c.a(new fmu($$3, wz.c("selectWorld.incompatible.title").b(-65536), wz.a("selectWorld.incompatible.description", $$1.k())));
      } else {
         ere.a $$4 = $$1.o();
         if ($$4.a()) {
            String $$5 = "selectWorld.backupQuestion." + $$4.c();
            String $$6 = "selectWorld.backupWarning." + $$4.c();
            xn $$7 = wz.c($$5);
            if ($$4.b()) {
               $$7.b(-2142128);
            }

            wz $$8 = wz.a($$6, $$1.k(), ab.b().c());
            this.c.a(new fmv(() -> {
               $$0.c();
               $$3.run();
            }, ($$3x, $$4x) -> {
               if ($$3x) {
                  ftc.a($$0);
               }

               this.a($$0, $$2, false, $$3);
            }, $$7, $$8, false));
         } else {
            this.a($$0, $$2, false, $$3);
         }
      }
   }

   private void a(erd.c $$0, Dynamic<?> $$1, boolean $$2, Runnable $$3) {
      this.c.d(new fnm(wz.c("selectWorld.resource_load")));
      atp $$4 = ats.a($$0);

      alp $$5;
      try {
         $$5 = this.a($$1, $$2, $$4);

         for (dwz $$6 : $$5.c().a().d(lu.bb)) {
            $$6.b().a();
         }
      } catch (Exception var9) {
         a.warn("Failed to load level data or datapacks, can't proceed with server load", var9);
         if (!$$2) {
            this.c.a(new fne(() -> {
               $$0.c();
               $$3.run();
            }, () -> this.a($$0, $$1, true, $$3)));
         } else {
            $$0.c();
            this.c.a(new fmu($$3, wz.c("datapackFailure.safeMode.failed.title"), wz.c("datapackFailure.safeMode.failed.description"), wy.k, true));
         }

         return;
      }

      this.a($$0, $$5, $$4, $$3);
   }

   private void a(erd.c $$0, alp $$1, atp $$2, Runnable $$3) {
      erj $$4 = $$1.d();
      boolean $$5 = $$4.y().e();
      boolean $$6 = $$4.B() != Lifecycle.stable();
      if (!$$5 && !$$6) {
         this.b($$0, $$1, $$2, $$3);
      } else {
         this.a($$0, $$5, () -> this.b($$0, $$1, $$2, $$3), () -> {
            $$1.close();
            $$0.c();
            $$3.run();
         });
      }
   }

   private void b(erd.c $$0, alp $$1, atp $$2, Runnable $$3) {
      gta $$4 = this.c.ae();
      this.a($$4, $$0).thenApply($$0x -> true).exceptionallyComposeAsync($$0x -> {
         a.warn("Failed to load pack: ", $$0x);
         return this.a();
      }, this.c).thenAcceptAsync($$5 -> {
         if ($$5) {
            this.a($$0, $$1, $$4, $$2, $$3);
         } else {
            $$4.e();
            $$1.close();
            $$0.c();
            $$3.run();
         }
      }, this.c).exceptionally($$0x -> {
         this.c.a(o.a($$0x, "Load world"));
         return null;
      });
   }

   private void a(erd.c $$0, alp $$1, gta $$2, atp $$3, Runnable $$4) {
      if ($$0.b()) {
         this.c.a(new fmz($$5 -> {
            if ($$5) {
               this.a($$0, $$1, $$3);
            } else {
               $$2.e();
               $$1.close();
               $$0.c();
               $$4.run();
            }
         }, wz.c("selectWorld.warning.lowDiskSpace.title").a(n.m), wz.c("selectWorld.warning.lowDiskSpace.description"), wy.j, wy.k));
      } else {
         this.a($$0, $$1, $$3);
      }
   }

   private void a(erd.c $$0, alp $$1, atp $$2) {
      this.c.a($$0, $$2, $$1, false);
   }

   private CompletableFuture<Void> a(gta $$0, erd.c $$1) {
      Path $$2 = $$1.a(erb.k);
      if (Files.exists($$2) && !Files.isDirectory($$2)) {
         $$0.f();
         CompletableFuture<Void> $$3 = $$0.b(b);
         $$0.a(b, $$2);
         return $$3;
      } else {
         return CompletableFuture.completedFuture(null);
      }
   }

   private CompletableFuture<Boolean> a() {
      CompletableFuture<Boolean> $$0 = new CompletableFuture<>();
      this.c.a(new fmz($$0::complete, wz.c("multiplayer.texturePrompt.failure.line1"), wz.c("multiplayer.texturePrompt.failure.line2"), wy.i, wy.e));
      return $$0;
   }
}
