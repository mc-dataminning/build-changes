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

public class fau {
   private static final ajh b = new ajh("hud/crosshair");
   private static final ajh c = new ajh("hud/crosshair_attack_indicator_full");
   private static final ajh d = new ajh("hud/crosshair_attack_indicator_background");
   private static final ajh e = new ajh("hud/crosshair_attack_indicator_progress");
   private static final ajh f = new ajh("hud/effect_background_ambient");
   private static final ajh g = new ajh("hud/effect_background");
   private static final ajh h = new ajh("hud/hotbar");
   private static final ajh i = new ajh("hud/hotbar_selection");
   private static final ajh j = new ajh("hud/hotbar_offhand_left");
   private static final ajh k = new ajh("hud/hotbar_offhand_right");
   private static final ajh l = new ajh("hud/hotbar_attack_indicator_background");
   private static final ajh m = new ajh("hud/hotbar_attack_indicator_progress");
   private static final ajh n = new ajh("hud/jump_bar_background");
   private static final ajh o = new ajh("hud/jump_bar_cooldown");
   private static final ajh p = new ajh("hud/jump_bar_progress");
   private static final ajh q = new ajh("hud/experience_bar_background");
   private static final ajh r = new ajh("hud/experience_bar_progress");
   private static final ajh s = new ajh("hud/armor_empty");
   private static final ajh t = new ajh("hud/armor_half");
   private static final ajh u = new ajh("hud/armor_full");
   private static final ajh v = new ajh("hud/food_empty_hunger");
   private static final ajh w = new ajh("hud/food_half_hunger");
   private static final ajh x = new ajh("hud/food_full_hunger");
   private static final ajh y = new ajh("hud/food_empty");
   private static final ajh z = new ajh("hud/food_half");
   private static final ajh A = new ajh("hud/food_full");
   private static final ajh B = new ajh("hud/air");
   private static final ajh C = new ajh("hud/air_bursting");
   private static final ajh D = new ajh("hud/heart/vehicle_container");
   private static final ajh E = new ajh("hud/heart/vehicle_full");
   private static final ajh F = new ajh("hud/heart/vehicle_half");
   private static final ajh G = new ajh("textures/misc/vignette.png");
   private static final ajh H = new ajh("textures/misc/pumpkinblur.png");
   private static final ajh I = new ajh("textures/misc/spyglass_scope.png");
   private static final ajh J = new ajh("textures/misc/powder_snow_outline.png");
   private static final Comparator<eqq> K = Comparator.comparing(eqq::d).reversed().thenComparing(eqq::c, String.CASE_INSENSITIVE_ORDER);
   private static final vu L = vu.c("demo.demoExpired");
   private static final vu M = vu.c("menu.savingLevel");
   private static final int N = 16777215;
   private static final float O = 5.0F;
   private static final int P = 10;
   private static final int Q = 10;
   private static final String R = ": ";
   private static final float S = 0.2F;
   private static final int T = 9;
   private static final int U = 8;
   private static final float V = 0.2F;
   private final axd W = axd.a();
   private final ezi X;
   private final fbj Y;
   private int Z;
   @Nullable
   private vu aa;
   private int ab;
   private boolean ac;
   private boolean ad;
   public float a = 1.0F;
   private int ae;
   private cqm af = cqm.h;
   private final fbq ag;
   private final fcq ah;
   private final fdh ai;
   private final fcj aj;
   private final fbh ak;
   private int al;
   @Nullable
   private vu am;
   @Nullable
   private vu an;
   private int ao;
   private int ap;
   private int aq;
   private int ar;
   private int as;
   private long at;
   private long au;
   private float av;
   private float aw;
   private final fax ax = new fax();
   private float ay;

   public fau(ezi $$0) {
      this.X = $$0;
      this.ag = new fbq($$0);
      this.ai = new fdh($$0);
      this.Y = new fbj($$0);
      this.aj = new fcj($$0, this);
      this.ak = new fbh($$0);
      this.ah = new fcq($$0);
      this.a();
      fax $$1 = new fax().a(this::b).a(this::i).a(this::k).a(this::m).a(this::j).a(($$0x, $$1x) -> this.ak.a($$0x));
      fax $$2 = new fax().a(this::n).a(($$0x, $$1x) -> {
         if (this.ag.d()) {
            this.ag.a($$0x);
         }
      }).a(this::g).a(this::d).a(this::e).a(this::f).a(this::h).a(($$0x, $$1x) -> this.ah.a($$0x)).a(this::q);
      this.ax.a($$1, () -> !$$0.m.Z).a(this::c).a($$2, () -> !$$0.m.Z);
   }

