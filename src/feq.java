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

public class feq {
   private static final akh b = new akh("hud/crosshair");
   private static final akh c = new akh("hud/crosshair_attack_indicator_full");
   private static final akh d = new akh("hud/crosshair_attack_indicator_background");
   private static final akh e = new akh("hud/crosshair_attack_indicator_progress");
   private static final akh f = new akh("hud/effect_background_ambient");
   private static final akh g = new akh("hud/effect_background");
   private static final akh h = new akh("hud/hotbar");
   private static final akh i = new akh("hud/hotbar_selection");
   private static final akh j = new akh("hud/hotbar_offhand_left");
   private static final akh k = new akh("hud/hotbar_offhand_right");
   private static final akh l = new akh("hud/hotbar_attack_indicator_background");
   private static final akh m = new akh("hud/hotbar_attack_indicator_progress");
   private static final akh n = new akh("hud/jump_bar_background");
   private static final akh o = new akh("hud/jump_bar_cooldown");
   private static final akh p = new akh("hud/jump_bar_progress");
   private static final akh q = new akh("hud/experience_bar_background");
   private static final akh r = new akh("hud/experience_bar_progress");
   private static final akh s = new akh("hud/armor_empty");
   private static final akh t = new akh("hud/armor_half");
   private static final akh u = new akh("hud/armor_full");
   private static final akh v = new akh("hud/food_empty_hunger");
   private static final akh w = new akh("hud/food_half_hunger");
   private static final akh x = new akh("hud/food_full_hunger");
   private static final akh y = new akh("hud/food_empty");
   private static final akh z = new akh("hud/food_half");
   private static final akh A = new akh("hud/food_full");
   private static final akh B = new akh("hud/air");
   private static final akh C = new akh("hud/air_bursting");
   private static final akh D = new akh("hud/heart/vehicle_container");
   private static final akh E = new akh("hud/heart/vehicle_full");
   private static final akh F = new akh("hud/heart/vehicle_half");
   private static final akh G = new akh("textures/misc/vignette.png");
   private static final akh H = new akh("textures/misc/pumpkinblur.png");
   private static final akh I = new akh("textures/misc/spyglass_scope.png");
   private static final akh J = new akh("textures/misc/powder_snow_outline.png");
   private static final Comparator<eum> K = Comparator.comparing(eum::d).reversed().thenComparing(eum::c, String.CASE_INSENSITIVE_ORDER);
   private static final wu L = wu.c("demo.demoExpired");
   private static final wu M = wu.c("menu.savingLevel");
   private static final int N = 16777215;
   private static final float O = 5.0F;
   private static final int P = 10;
   private static final int Q = 10;
   private static final String R = ": ";
   private static final float S = 0.2F;
   private static final int T = 9;
   private static final int U = 8;
   private static final float V = 0.2F;
   private final ayg W = ayg.a();
   private final fde X;
   private final fff Y;
   private int Z;
   @Nullable
   private wu aa;
   private int ab;
   private boolean ac;
   private boolean ad;
   public float a = 1.0F;
   private int ae;
   private csz af = csz.i;
   private final ffm ag;
   private final fgm ah;
   private final fhd ai;
   private final fgf aj;
   private final ffd ak;
   private int al;
   @Nullable
   private wu am;
   @Nullable
   private wu an;
   private int ao;
   private int ap;
   private int aq;
   private int ar;
   private int as;
   private long at;
   private long au;
   private float av;
   private float aw;
   private final fet ax = new fet();
   private float ay;

   public feq(fde $$0) {
      this.X = $$0;
      this.ag = new ffm($$0);
      this.ai = new fhd($$0);
      this.Y = new fff($$0);
      this.aj = new fgf($$0, this);
      this.ak = new ffd($$0);
      this.ah = new fgm($$0);
      this.a();
      fet $$1 = new fet().a(this::c).a(this::j).a(this::l).a(this::n).a(this::k).a(($$0x, $$1x) -> this.ak.a($$0x));
      fet $$2 = new fet().a(this::o).a(($$0x, $$1x) -> {
         if (this.ag.d()) {
            this.ag.a($$0x);
         }
      }).a(this::h).a(this::e).a(this::f).a(this::g).a(this::i).a(($$0x, $$1x) -> this.ah.a($$0x));
      this.ax.a($$1, () -> !$$0.m.Z).a(this::d).a($$2, () -> !$$0.m.Z);
   }

