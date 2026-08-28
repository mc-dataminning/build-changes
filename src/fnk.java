import com.google.common.collect.Lists;
import com.google.common.collect.Ordering;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;
import org.joml.Matrix4fStack;

public class fnk {
   private static final alz c = alz.b("hud/crosshair");
   private static final alz d = alz.b("hud/crosshair_attack_indicator_full");
   private static final alz e = alz.b("hud/crosshair_attack_indicator_background");
   private static final alz f = alz.b("hud/crosshair_attack_indicator_progress");
   private static final alz g = alz.b("hud/effect_background_ambient");
   private static final alz h = alz.b("hud/effect_background");
   private static final alz i = alz.b("hud/hotbar");
   private static final alz j = alz.b("hud/hotbar_selection");
   private static final alz k = alz.b("hud/hotbar_offhand_left");
   private static final alz l = alz.b("hud/hotbar_offhand_right");
   private static final alz m = alz.b("hud/hotbar_attack_indicator_background");
   private static final alz n = alz.b("hud/hotbar_attack_indicator_progress");
   private static final alz o = alz.b("hud/jump_bar_background");
   private static final alz p = alz.b("hud/jump_bar_cooldown");
   private static final alz q = alz.b("hud/jump_bar_progress");
   private static final alz r = alz.b("hud/experience_bar_background");
   private static final alz s = alz.b("hud/experience_bar_progress");
   private static final alz t = alz.b("hud/armor_empty");
   private static final alz u = alz.b("hud/armor_half");
   private static final alz v = alz.b("hud/armor_full");
   private static final alz w = alz.b("hud/food_empty_hunger");
   private static final alz x = alz.b("hud/food_half_hunger");
   private static final alz y = alz.b("hud/food_full_hunger");
   private static final alz z = alz.b("hud/food_empty");
   private static final alz A = alz.b("hud/food_half");
   private static final alz B = alz.b("hud/food_full");
   private static final alz C = alz.b("hud/air");
   private static final alz D = alz.b("hud/air_bursting");
   private static final alz E = alz.b("hud/heart/vehicle_container");
   private static final alz F = alz.b("hud/heart/vehicle_full");
   private static final alz G = alz.b("hud/heart/vehicle_half");
   private static final alz H = alz.b("textures/misc/vignette.png");
   public static final alz a = alz.b("textures/misc/nausea.png");
   private static final alz I = alz.b("textures/misc/pumpkinblur.png");
   private static final alz J = alz.b("textures/misc/spyglass_scope.png");
   private static final alz K = alz.b("textures/misc/powder_snow_outline.png");
   private static final Comparator<fcq> L = Comparator.comparing(fcq::d).reversed().thenComparing(fcq::c, String.CASE_INSENSITIVE_ORDER);
   private static final xv M = xv.c("demo.demoExpired");
   private static final xv N = xv.c("menu.savingLevel");
   private static final float O = 5.0F;
   private static final int P = 10;
   private static final int Q = 10;
   private static final String R = ": ";
   private static final float S = 0.2F;
   private static final int T = 9;
   private static final int U = 8;
   private static final float V = 0.2F;
   private static final int W = 5;
   private static final int X = 5;
   private final bam Y = bam.a();
   private final flz Z;
   private final fnz aa;
   private int ab;
   @Nullable
   private xv ac;
   private int ad;
   private boolean ae;
   private boolean af;
   public float b = 1.0F;
   private int ag;
   private cxk ah = cxk.k;
   private final fog ai;
   private final fph aj;
   private final fpz ak;
   private final fpa al;
   private final fnx am;
   private int an;
   @Nullable
   private xv ao;
   @Nullable
   private xv ap;
   private int aq;
   private int ar;
   private int as;
   private int at;
   private int au;
   private long av;
   private long aw;
   private float ax;
   private float ay;
   private final fno az = new fno();
   private float aA;

   public fnk(flz $$0) {
      this.Z = $$0;
      this.ai = new fog($$0);
      this.ak = new fpz($$0);
      this.aa = new fnz($$0);
      this.al = new fpa($$0, this);
      this.am = new fnx($$0);
      this.aj = new fph($$0);
      this.a();
      fno $$1 = new fno().a(this::c).a(this::j).a(this::l).a(this::n).a(this::k).a(($$0x, $$1x) -> this.am.a($$0x));
      fno $$2 = new fno().a(this::o).a(($$0x, $$1x) -> {
         if (this.ai.d()) {
            this.ai.a($$0x);
         }
      }).a(this::h).a(this::e).a(this::f).a(this::g).a(this::i).a(($$0x, $$1x) -> this.aj.a($$0x));
      this.az.a($$1, () -> !$$0.n.X).a(this::d).a($$2, () -> !$$0.n.X);
   }

   public void a() {
      this.aq = 10;
      this.ar = 70;
      this.as = 20;
   }

   public void a(fnl $$0, flp $$1) {
      this.az.a($$0, $$1);
   }

