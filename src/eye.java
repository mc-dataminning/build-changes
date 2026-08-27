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

public class eye extends exz {
   private static final Logger c = LogUtils.getLogger();
   private static final String k = "Demo_World";
   public static final tf a = tf.b("Copyright Mojang AB. Do not distribute!");
   public static final fmz b = new fmz(new aer("textures/gui/title/background/panorama"));
   private static final aer l = new aer("textures/gui/title/background/panorama_overlay.png");
   @Nullable
   private etj m;
   private esh n;
   @Nullable
   private eof o;
   private final fnn p = new fnn(b);
   private final boolean q;
   private long s;
   @Nullable
   private eye.a t;
   private final esy u;

   public eye() {
      this(false);
   }

   public eye(boolean $$0) {
      this($$0, null);
   }

   public eye(boolean $$0, @Nullable esy $$1) {
      super(tf.c("narrator.screen.title"));
      this.q = $$0;
      this.u = Objects.requireNonNullElseGet($$1, () -> new esy(false));
   }

   private boolean l() {
      return this.o != null;
   }

   @Override
   public void c() {
      if (this.l()) {
         this.o.c();
      }

      this.f.aS().a(this);
   }

   public static CompletableFuture<Void> a(fym $$0, Executor $$1) {
      return CompletableFuture.allOf($$0.a(esy.a, $$1), $$0.a(esy.c, $$1), $$0.a(l, $$1), b.a($$0, $$1));
   }

   @Override
   public boolean j() {
      return false;
   }

   @Override
   public boolean aA_() {
      return false;
   }