   public void a() {
      this.ao = 10;
      this.ap = 70;
      this.aq = 20;
   }

   public void a(fav $$0, float $$1) {
      RenderSystem.enableDepthTest();
      this.ax.a($$0, $$1);
      RenderSystem.disableDepthTest();
   }

   private void b(fav $$0, float $$1) {
      if (ezi.N()) {
         this.a($$0, this.X.ao());
      }

      float $$2 = this.X.av();
      this.ay = aww.i(0.5F * $$2, this.ay, 1.125F);
      if (this.X.m.ay().a()) {
         if (this.X.s.gx()) {
            this.o($$0, this.ay);
         } else {
            this.ay = 0.5F;
            cqm $$3 = this.X.s.fZ().e(3);
            if ($$3.a(dae.ee.l())) {
               this.a($$0, H, 1.0F);
            }
         }
      }

      if (this.X.s.cj() > 0) {
         this.a($$0, J, this.X.s.ck());
      }

      float $$4 = aww.i($$1, this.X.s.cE, this.X.s.cD);
      if ($$4 > 0.0F && !this.X.s.a(bom.i)) {
         this.p($$0, $$4);
      }
   }

   private void c(fav $$0, float $$1) {
      if (this.X.s.gd() > 0) {
         this.X.aI().a("sleep");
         float $$2 = (float)this.X.s.gd();
         float $$3 = $$2 / 100.0F;
         if ($$3 > 1.0F) {
            $$3 = 1.0F - ($$2 - 100.0F) / 10.0F;
         }

         int $$4 = (int)(220.0F * $$3) << 24 | 1052704;
         $$0.a(fya.E(), 0, 0, $$0.a(), $$0.b(), $$4);
         this.X.aI().c();
      }
   }

   private void d(fav $$0, float $$1) {
      fat $$2 = this.f();
      if (this.aa != null && this.ab > 0) {
         this.X.aI().a("overlayMessage");
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
               $$5 = aww.h($$3 / 50.0F, 0.7F, 0.6F) & 16777215;
            }

            int $$6 = $$4 << 24 & 0xFF000000;
            int $$7 = $$2.a(this.aa);
            this.a($$0, $$2, -4, $$7, 16777215 | $$6);
            $$0.b($$2, this.aa, -$$7 / 2, -4, $$5 | $$6);
            $$0.c().b();
         }

