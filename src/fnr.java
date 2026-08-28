import com.google.common.collect.Lists;
import com.google.common.collect.Ordering;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.function.UnaryOperator;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;
import org.joml.Matrix4fStack;

public class fnr {
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
   private static final alz E = alz.b("hud/air_empty");
   private static final alz F = alz.b("hud/heart/vehicle_container");
   private static final alz G = alz.b("hud/heart/vehicle_full");
   private static final alz H = alz.b("hud/heart/vehicle_half");
   private static final alz I = alz.b("textures/misc/vignette.png");
   public static final alz a = alz.b("textures/misc/nausea.png");
   private static final alz J = alz.b("textures/misc/spyglass_scope.png");
   private static final alz K = alz.b("textures/misc/powder_snow_outline.png");
   private static final Comparator<fcw> L = Comparator.comparing(fcw::d).reversed().thenComparing(fcw::c, String.CASE_INSENSITIVE_ORDER);
   private static final xv M = xv.c("demo.demoExpired");
   private static final xv N = xv.c("menu.savingLevel");
   private static final float O = 5.0F;
   private static final int P = 10;
   private static final int Q = 10;
   private static final String R = ": ";
   private static final float S = 0.2F;
   private static final int T = 9;
   private static final int U = 8;
   private static final int V = 10;
   private static final int W = 9;
   private static final int X = 8;
   private static final int Y = 2;
   private static final int Z = 4;
   private static final float aa = 0.5F;
   private static final float ab = 0.1F;
   private static final float ac = 1.0F;
   private static final float ad = 0.1F;
   private static final int ae = 3;
   private static final int af = 5;
   private static final float ag = 0.2F;
   private static final int ah = 5;
   private static final int ai = 5;
   private final bam aj = bam.a();
   private final fmg ak;
   private final fog al;
   private int am;
   @Nullable
   private xv an;
   private int ao;
   private boolean ap;
   private boolean aq;
   public float b = 1.0F;
   private int ar;
   private cxp as = cxp.j;
   private final fon at;
   private final fpo au;
   private final fqg av;
   private final fph aw;
   private final foe ax;
   private int ay;
   @Nullable
   private xv az;
   @Nullable
   private xv aA;
   private int aB;
   private int aC;
   private int aD;
   private int aE;
   private int aF;
   private long aG;
   private long aH;
   private int aI;
   private float aJ;
   private float aK;
   private final fnv aL = new fnv();
   private float aM;

   public fnr(fmg $$0) {
      this.ak = $$0;
      this.at = new fon($$0);
      this.av = new fqg($$0);
      this.al = new fog($$0);
      this.aw = new fph($$0, this);
      this.ax = new foe($$0);
      this.au = new fpo($$0);
      this.a();
      fnv $$1 = new fnv().a(this::c).a(this::j).a(this::l).a(this::n).a(this::k).a(($$0x, $$1x) -> this.ax.a($$0x));
      fnv $$2 = new fnv().a(this::o).a(($$0x, $$1x) -> {
         if (this.at.d()) {
            this.at.a($$0x);
         }
      }).a(this::h).a(this::e).a(this::f).a(this::g).a(this::i).a(($$0x, $$1x) -> this.au.a($$0x));
      this.aL.a($$1, () -> !$$0.n.X).a(this::d).a($$2, () -> !$$0.n.X);
   }

   public void a() {
      this.aB = 10;
      this.aC = 70;
      this.aD = 20;
   }

   public void a(fns $$0, flw $$1) {
      this.aL.a($$0, $$1);
   }

   private void c(fns $$0, flw $$1) {
      if (fmg.N()) {
         this.a($$0, this.ak.ao());
      }

      float $$2 = $$1.a();
      this.aM = bae.h(0.5F * $$2, this.aM, 1.125F);
      if (this.ak.n.aE().a()) {
         if (this.ak.t.gH()) {
            this.a($$0, this.aM);
         } else {
            this.aM = 0.5F;

            for (bvs $$3 : bvs.values()) {
               cxp $$4 = this.ak.t.a($$3);
               dfu $$5 = $$4.a(ku.D);
               if ($$5 != null && $$5.a() == $$3 && $$5.d().isPresent()) {
                  this.a($$0, $$5.d().get().a((UnaryOperator<String>)($$0x -> "textures/" + $$0x + ".png")), 1.0F);
               }
            }
         }
      }

      if (this.ak.t.cu() > 0) {
         this.a($$0, K, this.ak.t.cv());
      }

      float $$6 = bae.h($$1.a(false), this.ak.t.cH, this.ak.t.cG);
      if ($$6 > 0.0F) {
         if (!this.ak.t.b(bur.i)) {
            this.b($$0, $$6);
         } else {
            float $$7 = this.ak.n.am().c().floatValue();
            if ($$7 < 1.0F) {
               float $$8 = $$6 * (1.0F - $$7);
               this.c($$0, $$8);
            }
         }
      }
   }