   public void a() {
      this.ao = 10;
      this.ap = 70;
      this.aq = 20;
   }

   public void a(fer $$0, float $$1) {
      RenderSystem.enableDepthTest();
      this.ax.a($$0, $$1);
      RenderSystem.disableDepthTest();
   }

   private void c(fer $$0, float $$1) {
      if (fde.N()) {
         this.a($$0, this.X.ao());
      }

      float $$2 = this.X.av();
      this.ay = axz.i(0.5F * $$2, this.ay, 1.125F);
      if (this.X.m.aA().a()) {
         if (this.X.s.gy()) {
            this.p($$0, this.ay);
         } else {
            this.ay = 0.5F;
            csz $$3 = this.X.s.ga().e(3);
            if ($$3.a(ddg.ee.q())) {
               this.a($$0, H, 1.0F);
            }
         }
      }

      if (this.X.s.ck() > 0) {
         this.a($$0, J, this.X.s.cl());
      }

      float $$4 = axz.i($$1, this.X.s.cI, this.X.s.cH);
      if ($$4 > 0.0F && !this.X.s.b(bqv.i)) {
         this.q($$0, $$4);
      }
   }

   private void d(fer $$0, float $$1) {
      if (this.X.s.ge() > 0) {
         this.X.aJ().a("sleep");
         float $$2 = (float)this.X.s.ge();
         float $$3 = $$2 / 100.0F;
         if ($$3 > 1.0F) {
            $$3 = 1.0F - ($$2 - 100.0F) / 10.0F;
         }

         int $$4 = (int)(220.0F * $$3) << 24 | 1052704;
         $$0.a(gbw.E(), 0, 0, $$0.a(), $$0.b(), $$4);
         this.X.aJ().c();
      }
   }

   private void e(fer $$0, float $$1) {
      fep $$2 = this.f();
      if (this.aa != null && this.ab > 0) {
         this.X.aJ().a("overlayMessage");
         float $$3 = (float)this.ab - $$1;
         int $$4 = (int)($$3 * 255.0F / 20.0F);
         if ($$4 > 255) {
            $$4 = 255;
         }

         if ($$4 > 8) {
            $$0.c().a();
            $$0.c().a((float)($$0.a() / 2), (float)($$0.b() - 68), 0.0F);
            int $$5 = 16777215;
            if (this.ac) {
               $$5 = axz.h($$3 / 50.0F, 0.7F, 0.6F) & 16777215;
            }

            int $$6 = $$4 << 24 & 0xFF000000;
            int $$7 = $$2.a(this.aa);
            this.a($$0, $$2, -4, $$7, 16777215 | $$6);
            $$0.b($$2, this.aa, -$$7 / 2, -4, $$5 | $$6);
            $$0.c().b();
         }

         this.X.aJ().c();
      }
   }

   private void f(fer $$0, float $$1) {
      if (this.am != null && this.al > 0) {
         fep $$2 = this.f();
         this.X.aJ().a("titleAndSubtitle");
         float $$3 = (float)this.al - $$1;
         int $$4 = 255;
         if (this.al > this.aq + this.ap) {
            float $$5 = (float)(this.ao + this.ap + this.aq) - $$3;
            $$4 = (int)($$5 * 255.0F / (float)this.ao);
         }

         if (this.al <= this.aq) {
            $$4 = (int)($$3 * 255.0F / (float)this.aq);
         }

         $$4 = axz.a($$4, 0, 255);
         if ($$4 > 8) {
            $$0.c().a();
            $$0.c().a((float)($$0.a() / 2), (float)($$0.b() / 2), 0.0F);
            $$0.c().a();
            $$0.c().b(4.0F, 4.0F, 4.0F);
            int $$6 = $$4 << 24 & 0xFF000000;
            int $$7 = $$2.a(this.am);
            this.a($$0, $$2, -10, $$7, 16777215 | $$6);
            $$0.b($$2, this.am, -$$7 / 2, -10, 16777215 | $$6);
            $$0.c().b();
            if (this.an != null) {
               $$0.c().a();
               $$0.c().b(2.0F, 2.0F, 2.0F);
               int $$8 = $$2.a(this.an);
               this.a($$0, $$2, 5, $$8, 16777215 | $$6);
               $$0.b($$2, this.an, -$$8 / 2, 5, 16777215 | $$6);
               $$0.c().b();
            }

            $$0.c().b();
         }

         this.X.aJ().c();
      }
   }

