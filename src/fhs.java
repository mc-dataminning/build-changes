import com.google.common.collect.Lists;
import com.google.common.collect.Ordering;
import com.mojang.blaze3d.platform.GlStateManager;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;
import org.joml.Matrix4fStack;

public class fhs {
   private static final akq b = akq.b("hud/crosshair");
   private static final akq c = akq.b("hud/crosshair_attack_indicator_full");
   private static final akq d = akq.b("hud/crosshair_attack_indicator_background");
   private static final akq e = akq.b("hud/crosshair_attack_indicator_progress");
   private static final akq f = akq.b("hud/effect_background_ambient");
   private static final akq g = akq.b("hud/effect_background");
   private static final akq h = akq.b("hud/hotbar");
   private static final akq i = akq.b("hud/hotbar_selection");
   private static final akq j = akq.b("hud/hotbar_offhand_left");
   private static final akq k = akq.b("hud/hotbar_offhand_right");
   private static final akq l = akq.b("hud/hotbar_attack_indicator_background");
   private static final akq m = akq.b("hud/hotbar_attack_indicator_progress");
   private static final akq n = akq.b("hud/jump_bar_background");
   private static final akq o = akq.b("hud/jump_bar_cooldown");
   private static final akq p = akq.b("hud/jump_bar_progress");
   private static final akq q = akq.b("hud/experience_bar_background");
   private static final akq r = akq.b("hud/experience_bar_progress");
   private static final akq s = akq.b("hud/armor_empty");
   private static final akq t = akq.b("hud/armor_half");
   private static final akq u = akq.b("hud/armor_full");
   private static final akq v = akq.b("hud/food_empty_hunger");
   private static final akq w = akq.b("hud/food_half_hunger");
   private static final akq x = akq.b("hud/food_full_hunger");
   private static final akq y = akq.b("hud/food_empty");
   private static final akq z = akq.b("hud/food_half");
   private static final akq A = akq.b("hud/food_full");
   private static final akq B = akq.b("hud/air");
   private static final akq C = akq.b("hud/air_bursting");
   private static final akq D = akq.b("hud/heart/vehicle_container");
   private static final akq E = akq.b("hud/heart/vehicle_full");
   private static final akq F = akq.b("hud/heart/vehicle_half");
   private static final akq G = akq.b("textures/misc/vignette.png");
   private static final akq H = akq.b("textures/misc/pumpkinblur.png");
   private static final akq I = akq.b("textures/misc/spyglass_scope.png");
   private static final akq J = akq.b("textures/misc/powder_snow_outline.png");
   private static final Comparator<ext> K = Comparator.comparing(ext::d).reversed().thenComparing(ext::c, String.CASE_INSENSITIVE_ORDER);
   private static final wy L = wy.c("demo.demoExpired");
   private static final wy M = wy.c("menu.savingLevel");
   private static final float N = 5.0F;
   private static final int O = 10;
   private static final int P = 10;
   private static final String Q = ": ";
   private static final float R = 0.2F;
   private static final int S = 9;
   private static final int T = 8;
   private static final float U = 0.2F;
   private final ayv V = ayv.a();
   private final fgi W;
   private final fih X;
   private int Y;
   @Nullable
   private wy Z;
   private int aa;
   private boolean ab;
   private boolean ac;
   public float a = 1.0F;
   private int ad;
   private cuo ae = cuo.l;
   private final fio af;
   private final fjo ag;
   private final fkf ah;
   private final fjh ai;
   private final fif aj;
   private int ak;
   @Nullable
   private wy al;
   @Nullable
   private wy am;
   private int an;
   private int ao;
   private int ap;
   private int aq;
   private int ar;
   private long as;
   private long at;
   private float au;
   private float av;
   private final fhv aw = new fhv();
   private float ax;

   public fhs(fgi $$0) {
      this.W = $$0;
      this.af = new fio($$0);
      this.ah = new fkf($$0);
      this.X = new fih($$0);
      this.ai = new fjh($$0, this);
      this.aj = new fif($$0);
      this.ag = new fjo($$0);
      this.a();
      fhv $$1 = new fhv().a(this::c).a(this::j).a(this::l).a(this::n).a(this::k).a(($$0x, $$1x) -> this.aj.a($$0x));
      fhv $$2 = new fhv().a(this::o).a(($$0x, $$1x) -> {
         if (this.af.d()) {
            this.af.a($$0x);
         }
      }).a(this::h).a(this::e).a(this::f).a(this::g).a(this::i).a(($$0x, $$1x) -> this.ag.a($$0x));
      this.aw.a($$1, () -> !$$0.m.Y).a(this::d).a($$2, () -> !$$0.m.Y);
   }

   public void a() {
      this.an = 10;
      this.ao = 70;
      this.ap = 20;
   }

   public void a(fht $$0, ffz $$1) {
      RenderSystem.enableDepthTest();
      this.aw.a($$0, $$1);
      RenderSystem.disableDepthTest();
   }

   private void c(fht $$0, ffz $$1) {
      if (fgi.N()) {
         this.a($$0, this.W.an());
      }

      float $$2 = $$1.a();
      this.ax = ayn.i(0.5F * $$2, this.ax, 1.125F);
      if (this.W.m.aA().a()) {
         if (this.W.s.gx()) {
            this.a($$0, this.ax);
         } else {
            this.ax = 0.5F;
            cuo $$3 = this.W.s.fZ().e(3);
            if ($$3.a(dfy.ee.r())) {
               this.a($$0, H, 1.0F);
            }
         }
      }

      if (this.W.s.cn() > 0) {
         this.a($$0, J, this.W.s.co());
      }

      float $$4 = ayn.i($$1.a(false), this.W.s.cJ, this.W.s.cI);
      if ($$4 > 0.0F && !this.W.s.b(bsa.i)) {
         this.b($$0, $$4);
      }
   }