   private void c(fnl $$0, flp $$1) {
      if (flz.N()) {
         this.a($$0, this.Z.ao());
      }

      float $$2 = $$1.a();
      this.aA = bae.h(0.5F * $$2, this.aA, 1.125F);
      if (this.Z.n.aE().a()) {
         if (this.Z.t.gF()) {
            this.a($$0, this.aA);
         } else {
            this.aA = 0.5F;
            cxk $$3 = this.Z.t.gg().g(3);
            if ($$3.a(ayd.co)) {
               this.a($$0, I, 1.0F);
            }
         }
      }

      if (this.Z.t.cu() > 0) {
         this.a($$0, K, this.Z.t.cv());
      }

      float $$4 = bae.h($$1.a(false), this.Z.t.cH, this.Z.t.cG);
      if ($$4 > 0.0F) {
         if (!this.Z.t.b(bum.i)) {
            this.b($$0, $$4);
         } else {
            float $$5 = this.Z.n.am().c().floatValue();
            if ($$5 < 1.0F) {
               float $$6 = $$4 * (1.0F - $$5);
               this.c($$0, $$6);
            }
         }
      }
   }

   private void d(fnl $$0, flp $$1) {
      if (this.Z.t.gl() > 0) {
         bpn.a().a("sleep");
         float $$2 = (float)this.Z.t.gl();
         float $$3 = $$2 / 100.0F;
         if ($$3 > 1.0F) {
            $$3 = 1.0F - ($$2 - 100.0F) / 10.0F;
         }

         int $$4 = (int)(220.0F * $$3) << 24 | 1052704;
         $$0.a(glo.H(), 0, 0, $$0.a(), $$0.b(), $$4);
         bpn.a().c();
      }
   }

   private void e(fnl $$0, flp $$1) {
      fnj $$2 = this.f();
      if (this.ac != null && this.ad > 0) {
         bpn.a().a("overlayMessage");
         float $$3 = (float)this.ad - $$1.a(false);
         int $$4 = (int)($$3 * 255.0F / 20.0F);
         if ($$4 > 255) {
            $$4 = 255;
         }

         if ($$4 > 8) {
            $$0.c().a();
            $$0.c().a((float)($$0.a() / 2), (float)($$0.b() - 68), 0.0F);
            int $$5;
            if (this.ae) {
               $$5 = bae.a($$3 / 50.0F, 0.7F, 0.6F, $$4);
            } else {
               $$5 = ayp.c($$4, -1);
            }

            int $$7 = $$2.a(this.ac);
            $$0.a($$2, this.ac, -$$7 / 2, -4, $$7, $$5);
            $$0.c().b();
         }

         bpn.a().c();
      }
   }

   private void f(fnl $$0, flp $$1) {
      if (this.ao != null && this.an > 0) {
         fnj $$2 = this.f();
         bpn.a().a("titleAndSubtitle");
         float $$3 = (float)this.an - $$1.a(false);
         int $$4 = 255;
         if (this.an > this.as + this.ar) {
            float $$5 = (float)(this.aq + this.ar + this.as) - $$3;
            $$4 = (int)($$5 * 255.0F / (float)this.aq);
         }

         if (this.an <= this.as) {
            $$4 = (int)($$3 * 255.0F / (float)this.as);
         }

         $$4 = bae.a($$4, 0, 255);
         if ($$4 > 8) {
            $$0.c().a();
            $$0.c().a((float)($$0.a() / 2), (float)($$0.b() / 2), 0.0F);
            $$0.c().a();
            $$0.c().b(4.0F, 4.0F, 4.0F);
            int $$6 = $$2.a(this.ao);
            int $$7 = ayp.c($$4, -1);
            $$0.a($$2, this.ao, -$$6 / 2, -10, $$6, $$7);
            $$0.c().b();
            if (this.ap != null) {
               $$0.c().a();
               $$0.c().b(2.0F, 2.0F, 2.0F);
               int $$8 = $$2.a(this.ap);
               $$0.a($$2, this.ap, -$$8 / 2, 5, $$8, $$7);
               $$0.c().b();
            }

            $$0.c().b();
         }

         bpn.a().c();
      }
   }

   private void g(fnl $$0, flp $$1) {
      if (!this.aa.e()) {
         ffo $$2 = this.Z.aO();
         int $$3 = bae.a(this.Z.o.e() * (double)$$2.o() / (double)$$2.m());
         int $$4 = bae.a(this.Z.o.f() * (double)$$2.p() / (double)$$2.n());
         this.aa.a($$0, this.ab, $$3, $$4, false);
      }
   }

   private void h(fnl $$0, flp $$1) {
      fcx $$2 = this.Z.s.Q();
      fcp $$3 = null;
      fcs $$4 = $$2.e(this.Z.t.cI());
      if ($$4 != null) {
         fco $$5 = fco.a($$4.n());
         if ($$5 != null) {
            $$3 = $$2.a($$5);
         }
      }

      fcp $$6 = $$3 != null ? $$3 : $$2.a(fco.b);
      if ($$6 != null) {
         this.a($$0, $$6);
      }
   }

   private void i(fnl $$0, flp $$1) {
      fcx $$2 = this.Z.s.Q();
      fcp $$3 = $$2.a(fco.a);
      if (!this.Z.n.J.e() || this.Z.T() && this.Z.t.i.l().size() <= 1 && $$3 == null) {
         this.al.a(false);
      } else {
         this.al.a(true);
         this.al.a($$0, $$0.a(), $$2, $$3);
      }
   }

