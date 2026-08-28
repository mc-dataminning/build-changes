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

public class fnl extends fnj {
   private static final Logger a = LogUtils.getLogger();
   private static final wu b = wu.c("narrator.screen.title");
   private static final wu c = wu.c("title.credits");
   private static final String q = "Demo_World";
   private static final float r = 2000.0F;
   @Nullable
   private fiw s;
   private fhs u;
   @Nullable
   private fdl v;
   private float w = 1.0F;
   private boolean x;
   private long y;
   @Nullable
   private fnl.a z;
   private final fij A;

   public fnl() {
      this(false);
   }

   public fnl(boolean $$0) {
      this($$0, null);
   }

   public fnl(boolean $$0, @Nullable fij $$1) {
      super(b);
      this.x = $$0;
      this.A = Objects.requireNonNullElseGet($$1, () -> new fij(false));
   }

   private boolean m() {
      return this.v != null;
   }

   @Override
   public void e() {
      if (this.m()) {
         this.v.e();
      }
   }

   public static CompletableFuture<Void> a(gpp $$0, Executor $$1) {
      return CompletableFuture.allOf($$0.a(fij.a, $$1), $$0.a(fij.c, $$1), $$0.a(gef.a, $$1), d.a($$0, $$1));
   }

   @Override
   public boolean k() {
      return false;
   }

   @Override
   public boolean aF_() {
      return false;
   }

   @Override
   protected void aP_() {
      if (this.s == null) {
         this.s = this.l.aK().a();
      }

      int $$0 = this.o.a(c);
      int $$1 = this.m - $$0 - 2;
      int $$2 = 24;
      int $$3 = this.n / 4 + 48;
      if (this.l.K()) {
         this.b($$3, 24);
      } else {
         this.a($$3, 24);
      }

      fix $$4 = this.c(fhw.a(20, $$0x -> this.l.a(new fqh(this, this.l.m, this.l.ag())), true));
      $$4.c(this.m / 2 - 124, $$3 + 72 + 12);
      this.c(fhs.a(wu.c("menu.options"), $$0x -> this.l.a(new fqk(this, this.l.m))).a(this.m / 2 - 100, $$3 + 72 + 12, 98, 20).a());
      this.c(fhs.a(wu.c("menu.quit"), $$0x -> this.l.q()).a(this.m / 2 + 2, $$3 + 72 + 12, 98, 20).a());
      fix $$5 = this.c(fhw.b(20, $$0x -> this.l.a(new fqe(this, this.l.m)), true));
      $$5.c(this.m / 2 + 104, $$3 + 72 + 12);
      this.c(new fiq($$1, this.n - 10, $$0, 10, c, $$0x -> this.l.a(new fml(this)), this.o));
      if (this.v == null) {
         this.v = new fdl();
      }

      if (this.m()) {
         this.v.b(this.l, this.m, this.n);
      }
   }

   private void a(int $$0, int $$1) {
      this.c(fhs.a(wu.c("menu.singleplayer"), $$0x -> this.l.a(new fsm(this))).a(this.m / 2 - 100, $$0, 200, 20).a());
      wu $$2 = this.E();
      boolean $$3 = $$2 == null;
      fjd $$4 = $$2 != null ? fjd.a($$2) : null;
      this.c(fhs.a(wu.c("menu.multiplayer"), $$0x -> {
         fnj $$1x = (fnj)(this.l.m.v ? new fpy(this) : new fpz(this));
         this.l.a($$1x);
      }).a(this.m / 2 - 100, $$0 + $$1 * 1, 200, 20).a($$4).a()).j = $$3;
      this.c(fhs.a(wu.c("menu.online"), $$0x -> this.l.a(new fax(this))).a(this.m / 2 - 100, $$0 + $$1 * 2, 200, 20).a($$4).a()).j = $$3;
   }

   @Nullable
   private wu E() {
      if (this.l.F()) {
         return null;
      } else if (this.l.I()) {
         return wu.c("title.multiplayer.disabled.banned.name");
      } else {
         BanDetails $$0 = this.l.H();
         if ($$0 != null) {
            return $$0.expires() != null ? wu.c("title.multiplayer.disabled.banned.temporary") : wu.c("title.multiplayer.disabled.banned.permanent");
         } else {
            return wu.c("title.multiplayer.disabled");
         }
      }
   }

