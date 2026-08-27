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

public class fgm extends fgh {
   private static final Logger c = LogUtils.getLogger();
   private static final vs k = vs.c("narrator.screen.title");
   public static final vs a = vs.c("title.credits");
   public static final fwe b = new fwe(new ajc("textures/gui/title/background/panorama"));
   private static final ajc l = new ajc("textures/gui/title/background/panorama_overlay.png");
   private static final String m = "Demo_World";
   @Nullable
   private fbo n;
   private fak o;
   @Nullable
   private ewc p;
   private final fws q = new fws(b);
   private final boolean r;
   private long t;
   @Nullable
   private fgm.a u;
   private final fbb v;

   public fgm() {
      this(false);
   }

   public fgm(boolean $$0) {
      this($$0, null);
   }

   public fgm(boolean $$0, @Nullable fbb $$1) {
      super(k);
      this.r = $$0;
      this.v = Objects.requireNonNullElseGet($$1, () -> new fbb(false));
   }

   private boolean o() {
      return this.p != null;
   }

   @Override
   public void e() {
      if (this.o()) {
         this.p.e();
      }

      this.f.aT().a(this);
   }

   public static CompletableFuture<Void> a(gia $$0, Executor $$1) {
      return CompletableFuture.allOf($$0.a(fbb.a, $$1), $$0.a(fbb.c, $$1), $$0.a(l, $$1), b.a($$0, $$1));
   }

   @Override
   public boolean m() {
      return false;
   }

   @Override
   public boolean aN_() {
      return false;
   }

   @Override
   protected void aP_() {
      if (this.n == null) {
         this.n = this.f.aJ().a();
      }

      int $$0 = this.i.a(a);
      int $$1 = this.g - $$0 - 2;
      int $$2 = 24;
      int $$3 = this.h / 4 + 48;
      if (this.f.J()) {
         this.b($$3, 24);
      } else {
         this.a($$3, 24);
      }

      fbp $$4 = this.c(fao.a(20, $$0x -> this.f.a(new ffq(this, this.f.m, this.f.af())), true));
      $$4.c(this.g / 2 - 124, $$3 + 72 + 12);
      this.c(fak.a(vs.c("menu.options"), $$0x -> this.f.a(new ffy(this, this.f.m))).a(this.g / 2 - 100, $$3 + 72 + 12, 98, 20).a());
      this.c(fak.a(vs.c("menu.quit"), $$0x -> this.f.p()).a(this.g / 2 + 2, $$3 + 72 + 12, 98, 20).a());
      fbp $$5 = this.c(fao.b(20, $$0x -> this.f.a(new fet(this, this.f.m)), true));
      $$5.c(this.g / 2 + 104, $$3 + 72 + 12);
      this.c(new fbi($$1, this.h - 10, $$0, 10, a, $$0x -> this.f.a(new ffe(this)), this.i));
      if (this.p == null) {
         this.p = new ewc();
      }

      if (this.o()) {
         this.p.b(this.f, this.g, this.h);
      }

      if (!this.f.ag()) {
         this.u = new fgm.a(this.i, fbd.a(this.i, vs.c("title.32bit.deprecation"), 350, 2), this.g / 2, $$3 - 24);
      }
   }

   private void a(int $$0, int $$1) {
      this.c(fak.a(vs.c("menu.singleplayer"), $$0x -> this.f.a(new fld(this))).a(this.g / 2 - 100, $$0, 200, 20).a());
      vs $$2 = this.E();
      boolean $$3 = $$2 == null;
      fbv $$4 = $$2 != null ? fbv.a($$2) : null;
      this.c(fak.a(vs.c("menu.multiplayer"), $$0x -> {
         fgh $$1x = (fgh)(this.f.m.v ? new fjf(this) : new fjh(this));
         this.f.a($$1x);
      }).a(this.g / 2 - 100, $$0 + $$1 * 1, 200, 20).a($$4).a()).j = $$3;
      this.c(fak.a(vs.c("menu.online"), $$0x -> this.f.a(new eto(this))).a(this.g / 2 - 100, $$0 + $$1 * 2, 200, 20).a($$4).a()).j = $$3;
   }

   @Nullable
   private vs E() {
      if (this.f.E()) {
         return null;
      } else if (this.f.H()) {
         return vs.c("title.multiplayer.disabled.banned.name");
      } else {
         BanDetails $$0 = this.f.G();
         if ($$0 != null) {
            return $$0.expires() != null ? vs.c("title.multiplayer.disabled.banned.temporary") : vs.c("title.multiplayer.disabled.banned.permanent");
         } else {
            return vs.c("title.multiplayer.disabled");
         }
      }
   }