   private void j(fnl $$0, flp $$1) {
      fmd $$2 = this.Z.n;
      if ($$2.aE().a()) {
         if (this.Z.r.j() != dgx.d || this.a(this.Z.w)) {
            if (this.ai.d() && !this.Z.t.gx() && !$$2.Y().c()) {
               fli $$3 = this.Z.j.k();
               Matrix4fStack $$4 = RenderSystem.getModelViewStack();
               $$4.pushMatrix();
               $$4.mul($$0.c().c().a());
               $$4.translate((float)($$0.a() / 2), (float)($$0.b() / 2), 0.0F);
               $$4.rotateX(-$$3.d() * (float) (Math.PI / 180.0));
               $$4.rotateY($$3.e() * (float) (Math.PI / 180.0));
               $$4.scale(-1.0F, -1.0F, -1.0F);
               RenderSystem.renderCrosshair(10);
               $$4.popMatrix();
            } else {
               int $$5 = 15;
               $$0.a(glo::D, c, ($$0.a() - 15) / 2, ($$0.b() - 15) / 2, 15, 15);
               if (this.Z.n.F().c() == flh.b) {
                  float $$6 = this.Z.t.H(0.0F);
                  boolean $$7 = false;
                  if (this.Z.v != null && this.Z.v instanceof bwb && $$6 >= 1.0F) {
                     $$7 = this.Z.t.gA() > 5.0F;
                     $$7 &= this.Z.v.bL();
                  }

                  int $$8 = $$0.b() / 2 - 7 + 16;
                  int $$9 = $$0.a() / 2 - 8;
                  if ($$7) {
                     $$0.a(glo::D, d, $$9, $$8, 16, 16);
                  } else if ($$6 < 1.0F) {
                     int $$10 = (int)($$6 * 17.0F);
                     $$0.a(glo::D, e, $$9, $$8, 16, 4);
                     $$0.a(glo::D, f, 16, 4, 0, 0, $$9, $$8, $$10, 4);
                  }
               }
            }
         }
      }
   }

   private boolean a(@Nullable fbq $$0) {
      if ($$0 == null) {
         return false;
      } else if ($$0.d() == fbq.a.c) {
         return ((fbp)$$0).a() instanceof btg;
      } else if ($$0.d() == fbq.a.b) {
         jh $$1 = ((fbo)$$0).b();
         dha $$2 = this.Z.s;
         return $$2.a_($$1).c($$2, $$1) != null;
      } else {
         return false;
      }
   }

   private void k(fnl $$0, flp $$1) {
      Collection<buk> $$2 = this.Z.t.eA();
      if (!$$2.isEmpty() && (this.Z.z == null || !this.Z.z.C())) {
         int $$3 = 0;
         int $$4 = 0;
         hcd $$5 = this.Z.aG();
         List<Runnable> $$6 = Lists.newArrayListWithExpectedSize($$2.size());

         for (buk $$7 : Ordering.natural().reverse().sortedCopy($$2)) {
            jq<bui> $$8 = $$7.c();
            if ($$7.h()) {
               int $$9 = $$0.a();
               int $$10 = 1;
               if (this.Z.K()) {
                  $$10 += 15;
               }

               if ($$8.a().h()) {
                  $$3++;
                  $$9 -= 25 * $$3;
               } else {
                  $$4++;
                  $$9 -= 25 * $$4;
                  $$10 += 26;
               }

               float $$11 = 1.0F;
               if ($$7.f()) {
                  $$0.a(glo::B, g, $$9, $$10, 24, 24);
               } else {
                  $$0.a(glo::B, h, $$9, $$10, 24, 24);
                  if ($$7.a(200)) {
                     int $$12 = $$7.d();
                     int $$13 = 10 - $$12 / 20;
                     $$11 = bae.a((float)$$12 / 10.0F / 5.0F * 0.5F, 0.0F, 0.5F)
                        + bae.b((float)$$12 * (float) Math.PI / 5.0F) * bae.a((float)$$13 / 10.0F * 0.25F, 0.0F, 0.25F);
                     $$11 = bae.a($$11, 0.0F, 1.0F);
                  }
               }

               hbe $$14 = $$5.a($$8);
               int $$15 = $$9;
               int $$16 = $$10;
               float $$17 = $$11;
               $$6.add(() -> {
                  int $$5x = ayp.a($$17);
                  $$0.a(glo::B, $$14, $$15 + 3, $$16 + 3, 18, 18, $$5x);
               });
            }
         }

         $$6.forEach(Runnable::run);
      }
   }

   private void l(fnl $$0, flp $$1) {
      if (this.Z.r.j() == dgx.d) {
         this.ak.a($$0);
      } else {
         this.m($$0, $$1);
      }

      int $$2 = $$0.a() / 2 - 91;
      bwl $$3 = this.Z.t.v();
      if ($$3 != null) {
         this.a($$3, $$0, $$2);
      } else if (this.m()) {
         this.a($$0, $$2);
      }

      if (this.Z.r.a()) {
         this.b($$0);
      }

      this.c($$0);
      if (this.Z.r.j() != dgx.d) {
         this.a($$0);
      } else if (this.Z.t.aa_()) {
         this.ak.b($$0);
      }
   }

