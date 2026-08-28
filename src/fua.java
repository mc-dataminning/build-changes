import com.mojang.authlib.minecraft.BanDetails;
import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class fua extends fty {
   private static final Logger a = LogUtils.getLogger();
   private static final xv b = xv.c("narrator.screen.title");
   private static final xv c = xv.c("title.credits");
   private static final String d = "Demo_World";
   private static final float s = 2000.0F;
   @Nullable
   private fpk u;
   private fof v;
   @Nullable
   private fka w;
   private float x = 1.0F;
   private boolean y;
   private long z;
   private final fox A;

   public fua() {
      this(false);
   }

   public fua(boolean $$0) {
      this($$0, null);
   }

   public fua(boolean $$0, @Nullable fox $$1) {
      super(b);
      this.y = $$0;
      this.A = Objects.requireNonNullElseGet($$1, () -> new fox(false));
   }

   private boolean l() {
      return this.w != null;
   }

   @Override
   public void e() {
      if (this.l()) {
         this.w.e();
      }
   }

   public static CompletableFuture<Void> a(hbm $$0, Executor $$1) {
      return CompletableFuture.allOf($$0.a(fox.a, $$1), $$0.a(fox.c, $$1), $$0.a(glo.a, $$1), e.a($$0, $$1));
   }

   @Override
   public boolean j() {
      return false;
   }

   @Override
   public boolean aH_() {
      return false;
   }

   @Override
   protected void aT_() {
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
      fpl $$4 = this.c(foj.a(20, $$0x -> this.m.a(new fwy(this, this.m.n, this.m.ah())), true));
      int var10001 = this.n / 2 - 124;
      $$3 += 36;
      $$4.c(var10001, $$3);
      this.c(fof.a(xv.c("menu.options"), $$0x -> this.m.a(new fxb(this, this.m.n))).a(this.n / 2 - 100, $$3, 98, 20).a());
      this.c(fof.a(xv.c("menu.quit"), $$0x -> this.m.q()).a(this.n / 2 + 2, $$3, 98, 20).a());
      fpl $$5 = this.c(foj.b(20, $$0x -> this.m.a(new fwv(this, this.m.n)), true));
      $$5.c(this.n / 2 + 104, $$3);
      this.c(new fpe($$1, this.o - 10, $$0, 10, c, $$0x -> this.m.a(new fta(this)), this.p));
      if (this.w == null) {
         this.w = new fka();
      }

      if (this.l()) {
         this.w.b(this.m, this.n, this.o);
      }
   }

   private int a(int $$0, int $$1) {
      if (ab.aU) {
         this.c(fof.a(xv.b("Create Test World"), $$0x -> fyx.b(this.m, this)).a(this.n / 2 - 100, $$0 += $$1, 200, 20).a());
      }

      return $$0;
   }

   private int b(int $$0, int $$1) {
      this.c(fof.a(xv.c("menu.singleplayer"), $$0x -> this.m.a(new fzf(this))).a(this.n / 2 - 100, $$0, 200, 20).a());
      xv $$2 = this.E();
      boolean $$3 = $$2 == null;
      fpr $$4 = $$2 != null ? fpr.a($$2) : null;
      int var6;
      this.c(fof.a(xv.c("menu.multiplayer"), $$0x -> {
         fty $$1x = (fty)(this.m.n.u ? new fwo(this) : new fwp(this));
         this.m.a($$1x);
      }).a(this.n / 2 - 100, var6 = $$0 + $$1, 200, 20).a($$4).a()).j = $$3;
      this.c(fof.a(xv.c("menu.online"), $$0x -> this.m.a(new fhd(this))).a(this.n / 2 - 100, $$0 = var6 + $$1, 200, 20).a($$4).a()).j = $$3;
      return $$0;
   }

   @Nullable
   private xv E() {
      if (this.m.F()) {
         return null;
      } else if (this.m.I()) {
         return xv.c("title.multiplayer.disabled.banned.name");
      } else {
         BanDetails $$0 = this.m.H();
         if ($$0 != null) {
            return $$0.expires() != null ? xv.c("title.multiplayer.disabled.banned.temporary") : xv.c("title.multiplayer.disabled.banned.permanent");
         } else {
            return xv.c("title.multiplayer.disabled");
         }
      }
   }

   private int c(int $$0, int $$1) {
      boolean $$2 = this.F();
      this.c(fof.a(xv.c("menu.playdemo"), $$1x -> {
         if ($$2) {
            this.m.x().a("Demo_World", () -> this.m.a(this));
         } else {
            this.m.x().a("Demo_World", MinecraftServer.d, eeo.b, eoa::a, this);
         }
      }).a(this.n / 2 - 100, $$0, 200, 20).a());
      int var4;
      this.v = this.c(
         fof.a(
               xv.c("menu.resetdemo"),
               $$0x -> {
                  ewd $$1x = this.m.m();

                  try (ewd.c $$2x = $$1x.e("Demo_World")) {
                     if ($$2x.m()) {
                        this.m
                           .a(
                              new fsw(
                                 this::c,
                                 xv.c("selectWorld.deleteQuestion"),
                                 xv.a("selectWorld.deleteWarning", MinecraftServer.d.a()),
                                 xv.c("selectWorld.deleteButton"),
                                 xu.e
                              )
                           );
                     }
                  } catch (IOException var8) {
                     fqp.a(this.m, "Demo_World");
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

   private boolean F() {
      try {
         boolean var2;
         try (ewd.c $$0 = this.m.m().e("Demo_World")) {
            var2 = $$0.m();
         }

         return var2;
      } catch (IOException var6) {
         fqp.a(this.m, "Demo_World");
         a.warn("Failed to read demo world data", var6);
         return false;
      }
   }

   @Override
   public void a(fns $$0, int $$1, int $$2, float $$3) {
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
            $$5 = bae.a($$5, 0.0F, 1.0F);
            $$4 = bae.b($$5, 0.5F, 1.0F, 0.0F, 1.0F);
            this.x = bae.b($$5, 0.0F, 0.5F, 0.0F, 1.0F);
         }

         this.a($$4);
      }

      this.a($$0, $$3);
      int $$6 = bae.f($$4 * 255.0F) << 24;
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

         if (fmg.e().a()) {
            $$7 = $$7 + hcs.a("menu.modded");
         }

         $$0.b(this.p, $$7, 2, this.o - 10, 16777215 | $$6);
         if (this.l() && $$4 >= 1.0F) {
            this.w.a($$0, $$1, $$2, $$3);
         }
      }
   }

   private void a(float $$0) {
      for (fqd $$1 : this.aI_()) {
         if ($$1 instanceof fod $$2) {
            $$2.a($$0);
         }
      }
   }

   @Override
   public void b(fns $$0, int $$1, int $$2, float $$3) {
   }

   @Override
   protected void a(fns $$0, float $$1) {
      f.a($$0, this.n, this.o, this.x, $$1);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      return super.a($$0, $$1, $$2) ? true : this.l() && this.w.a($$0, $$1, $$2);
   }

   @Override
   public void aJ_() {
      if (this.w != null) {
         this.w.aJ_();
      }
   }

   @Override
   public void aK_() {
      super.aK_();
      if (this.w != null) {
         this.w.aK_();
      }
   }

   private void c(boolean $$0) {
      if ($$0) {
         try (ewd.c $$1 = this.m.m().e("Demo_World")) {
            $$1.k();
         } catch (IOException var7) {
            fqp.b(this.m, "Demo_World");
            a.warn("Failed to delete demo world", var7);
         }
      }

      this.m.a(this);
   }
}