   private void b(int $$0, int $$1) {
      boolean $$2 = this.H();
      this.c(fak.a(vs.c("menu.playdemo"), $$1x -> {
         if ($$2) {
            this.f.w().a("Demo_World", () -> this.f.a(this));
         } else {
            this.f.w().a("Demo_World", MinecraftServer.d, dso.b, ebw::a, this);
         }
      }).a(this.g / 2 - 100, $$0, 200, 20).a());
      this.o = this.c(
         fak.a(
               vs.c("menu.resetdemo"),
               $$0x -> {
                  ejo $$1x = this.f.l();

                  try (ejo.c $$2x = $$1x.e("Demo_World")) {
                     if ($$2x.k()) {
                        this.f
                           .a(
                              new ffa(
                                 this::c,
                                 vs.c("selectWorld.deleteQuestion"),
                                 vs.a("selectWorld.deleteWarning", MinecraftServer.d.a()),
                                 vs.c("selectWorld.deleteButton"),
                                 vr.e
                              )
                           );
                     }
                  } catch (IOException var8) {
                     fcs.a(this.f, "Demo_World");
                     c.warn("Failed to access demo world", var8);
                  }
               }
            )
            .a(this.g / 2 - 100, $$0 + $$1 * 1, 200, 20)
            .a()
      );
      this.o.j = $$2;
   }

   private boolean H() {
      try {
         boolean var2;
         try (ejo.c $$0 = this.f.l().e("Demo_World")) {
            var2 = $$0.k();
         }

         return var2;
      } catch (IOException var6) {
         fcs.a(this.f, "Demo_World");
         c.warn("Failed to read demo world data", var6);
         return false;
      }
   }

   @Override
   public void a(ezx $$0, int $$1, int $$2, float $$3) {
      if (this.t == 0L && this.r) {
         this.t = ac.b();
      }

      float $$4 = this.r ? (float)(ac.b() - this.t) / 1000.0F : 1.0F;
      this.q.a($$3, awm.a($$4, 0.0F, 1.0F));
      RenderSystem.enableBlend();
      $$0.a(1.0F, 1.0F, 1.0F, this.r ? (float)awm.f(awm.a($$4, 0.0F, 1.0F)) : 1.0F);
      $$0.a(l, 0, 0, this.g, this.h, 0.0F, 0.0F, 16, 128, 16, 128);
      $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
      float $$5 = this.r ? awm.a($$4 - 1.0F, 0.0F, 1.0F) : 1.0F;
      this.v.a($$0, this.g, $$5);
      int $$6 = awm.f($$5 * 255.0F) << 24;
      if (($$6 & -67108864) != 0) {
         if (this.u != null) {
            this.u.a($$0, $$6);
         }

         if (this.n != null && !this.f.m.c().c()) {
            this.n.a($$0, this.g, this.i, $$6);
         }

         String $$7 = "Minecraft " + aa.b().c();
         if (this.f.J()) {
            $$7 = $$7 + " Demo";
         } else {
            $$7 = $$7 + ("release".equalsIgnoreCase(this.f.i()) ? "" : "/" + this.f.i());
         }

         if (eyk.e().a()) {
            $$7 = $$7 + gje.a("menu.modded");
         }

         $$0.b(this.i, $$7, 2, this.h - 10, 16777215 | $$6);

         for (fcg $$8 : this.l()) {
            if ($$8 instanceof fai) {
               ((fai)$$8).a($$5);
            }
         }

         super.a($$0, $$1, $$2, $$3);
         if (this.o() && $$5 >= 1.0F) {
            RenderSystem.enableDepthTest();
            this.p.a($$0, $$1, $$2, $$3);
         }
      }
   }

   @Override
   public void b(ezx $$0, int $$1, int $$2, float $$3) {
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      return super.a($$0, $$1, $$2) ? true : this.o() && this.p.a($$0, $$1, $$2);
   }

   @Override
   public void k() {
      if (this.p != null) {
         this.p.k();
      }
   }

   @Override
   public void aH_() {
      super.aH_();
      if (this.p != null) {
         this.p.aH_();
      }
   }

   private void c(boolean $$0) {
      if ($$0) {
         try (ejo.c $$1 = this.f.l().e("Demo_World")) {
            $$1.i();
         } catch (IOException var7) {
            fcs.b(this.f, "Demo_World");
            c.warn("Failed to delete demo world", var7);
         }
      }

      this.f.a(this);
   }

   static record a(ezv a, fbd b, int c, int d) {
      public void a(ezx $$0, int $$1) {
         this.b.a($$0, this.c, this.d, 9, 2, 2097152 | Math.min($$1, 1426063360));
         this.b.a($$0, this.c, this.d, 9, 16777215 | $$1);
      }
   }
}