   private void d(fht $$0, ffz $$1) {
      if (this.W.s.gd() > 0) {
         this.W.aH().a("sleep");
         float $$2 = (float)this.W.s.gd();
         float $$3 = $$2 / 100.0F;
         if ($$3 > 1.0F) {
            $$3 = 1.0F - ($$2 - 100.0F) / 10.0F;
         }

         int $$4 = (int)(220.0F * $$3) << 24 | 1052704;
         $$0.a(gfb.C(), 0, 0, $$0.a(), $$0.b(), $$4);
         this.W.aH().c();
      }
   }

   private void e(fht $$0, ffz $$1) {
      fhr $$2 = this.f();
      if (this.Z != null && this.aa > 0) {
         this.W.aH().a("overlayMessage");
         float $$3 = (float)this.aa - $$1.a(false);
         int $$4 = (int)($$3 * 255.0F / 20.0F);
         if ($$4 > 255) {
            $$4 = 255;
         }

         if ($$4 > 8) {
            $$0.c().a();
            $$0.c().a((float)($$0.a() / 2), (float)($$0.b() - 68), 0.0F);
            int $$5;
            if (this.ab) {
               $$5 = ayn.a($$3 / 50.0F, 0.7F, 0.6F, $$4);
            } else {
               $$5 = axx.b.b($$4, -1);
            }

            int $$7 = $$2.a(this.Z);
            $$0.a($$2, this.Z, -$$7 / 2, -4, $$7, $$5);
            $$0.c().b();
         }

         this.W.aH().c();
      }
   }

   private void f(fht $$0, ffz $$1) {
      if (this.al != null && this.ak > 0) {
         fhr $$2 = this.f();
         this.W.aH().a("titleAndSubtitle");
         float $$3 = (float)this.ak - $$1.a(false);
         int $$4 = 255;
         if (this.ak > this.ap + this.ao) {
            float $$5 = (float)(this.an + this.ao + this.ap) - $$3;
            $$4 = (int)($$5 * 255.0F / (float)this.an);
         }

         if (this.ak <= this.ap) {
            $$4 = (int)($$3 * 255.0F / (float)this.ap);
         }

         $$4 = ayn.a($$4, 0, 255);
         if ($$4 > 8) {
            $$0.c().a();
            $$0.c().a((float)($$0.a() / 2), (float)($$0.b() / 2), 0.0F);
            $$0.c().a();
            $$0.c().b(4.0F, 4.0F, 4.0F);
            int $$6 = $$2.a(this.al);
            int $$7 = axx.b.b($$4, -1);
            $$0.a($$2, this.al, -$$6 / 2, -10, $$6, $$7);
            $$0.c().b();
            if (this.am != null) {
               $$0.c().a();
               $$0.c().b(2.0F, 2.0F, 2.0F);
               int $$8 = $$2.a(this.am);
               $$0.a($$2, this.am, -$$8 / 2, 5, $$8, $$7);
               $$0.c().b();
            }

            $$0.c().b();
         }

         this.W.aH().c();
      }
   }

   private void g(fht $$0, ffz $$1) {
      if (!this.X.e()) {
         fag $$2 = this.W.aM();
         int $$3 = ayn.a(this.W.n.e() * (double)$$2.p() / (double)$$2.n());
         int $$4 = ayn.a(this.W.n.f() * (double)$$2.q() / (double)$$2.o());
         this.X.a($$0, this.Y, $$3, $$4, false);
      }
   }

   private void h(fht $$0, ffz $$1) {
      eya $$2 = this.W.r.M();
      exs $$3 = null;
      exv $$4 = $$2.e(this.W.s.cC());
      if ($$4 != null) {
         exr $$5 = exr.a($$4.n());
         if ($$5 != null) {
            $$3 = $$2.a($$5);
         }
      }

      exs $$6 = $$3 != null ? $$3 : $$2.a(exr.b);
      if ($$6 != null) {
         this.a($$0, $$6);
      }
   }

   private void i(fht $$0, ffz $$1) {
      eya $$2 = this.W.r.M();
      exs $$3 = $$2.a(exr.a);
      if (!this.W.m.K.e() || this.W.T() && this.W.s.h.l().size() <= 1 && $$3 == null) {
         this.ai.a(false);
      } else {
         this.ai.a(true);
         this.ai.a($$0, $$0.a(), $$2, $$3);
      }
   }

   private void j(fht $$0, ffz $$1) {
      fgm $$2 = this.W.m;
      if ($$2.aA().a()) {
         if (this.W.q.j() != dcr.d || this.a(this.W.v)) {
            RenderSystem.enableBlend();
            if (this.af.d() && !this.W.s.gp() && !$$2.V().c()) {
               ffs $$3 = this.W.j.l();
               Matrix4fStack $$4 = RenderSystem.getModelViewStack();
               $$4.pushMatrix();
               $$4.mul($$0.c().c().a());
               $$4.translate((float)($$0.a() / 2), (float)($$0.b() / 2), 0.0F);
               $$4.rotateX(-$$3.d() * (float) (Math.PI / 180.0));
               $$4.rotateY($$3.e() * (float) (Math.PI / 180.0));
               $$4.scale(-1.0F, -1.0F, -1.0F);
               RenderSystem.applyModelViewMatrix();
               RenderSystem.renderCrosshair(10);
               $$4.popMatrix();
               RenderSystem.applyModelViewMatrix();
            } else {
               RenderSystem.blendFuncSeparate(
                  GlStateManager.SourceFactor.ONE_MINUS_DST_COLOR,
                  GlStateManager.DestFactor.ONE_MINUS_SRC_COLOR,
                  GlStateManager.SourceFactor.ONE,
                  GlStateManager.DestFactor.ZERO
               );
               int $$5 = 15;
               $$0.a(b, ($$0.a() - 15) / 2, ($$0.b() - 15) / 2, 15, 15);
               if (this.W.m.D().c() == ffr.b) {
                  float $$6 = this.W.s.E(0.0F);
                  boolean $$7 = false;
                  if (this.W.u != null && this.W.u instanceof btl && $$6 >= 1.0F) {
                     $$7 = this.W.s.gs() > 5.0F;
                     $$7 &= this.W.u.bE();
                  }

                  int $$8 = $$0.b() / 2 - 7 + 16;
                  int $$9 = $$0.a() / 2 - 8;
                  if ($$7) {
                     $$0.a(c, $$9, $$8, 16, 16);
                  } else if ($$6 < 1.0F) {
                     int $$10 = (int)($$6 * 17.0F);
                     $$0.a(d, $$9, $$8, 16, 4);
                     $$0.a(e, 16, 4, 0, 0, $$9, $$8, $$10, 4);
                  }
               }

               RenderSystem.defaultBlendFunc();
            }

            RenderSystem.disableBlend();
         }
      }
   }

