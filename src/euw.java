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

public class euw extends euq {
   private static final Logger c = LogUtils.getLogger();
   private static final String k = "Demo_World";
   public static final sw a = sw.b("Copyright Mojang AB. Do not distribute!");
   public static final fjl b = new fjl(new acq("textures/gui/title/background/panorama"));
   private static final acq l = new acq("textures/gui/title/background/panorama_overlay.png");
   @Nullable
   private eqi m;
   private epi n;
   @Nullable
   private eli o;
   private final fjz p = new fjz(b);
   private final boolean q;
   private long r;
   @Nullable
   private euw.a s;
   private final epx t;

   public euw() {
      this(false);
   }

   public euw(boolean $$0) {
      this($$0, null);
   }

   public euw(boolean $$0, @Nullable epx $$1) {
      super(sw.c("narrator.screen.title"));
      this.q = $$0;
      this.t = Objects.requireNonNullElseGet($$1, () -> new epx(false));
   }

   private boolean l() {
      return this.o != null;
   }

   @Override
   public void f() {
      if (this.l()) {
         this.o.f();
      }

      this.f.aR().a(this);
   }

   public static CompletableFuture<Void> a(fuw $$0, Executor $$1) {
      return CompletableFuture.allOf($$0.a(epx.a, $$1), $$0.a(epx.c, $$1), $$0.a(l, $$1), b.a($$0, $$1));
   }

   @Override
   public boolean az_() {
      return false;
   }

   @Override
   public boolean av_() {
      return false;
   }

   @Override
   protected void b() {
      if (this.m == null) {
         this.m = this.f.aI().a();
      }

      int $$0 = this.i.a(a);
      int $$1 = this.g - $$0 - 2;
      int $$2 = 24;
      int $$3 = this.h / 4 + 48;
      if (this.f.H()) {
         this.b($$3, 24);
      } else {
         this.a($$3, 24);
      }

      this.d(
         new ept(
            this.g / 2 - 124,
            $$3 + 72 + 12,
            20,
            20,
            0,
            106,
            20,
            epi.m,
            256,
            256,
            $$0x -> this.f.a(new eua(this, this.f.m, this.f.ad())),
            sw.c("narrator.button.language")
         )
      );
      this.d(epi.a(sw.c("menu.options"), $$0x -> this.f.a(new euh(this, this.f.m))).a(this.g / 2 - 100, $$3 + 72 + 12, 98, 20).a());
      this.d(epi.a(sw.c("menu.quit"), $$0x -> this.f.p()).a(this.g / 2 + 2, $$3 + 72 + 12, 98, 20).a());
      this.d(
         new ept(
            this.g / 2 + 104, $$3 + 72 + 12, 20, 20, 0, 0, 20, epi.n, 32, 64, $$0x -> this.f.a(new etd(this, this.f.m)), sw.c("narrator.button.accessibility")
         )
      );
      this.d(new eqe($$1, this.h - 10, $$0, 10, a, $$0x -> this.f.a(new eto(this)), this.i));
      this.f.d(false);
      if (this.o == null) {
         this.o = new eli();
      }

      if (this.l()) {
         this.o.b(this.f, this.g, this.h);
      }

      if (!this.f.ae()) {
         this.s = new euw.a(this.i, epz.a(this.i, sw.c("title.32bit.deprecation"), 350, 2), this.g / 2, $$3 - 24);
      }
   }

   private void a(int $$0, int $$1) {
      this.d(epi.a(sw.c("menu.singleplayer"), $$0x -> this.f.a(new ezg(this))).a(this.g / 2 - 100, $$0, 200, 20).a());
      sw $$2 = this.B();
      boolean $$3 = $$2 == null;
      eqp $$4 = $$2 != null ? eqp.a($$2) : null;
      this.d(epi.a(sw.c("menu.multiplayer"), $$0x -> {
         euq $$1x = (euq)(this.f.m.v ? new exn(this) : new exp(this));
         this.f.a($$1x);
      }).a(this.g / 2 - 100, $$0 + $$1 * 1, 200, 20).a($$4).a()).r = $$3;
      this.d(epi.a(sw.c("menu.online"), $$0x -> this.D()).a(this.g / 2 - 100, $$0 + $$1 * 2, 200, 20).a($$4).a()).r = $$3;
   }

   @Nullable
   private sw B() {
      if (this.f.C()) {
         return null;
      } else {
         BanDetails $$0 = this.f.F();
         if ($$0 != null) {
            return $$0.expires() != null ? sw.c("title.multiplayer.disabled.banned.temporary") : sw.c("title.multiplayer.disabled.banned.permanent");
         } else {
            return sw.c("title.multiplayer.disabled");
         }
      }
   }

