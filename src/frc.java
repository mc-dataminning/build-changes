import com.mojang.authlib.minecraft.BanDetails;
import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class frc extends fra {
   private static final Logger a = LogUtils.getLogger();
   private static final xi b = xi.c("narrator.screen.title");
   private static final xi c = xi.c("title.credits");
   private static final String d = "Demo_World";
   private static final float s = 2000.0F;
   @Nullable
   private fml u;
   private flh v;
   @Nullable
   private fgy w;
   private float x = 1.0F;
   private boolean y;
   private long z;
   private final fly A;

   public frc() {
      this(false);
   }

   public frc(boolean $$0) {
      this($$0, null);
   }

   public frc(boolean $$0, @Nullable fly $$1) {
      super(b);
      this.y = $$0;
      this.A = Objects.requireNonNullElseGet($$1, () -> new fly(false));
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

   public static CompletableFuture<Void> a(gye $$0, Executor $$1) {
      return CompletableFuture.allOf($$0.a(fly.a, $$1), $$0.a(fly.c, $$1), $$0.a(gik.a, $$1), e.a($$0, $$1));
   }

   @Override
   public boolean k() {
      return false;
   }

   @Override
   public boolean aH_() {
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
      fmm $$4 = this.c(fll.a(20, $$0x -> this.m.a(new ftz(this, this.m.n, this.m.ah())), true));
      int var10001 = this.n / 2 - 124;
      $$3 += 36;
      $$4.c(var10001, $$3);
      this.c(flh.a(xi.c("menu.options"), $$0x -> this.m.a(new fuc(this, this.m.n))).a(this.n / 2 - 100, $$3, 98, 20).a());
      this.c(flh.a(xi.c("menu.quit"), $$0x -> this.m.q()).a(this.n / 2 + 2, $$3, 98, 20).a());
      fmm $$5 = this.c(fll.b(20, $$0x -> this.m.a(new ftw(this, this.m.n)), true));
      $$5.c(this.n / 2 + 104, $$3);
      this.c(new fmf($$1, this.o - 10, $$0, 10, c, $$0x -> this.m.a(new fqc(this)), this.p));
      if (this.w == null) {
         this.w = new fgy();
      }

      if (this.m()) {
         this.w.b(this.m, this.n, this.o);
      }
   }

   private int a(int $$0, int $$1) {
      if (ab.aV) {
         this.c(flh.a(xi.b("Create Test World"), $$0x -> fvx.b(this.m, this)).a(this.n / 2 - 100, $$0 += $$1, 200, 20).a());
      }

      return $$0;
   }

   private int b(int $$0, int $$1) {
      this.c(flh.a(xi.c("menu.singleplayer"), $$0x -> this.m.a(new fwf(this))).a(this.n / 2 - 100, $$0, 200, 20).a());
      xi $$2 = this.D();
      boolean $$3 = $$2 == null;
      fms $$4 = $$2 != null ? fms.a($$2) : null;
      int var6;
      this.c(flh.a(xi.c("menu.multiplayer"), $$0x -> {
         fra $$1x = (fra)(this.m.n.u ? new ftp(this) : new ftq(this));
         this.m.a($$1x);
      }).a(this.n / 2 - 100, var6 = $$0 + $$1, 200, 20).a($$4).a()).j = $$3;
      this.c(flh.a(xi.c("menu.online"), $$0x -> this.m.a(new fem(this))).a(this.n / 2 - 100, $$0 = var6 + $$1, 200, 20).a($$4).a()).j = $$3;
      return $$0;
   }

   @Nullable
   private xi D() {
      if (this.m.F()) {
         return null;
      } else if (this.m.I()) {
         return xi.c("title.multiplayer.disabled.banned.name");
      } else {
         BanDetails $$0 = this.m.H();
         if ($$0 != null) {
            return $$0.expires() != null ? xi.c("title.multiplayer.disabled.banned.temporary") : xi.c("title.multiplayer.disabled.banned.permanent");
         } else {
            return xi.c("title.multiplayer.disabled");
         }
      }
   }

   private int c(int $$0, int $$1) {
      boolean $$2 = this.E();
      this.c(flh.a(xi.c("menu.playdemo"), $$1x -> {
         if ($$2) {
            this.m.x().a("Demo_World", () -> this.m.a(this));
         } else {
            this.m.x().a("Demo_World", MinecraftServer.d, ecd.b, eln::a, this);
         }
      }).a(this.n / 2 - 100, $$0, 200, 20).a());
      int var4;
      this.v = this.c(
         flh.a(
               xi.c("menu.resetdemo"),
               $$0x -> {
                  etq $$1x = this.m.m();

                  try (etq.c $$2x = $$1x.e("Demo_World")) {
                     if ($$2x.m()) {
                        this.m
                           .a(
                              new fpy(
                                 this::c,
                                 xi.c("selectWorld.deleteQuestion"),
                                 xi.a("selectWorld.deleteWarning", MinecraftServer.d.a()),
                                 xi.c("selectWorld.deleteButton"),
                                 xh.e
                              )
                           );
                     }
                  } catch (IOException var8) {
                     fnq.a(this.m, "Demo_World");
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

   private boolean E() {
      try {
         boolean var2;
         try (etq.c $$0 = this.m.m().e("Demo_World")) {
            var2 = $$0.m();
         }

         return var2;
      } catch (IOException var6) {
         fnq.a(this.m, "Demo_World");
         a.warn("Failed to read demo world data", var6);
         return false;
      }
   }

   @Override
   public void a(fku $$0, int $$1, int $$2, float $$3) {
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
            $$5 = azk.a($$5, 0.0F, 1.0F);
            $$4 = azk.b($$5, 0.5F, 1.0F, 0.0F, 1.0F);
            this.x = azk.b($$5, 0.0F, 0.5F, 0.0F, 1.0F);
         }

         this.a($$4);
      }

      this.a($$0, $$3);
      int $$6 = azk.f($$4 * 255.0F) << 24;
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

         if (fji.e().a()) {
            $$7 = $$7 + gzk.a("menu.modded");
         }

         $$0.b(this.p, $$7, 2, this.o - 10, 16777215 | $$6);
         if (this.m() && $$4 >= 1.0F) {
            this.w.a($$0, $$1, $$2, $$3);
         }
      }
   }

   private void a(float $$0) {
      for (fne $$1 : this.aI_()) {
         if ($$1 instanceof flf $$2) {
            $$2.a($$0);
         }
      }
   }

   @Override
   public void b(fku $$0, int $$1, int $$2, float $$3) {
   }

   @Override
   protected void a(fku $$0, float $$1) {
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
   public void aJ_() {
      super.aJ_();
      if (this.w != null) {
         this.w.aJ_();
      }
   }

   private void c(boolean $$0) {
      if ($$0) {
         try (etq.c $$1 = this.m.m().e("Demo_World")) {
            $$1.k();
         } catch (IOException var7) {
            fnq.b(this.m, "Demo_World");
            a.warn("Failed to delete demo world", var7);
         }
      }

      this.m.a(this);
   }
}
