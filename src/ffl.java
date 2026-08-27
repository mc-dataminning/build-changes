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

public class ffl {
   private static final akm b = new akm("hud/crosshair");
   private static final akm c = new akm("hud/crosshair_attack_indicator_full");
   private static final akm d = new akm("hud/crosshair_attack_indicator_background");
   private static final akm e = new akm("hud/crosshair_attack_indicator_progress");
   private static final akm f = new akm("hud/effect_background_ambient");
   private static final akm g = new akm("hud/effect_background");
   private static final akm h = new akm("hud/hotbar");
   private static final akm i = new akm("hud/hotbar_selection");
   private static final akm j = new akm("hud/hotbar_offhand_left");
   private static final akm k = new akm("hud/hotbar_offhand_right");
   private static final akm l = new akm("hud/hotbar_attack_indicator_background");
   private static final akm m = new akm("hud/hotbar_attack_indicator_progress");
   private static final akm n = new akm("hud/jump_bar_background");
   private static final akm o = new akm("hud/jump_bar_cooldown");
   private static final akm p = new akm("hud/jump_bar_progress");
   private static final akm q = new akm("hud/experience_bar_background");
   private static final akm r = new akm("hud/experience_bar_progress");
   private static final akm s = new akm("hud/armor_empty");
   private static final akm t = new akm("hud/armor_half");
   private static final akm u = new akm("hud/armor_full");
   private static final akm v = new akm("hud/food_empty_hunger");
   private static final akm w = new akm("hud/food_half_hunger");
   private static final akm x = new akm("hud/food_full_hunger");
   private static final akm y = new akm("hud/food_empty");
   private static final akm z = new akm("hud/food_half");
   private static final akm A = new akm("hud/food_full");
   private static final akm B = new akm("hud/air");
   private static final akm C = new akm("hud/air_bursting");
   private static final akm D = new akm("hud/heart/vehicle_container");
   private static final akm E = new akm("hud/heart/vehicle_full");
   private static final akm F = new akm("hud/heart/vehicle_half");
   private static final akm G = new akm("textures/misc/vignette.png");
   private static final akm H = new akm("textures/misc/pumpkinblur.png");
   private static final akm I = new akm("textures/misc/spyglass_scope.png");
   private static final akm J = new akm("textures/misc/powder_snow_outline.png");
   private static final Comparator<evh> K = Comparator.comparing(evh::d).reversed().thenComparing(evh::c, String.CASE_INSENSITIVE_ORDER);
   private static final wx L = wx.c("demo.demoExpired");
   private static final wx M = wx.c("menu.savingLevel");
   private static final int N = 16777215;
   private static final float O = 5.0F;
   private static final int P = 10;
   private static final int Q = 10;
   private static final String R = ": ";
   private static final float S = 0.2F;
   private static final int T = 9;
   private static final int U = 8;
   private static final float V = 0.2F;
   private final ayk W = ayk.a();
   private final fdz X;
   private final fga Y;
   private int Z;
   @Nullable
   private wx aa;
   private int ab;
   private boolean ac;
   private boolean ad;
   public float a = 1.0F;
   private int ae;
   private cto af = cto.i;
   private final fgh ag;
   private final fhh ah;
   private final fhy ai;
   private final fha aj;
   private final ffy ak;
   private int al;
   @Nullable
   private wx am;
   @Nullable
   private wx an;
   private int ao;
   private int ap;
   private int aq;
   private int ar;
   private int as;
   private long at;
   private long au;
   private float av;
   private float aw;
   private final ffo ax = new ffo();
   private float ay;

