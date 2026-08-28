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

public class fhw {
   private static final akr b = akr.b("hud/crosshair");
   private static final akr c = akr.b("hud/crosshair_attack_indicator_full");
   private static final akr d = akr.b("hud/crosshair_attack_indicator_background");
   private static final akr e = akr.b("hud/crosshair_attack_indicator_progress");
   private static final akr f = akr.b("hud/effect_background_ambient");
   private static final akr g = akr.b("hud/effect_background");
   private static final akr h = akr.b("hud/hotbar");
   private static final akr i = akr.b("hud/hotbar_selection");
   private static final akr j = akr.b("hud/hotbar_offhand_left");
   private static final akr k = akr.b("hud/hotbar_offhand_right");
   private static final akr l = akr.b("hud/hotbar_attack_indicator_background");
   private static final akr m = akr.b("hud/hotbar_attack_indicator_progress");
   private static final akr n = akr.b("hud/jump_bar_background");
   private static final akr o = akr.b("hud/jump_bar_cooldown");
   private static final akr p = akr.b("hud/jump_bar_progress");
   private static final akr q = akr.b("hud/experience_bar_background");
   private static final akr r = akr.b("hud/experience_bar_progress");
   private static final akr s = akr.b("hud/armor_empty");
   private static final akr t = akr.b("hud/armor_half");
   private static final akr u = akr.b("hud/armor_full");
   private static final akr v = akr.b("hud/food_empty_hunger");
   private static final akr w = akr.b("hud/food_half_hunger");
   private static final akr x = akr.b("hud/food_full_hunger");
   private static final akr y = akr.b("hud/food_empty");
   private static final akr z = akr.b("hud/food_half");
   private static final akr A = akr.b("hud/food_full");
   private static final akr B = akr.b("hud/air");
   private static final akr C = akr.b("hud/air_bursting");
   private static final akr D = akr.b("hud/heart/vehicle_container");
   private static final akr E = akr.b("hud/heart/vehicle_full");
   private static final akr F = akr.b("hud/heart/vehicle_half");
   private static final akr G = akr.b("textures/misc/vignette.png");
   private static final akr H = akr.b("textures/misc/pumpkinblur.png");
   private static final akr I = akr.b("textures/misc/spyglass_scope.png");
   private static final akr J = akr.b("textures/misc/powder_snow_outline.png");
   private static final Comparator<exx> K = Comparator.comparing(exx::d).reversed().thenComparing(exx::c, String.CASE_INSENSITIVE_ORDER);
   private static final wz L = wz.c("demo.demoExpired");
   private static final wz M = wz.c("menu.savingLevel");
   private static final float N = 5.0F;
   private static final int O = 10;
   private static final int P = 10;
   private static final String Q = ": ";
   private static final float R = 0.2F;
   private static final int S = 9;
   private static final int T = 8;
   private static final float U = 0.2F;
   private final ayw V = ayw.a();
   private final fgm W;
   private final fil X;
   private int Y;
   @Nullable
   private wz Z;
   private int aa;
   private boolean ab;
   private boolean ac;
   public float a = 1.0F;
   private int ad;
   private cuq ae = cuq.l;
   private final fis af;
   private final fjs ag;
   private final fkj ah;
   private final fjl ai;
   private final fij aj;
   private int ak;
   @Nullable
   private wz al;
   @Nullable
   private wz am;
   private int an;
   private int ao;
   private int ap;
   private int aq;
   private int ar;
   private long as;
   private long at;
   private float au;
   private float av;
   private final fhz aw = new fhz();
   private float ax;