   private boolean a(@Nullable ewu $$0) {
      if ($$0 == null) {
         return false;
      } else if ($$0.c() == ewu.a.c) {
         return ((ewt)$$0).a() instanceof bqu;
      } else if ($$0.c() == ewu.a.b) {
         jd $$1 = ((ews)$$0).a();
         dcu $$2 = this.W.r;
         return $$2.a_($$1).b($$2, $$1) != null;
      } else {
         return false;
      }
   }

   private void k(fht $$0, ffz $$1) {
      Collection<bry> $$2 = this.W.s.eu();
      if (!$$2.isEmpty()) {
         if (this.W.y instanceof fpf $$3 && $$3.J()) {
            return;
         }

         RenderSystem.enableBlend();
         int $$4 = 0;
         int $$5 = 0;
         grd $$6 = this.W.aE();
         List<Runnable> $$7 = Lists.newArrayListWithExpectedSize($$2.size());

         for (bry $$8 : Ordering.natural().reverse().sortedCopy($$2)) {
            jm<brw> $$9 = $$8.c();
            if ($$8.h()) {
               int $$10 = $$0.a();
               int $$11 = 1;
               if (this.W.K()) {
                  $$11 += 15;
               }

               if ($$9.a().h()) {
                  $$4++;
                  $$10 -= 25 * $$4;
               } else {
                  $$5++;
                  $$10 -= 25 * $$5;
                  $$11 += 26;
               }

               float $$12 = 1.0F;
               if ($$8.f()) {
                  $$0.a(f, $$10, $$11, 24, 24);
               } else {
                  $$0.a(g, $$10, $$11, 24, 24);
                  if ($$8.a(200)) {
                     int $$13 = $$8.d();
                     int $$14 = 10 - $$13 / 20;
                     $$12 = ayn.a((float)$$13 / 10.0F / 5.0F * 0.5F, 0.0F, 0.5F)
                        + ayn.b((float)$$13 * (float) Math.PI / 5.0F) * ayn.a((float)$$14 / 10.0F * 0.25F, 0.0F, 0.25F);
                  }
               }

               gqf $$15 = $$6.a($$9);
               int $$16 = $$10;
               int $$17 = $$11;
               float $$18 = $$12;
               $$7.add(() -> {
                  $$0.a(1.0F, 1.0F, 1.0F, $$18);
                  $$0.a($$16 + 3, $$17 + 3, 0, 18, 18, $$15);
                  $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
               });
            }
         }

         $$7.forEach(Runnable::run);
         RenderSystem.disableBlend();
      }
   }

   private void l(fht $$0, ffz $$1) {
      if (this.W.q.j() == dcr.d) {
         this.ah.a($$0);
      } else {
         this.m($$0, $$1);
      }

      int $$2 = $$0.a() / 2 - 91;
      btw $$3 = this.W.s.q();
      if ($$3 != null) {
         this.a($$3, $$0, $$2);
      } else if (this.m()) {
         this.a($$0, $$2);
      }

      if (this.W.q.a()) {
         this.b($$0);
      }

      this.c($$0);
      if (this.W.q.j() != dcr.d) {
         this.a($$0);
      } else if (this.W.s.N_()) {
         this.ah.b($$0);
      }
   }

   private void m(fht $$0, ffz $$1) {
      cmv $$2 = this.n();
      if ($$2 != null) {
         cuo $$3 = $$2.eV();
         btf $$4 = $$2.fr().e();
         int $$5 = $$0.a() / 2;
         int $$6 = 182;
         int $$7 = 91;
         RenderSystem.enableBlend();
         $$0.c().a();
         $$0.c().a(0.0F, 0.0F, -90.0F);
         $$0.a(h, $$5 - 91, $$0.b() - 22, 182, 22);
         $$0.a(i, $$5 - 91 - 1 + $$2.fZ().k * 20, $$0.b() - 22 - 1, 24, 23);
         if (!$$3.e()) {
            if ($$4 == btf.a) {
               $$0.a(j, $$5 - 91 - 29, $$0.b() - 23, 29, 24);
            } else {
               $$0.a(k, $$5 + 91, $$0.b() - 23, 29, 24);
            }
         }

         $$0.c().b();
         RenderSystem.disableBlend();
         int $$8 = 1;

         for (int $$9 = 0; $$9 < 9; $$9++) {
            int $$10 = $$5 - 90 + $$9 * 20 + 2;
            int $$11 = $$0.b() - 16 - 3;
            this.a($$0, $$10, $$11, $$1, $$2, $$2.fZ().h.get($$9), $$8++);
         }

         if (!$$3.e()) {
            int $$12 = $$0.b() - 16 - 3;
            if ($$4 == btf.a) {
               this.a($$0, $$5 - 91 - 26, $$12, $$1, $$2, $$3, $$8++);
            } else {
               this.a($$0, $$5 + 91 + 10, $$12, $$1, $$2, $$3, $$8++);
            }
         }

         if (this.W.m.D().c() == ffr.c) {
            RenderSystem.enableBlend();
            float $$13 = this.W.s.E(0.0F);
            if ($$13 < 1.0F) {
               int $$14 = $$0.b() - 20;
               int $$15 = $$5 + 91 + 6;
               if ($$4 == btf.b) {
                  $$15 = $$5 - 91 - 22;
               }

               int $$16 = (int)($$13 * 19.0F);
               $$0.a(l, $$15, $$14, 18, 18);
               $$0.a(m, 18, 18, 0, 18 - $$16, $$15, $$14 + 18 - $$16, 18, $$16);
            }

            RenderSystem.disableBlend();
         }
      }
   }

