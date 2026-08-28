import com.mojang.authlib.minecraft.BanDetails;
import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class fqf extends fqd {
   private static final Logger a = LogUtils.getLogger();
   private static final xd b = xd.c("narrator.screen.title");
   private static final xd c = xd.c("title.credits");
   private static final String d = "Demo_World";
   private static final float s = 2000.0F;
   @Nullable
   private flo u;
   private fkk v;
   @Nullable
   private fgb w;
   private float x = 1.0F;
   private boolean y;
   private long z;
   private final flb A;

   public fqf() {
      this(false);
   }

   public fqf(boolean $$0) {
      this($$0, null);
   }

   public fqf(boolean $$0, @Nullable flb $$1) {
      super(b);
      this.y = $$0;
      this.A = Objects.requireNonNullElseGet($$1, () -> new flb(false));
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

   public static CompletableFuture<Void> a(gxc $$0, Executor $$1) {
      return CompletableFuture.allOf($$0.a(flb.a, $$1), $$0.a(flb.c, $$1), $$0.a(ghj.a, $$1), e.a($$0, $$1));
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
         this.u = this.m.aM().a();
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

      flp $$4 = this.c(fko.a(20, $$0x -> this.m.a(new ftc(this, this.m.n, this.m.ah())), true));
      $$4.c(this.n / 2 - 124, $$3 + 72 + 12);
      this.c(fkk.a(xd.c("menu.options"), $$0x -> this.m.a(new ftf(this, this.m.n))).a(this.n / 2 - 100, $$3 + 72 + 12, 98, 20).a());
      this.c(fkk.a(xd.c("menu.quit"), $$0x -> this.m.q()).a(this.n / 2 + 2, $$3 + 72 + 12, 98, 20).a());
      flp $$5 = this.c(fko.b(20, $$0x -> this.m.a(new fsz(this, this.m.n)), true));
      $$5.c(this.n / 2 + 104, $$3 + 72 + 12);
      this.c(new fli($$1, this.o - 10, $$0, 10, c, $$0x -> this.m.a(new fpf(this)), this.p));
      if (this.w == null) {
         this.w = new fgb();
      }

      if (this.m()) {
         this.w.b(this.m, this.n, this.o);
      }
   }

   private void a(int $$0, int $$1) {
      this.c(fkk.a(xd.c("menu.singleplayer"), $$0x -> this.m.a(new fvg(this))).a(this.n / 2 - 100, $$0, 200, 20).a());
      xd $$2 = this.D();
      boolean $$3 = $$2 == null;
      flv $$4 = $$2 != null ? flv.a($$2) : null;
      this.c(fkk.a(xd.c("menu.multiplayer"), $$0x -> {
         fqd $$1x = (fqd)(this.m.n.u ? new fss(this) : new fst(this));
         this.m.a($$1x);
      }).a(this.n / 2 - 100, $$0 + $$1 * 1, 200, 20).a($$4).a()).j = $$3;
      this.c(fkk.a(xd.c("menu.online"), $$0x -> this.m.a(new fdp(this))).a(this.n / 2 - 100, $$0 + $$1 * 2, 200, 20).a($$4).a()).j = $$3;
   }

   @Nullable
   private xd D() {
      if (this.m.F()) {
         return null;
      } else if (this.m.I()) {
         return xd.c("title.multiplayer.disabled.banned.name");
      } else {
         BanDetails $$0 = this.m.H();
         if ($$0 != null) {
            return $$0.expires() != null ? xd.c("title.multiplayer.disabled.banned.temporary") : xd.c("title.multiplayer.disabled.banned.permanent");
         } else {
            return xd.c("title.multiplayer.disabled");
         }
      }
   }

   private void b(int $$0, int $$1) {
      boolean $$2 = this.E();
      this.c(fkk.a(xd.c("menu.playdemo"), $$1x -> {
         if ($$2) {
            this.m.x().a("Demo_World", () -> this.m.a(this));
         } else {
            this.m.x().a("Demo_World", MinecraftServer.d, ebi.b, eks::a, this);
         }
      }).a(this.n / 2 - 100, $$0, 200, 20).a());
      this.v = this.c(
         fkk.a(
               xd.c("menu.resetdemo"),
               $$0x -> {
                  esv $$1x = this.m.m();

                  try (esv.c $$2x = $$1x.e("Demo_World")) {
                     if ($$2x.m()) {
                        this.m
                           .a(
                              new fpb(
                                 this::c,
                                 xd.c("selectWorld.deleteQuestion"),
                                 xd.a("selectWorld.deleteWarning", MinecraftServer.d.a()),
                                 xd.c("selectWorld.deleteButton"),
                                 xc.e
                              )
                           );
                     }
                  } catch (IOException var8) {
                     fmt.a(this.m, "Demo_World");
                     a.warn("Failed to access demo world", var8);
                  }
               }
            )
            .a(this.n / 2 - 100, $$0 + $$1 * 1, 200, 20)
            .a()
      );
      this.v.j = $$2;
   }

   private boolean E() {
      try {
         boolean var2;
         try (esv.c $$0 = this.m.m().e("Demo_World")) {
            var2 = $$0.m();
         }

         return var2;
      } catch (IOException var6) {
         fmt.a(this.m, "Demo_World");
         a.warn("Failed to read demo world data", var6);
         return false;
      }
   }

   @Override
   public void a(fjx $$0, int $$1, int $$2, float $$3) {
      if (this.z == 0L && this.y) {
         this.z = ad.c();
      }

      float $$4 = 1.0F;
      if (this.y) {
         float $$5 = (float)(ad.c() - this.z) / 2000.0F;
         if ($$5 > 1.0F) {
            this.y = false;
            this.x = 1.0F;
         } else {
            $$5 = azd.a($$5, 0.0F, 1.0F);
            $$4 = azd.b($$5, 0.5F, 1.0F, 0.0F, 1.0F);
            this.x = azd.b($$5, 0.0F, 0.5F, 0.0F, 1.0F);
         }

         this.a($$4);
      }

      this.a($$0, $$3);
      int $$6 = azd.f($$4 * 255.0F) << 24;
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

         if (fil.e().a()) {
            $$7 = $$7 + gyi.a("menu.modded");
         }

         $$0.b(this.p, $$7, 2, this.o - 10, 16777215 | $$6);
         if (this.m() && $$4 >= 1.0F) {
            this.w.a($$0, $$1, $$2, $$3);
         }
      }
   }

   private void a(float $$0) {
      for (fmh $$1 : this.aI_()) {
         if ($$1 instanceof fki $$2) {
            $$2.a($$0);
         }
      }
   }

   @Override
   public void b(fjx $$0, int $$1, int $$2, float $$3) {
   }

   @Override
   protected void a(fjx $$0, float $$1) {
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
         try (esv.c $$1 = this.m.m().e("Demo_World")) {
            $$1.k();
         } catch (IOException var7) {
            fmt.b(this.m, "Demo_World");
            a.warn("Failed to delete demo world", var7);
         }
      }

      this.m.a(this);
   }
}
