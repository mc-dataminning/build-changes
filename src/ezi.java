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

public class ezi extends ezd {
   private static final Logger c = LogUtils.getLogger();
   private static final String k = "Demo_World";
   public static final ui a = ui.c("title.credits");
   public static final foo b = new foo(new afw("textures/gui/title/background/panorama"));
   private static final afw l = new afw("textures/gui/title/background/panorama_overlay.png");
   @Nullable
   private eun m;
   private etj n;
   @Nullable
   private epg o;
   private final fpd p = new fpd(b);
   private final boolean q;
   private long s;
   @Nullable
   private ezi.a t;
   private final eua u;

   public ezi() {
      this(false);
   }

   public ezi(boolean $$0) {
      this($$0, null);
   }

   public ezi(boolean $$0, @Nullable eua $$1) {
      super(ui.c("narrator.screen.title"));
      this.q = $$0;
      this.u = Objects.requireNonNullElseGet($$1, () -> new eua(false));
   }

   private boolean l() {
      return this.o != null;
   }

   @Override
   public void d() {
      if (this.l()) {
         this.o.d();
      }

      this.f.aS().a(this);
   }

   public static CompletableFuture<Void> a(gab $$0, Executor $$1) {
      return CompletableFuture.allOf($$0.a(eua.a, $$1), $$0.a(eua.c, $$1), $$0.a(l, $$1), b.a($$0, $$1));
   }

   @Override
   public boolean j() {
      return false;
   }

   @Override
   public boolean aB_() {
      return false;
   }

   @Override
   protected void aM_() {
      if (this.m == null) {
         this.m = this.f.aI().a();
      }

      int $$0 = this.i.a(a);
      int $$1 = this.g - $$0 - 2;
      int $$2 = 24;
      int $$3 = this.h / 4 + 48;
      if (this.f.I()) {
         this.b($$3, 24);
      } else {
         this.a($$3, 24);
      }

      euo $$4 = this.d(etn.a(20, $$0x -> this.f.a(new eyn(this, this.f.m, this.f.ae())), true));
      $$4.b(this.g / 2 - 124, $$3 + 72 + 12);
      this.d(etj.a(ui.c("menu.options"), $$0x -> this.f.a(new eyv(this, this.f.m))).a(this.g / 2 - 100, $$3 + 72 + 12, 98, 20).a());
      this.d(etj.a(ui.c("menu.quit"), $$0x -> this.f.q()).a(this.g / 2 + 2, $$3 + 72 + 12, 98, 20).a());
      euo $$5 = this.d(etn.b(20, $$0x -> this.f.a(new exq(this, this.f.m)), true));
      $$5.b(this.g / 2 + 104, $$3 + 72 + 12);
      this.d(new euh($$1, this.h - 10, $$0, 10, a, $$0x -> this.f.a(new eyb(this)), this.i));
      if (this.o == null) {
         this.o = new epg();
      }

      if (this.l()) {
         this.o.b(this.f, this.g, this.h);
      }

      if (!this.f.af()) {
         this.t = new ezi.a(this.i, euc.a(this.i, ui.c("title.32bit.deprecation"), 350, 2), this.g / 2, $$3 - 24);
      }
   }

   private void a(int $$0, int $$1) {
      this.d(etj.a(ui.c("menu.singleplayer"), $$0x -> this.f.a(new fdy(this))).a(this.g / 2 - 100, $$0, 200, 20).a());
      ui $$2 = this.C();
      boolean $$3 = $$2 == null;
      euu $$4 = $$2 != null ? euu.a($$2) : null;
      this.d(etj.a(ui.c("menu.multiplayer"), $$0x -> {
         ezd $$1x = (ezd)(this.f.m.v ? new fca(this) : new fcc(this));
         this.f.a($$1x);
      }).a(this.g / 2 - 100, $$0 + $$1 * 1, 200, 20).a($$4).a()).i = $$3;
      this.d(etj.a(ui.c("menu.online"), $$0x -> this.E()).a(this.g / 2 - 100, $$0 + $$1 * 2, 200, 20).a($$4).a()).i = $$3;
   }

   @Nullable
   private ui C() {
      if (this.f.D()) {
         return null;
      } else if (this.f.G()) {
         return ui.c("title.multiplayer.disabled.banned.name");
      } else {
         BanDetails $$0 = this.f.F();
         if ($$0 != null) {
            return $$0.expires() != null ? ui.c("title.multiplayer.disabled.banned.temporary") : ui.c("title.multiplayer.disabled.banned.permanent");
         } else {
            return ui.c("title.multiplayer.disabled");
         }
      }
   }

