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

public class fqy {
   private static final Logger a = LogUtils.getLogger();
   private static final UUID b = UUID.fromString("640a6a92-b6cb-48a0-b391-831586500359");
   private final feb c;
   private final eox d;

   public fqy(feb $$0, eox $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   public void a(String $$0, dbd $$1, dxt $$2, Function<jl, dxq> $$3, flz $$4) {
      this.c.d(new flf(wx.c("selectWorld.data_read")));
      eox.c $$5 = this.a($$0);
      if ($$5 != null) {
         ati $$6 = atl.a($$5);
         dbt $$7 = $$1.g();

         try {
            alj.d $$8 = new alj.d($$6, $$7, false, false);
            alk $$9 = this.a($$8, $$3x -> {
               dxq.b $$4x = $$3.apply($$3x.c()).a($$3x.d().d(lf.aT));
               return new alj.b<>(new epb($$1, $$2, $$4x.d(), $$4x.a()), $$4x.b());
            }, alk::new);
            this.c.a($$5, $$6, $$9, true);
         } catch (Exception var11) {
            a.warn("Failed to load datapacks, can't proceed with server load", var11);
            $$5.c();
            this.c.a($$4);
         }
      }
   }

   @Nullable
   private eox.c a(String $$0) {
      try {
         return this.d.d($$0);
      } catch (IOException var3) {
         a.warn("Failed to read level {} data", $$0, var3);
         fii.a(this.c, $$0);
         this.c.a(null);
         return null;
      } catch (eub var4) {
         a.warn("{}", var4.getMessage());
         this.c.a(flo.a(() -> this.c.a(null)));
         return null;
      }
   }

   public void a(eox.c $$0, aky $$1, je<akw> $$2, epd $$3) {
      ati $$4 = atl.a($$0);
      atn $$5 = (atn)new alj.d($$4, $$3.D(), false, false).a().getSecond();
      this.c.a($$0, $$4, new alk($$5, $$1, $$2, $$3), true);
   }

   public alk a(Dynamic<?> $$0, boolean $$1, ati $$2) throws Exception {
      alj.d $$3 = eox.a($$0, $$2, $$1);
      return this.a($$3, $$1x -> {
         jk<duw> $$2x = $$1x.d().d(lf.aT);
         eou $$3x = eox.a($$0, $$1x.b(), $$2x, $$1x.c());
         return new alj.b<>($$3x.a(), $$3x.b().b());
      }, alk::new);
   }

   public Pair<dbd, fqw> a(eox.c $$0) throws Exception {
      ati $$1 = atl.a($$0);
      Dynamic<?> $$2 = $$0.h();
      alj.d $$3 = eox.a($$2, $$1, false);

      record a(dbd a, dxt b, jk<duw> c) {
      }

      return this.a($$3, $$1x -> {
         jk<duw> $$2x = new jf<>(lf.aT, Lifecycle.stable()).l();
         eou $$3x = eox.a($$2, $$1x.b(), $$2x, $$1x.c());
         return new alj.b<>(new a($$3x.a().J(), $$3x.a().y(), $$3x.b().c()), $$1x.d());
      }, ($$0x, $$1x, $$2x, $$3x) -> {
         $$0x.close();
         return Pair.of($$3x.a, new fqw($$3x.b, new dxq($$3x.c), $$2x, $$1x, $$3x.a.g()));
      });
   }

   private <D, R> R a(alj.d $$0, alj.f<D> $$1, alj.e<D, R> $$2) throws Exception {
      alj.c $$3 = new alj.c($$0, ef.a.c, 2);
      CompletableFuture<R> $$4 = alj.a($$3, $$1, $$2, ac.g(), this.c);
      this.c.c($$4::isDone);
      return $$4.get();
   }

   private void a(eox.c $$0, boolean $$1, Runnable $$2, Runnable $$3) {
      wx $$4;
      wx $$5;
      if ($$1) {
         $$4 = wx.c("selectWorld.backupQuestion.customized");
         $$5 = wx.c("selectWorld.backupWarning.customized");
      } else {
         $$4 = wx.c("selectWorld.backupQuestion.experimental");
         $$5 = wx.c("selectWorld.backupWarning.experimental");
      }

      this.c.a(new fkm($$3, ($$2x, $$3x) -> {
         if ($$2x) {
            fqq.a($$0);
         }

         $$2.run();
      }, $$4, $$5, false));
   }

   public static void a(feb $$0, fqo $$1, Lifecycle $$2, Runnable $$3, boolean $$4) {
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
         $$0.a(new fkr($$5, wx.c("selectWorld.warning.experimental.title"), wx.c("selectWorld.warning.experimental.question")));
      } else {
         $$0.a(new fkr($$5, wx.c("selectWorld.warning.deprecated.title"), wx.c("selectWorld.warning.deprecated.question")));
      }
   }