   private void a(btw $$0, fht $$1, int $$2) {
      this.W.aH().a("jumpBar");
      float $$3 = this.W.s.v();
      int $$4 = 182;
      int $$5 = (int)($$3 * 183.0F);
      int $$6 = $$1.b() - 32 + 3;
      RenderSystem.enableBlend();
      $$1.a(n, $$2, $$6, 182, 5);
      if ($$0.c() > 0) {
         $$1.a(o, $$2, $$6, 182, 5);
      } else if ($$5 > 0) {
         $$1.a(p, 182, 5, 0, 0, $$2, $$6, $$5, 5);
      }

      RenderSystem.disableBlend();
      this.W.aH().c();
   }

   private void a(fht $$0, int $$1) {
      this.W.aH().a("expBar");
      int $$2 = this.W.s.gi();
      if ($$2 > 0) {
         int $$3 = 182;
         int $$4 = (int)(this.W.s.cs * 183.0F);
         int $$5 = $$0.b() - 32 + 3;
         RenderSystem.enableBlend();
         $$0.a(q, $$1, $$5, 182, 5);
         if ($$4 > 0) {
            $$0.a(r, 182, 5, 0, 0, $$1, $$5, $$4, 5);
         }

         RenderSystem.disableBlend();
      }

      this.W.aH().c();
   }

   private void n(fht $$0, ffz $$1) {
      int $$2 = this.W.s.cq;
      if (this.m() && $$2 > 0) {
         this.W.aH().a("expLevel");
         String $$3 = $$2 + "";
         int $$4 = ($$0.a() - this.f().b($$3)) / 2;
         int $$5 = $$0.b() - 31 - 4;
         $$0.a(this.f(), $$3, $$4 + 1, $$5, 0, false);
         $$0.a(this.f(), $$3, $$4 - 1, $$5, 0, false);
         $$0.a(this.f(), $$3, $$4, $$5 + 1, 0, false);
         $$0.a(this.f(), $$3, $$4, $$5 - 1, 0, false);
         $$0.a(this.f(), $$3, $$4, $$5, 8453920, false);
         this.W.aH().c();
      }
   }

   private boolean m() {
      return this.W.s.q() == null && this.W.q.d();
   }

   private void a(fht $$0) {
      this.W.aH().a("selectedItemName");
      if (this.ad > 0 && !this.ae.e()) {
         xm $$1 = wy.i().b(this.ae.w()).a(this.ae.y().a());
         if (this.ae.b(kq.g)) {
            $$1.a(n.u);
         }

         int $$2 = this.f().a($$1);
         int $$3 = ($$0.a() - $$2) / 2;
         int $$4 = $$0.b() - 59;
         if (!this.W.q.a()) {
            $$4 += 14;
         }

         int $$5 = (int)((float)this.ad * 256.0F / 10.0F);
         if ($$5 > 255) {
            $$5 = 255;
         }

         if ($$5 > 0) {
            $$0.a(this.f(), (wy)$$1, $$3, $$4, $$2, axx.b.b($$5, -1));
         }
      }

      this.W.aH().c();
   }

   private void o(fht $$0, ffz $$1) {
      if (this.W.K()) {
         this.W.aH().a("demo");
         wy $$2;
         if (this.W.r.Z() >= 120500L) {
            $$2 = L;
         } else {
            $$2 = wy.a("demo.remainingTime", azk.a((int)(120500L - this.W.r.Z()), this.W.r.s().f()));
         }

         int $$4 = this.f().a($$2);
         int $$5 = $$0.a() - $$4 - 10;
         int $$6 = 5;
         $$0.a(this.f(), $$2, $$5, 5, $$4, -1);
         this.W.aH().c();
      }
   }