   private void d(fns $$0, flw $$1) {
      if (this.ak.t.gn() > 0) {
         bps.a().a("sleep");
         float $$2 = (float)this.ak.t.gn();
         float $$3 = $$2 / 100.0F;
         if ($$3 > 1.0F) {
            $$3 = 1.0F - ($$2 - 100.0F) / 10.0F;
         }

         int $$4 = (int)(220.0F * $$3) << 24 | 1052704;
         $$0.a(glv.H(), 0, 0, $$0.a(), $$0.b(), $$4);
         bps.a().c();
      }
   }

   private void e(fns $$0, flw $$1) {
      fnq $$2 = this.f();
      if (this.an != null && this.ao > 0) {
         bps.a().a("overlayMessage");
         float $$3 = (float)this.ao - $$1.a(false);
         int $$4 = (int)($$3 * 255.0F / 20.0F);
         if ($$4 > 255) {
            $$4 = 255;
         }

         if ($$4 > 8) {
            $$0.c().a();
            $$0.c().a((float)($$0.a() / 2), (float)($$0.b() - 68), 0.0F);
            int $$5;
            if (this.ap) {
               $$5 = bae.a($$3 / 50.0F, 0.7F, 0.6F, $$4);
            } else {
               $$5 = ayp.c($$4, -1);
            }

            int $$7 = $$2.a(this.an);
            $$0.a($$2, this.an, -$$7 / 2, -4, $$7, $$5);
            $$0.c().b();
         }

         bps.a().c();
      }
   }

   private void f(fns $$0, flw $$1) {
      if (this.az != null && this.ay > 0) {
         fnq $$2 = this.f();
         bps.a().a("titleAndSubtitle");
         float $$3 = (float)this.ay - $$1.a(false);
         int $$4 = 255;
         if (this.ay > this.aD + this.aC) {
            float $$5 = (float)(this.aB + this.aC + this.aD) - $$3;
            $$4 = (int)($$5 * 255.0F / (float)this.aB);
         }

         if (this.ay <= this.aD) {
            $$4 = (int)($$3 * 255.0F / (float)this.aD);
         }

         $$4 = bae.a($$4, 0, 255);
         if ($$4 > 8) {
            $$0.c().a();
            $$0.c().a((float)($$0.a() / 2), (float)($$0.b() / 2), 0.0F);
            $$0.c().a();
            $$0.c().b(4.0F, 4.0F, 4.0F);
            int $$6 = $$2.a(this.az);
            int $$7 = ayp.c($$4, -1);
            $$0.a($$2, this.az, -$$6 / 2, -10, $$6, $$7);
            $$0.c().b();
            if (this.aA != null) {
               $$0.c().a();
               $$0.c().b(2.0F, 2.0F, 2.0F);
               int $$8 = $$2.a(this.aA);
               $$0.a($$2, this.aA, -$$8 / 2, 5, $$8, $$7);
               $$0.c().b();
            }

            $$0.c().b();
         }

         bps.a().c();
      }
   }

   private void g(fns $$0, flw $$1) {
      if (!this.al.e()) {
         ffv $$2 = this.ak.aO();
         int $$3 = bae.a(this.ak.o.e() * (double)$$2.o() / (double)$$2.m());
         int $$4 = bae.a(this.ak.o.f() * (double)$$2.p() / (double)$$2.n());
         this.al.a($$0, this.am, $$3, $$4, false);
      }
   }

   private void h(fns $$0, flw $$1) {
      fdd $$2 = this.ak.s.Q();
      fcv $$3 = null;
      fcy $$4 = $$2.e(this.ak.t.cI());
      if ($$4 != null) {
         fcu $$5 = fcu.a($$4.n());
         if ($$5 != null) {
            $$3 = $$2.a($$5);
         }
      }

      fcv $$6 = $$3 != null ? $$3 : $$2.a(fcu.b);
      if ($$6 != null) {
         this.a($$0, $$6);
      }
   }

