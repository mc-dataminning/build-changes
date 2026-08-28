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

public class fnp {
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
   private static final Comparator<fcv> L = Comparator.comparing(fcv::d).reversed().thenComparing(fcv::c, String.CASE_INSENSITIVE_ORDER);
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
   private final fme ak;
   private final foe al;
   private int am;
   @Nullable
   private xv an;
   private int ao;
   private boolean ap;
   private boolean aq;
   public float b = 1.0F;
   private int ar;
   private cxo as = cxo.k;
   private final fol at;
   private final fpm au;
   private final fqe av;
   private final fpf aw;
   private final foc ax;
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
   private final fnt aL = new fnt();
   private float aM;

   public fnp(fme $$0) {
      this.ak = $$0;
      this.at = new fol($$0);
      this.av = new fqe($$0);
      this.al = new foe($$0);
      this.aw = new fpf($$0, this);
      this.ax = new foc($$0);
      this.au = new fpm($$0);
      this.a();
      fnt $$1 = new fnt().a(this::c).a(this::j).a(this::l).a(this::n).a(this::k).a(($$0x, $$1x) -> this.ax.a($$0x));
      fnt $$2 = new fnt().a(this::o).a(($$0x, $$1x) -> {
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

   public void a(fnq $$0, flu $$1) {
      this.aL.a($$0, $$1);
   }

   private void c(fnq $$0, flu $$1) {
      if (fme.N()) {
         this.a($$0, this.ak.ao());
      }

      float $$2 = $$1.a();
      this.aM = bae.h(0.5F * $$2, this.aM, 1.125F);
      if (this.ak.n.aE().a()) {
         if (this.ak.t.gF()) {
            this.a($$0, this.aM);
         } else {
            this.aM = 0.5F;

            for (bvr $$3 : bvr.values()) {
               cxo $$4 = this.ak.t.a($$3);
               dft $$5 = $$4.a(ku.D);
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
         if (!this.ak.t.b(buq.i)) {
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

   private void d(fnq $$0, flu $$1) {
      if (this.ak.t.gl() > 0) {
         bpr.a().a("sleep");
         float $$2 = (float)this.ak.t.gl();
         float $$3 = $$2 / 100.0F;
         if ($$3 > 1.0F) {
            $$3 = 1.0F - ($$2 - 100.0F) / 10.0F;
         }

         int $$4 = (int)(220.0F * $$3) << 24 | 1052704;
         $$0.a(glt.H(), 0, 0, $$0.a(), $$0.b(), $$4);
         bpr.a().c();
      }
   }

   private void e(fnq $$0, flu $$1) {
      fno $$2 = this.f();
      if (this.an != null && this.ao > 0) {
         bpr.a().a("overlayMessage");
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

         bpr.a().c();
      }
   }

   private void f(fnq $$0, flu $$1) {
      if (this.az != null && this.ay > 0) {
         fno $$2 = this.f();
         bpr.a().a("titleAndSubtitle");
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

         bpr.a().c();
      }
   }

   private void g(fnq $$0, flu $$1) {
      if (!this.al.e()) {
         fft $$2 = this.ak.aO();
         int $$3 = bae.a(this.ak.o.e() * (double)$$2.o() / (double)$$2.m());
         int $$4 = bae.a(this.ak.o.f() * (double)$$2.p() / (double)$$2.n());
         this.al.a($$0, this.am, $$3, $$4, false);
      }
   }

   private void h(fnq $$0, flu $$1) {
      fdc $$2 = this.ak.s.Q();
      fcu $$3 = null;
      fcx $$4 = $$2.e(this.ak.t.cI());
      if ($$4 != null) {
         fct $$5 = fct.a($$4.n());
         if ($$5 != null) {
            $$3 = $$2.a($$5);
         }
      }

      fcu $$6 = $$3 != null ? $$3 : $$2.a(fct.b);
      if ($$6 != null) {
         this.a($$0, $$6);
      }
   }

   private void i(fnq $$0, flu $$1) {
      fdc $$2 = this.ak.s.Q();
      fcu $$3 = $$2.a(fct.a);
      if (!this.ak.n.J.e() || this.ak.T() && this.ak.t.i.l().size() <= 1 && $$3 == null) {
         this.aw.a(false);
      } else {
         this.aw.a(true);
         this.aw.a($$0, $$0.a(), $$2, $$3);
      }
   }

   private void j(fnq $$0, flu $$1) {
      fmi $$2 = this.ak.n;
      if ($$2.aE().a()) {
         if (this.ak.r.j() != dhe.d || this.a(this.ak.w)) {
            if (this.at.d() && !this.ak.t.gx() && !$$2.Y().c()) {
               fln $$3 = this.ak.j.k();
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
               $$0.a(glt::D, c, ($$0.a() - 15) / 2, ($$0.b() - 15) / 2, 15, 15);
               if (this.ak.n.F().c() == flm.b) {
                  float $$6 = this.ak.t.H(0.0F);
                  boolean $$7 = false;
                  if (this.ak.v != null && this.ak.v instanceof bwf && $$6 >= 1.0F) {
                     $$7 = this.ak.t.gA() > 5.0F;
                     $$7 &= this.ak.v.bL();
                  }

                  int $$8 = $$0.b() / 2 - 7 + 16;
                  int $$9 = $$0.a() / 2 - 8;
                  if ($$7) {
                     $$0.a(glt::D, d, $$9, $$8, 16, 16);
                  } else if ($$6 < 1.0F) {
                     int $$10 = (int)($$6 * 17.0F);
                     $$0.a(glt::D, e, $$9, $$8, 16, 4);
                     $$0.a(glt::D, f, 16, 4, 0, 0, $$9, $$8, $$10, 4);
                  }
               }
            }
         }
      }
   }

   private boolean a(@Nullable fbv $$0) {
      if ($$0 == null) {
         return false;
      } else if ($$0.d() == fbv.a.c) {
         return ((fbu)$$0).a() instanceof btk;
      } else if ($$0.d() == fbv.a.b) {
         jh $$1 = ((fbt)$$0).b();
         dhh $$2 = this.ak.s;
         return $$2.a_($$1).c($$2, $$1) != null;
      } else {
         return false;
      }
   }

   private void k(fnq $$0, flu $$1) {
      Collection<buo> $$2 = this.ak.t.eA();
      if (!$$2.isEmpty() && (this.ak.z == null || !this.ak.z.C())) {
         int $$3 = 0;
         int $$4 = 0;
         hci $$5 = this.ak.aG();
         List<Runnable> $$6 = Lists.newArrayListWithExpectedSize($$2.size());

         for (buo $$7 : Ordering.natural().reverse().sortedCopy($$2)) {
            jq<bum> $$8 = $$7.c();
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
                  $$0.a(glt::B, g, $$9, $$10, 24, 24);
               } else {
                  $$0.a(glt::B, h, $$9, $$10, 24, 24);
                  if ($$7.a(200)) {
                     int $$12 = $$7.d();
                     int $$13 = 10 - $$12 / 20;
                     $$11 = bae.a((float)$$12 / 10.0F / 5.0F * 0.5F, 0.0F, 0.5F)
                        + bae.b((float)$$12 * (float) Math.PI / 5.0F) * bae.a((float)$$13 / 10.0F * 0.25F, 0.0F, 0.25F);
                     $$11 = bae.a($$11, 0.0F, 1.0F);
                  }
               }

               hbj $$14 = $$5.a($$8);
               int $$15 = $$9;
               int $$16 = $$10;
               float $$17 = $$11;
               $$6.add(() -> {
                  int $$5x = ayp.a($$17);
                  $$0.a(glt::B, $$14, $$15 + 3, $$16 + 3, 18, 18, $$5x);
               });
            }
         }

         $$6.forEach(Runnable::run);
      }
   }

   private void l(fnq $$0, flu $$1) {
      if (this.ak.r.j() == dhe.d) {
         this.av.a($$0);
      } else {
         this.m($$0, $$1);
      }

      int $$2 = $$0.a() / 2 - 91;
      bwp $$3 = this.ak.t.v();
      if ($$3 != null) {
         this.a($$3, $$0, $$2);
      } else if (this.m()) {
         this.a($$0, $$2);
      }

      if (this.ak.r.a()) {
         this.b($$0);
      }

      this.c($$0);
      if (this.ak.r.j() != dhe.d) {
         this.a($$0);
      } else if (this.ak.t.aa_()) {
         this.av.b($$0);
      }
   }

   private void m(fnq $$0, flu $$1) {
      cpw $$2 = this.n();
      if ($$2 != null) {
         cxo $$3 = $$2.eY();
         bvz $$4 = $$2.fw().e();
         int $$5 = $$0.a() / 2;
         int $$6 = 182;
         int $$7 = 91;
         $$0.c().a();
         $$0.c().a(0.0F, 0.0F, -90.0F);
         $$0.a(glt::B, i, $$5 - 91, $$0.b() - 22, 182, 22);
         $$0.a(glt::B, j, $$5 - 91 - 1 + $$2.gg().j * 20, $$0.b() - 22 - 1, 24, 23);
         if (!$$3.f()) {
            if ($$4 == bvz.a) {
               $$0.a(glt::B, k, $$5 - 91 - 29, $$0.b() - 23, 29, 24);
            } else {
               $$0.a(glt::B, l, $$5 + 91, $$0.b() - 23, 29, 24);
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
            if ($$4 == bvz.a) {
               this.a($$0, $$5 - 91 - 26, $$12, $$1, $$2, $$3, $$8++);
            } else {
               this.a($$0, $$5 + 91 + 10, $$12, $$1, $$2, $$3, $$8++);
            }
         }

         if (this.ak.n.F().c() == flm.c) {
            float $$13 = this.ak.t.H(0.0F);
            if ($$13 < 1.0F) {
               int $$14 = $$0.b() - 20;
               int $$15 = $$5 + 91 + 6;
               if ($$4 == bvz.b) {
                  $$15 = $$5 - 91 - 22;
               }

               int $$16 = (int)($$13 * 19.0F);
               $$0.a(glt::B, m, $$15, $$14, 18, 18);
               $$0.a(glt::B, n, 18, 18, 0, 18 - $$16, $$15, $$14 + 18 - $$16, 18, $$16);
            }
         }
      }
   }

   private void a(bwp $$0, fnq $$1, int $$2) {
      bpr.a().a("jumpBar");
      float $$3 = this.ak.t.y();
      int $$4 = 182;
      int $$5 = (int)($$3 * 183.0F);
      int $$6 = $$1.b() - 32 + 3;
      $$1.a(glt::B, o, $$2, $$6, 182, 5);
      if ($$0.c() > 0) {
         $$1.a(glt::B, p, $$2, $$6, 182, 5);
      } else if ($$5 > 0) {
         $$1.a(glt::B, q, 182, 5, 0, 0, $$2, $$6, $$5, 5);
      }

      bpr.a().c();
   }

   private void a(fnq $$0, int $$1) {
      bpr.a().a("expBar");
      int $$2 = this.ak.t.gq();
      if ($$2 > 0) {
         int $$3 = 182;
         int $$4 = (int)(this.ak.t.cs * 183.0F);
         int $$5 = $$0.b() - 32 + 3;
         $$0.a(glt::B, r, $$1, $$5, 182, 5);
         if ($$4 > 0) {
            $$0.a(glt::B, s, 182, 5, 0, 0, $$1, $$5, $$4, 5);
         }
      }

      bpr.a().c();
   }

   private void n(fnq $$0, flu $$1) {
      int $$2 = this.ak.t.cq;
      if (this.m() && $$2 > 0) {
         bpr.a().a("expLevel");
         String $$3 = $$2 + "";
         int $$4 = ($$0.a() - this.f().b($$3)) / 2;
         int $$5 = $$0.b() - 31 - 4;
         $$0.a(this.f(), $$3, $$4 + 1, $$5, 0, false);
         $$0.a(this.f(), $$3, $$4 - 1, $$5, 0, false);
         $$0.a(this.f(), $$3, $$4, $$5 + 1, 0, false);
         $$0.a(this.f(), $$3, $$4, $$5 - 1, 0, false);
         $$0.a(this.f(), $$3, $$4, $$5, 8453920, false);
         bpr.a().c();
      }
   }

   private boolean m() {
      return this.ak.t.v() == null && this.ak.r.d();
   }

   private void a(fnq $$0) {
      bpr.a().a("selectedItemName");
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

      bpr.a().c();
   }

   private void o(fnq $$0, flu $$1) {
      if (this.ak.K()) {
         bpr.a().a("demo");
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
         bpr.a().c();
      }
   }

   private void a(fnq $$0, fcu $$1) {
      fdc $$2 = $$1.a();
      zl $$3 = $$1.a(zo.c);

      record a(xv a, xv b, int c) {
      }

      a[] $$4 = $$2.i($$1).stream().filter($$0x -> !$$0x.a()).sorted(L).limit(15L).map($$2x -> {
         fcx $$3x = $$2.e($$2x.c());
         xv $$4x = $$2x.b();
         xv $$5x = fcx.a($$3x, $$4x);
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
   private cpw n() {
      return this.ak.ao() instanceof cpw $$0 ? $$0 : null;
   }

   @Nullable
   private bwf o() {
      cpw $$0 = this.n();
      if ($$0 != null) {
         bvj $$1 = $$0.dk();
         if ($$1 == null) {
            return null;
         }

         if ($$1 instanceof bwf) {
            return (bwf)$$1;
         }
      }

      return null;
   }

   private int a(@Nullable bwf $$0) {
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

   private void b(fnq $$0) {
      cpw $$1 = this.n();
      if ($$1 != null) {
         int $$2 = bae.f($$1.eD());
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
         float $$9 = Math.max((float)$$1.h(bxn.s), (float)Math.max($$5, $$2));
         int $$10 = bae.f($$1.fu());
         int $$11 = bae.f(($$9 + (float)$$10) / 2.0F / 10.0F);
         int $$12 = Math.max(10 - ($$11 - 2), 3);
         int $$13 = $$8 - 10;
         int $$14 = -1;
         if ($$1.b(buq.j)) {
            $$14 = this.am % bae.f($$9 + 5.0F);
         }

         bpr.a().a("armor");
         a($$0, $$1, $$8, $$11, $$12, $$6);
         bpr.a().b("health");
         this.a($$0, $$1, $$6, $$8, $$12, $$14, $$9, $$2, $$5, $$10, $$3);
         bwf $$15 = this.o();
         int $$16 = this.a($$15);
         if ($$16 == 0) {
            bpr.a().b("food");
            this.a($$0, $$1, $$8, $$7);
            $$13 -= 10;
         }

         bpr.a().b("air");
         this.a($$0, $$1, $$16, $$13, $$7);
         bpr.a().c();
      }
   }

   private static void a(fnq $$0, cpw $$1, int $$2, int $$3, int $$4, int $$5) {
      int $$6 = $$1.eO();
      if ($$6 > 0) {
         int $$7 = $$2 - ($$3 - 1) * $$4 - 10;

         for (int $$8 = 0; $$8 < 10; $$8++) {
            int $$9 = $$5 + $$8 * 8;
            if ($$8 * 2 + 1 < $$6) {
               $$0.a(glt::B, v, $$9, $$7, 9, 9);
            }

            if ($$8 * 2 + 1 == $$6) {
               $$0.a(glt::B, u, $$9, $$7, 9, 9);
            }

            if ($$8 * 2 + 1 > $$6) {
               $$0.a(glt::B, t, $$9, $$7, 9, 9);
            }
         }
      }
   }

   private void a(fnq $$0, cpw $$1, int $$2, int $$3, int $$4, int $$5, float $$6, int $$7, int $$8, int $$9, boolean $$10) {
      fnp.b $$11 = fnp.b.a($$1);
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
            $$20 += this.aj.a(2);
         }

         if ($$16 < $$13 && $$16 == $$5) {
            $$20 -= 2;
         }

         this.a($$0, fnp.b.a, $$19, $$20, $$12, $$10, false);
         int $$21 = $$16 * 2;
         boolean $$22 = $$16 >= $$13;
         if ($$22) {
            int $$23 = $$21 - $$15;
            if ($$23 < $$9) {
               boolean $$24 = $$23 + 1 == $$9;
               this.a($$0, $$11 == fnp.b.d ? $$11 : fnp.b.e, $$19, $$20, $$12, false, $$24);
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

   private void a(fnq $$0, fnp.b $$1, int $$2, int $$3, boolean $$4, boolean $$5, boolean $$6) {
      $$0.a(glt::B, $$1.a($$4, $$6, $$5), $$2, $$3, 9, 9);
   }

   private void a(fnq $$0, cpw $$1, int $$2, int $$3, int $$4) {
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
               $$0.a(glt::B, C, $$13, $$3, 9, 9);
            } else if ($$11 && $$12 == $$9 && $$7) {
               $$0.a(glt::B, D, $$13, $$3, 9, 9);
               this.a($$12, $$1, $$10);
            } else if ($$12 > 10 - $$10) {
               int $$14 = $$10 == 10 && this.am % 2 == 0 ? this.aj.a(2) : 0;
               $$0.a(glt::B, E, $$13, $$3 + $$14, 9, 9);
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

   private void a(int $$0, cpw $$1, int $$2) {
      if (this.aI != $$0) {
         float $$3 = 0.5F + 0.1F * (float)Math.max(0, $$2 - 3 + 1);
         float $$4 = 1.0F + 0.1F * (float)Math.max(0, $$2 - 5 + 1);
         $$1.a(axf.dc, $$3, $$4);
         this.aI = $$0;
      }
   }

   private void a(fnq $$0, cpw $$1, int $$2, int $$3) {
      csx $$4 = $$1.gr();
      int $$5 = $$4.a();

      for (int $$6 = 0; $$6 < 10; $$6++) {
         int $$7 = $$2;
         alz $$8;
         alz $$9;
         alz $$10;
         if ($$1.b(buq.q)) {
            $$8 = w;
            $$9 = x;
            $$10 = y;
         } else {
            $$8 = z;
            $$9 = A;
            $$10 = B;
         }

         if ($$1.gr().c() <= 0.0F && this.am % ($$5 * 3 + 1) == 0) {
            $$7 = $$2 + (this.aj.a(3) - 1);
         }

         int $$14 = $$3 - $$6 * 8 - 9;
         $$0.a(glt::B, $$8, $$14, $$7, 9, 9);
         if ($$6 * 2 + 1 < $$5) {
            $$0.a(glt::B, $$10, $$14, $$7, 9, 9);
         }

         if ($$6 * 2 + 1 == $$5) {
            $$0.a(glt::B, $$9, $$14, $$7, 9, 9);
         }
      }
   }

   private void c(fnq $$0) {
      bwf $$1 = this.o();
      if ($$1 != null) {
         int $$2 = this.a($$1);
         if ($$2 != 0) {
            int $$3 = (int)Math.ceil((double)$$1.eD());
            bpr.a().b("mountHealth");
            int $$4 = $$0.b() - 39;
            int $$5 = $$0.a() / 2 + 91;
            int $$6 = $$4;

            for (int $$7 = 0; $$2 > 0; $$7 += 20) {
               int $$8 = Math.min($$2, 10);
               $$2 -= $$8;

               for (int $$9 = 0; $$9 < $$8; $$9++) {
                  int $$10 = $$5 - $$9 * 8 - 9;
                  $$0.a(glt::B, F, $$10, $$6, 9, 9);
                  if ($$9 * 2 + 1 + $$7 < $$3) {
                     $$0.a(glt::B, G, $$10, $$6, 9, 9);
                  }

                  if ($$9 * 2 + 1 + $$7 == $$3) {
                     $$0.a(glt::B, H, $$10, $$6, 9, 9);
                  }
               }

               $$6 -= 10;
            }
         }
      }
   }

   private void a(fnq $$0, alz $$1, float $$2) {
      int $$3 = ayp.a($$2);
      $$0.a(glt::z, $$1, 0, 0, 0.0F, 0.0F, $$0.a(), $$0.b(), $$0.a(), $$0.b(), $$3);
   }

   private void a(fnq $$0, float $$1) {
      float $$2 = (float)Math.min($$0.a(), $$0.b());
      float $$4 = Math.min((float)$$0.a() / $$2, (float)$$0.b() / $$2) * $$1;
      int $$5 = bae.d($$2 * $$4);
      int $$6 = bae.d($$2 * $$4);
      int $$7 = ($$0.a() - $$5) / 2;
      int $$8 = ($$0.b() - $$6) / 2;
      int $$9 = $$7 + $$5;
      int $$10 = $$8 + $$6;
      $$0.a(glt::B, J, $$7, $$8, 0.0F, 0.0F, $$5, $$6, $$5, $$6);
      $$0.a(glt.H(), 0, $$10, $$0.a(), $$0.b(), -90, -16777216);
      $$0.a(glt.H(), 0, 0, $$0.a(), $$8, -90, -16777216);
      $$0.a(glt.H(), 0, $$8, $$7, $$10, -90, -16777216);
      $$0.a(glt.H(), $$9, $$8, $$0.a(), $$10, -90, -16777216);
   }

   private void a(bvj $$0) {
      jh $$1 = jh.a($$0.dA(), $$0.dE(), $$0.dG());
      float $$2 = glh.a($$0.dV().G_(), $$0.dV().A($$1));
      float $$3 = bae.a(1.0F - $$2, 0.0F, 1.0F);
      this.b = this.b + ($$3 - this.b) * 0.01F;
   }

   private void a(fnq $$0, @Nullable bvj $$1) {
      dzk $$2 = this.ak.s.F_();
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

      $$0.a(glt::C, I, 0, 0, 0.0F, 0.0F, $$0.a(), $$0.b(), $$0.a(), $$0.b(), $$7);
   }

   private void b(fnq $$0, float $$1) {
      if ($$1 < 1.0F) {
         $$1 *= $$1;
         $$1 *= $$1;
         $$1 = $$1 * 0.8F + 0.2F;
      }

      int $$2 = ayp.a($$1);
      hbj $$3 = this.ak.ap().a().a(dkn.eq.m());
      $$0.a(glt::z, $$3, 0, 0, $$0.a(), $$0.b(), $$2);
   }

   private void c(fnq $$0, float $$1) {
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
      $$0.a($$0x -> glt.I(), a, 0, 0, 0.0F, 0.0F, $$2, $$3, $$2, $$3, ayp.a(1.0F, $$5, $$6, $$7));
      $$0.c().b();
   }

   private void a(fnq $$0, int $$1, int $$2, flu $$3, cpw $$4, cxo $$5, int $$6) {
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
      bvj $$0 = this.ak.ao();
      if ($$0 != null) {
         this.a($$0);
      }

      if (this.ak.t != null) {
         cxo $$1 = this.ak.t.gg().f();
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

   public foe d() {
      return this.al;
   }

   public int e() {
      return this.am;
   }

   public fno f() {
      return this.ak.h;
   }

   public fqe g() {
      return this.av;
   }

   public fpf h() {
      return this.aw;
   }

   public void i() {
      this.aw.a();
      this.ax.a();
      this.ak.aA().b();
      this.at.p();
      this.al.a(true);
   }

   public foc j() {
      return this.ax;
   }

   public fol k() {
      return this.at;
   }

   public void l() {
      this.at.a();
   }

   public void b(fnq $$0, flu $$1) {
      if (this.ak.n.ai().c() && (this.aJ > 0.0F || this.aK > 0.0F)) {
         int $$2 = bae.d(255.0F * bae.a(bae.h($$1.b(), this.aK, this.aJ), 0.0F, 1.0F));
         if ($$2 > 8) {
            fno $$3 = this.f();
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

      static fnp.b a(cpw $$0) {
         fnp.b $$1;
         if ($$0.b(buq.s)) {
            $$1 = c;
         } else if ($$0.b(buq.t)) {
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
