import com.mojang.authlib.minecraft.BanDetails;
import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class fry extends frw {
   private static final Logger a = LogUtils.getLogger();
   private static final xj b = xj.c("narrator.screen.title");
   private static final xj c = xj.c("title.credits");
   private static final String d = "Demo_World";
   private static final float s = 2000.0F;
   @Nullable
   private fnh u;
   private fmd v;
   @Nullable
   private fhy w;
   private float x = 1.0F;
   private boolean y;
   private long z;
   private final fmu A;

   public fry() {
      this(false);
   }

   public fry(boolean $$0) {
      this($$0, null);
   }

   public fry(boolean $$0, @Nullable fmu $$1) {
      super(b);
      this.y = $$0;
      this.A = Objects.requireNonNullElseGet($$1, () -> new fmu(false));
   }

   private boolean m() {
      return this.w != null;
   }

   @Override
   public void e() {
      if (this.m()) {
         this.w.e();
      }
   }

   public static CompletableFuture<Void> a(gzf $$0, Executor $$1) {
      return CompletableFuture.allOf($$0.a(fmu.a, $$1), $$0.a(fmu.c, $$1), $$0.a(gjj.a, $$1), e.a($$0, $$1));
   }

   @Override
   public boolean k() {
      return false;
   }

   @Override
   public boolean aG_() {
      return false;
   }

   @Override
   protected void aR_() {
      if (this.u == null) {
         this.u = this.m.aL().a();
      }

      int $$0 = this.p.a(c);
      int $$1 = this.n - $$0 - 2;
      int $$2 = 24;
      int $$3 = this.o / 4 + 48;
      if (this.m.K()) {
         $$3 = this.c($$3, 24);
      } else {
         $$3 = this.b($$3, 24);
      }

      $$3 = this.a($$3, 24);
      fni $$4 = this.c(fmh.a(20, $$0x -> this.m.a(new fuw(this, this.m.n, this.m.ah())), true));
      int var10001 = this.n / 2 - 124;
      $$3 += 36;
      $$4.c(var10001, $$3);
      this.c(fmd.a(xj.c("menu.options"), $$0x -> this.m.a(new fuz(this, this.m.n))).a(this.n / 2 - 100, $$3, 98, 20).a());
      this.c(fmd.a(xj.c("menu.quit"), $$0x -> this.m.q()).a(this.n / 2 + 2, $$3, 98, 20).a());
      fni $$5 = this.c(fmh.b(20, $$0x -> this.m.a(new fut(this, this.m.n)), true));
      $$5.c(this.n / 2 + 104, $$3);
      this.c(new fnb($$1, this.o - 10, $$0, 10, c, $$0x -> this.m.a(new fqy(this)), this.p));
      if (this.w == null) {
         this.w = new fhy();
      }

      if (this.m()) {
         this.w.b(this.m, this.n, this.o);
      }
   }

   private int a(int $$0, int $$1) {
      if (ab.aU) {
         this.c(fmd.a(xj.b("Create Test World"), $$0x -> fwv.b(this.m, this)).a(this.n / 2 - 100, $$0 += $$1, 200, 20).a());
      }

      return $$0;
   }

   private int b(int $$0, int $$1) {
      this.c(fmd.a(xj.c("menu.singleplayer"), $$0x -> this.m.a(new fxd(this))).a(this.n / 2 - 100, $$0, 200, 20).a());
      xj $$2 = this.F();
      boolean $$3 = $$2 == null;
      fno $$4 = $$2 != null ? fno.a($$2) : null;
      int var6;
      this.c(fmd.a(xj.c("menu.multiplayer"), $$0x -> {
         frw $$1x = (frw)(this.m.n.u ? new fum(this) : new fun(this));
         this.m.a($$1x);
      }).a(this.n / 2 - 100, var6 = $$0 + $$1, 200, 20).a($$4).a()).j = $$3;
      this.c(fmd.a(xj.c("menu.online"), $$0x -> this.m.a(new ffc(this))).a(this.n / 2 - 100, $$0 = var6 + $$1, 200, 20).a($$4).a()).j = $$3;
      return $$0;
   }

   @Nullable
   private xj F() {
      if (this.m.F()) {
         return null;
      } else if (this.m.I()) {
         return xj.c("title.multiplayer.disabled.banned.name");
      } else {
         BanDetails $$0 = this.m.H();
         if ($$0 != null) {
            return $$0.expires() != null ? xj.c("title.multiplayer.disabled.banned.temporary") : xj.c("title.multiplayer.disabled.banned.permanent");
         } else {
            return xj.c("title.multiplayer.disabled");
         }
      }
   }

   private int c(int $$0, int $$1) {
      boolean $$2 = this.G();
      this.c(fmd.a(xj.c("menu.playdemo"), $$1x -> {
         if ($$2) {
            this.m.x().a("Demo_World", () -> this.m.a(this));
         } else {
            this.m.x().a("Demo_World", MinecraftServer.d, eco.b, ely::a, this);
         }
      }).a(this.n / 2 - 100, $$0, 200, 20).a());
      int var4;
      this.v = this.c(
         fmd.a(
               xj.c("menu.resetdemo"),
               $$0x -> {
                  eub $$1x = this.m.m();

                  try (eub.c $$2x = $$1x.e("Demo_World")) {
                     if ($$2x.m()) {
                        this.m
                           .a(
                              new fqu(
                                 this::c,
                                 xj.c("selectWorld.deleteQuestion"),
                                 xj.a("selectWorld.deleteWarning", MinecraftServer.d.a()),
                                 xj.c("selectWorld.deleteButton"),
                                 xi.e
                              )
                           );
                     }
                  } catch (IOException var8) {
                     fom.a(this.m, "Demo_World");
                     a.warn("Failed to access demo world", var8);
                  }
               }
            )
            .a(this.n / 2 - 100, var4 = $$0 + $$1, 200, 20)
            .a()
      );
      this.v.j = $$2;
      return var4;
   }

   private boolean G() {
      try {
         boolean var2;
         try (eub.c $$0 = this.m.m().e("Demo_World")) {
            var2 = $$0.m();
         }

         return var2;
      } catch (IOException var6) {
         fom.a(this.m, "Demo_World");
         a.warn("Failed to read demo world data", var6);
         return false;
      }
   }

   @Override
   public void a(flq $$0, int $$1, int $$2, float $$3) {
      if (this.z == 0L && this.y) {
         this.z = ae.c();
      }

      float $$4 = 1.0F;
      if (this.y) {
         float $$5 = (float)(ae.c() - this.z) / 2000.0F;
         if ($$5 > 1.0F) {
            this.y = false;
            this.x = 1.0F;
         } else {
            $$5 = azm.a($$5, 0.0F, 1.0F);
            $$4 = azm.b($$5, 0.5F, 1.0F, 0.0F, 1.0F);
            this.x = azm.b($$5, 0.0F, 0.5F, 0.0F, 1.0F);
         }

         this.a($$4);
      }

      this.a($$0, $$3);
      int $$6 = azm.f($$4 * 255.0F) << 24;
      if (($$6 & -67108864) != 0) {
         super.a($$0, $$1, $$2, $$3);
         this.A.a($$0, this.n, $$4);
         if (this.u != null && !this.m.n.c().c()) {
            this.u.a($$0, this.n, this.p, $$6);
         }

         String $$7 = "Minecraft " + ab.b().c();
         if (this.m.K()) {
            $$7 = $$7 + " Demo";
         } else {
            $$7 = $$7 + ("release".equalsIgnoreCase(this.m.j()) ? "" : "/" + this.m.j());
         }

         if (fke.e().a()) {
            $$7 = $$7 + hal.a("menu.modded");
         }

         $$0.b(this.p, $$7, 2, this.o - 10, 16777215 | $$6);
         if (this.m() && $$4 >= 1.0F) {
            this.w.a($$0, $$1, $$2, $$3);
         }
      }
   }

   private void a(float $$0) {
      for (foa $$1 : this.aH_()) {
         if ($$1 instanceof fmb $$2) {
            $$2.a($$0);
         }
      }
   }

   @Override
   public void b(flq $$0, int $$1, int $$2, float $$3) {
   }

   @Override
   protected void a(flq $$0, float $$1) {
      f.a($$0, this.n, this.o, this.x, $$1);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      return super.a($$0, $$1, $$2) ? true : this.m() && this.w.a($$0, $$1, $$2);
   }

   @Override
   public void j() {
      if (this.w != null) {
         this.w.j();
      }
   }

   @Override
   public void aI_() {
      super.aI_();
      if (this.w != null) {
         this.w.aI_();
      }
   }

   private void c(boolean $$0) {
      if ($$0) {
         try (eub.c $$1 = this.m.m().e("Demo_World")) {
            $$1.k();
         } catch (IOException var7) {
            fom.b(this.m, "Demo_World");
            a.warn("Failed to delete demo world", var7);
         }
      }

      this.m.a(this);
   }
}