   private void i(fns $$0, flw $$1) {
      fdd $$2 = this.ak.s.Q();
      fcv $$3 = $$2.a(fcu.a);
      if (!this.ak.n.J.e() || this.ak.T() && this.ak.t.i.l().size() <= 1 && $$3 == null) {
         this.aw.a(false);
      } else {
         this.aw.a(true);
         this.aw.a($$0, $$0.a(), $$2, $$3);
      }
   }

   private void j(fns $$0, flw $$1) {
      fmk $$2 = this.ak.n;
      if ($$2.aE().a()) {
         if (this.ak.r.j() != dhf.d || this.a(this.ak.w)) {
            if (this.at.d() && !this.ak.t.gz() && !$$2.Y().c()) {
               flp $$3 = this.ak.j.k();
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
               $$0.a(glv::E, c, ($$0.a() - 15) / 2, ($$0.b() - 15) / 2, 15, 15);
               if (this.ak.n.F().c() == flo.b) {
                  float $$6 = this.ak.t.H(0.0F);
                  boolean $$7 = false;
                  if (this.ak.v != null && this.ak.v instanceof bwg && $$6 >= 1.0F) {
                     $$7 = this.ak.t.gC() > 5.0F;
                     $$7 &= this.ak.v.bL();
                  }

                  int $$8 = $$0.b() / 2 - 7 + 16;
                  int $$9 = $$0.a() / 2 - 8;
                  if ($$7) {
                     $$0.a(glv::E, d, $$9, $$8, 16, 16);
                  } else if ($$6 < 1.0F) {
                     int $$10 = (int)($$6 * 17.0F);
                     $$0.a(glv::E, e, $$9, $$8, 16, 4);
                     $$0.a(glv::E, f, 16, 4, 0, 0, $$9, $$8, $$10, 4);
                  }
               }
            }
         }
      }
   }

   private boolean a(@Nullable fbw $$0) {
      if ($$0 == null) {
         return false;
      } else if ($$0.d() == fbw.a.c) {
         return ((fbv)$$0).a() instanceof btl;
      } else if ($$0.d() == fbw.a.b) {
         jh $$1 = ((fbu)$$0).b();
         dhi $$2 = this.ak.s;
         return $$2.a_($$1).c($$2, $$1) != null;
      } else {
         return false;
      }
   }

   private void k(fns $$0, flw $$1) {
      Collection<bup> $$2 = this.ak.t.eB();
      if (!$$2.isEmpty() && (this.ak.z == null || !this.ak.z.C())) {
         int $$3 = 0;
         int $$4 = 0;
         hck $$5 = this.ak.aG();
         List<Runnable> $$6 = Lists.newArrayListWithExpectedSize($$2.size());

         for (bup $$7 : Ordering.natural().reverse().sortedCopy($$2)) {
            jq<bun> $$8 = $$7.c();
            if ($$7.h()) {
               int $$9 = $$0.a();
               int $$10 = 1;
               if (this.ak.K()) {
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
                  $$0.a(glv::C, g, $$9, $$10, 24, 24);
               } else {
                  $$0.a(glv::C, h, $$9, $$10, 24, 24);
                  if ($$7.a(200)) {
                     int $$12 = $$7.d();
                     int $$13 = 10 - $$12 / 20;
                     $$11 = bae.a((float)$$12 / 10.0F / 5.0F * 0.5F, 0.0F, 0.5F)
                        + bae.b((float)$$12 * (float) Math.PI / 5.0F) * bae.a((float)$$13 / 10.0F * 0.25F, 0.0F, 0.25F);
                     $$11 = bae.a($$11, 0.0F, 1.0F);
                  }
               }

               hbl $$14 = $$5.a($$8);
               int $$15 = $$9;
               int $$16 = $$10;
               float $$17 = $$11;
               $$6.add(() -> {
                  int $$5x = ayp.a($$17);
                  $$0.a(glv::C, $$14, $$15 + 3, $$16 + 3, 18, 18, $$5x);
               });
            }
         }

         $$6.forEach(Runnable::run);
      }
   }

   private void l(fns $$0, flw $$1) {
      if (this.ak.r.j() == dhf.d) {
         this.av.a($$0);
      } else {
         this.m($$0, $$1);
      }

      int $$2 = $$0.a() / 2 - 91;
      bwq $$3 = this.ak.t.v();
      if ($$3 != null) {
         this.a($$3, $$0, $$2);
      } else if (this.m()) {
         this.a($$0, $$2);
      }

      if (this.ak.r.a()) {
         this.b($$0);
      }

      this.c($$0);
      if (this.ak.r.j() != dhf.d) {
         this.a($$0);
      } else if (this.ak.t.aa_()) {
         this.av.b($$0);
      }
   }

