import com.mojang.authlib.minecraft.BanDetails;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class fmd extends fly {
   private static final Logger a = LogUtils.getLogger();
   private static final wx b = wx.c("narrator.screen.title");
   private static final wx c = wx.c("title.credits");
   private static final String d = "Demo_World";
   private static final float r = 2000.0F;
   @Nullable
   private fhd s;
   private ffz u;
   @Nullable
   private fbr v;
   private float w = 1.0F;
   private boolean x;
   private long y;
   @Nullable
   private fmd.a z;
   private final fgq A;

   public fmd() {
      this(false);
   }

   public fmd(boolean $$0) {
      this($$0, null);
   }

   public fmd(boolean $$0, @Nullable fgq $$1) {
      super(b);
      this.x = $$0;
      this.A = Objects.requireNonNullElseGet($$1, () -> new fgq(false));
   }

   private boolean m() {
      return this.v != null;
   }

   @Override
   public void e() {
      if (this.m()) {
         this.v.e();
      }

      this.m.aV().a(this);
   }

   public static CompletableFuture<Void> a(gnw $$0, Executor $$1) {
      return CompletableFuture.allOf($$0.a(fgq.a, $$1), $$0.a(fgq.c, $$1), $$0.a(gcm.a, $$1), e.a($$0, $$1));
   }

   @Override
   public boolean k() {
      return false;
   }

   @Override
   public boolean aD_() {
      return false;
   }

   @Override
   protected void aM_() {
      if (this.s == null) {
         this.s = this.m.aL().a();
      }

      int $$0 = this.p.a(c);
      int $$1 = this.n - $$0 - 2;
      int $$2 = 24;
      int $$3 = this.o / 4 + 48;
      if (this.m.K()) {
         this.b($$3, 24);
      } else {
         this.a($$3, 24);
      }

      fhe $$4 = this.c(fgd.a(20, $$0x -> this.m.a(new flh(this, this.m.m, this.m.ag())), true));
      $$4.c(this.n / 2 - 124, $$3 + 72 + 12);
      this.c(ffz.a(wx.c("menu.options"), $$0x -> this.m.a(new flp(this, this.m.m))).a(this.n / 2 - 100, $$3 + 72 + 12, 98, 20).a());
      this.c(ffz.a(wx.c("menu.quit"), $$0x -> this.m.q()).a(this.n / 2 + 2, $$3 + 72 + 12, 98, 20).a());
      fhe $$5 = this.c(fgd.b(20, $$0x -> this.m.a(new fkj(this, this.m.m)), true));
      $$5.c(this.n / 2 + 104, $$3 + 72 + 12);
      this.c(new fgx($$1, this.o - 10, $$0, 10, c, $$0x -> this.m.a(new fku(this)), this.p));
      if (this.v == null) {
         this.v = new fbr();
      }

      if (this.m()) {
         this.v.b(this.m, this.n, this.o);
      }

      if (!this.m.ah()) {
         this.z = new fmd.a(this.p, fgs.a(this.p, wx.c("title.32bit.deprecation"), 350, 2), this.n / 2, $$3 - 24);
      }
   }

   private void a(int $$0, int $$1) {
      this.c(ffz.a(wx.c("menu.singleplayer"), $$0x -> this.m.a(new fqu(this))).a(this.n / 2 - 100, $$0, 200, 20).a());
      wx $$2 = this.C();
      boolean $$3 = $$2 == null;
      fhk $$4 = $$2 != null ? fhk.a($$2) : null;
      this.c(ffz.a(wx.c("menu.multiplayer"), $$0x -> {
         fly $$1x = (fly)(this.m.m.v ? new fow(this) : new foy(this));
         this.m.a($$1x);
      }).a(this.n / 2 - 100, $$0 + $$1 * 1, 200, 20).a($$4).a()).j = $$3;
      this.c(ffz.a(wx.c("menu.online"), $$0x -> this.m.a(new ezd(this))).a(this.n / 2 - 100, $$0 + $$1 * 2, 200, 20).a($$4).a()).j = $$3;
   }

   @Nullable
   private wx C() {
      if (this.m.F()) {
         return null;
      } else if (this.m.I()) {
         return wx.c("title.multiplayer.disabled.banned.name");
      } else {
         BanDetails $$0 = this.m.H();
         if ($$0 != null) {
            return $$0.expires() != null ? wx.c("title.multiplayer.disabled.banned.temporary") : wx.c("title.multiplayer.disabled.banned.permanent");
         } else {
            return wx.c("title.multiplayer.disabled");
         }
      }
   }

   private void b(int $$0, int $$1) {
      boolean $$2 = this.D();
      this.c(ffz.a(wx.c("menu.playdemo"), $$1x -> {
         if ($$2) {
            this.m.x().a("Demo_World", () -> this.m.a(this));
         } else {
            this.m.x().a("Demo_World", MinecraftServer.d, dxr.b, egz::a, this);
         }
      }).a(this.n / 2 - 100, $$0, 200, 20).a());
      this.u = this.c(
         ffz.a(
               wx.c("menu.resetdemo"),
               $$0x -> {
                  eov $$1x = this.m.m();

                  try (eov.c $$2x = $$1x.e("Demo_World")) {
                     if ($$2x.m()) {
                        this.m
                           .a(
                              new fkq(
                                 this::c,
                                 wx.c("selectWorld.deleteQuestion"),
                                 wx.a("selectWorld.deleteWarning", MinecraftServer.d.a()),
                                 wx.c("selectWorld.deleteButton"),
                                 ww.e
                              )
                           );
                     }
                  } catch (IOException var8) {
                     fih.a(this.m, "Demo_World");
                     a.warn("Failed to access demo world", var8);
                  }
               }
            )
            .a(this.n / 2 - 100, $$0 + $$1 * 1, 200, 20)
            .a()
      );
      this.u.j = $$2;
   }

   private boolean D() {
      try {
         boolean var2;
         try (eov.c $$0 = this.m.m().e("Demo_World")) {
            var2 = $$0.m();
         }

         return var2;
      } catch (IOException var6) {
         fih.a(this.m, "Demo_World");
         a.warn("Failed to read demo world data", var6);
         return false;
      }
   }

   @Override
   public void a(ffm $$0, int $$1, int $$2, float $$3) {
      if (this.y == 0L && this.x) {
         this.y = ac.c();
      }

      float $$4 = 1.0F;
      if (this.x) {
         float $$5 = (float)(ac.c() - this.y) / 2000.0F;
         if ($$5 > 1.0F) {
            this.x = false;
            this.w = 1.0F;
         } else {
            $$5 = ayd.a($$5, 0.0F, 1.0F);
            $$4 = ayd.b($$5, 0.5F, 1.0F, 0.0F, 1.0F);
            this.w = ayd.b($$5, 0.0F, 0.5F, 0.0F, 1.0F);

            for (fhv $$6 : this.aE_()) {
               if ($$6 instanceof ffx $$7) {
                  $$7.a($$4);
               }
            }
         }
      }

      this.a($$0, $$3);
      int $$8 = ayd.f($$4 * 255.0F) << 24;
      if (($$8 & -67108864) != 0) {
         super.a($$0, $$1, $$2, $$3);
         this.A.a($$0, this.n, $$4);
         if (this.z != null) {
            this.z.a($$0, $$8);
         }

         if (this.s != null && !this.m.m.c().c()) {
            this.s.a($$0, this.n, this.p, $$8);
         }

         String $$9 = "Minecraft " + aa.b().c();
         if (this.m.K()) {
            $$9 = $$9 + " Demo";
         } else {
            $$9 = $$9 + ("release".equalsIgnoreCase(this.m.j()) ? "" : "/" + this.m.j());
         }

         if (fdz.e().a()) {
            $$9 = $$9 + gpb.a("menu.modded");
         }

         $$0.b(this.p, $$9, 2, this.o - 10, 16777215 | $$8);
         if (this.m() && $$4 >= 1.0F) {
            RenderSystem.enableDepthTest();
            this.v.a($$0, $$1, $$2, $$3);
         }
      }
   }

   @Override
   public void b(ffm $$0, int $$1, int $$2, float $$3) {
   }

   @Override
   protected void a(ffm $$0, float $$1) {
      f.a($$0, this.n, this.o, this.w, $$1);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      return super.a($$0, $$1, $$2) ? true : this.m() && this.v.a($$0, $$1, $$2);
   }

   @Override
   public void j() {
      if (this.v != null) {
         this.v.j();
      }
   }

   @Override
   public void aF_() {
      super.aF_();
      if (this.v != null) {
         this.v.aF_();
      }
   }

   private void c(boolean $$0) {
      if ($$0) {
         try (eov.c $$1 = this.m.m().e("Demo_World")) {
            $$1.k();
         } catch (IOException var7) {
            fih.b(this.m, "Demo_World");
            a.warn("Failed to delete demo world", var7);
         }
      }

      this.m.a(this);
   }

   static record a(ffk a, fgs b, int c, int d) {
      public void a(ffm $$0, int $$1) {
         this.b.a($$0, this.c, this.d, 9, 2, 2097152 | Math.min($$1, 1426063360));
         this.b.a($$0, this.c, this.d, 9, 16777215 | $$1);
      }
   }
}