   private void a(fht $$0, exs $$1) {
      eya $$2 = $$1.a();
      yo $$3 = $$1.a(yr.c);

      record a(wy a, wy b, int c) {
      }

      a[] $$4 = $$2.i($$1).stream().filter($$0x -> !$$0x.a()).sorted(K).limit(15L).map($$2x -> {
         exv $$3x = $$2.e($$2x.c());
         wy $$4x = $$2x.b();
         wy $$5x = exv.a($$3x, $$4x);
         wy $$6x = $$2x.a($$3);
         int $$7x = this.f().a($$6x);
         return new a($$5x, $$6x, $$7x);
      }).toArray(a[]::new);
      wy $$5 = $$1.d();
      int $$6 = this.f().a($$5);
      int $$7 = $$6;
      int $$8 = this.f().b(": ");

      for (a $$9 : $$4) {
         $$7 = Math.max($$7, this.f().a($$9.a) + ($$9.c > 0 ? $$8 + $$9.c : 0));
      }

      int $$10 = $$7;
      $$0.a(() -> {
         int $$5x = $$4.length;
         int $$6x = $$5x * 9;
         int $$7x = $$0.b() / 2 + $$6x / 3;
         int $$8x = 3;
         int $$9x = $$0.a() - $$10 - 3;
         int $$10x = $$0.a() - 3 + 2;
         int $$11 = this.W.m.b(0.3F);
         int $$12 = this.W.m.b(0.4F);
         int $$13 = $$7x - $$5x * 9;
         $$0.a($$9x - 2, $$13 - 9 - 1, $$10x, $$13 - 1, $$12);
         $$0.a($$9x - 2, $$13 - 1, $$10x, $$7x, $$11);
         $$0.a(this.f(), $$5, $$9x + $$10 / 2 - $$6 / 2, $$13 - 9, -1, false);

         for (int $$14 = 0; $$14 < $$5x; $$14++) {
            a $$15 = $$4[$$14];
            int $$16 = $$7x - ($$5x - $$14) * 9;
            $$0.a(this.f(), $$15.a, $$9x, $$16, -1, false);
            $$0.a(this.f(), $$15.b, $$10x - $$15.c, $$16, -1, false);
         }
      });
   }

   @Nullable
   private cmv n() {
      return this.W.an() instanceof cmv $$0 ? $$0 : null;
   }

   @Nullable
   private btl o() {
      cmv $$0 = this.n();
      if ($$0 != null) {
         bsq $$1 = $$0.dd();
         if ($$1 == null) {
            return null;
         }

         if ($$1 instanceof btl) {
            return (btl)$$1;
         }
      }

      return null;
   }

   private int a(@Nullable btl $$0) {
      if ($$0 != null && $$0.bH()) {
         float $$1 = $$0.eO();
         int $$2 = (int)($$1 + 0.5F) / 2;
         if ($$2 > 30) {
            $$2 = 30;
         }

         return $$2;
      } else {
         return 0;
      }
   }

   private int a(int $$0) {
      return (int)Math.ceil((double)$$0 / 10.0);
   }

   private void b(fht $$0) {
      cmv $$1 = this.n();
      if ($$1 != null) {
         int $$2 = ayn.f($$1.ex());
         boolean $$3 = this.at > (long)this.Y && (this.at - (long)this.Y) / 3L % 2L == 1L;
         long $$4 = ad.c();
         if ($$2 < this.aq && $$1.am > 0) {
            this.as = $$4;
            this.at = (long)(this.Y + 20);
         } else if ($$2 > this.aq && $$1.am > 0) {
            this.as = $$4;
            this.at = (long)(this.Y + 10);
         }

         if ($$4 - this.as > 1000L) {
            this.aq = $$2;
            this.ar = $$2;
            this.as = $$4;
         }

         this.aq = $$2;
         int $$5 = this.ar;
         this.V.b((long)(this.Y * 312871));
         int $$6 = $$0.a() / 2 - 91;
         int $$7 = $$0.a() / 2 + 91;
         int $$8 = $$0.b() - 39;
         float $$9 = Math.max((float)$$1.g(buu.s), (float)Math.max($$5, $$2));
         int $$10 = ayn.f($$1.fp());
         int $$11 = ayn.f(($$9 + (float)$$10) / 2.0F / 10.0F);
         int $$12 = Math.max(10 - ($$11 - 2), 3);
         int $$13 = $$8 - 10;
         int $$14 = -1;
         if ($$1.b(bsa.j)) {
            $$14 = this.Y % ayn.f($$9 + 5.0F);
         }

         this.W.aH().a("armor");
         a($$0, $$1, $$8, $$11, $$12, $$6);
         this.W.aH().b("health");
         this.a($$0, $$1, $$6, $$8, $$12, $$14, $$9, $$2, $$5, $$10, $$3);
         btl $$15 = this.o();
         int $$16 = this.a($$15);
         if ($$16 == 0) {
            this.W.aH().b("food");
            this.a($$0, $$1, $$8, $$7);
            $$13 -= 10;
         }

         this.W.aH().b("air");
         int $$17 = $$1.cl();
         int $$18 = Math.min($$1.cm(), $$17);
         if ($$1.a(awj.a) || $$18 < $$17) {
            int $$19 = this.a($$16) - 1;
            $$13 -= $$19 * 10;
            int $$20 = ayn.c((double)($$18 - 2) * 10.0 / (double)$$17);
            int $$21 = ayn.c((double)$$18 * 10.0 / (double)$$17) - $$20;
            RenderSystem.enableBlend();

            for (int $$22 = 0; $$22 < $$20 + $$21; $$22++) {
               if ($$22 < $$20) {
                  $$0.a(B, $$7 - $$22 * 8 - 9, $$13, 9, 9);
               } else {
                  $$0.a(C, $$7 - $$22 * 8 - 9, $$13, 9, 9);
               }
            }

            RenderSystem.disableBlend();
         }

         this.W.aH().c();
      }
   }

   private static void a(fht $$0, cmv $$1, int $$2, int $$3, int $$4, int $$5) {
      int $$6 = $$1.eL();
      if ($$6 > 0) {
         RenderSystem.enableBlend();
         int $$7 = $$2 - ($$3 - 1) * $$4 - 10;

         for (int $$8 = 0; $$8 < 10; $$8++) {
            int $$9 = $$5 + $$8 * 8;
            if ($$8 * 2 + 1 < $$6) {
               $$0.a(u, $$9, $$7, 9, 9);
            }

            if ($$8 * 2 + 1 == $$6) {
               $$0.a(t, $$9, $$7, 9, 9);
            }

            if ($$8 * 2 + 1 > $$6) {
               $$0.a(s, $$9, $$7, 9, 9);
            }
         }

         RenderSystem.disableBlend();
      }
   }