   private void m(fns $$0, flw $$1) {
      cpx $$2 = this.n();
      if ($$2 != null) {
         cxp $$3 = $$2.fa();
         bwa $$4 = $$2.fy().e();
         int $$5 = $$0.a() / 2;
         int $$6 = 182;
         int $$7 = 91;
         $$0.c().a();
         $$0.c().a(0.0F, 0.0F, -90.0F);
         $$0.a(glv::C, i, $$5 - 91, $$0.b() - 22, 182, 22);
         $$0.a(glv::C, j, $$5 - 91 - 1 + $$2.gi().j * 20, $$0.b() - 22 - 1, 24, 23);
         if (!$$3.f()) {
            if ($$4 == bwa.a) {
               $$0.a(glv::C, k, $$5 - 91 - 29, $$0.b() - 23, 29, 24);
            } else {
               $$0.a(glv::C, l, $$5 + 91, $$0.b() - 23, 29, 24);
            }
         }

         $$0.c().b();
         int $$8 = 1;

         for (int $$9 = 0; $$9 < 9; $$9++) {
            int $$10 = $$5 - 90 + $$9 * 20 + 2;
            int $$11 = $$0.b() - 16 - 3;
            this.a($$0, $$10, $$11, $$1, $$2, $$2.gi().g.get($$9), $$8++);
         }

         if (!$$3.f()) {
            int $$12 = $$0.b() - 16 - 3;
            if ($$4 == bwa.a) {
               this.a($$0, $$5 - 91 - 26, $$12, $$1, $$2, $$3, $$8++);
            } else {
               this.a($$0, $$5 + 91 + 10, $$12, $$1, $$2, $$3, $$8++);
            }
         }

         if (this.ak.n.F().c() == flo.c) {
            float $$13 = this.ak.t.H(0.0F);
            if ($$13 < 1.0F) {
               int $$14 = $$0.b() - 20;
               int $$15 = $$5 + 91 + 6;
               if ($$4 == bwa.b) {
                  $$15 = $$5 - 91 - 22;
               }

               int $$16 = (int)($$13 * 19.0F);
               $$0.a(glv::C, m, $$15, $$14, 18, 18);
               $$0.a(glv::C, n, 18, 18, 0, 18 - $$16, $$15, $$14 + 18 - $$16, 18, $$16);
            }
         }
      }
   }

   private void a(bwq $$0, fns $$1, int $$2) {
      bps.a().a("jumpBar");
      float $$3 = this.ak.t.y();
      int $$4 = 182;
      int $$5 = (int)($$3 * 183.0F);
      int $$6 = $$1.b() - 32 + 3;
      $$1.a(glv::C, o, $$2, $$6, 182, 5);
      if ($$0.c() > 0) {
         $$1.a(glv::C, p, $$2, $$6, 182, 5);
      } else if ($$5 > 0) {
         $$1.a(glv::C, q, 182, 5, 0, 0, $$2, $$6, $$5, 5);
      }

      bps.a().c();
   }

   private void a(fns $$0, int $$1) {
      bps.a().a("expBar");
      int $$2 = this.ak.t.gs();
      if ($$2 > 0) {
         int $$3 = 182;
         int $$4 = (int)(this.ak.t.cs * 183.0F);
         int $$5 = $$0.b() - 32 + 3;
         $$0.a(glv::C, r, $$1, $$5, 182, 5);
         if ($$4 > 0) {
            $$0.a(glv::C, s, 182, 5, 0, 0, $$1, $$5, $$4, 5);
         }
      }

      bps.a().c();
   }

   private void n(fns $$0, flw $$1) {
      int $$2 = this.ak.t.cq;
      if (this.m() && $$2 > 0) {
         bps.a().a("expLevel");
         String $$3 = $$2 + "";
         int $$4 = ($$0.a() - this.f().b($$3)) / 2;
         int $$5 = $$0.b() - 31 - 4;
         $$0.a(this.f(), $$3, $$4 + 1, $$5, 0, false);
         $$0.a(this.f(), $$3, $$4 - 1, $$5, 0, false);
         $$0.a(this.f(), $$3, $$4, $$5 + 1, 0, false);
         $$0.a(this.f(), $$3, $$4, $$5 - 1, 0, false);
         $$0.a(this.f(), $$3, $$4, $$5, 8453920, false);
         bps.a().c();
      }
   }