         this.X.aI().c();
      }
   }

   private void e(fav $$0, float $$1) {
      if (this.am != null && this.al > 0) {
         fat $$2 = this.f();
         this.X.aI().a("titleAndSubtitle");
         float $$3 = (float)this.al - $$1;
         int $$4 = 255;
         if (this.al > this.aq + this.ap) {
            float $$5 = (float)(this.ao + this.ap + this.aq) - $$3;
            $$4 = (int)($$5 * 255.0F / (float)this.ao);
         }

         if (this.al <= this.aq) {
            $$4 = (int)($$3 * 255.0F / (float)this.aq);
         }

         $$4 = aww.a($$4, 0, 255);
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

         this.X.aI().c();
      }
   }

   private void f(fav $$0, float $$1) {
      if (!this.Y.e()) {
         etf $$2 = this.X.aO();
         int $$3 = aww.a(this.X.n.e() * (double)$$2.o() / (double)$$2.m());
         int $$4 = aww.a(this.X.n.f() * (double)$$2.p() / (double)$$2.n());
         this.Y.a($$0, this.Z, $$3, $$4, false);
      }
   }

   private void g(fav $$0, float $$1) {
      eqx $$2 = this.X.r.K();
      eqp $$3 = null;
      eqs $$4 = $$2.e(this.X.s.cy());
      if ($$4 != null) {
         eqo $$5 = eqo.a($$4.n());
         if ($$5 != null) {
            $$3 = $$2.a($$5);
         }
      }

      eqp $$6 = $$3 != null ? $$3 : $$2.a(eqo.b);
      if ($$6 != null) {
         this.a($$0, $$6);
      }
   }

   private void h(fav $$0, float $$1) {
      eqx $$2 = this.X.r.K();
      eqp $$3 = $$2.a(eqo.a);
      if (!this.X.m.L.e() || this.X.T() && this.X.s.cu.m().size() <= 1 && $$3 == null) {
         this.aj.a(false);
      } else {
         this.aj.a(true);
         this.aj.a($$0, $$0.a(), $$2, $$3);
      }
   }

   private void a(fav $$0, fat $$1, int $$2, int $$3, int $$4) {
      int $$5 = this.X.m.b(0.0F);
      if ($$5 != 0) {
         int $$6 = -$$3 / 2;
         $$0.a($$6 - 2, $$2 - 2, $$6 + $$3 + 2, $$2 + 9 + 2, awg.b.a($$5, $$4));
      }
   }

   private void i(fav $$0, float $$1) {
      ezm $$2 = this.X.m;
      if ($$2.ay().a()) {
         if (this.X.q.j() != cwy.d || this.a(this.X.v)) {
            RenderSystem.enableBlend();
            if (this.ag.d() && !this.X.s.gp() && !$$2.T().c()) {
               eyt $$3 = this.X.j.m();
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
               if (this.X.m.B().c() == eys.b) {
                  float $$6 = this.X.s.D(0.0F);
                  boolean $$7 = false;
                  if (this.X.u != null && this.X.u instanceof bpp && $$6 >= 1.0F) {
                     $$7 = this.X.s.gs() > 5.0F;
                     $$7 &= this.X.u.bA();
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

   private boolean a(@Nullable epr $$0) {
      if ($$0 == null) {
         return false;
      } else if ($$0.c() == epr.a.c) {
         return ((epq)$$0).a() instanceof bnh;
      } else if ($$0.c() == epr.a.b) {
         ib $$1 = ((epp)$$0).a();
         cxb $$2 = this.X.r;
         return $$2.a_($$1).b($$2, $$1) != null;
      } else {
         return false;
      }
   }

   private void j(fav $$0, float $$1) {
      Collection<bok> $$2 = this.X.s.eu();
      if (!$$2.isEmpty()) {
         if (this.X.y instanceof fiy $$3 && $$3.K()) {
            return;
         }

         RenderSystem.enableBlend();
         int $$4 = 0;
         int $$5 = 0;
         gjz $$6 = this.X.aG();
         List<Runnable> $$7 = Lists.newArrayListWithExpectedSize($$2.size());

         for (bok $$8 : Ordering.natural().reverse().sortedCopy($$2)) {
            il<boi> $$9 = $$8.b();
            if ($$8.g()) {
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
               if ($$8.e()) {
                  $$0.a(f, $$10, $$11, 24, 24);
               } else {
                  $$0.a(g, $$10, $$11, 24, 24);
                  if ($$8.a(200)) {
                     int $$13 = $$8.c();
                     int $$14 = 10 - $$13 / 20;
                     $$12 = aww.a((float)$$13 / 10.0F / 5.0F * 0.5F, 0.0F, 0.5F)
                        + aww.b((float)$$13 * (float) Math.PI / 5.0F) * aww.a((float)$$14 / 10.0F * 0.25F, 0.0F, 0.25F);
                  }
               }

               gjc $$15 = $$6.a($$9);
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

   private void k(fav $$0, float $$1) {
      if (this.X.q.j() == cwy.d) {
         this.ai.a($$0);
      } else {
         this.l($$0, $$1);
      }

      int $$2 = $$0.a() / 2 - 91;
      bpz $$3 = this.X.s.u();
      if ($$3 != null) {
         this.a($$3, $$0, $$2);
      } else if (this.m()) {
         this.a($$0, $$2);
      }

      if (this.X.q.a()) {
         this.b($$0);
      }

      this.c($$0);
      if (this.X.q.j() != cwy.d) {
         this.a($$0);
      } else if (this.X.s.N_()) {
         this.ai.b($$0);
      }
   }

   private void l(fav $$0, float $$1) {
      ciu $$2 = this.n();
      if ($$2 != null) {
         cqm $$3 = $$2.eV();
         bpj $$4 = $$2.fr().e();
         int $$5 = $$0.a() / 2;
         int $$6 = 182;
         int $$7 = 91;
         RenderSystem.enableBlend();
         $$0.c().a();
         $$0.c().a(0.0F, 0.0F, -90.0F);
         $$0.a(h, $$5 - 91, $$0.b() - 22, 182, 22);
         $$0.a(i, $$5 - 91 - 1 + $$2.fZ().l * 20, $$0.b() - 22 - 1, 24, 23);
         if (!$$3.b()) {
            if ($$4 == bpj.a) {
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
            this.a($$0, $$10, $$11, $$1, $$2, $$2.fZ().i.get($$9), $$8++);
         }

         if (!$$3.b()) {
            int $$12 = $$0.b() - 16 - 3;
            if ($$4 == bpj.a) {
               this.a($$0, $$5 - 91 - 26, $$12, $$1, $$2, $$3, $$8++);
            } else {
               this.a($$0, $$5 + 91 + 10, $$12, $$1, $$2, $$3, $$8++);
            }
         }

         if (this.X.m.B().c() == eys.c) {
            RenderSystem.enableBlend();
            float $$13 = this.X.s.D(0.0F);
            if ($$13 < 1.0F) {
               int $$14 = $$0.b() - 20;
               int $$15 = $$5 + 91 + 6;
               if ($$4 == bpj.b) {
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

   private void a(bpz $$0, fav $$1, int $$2) {
      this.X.aI().a("jumpBar");
      float $$3 = this.X.s.v();
      int $$4 = 182;
      int $$5 = (int)($$3 * 183.0F);
      int $$6 = $$1.b() - 32 + 3;
      $$1.a(n, $$2, $$6, 182, 5);
      if ($$0.ab_() > 0) {
         $$1.a(o, $$2, $$6, 182, 5);
      } else if ($$5 > 0) {
         $$1.a(p, 182, 5, 0, 0, $$2, $$6, $$5, 5);
      }

      this.X.aI().c();
   }

   private void a(fav $$0, int $$1) {
      this.X.aI().a("expBar");
      int $$2 = this.X.s.gi();
      if ($$2 > 0) {
         int $$3 = 182;
         int $$4 = (int)(this.X.s.co * 183.0F);
         int $$5 = $$0.b() - 32 + 3;
         $$0.a(q, $$1, $$5, 182, 5);
         if ($$4 > 0) {
            $$0.a(r, 182, 5, 0, 0, $$1, $$5, $$4, 5);
         }
      }

      this.X.aI().c();
   }

   private void m(fav $$0, float $$1) {
      int $$2 = this.X.s.cm;
      if (this.m() && $$2 > 0) {
         this.X.aI().a("expLevel");
         String $$3 = $$2 + "";
         int $$4 = ($$0.a() - this.f().b($$3)) / 2;
         int $$5 = $$0.b() - 31 - 4;
         $$0.a(this.f(), $$3, $$4 + 1, $$5, 0, false);
         $$0.a(this.f(), $$3, $$4 - 1, $$5, 0, false);
         $$0.a(this.f(), $$3, $$4, $$5 + 1, 0, false);
         $$0.a(this.f(), $$3, $$4, $$5 - 1, 0, false);
         $$0.a(this.f(), $$3, $$4, $$5, 8453920, false);
         this.X.aI().c();
      }
   }

   private boolean m() {
      return this.X.s.u() == null && this.X.q.d();
   }

   private void a(fav $$0) {
      this.X.aI().a("selectedItemName");
      if (this.ae > 0 && !this.af.b()) {
         wi $$1 = vu.i().b(this.af.z()).a(this.af.D().e);
         if (this.af.B()) {
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

      this.X.aI().c();
   }

   private void n(fav $$0, float $$1) {
      if (this.X.K()) {
         this.X.aI().a("demo");
         vu $$2;
         if (this.X.r.X() >= 120500L) {
            $$2 = L;
         } else {
            $$2 = vu.a("demo.remainingTime", axr.a((int)(120500L - this.X.r.X()), this.X.r.s().f()));
         }

         int $$4 = this.f().a($$2);
         $$0.b(this.f(), $$2, $$0.a() - $$4 - 10, 5, 16777215);
         this.X.aI().c();
      }
   }

   private void a(fav $$0, eqp $$1) {
      eqx $$2 = $$1.a();
      xk $$3 = $$1.a(xn.c);

      record a(vu a, vu b, int c) {
      }

      a[] $$4 = $$2.i($$1).stream().filter($$0x -> !$$0x.a()).sorted(K).limit(15L).map($$2x -> {
         eqs $$3x = $$2.e($$2x.c());
         vu $$4x = $$2x.b();
         vu $$5x = eqs.a($$3x, $$4x);
         vu $$6x = $$2x.a($$3);
         int $$7x = this.f().a($$6x);
         return new a($$5x, $$6x, $$7x);
      }).toArray(a[]::new);
      vu $$5 = $$1.d();
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
   private ciu n() {
      return this.X.ao() instanceof ciu $$0 ? $$0 : null;
   }

   @Nullable
   private bpp o() {
      ciu $$0 = this.n();
      if ($$0 != null) {
         box $$1 = $$0.cZ();
         if ($$1 == null) {
            return null;
         }

         if ($$1 instanceof bpp) {
            return (bpp)$$1;
         }
      }

      return null;
   }

   private int a(@Nullable bpp $$0) {
      if ($$0 != null && $$0.bD()) {
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

   private void b(fav $$0) {
      ciu $$1 = this.n();
      if ($$1 != null) {
         int $$2 = aww.f($$1.ex());
         boolean $$3 = this.au > (long)this.Z && (this.au - (long)this.Z) / 3L % 2L == 1L;
         long $$4 = ac.b();
         if ($$2 < this.ar && $$1.al > 0) {
            this.at = $$4;
            this.au = (long)(this.Z + 20);
         } else if ($$2 > this.ar && $$1.al > 0) {
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
         clm $$6 = $$1.gj();
         int $$7 = $$6.a();
         int $$8 = $$0.a() / 2 - 91;
         int $$9 = $$0.a() / 2 + 91;
         int $$10 = $$0.b() - 39;
         float $$11 = Math.max((float)$$1.g(bqw.q), (float)Math.max($$5, $$2));
         int $$12 = aww.f($$1.fp());
         int $$13 = aww.f(($$11 + (float)$$12) / 2.0F / 10.0F);
         int $$14 = Math.max(10 - ($$13 - 2), 3);
         int $$15 = $$10 - ($$13 - 1) * $$14 - 10;
         int $$16 = $$10 - 10;
         int $$17 = $$1.eL();
         int $$18 = -1;
         if ($$1.a(bom.j)) {
            $$18 = this.Z % aww.f($$11 + 5.0F);
         }

         this.X.aI().a("armor");

         for (int $$19 = 0; $$19 < 10; $$19++) {
            if ($$17 > 0) {
               int $$20 = $$8 + $$19 * 8;
               if ($$19 * 2 + 1 < $$17) {
                  $$0.a(u, $$20, $$15, 9, 9);
               }

               if ($$19 * 2 + 1 == $$17) {
                  $$0.a(t, $$20, $$15, 9, 9);
               }

               if ($$19 * 2 + 1 > $$17) {
                  $$0.a(s, $$20, $$15, 9, 9);
               }
            }
         }

         this.X.aI().b("health");
         this.a($$0, $$1, $$8, $$10, $$14, $$18, $$11, $$2, $$5, $$12, $$3);
         bpp $$21 = this.o();
         int $$22 = this.a($$21);
         if ($$22 == 0) {
            this.X.aI().b("food");

            for (int $$23 = 0; $$23 < 10; $$23++) {
               int $$24 = $$10;
               ajh $$25;
               ajh $$26;
               ajh $$27;
               if ($$1.a(bom.q)) {
                  $$25 = v;
                  $$26 = w;
                  $$27 = x;
               } else {
                  $$25 = y;
                  $$26 = z;
                  $$27 = A;
               }

               if ($$1.gj().e() <= 0.0F && this.Z % ($$7 * 3 + 1) == 0) {
                  $$24 = $$10 + (this.W.a(3) - 1);
               }

               int $$31 = $$9 - $$23 * 8 - 9;
               $$0.a($$25, $$31, $$24, 9, 9);
               if ($$23 * 2 + 1 < $$7) {
                  $$0.a($$27, $$31, $$24, 9, 9);
               }

               if ($$23 * 2 + 1 == $$7) {
                  $$0.a($$26, $$31, $$24, 9, 9);
               }
            }

            $$16 -= 10;
         }

         this.X.aI().b("air");
         int $$32 = $$1.ch();
         int $$33 = Math.min($$1.ci(), $$32);
         if ($$1.a(aus.a) || $$33 < $$32) {
            int $$34 = this.a($$22) - 1;
            $$16 -= $$34 * 10;
            int $$35 = aww.c((double)($$33 - 2) * 10.0 / (double)$$32);
            int $$36 = aww.c((double)$$33 * 10.0 / (double)$$32) - $$35;

            for (int $$37 = 0; $$37 < $$35 + $$36; $$37++) {
               if ($$37 < $$35) {
                  $$0.a(B, $$9 - $$37 * 8 - 9, $$16, 9, 9);
               } else {
                  $$0.a(C, $$9 - $$37 * 8 - 9, $$16, 9, 9);
               }
            }
         }

         this.X.aI().c();
      }
   }

   private void a(fav $$0, ciu $$1, int $$2, int $$3, int $$4, int $$5, float $$6, int $$7, int $$8, int $$9, boolean $$10) {
      fau.b $$11 = fau.b.a($$1);
      boolean $$12 = $$1.dM().A_().l();
      int $$13 = aww.c((double)$$6 / 2.0);
      int $$14 = aww.c((double)$$9 / 2.0);
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

         this.a($$0, fau.b.a, $$19, $$20, $$12, $$10, false);
         int $$21 = $$16 * 2;
         boolean $$22 = $$16 >= $$13;
         if ($$22) {
            int $$23 = $$21 - $$15;
            if ($$23 < $$9) {
               boolean $$24 = $$23 + 1 == $$9;
               this.a($$0, $$11 == fau.b.d ? $$11 : fau.b.e, $$19, $$20, $$12, false, $$24);
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

   private void a(fav $$0, fau.b $$1, int $$2, int $$3, boolean $$4, boolean $$5, boolean $$6) {
      $$0.a($$1.a($$4, $$6, $$5), $$2, $$3, 9, 9);
   }

   private void c(fav $$0) {
      bpp $$1 = this.o();
      if ($$1 != null) {
         int $$2 = this.a($$1);
         if ($$2 != 0) {
            int $$3 = (int)Math.ceil((double)$$1.ex());
            this.X.aI().b("mountHealth");
            int $$4 = $$0.b() - 39;
            int $$5 = $$0.a() / 2 + 91;
            int $$6 = $$4;

            for (int $$7 = 0; $$2 > 0; $$7 += 20) {
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
            }
         }
      }
   }

   private void a(fav $$0, ajh $$1, float $$2) {
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

   private void o(fav $$0, float $$1) {
      float $$2 = (float)Math.min($$0.a(), $$0.b());
      float $$4 = Math.min((float)$$0.a() / $$2, (float)$$0.b() / $$2) * $$1;
      int $$5 = aww.d($$2 * $$4);
      int $$6 = aww.d($$2 * $$4);
      int $$7 = ($$0.a() - $$5) / 2;
      int $$8 = ($$0.b() - $$6) / 2;
      int $$9 = $$7 + $$5;
      int $$10 = $$8 + $$6;
      RenderSystem.enableBlend();
      $$0.a(I, $$7, $$8, -90, 0.0F, 0.0F, $$5, $$6, $$5, $$6);
      RenderSystem.disableBlend();
      $$0.a(fya.E(), 0, $$10, $$0.a(), $$0.b(), -90, -16777216);
      $$0.a(fya.E(), 0, 0, $$0.a(), $$8, -90, -16777216);
      $$0.a(fya.E(), 0, $$8, $$7, $$10, -90, -16777216);
      $$0.a(fya.E(), $$9, $$8, $$0.a(), $$10, -90, -16777216);
   }

   private void a(box $$0) {
      ib $$1 = ib.a($$0.dr(), $$0.dv(), $$0.dx());
      float $$2 = fxr.a($$0.dM().D_(), $$0.dM().A($$1));
      float $$3 = aww.a(1.0F - $$2, 0.0F, 1.0F);
      this.a = this.a + ($$3 - this.a) * 0.01F;
   }

   private void a(fav $$0, @Nullable box $$1) {
      dos $$2 = this.X.r.C_();
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
         $$3 = aww.a($$3, 0.0F, 1.0F);
         $$0.a(0.0F, $$3, $$3, 1.0F);
      } else {
         float $$7 = this.a;
         $$7 = aww.a($$7, 0.0F, 1.0F);
         $$0.a($$7, $$7, $$7, 1.0F);
      }

      $$0.a(G, 0, 0, -90, 0.0F, 0.0F, $$0.a(), $$0.b(), $$0.a(), $$0.b());
      RenderSystem.depthMask(true);
      RenderSystem.enableDepthTest();
      $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
      RenderSystem.defaultBlendFunc();
      RenderSystem.disableBlend();
   }

   private void p(fav $$0, float $$1) {
      if ($$1 < 1.0F) {
         $$1 *= $$1;
         $$1 *= $$1;
         $$1 = $$1 * 0.8F + 0.2F;
      }

      RenderSystem.disableDepthTest();
      RenderSystem.depthMask(false);
      RenderSystem.enableBlend();
      $$0.a(1.0F, 1.0F, 1.0F, $$1);
      gjc $$2 = this.X.ap().a().a(dae.ed.o());
      $$0.a(0, 0, -90, $$0.a(), $$0.b(), $$2);
      RenderSystem.disableBlend();
      RenderSystem.depthMask(true);
      RenderSystem.enableDepthTest();
      $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
   }

   private void a(fav $$0, int $$1, int $$2, float $$3, ciu $$4, cqm $$5, int $$6) {
      if (!$$5.b()) {
         float $$7 = (float)$$5.L() - $$3;
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
      box $$0 = this.X.ao();
      if ($$0 != null) {
         this.a($$0);
      }

      if (this.X.s != null) {
         cqm $$1 = this.X.s.fZ().f();
         if ($$1.b()) {
            this.ae = 0;
         } else if (this.af.b() || !$$1.a(this.af.d()) || !$$1.z().equals(this.af.z())) {
            this.ae = (int)(40.0 * this.X.m.z().c());
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
      this.av = aww.i(0.2F, this.av, $$1 ? 1.0F : 0.0F);
   }

   public void a(vu $$0) {
      vu $$1 = vu.a("record.nowPlaying", $$0);
      this.a($$1, true);
      this.X.aY().c($$1);
   }

   public void a(vu $$0, boolean $$1) {
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

   public void b(vu $$0) {
      this.an = $$0;
   }

   public void c(vu $$0) {
      this.am = $$0;
      this.al = this.ao + this.ap + this.aq;
   }

   public void c() {
      this.am = null;
      this.an = null;
      this.al = 0;
   }

   public fbj d() {
      return this.Y;
   }

   public int e() {
      return this.Z;
   }

   public fat f() {
      return this.X.h;
   }

   public fdh g() {
      return this.ai;
   }

   public fcj h() {
      return this.aj;
   }

   public void i() {
      this.aj.a();
      this.ak.a();
      this.X.aA().a();
      this.ag.o();
      this.Y.a(true);
   }

   public fbh j() {
      return this.ak;
   }

   public fbq k() {
      return this.ag;
   }

   public void l() {
      this.ag.a();
   }

   private void q(fav $$0, float $$1) {
      if (this.X.m.ad().c() && (this.av > 0.0F || this.aw > 0.0F)) {
         int $$2 = aww.d(255.0F * aww.a(aww.i(this.X.au(), this.aw, this.av), 0.0F, 1.0F));
         if ($$2 > 8) {
            fat $$3 = this.f();
            int $$4 = $$3.a(M);
            int $$5 = 16777215 | $$2 << 24 & 0xFF000000;
            $$0.b($$3, M, $$0.a() - $$4 - 10, $$0.b() - 15, $$5);
         }
      }
   }

   static enum b {
      a(
         new ajh("hud/heart/container"),
         new ajh("hud/heart/container_blinking"),
         new ajh("hud/heart/container"),
         new ajh("hud/heart/container_blinking"),
         new ajh("hud/heart/container_hardcore"),
         new ajh("hud/heart/container_hardcore_blinking"),
         new ajh("hud/heart/container_hardcore"),
         new ajh("hud/heart/container_hardcore_blinking")
      ),
      b(
         new ajh("hud/heart/full"),
         new ajh("hud/heart/full_blinking"),
         new ajh("hud/heart/half"),
         new ajh("hud/heart/half_blinking"),
         new ajh("hud/heart/hardcore_full"),
         new ajh("hud/heart/hardcore_full_blinking"),
         new ajh("hud/heart/hardcore_half"),
         new ajh("hud/heart/hardcore_half_blinking")
      ),
      c(
         new ajh("hud/heart/poisoned_full"),
         new ajh("hud/heart/poisoned_full_blinking"),
         new ajh("hud/heart/poisoned_half"),
         new ajh("hud/heart/poisoned_half_blinking"),
         new ajh("hud/heart/poisoned_hardcore_full"),
         new ajh("hud/heart/poisoned_hardcore_full_blinking"),
         new ajh("hud/heart/poisoned_hardcore_half"),
         new ajh("hud/heart/poisoned_hardcore_half_blinking")
      ),
      d(
         new ajh("hud/heart/withered_full"),
         new ajh("hud/heart/withered_full_blinking"),
         new ajh("hud/heart/withered_half"),
         new ajh("hud/heart/withered_half_blinking"),
         new ajh("hud/heart/withered_hardcore_full"),
         new ajh("hud/heart/withered_hardcore_full_blinking"),
         new ajh("hud/heart/withered_hardcore_half"),
         new ajh("hud/heart/withered_hardcore_half_blinking")
      ),
      e(
         new ajh("hud/heart/absorbing_full"),
         new ajh("hud/heart/absorbing_full_blinking"),
         new ajh("hud/heart/absorbing_half"),
         new ajh("hud/heart/absorbing_half_blinking"),
         new ajh("hud/heart/absorbing_hardcore_full"),
         new ajh("hud/heart/absorbing_hardcore_full_blinking"),
         new ajh("hud/heart/absorbing_hardcore_half"),
         new ajh("hud/heart/absorbing_hardcore_half_blinking")
      ),
      f(
         new ajh("hud/heart/frozen_full"),
         new ajh("hud/heart/frozen_full_blinking"),
         new ajh("hud/heart/frozen_half"),
         new ajh("hud/heart/frozen_half_blinking"),
         new ajh("hud/heart/frozen_hardcore_full"),
         new ajh("hud/heart/frozen_hardcore_full_blinking"),
         new ajh("hud/heart/frozen_hardcore_half"),
         new ajh("hud/heart/frozen_hardcore_half_blinking")
      );

      private final ajh g;
      private final ajh h;
      private final ajh i;
      private final ajh j;
      private final ajh k;
      private final ajh l;
      private final ajh m;
      private final ajh n;

      private b(ajh $$0, ajh $$1, ajh $$2, ajh $$3, ajh $$4, ajh $$5, ajh $$6, ajh $$7) {
         this.g = $$0;
         this.h = $$1;
         this.i = $$2;
         this.j = $$3;
         this.k = $$4;
         this.l = $$5;
         this.m = $$6;
         this.n = $$7;
      }

      public ajh a(boolean $$0, boolean $$1, boolean $$2) {
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

      static fau.b a(ciu $$0) {
         fau.b $$1;
         if ($$0.a(bom.s)) {
            $$1 = c;
         } else if ($$0.a(bom.t)) {
            $$1 = d;
         } else if ($$0.cl()) {
            $$1 = f;
         } else {
            $$1 = b;
         }

         return $$1;
      }
   }
}