   public fhw(fgm $$0) {
      this.W = $$0;
      this.af = new fis($$0);
      this.ah = new fkj($$0);
      this.X = new fil($$0);
      this.ai = new fjl($$0, this);
      this.aj = new fij($$0);
      this.ag = new fjs($$0);
      this.a();
      fhz $$1 = new fhz().a(this::c).a(this::j).a(this::l).a(this::n).a(this::k).a(($$0x, $$1x) -> this.aj.a($$0x));
      fhz $$2 = new fhz().a(this::o).a(($$0x, $$1x) -> {
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

   public void a(fhx $$0, fgd $$1) {
      RenderSystem.enableDepthTest();
      this.aw.a($$0, $$1);
      RenderSystem.disableDepthTest();
   }

   private void c(fhx $$0, fgd $$1) {
      if (fgm.N()) {
         this.a($$0, this.W.an());
      }

      float $$2 = $$1.a();
      this.ax = ayo.i(0.5F * $$2, this.ax, 1.125F);
      if (this.W.m.aA().a()) {
         if (this.W.s.gx()) {
            this.a($$0, this.ax);
         } else {
            this.ax = 0.5F;
            cuq $$3 = this.W.s.fZ().e(3);
            if ($$3.a(dga.ee.r())) {
               this.a($$0, H, 1.0F);
            }
         }
      }

      if (this.W.s.cn() > 0) {
         this.a($$0, J, this.W.s.co());
      }

      float $$4 = ayo.i($$1.a(false), this.W.s.cI, this.W.s.cH);
      if ($$4 > 0.0F && !this.W.s.b(bsb.i)) {
         this.b($$0, $$4);
      }
   }

   private void d(fhx $$0, fgd $$1) {
      if (this.W.s.gd() > 0) {
         this.W.aH().a("sleep");
         float $$2 = (float)this.W.s.gd();
         float $$3 = $$2 / 100.0F;
         if ($$3 > 1.0F) {
            $$3 = 1.0F - ($$2 - 100.0F) / 10.0F;
         }

         int $$4 = (int)(220.0F * $$3) << 24 | 1052704;
         $$0.a(gff.E(), 0, 0, $$0.a(), $$0.b(), $$4);
         this.W.aH().c();
      }
   }

   private void e(fhx $$0, fgd $$1) {
      fhv $$2 = this.f();
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
               $$5 = ayo.a($$3 / 50.0F, 0.7F, 0.6F, $$4);
            } else {
               $$5 = axy.b.b($$4, -1);
            }

            int $$7 = $$2.a(this.Z);
            $$0.a($$2, this.Z, -$$7 / 2, -4, $$7, $$5);
            $$0.c().b();
         }

         this.W.aH().c();
      }
   }