   private void m(fnl $$0, flp $$1) {
      cps $$2 = this.n();
      if ($$2 != null) {
         cxk $$3 = $$2.eY();
         bvv $$4 = $$2.fw().e();
         int $$5 = $$0.a() / 2;
         int $$6 = 182;
         int $$7 = 91;
         $$0.c().a();
         $$0.c().a(0.0F, 0.0F, -90.0F);
         $$0.a(glo::B, i, $$5 - 91, $$0.b() - 22, 182, 22);
         $$0.a(glo::B, j, $$5 - 91 - 1 + $$2.gg().j * 20, $$0.b() - 22 - 1, 24, 23);
         if (!$$3.f()) {
            if ($$4 == bvv.a) {
               $$0.a(glo::B, k, $$5 - 91 - 29, $$0.b() - 23, 29, 24);
            } else {
               $$0.a(glo::B, l, $$5 + 91, $$0.b() - 23, 29, 24);
            }
         }

         $$0.c().b();
         int $$8 = 1;

         for (int $$9 = 0; $$9 < 9; $$9++) {
            int $$10 = $$5 - 90 + $$9 * 20 + 2;
            int $$11 = $$0.b() - 16 - 3;
            this.a($$0, $$10, $$11, $$1, $$2, $$2.gg().g.get($$9), $$8++);
         }

         if (!$$3.f()) {
            int $$12 = $$0.b() - 16 - 3;
            if ($$4 == bvv.a) {
               this.a($$0, $$5 - 91 - 26, $$12, $$1, $$2, $$3, $$8++);
            } else {
               this.a($$0, $$5 + 91 + 10, $$12, $$1, $$2, $$3, $$8++);
            }
         }

         if (this.Z.n.F().c() == flh.c) {
            float $$13 = this.Z.t.H(0.0F);
            if ($$13 < 1.0F) {
               int $$14 = $$0.b() - 20;
               int $$15 = $$5 + 91 + 6;
               if ($$4 == bvv.b) {
                  $$15 = $$5 - 91 - 22;
               }

               int $$16 = (int)($$13 * 19.0F);
               $$0.a(glo::B, m, $$15, $$14, 18, 18);
               $$0.a(glo::B, n, 18, 18, 0, 18 - $$16, $$15, $$14 + 18 - $$16, 18, $$16);
            }
         }
      }
   }

   private void a(bwl $$0, fnl $$1, int $$2) {
      bpn.a().a("jumpBar");
      float $$3 = this.Z.t.y();
      int $$4 = 182;
      int $$5 = (int)($$3 * 183.0F);
      int $$6 = $$1.b() - 32 + 3;
      $$1.a(glo::B, o, $$2, $$6, 182, 5);
      if ($$0.c() > 0) {
         $$1.a(glo::B, p, $$2, $$6, 182, 5);
      } else if ($$5 > 0) {
         $$1.a(glo::B, q, 182, 5, 0, 0, $$2, $$6, $$5, 5);
      }

      bpn.a().c();
   }

   private void a(fnl $$0, int $$1) {
      bpn.a().a("expBar");
      int $$2 = this.Z.t.gq();
      if ($$2 > 0) {
         int $$3 = 182;
         int $$4 = (int)(this.Z.t.cs * 183.0F);
         int $$5 = $$0.b() - 32 + 3;
         $$0.a(glo::B, r, $$1, $$5, 182, 5);
         if ($$4 > 0) {
            $$0.a(glo::B, s, 182, 5, 0, 0, $$1, $$5, $$4, 5);
         }
      }

      bpn.a().c();
   }

   private void n(fnl $$0, flp $$1) {
      int $$2 = this.Z.t.cq;
      if (this.m() && $$2 > 0) {
         bpn.a().a("expLevel");
         String $$3 = $$2 + "";
         int $$4 = ($$0.a() - this.f().b($$3)) / 2;
         int $$5 = $$0.b() - 31 - 4;
         $$0.a(this.f(), $$3, $$4 + 1, $$5, 0, false);
         $$0.a(this.f(), $$3, $$4 - 1, $$5, 0, false);
         $$0.a(this.f(), $$3, $$4, $$5 + 1, 0, false);
         $$0.a(this.f(), $$3, $$4, $$5 - 1, 0, false);
         $$0.a(this.f(), $$3, $$4, $$5, 8453920, false);
         bpn.a().c();
      }
   }

   private boolean m() {
      return this.Z.t.v() == null && this.Z.r.d();
   }

   private void a(fnl $$0) {
      bpn.a().a("selectedItemName");
      if (this.ag > 0 && !this.ah.f()) {
         yj $$1 = xv.i().b(this.ah.y()).a(this.ah.C().a());
         if (this.ah.b(ku.g)) {
            $$1.a(n.u);
         }

         int $$2 = this.f().a($$1);
         int $$3 = ($$0.a() - $$2) / 2;
         int $$4 = $$0.b() - 59;
         if (!this.Z.r.a()) {
            $$4 += 14;
         }

         int $$5 = (int)((float)this.ag * 256.0F / 10.0F);
         if ($$5 > 255) {
            $$5 = 255;
         }

         if ($$5 > 0) {
            $$0.a(this.f(), (xv)$$1, $$3, $$4, $$2, ayp.c($$5, -1));
         }
      }

      bpn.a().c();
   }

   private void o(fnl $$0, flp $$1) {
      if (this.Z.K()) {
         bpn.a().a("demo");
         xv $$2;
         if (this.Z.s.ac() >= 120500L) {
            $$2 = M;
         } else {
            $$2 = xv.a("demo.remainingTime", bbb.a((int)(120500L - this.Z.s.ac()), this.Z.s.t().f()));
         }

         int $$4 = this.f().a($$2);
         int $$5 = $$0.a() - $$4 - 10;
         int $$6 = 5;
         $$0.a(this.f(), $$2, $$5, 5, $$4, -1);
         bpn.a().c();
      }
   }