   private void a(fht $$0, cmv $$1, int $$2, int $$3, int $$4, int $$5, float $$6, int $$7, int $$8, int $$9, boolean $$10) {
      fhs.b $$11 = fhs.b.a($$1);
      boolean $$12 = $$1.dQ().A_().l();
      int $$13 = ayn.c((double)$$6 / 2.0);
      int $$14 = ayn.c((double)$$9 / 2.0);
      int $$15 = $$13 * 2;

      for (int $$16 = $$13 + $$14 - 1; $$16 >= 0; $$16--) {
         int $$17 = $$16 / 10;
         int $$18 = $$16 % 10;
         int $$19 = $$2 + $$18 * 8;
         int $$20 = $$3 - $$17 * $$4;
         if ($$7 + $$9 <= 4) {
            $$20 += this.V.a(2);
         }

         if ($$16 < $$13 && $$16 == $$5) {
            $$20 -= 2;
         }

         this.a($$0, fhs.b.a, $$19, $$20, $$12, $$10, false);
         int $$21 = $$16 * 2;
         boolean $$22 = $$16 >= $$13;
         if ($$22) {
            int $$23 = $$21 - $$15;
            if ($$23 < $$9) {
               boolean $$24 = $$23 + 1 == $$9;
               this.a($$0, $$11 == fhs.b.d ? $$11 : fhs.b.e, $$19, $$20, $$12, false, $$24);
            }
         }

         if ($$10 && $$21 < $$8) {
            boolean $$25 = $$21 + 1 == $$8;
            this.a($$0, $$11, $$19, $$20, $$12, true, $$25);
         }

         if ($$21 < $$7) {
            boolean $$26 = $$21 + 1 == $$7;
            this.a($$0, $$11, $$19, $$20, $$12, false, $$26);
         }
      }
   }

   private void a(fht $$0, fhs.b $$1, int $$2, int $$3, boolean $$4, boolean $$5, boolean $$6) {
      RenderSystem.enableBlend();
      $$0.a($$1.a($$4, $$6, $$5), $$2, $$3, 9, 9);
      RenderSystem.disableBlend();
   }

   private void a(fht $$0, cmv $$1, int $$2, int $$3) {
      cpo $$4 = $$1.gj();
      int $$5 = $$4.a();
      RenderSystem.enableBlend();

      for (int $$6 = 0; $$6 < 10; $$6++) {
         int $$7 = $$2;
         akq $$8;
         akq $$9;
         akq $$10;
         if ($$1.b(bsa.q)) {
            $$8 = v;
            $$9 = w;
            $$10 = x;
         } else {
            $$8 = y;
            $$9 = z;
            $$10 = A;
         }

         if ($$1.gj().e() <= 0.0F && this.Y % ($$5 * 3 + 1) == 0) {
            $$7 = $$2 + (this.V.a(3) - 1);
         }

         int $$14 = $$3 - $$6 * 8 - 9;
         $$0.a($$8, $$14, $$7, 9, 9);
         if ($$6 * 2 + 1 < $$5) {
            $$0.a($$10, $$14, $$7, 9, 9);
         }

         if ($$6 * 2 + 1 == $$5) {
            $$0.a($$9, $$14, $$7, 9, 9);
         }
      }

      RenderSystem.disableBlend();
   }

   private void c(fht $$0) {
      btl $$1 = this.o();
      if ($$1 != null) {
         int $$2 = this.a($$1);
         if ($$2 != 0) {
            int $$3 = (int)Math.ceil((double)$$1.ex());
            this.W.aH().b("mountHealth");
            int $$4 = $$0.b() - 39;
            int $$5 = $$0.a() / 2 + 91;
            int $$6 = $$4;
            int $$7 = 0;
            RenderSystem.enableBlend();

            while ($$2 > 0) {
               int $$8 = Math.min($$2, 10);
               $$2 -= $$8;

               for (int $$9 = 0; $$9 < $$8; $$9++) {
                  int $$10 = $$5 - $$9 * 8 - 9;
                  $$0.a(D, $$10, $$6, 9, 9);
                  if ($$9 * 2 + 1 + $$7 < $$3) {
                     $$0.a(E, $$10, $$6, 9, 9);
                  }

                  if ($$9 * 2 + 1 + $$7 == $$3) {
                     $$0.a(F, $$10, $$6, 9, 9);
                  }
               }

               $$6 -= 10;
               $$7 += 20;
            }

            RenderSystem.disableBlend();
         }
      }
   }

   private void a(fht $$0, akq $$1, float $$2) {
      RenderSystem.disableDepthTest();
      RenderSystem.depthMask(false);
      RenderSystem.enableBlend();
      $$0.a(1.0F, 1.0F, 1.0F, $$2);
      $$0.a($$1, 0, 0, -90, 0.0F, 0.0F, $$0.a(), $$0.b(), $$0.a(), $$0.b());
      RenderSystem.disableBlend();
      RenderSystem.depthMask(true);
      RenderSystem.enableDepthTest();
      $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
   }

   private void a(fht $$0, float $$1) {
      float $$2 = (float)Math.min($$0.a(), $$0.b());
      float $$4 = Math.min((float)$$0.a() / $$2, (float)$$0.b() / $$2) * $$1;
      int $$5 = ayn.d($$2 * $$4);
      int $$6 = ayn.d($$2 * $$4);
      int $$7 = ($$0.a() - $$5) / 2;
      int $$8 = ($$0.b() - $$6) / 2;
      int $$9 = $$7 + $$5;
      int $$10 = $$8 + $$6;
      RenderSystem.enableBlend();
      $$0.a(I, $$7, $$8, -90, 0.0F, 0.0F, $$5, $$6, $$5, $$6);
      RenderSystem.disableBlend();
      $$0.a(gfb.C(), 0, $$10, $$0.a(), $$0.b(), -90, -16777216);
      $$0.a(gfb.C(), 0, 0, $$0.a(), $$8, -90, -16777216);
      $$0.a(gfb.C(), 0, $$8, $$7, $$10, -90, -16777216);
      $$0.a(gfb.C(), $$9, $$8, $$0.a(), $$10, -90, -16777216);
   }