   private void b(int $$0, int $$1) {
      boolean $$2 = this.D();
      this.d(etj.a(ui.c("menu.playdemo"), $$1x -> {
         if ($$2) {
            this.f.y().a(this, "Demo_World");
         } else {
            this.f.y().a("Demo_World", MinecraftServer.f, dmi.b, dvq::a);
         }
      }).a(this.g / 2 - 100, $$0, 200, 20).a());
      this.n = this.d(
         etj.a(
               ui.c("menu.resetdemo"),
               $$0x -> {
                  ecy $$1x = this.f.l();

                  try (ecy.c $$2x = $$1x.e("Demo_World")) {
                     ecz $$3 = $$2x.d();
                     if ($$3 != null) {
                        this.f
                           .a(
                              new exx(
                                 this::c,
                                 ui.c("selectWorld.deleteQuestion"),
                                 ui.a("selectWorld.deleteWarning", $$3.b()),
                                 ui.c("selectWorld.deleteButton"),
                                 uh.e
                              )
                           );
                     }
                  } catch (IOException var8) {
                     evq.a(this.f, "Demo_World");
                     c.warn("Failed to access demo world", var8);
                  }
               }
            )
            .a(this.g / 2 - 100, $$0 + $$1 * 1, 200, 20)
            .a()
      );
      this.n.i = $$2;
   }

   private boolean D() {
      try {
         boolean var2;
         try (ecy.c $$0 = this.f.l().e("Demo_World")) {
            var2 = $$0.d() != null;
         }

         return var2;
      } catch (IOException var6) {
         evq.a(this.f, "Demo_World");
         c.warn("Failed to read demo world data", var6);
         return false;
      }
   }

   private void E() {
      this.f.a(new ems(this));
   }

   @Override
   public void a(esy $$0, int $$1, int $$2, float $$3) {
      if (this.s == 0L && this.q) {
         this.s = ac.b();
      }

      float $$4 = this.q ? (float)(ac.b() - this.s) / 1000.0F : 1.0F;
      this.p.a($$3, asy.a($$4, 0.0F, 1.0F));
      RenderSystem.enableBlend();
      $$0.a(1.0F, 1.0F, 1.0F, this.q ? (float)asy.f(asy.a($$4, 0.0F, 1.0F)) : 1.0F);
      $$0.a(l, 0, 0, this.g, this.h, 0.0F, 0.0F, 16, 128, 16, 128);
      $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
      float $$5 = this.q ? asy.a($$4 - 1.0F, 0.0F, 1.0F) : 1.0F;
      this.u.a($$0, this.g, $$5);
      int $$6 = asy.f($$5 * 255.0F) << 24;
      if (($$6 & -67108864) != 0) {
         if (this.t != null) {
            this.t.a($$0, $$6);
         }

         if (this.m != null) {
            this.m.a($$0, this.g, this.i, $$6);
         }

         String $$7 = "Minecraft " + aa.b().c();
         if (this.f.I()) {
            $$7 = $$7 + " Demo";
         } else {
            $$7 = $$7 + ("release".equalsIgnoreCase(this.f.i()) ? "" : "/" + this.f.i());
         }

         if (ero.e().a()) {
            $$7 = $$7 + gbg.a("menu.modded");
         }

         $$0.b(this.i, $$7, 2, this.h - 10, 16777215 | $$6);

         for (eve $$8 : this.i()) {
            if ($$8 instanceof eth) {
               ((eth)$$8).a($$5);
            }
         }

         super.a($$0, $$1, $$2, $$3);
         if (this.l() && $$5 >= 1.0F) {
            RenderSystem.enableDepthTest();
            this.o.a($$0, $$1, $$2, $$3);
         }
      }
   }

   @Override
   public void b(esy $$0, int $$1, int $$2, float $$3) {
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      return super.a($$0, $$1, $$2) ? true : this.l() && this.o.a($$0, $$1, $$2);
   }

   @Override
   public void aD_() {
      if (this.o != null) {
         this.o.aD_();
      }
   }

   @Override
   public void aE_() {
      super.aE_();
      if (this.o != null) {
         this.o.aE_();
      }
   }

   private void c(boolean $$0) {
      if ($$0) {
         try (ecy.c $$1 = this.f.l().e("Demo_World")) {
            $$1.g();
         } catch (IOException var7) {
            evq.b(this.f, "Demo_World");
            c.warn("Failed to delete demo world", var7);
         }
      }

      this.f.a(this);
   }

   static record a(esw a, euc b, int c, int d) {
      public void a(esy $$0, int $$1) {
         this.b.a($$0, this.c, this.d, 9, 2, 2097152 | Math.min($$1, 1426063360));
         this.b.a($$0, this.c, this.d, 9, 16777215 | $$1);
      }
   }
}