   private void a(fnl $$0, fcp $$1) {
      fcx $$2 = $$1.a();
      zl $$3 = $$1.a(zo.c);

      record a(xv a, xv b, int c) {
      }

      a[] $$4 = $$2.i($$1).stream().filter($$0x -> !$$0x.a()).sorted(L).limit(15L).map($$2x -> {
         fcs $$3x = $$2.e($$2x.c());
         xv $$4x = $$2x.b();
         xv $$5x = fcs.a($$3x, $$4x);
         xv $$6x = $$2x.a($$3);
         int $$7x = this.f().a($$6x);
         return new a($$5x, $$6x, $$7x);
      }).toArray(a[]::new);
      xv $$5 = $$1.d();
      int $$6 = this.f().a($$5);
      int $$7 = $$6;
      int $$8 = this.f().b(": ");

      for (a $$9 : $$4) {
         $$7 = Math.max($$7, this.f().a($$9.a) + ($$9.c > 0 ? $$8 + $$9.c : 0));
      }

      int $$11 = $$4.length;
      int $$12 = $$11 * 9;
      int $$13 = $$0.b() / 2 + $$12 / 3;
      int $$14 = 3;
      int $$15 = $$0.a() - $$7 - 3;
      int $$16 = $$0.a() - 3 + 2;
      int $$17 = this.Z.n.b(0.3F);
      int $$18 = this.Z.n.b(0.4F);
      int $$19 = $$13 - $$11 * 9;
      $$0.a($$15 - 2, $$19 - 9 - 1, $$16, $$19 - 1, $$18);
      $$0.a($$15 - 2, $$19 - 1, $$16, $$13, $$17);
      $$0.a(this.f(), $$5, $$15 + $$7 / 2 - $$6 / 2, $$19 - 9, -1, false);

      for (int $$20 = 0; $$20 < $$11; $$20++) {
         a $$21 = $$4[$$20];
         int $$22 = $$13 - ($$11 - $$20) * 9;
         $$0.a(this.f(), $$21.a, $$15, $$22, -1, false);
         $$0.a(this.f(), $$21.b, $$16 - $$21.c, $$22, -1, false);
      }
   }

   @Nullable
   private cps n() {
      return this.Z.ao() instanceof cps $$0 ? $$0 : null;
   }

   @Nullable
   private bwb o() {
      cps $$0 = this.n();
      if ($$0 != null) {
         bvf $$1 = $$0.dk();
         if ($$1 == null) {
            return null;
         }

         if ($$1 instanceof bwb) {
            return (bwb)$$1;
         }
      }

      return null;
   }