   private void g(fer $$0, float $$1) {
      if (!this.Y.e()) {
         exb $$2 = this.X.aP();
         int $$3 = axz.a(this.X.n.e() * (double)$$2.o() / (double)$$2.m());
         int $$4 = axz.a(this.X.n.f() * (double)$$2.p() / (double)$$2.n());
         this.Y.a($$0, this.Z, $$3, $$4, false);
      }
   }

   private void h(fer $$0, float $$1) {
      eut $$2 = this.X.r.L();
      eul $$3 = null;
      euo $$4 = $$2.e(this.X.s.cz());
      if ($$4 != null) {
         euk $$5 = euk.a($$4.n());
         if ($$5 != null) {
            $$3 = $$2.a($$5);
         }
      }

      eul $$6 = $$3 != null ? $$3 : $$2.a(euk.b);
      if ($$6 != null) {
         this.a($$0, $$6);
      }
   }

   private void i(fer $$0, float $$1) {
      eut $$2 = this.X.r.L();
      eul $$3 = $$2.a(euk.a);
      if (!this.X.m.L.e() || this.X.T() && this.X.s.h.m().size() <= 1 && $$3 == null) {
         this.aj.a(false);
      } else {
         this.aj.a(true);
         this.aj.a($$0, $$0.a(), $$2, $$3);
      }
   }

   private void a(fer $$0, fep $$1, int $$2, int $$3, int $$4) {
      int $$5 = this.X.m.b(0.0F);
      if ($$5 != 0) {
         int $$6 = -$$3 / 2;
         $$0.a($$6 - 2, $$2 - 2, $$6 + $$3 + 2, $$2 + 9 + 2, axj.b.a($$5, $$4));
      }
   }