   private void a(bsq $$0) {
      jd $$1 = jd.a($$0.dv(), $$0.dz(), $$0.dB());
      float $$2 = ges.a($$0.dQ().D_(), $$0.dQ().A($$1));
      float $$3 = ayn.a(1.0F - $$2, 0.0F, 1.0F);
      this.a = this.a + ($$3 - this.a) * 0.01F;
   }

   private void a(fht $$0, @Nullable bsq $$1) {
      dur $$2 = this.W.r.C_();
      float $$3 = 0.0F;
      if ($$1 != null) {
         float $$4 = (float)$$2.a($$1);
         double $$5 = Math.min($$2.p() * (double)$$2.q() * 1000.0, Math.abs($$2.k() - $$2.i()));
         double $$6 = Math.max((double)$$2.r(), $$5);
         if ((double)$$4 < $$6) {
            $$3 = 1.0F - (float)((double)$$4 / $$6);
         }
      }

      RenderSystem.disableDepthTest();
      RenderSystem.depthMask(false);
      RenderSystem.enableBlend();
      RenderSystem.blendFuncSeparate(
         GlStateManager.SourceFactor.ZERO, GlStateManager.DestFactor.ONE_MINUS_SRC_COLOR, GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO
      );
      if ($$3 > 0.0F) {
         $$3 = ayn.a($$3, 0.0F, 1.0F);
         $$0.a(0.0F, $$3, $$3, 1.0F);
      } else {
         float $$7 = this.a;
         $$7 = ayn.a($$7, 0.0F, 1.0F);
         $$0.a($$7, $$7, $$7, 1.0F);
      }

      $$0.a(G, 0, 0, -90, 0.0F, 0.0F, $$0.a(), $$0.b(), $$0.a(), $$0.b());
      RenderSystem.depthMask(true);
      RenderSystem.enableDepthTest();
      $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
      RenderSystem.defaultBlendFunc();
      RenderSystem.disableBlend();
   }

   private void b(fht $$0, float $$1) {
      if ($$1 < 1.0F) {
         $$1 *= $$1;
         $$1 *= $$1;
         $$1 = $$1 * 0.8F + 0.2F;
      }

      RenderSystem.disableDepthTest();
      RenderSystem.depthMask(false);
      RenderSystem.enableBlend();
      $$0.a(1.0F, 1.0F, 1.0F, $$1);
      gqf $$2 = this.W.ao().a().a(dfy.ed.o());
      $$0.a(0, 0, -90, $$0.a(), $$0.b(), $$2);
      RenderSystem.disableBlend();
      RenderSystem.depthMask(true);
      RenderSystem.enableDepthTest();
      $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
   }

   private void a(fht $$0, int $$1, int $$2, ffz $$3, cmv $$4, cuo $$5, int $$6) {
      if (!$$5.e()) {
         float $$7 = (float)$$5.G() - $$3.a(false);
         if ($$7 > 0.0F) {
            float $$8 = 1.0F + $$7 / 5.0F;
            $$0.c().a();
            $$0.c().a((float)($$1 + 8), (float)($$2 + 12), 0.0F);
            $$0.c().b(1.0F / $$8, ($$8 + 1.0F) / 2.0F, 1.0F);
            $$0.c().a((float)(-($$1 + 8)), (float)(-($$2 + 12)), 0.0F);
         }

         $$0.a($$4, $$5, $$1, $$2, $$6);
         if ($$7 > 0.0F) {
            $$0.c().b();
         }

         $$0.a(this.W.h, $$5, $$1, $$2);
      }
   }

   public void a(boolean $$0) {
      this.q();
      if (!$$0) {
         this.p();
      }
   }

   private void p() {
      if (this.aa > 0) {
         this.aa--;
      }

      if (this.ak > 0) {
         this.ak--;
         if (this.ak <= 0) {
            this.al = null;
            this.am = null;
         }
      }

      this.Y++;
      bsq $$0 = this.W.an();
      if ($$0 != null) {
         this.a($$0);
      }

      if (this.W.s != null) {
         cuo $$1 = this.W.s.fZ().f();
         if ($$1.e()) {
            this.ad = 0;
         } else if (this.ae.e() || !$$1.a(this.ae.g()) || !$$1.w().equals(this.ae.w())) {
            this.ad = (int)(40.0 * this.W.m.B().c());
         } else if (this.ad > 0) {
            this.ad--;
         }

         this.ae = $$1;
      }

      this.X.a();
   }

   private void q() {
      MinecraftServer $$0 = this.W.V();
      boolean $$1 = $$0 != null && $$0.bh();
      this.av = this.au;
      this.au = ayn.i(0.2F, this.au, $$1 ? 1.0F : 0.0F);
   }

   public void a(wy $$0) {
      wy $$1 = wy.a("record.nowPlaying", $$0);
      this.a($$1, true);
      this.W.aV().c($$1);
   }

   public void a(wy $$0, boolean $$1) {
      this.b(false);
      this.Z = $$0;
      this.aa = 60;
      this.ab = $$1;
   }

   public void b(boolean $$0) {
      this.ac = $$0;
   }

   public boolean b() {
      return this.ac && this.aa > 0;
   }

   public void a(int $$0, int $$1, int $$2) {
      if ($$0 >= 0) {
         this.an = $$0;
      }

      if ($$1 >= 0) {
         this.ao = $$1;
      }

      if ($$2 >= 0) {
         this.ap = $$2;
      }

      if (this.ak > 0) {
         this.ak = this.an + this.ao + this.ap;
      }
   }