   private boolean m() {
      return this.ak.t.v() == null && this.ak.r.d();
   }

   private void a(fns $$0) {
      bps.a().a("selectedItemName");
      if (this.ar > 0 && !this.as.f()) {
         yj $$1 = xv.i().b(this.as.y()).a(this.as.C().a());
         if (this.as.b(ku.g)) {
            $$1.a(n.u);
         }

         int $$2 = this.f().a($$1);
         int $$3 = ($$0.a() - $$2) / 2;
         int $$4 = $$0.b() - 59;
         if (!this.ak.r.a()) {
            $$4 += 14;
         }

         int $$5 = (int)((float)this.ar * 256.0F / 10.0F);
         if ($$5 > 255) {
            $$5 = 255;
         }

         if ($$5 > 0) {
            $$0.a(this.f(), (xv)$$1, $$3, $$4, $$2, ayp.c($$5, -1));
         }
      }

      bps.a().c();
   }

   private void o(fns $$0, flw $$1) {
      if (this.ak.K()) {
         bps.a().a("demo");
         xv $$2;
         if (this.ak.s.ac() >= 120500L) {
            $$2 = M;
         } else {
            $$2 = xv.a("demo.remainingTime", bbb.a((int)(120500L - this.ak.s.ac()), this.ak.s.t().f()));
         }

         int $$4 = this.f().a($$2);
         int $$5 = $$0.a() - $$4 - 10;
         int $$6 = 5;
         $$0.a(this.f(), $$2, $$5, 5, $$4, -1);
         bps.a().c();
      }
   }