   private void j(fer $$0, float $$1) {
      fdi $$2 = this.X.m;
      if ($$2.aA().a()) {
         if (this.X.q.j() != daa.d || this.a(this.X.v)) {
            RenderSystem.enableBlend();
            if (this.ag.d() && !this.X.s.gq() && !$$2.V().c()) {
               fcp $$3 = this.X.j.m();
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
               if (this.X.m.D().c() == fco.b) {
                  float $$6 = this.X.s.D(0.0F);
                  boolean $$7 = false;
                  if (this.X.u != null && this.X.u instanceof bsa && $$6 >= 1.0F) {
                     $$7 = this.X.s.gt() > 5.0F;
                     $$7 &= this.X.u.bB();
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

   private boolean a(@Nullable etn $$0) {
      if ($$0 == null) {
         return false;
      } else if ($$0.c() == etn.a.c) {
         return ((etm)$$0).a() instanceof bpq;
      } else if ($$0.c() == etn.a.b) {
         in $$1 = ((etl)$$0).a();
         dad $$2 = this.X.r;
         return $$2.a_($$1).b($$2, $$1) != null;
      } else {
         return false;
      }
   }

   private void k(fer $$0, float $$1) {
      Collection<bqt> $$2 = this.X.s.ev();
      if (!$$2.isEmpty()) {
         if (this.X.y instanceof fmt $$3 && $$3.I()) {
            return;
         }

         RenderSystem.enableBlend();
         int $$4 = 0;
         int $$5 = 0;
         gnw $$6 = this.X.aG();
         List<Runnable> $$7 = Lists.newArrayListWithExpectedSize($$2.size());

         for (bqt $$8 : Ordering.natural().reverse().sortedCopy($$2)) {
            iw<bqr> $$9 = $$8.c();
            if ($$8.h()) {
               int $$10 = $$0.a();
               int $$11 = 1;
               if (this.X.K()) {
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
                     $$12 = axz.a((float)$$13 / 10.0F / 5.0F * 0.5F, 0.0F, 0.5F)
                        + axz.b((float)$$13 * (float) Math.PI / 5.0F) * axz.a((float)$$14 / 10.0F * 0.25F, 0.0F, 0.25F);
                  }
               }

               gmy $$15 = $$6.a($$9);
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

   private void l(fer $$0, float $$1) {
      if (this.X.q.j() == daa.d) {
         this.ai.a($$0);
      } else {
         this.m($$0, $$1);
      }

      int $$2 = $$0.a() / 2 - 91;
      bsk $$3 = this.X.s.u();
      if ($$3 != null) {
         this.a($$3, $$0, $$2);
      } else if (this.m()) {
         this.a($$0, $$2);
      }

      if (this.X.q.a()) {
         this.b($$0);
      }

      this.c($$0);
      if (this.X.q.j() != daa.d) {
         this.a($$0);
      } else if (this.X.s.N_()) {
         this.ai.b($$0);
      }
   }

   private void m(fer $$0, float $$1) {
      clh $$2 = this.n();
      if ($$2 != null) {
         csz $$3 = $$2.eW();
         bru $$4 = $$2.fs().e();
         int $$5 = $$0.a() / 2;
         int $$6 = 182;
         int $$7 = 91;
         RenderSystem.enableBlend();
         $$0.c().a();
         $$0.c().a(0.0F, 0.0F, -90.0F);
         $$0.a(h, $$5 - 91, $$0.b() - 22, 182, 22);
         $$0.a(i, $$5 - 91 - 1 + $$2.ga().k * 20, $$0.b() - 22 - 1, 24, 23);
         if (!$$3.d()) {
            if ($$4 == bru.a) {
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
            this.a($$0, $$10, $$11, $$1, $$2, $$2.ga().h.get($$9), $$8++);
         }

         if (!$$3.d()) {
            int $$12 = $$0.b() - 16 - 3;
            if ($$4 == bru.a) {
               this.a($$0, $$5 - 91 - 26, $$12, $$1, $$2, $$3, $$8++);
            } else {
               this.a($$0, $$5 + 91 + 10, $$12, $$1, $$2, $$3, $$8++);
            }
         }

         if (this.X.m.D().c() == fco.c) {
            RenderSystem.enableBlend();
            float $$13 = this.X.s.D(0.0F);
            if ($$13 < 1.0F) {
               int $$14 = $$0.b() - 20;
               int $$15 = $$5 + 91 + 6;
               if ($$4 == bru.b) {
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

   private void a(bsk $$0, fer $$1, int $$2) {
      this.X.aJ().a("jumpBar");
      float $$3 = this.X.s.v();
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
      this.X.aJ().c();
   }

   private void a(fer $$0, int $$1) {
      this.X.aJ().a("expBar");
      int $$2 = this.X.s.gj();
      if ($$2 > 0) {
         int $$3 = 182;
         int $$4 = (int)(this.X.s.cr * 183.0F);
         int $$5 = $$0.b() - 32 + 3;
         RenderSystem.enableBlend();
         $$0.a(q, $$1, $$5, 182, 5);
         if ($$4 > 0) {
            $$0.a(r, 182, 5, 0, 0, $$1, $$5, $$4, 5);
         }

         RenderSystem.disableBlend();
      }

      this.X.aJ().c();
   }

   private void n(fer $$0, float $$1) {
      int $$2 = this.X.s.cp;
      if (this.m() && $$2 > 0) {
         this.X.aJ().a("expLevel");
         String $$3 = $$2 + "";
         int $$4 = ($$0.a() - this.f().b($$3)) / 2;
         int $$5 = $$0.b() - 31 - 4;
         $$0.a(this.f(), $$3, $$4 + 1, $$5, 0, false);
         $$0.a(this.f(), $$3, $$4 - 1, $$5, 0, false);
         $$0.a(this.f(), $$3, $$4, $$5 + 1, 0, false);
         $$0.a(this.f(), $$3, $$4, $$5 - 1, 0, false);
         $$0.a(this.f(), $$3, $$4, $$5, 8453920, false);
         this.X.aJ().c();
      }
   }

   private boolean m() {
      return this.X.s.u() == null && this.X.q.d();
   }

   private void a(fer $$0) {
      this.X.aJ().a("selectedItemName");
      if (this.ae > 0 && !this.af.d()) {
         xi $$1 = wu.i().b(this.af.w()).a(this.af.y().a());
         if (this.af.b(ka.f)) {
            $$1.a(n.u);
         }

         int $$2 = this.f().a($$1);
         int $$3 = ($$0.a() - $$2) / 2;
         int $$4 = $$0.b() - 59;
         if (!this.X.q.a()) {
            $$4 += 14;
         }

         int $$5 = (int)((float)this.ae * 256.0F / 10.0F);
         if ($$5 > 255) {
            $$5 = 255;
         }

         if ($$5 > 0) {
            $$0.a($$3 - 2, $$4 - 2, $$3 + $$2 + 2, $$4 + 9 + 2, this.X.m.a(0));
            $$0.b(this.f(), $$1, $$3, $$4, 16777215 + ($$5 << 24));
         }
      }

      this.X.aJ().c();
   }

   private void o(fer $$0, float $$1) {
      if (this.X.K()) {
         this.X.aJ().a("demo");
         wu $$2;
         if (this.X.r.Y() >= 120500L) {
            $$2 = L;
         } else {
            $$2 = wu.a("demo.remainingTime", ayu.a((int)(120500L - this.X.r.Y()), this.X.r.s().f()));
         }

         int $$4 = this.f().a($$2);
         $$0.b(this.f(), $$2, $$0.a() - $$4 - 10, 5, 16777215);
         this.X.aJ().c();
      }
   }

   private void a(fer $$0, eul $$1) {
      eut $$2 = $$1.a();
      yk $$3 = $$1.a(yn.c);

      record a(wu a, wu b, int c) {
      }

      a[] $$4 = $$2.i($$1).stream().filter($$0x -> !$$0x.a()).sorted(K).limit(15L).map($$2x -> {
         euo $$3x = $$2.e($$2x.c());
         wu $$4x = $$2x.b();
         wu $$5x = euo.a($$3x, $$4x);
         wu $$6x = $$2x.a($$3);
         int $$7x = this.f().a($$6x);
         return new a($$5x, $$6x, $$7x);
      }).toArray(a[]::new);
      wu $$5 = $$1.d();
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
         int $$11 = this.X.m.b(0.3F);
         int $$12 = this.X.m.b(0.4F);
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
   private clh n() {
      return this.X.ao() instanceof clh $$0 ? $$0 : null;
   }

   @Nullable
   private bsa o() {
      clh $$0 = this.n();
      if ($$0 != null) {
         brh $$1 = $$0.da();
         if ($$1 == null) {
            return null;
         }

         if ($$1 instanceof bsa) {
            return (bsa)$$1;
         }
      }

      return null;
   }

   private int a(@Nullable bsa $$0) {
      if ($$0 != null && $$0.bE()) {
         float $$1 = $$0.eP();
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

   private void b(fer $$0) {
      clh $$1 = this.n();
      if ($$1 != null) {
         int $$2 = axz.f($$1.ey());
         boolean $$3 = this.au > (long)this.Z && (this.au - (long)this.Z) / 3L % 2L == 1L;
         long $$4 = ac.b();
         if ($$2 < this.ar && $$1.am > 0) {
            this.at = $$4;
            this.au = (long)(this.Z + 20);
         } else if ($$2 > this.ar && $$1.am > 0) {
            this.at = $$4;
            this.au = (long)(this.Z + 10);
         }

         if ($$4 - this.at > 1000L) {
            this.ar = $$2;
            this.as = $$2;
            this.at = $$4;
         }

         this.ar = $$2;
         int $$5 = this.as;
         this.W.b((long)(this.Z * 312871));
         int $$6 = $$0.a() / 2 - 91;
         int $$7 = $$0.a() / 2 + 91;
         int $$8 = $$0.b() - 39;
         float $$9 = Math.max((float)$$1.g(bth.q), (float)Math.max($$5, $$2));
         int $$10 = axz.f($$1.fq());
         int $$11 = axz.f(($$9 + (float)$$10) / 2.0F / 10.0F);
         int $$12 = Math.max(10 - ($$11 - 2), 3);
         int $$13 = $$8 - 10;
         int $$14 = -1;
         if ($$1.b(bqv.j)) {
            $$14 = this.Z % axz.f($$9 + 5.0F);
         }

         this.X.aJ().a("armor");
         a($$0, $$1, $$8, $$11, $$12, $$6);
         this.X.aJ().b("health");
         this.a($$0, $$1, $$6, $$8, $$12, $$14, $$9, $$2, $$5, $$10, $$3);
         bsa $$15 = this.o();
         int $$16 = this.a($$15);
         if ($$16 == 0) {
            this.X.aJ().b("food");
            this.a($$0, $$1, $$8, $$7);
            $$13 -= 10;
         }

         this.X.aJ().b("air");
         int $$17 = $$1.ci();
         int $$18 = Math.min($$1.cj(), $$17);
         if ($$1.a(avw.a) || $$18 < $$17) {
            int $$19 = this.a($$16) - 1;
            $$13 -= $$19 * 10;
            int $$20 = axz.c((double)($$18 - 2) * 10.0 / (double)$$17);
            int $$21 = axz.c((double)$$18 * 10.0 / (double)$$17) - $$20;
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

         this.X.aJ().c();
      }
   }

   private static void a(fer $$0, clh $$1, int $$2, int $$3, int $$4, int $$5) {
      int $$6 = $$1.eM();
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

   private void a(fer $$0, clh $$1, int $$2, int $$3, int $$4, int $$5, float $$6, int $$7, int $$8, int $$9, boolean $$10) {
      feq.b $$11 = feq.b.a($$1);
      boolean $$12 = $$1.dN().A_().l();
      int $$13 = axz.c((double)$$6 / 2.0);
      int $$14 = axz.c((double)$$9 / 2.0);
      int $$15 = $$13 * 2;

      for (int $$16 = $$13 + $$14 - 1; $$16 >= 0; $$16--) {
         int $$17 = $$16 / 10;
         int $$18 = $$16 % 10;
         int $$19 = $$2 + $$18 * 8;
         int $$20 = $$3 - $$17 * $$4;
         if ($$7 + $$9 <= 4) {
            $$20 += this.W.a(2);
         }

         if ($$16 < $$13 && $$16 == $$5) {
            $$20 -= 2;
         }

         this.a($$0, feq.b.a, $$19, $$20, $$12, $$10, false);
         int $$21 = $$16 * 2;
         boolean $$22 = $$16 >= $$13;
         if ($$22) {
            int $$23 = $$21 - $$15;
            if ($$23 < $$9) {
               boolean $$24 = $$23 + 1 == $$9;
               this.a($$0, $$11 == feq.b.d ? $$11 : feq.b.e, $$19, $$20, $$12, false, $$24);
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

   private void a(fer $$0, feq.b $$1, int $$2, int $$3, boolean $$4, boolean $$5, boolean $$6) {
      RenderSystem.enableBlend();
      $$0.a($$1.a($$4, $$6, $$5), $$2, $$3, 9, 9);
      RenderSystem.disableBlend();
   }

   private void a(fer $$0, clh $$1, int $$2, int $$3) {
      cnz $$4 = $$1.gk();
      int $$5 = $$4.a();
      RenderSystem.enableBlend();

      for (int $$6 = 0; $$6 < 10; $$6++) {
         int $$7 = $$2;
         akh $$8;
         akh $$9;
         akh $$10;
         if ($$1.b(bqv.q)) {
            $$8 = v;
            $$9 = w;
            $$10 = x;
         } else {
            $$8 = y;
            $$9 = z;
            $$10 = A;
         }

         if ($$1.gk().e() <= 0.0F && this.Z % ($$5 * 3 + 1) == 0) {
            $$7 = $$2 + (this.W.a(3) - 1);
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

   private void c(fer $$0) {
      bsa $$1 = this.o();
      if ($$1 != null) {
         int $$2 = this.a($$1);
         if ($$2 != 0) {
            int $$3 = (int)Math.ceil((double)$$1.ey());
            this.X.aJ().b("mountHealth");
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

   private void a(fer $$0, akh $$1, float $$2) {
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

   private void p(fer $$0, float $$1) {
      float $$2 = (float)Math.min($$0.a(), $$0.b());
      float $$4 = Math.min((float)$$0.a() / $$2, (float)$$0.b() / $$2) * $$1;
      int $$5 = axz.d($$2 * $$4);
      int $$6 = axz.d($$2 * $$4);
      int $$7 = ($$0.a() - $$5) / 2;
      int $$8 = ($$0.b() - $$6) / 2;
      int $$9 = $$7 + $$5;
      int $$10 = $$8 + $$6;
      RenderSystem.enableBlend();
      $$0.a(I, $$7, $$8, -90, 0.0F, 0.0F, $$5, $$6, $$5, $$6);
      RenderSystem.disableBlend();
      $$0.a(gbw.E(), 0, $$10, $$0.a(), $$0.b(), -90, -16777216);
      $$0.a(gbw.E(), 0, 0, $$0.a(), $$8, -90, -16777216);
      $$0.a(gbw.E(), 0, $$8, $$7, $$10, -90, -16777216);
      $$0.a(gbw.E(), $$9, $$8, $$0.a(), $$10, -90, -16777216);
   }

   private void a(brh $$0) {
      in $$1 = in.a($$0.ds(), $$0.dw(), $$0.dy());
      float $$2 = gbn.a($$0.dN().D_(), $$0.dN().A($$1));
      float $$3 = axz.a(1.0F - $$2, 0.0F, 1.0F);
      this.a = this.a + ($$3 - this.a) * 0.01F;
   }

   private void a(fer $$0, @Nullable brh $$1) {
      dry $$2 = this.X.r.C_();
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
         $$3 = axz.a($$3, 0.0F, 1.0F);
         $$0.a(0.0F, $$3, $$3, 1.0F);
      } else {
         float $$7 = this.a;
         $$7 = axz.a($$7, 0.0F, 1.0F);
         $$0.a($$7, $$7, $$7, 1.0F);
      }

      $$0.a(G, 0, 0, -90, 0.0F, 0.0F, $$0.a(), $$0.b(), $$0.a(), $$0.b());
      RenderSystem.depthMask(true);
      RenderSystem.enableDepthTest();
      $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
      RenderSystem.defaultBlendFunc();
      RenderSystem.disableBlend();
   }

   private void q(fer $$0, float $$1) {
      if ($$1 < 1.0F) {
         $$1 *= $$1;
         $$1 *= $$1;
         $$1 = $$1 * 0.8F + 0.2F;
      }

      RenderSystem.disableDepthTest();
      RenderSystem.depthMask(false);
      RenderSystem.enableBlend();
      $$0.a(1.0F, 1.0F, 1.0F, $$1);
      gmy $$2 = this.X.ap().a().a(ddg.ed.n());
      $$0.a(0, 0, -90, $$0.a(), $$0.b(), $$2);
      RenderSystem.disableBlend();
      RenderSystem.depthMask(true);
      RenderSystem.enableDepthTest();
      $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
   }

   private void a(fer $$0, int $$1, int $$2, float $$3, clh $$4, csz $$5, int $$6) {
      if (!$$5.d()) {
         float $$7 = (float)$$5.F() - $$3;
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

         $$0.a(this.X.h, $$5, $$1, $$2);
      }
   }

   public void a(boolean $$0) {
      this.q();
      if (!$$0) {
         this.p();
      }
   }

   private void p() {
      if (this.ab > 0) {
         this.ab--;
      }

      if (this.al > 0) {
         this.al--;
         if (this.al <= 0) {
            this.am = null;
            this.an = null;
         }
      }

      this.Z++;
      brh $$0 = this.X.ao();
      if ($$0 != null) {
         this.a($$0);
      }

      if (this.X.s != null) {
         csz $$1 = this.X.s.ga().f();
         if ($$1.d()) {
            this.ae = 0;
         } else if (this.af.d() || !$$1.a(this.af.f()) || !$$1.w().equals(this.af.w())) {
            this.ae = (int)(40.0 * this.X.m.B().c());
         } else if (this.ae > 0) {
            this.ae--;
         }

         this.af = $$1;
      }

      this.Y.a();
   }

   private void q() {
      MinecraftServer $$0 = this.X.V();
      boolean $$1 = $$0 != null && $$0.bh();
      this.aw = this.av;
      this.av = axz.i(0.2F, this.av, $$1 ? 1.0F : 0.0F);
   }

   public void a(wu $$0) {
      wu $$1 = wu.a("record.nowPlaying", $$0);
      this.a($$1, true);
      this.X.aZ().c($$1);
   }

   public void a(wu $$0, boolean $$1) {
      this.b(false);
      this.aa = $$0;
      this.ab = 60;
      this.ac = $$1;
   }

   public void b(boolean $$0) {
      this.ad = $$0;
   }

   public boolean b() {
      return this.ad && this.ab > 0;
   }

   public void a(int $$0, int $$1, int $$2) {
      if ($$0 >= 0) {
         this.ao = $$0;
      }

      if ($$1 >= 0) {
         this.ap = $$1;
      }

      if ($$2 >= 0) {
         this.aq = $$2;
      }

      if (this.al > 0) {
         this.al = this.ao + this.ap + this.aq;
      }
   }

   public void b(wu $$0) {
      this.an = $$0;
   }

   public void c(wu $$0) {
      this.am = $$0;
      this.al = this.ao + this.ap + this.aq;
   }

   public void c() {
      this.am = null;
      this.an = null;
      this.al = 0;
   }

   public fff d() {
      return this.Y;
   }

   public int e() {
      return this.Z;
   }

   public fep f() {
      return this.X.h;
   }

   public fhd g() {
      return this.ai;
   }

   public fgf h() {
      return this.aj;
   }

   public void i() {
      this.aj.a();
      this.ak.a();
      this.X.aA().a();
      this.ag.o();
      this.Y.a(true);
   }

   public ffd j() {
      return this.ak;
   }

   public ffm k() {
      return this.ag;
   }

   public void l() {
      this.ag.a();
   }

   public void b(fer $$0, float $$1) {
      if (this.X.m.af().c() && (this.av > 0.0F || this.aw > 0.0F)) {
         int $$2 = axz.d(255.0F * axz.a(axz.i(this.X.au(), this.aw, this.av), 0.0F, 1.0F));
         if ($$2 > 8) {
            fep $$3 = this.f();
            int $$4 = $$3.a(M);
            int $$5 = 16777215 | $$2 << 24 & 0xFF000000;
            $$0.b($$3, M, $$0.a() - $$4 - 10, $$0.b() - 15, $$5);
         }
      }
   }

   static enum b {
      a(
         new akh("hud/heart/container"),
         new akh("hud/heart/container_blinking"),
         new akh("hud/heart/container"),
         new akh("hud/heart/container_blinking"),
         new akh("hud/heart/container_hardcore"),
         new akh("hud/heart/container_hardcore_blinking"),
         new akh("hud/heart/container_hardcore"),
         new akh("hud/heart/container_hardcore_blinking")
      ),
      b(
         new akh("hud/heart/full"),
         new akh("hud/heart/full_blinking"),
         new akh("hud/heart/half"),
         new akh("hud/heart/half_blinking"),
         new akh("hud/heart/hardcore_full"),
         new akh("hud/heart/hardcore_full_blinking"),
         new akh("hud/heart/hardcore_half"),
         new akh("hud/heart/hardcore_half_blinking")
      ),
      c(
         new akh("hud/heart/poisoned_full"),
         new akh("hud/heart/poisoned_full_blinking"),
         new akh("hud/heart/poisoned_half"),
         new akh("hud/heart/poisoned_half_blinking"),
         new akh("hud/heart/poisoned_hardcore_full"),
         new akh("hud/heart/poisoned_hardcore_full_blinking"),
         new akh("hud/heart/poisoned_hardcore_half"),
         new akh("hud/heart/poisoned_hardcore_half_blinking")
      ),
      d(
         new akh("hud/heart/withered_full"),
         new akh("hud/heart/withered_full_blinking"),
         new akh("hud/heart/withered_half"),
         new akh("hud/heart/withered_half_blinking"),
         new akh("hud/heart/withered_hardcore_full"),
         new akh("hud/heart/withered_hardcore_full_blinking"),
         new akh("hud/heart/withered_hardcore_half"),
         new akh("hud/heart/withered_hardcore_half_blinking")
      ),
      e(
         new akh("hud/heart/absorbing_full"),
         new akh("hud/heart/absorbing_full_blinking"),
         new akh("hud/heart/absorbing_half"),
         new akh("hud/heart/absorbing_half_blinking"),
         new akh("hud/heart/absorbing_hardcore_full"),
         new akh("hud/heart/absorbing_hardcore_full_blinking"),
         new akh("hud/heart/absorbing_hardcore_half"),
         new akh("hud/heart/absorbing_hardcore_half_blinking")
      ),
      f(
         new akh("hud/heart/frozen_full"),
         new akh("hud/heart/frozen_full_blinking"),
         new akh("hud/heart/frozen_half"),
         new akh("hud/heart/frozen_half_blinking"),
         new akh("hud/heart/frozen_hardcore_full"),
         new akh("hud/heart/frozen_hardcore_full_blinking"),
         new akh("hud/heart/frozen_hardcore_half"),
         new akh("hud/heart/frozen_hardcore_half_blinking")
      );

      private final akh g;
      private final akh h;
      private final akh i;
      private final akh j;
      private final akh k;
      private final akh l;
      private final akh m;
      private final akh n;

      private b(akh $$0, akh $$1, akh $$2, akh $$3, akh $$4, akh $$5, akh $$6, akh $$7) {
         this.g = $$0;
         this.h = $$1;
         this.i = $$2;
         this.j = $$3;
         this.k = $$4;
         this.l = $$5;
         this.m = $$6;
         this.n = $$7;
      }

      public akh a(boolean $$0, boolean $$1, boolean $$2) {
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

      static feq.b a(clh $$0) {
         feq.b $$1;
         if ($$0.b(bqv.s)) {
            $$1 = c;
         } else if ($$0.b(bqv.t)) {
            $$1 = d;
         } else if ($$0.cm()) {
            $$1 = f;
         } else {
            $$1 = b;
         }

         return $$1;
      }
   }
}