   public void b(wy $$0) {
      this.am = $$0;
   }

   public void c(wy $$0) {
      this.al = $$0;
      this.ak = this.an + this.ao + this.ap;
   }

   public void c() {
      this.al = null;
      this.am = null;
      this.ak = 0;
   }

   public fih d() {
      return this.X;
   }

   public int e() {
      return this.Y;
   }

   public fhr f() {
      return this.W.h;
   }

   public fkf g() {
      return this.ah;
   }

   public fjh h() {
      return this.ai;
   }

   public void i() {
      this.ai.a();
      this.aj.a();
      this.W.aw().a();
      this.af.o();
      this.X.a(true);
   }

   public fif j() {
      return this.aj;
   }

   public fio k() {
      return this.af;
   }

   public void l() {
      this.af.a();
   }

   public void b(fht $$0, ffz $$1) {
      if (this.W.m.af().c() && (this.au > 0.0F || this.av > 0.0F)) {
         int $$2 = ayn.d(255.0F * ayn.a(ayn.i($$1.b(), this.av, this.au), 0.0F, 1.0F));
         if ($$2 > 8) {
            fhr $$3 = this.f();
            int $$4 = $$3.a(M);
            int $$5 = axx.b.b($$2, -1);
            int $$6 = $$0.a() - $$4 - 2;
            int $$7 = $$0.b() - 35;
            $$0.a($$3, M, $$6, $$7, $$4, $$5);
         }
      }
   }

   static enum b {
      a(
         akq.b("hud/heart/container"),
         akq.b("hud/heart/container_blinking"),
         akq.b("hud/heart/container"),
         akq.b("hud/heart/container_blinking"),
         akq.b("hud/heart/container_hardcore"),
         akq.b("hud/heart/container_hardcore_blinking"),
         akq.b("hud/heart/container_hardcore"),
         akq.b("hud/heart/container_hardcore_blinking")
      ),
      b(
         akq.b("hud/heart/full"),
         akq.b("hud/heart/full_blinking"),
         akq.b("hud/heart/half"),
         akq.b("hud/heart/half_blinking"),
         akq.b("hud/heart/hardcore_full"),
         akq.b("hud/heart/hardcore_full_blinking"),
         akq.b("hud/heart/hardcore_half"),
         akq.b("hud/heart/hardcore_half_blinking")
      ),
      c(
         akq.b("hud/heart/poisoned_full"),
         akq.b("hud/heart/poisoned_full_blinking"),
         akq.b("hud/heart/poisoned_half"),
         akq.b("hud/heart/poisoned_half_blinking"),
         akq.b("hud/heart/poisoned_hardcore_full"),
         akq.b("hud/heart/poisoned_hardcore_full_blinking"),
         akq.b("hud/heart/poisoned_hardcore_half"),
         akq.b("hud/heart/poisoned_hardcore_half_blinking")
      ),
      d(
         akq.b("hud/heart/withered_full"),
         akq.b("hud/heart/withered_full_blinking"),
         akq.b("hud/heart/withered_half"),
         akq.b("hud/heart/withered_half_blinking"),
         akq.b("hud/heart/withered_hardcore_full"),
         akq.b("hud/heart/withered_hardcore_full_blinking"),
         akq.b("hud/heart/withered_hardcore_half"),
         akq.b("hud/heart/withered_hardcore_half_blinking")
      ),
      e(
         akq.b("hud/heart/absorbing_full"),
         akq.b("hud/heart/absorbing_full_blinking"),
         akq.b("hud/heart/absorbing_half"),
         akq.b("hud/heart/absorbing_half_blinking"),
         akq.b("hud/heart/absorbing_hardcore_full"),
         akq.b("hud/heart/absorbing_hardcore_full_blinking"),
         akq.b("hud/heart/absorbing_hardcore_half"),
         akq.b("hud/heart/absorbing_hardcore_half_blinking")
      ),
      f(
         akq.b("hud/heart/frozen_full"),
         akq.b("hud/heart/frozen_full_blinking"),
         akq.b("hud/heart/frozen_half"),
         akq.b("hud/heart/frozen_half_blinking"),
         akq.b("hud/heart/frozen_hardcore_full"),
         akq.b("hud/heart/frozen_hardcore_full_blinking"),
         akq.b("hud/heart/frozen_hardcore_half"),
         akq.b("hud/heart/frozen_hardcore_half_blinking")
      );

      private final akq g;
      private final akq h;
      private final akq i;
      private final akq j;
      private final akq k;
      private final akq l;
      private final akq m;
      private final akq n;

      private b(final akq $$0, final akq $$1, final akq $$2, final akq $$3, final akq $$4, final akq $$5, final akq $$6, final akq $$7) {
         this.g = $$0;
         this.h = $$1;
         this.i = $$2;
         this.j = $$3;
         this.k = $$4;
         this.l = $$5;
         this.m = $$6;
         this.n = $$7;
      }

      public akq a(boolean $$0, boolean $$1, boolean $$2) {
         if (!$$0) {
            if ($$1) {
               return $$2 ? this.j : this.i;
            } else {
               return $$2 ? this.h : this.g;
            }
         } else if ($$1) {
            return $$2 ? this.n : this.m;
         } else {
            return $$2 ? this.l : this.k;
         }
      }

      static fhs.b a(cmv $$0) {
         fhs.b $$1;
         if ($$0.b(bsa.s)) {
            $$1 = c;
         } else if ($$0.b(bsa.t)) {
            $$1 = d;
         } else if ($$0.cp()) {
            $$1 = f;
         } else {
            $$1 = b;
         }

         return $$1;
      }
   }
}