   public void a(String $$0, Runnable $$1) {
      this.c.d(new flf(wx.c("selectWorld.data_read")));
      eox.c $$2 = this.a($$0);
      if ($$2 != null) {
         this.a($$2, $$1);
      }
   }

   private void a(eox.c $$0, Runnable $$1) {
      this.c.d(new flf(wx.c("selectWorld.data_read")));

      Dynamic<?> $$2;
      eoy $$3;
      try {
         $$2 = $$0.h();
         $$3 = $$0.a($$2);
      } catch (uo | uu | IOException var10) {
         this.c.a(new fly(this.c, $$2x -> {
            if ($$2x) {
               this.a($$0, $$1);
            } else {
               $$0.c();
               $$1.run();
            }
         }, $$0));
         return;
      } catch (OutOfMemoryError var11) {
         ayd.b();
         System.gc();
         String $$6 = "Ran out of memory trying to read level data of world folder \"" + $$0.f() + "\"";
         a.error(LogUtils.FATAL_MARKER, $$6);
         OutOfMemoryError $$7 = new OutOfMemoryError("Ran out of memory reading level data");
         $$7.initCause(var11);
         o $$8 = o.a($$7, $$6);
         p $$9 = $$8.a("World details");
         $$9.a("World folder", $$0.f());
         throw new y($$8);
      }

      this.a($$0, $$3, $$2, $$1);
   }

   private void a(eox.c $$0, eoy $$1, Dynamic<?> $$2, Runnable $$3) {
      if (!$$1.r()) {
         $$0.c();
         this.c.a(new fkl($$3, wx.c("selectWorld.incompatible.title").b(-65536), wx.a("selectWorld.incompatible.description", $$1.k())));
      } else {
         eoy.a $$4 = $$1.o();
         if ($$4.a()) {
            String $$5 = "selectWorld.backupQuestion." + $$4.c();
            String $$6 = "selectWorld.backupWarning." + $$4.c();
            xl $$7 = wx.c($$5);
            if ($$4.b()) {
               $$7.b(-2142128);
            }

            wx $$8 = wx.a($$6, $$1.k(), aa.b().c());
            this.c.a(new fkm(() -> {
               $$0.c();
               $$3.run();
            }, ($$3x, $$4x) -> {
               if ($$3x) {
                  fqq.a($$0);
               }

               this.a($$0, $$2, false, $$3);
            }, $$7, $$8, false));
         } else {
            this.a($$0, $$2, false, $$3);
         }
      }
   }

   private void a(eox.c $$0, Dynamic<?> $$1, boolean $$2, Runnable $$3) {
      this.c.d(new flf(wx.c("selectWorld.resource_load")));
      ati $$4 = atl.a($$0);

      alk $$5;
      try {
         $$5 = this.a($$1, $$2, $$4);
      } catch (Exception var8) {
         a.warn("Failed to load level data or datapacks, can't proceed with server load", var8);
         if (!$$2) {
            this.c.a(new fkw(() -> {
               $$0.c();
               $$3.run();
            }, () -> this.a($$0, $$1, true, $$3)));
         } else {
            $$0.c();
            this.c.a(new fkl($$3, wx.c("datapackFailure.safeMode.failed.title"), wx.c("datapackFailure.safeMode.failed.description"), ww.k, true));
         }

         return;
      }

      this.a($$0, $$5, $$4, $$3);
   }

   private void a(eox.c $$0, alk $$1, ati $$2, Runnable $$3) {
      epd $$4 = $$1.d();
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

   private void b(eox.c $$0, alk $$1, ati $$2, Runnable $$3) {
      gql $$4 = this.c.ae();
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

   private void a(eox.c $$0, alk $$1, gql $$2, ati $$3, Runnable $$4) {
      if ($$0.b()) {
         this.c.a(new fkr($$5 -> {
            if ($$5) {
               this.a($$0, $$1, $$3);
            } else {
               $$2.e();
               $$1.close();
               $$0.c();
               $$4.run();
            }
         }, wx.c("selectWorld.warning.lowDiskSpace.title").a(n.m), wx.c("selectWorld.warning.lowDiskSpace.description"), ww.j, ww.k));
      } else {
         this.a($$0, $$1, $$3);
      }
   }

   private void a(eox.c $$0, alk $$1, ati $$2) {
      this.c.a($$0, $$2, $$1, false);
   }

   private CompletableFuture<Void> a(gql $$0, eox.c $$1) {
      Path $$2 = $$1.a(eov.k);
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
      this.c.a(new fkr($$0::complete, wx.c("multiplayer.texturePrompt.failure.line1"), wx.c("multiplayer.texturePrompt.failure.line2"), ww.i, ww.e));
      return $$0;
   }
}