   private void a(fns $$0, fcv $$1) {
      fdd $$2 = $$1.a();
      zl $$3 = $$1.a(zo.c);

      record a(xv a, xv b, int c) {
      }

      a[] $$4 = $$2.i($$1).stream().filter($$0x -> !$$0x.a()).sorted(L).limit(15L).map($$2x -> {
         fcy $$3x = $$2.e($$2x.c());
         xv $$4x = $$2x.b();
         xv $$5x = fcy.a($$3x, $$4x);
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
      int $$17 = this.ak.n.b(0.3F);
      int $$18 = this.ak.n.b(0.4F);
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
   private cpx n() {
      return this.ak.ao() instanceof cpx $$0 ? $$0 : null;
   }

   @Nullable
   private bwg o() {
      cpx $$0 = this.n();
      if ($$0 != null) {
         bvk $$1 = $$0.dl();
         if ($$1 == null) {
            return null;
         }

         if ($$1 instanceof bwg) {
            return (bwg)$$1;
         }
      }

      return null;
   }

   private int a(@Nullable bwg $$0) {
      if ($$0 != null && $$0.bO()) {
         float $$1 = $$0.eS();
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

   private void b(fns $$0) {
      cpx $$1 = this.n();
      if ($$1 != null) {
         int $$2 = bae.f($$1.eE());
         boolean $$3 = this.aH > (long)this.am && (this.aH - (long)this.am) / 3L % 2L == 1L;
         long $$4 = ae.c();
         if ($$2 < this.aE && $$1.aj > 0) {
            this.aG = $$4;
            this.aH = (long)(this.am + 20);
         } else if ($$2 > this.aE && $$1.aj > 0) {
            this.aG = $$4;
            this.aH = (long)(this.am + 10);
         }

         if ($$4 - this.aG > 1000L) {
            this.aF = $$2;
            this.aG = $$4;
         }

         this.aE = $$2;
         int $$5 = this.aF;
         this.aj.b((long)(this.am * 312871));
         int $$6 = $$0.a() / 2 - 91;
         int $$7 = $$0.a() / 2 + 91;
         int $$8 = $$0.b() - 39;
         float $$9 = Math.max((float)$$1.h(bxo.s), (float)Math.max($$5, $$2));
         int $$10 = bae.f($$1.fw());
         int $$11 = bae.f(($$9 + (float)$$10) / 2.0F / 10.0F);
         int $$12 = Math.max(10 - ($$11 - 2), 3);
         int $$13 = $$8 - 10;
         int $$14 = -1;
         if ($$1.b(bur.j)) {
            $$14 = this.am % bae.f($$9 + 5.0F);
         }

         bps.a().a("armor");
         a($$0, $$1, $$8, $$11, $$12, $$6);
         bps.a().b("health");
         this.a($$0, $$1, $$6, $$8, $$12, $$14, $$9, $$2, $$5, $$10, $$3);
         bwg $$15 = this.o();
         int $$16 = this.a($$15);
         if ($$16 == 0) {
            bps.a().b("food");
            this.a($$0, $$1, $$8, $$7);
            $$13 -= 10;
         }

         bps.a().b("air");
         this.a($$0, $$1, $$16, $$13, $$7);
         bps.a().c();
      }
   }

   private static void a(fns $$0, cpx $$1, int $$2, int $$3, int $$4, int $$5) {
      int $$6 = $$1.eP();
      if ($$6 > 0) {
         int $$7 = $$2 - ($$3 - 1) * $$4 - 10;

         for (int $$8 = 0; $$8 < 10; $$8++) {
            int $$9 = $$5 + $$8 * 8;
            if ($$8 * 2 + 1 < $$6) {
               $$0.a(glv::C, v, $$9, $$7, 9, 9);
            }

            if ($$8 * 2 + 1 == $$6) {
               $$0.a(glv::C, u, $$9, $$7, 9, 9);
            }

            if ($$8 * 2 + 1 > $$6) {
               $$0.a(glv::C, t, $$9, $$7, 9, 9);
            }
         }
      }
   }

   private void a(fns $$0, cpx $$1, int $$2, int $$3, int $$4, int $$5, float $$6, int $$7, int $$8, int $$9, boolean $$10) {
      fnr.b $$11 = fnr.b.a($$1);
      boolean $$12 = $$1.dW().D_().l();
      int $$13 = bae.c((double)$$6 / 2.0);
      int $$14 = bae.c((double)$$9 / 2.0);
      int $$15 = $$13 * 2;

      for (int $$16 = $$13 + $$14 - 1; $$16 >= 0; $$16--) {
         int $$17 = $$16 / 10;
         int $$18 = $$16 % 10;
         int $$19 = $$2 + $$18 * 8;
         int $$20 = $$3 - $$17 * $$4;
         if ($$7 + $$9 <= 4) {
            $$20 += this.aj.a(2);
         }

         if ($$16 < $$13 && $$16 == $$5) {
            $$20 -= 2;
         }

         this.a($$0, fnr.b.a, $$19, $$20, $$12, $$10, false);
         int $$21 = $$16 * 2;
         boolean $$22 = $$16 >= $$13;
         if ($$22) {
            int $$23 = $$21 - $$15;
            if ($$23 < $$9) {
               boolean $$24 = $$23 + 1 == $$9;
               this.a($$0, $$11 == fnr.b.d ? $$11 : fnr.b.e, $$19, $$20, $$12, false, $$24);
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

   private void a(fns $$0, fnr.b $$1, int $$2, int $$3, boolean $$4, boolean $$5, boolean $$6) {
      $$0.a(glv::C, $$1.a($$4, $$6, $$5), $$2, $$3, 9, 9);
   }

   private void a(fns $$0, cpx $$1, int $$2, int $$3, int $$4) {
      int $$5 = $$1.cs();
      int $$6 = Math.clamp((long)$$1.ct(), 0, $$5);
      boolean $$7 = $$1.a(aya.a);
      if ($$7 || $$6 < $$5) {
         $$3 = this.a($$2, $$3);
         int $$8 = b($$6, $$5, -2);
         int $$9 = b($$6, $$5, 0);
         int $$10 = 10 - b($$6, $$5, a($$6, $$7));
         boolean $$11 = $$8 != $$9;
         if (!$$7) {
            this.aI = 0;
         }

         for (int $$12 = 1; $$12 <= 10; $$12++) {
            int $$13 = $$4 - ($$12 - 1) * 8 - 9;
            if ($$12 <= $$8) {
               $$0.a(glv::C, C, $$13, $$3, 9, 9);
            } else if ($$11 && $$12 == $$9 && $$7) {
               $$0.a(glv::C, D, $$13, $$3, 9, 9);
               this.a($$12, $$1, $$10);
            } else if ($$12 > 10 - $$10) {
               int $$14 = $$10 == 10 && this.am % 2 == 0 ? this.aj.a(2) : 0;
               $$0.a(glv::C, E, $$13, $$3 + $$14, 9, 9);
            }
         }
      }
   }

   private int a(int $$0, int $$1) {
      int $$2 = this.a($$0) - 1;
      return $$1 - $$2 * 10;
   }

   private static int b(int $$0, int $$1, int $$2) {
      return bae.f((float)(($$0 + $$2) * 10) / (float)$$1);
   }

   private static int a(int $$0, boolean $$1) {
      return $$0 != 0 && $$1 ? 4 : 0;
   }

   private void a(int $$0, cpx $$1, int $$2) {
      if (this.aI != $$0) {
         float $$3 = 0.5F + 0.1F * (float)Math.max(0, $$2 - 3 + 1);
         float $$4 = 1.0F + 0.1F * (float)Math.max(0, $$2 - 5 + 1);
         $$1.a(axf.dc, $$3, $$4);
         this.aI = $$0;
      }
   }

   private void a(fns $$0, cpx $$1, int $$2, int $$3) {
      csy $$4 = $$1.gt();
      int $$5 = $$4.a();

      for (int $$6 = 0; $$6 < 10; $$6++) {
         int $$7 = $$2;
         alz $$8;
         alz $$9;
         alz $$10;
         if ($$1.b(bur.q)) {
            $$8 = w;
            $$9 = x;
            $$10 = y;
         } else {
            $$8 = z;
            $$9 = A;
            $$10 = B;
         }

         if ($$1.gt().c() <= 0.0F && this.am % ($$5 * 3 + 1) == 0) {
            $$7 = $$2 + (this.aj.a(3) - 1);
         }

         int $$14 = $$3 - $$6 * 8 - 9;
         $$0.a(glv::C, $$8, $$14, $$7, 9, 9);
         if ($$6 * 2 + 1 < $$5) {
            $$0.a(glv::C, $$10, $$14, $$7, 9, 9);
         }

         if ($$6 * 2 + 1 == $$5) {
            $$0.a(glv::C, $$9, $$14, $$7, 9, 9);
         }
      }
   }

   private void c(fns $$0) {
      bwg $$1 = this.o();
      if ($$1 != null) {
         int $$2 = this.a($$1);
         if ($$2 != 0) {
            int $$3 = (int)Math.ceil((double)$$1.eE());
            bps.a().b("mountHealth");
            int $$4 = $$0.b() - 39;
            int $$5 = $$0.a() / 2 + 91;
            int $$6 = $$4;

            for (int $$7 = 0; $$2 > 0; $$7 += 20) {
               int $$8 = Math.min($$2, 10);
               $$2 -= $$8;

               for (int $$9 = 0; $$9 < $$8; $$9++) {
                  int $$10 = $$5 - $$9 * 8 - 9;
                  $$0.a(glv::C, F, $$10, $$6, 9, 9);
                  if ($$9 * 2 + 1 + $$7 < $$3) {
                     $$0.a(glv::C, G, $$10, $$6, 9, 9);
                  }

                  if ($$9 * 2 + 1 + $$7 == $$3) {
                     $$0.a(glv::C, H, $$10, $$6, 9, 9);
                  }
               }

               $$6 -= 10;
            }
         }
      }
   }

   private void a(fns $$0, alz $$1, float $$2) {
      int $$3 = ayp.a($$2);
      $$0.a(glv::A, $$1, 0, 0, 0.0F, 0.0F, $$0.a(), $$0.b(), $$0.a(), $$0.b(), $$3);
   }

   private void a(fns $$0, float $$1) {
      float $$2 = (float)Math.min($$0.a(), $$0.b());
      float $$4 = Math.min((float)$$0.a() / $$2, (float)$$0.b() / $$2) * $$1;
      int $$5 = bae.d($$2 * $$4);
      int $$6 = bae.d($$2 * $$4);
      int $$7 = ($$0.a() - $$5) / 2;
      int $$8 = ($$0.b() - $$6) / 2;
      int $$9 = $$7 + $$5;
      int $$10 = $$8 + $$6;
      $$0.a(glv::C, J, $$7, $$8, 0.0F, 0.0F, $$5, $$6, $$5, $$6);
      $$0.a(glv.H(), 0, $$10, $$0.a(), $$0.b(), -90, -16777216);
      $$0.a(glv.H(), 0, 0, $$0.a(), $$8, -90, -16777216);
      $$0.a(glv.H(), 0, $$8, $$7, $$10, -90, -16777216);
      $$0.a(glv.H(), $$9, $$8, $$0.a(), $$10, -90, -16777216);
   }

   private void a(bvk $$0) {
      jh $$1 = jh.a($$0.dB(), $$0.dF(), $$0.dH());
      float $$2 = glj.a($$0.dW().G_(), $$0.dW().A($$1));
      float $$3 = bae.a(1.0F - $$2, 0.0F, 1.0F);
      this.b = this.b + ($$3 - this.b) * 0.01F;
   }

   private void a(fns $$0, @Nullable bvk $$1) {
      dzl $$2 = this.ak.s.F_();
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

      $$0.a(glv::D, I, 0, 0, 0.0F, 0.0F, $$0.a(), $$0.b(), $$0.a(), $$0.b(), $$7);
   }

   private void b(fns $$0, float $$1) {
      if ($$1 < 1.0F) {
         $$1 *= $$1;
         $$1 *= $$1;
         $$1 = $$1 * 0.8F + 0.2F;
      }

      int $$2 = ayp.a($$1);
      hbl $$3 = this.ak.ap().a().a(dko.eq.m());
      $$0.a(glv::A, $$3, 0, 0, $$0.a(), $$0.b(), $$2);
   }

   private void c(fns $$0, float $$1) {
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
      $$0.a($$0x -> glv.I(), a, 0, 0, 0.0F, 0.0F, $$2, $$3, $$2, $$3, ayp.a(1.0F, $$5, $$6, $$7));
      $$0.c().b();
   }

   private void a(fns $$0, int $$1, int $$2, flw $$3, cpx $$4, cxp $$5, int $$6) {
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

         $$0.a(this.ak.h, $$5, $$1, $$2);
      }
   }

   public void a(boolean $$0) {
      this.q();
      if (!$$0) {
         this.p();
      }
   }

   private void p() {
      if (this.ao > 0) {
         this.ao--;
      }

      if (this.ay > 0) {
         this.ay--;
         if (this.ay <= 0) {
            this.az = null;
            this.aA = null;
         }
      }

      this.am++;
      bvk $$0 = this.ak.ao();
      if ($$0 != null) {
         this.a($$0);
      }

      if (this.ak.t != null) {
         cxp $$1 = this.ak.t.gi().f();
         if ($$1.f()) {
            this.ar = 0;
         } else if (this.as.f() || !$$1.a(this.as.h()) || !$$1.y().equals(this.as.y())) {
            this.ar = (int)(40.0 * this.ak.n.D().c());
         } else if (this.ar > 0) {
            this.ar--;
         }

         this.as = $$1;
      }

      this.al.a();
   }

   private void q() {
      MinecraftServer $$0 = this.ak.V();
      boolean $$1 = $$0 != null && $$0.bf();
      this.aK = this.aJ;
      this.aJ = bae.h(0.2F, this.aJ, $$1 ? 1.0F : 0.0F);
   }

   public void a(xv $$0) {
      xv $$1 = xv.a("record.nowPlaying", $$0);
      this.a($$1, true);
      this.ak.aZ().c($$1);
   }

   public void a(xv $$0, boolean $$1) {
      this.b(false);
      this.an = $$0;
      this.ao = 60;
      this.ap = $$1;
   }

   public void b(boolean $$0) {
      this.aq = $$0;
   }

   public boolean b() {
      return this.aq && this.ao > 0;
   }

   public void a(int $$0, int $$1, int $$2) {
      if ($$0 >= 0) {
         this.aB = $$0;
      }

      if ($$1 >= 0) {
         this.aC = $$1;
      }

      if ($$2 >= 0) {
         this.aD = $$2;
      }

      if (this.ay > 0) {
         this.ay = this.aB + this.aC + this.aD;
      }
   }

   public void b(xv $$0) {
      this.aA = $$0;
   }

   public void c(xv $$0) {
      this.az = $$0;
      this.ay = this.aB + this.aC + this.aD;
   }

   public void c() {
      this.az = null;
      this.aA = null;
      this.ay = 0;
   }

   public fog d() {
      return this.al;
   }

   public int e() {
      return this.am;
   }

   public fnq f() {
      return this.ak.h;
   }

   public fqg g() {
      return this.av;
   }

   public fph h() {
      return this.aw;
   }

   public void i() {
      this.aw.a();
      this.ax.a();
      this.ak.aA().b();
      this.at.p();
      this.al.a(true);
   }

   public foe j() {
      return this.ax;
   }

   public fon k() {
      return this.at;
   }

   public void l() {
      this.at.a();
   }

   public void b(fns $$0, flw $$1) {
      if (this.ak.n.ai().c() && (this.aJ > 0.0F || this.aK > 0.0F)) {
         int $$2 = bae.d(255.0F * bae.a(bae.h($$1.b(), this.aK, this.aJ), 0.0F, 1.0F));
         if ($$2 > 8) {
            fnq $$3 = this.f();
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

      static fnr.b a(cpx $$0) {
         fnr.b $$1;
         if ($$0.b(bur.s)) {
            $$1 = c;
         } else if ($$0.b(bur.t)) {
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