   private int a(@Nullable bwb $$0) {
      if ($$0 != null && $$0.bO()) {
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

   private void b(fnl $$0) {
      cps $$1 = this.n();
      if ($$1 != null) {
         int $$2 = bae.f($$1.eD());
         boolean $$3 = this.aw > (long)this.ab && (this.aw - (long)this.ab) / 3L % 2L == 1L;
         long $$4 = ae.c();
         if ($$2 < this.at && $$1.aj > 0) {
            this.av = $$4;
            this.aw = (long)(this.ab + 20);
         } else if ($$2 > this.at && $$1.aj > 0) {
            this.av = $$4;
            this.aw = (long)(this.ab + 10);
         }

         if ($$4 - this.av > 1000L) {
            this.au = $$2;
            this.av = $$4;
         }

         this.at = $$2;
         int $$5 = this.au;
         this.Y.b((long)(this.ab * 312871));
         int $$6 = $$0.a() / 2 - 91;
         int $$7 = $$0.a() / 2 + 91;
         int $$8 = $$0.b() - 39;
         float $$9 = Math.max((float)$$1.h(bxj.s), (float)Math.max($$5, $$2));
         int $$10 = bae.f($$1.fu());
         int $$11 = bae.f(($$9 + (float)$$10) / 2.0F / 10.0F);
         int $$12 = Math.max(10 - ($$11 - 2), 3);
         int $$13 = $$8 - 10;
         int $$14 = -1;
         if ($$1.b(bum.j)) {
            $$14 = this.ab % bae.f($$9 + 5.0F);
         }

         bpn.a().a("armor");
         a($$0, $$1, $$8, $$11, $$12, $$6);
         bpn.a().b("health");
         this.a($$0, $$1, $$6, $$8, $$12, $$14, $$9, $$2, $$5, $$10, $$3);
         bwb $$15 = this.o();
         int $$16 = this.a($$15);
         if ($$16 == 0) {
            bpn.a().b("food");
            this.a($$0, $$1, $$8, $$7);
            $$13 -= 10;
         }

         bpn.a().b("air");
         int $$17 = $$1.cs();
         int $$18 = Math.min($$1.ct(), $$17);
         if ($$1.a(aya.a) || $$18 < $$17) {
            int $$19 = this.a($$16) - 1;
            $$13 -= $$19 * 10;
            int $$20 = bae.c((double)($$18 - 2) * 10.0 / (double)$$17);
            int $$21 = bae.c((double)$$18 * 10.0 / (double)$$17) - $$20;

            for (int $$22 = 0; $$22 < $$20 + $$21; $$22++) {
               if ($$22 < $$20) {
                  $$0.a(glo::B, C, $$7 - $$22 * 8 - 9, $$13, 9, 9);
               } else {
                  $$0.a(glo::B, D, $$7 - $$22 * 8 - 9, $$13, 9, 9);
               }
            }
         }

         bpn.a().c();
      }
   }

   private static void a(fnl $$0, cps $$1, int $$2, int $$3, int $$4, int $$5) {
      int $$6 = $$1.eO();
      if ($$6 > 0) {
         int $$7 = $$2 - ($$3 - 1) * $$4 - 10;

         for (int $$8 = 0; $$8 < 10; $$8++) {
            int $$9 = $$5 + $$8 * 8;
            if ($$8 * 2 + 1 < $$6) {
               $$0.a(glo::B, v, $$9, $$7, 9, 9);
            }

            if ($$8 * 2 + 1 == $$6) {
               $$0.a(glo::B, u, $$9, $$7, 9, 9);
            }

            if ($$8 * 2 + 1 > $$6) {
               $$0.a(glo::B, t, $$9, $$7, 9, 9);
            }
         }
      }
   }

   private void a(fnl $$0, cps $$1, int $$2, int $$3, int $$4, int $$5, float $$6, int $$7, int $$8, int $$9, boolean $$10) {
      fnk.b $$11 = fnk.b.a($$1);
      boolean $$12 = $$1.dV().D_().l();
      int $$13 = bae.c((double)$$6 / 2.0);
      int $$14 = bae.c((double)$$9 / 2.0);
      int $$15 = $$13 * 2;

      for (int $$16 = $$13 + $$14 - 1; $$16 >= 0; $$16--) {
         int $$17 = $$16 / 10;
         int $$18 = $$16 % 10;
         int $$19 = $$2 + $$18 * 8;
         int $$20 = $$3 - $$17 * $$4;
         if ($$7 + $$9 <= 4) {
            $$20 += this.Y.a(2);
         }

         if ($$16 < $$13 && $$16 == $$5) {
            $$20 -= 2;
         }

         this.a($$0, fnk.b.a, $$19, $$20, $$12, $$10, false);
         int $$21 = $$16 * 2;
         boolean $$22 = $$16 >= $$13;
         if ($$22) {
            int $$23 = $$21 - $$15;
            if ($$23 < $$9) {
               boolean $$24 = $$23 + 1 == $$9;
               this.a($$0, $$11 == fnk.b.d ? $$11 : fnk.b.e, $$19, $$20, $$12, false, $$24);
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

   private void a(fnl $$0, fnk.b $$1, int $$2, int $$3, boolean $$4, boolean $$5, boolean $$6) {
      $$0.a(glo::B, $$1.a($$4, $$6, $$5), $$2, $$3, 9, 9);
   }

   private void a(fnl $$0, cps $$1, int $$2, int $$3) {
      cst $$4 = $$1.gr();
      int $$5 = $$4.a();

      for (int $$6 = 0; $$6 < 10; $$6++) {
         int $$7 = $$2;
         alz $$8;
         alz $$9;
         alz $$10;
         if ($$1.b(bum.q)) {
            $$8 = w;
            $$9 = x;
            $$10 = y;
         } else {
            $$8 = z;
            $$9 = A;
            $$10 = B;
         }

         if ($$1.gr().c() <= 0.0F && this.ab % ($$5 * 3 + 1) == 0) {
            $$7 = $$2 + (this.Y.a(3) - 1);
         }

         int $$14 = $$3 - $$6 * 8 - 9;
         $$0.a(glo::B, $$8, $$14, $$7, 9, 9);
         if ($$6 * 2 + 1 < $$5) {
            $$0.a(glo::B, $$10, $$14, $$7, 9, 9);
         }

         if ($$6 * 2 + 1 == $$5) {
            $$0.a(glo::B, $$9, $$14, $$7, 9, 9);
         }
      }
   }

   private void c(fnl $$0) {
      bwb $$1 = this.o();
      if ($$1 != null) {
         int $$2 = this.a($$1);
         if ($$2 != 0) {
            int $$3 = (int)Math.ceil((double)$$1.eD());
            bpn.a().b("mountHealth");
            int $$4 = $$0.b() - 39;
            int $$5 = $$0.a() / 2 + 91;
            int $$6 = $$4;

            for (int $$7 = 0; $$2 > 0; $$7 += 20) {
               int $$8 = Math.min($$2, 10);
               $$2 -= $$8;

               for (int $$9 = 0; $$9 < $$8; $$9++) {
                  int $$10 = $$5 - $$9 * 8 - 9;
                  $$0.a(glo::B, E, $$10, $$6, 9, 9);
                  if ($$9 * 2 + 1 + $$7 < $$3) {
                     $$0.a(glo::B, F, $$10, $$6, 9, 9);
                  }

                  if ($$9 * 2 + 1 + $$7 == $$3) {
                     $$0.a(glo::B, G, $$10, $$6, 9, 9);
                  }
               }

               $$6 -= 10;
            }
         }
      }
   }

   private void a(fnl $$0, alz $$1, float $$2) {
      int $$3 = ayp.a($$2);
      $$0.a(glo::z, $$1, 0, 0, 0.0F, 0.0F, $$0.a(), $$0.b(), $$0.a(), $$0.b(), $$3);
   }

   private void a(fnl $$0, float $$1) {
      float $$2 = (float)Math.min($$0.a(), $$0.b());
      float $$4 = Math.min((float)$$0.a() / $$2, (float)$$0.b() / $$2) * $$1;
      int $$5 = bae.d($$2 * $$4);
      int $$6 = bae.d($$2 * $$4);
      int $$7 = ($$0.a() - $$5) / 2;
      int $$8 = ($$0.b() - $$6) / 2;
      int $$9 = $$7 + $$5;
      int $$10 = $$8 + $$6;
      $$0.a(glo::B, J, $$7, $$8, 0.0F, 0.0F, $$5, $$6, $$5, $$6);
      $$0.a(glo.H(), 0, $$10, $$0.a(), $$0.b(), -90, -16777216);
      $$0.a(glo.H(), 0, 0, $$0.a(), $$8, -90, -16777216);
      $$0.a(glo.H(), 0, $$8, $$7, $$10, -90, -16777216);
      $$0.a(glo.H(), $$9, $$8, $$0.a(), $$10, -90, -16777216);
   }

   private void a(bvf $$0) {
      jh $$1 = jh.a($$0.dA(), $$0.dE(), $$0.dG());
      float $$2 = glc.a($$0.dV().G_(), $$0.dV().A($$1));
      float $$3 = bae.a(1.0F - $$2, 0.0F, 1.0F);
      this.b = this.b + ($$3 - this.b) * 0.01F;
   }

   private void a(fnl $$0, @Nullable bvf $$1) {
      dzd $$2 = this.Z.s.F_();
      float $$3 = 0.0F;
      if ($$1 != null) {
         float $$4 = (float)$$2.a($$1);
         double $$5 = Math.min($$2.p() * (double)$$2.q() * 1000.0, Math.abs($$2.k() - $$2.i()));
         double $$6 = Math.max((double)$$2.r(), $$5);
         if ((double)$$4 < $$6) {
            $$3 = 1.0F - (float)((double)$$4 / $$6);
         }
      }

      int $$7;
      if ($$3 > 0.0F) {
         $$3 = bae.a($$3, 0.0F, 1.0F);
         $$7 = ayp.a(1.0F, 0.0F, $$3, $$3);
      } else {
         float $$8 = this.b;
         $$8 = bae.a($$8, 0.0F, 1.0F);
         $$7 = ayp.a(1.0F, $$8, $$8, $$8);
      }

      $$0.a(glo::C, H, 0, 0, 0.0F, 0.0F, $$0.a(), $$0.b(), $$0.a(), $$0.b(), $$7);
   }

   private void b(fnl $$0, float $$1) {
      if ($$1 < 1.0F) {
         $$1 *= $$1;
         $$1 *= $$1;
         $$1 = $$1 * 0.8F + 0.2F;
      }

      int $$2 = ayp.a($$1);
      hbe $$3 = this.Z.ap().a().a(dkg.eq.m());
      $$0.a(glo::z, $$3, 0, 0, $$0.a(), $$0.b(), $$2);
   }

   private void c(fnl $$0, float $$1) {
      int $$2 = $$0.a();
      int $$3 = $$0.b();
      $$0.c().a();
      float $$4 = bae.h($$1, 2.0F, 1.0F);
      $$0.c().a((float)$$2 / 2.0F, (float)$$3 / 2.0F, 0.0F);
      $$0.c().b($$4, $$4, $$4);
      $$0.c().a((float)(-$$2) / 2.0F, (float)(-$$3) / 2.0F, 0.0F);
      float $$5 = 0.2F * $$1;
      float $$6 = 0.4F * $$1;
      float $$7 = 0.2F * $$1;
      $$0.a($$0x -> glo.I(), a, 0, 0, 0.0F, 0.0F, $$2, $$3, $$2, $$3, ayp.a(1.0F, $$5, $$6, $$7));
      $$0.c().b();
   }

   private void a(fnl $$0, int $$1, int $$2, flp $$3, cps $$4, cxk $$5, int $$6) {
      if (!$$5.f()) {
         float $$7 = (float)$$5.K() - $$3.a(false);
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

         $$0.a(this.Z.h, $$5, $$1, $$2);
      }
   }

   public void a(boolean $$0) {
      this.q();
      if (!$$0) {
         this.p();
      }
   }

   private void p() {
      if (this.ad > 0) {
         this.ad--;
      }

      if (this.an > 0) {
         this.an--;
         if (this.an <= 0) {
            this.ao = null;
            this.ap = null;
         }
      }

      this.ab++;
      bvf $$0 = this.Z.ao();
      if ($$0 != null) {
         this.a($$0);
      }

      if (this.Z.t != null) {
         cxk $$1 = this.Z.t.gg().f();
         if ($$1.f()) {
            this.ag = 0;
         } else if (this.ah.f() || !$$1.a(this.ah.h()) || !$$1.y().equals(this.ah.y())) {
            this.ag = (int)(40.0 * this.Z.n.D().c());
         } else if (this.ag > 0) {
            this.ag--;
         }

         this.ah = $$1;
      }

      this.aa.a();
   }

   private void q() {
      MinecraftServer $$0 = this.Z.V();
      boolean $$1 = $$0 != null && $$0.bf();
      this.ay = this.ax;
      this.ax = bae.h(0.2F, this.ax, $$1 ? 1.0F : 0.0F);
   }

   public void a(xv $$0) {
      xv $$1 = xv.a("record.nowPlaying", $$0);
      this.a($$1, true);
      this.Z.aZ().c($$1);
   }

   public void a(xv $$0, boolean $$1) {
      this.b(false);
      this.ac = $$0;
      this.ad = 60;
      this.ae = $$1;
   }

   public void b(boolean $$0) {
      this.af = $$0;
   }

   public boolean b() {
      return this.af && this.ad > 0;
   }

   public void a(int $$0, int $$1, int $$2) {
      if ($$0 >= 0) {
         this.aq = $$0;
      }

      if ($$1 >= 0) {
         this.ar = $$1;
      }

      if ($$2 >= 0) {
         this.as = $$2;
      }

      if (this.an > 0) {
         this.an = this.aq + this.ar + this.as;
      }
   }

   public void b(xv $$0) {
      this.ap = $$0;
   }

   public void c(xv $$0) {
      this.ao = $$0;
      this.an = this.aq + this.ar + this.as;
   }

   public void c() {
      this.ao = null;
      this.ap = null;
      this.an = 0;
   }

   public fnz d() {
      return this.aa;
   }

   public int e() {
      return this.ab;
   }

   public fnj f() {
      return this.Z.h;
   }

   public fpz g() {
      return this.ak;
   }

   public fpa h() {
      return this.al;
   }

   public void i() {
      this.al.a();
      this.am.a();
      this.Z.aA().b();
      this.ai.p();
      this.aa.a(true);
   }

   public fnx j() {
      return this.am;
   }

   public fog k() {
      return this.ai;
   }

   public void l() {
      this.ai.a();
   }

   public void b(fnl $$0, flp $$1) {
      if (this.Z.n.ai().c() && (this.ax > 0.0F || this.ay > 0.0F)) {
         int $$2 = bae.d(255.0F * bae.a(bae.h($$1.b(), this.ay, this.ax), 0.0F, 1.0F));
         if ($$2 > 8) {
            fnj $$3 = this.f();
            int $$4 = $$3.a(N);
            int $$5 = ayp.c($$2, -1);
            int $$6 = $$0.a() - $$4 - 5;
            int $$7 = $$0.b() - 9 - 5;
            $$0.a($$3, N, $$6, $$7, $$4, $$5);
         }
      }
   }

   static enum b {
      a(
         alz.b("hud/heart/container"),
         alz.b("hud/heart/container_blinking"),
         alz.b("hud/heart/container"),
         alz.b("hud/heart/container_blinking"),
         alz.b("hud/heart/container_hardcore"),
         alz.b("hud/heart/container_hardcore_blinking"),
         alz.b("hud/heart/container_hardcore"),
         alz.b("hud/heart/container_hardcore_blinking")
      ),
      b(
         alz.b("hud/heart/full"),
         alz.b("hud/heart/full_blinking"),
         alz.b("hud/heart/half"),
         alz.b("hud/heart/half_blinking"),
         alz.b("hud/heart/hardcore_full"),
         alz.b("hud/heart/hardcore_full_blinking"),
         alz.b("hud/heart/hardcore_half"),
         alz.b("hud/heart/hardcore_half_blinking")
      ),
      c(
         alz.b("hud/heart/poisoned_full"),
         alz.b("hud/heart/poisoned_full_blinking"),
         alz.b("hud/heart/poisoned_half"),
         alz.b("hud/heart/poisoned_half_blinking"),
         alz.b("hud/heart/poisoned_hardcore_full"),
         alz.b("hud/heart/poisoned_hardcore_full_blinking"),
         alz.b("hud/heart/poisoned_hardcore_half"),
         alz.b("hud/heart/poisoned_hardcore_half_blinking")
      ),
      d(
         alz.b("hud/heart/withered_full"),
         alz.b("hud/heart/withered_full_blinking"),
         alz.b("hud/heart/withered_half"),
         alz.b("hud/heart/withered_half_blinking"),
         alz.b("hud/heart/withered_hardcore_full"),
         alz.b("hud/heart/withered_hardcore_full_blinking"),
         alz.b("hud/heart/withered_hardcore_half"),
         alz.b("hud/heart/withered_hardcore_half_blinking")
      ),
      e(
         alz.b("hud/heart/absorbing_full"),
         alz.b("hud/heart/absorbing_full_blinking"),
         alz.b("hud/heart/absorbing_half"),
         alz.b("hud/heart/absorbing_half_blinking"),
         alz.b("hud/heart/absorbing_hardcore_full"),
         alz.b("hud/heart/absorbing_hardcore_full_blinking"),
         alz.b("hud/heart/absorbing_hardcore_half"),
         alz.b("hud/heart/absorbing_hardcore_half_blinking")
      ),
      f(
         alz.b("hud/heart/frozen_full"),
         alz.b("hud/heart/frozen_full_blinking"),
         alz.b("hud/heart/frozen_half"),
         alz.b("hud/heart/frozen_half_blinking"),
         alz.b("hud/heart/frozen_hardcore_full"),
         alz.b("hud/heart/frozen_hardcore_full_blinking"),
         alz.b("hud/heart/frozen_hardcore_half"),
         alz.b("hud/heart/frozen_hardcore_half_blinking")
      );

      private final alz g;
      private final alz h;
      private final alz i;
      private final alz j;
      private final alz k;
      private final alz l;
      private final alz m;
      private final alz n;

      private b(final alz $$0, final alz $$1, final alz $$2, final alz $$3, final alz $$4, final alz $$5, final alz $$6, final alz $$7) {
         this.g = $$0;
         this.h = $$1;
         this.i = $$2;
         this.j = $$3;
         this.k = $$4;
         this.l = $$5;
         this.m = $$6;
         this.n = $$7;
      }

      public alz a(boolean $$0, boolean $$1, boolean $$2) {
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

      static fnk.b a(cps $$0) {
         fnk.b $$1;
         if ($$0.b(bum.s)) {
            $$1 = c;
         } else if ($$0.b(bum.t)) {
            $$1 = d;
         } else if ($$0.cw()) {
            $$1 = f;
         } else {
            $$1 = b;
         }

         return $$1;
      }
   }
}