   private void f(fhx $$0, fgd $$1) {
      if (this.al != null && this.ak > 0) {
         fhv $$2 = this.f();
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

         $$4 = ayo.a($$4, 0, 255);
         if ($$4 > 8) {
            $$0.c().a();
            $$0.c().a((float)($$0.a() / 2), (float)($$0.b() / 2), 0.0F);
            $$0.c().a();
            $$0.c().b(4.0F, 4.0F, 4.0F);
            int $$6 = $$2.a(this.al);
            int $$7 = axy.b.b($$4, -1);
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

   private void g(fhx $$0, fgd $$1) {
      if (!this.X.e()) {
         fak $$2 = this.W.aM();
         int $$3 = ayo.a(this.W.n.e() * (double)$$2.p() / (double)$$2.n());
         int $$4 = ayo.a(this.W.n.f() * (double)$$2.q() / (double)$$2.o());
         this.X.a($$0, this.Y, $$3, $$4, false);
      }
   }

   private void h(fhx $$0, fgd $$1) {
      eye $$2 = this.W.r.M();
      exw $$3 = null;
      exz $$4 = $$2.e(this.W.s.cC());
      if ($$4 != null) {
         exv $$5 = exv.a($$4.n());
         if ($$5 != null) {
            $$3 = $$2.a($$5);
         }
      }

      exw $$6 = $$3 != null ? $$3 : $$2.a(exv.b);
      if ($$6 != null) {
         this.a($$0, $$6);
      }
   }

   private void i(fhx $$0, fgd $$1) {
      eye $$2 = this.W.r.M();
      exw $$3 = $$2.a(exv.a);
      if (!this.W.m.K.e() || this.W.T() && this.W.s.h.l().size() <= 1 && $$3 == null) {
         this.ai.a(false);
      } else {
         this.ai.a(true);
         this.ai.a($$0, $$0.a(), $$2, $$3);
      }
   }

   private void j(fhx $$0, fgd $$1) {
      fgq $$2 = this.W.m;
      if ($$2.aA().a()) {
         if (this.W.q.j() != dct.d || this.a(this.W.v)) {
            RenderSystem.enableBlend();
            if (this.af.d() && !this.W.s.gp() && !$$2.V().c()) {
               ffw $$3 = this.W.j.l();
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
               if (this.W.m.D().c() == ffv.b) {
                  float $$6 = this.W.s.F(0.0F);
                  boolean $$7 = false;
                  if (this.W.u != null && this.W.u instanceof btn && $$6 >= 1.0F) {
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

   private boolean a(@Nullable ewy $$0) {
      if ($$0 == null) {
         return false;
      } else if ($$0.c() == ewy.a.c) {
         return ((ewx)$$0).a() instanceof bqv;
      } else if ($$0.c() == ewy.a.b) {
         jd $$1 = ((eww)$$0).a();
         dcw $$2 = this.W.r;
         return $$2.a_($$1).b($$2, $$1) != null;
      } else {
         return false;
      }
   }

   private void k(fhx $$0, fgd $$1) {
      Collection<brz> $$2 = this.W.s.eu();
      if (!$$2.isEmpty()) {
         if (this.W.y instanceof fpj $$3 && $$3.G()) {
            return;
         }

         RenderSystem.enableBlend();
         int $$4 = 0;
         int $$5 = 0;
         grh $$6 = this.W.aE();
         List<Runnable> $$7 = Lists.newArrayListWithExpectedSize($$2.size());

         for (brz $$8 : Ordering.natural().reverse().sortedCopy($$2)) {
            jm<brx> $$9 = $$8.c();
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
                     $$12 = ayo.a((float)$$13 / 10.0F / 5.0F * 0.5F, 0.0F, 0.5F)
                        + ayo.b((float)$$13 * (float) Math.PI / 5.0F) * ayo.a((float)$$14 / 10.0F * 0.25F, 0.0F, 0.25F);
                  }
               }

               gqj $$15 = $$6.a($$9);
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

   private void l(fhx $$0, fgd $$1) {
      if (this.W.q.j() == dct.d) {
         this.ah.a($$0);
      } else {
         this.m($$0, $$1);
      }

      int $$2 = $$0.a() / 2 - 91;
      bty $$3 = this.W.s.q();
      if ($$3 != null) {
         this.a($$3, $$0, $$2);
      } else if (this.m()) {
         this.a($$0, $$2);
      }

      if (this.W.q.a()) {
         this.b($$0);
      }

      this.c($$0);
      if (this.W.q.j() != dct.d) {
         this.a($$0);
      } else if (this.W.s.R_()) {
         this.ah.b($$0);
      }
   }

   private void m(fhx $$0, fgd $$1) {
      cmx $$2 = this.n();
      if ($$2 != null) {
         cuq $$3 = $$2.eV();
         btg $$4 = $$2.fr().e();
         int $$5 = $$0.a() / 2;
         int $$6 = 182;
         int $$7 = 91;
         RenderSystem.enableBlend();
         $$0.c().a();
         $$0.c().a(0.0F, 0.0F, -90.0F);
         $$0.a(h, $$5 - 91, $$0.b() - 22, 182, 22);
         $$0.a(i, $$5 - 91 - 1 + $$2.fZ().k * 20, $$0.b() - 22 - 1, 24, 23);
         if (!$$3.e()) {
            if ($$4 == btg.a) {
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
            if ($$4 == btg.a) {
               this.a($$0, $$5 - 91 - 26, $$12, $$1, $$2, $$3, $$8++);
            } else {
               this.a($$0, $$5 + 91 + 10, $$12, $$1, $$2, $$3, $$8++);
            }
         }

         if (this.W.m.D().c() == ffv.c) {
            RenderSystem.enableBlend();
            float $$13 = this.W.s.F(0.0F);
            if ($$13 < 1.0F) {
               int $$14 = $$0.b() - 20;
               int $$15 = $$5 + 91 + 6;
               if ($$4 == btg.b) {
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

   private void a(bty $$0, fhx $$1, int $$2) {
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

   private void a(fhx $$0, int $$1) {
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

   private void n(fhx $$0, fgd $$1) {
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

   private void a(fhx $$0) {
      this.W.aH().a("selectedItemName");
      if (this.ad > 0 && !this.ae.e()) {
         xn $$1 = wz.i().b(this.ae.w()).a(this.ae.y().a());
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
            $$0.a(this.f(), (wz)$$1, $$3, $$4, $$2, axy.b.b($$5, -1));
         }
      }

      this.W.aH().c();
   }

   private void o(fhx $$0, fgd $$1) {
      if (this.W.K()) {
         this.W.aH().a("demo");
         wz $$2;
         if (this.W.r.Z() >= 120500L) {
            $$2 = L;
         } else {
            $$2 = wz.a("demo.remainingTime", azl.a((int)(120500L - this.W.r.Z()), this.W.r.s().f()));
         }

         int $$4 = this.f().a($$2);
         int $$5 = $$0.a() - $$4 - 10;
         int $$6 = 5;
         $$0.a(this.f(), $$2, $$5, 5, $$4, -1);
         this.W.aH().c();
      }
   }

   private void a(fhx $$0, exw $$1) {
      eye $$2 = $$1.a();
      yp $$3 = $$1.a(ys.c);

      record a(wz a, wz b, int c) {
      }

      a[] $$4 = $$2.i($$1).stream().filter($$0x -> !$$0x.a()).sorted(K).limit(15L).map($$2x -> {
         exz $$3x = $$2.e($$2x.c());
         wz $$4x = $$2x.b();
         wz $$5x = exz.a($$3x, $$4x);
         wz $$6x = $$2x.a($$3);
         int $$7x = this.f().a($$6x);
         return new a($$5x, $$6x, $$7x);
      }).toArray(a[]::new);
      wz $$5 = $$1.d();
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
   private cmx n() {
      return this.W.an() instanceof cmx $$0 ? $$0 : null;
   }

   @Nullable
   private btn o() {
      cmx $$0 = this.n();
      if ($$0 != null) {
         bsr $$1 = $$0.dd();
         if ($$1 == null) {
            return null;
         }

         if ($$1 instanceof btn) {
            return (btn)$$1;
         }
      }

      return null;
   }

   private int a(@Nullable btn $$0) {
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

   private void b(fhx $$0) {
      cmx $$1 = this.n();
      if ($$1 != null) {
         int $$2 = ayo.f($$1.ex());
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
         float $$9 = Math.max((float)$$1.g(buw.s), (float)Math.max($$5, $$2));
         int $$10 = ayo.f($$1.fp());
         int $$11 = ayo.f(($$9 + (float)$$10) / 2.0F / 10.0F);
         int $$12 = Math.max(10 - ($$11 - 2), 3);
         int $$13 = $$8 - 10;
         int $$14 = -1;
         if ($$1.b(bsb.j)) {
            $$14 = this.Y % ayo.f($$9 + 5.0F);
         }

         this.W.aH().a("armor");
         a($$0, $$1, $$8, $$11, $$12, $$6);
         this.W.aH().b("health");
         this.a($$0, $$1, $$6, $$8, $$12, $$14, $$9, $$2, $$5, $$10, $$3);
         btn $$15 = this.o();
         int $$16 = this.a($$15);
         if ($$16 == 0) {
            this.W.aH().b("food");
            this.a($$0, $$1, $$8, $$7);
            $$13 -= 10;
         }

         this.W.aH().b("air");
         int $$17 = $$1.cl();
         int $$18 = Math.min($$1.cm(), $$17);
         if ($$1.a(awk.a) || $$18 < $$17) {
            int $$19 = this.a($$16) - 1;
            $$13 -= $$19 * 10;
            int $$20 = ayo.c((double)($$18 - 2) * 10.0 / (double)$$17);
            int $$21 = ayo.c((double)$$18 * 10.0 / (double)$$17) - $$20;
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

   private static void a(fhx $$0, cmx $$1, int $$2, int $$3, int $$4, int $$5) {
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

   private void a(fhx $$0, cmx $$1, int $$2, int $$3, int $$4, int $$5, float $$6, int $$7, int $$8, int $$9, boolean $$10) {
      fhw.b $$11 = fhw.b.a($$1);
      boolean $$12 = $$1.dP().A_().l();
      int $$13 = ayo.c((double)$$6 / 2.0);
      int $$14 = ayo.c((double)$$9 / 2.0);
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

         this.a($$0, fhw.b.a, $$19, $$20, $$12, $$10, false);
         int $$21 = $$16 * 2;
         boolean $$22 = $$16 >= $$13;
         if ($$22) {
            int $$23 = $$21 - $$15;
            if ($$23 < $$9) {
               boolean $$24 = $$23 + 1 == $$9;
               this.a($$0, $$11 == fhw.b.d ? $$11 : fhw.b.e, $$19, $$20, $$12, false, $$24);
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

   private void a(fhx $$0, fhw.b $$1, int $$2, int $$3, boolean $$4, boolean $$5, boolean $$6) {
      RenderSystem.enableBlend();
      $$0.a($$1.a($$4, $$6, $$5), $$2, $$3, 9, 9);
      RenderSystem.disableBlend();
   }

   private void a(fhx $$0, cmx $$1, int $$2, int $$3) {
      cpq $$4 = $$1.gj();
      int $$5 = $$4.a();
      RenderSystem.enableBlend();

      for (int $$6 = 0; $$6 < 10; $$6++) {
         int $$7 = $$2;
         akr $$8;
         akr $$9;
         akr $$10;
         if ($$1.b(bsb.q)) {
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

   private void c(fhx $$0) {
      btn $$1 = this.o();
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

   private void a(fhx $$0, akr $$1, float $$2) {
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

   private void a(fhx $$0, float $$1) {
      float $$2 = (float)Math.min($$0.a(), $$0.b());
      float $$4 = Math.min((float)$$0.a() / $$2, (float)$$0.b() / $$2) * $$1;
      int $$5 = ayo.d($$2 * $$4);
      int $$6 = ayo.d($$2 * $$4);
      int $$7 = ($$0.a() - $$5) / 2;
      int $$8 = ($$0.b() - $$6) / 2;
      int $$9 = $$7 + $$5;
      int $$10 = $$8 + $$6;
      RenderSystem.enableBlend();
      $$0.a(I, $$7, $$8, -90, 0.0F, 0.0F, $$5, $$6, $$5, $$6);
      RenderSystem.disableBlend();
      $$0.a(gff.E(), 0, $$10, $$0.a(), $$0.b(), -90, -16777216);
      $$0.a(gff.E(), 0, 0, $$0.a(), $$8, -90, -16777216);
      $$0.a(gff.E(), 0, $$8, $$7, $$10, -90, -16777216);
      $$0.a(gff.E(), $$9, $$8, $$0.a(), $$10, -90, -16777216);
   }

   private void a(bsr $$0) {
      jd $$1 = jd.a($$0.du(), $$0.dy(), $$0.dA());
      float $$2 = gew.a($$0.dP().D_(), $$0.dP().A($$1));
      float $$3 = ayo.a(1.0F - $$2, 0.0F, 1.0F);
      this.a = this.a + ($$3 - this.a) * 0.01F;
   }

   private void a(fhx $$0, @Nullable bsr $$1) {
      dut $$2 = this.W.r.C_();
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
         $$3 = ayo.a($$3, 0.0F, 1.0F);
         $$0.a(0.0F, $$3, $$3, 1.0F);
      } else {
         float $$7 = this.a;
         $$7 = ayo.a($$7, 0.0F, 1.0F);
         $$0.a($$7, $$7, $$7, 1.0F);
      }

      $$0.a(G, 0, 0, -90, 0.0F, 0.0F, $$0.a(), $$0.b(), $$0.a(), $$0.b());
      RenderSystem.depthMask(true);
      RenderSystem.enableDepthTest();
      $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
      RenderSystem.defaultBlendFunc();
      RenderSystem.disableBlend();
   }

   private void b(fhx $$0, float $$1) {
      if ($$1 < 1.0F) {
         $$1 *= $$1;
         $$1 *= $$1;
         $$1 = $$1 * 0.8F + 0.2F;
      }

      RenderSystem.disableDepthTest();
      RenderSystem.depthMask(false);
      RenderSystem.enableBlend();
      $$0.a(1.0F, 1.0F, 1.0F, $$1);
      gqj $$2 = this.W.ao().a().a(dga.ed.o());
      $$0.a(0, 0, -90, $$0.a(), $$0.b(), $$2);
      RenderSystem.disableBlend();
      RenderSystem.depthMask(true);
      RenderSystem.enableDepthTest();
      $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
   }

   private void a(fhx $$0, int $$1, int $$2, fgd $$3, cmx $$4, cuq $$5, int $$6) {
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
      bsr $$0 = this.W.an();
      if ($$0 != null) {
         this.a($$0);
      }

      if (this.W.s != null) {
         cuq $$1 = this.W.s.fZ().f();
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
      this.au = ayo.i(0.2F, this.au, $$1 ? 1.0F : 0.0F);
   }

   public void a(wz $$0) {
      wz $$1 = wz.a("record.nowPlaying", $$0);
      this.a($$1, true);
      this.W.aV().c($$1);
   }

   public void a(wz $$0, boolean $$1) {
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

   public void b(wz $$0) {
      this.am = $$0;
   }

   public void c(wz $$0) {
      this.al = $$0;
      this.ak = this.an + this.ao + this.ap;
   }

   public void c() {
      this.al = null;
      this.am = null;
      this.ak = 0;
   }

   public fil d() {
      return this.X;
   }

   public int e() {
      return this.Y;
   }

   public fhv f() {
      return this.W.h;
   }

   public fkj g() {
      return this.ah;
   }

   public fjl h() {
      return this.ai;
   }

   public void i() {
      this.ai.a();
      this.aj.a();
      this.W.aw().a();
      this.af.o();
      this.X.a(true);
   }

   public fij j() {
      return this.aj;
   }

   public fis k() {
      return this.af;
   }

   public void l() {
      this.af.a();
   }

   public void b(fhx $$0, fgd $$1) {
      if (this.W.m.af().c() && (this.au > 0.0F || this.av > 0.0F)) {
         int $$2 = ayo.d(255.0F * ayo.a(ayo.i($$1.b(), this.av, this.au), 0.0F, 1.0F));
         if ($$2 > 8) {
            fhv $$3 = this.f();
            int $$4 = $$3.a(M);
            int $$5 = axy.b.b($$2, -1);
            int $$6 = $$0.a() - $$4 - 2;
            int $$7 = $$0.b() - 35;
            $$0.a($$3, M, $$6, $$7, $$4, $$5);
         }
      }
   }

   static enum b {
      a(
         akr.b("hud/heart/container"),
         akr.b("hud/heart/container_blinking"),
         akr.b("hud/heart/container"),
         akr.b("hud/heart/container_blinking"),
         akr.b("hud/heart/container_hardcore"),
         akr.b("hud/heart/container_hardcore_blinking"),
         akr.b("hud/heart/container_hardcore"),
         akr.b("hud/heart/container_hardcore_blinking")
      ),
      b(
         akr.b("hud/heart/full"),
         akr.b("hud/heart/full_blinking"),
         akr.b("hud/heart/half"),
         akr.b("hud/heart/half_blinking"),
         akr.b("hud/heart/hardcore_full"),
         akr.b("hud/heart/hardcore_full_blinking"),
         akr.b("hud/heart/hardcore_half"),
         akr.b("hud/heart/hardcore_half_blinking")
      ),
      c(
         akr.b("hud/heart/poisoned_full"),
         akr.b("hud/heart/poisoned_full_blinking"),
         akr.b("hud/heart/poisoned_half"),
         akr.b("hud/heart/poisoned_half_blinking"),
         akr.b("hud/heart/poisoned_hardcore_full"),
         akr.b("hud/heart/poisoned_hardcore_full_blinking"),
         akr.b("hud/heart/poisoned_hardcore_half"),
         akr.b("hud/heart/poisoned_hardcore_half_blinking")
      ),
      d(
         akr.b("hud/heart/withered_full"),
         akr.b("hud/heart/withered_full_blinking"),
         akr.b("hud/heart/withered_half"),
         akr.b("hud/heart/withered_half_blinking"),
         akr.b("hud/heart/withered_hardcore_full"),
         akr.b("hud/heart/withered_hardcore_full_blinking"),
         akr.b("hud/heart/withered_hardcore_half"),
         akr.b("hud/heart/withered_hardcore_half_blinking")
      ),
      e(
         akr.b("hud/heart/absorbing_full"),
         akr.b("hud/heart/absorbing_full_blinking"),
         akr.b("hud/heart/absorbing_half"),
         akr.b("hud/heart/absorbing_half_blinking"),
         akr.b("hud/heart/absorbing_hardcore_full"),
         akr.b("hud/heart/absorbing_hardcore_full_blinking"),
         akr.b("hud/heart/absorbing_hardcore_half"),
         akr.b("hud/heart/absorbing_hardcore_half_blinking")
      ),
      f(
         akr.b("hud/heart/frozen_full"),
         akr.b("hud/heart/frozen_full_blinking"),
         akr.b("hud/heart/frozen_half"),
         akr.b("hud/heart/frozen_half_blinking"),
         akr.b("hud/heart/frozen_hardcore_full"),
         akr.b("hud/heart/frozen_hardcore_full_blinking"),
         akr.b("hud/heart/frozen_hardcore_half"),
         akr.b("hud/heart/frozen_hardcore_half_blinking")
      );

      private final akr g;
      private final akr h;
      private final akr i;
      private final akr j;
      private final akr k;
      private final akr l;
      private final akr m;
      private final akr n;

      private b(final akr $$0, final akr $$1, final akr $$2, final akr $$3, final akr $$4, final akr $$5, final akr $$6, final akr $$7) {
         this.g = $$0;
         this.h = $$1;
         this.i = $$2;
         this.j = $$3;
         this.k = $$4;
         this.l = $$5;
         this.m = $$6;
         this.n = $$7;
      }

      public akr a(boolean $$0, boolean $$1, boolean $$2) {
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

      static fhw.b a(cmx $$0) {
         fhw.b $$1;
         if ($$0.b(bsb.s)) {
            $$1 = c;
         } else if ($$0.b(bsb.t)) {
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