   private void b(int $$0, int $$1) {
      boolean $$2 = this.C();
      this.d(epi.a(sw.c("menu.playdemo"), $$1x -> {
         if ($$2) {
            this.f.w().a(this, "Demo_World");
         } else {
            this.f.w().a("Demo_World", MinecraftServer.f, dii.b, drq::a);
         }
      }).a(this.g / 2 - 100, $$0, 200, 20).a());
      this.n = this.d(
         epi.a(
               sw.c("menu.resetdemo"),
               $$0x -> {
                  dyy $$1x = this.f.k();

                  try (dyy.c $$2x = $$1x.d("Demo_World")) {
                     dyz $$3 = $$2x.c();
                     if ($$3 != null) {
                        this.f
                           .a(
                              new etk(
                                 this::c,
                                 sw.c("selectWorld.deleteQuestion"),
                                 sw.a("selectWorld.deleteWarning", $$3.b()),
                                 sw.c("selectWorld.deleteButton"),
                                 sv.e
                              )
                           );
                     }
                  } catch (IOException var8) {
                     erf.a(this.f, "Demo_World");
                     c.warn("Failed to access demo world", var8);
                  }
               }
            )
            .a(this.g / 2 - 100, $$0 + $$1 * 1, 200, 20)
            .a()
      );
      this.n.r = $$2;
   }

   private boolean C() {
      try {
         boolean var2;
         try (dyy.c $$0 = this.f.k().d("Demo_World")) {
            var2 = $$0.c() != null;
         }

         return var2;
      } catch (IOException var6) {
         erf.a(this.f, "Demo_World");
         c.warn("Failed to read demo world data", var6);
         return false;
      }
   }

   private void D() {
      this.f.a(new eiu(this));
   }

   @Override
   public void a(eox $$0, int $$1, int $$2, float $$3) {
      if (this.r == 0L && this.q) {
         this.r = ac.b();
      }

      float $$4 = this.q ? (float)(ac.b() - this.r) / 1000.0F : 1.0F;
      this.p.a($$3, apa.a($$4, 0.0F, 1.0F));
      RenderSystem.enableBlend();
      $$0.a(1.0F, 1.0F, 1.0F, this.q ? (float)apa.f(apa.a($$4, 0.0F, 1.0F)) : 1.0F);
      $$0.a(l, 0, 0, this.g, this.h, 0.0F, 0.0F, 16, 128, 16, 128);
      $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
      float $$5 = this.q ? apa.a($$4 - 1.0F, 0.0F, 1.0F) : 1.0F;
      this.t.a($$0, this.g, $$5);
      int $$6 = apa.f($$5 * 255.0F) << 24;
      if (($$6 & -67108864) != 0) {
         if (this.s != null) {
            this.s.a($$0, $$6);
         }

         if (this.m != null) {
            this.m.a($$0, this.g, this.i, $$6);
         }

         String $$7 = "Minecraft " + aa.b().c();
         if (this.f.H()) {
            $$7 = $$7 + " Demo";
         } else {
            $$7 = $$7 + ("release".equalsIgnoreCase(this.f.h()) ? "" : "/" + this.f.h());
         }

         if (enn.d().a()) {
            $$7 = $$7 + fvz.a("menu.modded");
         }

         $$0.b(this.i, $$7, 2, this.h - 10, 16777215 | $$6);

         for (eqt $$8 : this.i()) {
            if ($$8 instanceof epf) {
               ((epf)$$8).a($$5);
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
   public boolean a(double $$0, double $$1, int $$2) {
      return super.a($$0, $$1, $$2) ? true : this.l() && this.o.a($$0, $$1, $$2);
   }

   @Override
   public void ax_() {
      if (this.o != null) {
         this.o.ax_();
      }
   }

   @Override
   public void ay_() {
      super.ay_();
      if (this.o != null) {
         this.o.ay_();
      }
   }

   private void c(boolean $$0) {
      if ($$0) {
         try (dyy.c $$1 = this.f.k().d("Demo_World")) {
            $$1.f();
         } catch (IOException var7) {
            erf.b(this.f, "Demo_World");
            c.warn("Failed to delete demo world", var7);
         }
      }

      this.f.a(this);
   }

   static record a(eov a, epz b, int c, int d) {
      public void a(eox $$0, int $$1) {
         this.b.a($$0, this.c, this.d, 9, 2, 2097152 | Math.min($$1, 1426063360));
         this.b.a($$0, this.c, this.d, 9, 16777215 | $$1);
      }
   }
}