   private void b(int $$0, int $$1) {
      boolean $$2 = this.F();
      this.c(fhs.a(wu.c("menu.playdemo"), $$1x -> {
         if ($$2) {
            this.l.x().a("Demo_World", () -> this.l.a(this));
         } else {
            this.l.x().a("Demo_World", MinecraftServer.d, dzd.b, eim::a, this);
         }
      }).a(this.m / 2 - 100, $$0, 200, 20).a());
      this.u = this.c(
         fhs.a(
               wu.c("menu.resetdemo"),
               $$0x -> {
                  eqi $$1x = this.l.m();

                  try (eqi.c $$2x = $$1x.e("Demo_World")) {
                     if ($$2x.m()) {
                        this.l
                           .a(
                              new fmh(
                                 this::c,
                                 wu.c("selectWorld.deleteQuestion"),
                                 wu.a("selectWorld.deleteWarning", MinecraftServer.d.a()),
                                 wu.c("selectWorld.deleteButton"),
                                 wt.e
                              )
                           );
                     }
                  } catch (IOException var8) {
                     fka.a(this.l, "Demo_World");
                     a.warn("Failed to access demo world", var8);
                  }
               }
            )
            .a(this.m / 2 - 100, $$0 + $$1 * 1, 200, 20)
            .a()
      );
      this.u.j = $$2;
   }

   private boolean F() {
      try {
         boolean var2;
         try (eqi.c $$0 = this.l.m().e("Demo_World")) {
            var2 = $$0.m();
         }

         return var2;
      } catch (IOException var6) {
         fka.a(this.l, "Demo_World");
         a.warn("Failed to read demo world data", var6);
         return false;
      }
   }

   @Override
   public void a(fhf $$0, int $$1, int $$2, float $$3) {
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
            $$5 = ayg.a($$5, 0.0F, 1.0F);
            $$4 = ayg.b($$5, 0.5F, 1.0F, 0.0F, 1.0F);
            this.w = ayg.b($$5, 0.0F, 0.5F, 0.0F, 1.0F);
         }

         this.b($$4);
      }

      this.a($$0, $$3);
      int $$6 = ayg.f($$4 * 255.0F) << 24;
      if (($$6 & -67108864) != 0) {
         super.a($$0, $$1, $$2, $$3);
         this.A.a($$0, this.m, $$4);
         if (this.z != null) {
            this.z.a($$0, $$6);
         }

         if (this.s != null && !this.l.m.c().c()) {
            this.s.a($$0, this.m, this.o, $$6);
         }

         String $$7 = "Minecraft " + aa.b().c();
         if (this.l.K()) {
            $$7 = $$7 + " Demo";
         } else {
            $$7 = $$7 + ("release".equalsIgnoreCase(this.l.j()) ? "" : "/" + this.l.j());
         }

         if (fft.e().a()) {
            $$7 = $$7 + gqu.a("menu.modded");
         }

         $$0.b(this.o, $$7, 2, this.n - 10, 16777215 | $$6);
         if (this.m() && $$4 >= 1.0F) {
            RenderSystem.enableDepthTest();
            this.v.a($$0, $$1, $$2, $$3);
         }
      }
   }

   private void b(float $$0) {
      for (fjo $$1 : this.aG_()) {
         if ($$1 instanceof fhq $$2) {
            $$2.a($$0);
         }
      }
   }

   @Override
   public void b(fhf $$0, int $$1, int $$2, float $$3) {
   }

   @Override
   protected void a(fhf $$0, float $$1) {
      e.a($$0, this.m, this.n, this.w, this.r());
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
   public void aH_() {
      super.aH_();
      if (this.v != null) {
         this.v.aH_();
      }
   }

   private void c(boolean $$0) {
      if ($$0) {
         try (eqi.c $$1 = this.l.m().e("Demo_World")) {
            $$1.k();
         } catch (IOException var7) {
            fka.b(this.l, "Demo_World");
            a.warn("Failed to delete demo world", var7);
         }
      }

      this.l.a(this);
   }

   static record a(fhd a, fil b, int c, int d) {
      public void a(fhf $$0, int $$1) {
         this.b.a($$0, this.c, this.d, 9, 2, 2097152 | Math.min($$1, 1426063360));
         this.b.a($$0, this.c, this.d, 9, 16777215 | $$1);
      }
   }
}