   public ffl(fdz $$0) {
      this.X = $$0;
      this.ag = new fgh($$0);
      this.ai = new fhy($$0);
      this.Y = new fga($$0);
      this.aj = new fha($$0, this);
      this.ak = new ffy($$0);
      this.ah = new fhh($$0);
      this.a();
      ffo $$1 = new ffo().a(this::c).a(this::j).a(this::l).a(this::n).a(this::k).a(($$0x, $$1x) -> this.ak.a($$0x));
      ffo $$2 = new ffo().a(this::o).a(($$0x, $$1x) -> {
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

   public void a(ffm $$0, float $$1) {
      RenderSystem.enableDepthTest();
      this.ax.a($$0, $$1);
      RenderSystem.disableDepthTest();
   }

   private void c(ffm $$0, float $$1) {
      if (fdz.N()) {
         this.a($$0, this.X.ao());
      }

      float $$2 = this.X.av();
      this.ay = ayd.i(0.5F * $$2, this.ay, 1.125F);
      if (this.X.m.aA().a()) {
         if (this.X.s.gA()) {
            this.p($$0, this.ay);
         } else {
            this.ay = 0.5F;
            cto $$3 = this.X.s.gc().e(3);
            if ($$3.a(dea.ee.q())) {
               this.a($$0, H, 1.0F);
            }
         }
      }

      if (this.X.s.cm() > 0) {
         this.a($$0, J, this.X.s.cn());
      }

      float $$4 = ayd.i($$1, this.X.s.cI, this.X.s.cH);
      if ($$4 > 0.0F && !this.X.s.b(bre.i)) {
         this.q($$0, $$4);
      }
   }

   private void d(ffm $$0, float $$1) {
      if (this.X.s.gg() > 0) {
         this.X.aJ().a("sleep");
         float $$2 = (float)this.X.s.gg();
         float $$3 = $$2 / 100.0F;
         if ($$3 > 1.0F) {
            $$3 = 1.0F - ($$2 - 100.0F) / 10.0F;
         }

         int $$4 = (int)(220.0F * $$3) << 24 | 1052704;
         $$0.a(gcs.E(), 0, 0, $$0.a(), $$0.b(), $$4);
         this.X.aJ().c();
      }
   }

   private void e(ffm $$0, float $$1) {
      ffk $$2 = this.f();
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
               $$5 = ayd.h($$3 / 50.0F, 0.7F, 0.6F) & 16777215;
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

   private void f(ffm $$0, float $$1) {
      if (this.am != null && this.al > 0) {
         ffk $$2 = this.f();
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

         $$4 = ayd.a($$4, 0, 255);
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

   private void g(ffm $$0, float $$1) {
      if (!this.Y.e()) {
         exw $$2 = this.X.aP();
         int $$3 = ayd.a(this.X.n.e() * (double)$$2.o() / (double)$$2.m());
         int $$4 = ayd.a(this.X.n.f() * (double)$$2.p() / (double)$$2.n());
         this.Y.a($$0, this.Z, $$3, $$4, false);
      }
   }

   private void h(ffm $$0, float $$1) {
      evo $$2 = this.X.r.L();
      evg $$3 = null;
      evj $$4 = $$2.e(this.X.s.cB());
      if ($$4 != null) {
         evf $$5 = evf.a($$4.n());
         if ($$5 != null) {
            $$3 = $$2.a($$5);
         }
      }

      evg $$6 = $$3 != null ? $$3 : $$2.a(evf.b);
      if ($$6 != null) {
         this.a($$0, $$6);
      }
   }

   private void i(ffm $$0, float $$1) {
      evo $$2 = this.X.r.L();
      evg $$3 = $$2.a(evf.a);
      if (!this.X.m.L.e() || this.X.T() && this.X.s.h.m().size() <= 1 && $$3 == null) {
         this.aj.a(false);
      } else {
         this.aj.a(true);
         this.aj.a($$0, $$0.a(), $$2, $$3);
      }
   }

   private void a(ffm $$0, ffk $$1, int $$2, int $$3, int $$4) {
      int $$5 = this.X.m.b(0.0F);
      if ($$5 != 0) {
         int $$6 = -$$3 / 2;
         $$0.a($$6 - 2, $$2 - 2, $$6 + $$3 + 2, $$2 + 9 + 2, axo.b.a($$5, $$4));
      }
   }

   private void j(ffm $$0, float $$1) {
      fed $$2 = this.X.m;
      if ($$2.aA().a()) {
         if (this.X.q.j() != dau.d || this.a(this.X.v)) {
            RenderSystem.enableBlend();
            if (this.ag.d() && !this.X.s.gs() && !$$2.V().c()) {
               fdk $$3 = this.X.j.m();
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
               if (this.X.m.D().c() == fdj.b) {
                  float $$6 = this.X.s.D(0.0F);
                  boolean $$7 = false;
                  if (this.X.u != null && this.X.u instanceof bso && $$6 >= 1.0F) {
                     $$7 = this.X.s.gv() > 5.0F;
                     $$7 &= this.X.u.bD();
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

   private boolean a(@Nullable eui $$0) {
      if ($$0 == null) {
         return false;
      } else if ($$0.c() == eui.a.c) {
         return ((euh)$$0).a() instanceof bpy;
      } else if ($$0.c() == eui.a.b) {
         io $$1 = ((eug)$$0).a();
         dax $$2 = this.X.r;
         return $$2.a_($$1).b($$2, $$1) != null;
      } else {
         return false;
      }
   }

   private void k(ffm $$0, float $$1) {
      Collection<brc> $$2 = this.X.s.ex();
      if (!$$2.isEmpty()) {
         if (this.X.y instanceof fno $$3 && $$3.I()) {
            return;
         }

         RenderSystem.enableBlend();
         int $$4 = 0;
         int $$5 = 0;
         got $$6 = this.X.aG();
         List<Runnable> $$7 = Lists.newArrayListWithExpectedSize($$2.size());

         for (brc $$8 : Ordering.natural().reverse().sortedCopy($$2)) {
            ix<bra> $$9 = $$8.c();
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
                     $$12 = ayd.a((float)$$13 / 10.0F / 5.0F * 0.5F, 0.0F, 0.5F)
                        + ayd.b((float)$$13 * (float) Math.PI / 5.0F) * ayd.a((float)$$14 / 10.0F * 0.25F, 0.0F, 0.25F);
                  }
               }

               gnv $$15 = $$6.a($$9);
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

   private void l(ffm $$0, float $$1) {
      if (this.X.q.j() == dau.d) {
         this.ai.a($$0);
      } else {
         this.m($$0, $$1);
      }

      int $$2 = $$0.a() / 2 - 91;
      bsz $$3 = this.X.s.u();
      if ($$3 != null) {
         this.a($$3, $$0, $$2);
      } else if (this.m()) {
         this.a($$0, $$2);
      }

      if (this.X.q.a()) {
         this.b($$0);
      }

      this.c($$0);
      if (this.X.q.j() != dau.d) {
         this.a($$0);
      } else if (this.X.s.N_()) {
         this.ai.b($$0);
      }
   }

   private void m(ffm $$0, float $$1) {
      clw $$2 = this.n();
      if ($$2 != null) {
         cto $$3 = $$2.eY();
         bsi $$4 = $$2.fu().e();
         int $$5 = $$0.a() / 2;
         int $$6 = 182;
         int $$7 = 91;
         RenderSystem.enableBlend();
         $$0.c().a();
         $$0.c().a(0.0F, 0.0F, -90.0F);
         $$0.a(h, $$5 - 91, $$0.b() - 22, 182, 22);
         $$0.a(i, $$5 - 91 - 1 + $$2.gc().k * 20, $$0.b() - 22 - 1, 24, 23);
         if (!$$3.e()) {
            if ($$4 == bsi.a) {
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
            this.a($$0, $$10, $$11, $$1, $$2, $$2.gc().h.get($$9), $$8++);
         }

         if (!$$3.e()) {
            int $$12 = $$0.b() - 16 - 3;
            if ($$4 == bsi.a) {
               this.a($$0, $$5 - 91 - 26, $$12, $$1, $$2, $$3, $$8++);
            } else {
               this.a($$0, $$5 + 91 + 10, $$12, $$1, $$2, $$3, $$8++);
            }
         }

         if (this.X.m.D().c() == fdj.c) {
            RenderSystem.enableBlend();
            float $$13 = this.X.s.D(0.0F);
            if ($$13 < 1.0F) {
               int $$14 = $$0.b() - 20;
               int $$15 = $$5 + 91 + 6;
               if ($$4 == bsi.b) {
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

   private void a(bsz $$0, ffm $$1, int $$2) {
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

   private void a(ffm $$0, int $$1) {
      this.X.aJ().a("expBar");
      int $$2 = this.X.s.gl();
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

   private void n(ffm $$0, float $$1) {
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

   private void a(ffm $$0) {
      this.X.aJ().a("selectedItemName");
      if (this.ae > 0 && !this.af.e()) {
         xl $$1 = wx.i().b(this.af.x()).a(this.af.z().a());
         if (this.af.b(kb.f)) {
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

   private void o(ffm $$0, float $$1) {
      if (this.X.K()) {
         this.X.aJ().a("demo");
         wx $$2;
         if (this.X.r.Y() >= 120500L) {
            $$2 = L;
         } else {
            $$2 = wx.a("demo.remainingTime", ayy.a((int)(120500L - this.X.r.Y()), this.X.r.s().f()));
         }

         int $$4 = this.f().a($$2);
         $$0.b(this.f(), $$2, $$0.a() - $$4 - 10, 5, 16777215);
         this.X.aJ().c();
      }
   }

   private void a(ffm $$0, evg $$1) {
      evo $$2 = $$1.a();
      yn $$3 = $$1.a(yq.c);

      record a(wx a, wx b, int c) {
      }

      a[] $$4 = $$2.i($$1).stream().filter($$0x -> !$$0x.a()).sorted(K).limit(15L).map($$2x -> {
         evj $$3x = $$2.e($$2x.c());
         wx $$4x = $$2x.b();
         wx $$5x = evj.a($$3x, $$4x);
         wx $$6x = $$2x.a($$3);
         int $$7x = this.f().a($$6x);
         return new a($$5x, $$6x, $$7x);
      }).toArray(a[]::new);
      wx $$5 = $$1.d();
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
   private clw n() {
      return this.X.ao() instanceof clw $$0 ? $$0 : null;
   }

   @Nullable
   private bso o() {
      clw $$0 = this.n();
      if ($$0 != null) {
         bru $$1 = $$0.dc();
         if ($$1 == null) {
            return null;
         }

         if ($$1 instanceof bso) {
            return (bso)$$1;
         }
      }

      return null;
   }

   private int a(@Nullable bso $$0) {
      if ($$0 != null && $$0.bG()) {
         float $$1 = $$0.eR();
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

   private void b(ffm $$0) {
      clw $$1 = this.n();
      if ($$1 != null) {
         int $$2 = ayd.f($$1.eA());
         boolean $$3 = this.au > (long)this.Z && (this.au - (long)this.Z) / 3L % 2L == 1L;
         long $$4 = ac.c();
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
         float $$9 = Math.max((float)$$1.g(btw.q), (float)Math.max($$5, $$2));
         int $$10 = ayd.f($$1.fs());
         int $$11 = ayd.f(($$9 + (float)$$10) / 2.0F / 10.0F);
         int $$12 = Math.max(10 - ($$11 - 2), 3);
         int $$13 = $$8 - 10;
         int $$14 = -1;
         if ($$1.b(bre.j)) {
            $$14 = this.Z % ayd.f($$9 + 5.0F);
         }

         this.X.aJ().a("armor");
         a($$0, $$1, $$8, $$11, $$12, $$6);
         this.X.aJ().b("health");
         this.a($$0, $$1, $$6, $$8, $$12, $$14, $$9, $$2, $$5, $$10, $$3);
         bso $$15 = this.o();
         int $$16 = this.a($$15);
         if ($$16 == 0) {
            this.X.aJ().b("food");
            this.a($$0, $$1, $$8, $$7);
            $$13 -= 10;
         }

         this.X.aJ().b("air");
         int $$17 = $$1.ck();
         int $$18 = Math.min($$1.cl(), $$17);
         if ($$1.a(awb.a) || $$18 < $$17) {
            int $$19 = this.a($$16) - 1;
            $$13 -= $$19 * 10;
            int $$20 = ayd.c((double)($$18 - 2) * 10.0 / (double)$$17);
            int $$21 = ayd.c((double)$$18 * 10.0 / (double)$$17) - $$20;
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

   private static void a(ffm $$0, clw $$1, int $$2, int $$3, int $$4, int $$5) {
      int $$6 = $$1.eO();
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

   private void a(ffm $$0, clw $$1, int $$2, int $$3, int $$4, int $$5, float $$6, int $$7, int $$8, int $$9, boolean $$10) {
      ffl.b $$11 = ffl.b.a($$1);
      boolean $$12 = $$1.dP().A_().l();
      int $$13 = ayd.c((double)$$6 / 2.0);
      int $$14 = ayd.c((double)$$9 / 2.0);
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

         this.a($$0, ffl.b.a, $$19, $$20, $$12, $$10, false);
         int $$21 = $$16 * 2;
         boolean $$22 = $$16 >= $$13;
         if ($$22) {
            int $$23 = $$21 - $$15;
            if ($$23 < $$9) {
               boolean $$24 = $$23 + 1 == $$9;
               this.a($$0, $$11 == ffl.b.d ? $$11 : ffl.b.e, $$19, $$20, $$12, false, $$24);
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

   private void a(ffm $$0, ffl.b $$1, int $$2, int $$3, boolean $$4, boolean $$5, boolean $$6) {
      RenderSystem.enableBlend();
      $$0.a($$1.a($$4, $$6, $$5), $$2, $$3, 9, 9);
      RenderSystem.disableBlend();
   }

   private void a(ffm $$0, clw $$1, int $$2, int $$3) {
      cop $$4 = $$1.gm();
      int $$5 = $$4.a();
      RenderSystem.enableBlend();

      for (int $$6 = 0; $$6 < 10; $$6++) {
         int $$7 = $$2;
         akm $$8;
         akm $$9;
         akm $$10;
         if ($$1.b(bre.q)) {
            $$8 = v;
            $$9 = w;
            $$10 = x;
         } else {
            $$8 = y;
            $$9 = z;
            $$10 = A;
         }

         if ($$1.gm().e() <= 0.0F && this.Z % ($$5 * 3 + 1) == 0) {
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

   private void c(ffm $$0) {
      bso $$1 = this.o();
      if ($$1 != null) {
         int $$2 = this.a($$1);
         if ($$2 != 0) {
            int $$3 = (int)Math.ceil((double)$$1.eA());
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

   private void a(ffm $$0, akm $$1, float $$2) {
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

   private void p(ffm $$0, float $$1) {
      float $$2 = (float)Math.min($$0.a(), $$0.b());
      float $$4 = Math.min((float)$$0.a() / $$2, (float)$$0.b() / $$2) * $$1;
      int $$5 = ayd.d($$2 * $$4);
      int $$6 = ayd.d($$2 * $$4);
      int $$7 = ($$0.a() - $$5) / 2;
      int $$8 = ($$0.b() - $$6) / 2;
      int $$9 = $$7 + $$5;
      int $$10 = $$8 + $$6;
      RenderSystem.enableBlend();
      $$0.a(I, $$7, $$8, -90, 0.0F, 0.0F, $$5, $$6, $$5, $$6);
      RenderSystem.disableBlend();
      $$0.a(gcs.E(), 0, $$10, $$0.a(), $$0.b(), -90, -16777216);
      $$0.a(gcs.E(), 0, 0, $$0.a(), $$8, -90, -16777216);
      $$0.a(gcs.E(), 0, $$8, $$7, $$10, -90, -16777216);
      $$0.a(gcs.E(), $$9, $$8, $$0.a(), $$10, -90, -16777216);
   }

   private void a(bru $$0) {
      io $$1 = io.a($$0.du(), $$0.dy(), $$0.dA());
      float $$2 = gcj.a($$0.dP().D_(), $$0.dP().A($$1));
      float $$3 = ayd.a(1.0F - $$2, 0.0F, 1.0F);
      this.a = this.a + ($$3 - this.a) * 0.01F;
   }

   private void a(ffm $$0, @Nullable bru $$1) {
      dss $$2 = this.X.r.C_();
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
         $$3 = ayd.a($$3, 0.0F, 1.0F);
         $$0.a(0.0F, $$3, $$3, 1.0F);
      } else {
         float $$7 = this.a;
         $$7 = ayd.a($$7, 0.0F, 1.0F);
         $$0.a($$7, $$7, $$7, 1.0F);
      }

      $$0.a(G, 0, 0, -90, 0.0F, 0.0F, $$0.a(), $$0.b(), $$0.a(), $$0.b());
      RenderSystem.depthMask(true);
      RenderSystem.enableDepthTest();
      $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
      RenderSystem.defaultBlendFunc();
      RenderSystem.disableBlend();
   }

   private void q(ffm $$0, float $$1) {
      if ($$1 < 1.0F) {
         $$1 *= $$1;
         $$1 *= $$1;
         $$1 = $$1 * 0.8F + 0.2F;
      }

      RenderSystem.disableDepthTest();
      RenderSystem.depthMask(false);
      RenderSystem.enableBlend();
      $$0.a(1.0F, 1.0F, 1.0F, $$1);
      gnv $$2 = this.X.ap().a().a(dea.ed.n());
      $$0.a(0, 0, -90, $$0.a(), $$0.b(), $$2);
      RenderSystem.disableBlend();
      RenderSystem.depthMask(true);
      RenderSystem.enableDepthTest();
      $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
   }

   private void a(ffm $$0, int $$1, int $$2, float $$3, clw $$4, cto $$5, int $$6) {
      if (!$$5.e()) {
         float $$7 = (float)$$5.H() - $$3;
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
      bru $$0 = this.X.ao();
      if ($$0 != null) {
         this.a($$0);
      }

      if (this.X.s != null) {
         cto $$1 = this.X.s.gc().f();
         if ($$1.e()) {
            this.ae = 0;
         } else if (this.af.e() || !$$1.a(this.af.g()) || !$$1.x().equals(this.af.x())) {
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
      this.av = ayd.i(0.2F, this.av, $$1 ? 1.0F : 0.0F);
   }

   public void a(wx $$0) {
      wx $$1 = wx.a("record.nowPlaying", $$0);
      this.a($$1, true);
      this.X.aZ().c($$1);
   }

   public void a(wx $$0, boolean $$1) {
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

   public void b(wx $$0) {
      this.an = $$0;
   }

   public void c(wx $$0) {
      this.am = $$0;
      this.al = this.ao + this.ap + this.aq;
   }

   public void c() {
      this.am = null;
      this.an = null;
      this.al = 0;
   }

   public fga d() {
      return this.Y;
   }

   public int e() {
      return this.Z;
   }

   public ffk f() {
      return this.X.h;
   }

   public fhy g() {
      return this.ai;
   }

   public fha h() {
      return this.aj;
   }

   public void i() {
      this.aj.a();
      this.ak.a();
      this.X.aA().a();
      this.ag.o();
      this.Y.a(true);
   }

   public ffy j() {
      return this.ak;
   }

   public fgh k() {
      return this.ag;
   }

   public void l() {
      this.ag.a();
   }

   public void b(ffm $$0, float $$1) {
      if (this.X.m.af().c() && (this.av > 0.0F || this.aw > 0.0F)) {
         int $$2 = ayd.d(255.0F * ayd.a(ayd.i(this.X.au(), this.aw, this.av), 0.0F, 1.0F));
         if ($$2 > 8) {
            ffk $$3 = this.f();
            int $$4 = $$3.a(M);
            int $$5 = 16777215 | $$2 << 24 & 0xFF000000;
            $$0.b($$3, M, $$0.a() - $$4 - 10, $$0.b() - 15, $$5);
         }
      }
   }

   static enum b {
      a(
         new akm("hud/heart/container"),
         new akm("hud/heart/container_blinking"),
         new akm("hud/heart/container"),
         new akm("hud/heart/container_blinking"),
         new akm("hud/heart/container_hardcore"),
         new akm("hud/heart/container_hardcore_blinking"),
         new akm("hud/heart/container_hardcore"),
         new akm("hud/heart/container_hardcore_blinking")
      ),
      b(
         new akm("hud/heart/full"),
         new akm("hud/heart/full_blinking"),
         new akm("hud/heart/half"),
         new akm("hud/heart/half_blinking"),
         new akm("hud/heart/hardcore_full"),
         new akm("hud/heart/hardcore_full_blinking"),
         new akm("hud/heart/hardcore_half"),
         new akm("hud/heart/hardcore_half_blinking")
      ),
      c(
         new akm("hud/heart/poisoned_full"),
         new akm("hud/heart/poisoned_full_blinking"),
         new akm("hud/heart/poisoned_half"),
         new akm("hud/heart/poisoned_half_blinking"),
         new akm("hud/heart/poisoned_hardcore_full"),
         new akm("hud/heart/poisoned_hardcore_full_blinking"),
         new akm("hud/heart/poisoned_hardcore_half"),
         new akm("hud/heart/poisoned_hardcore_half_blinking")
      ),
      d(
         new akm("hud/heart/withered_full"),
         new akm("hud/heart/withered_full_blinking"),
         new akm("hud/heart/withered_half"),
         new akm("hud/heart/withered_half_blinking"),
         new akm("hud/heart/withered_hardcore_full"),
         new akm("hud/heart/withered_hardcore_full_blinking"),
         new akm("hud/heart/withered_hardcore_half"),
         new akm("hud/heart/withered_hardcore_half_blinking")
      ),
      e(
         new akm("hud/heart/absorbing_full"),
         new akm("hud/heart/absorbing_full_blinking"),
         new akm("hud/heart/absorbing_half"),
         new akm("hud/heart/absorbing_half_blinking"),
         new akm("hud/heart/absorbing_hardcore_full"),
         new akm("hud/heart/absorbing_hardcore_full_blinking"),
         new akm("hud/heart/absorbing_hardcore_half"),
         new akm("hud/heart/absorbing_hardcore_half_blinking")
      ),
      f(
         new akm("hud/heart/frozen_full"),
         new akm("hud/heart/frozen_full_blinking"),
         new akm("hud/heart/frozen_half"),
         new akm("hud/heart/frozen_half_blinking"),
         new akm("hud/heart/frozen_hardcore_full"),
         new akm("hud/heart/frozen_hardcore_full_blinking"),
         new akm("hud/heart/frozen_hardcore_half"),
         new akm("hud/heart/frozen_hardcore_half_blinking")
      );

      private final akm g;
      private final akm h;
      private final akm i;
      private final akm j;
      private final akm k;
      private final akm l;
      private final akm m;
      private final akm n;

      private b(akm $$0, akm $$1, akm $$2, akm $$3, akm $$4, akm $$5, akm $$6, akm $$7) {
         this.g = $$0;
         this.h = $$1;
         this.i = $$2;
         this.j = $$3;
         this.k = $$4;
         this.l = $$5;
         this.m = $$6;
         this.n = $$7;
      }

      public akm a(boolean $$0, boolean $$1, boolean $$2) {
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

      static ffl.b a(clw $$0) {
         ffl.b $$1;
         if ($$0.b(bre.s)) {
            $$1 = c;
         } else if ($$0.b(bre.t)) {
            $$1 = d;
         } else if ($$0.co()) {
            $$1 = f;
         } else {
            $$1 = b;
         }

         return $$1;
      }
   }
}