   @Override
   protected void aE_() {
      if (this.m == null) {
         this.m = this.f.aJ().a();
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

      etk $$4 = this.d(esl.a(20, $$0x -> this.f.a(new exi(this, this.f.m, this.f.ae())), true));
      $$4.b(this.g / 2 - 124, $$3 + 72 + 12);
      this.d(esh.a(tf.c("menu.options"), $$0x -> this.f.a(new exq(this, this.f.m))).a(this.g / 2 - 100, $$3 + 72 + 12, 98, 20).a());
      this.d(esh.a(tf.c("menu.quit"), $$0x -> this.f.q()).a(this.g / 2 + 2, $$3 + 72 + 12, 98, 20).a());
      etk $$5 = this.d(esl.b(20, $$0x -> this.f.a(new ewl(this, this.f.m)), true));
      $$5.b(this.g / 2 + 104, $$3 + 72 + 12);
      this.d(new etf($$1, this.h - 10, $$0, 10, a, $$0x -> this.f.a(new eww(this)), this.i));
      if (this.o == null) {
         this.o = new eof();
      }

      if (this.l()) {
         this.o.b(this.f, this.g, this.h);
      }

      if (!this.f.af()) {
         this.t = new eye.a(this.i, eta.a(this.i, tf.c("title.32bit.deprecation"), 350, 2), this.g / 2, $$3 - 24);
      }
   }

   private void a(int $$0, int $$1) {
      this.d(esh.a(tf.c("menu.singleplayer"), $$0x -> this.f.a(new fcp(this))).a(this.g / 2 - 100, $$0, 200, 20).a());
      tf $$2 = this.B();
      boolean $$3 = $$2 == null;
      etq $$4 = $$2 != null ? etq.a($$2) : null;
      this.d(esh.a(tf.c("menu.multiplayer"), $$0x -> {
         exz $$1x = (exz)(this.f.m.v ? new fav(this) : new fax(this));
         this.f.a($$1x);
      }).a(this.g / 2 - 100, $$0 + $$1 * 1, 200, 20).a($$4).a()).i = $$3;
      this.d(esh.a(tf.c("menu.online"), $$0x -> this.D()).a(this.g / 2 - 100, $$0 + $$1 * 2, 200, 20).a($$4).a()).i = $$3;
   }

   @Nullable
   private tf B() {
      if (this.f.D()) {
         return null;
      } else {
         BanDetails $$0 = this.f.G();
         if ($$0 != null) {
            return $$0.expires() != null ? tf.c("title.multiplayer.disabled.banned.temporary") : tf.c("title.multiplayer.disabled.banned.permanent");
         } else {
            return tf.c("title.multiplayer.disabled");
         }
      }
   }

   private void b(int $$0, int $$1) {
      boolean $$2 = this.C();
      this.d(esh.a(tf.c("menu.playdemo"), $$1x -> {
         if ($$2) {
            this.f.y().a(this, "Demo_World");
         } else {
            this.f.y().a("Demo_World", MinecraftServer.f, dlh.b, dup::a);
         }
      }).a(this.g / 2 - 100, $$0, 200, 20).a());
      this.n = this.d(
         esh.a(
               tf.c("menu.resetdemo"),
               $$0x -> {
                  ebx $$1x = this.f.l();

                  try (ebx.c $$2x = $$1x.d("Demo_World")) {
                     eby $$3 = $$2x.d();
                     if ($$3 != null) {
                        this.f
                           .a(
                              new ews(
                                 this::c,
                                 tf.c("selectWorld.deleteQuestion"),
                                 tf.a("selectWorld.deleteWarning", $$3.b()),
                                 tf.c("selectWorld.deleteButton"),
                                 te.e
                              )
                           );
                     }
                  } catch (IOException var8) {
                     eum.a(this.f, "Demo_World");
                     c.warn("Failed to access demo world", var8);
                  }
               }
            )
            .a(this.g / 2 - 100, $$0 + $$1 * 1, 200, 20)
            .a()
      );
      this.n.i = $$2;
   }

   private boolean C() {
      try {
         boolean var2;
         try (ebx.c $$0 = this.f.l().d("Demo_World")) {
            var2 = $$0.d() != null;
         }

         return var2;
      } catch (IOException var6) {
         eum.a(this.f, "Demo_World");
         c.warn("Failed to read demo world data", var6);
         return false;
      }
   }

   private void D() {
      this.f.a(new elr(this));
   }

   @Override
   public void a(erw $$0, int $$1, int $$2, float $$3) {
      if (this.s == 0L && this.q) {
         this.s = ac.b();
      }

      float $$4 = this.q ? (float)(ac.b() - this.s) / 1000.0F : 1.0F;
      this.p.a($$3, arp.a($$4, 0.0F, 1.0F));
      RenderSystem.enableBlend();
      $$0.a(1.0F, 1.0F, 1.0F, this.q ? (float)arp.f(arp.a($$4, 0.0F, 1.0F)) : 1.0F);
      $$0.a(l, 0, 0, this.g, this.h, 0.0F, 0.0F, 16, 128, 16, 128);
      $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
      float $$5 = this.q ? arp.a($$4 - 1.0F, 0.0F, 1.0F) : 1.0F;
      this.u.a($$0, this.g, $$5);
      int $$6 = arp.f($$5 * 255.0F) << 24;
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

         if (eqm.e().a()) {
            $$7 = $$7 + fzr.a("menu.modded");
         }

         $$0.b(this.i, $$7, 2, this.h - 10, 16777215 | $$6);

         for (eua $$8 : this.i()) {
            if ($$8 instanceof esf) {
               ((esf)$$8).a($$5);
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
   public void b(erw $$0, int $$1, int $$2, float $$3) {
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      return super.a($$0, $$1, $$2) ? true : this.l() && this.o.a($$0, $$1, $$2);
   }

   @Override
   public void h() {
      if (this.o != null) {
         this.o.h();
      }
   }

   @Override
   public void av_() {
      super.av_();
      if (this.o != null) {
         this.o.av_();
      }
   }

   private void c(boolean $$0) {
      if ($$0) {
         try (ebx.c $$1 = this.f.l().d("Demo_World")) {
            $$1.g();
         } catch (IOException var7) {
            eum.b(this.f, "Demo_World");
            c.warn("Failed to delete demo world", var7);
         }
      }

      this.f.a(this);
   }

   static record a(eru a, eta b, int c, int d) {
      public void a(erw $$0, int $$1) {
         this.b.a($$0, this.c, this.d, 9, 2, 2097152 | Math.min($$1, 1426063360));
         this.b.a($$0, this.c, this.d, 9, 16777215 | $$1);
      }
   }
}
