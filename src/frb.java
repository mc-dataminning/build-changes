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

public class frb {
   private static final ale c = ale.b("hud/crosshair");
   private static final ale d = ale.b("hud/crosshair_attack_indicator_full");
   private static final ale e = ale.b("hud/crosshair_attack_indicator_background");
   private static final ale f = ale.b("hud/crosshair_attack_indicator_progress");
   private static final ale g = ale.b("hud/effect_background_ambient");
   private static final ale h = ale.b("hud/effect_background");
   private static final ale i = ale.b("hud/hotbar");
   private static final ale j = ale.b("hud/hotbar_selection");
   private static final ale k = ale.b("hud/hotbar_offhand_left");
   private static final ale l = ale.b("hud/hotbar_offhand_right");
   private static final ale m = ale.b("hud/hotbar_attack_indicator_background");
   private static final ale n = ale.b("hud/hotbar_attack_indicator_progress");
   private static final ale o = ale.b("hud/jump_bar_background");
   private static final ale p = ale.b("hud/jump_bar_cooldown");
   private static final ale q = ale.b("hud/jump_bar_progress");
   private static final ale r = ale.b("hud/experience_bar_background");
   private static final ale s = ale.b("hud/experience_bar_progress");
   private static final ale t = ale.b("hud/armor_empty");
   private static final ale u = ale.b("hud/armor_half");
   private static final ale v = ale.b("hud/armor_full");
   private static final ale w = ale.b("hud/food_empty_hunger");
   private static final ale x = ale.b("hud/food_half_hunger");
   private static final ale y = ale.b("hud/food_full_hunger");
   private static final ale z = ale.b("hud/food_empty");
   private static final ale A = ale.b("hud/food_half");
   private static final ale B = ale.b("hud/food_full");
   private static final ale C = ale.b("hud/air");
   private static final ale D = ale.b("hud/air_bursting");
   private static final ale E = ale.b("hud/air_empty");
   private static final ale F = ale.b("hud/heart/vehicle_container");
   private static final ale G = ale.b("hud/heart/vehicle_full");
   private static final ale H = ale.b("hud/heart/vehicle_half");
   private static final ale I = ale.b("textures/misc/vignette.png");
   public static final ale a = ale.b("textures/misc/nausea.png");
   private static final ale J = ale.b("textures/misc/spyglass_scope.png");
   private static final ale K = ale.b("textures/misc/powder_snow_outline.png");
   private static final Comparator<feu> L = Comparator.comparing(feu::d).reversed().thenComparing(feu::c, String.CASE_INSENSITIVE_ORDER);
   private static final ww M = ww.c("demo.demoExpired");
   private static final ww N = ww.c("menu.savingLevel");
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
   private static final int Z = 1;
   private static final float aa = 0.5F;
   private static final float ab = 0.1F;
   private static final float ac = 1.0F;
   private static final float ad = 0.1F;
   private static final int ae = 3;
   private static final int af = 5;
   private static final float ag = 0.2F;
   private static final int ah = 5;
   private static final int ai = 5;
   private final azt aj = azt.a();
   private final fof ak;
   private final frr al;
   private int am;
   @Nullable
   private ww an;
   private int ao;
   private boolean ap;
   private boolean aq;
   public float b = 1.0F;
   private int ar;
   private cys as = cys.k;
   private final fry at;
   private final fsy au;
   private final ftq av;
   private final fsr aw;
   private final frp ax;
   private int ay;
   @Nullable
   private ww az;
   @Nullable
   private ww aA;
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
   private final frf aL = new frf();
   private float aM;

   public frb(fof $$0) {
      this.ak = $$0;
      this.at = new fry($$0);
      this.av = new ftq($$0);
      this.al = new frr($$0);
      this.aw = new fsr($$0, this);
      this.ax = new frp($$0);
      this.au = new fsy($$0);
      this.a();
      frf $$1 = new frf().a(this::c).a(this::j).a(this::l).a(this::n).a(this::k).a(($$0x, $$1x) -> this.ax.a($$0x));
      frf $$2 = new frf().a(this::o).a(($$0x, $$1x) -> {
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

   public void a(frc $$0, fnv $$1) {
      this.aL.a($$0, $$1);
   }

   private void c(frc $$0, fnv $$1) {
      if (fof.N()) {
         this.a($$0, this.ak.ao());
      }

      goa $$2 = this.ak.t;
      float $$3 = $$1.a();
      this.aM = azk.h(0.5F * $$3, this.aM, 1.125F);
      if (this.ak.n.aE().a()) {
         if ($$2.gG()) {
            this.a($$0, this.aM);
         } else {
            this.aM = 0.5F;

            for (bwk $$4 : bwk.values()) {
               cys $$5 = $$2.a($$4);
               dhb $$6 = $$5.a(kj.D);
               if ($$6 != null && $$6.b() == $$4 && $$6.e().isPresent()) {
                  this.a($$0, $$6.e().get().a((UnaryOperator<String>)($$0x -> "textures/" + $$0x + ".png")), 1.0F);
               }
            }
         }
      }

      if ($$2.cu() > 0) {
         this.a($$0, K, $$2.cv());
      }

      float $$7 = $$1.a(false);
      float $$8 = azk.h($$7, $$2.cw, $$2.cv);
      float $$9 = $$2.a(bvg.i, $$7);
      if ($$8 > 0.0F) {
         this.b($$0, $$8);
      } else if ($$9 > 0.0F) {
         float $$10 = this.ak.n.am().c().floatValue();
         if ($$10 < 1.0F) {
            float $$11 = $$9 * (1.0F - $$10);
            this.c($$0, $$11);
         }
      }
   }

   private void d(frc $$0, fnv $$1) {
      if (this.ak.t.go() > 0) {
         bqi.a().a("sleep");
         float $$2 = (float)this.ak.t.go();
         float $$3 = $$2 / 100.0F;
         if ($$3 > 1.0F) {
            $$3 = 1.0F - ($$2 - 100.0F) / 10.0F;
         }

         int $$4 = (int)(220.0F * $$3) << 24 | 1052704;
         $$0.a(gpn.L(), 0, 0, $$0.a(), $$0.b(), $$4);
         bqi.a().c();
      }
   }

   private void e(frc $$0, fnv $$1) {
      fra $$2 = this.f();
      if (this.an != null && this.ao > 0) {
         bqi.a().a("overlayMessage");
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
               $$5 = azk.a($$3 / 50.0F, 0.7F, 0.6F, $$4);
            } else {
               $$5 = axu.c($$4, -1);
            }

            int $$7 = $$2.a(this.an);
            $$0.a($$2, this.an, -$$7 / 2, -4, $$7, $$5);
            $$0.c().b();
         }

         bqi.a().c();
      }
   }

   private void f(frc $$0, fnv $$1) {
      if (this.az != null && this.ay > 0) {
         fra $$2 = this.f();
         bqi.a().a("titleAndSubtitle");
         float $$3 = (float)this.ay - $$1.a(false);
         int $$4 = 255;
         if (this.ay > this.aD + this.aC) {
            float $$5 = (float)(this.aB + this.aC + this.aD) - $$3;
            $$4 = (int)($$5 * 255.0F / (float)this.aB);
         }

         if (this.ay <= this.aD) {
            $$4 = (int)($$3 * 255.0F / (float)this.aD);
         }

         $$4 = azk.a($$4, 0, 255);
         if ($$4 > 8) {
            $$0.c().a();
            $$0.c().a((float)($$0.a() / 2), (float)($$0.b() / 2), 0.0F);
            $$0.c().a();
            $$0.c().b(4.0F, 4.0F, 4.0F);
            int $$6 = $$2.a(this.az);
            int $$7 = axu.c($$4, -1);
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

         bqi.a().c();
      }
   }

   private void g(frc $$0, fnv $$1) {
      if (!this.al.e()) {
         fht $$2 = this.ak.aO();
         int $$3 = azk.a(this.ak.o.e() * (double)$$2.o() / (double)$$2.m());
         int $$4 = azk.a(this.ak.o.f() * (double)$$2.p() / (double)$$2.n());
         this.al.a($$0, this.am, $$3, $$4, false);
      }
   }

   private void h(frc $$0, fnv $$1) {
      ffb $$2 = this.ak.s.R();
      fet $$3 = null;
      few $$4 = $$2.e(this.ak.t.cI());
      if ($$4 != null) {
         fes $$5 = fes.a($$4.n());
         if ($$5 != null) {
            $$3 = $$2.a($$5);
         }
      }

      fet $$6 = $$3 != null ? $$3 : $$2.a(fes.b);
      if ($$6 != null) {
         this.a($$0, $$6);
      }
   }

   private void i(frc $$0, fnv $$1) {
      ffb $$2 = this.ak.s.R();
      fet $$3 = $$2.a(fes.a);
      if (!this.ak.n.J.e() || this.ak.T() && this.ak.t.j.l().size() <= 1 && $$3 == null) {
         this.aw.a(false);
      } else {
         this.aw.a(true);
         this.aw.a($$0, $$0.a(), $$2, $$3);
      }
   }

   private void j(frc $$0, fnv $$1) {
      foj $$2 = this.ak.n;
      if ($$2.aE().a()) {
         if (this.ak.r.i() != dim.d || this.a(this.ak.w)) {
            if (this.at.d() && !this.ak.t.gz() && !$$2.Y().c()) {
               fnn $$3 = this.ak.j.k();
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
               $$0.a(gpn::J, c, ($$0.a() - 15) / 2, ($$0.b() - 15) / 2, 15, 15);
               if (this.ak.n.F().c() == fnm.b) {
                  float $$6 = this.ak.t.H(0.0F);
                  boolean $$7 = false;
                  if (this.ak.v != null && this.ak.v instanceof bwz && $$6 >= 1.0F) {
                     $$7 = this.ak.t.gC() > 5.0F;
                     $$7 &= this.ak.v.bK();
                  }

                  int $$8 = $$0.b() / 2 - 7 + 16;
                  int $$9 = $$0.a() / 2 - 8;
                  if ($$7) {
                     $$0.a(gpn::J, d, $$9, $$8, 16, 16);
                  } else if ($$6 < 1.0F) {
                     int $$10 = (int)($$6 * 17.0F);
                     $$0.a(gpn::J, e, $$9, $$8, 16, 4);
                     $$0.a(gpn::J, f, 16, 4, 0, 0, $$9, $$8, $$10, 4);
                  }
               }
            }
         }
      }
   }

   private boolean a(@Nullable fdu $$0) {
      if ($$0 == null) {
         return false;
      } else if ($$0.d() == fdu.a.c) {
         return ((fdt)$$0).a() instanceof bua;
      } else if ($$0.d() == fdu.a.b) {
         iu $$1 = ((fds)$$0).b();
         dip $$2 = this.ak.s;
         return $$2.a_($$1).b($$2, $$1) != null;
      } else {
         return false;
      }
   }

   private void k(frc $$0, fnv $$1) {
      Collection<bve> $$2 = this.ak.t.eC();
      if (!$$2.isEmpty() && (this.ak.z == null || !this.ak.z.C())) {
         int $$3 = 0;
         int $$4 = 0;
         hiy $$5 = this.ak.aG();
         List<Runnable> $$6 = Lists.newArrayListWithExpectedSize($$2.size());

         for (bve $$7 : Ordering.natural().reverse().sortedCopy($$2)) {
            je<bvc> $$8 = $$7.c();
            if ($$7.h()) {
               int $$9 = $$0.a();
               int $$10 = 1;
               if (this.ak.K()) {
                  $$10 += 15;
               }

               if ($$8.a().j()) {
                  $$3++;
                  $$9 -= 25 * $$3;
               } else {
                  $$4++;
                  $$9 -= 25 * $$4;
                  $$10 += 26;
               }

               float $$11 = 1.0F;
               if ($$7.f()) {
                  $$0.a(gpn::H, g, $$9, $$10, 24, 24);
               } else {
                  $$0.a(gpn::H, h, $$9, $$10, 24, 24);
                  if ($$7.a(200)) {
                     int $$12 = $$7.d();
                     int $$13 = 10 - $$12 / 20;
                     $$11 = azk.a((float)$$12 / 10.0F / 5.0F * 0.5F, 0.0F, 0.5F)
                        + azk.b((float)$$12 * (float) Math.PI / 5.0F) * azk.a((float)$$13 / 10.0F * 0.25F, 0.0F, 0.25F);
                     $$11 = azk.a($$11, 0.0F, 1.0F);
                  }
               }

               hhz $$14 = $$5.a($$8);
               int $$15 = $$9;
               int $$16 = $$10;
               float $$17 = $$11;
               $$6.add(() -> {
                  int $$5x = axu.a($$17);
                  $$0.a(gpn::H, $$14, $$15 + 3, $$16 + 3, 18, 18, $$5x);
               });
            }
         }

         $$6.forEach(Runnable::run);
      }
   }

   private void l(frc $$0, fnv $$1) {
      if (this.ak.r.i() == dim.d) {
         this.av.a($$0);
      } else {
         this.m($$0, $$1);
      }

      int $$2 = $$0.a() / 2 - 91;
      bxj $$3 = this.ak.t.u();
      if ($$3 != null) {
         this.a($$3, $$0, $$2);
      } else if (this.m()) {
         this.a($$0, $$2);
      }

      if (this.ak.r.a()) {
         this.b($$0);
      }

      this.c($$0);
      if (this.ak.r.i() != dim.d) {
         this.a($$0);
      } else if (this.ak.t.U_()) {
         this.av.b($$0);
      }
   }

   private void m(frc $$0, fnv $$1) {
      cqs $$2 = this.n();
      if ($$2 != null) {
         cys $$3 = $$2.fb();
         bws $$4 = $$2.fx().e();
         int $$5 = $$0.a() / 2;
         int $$6 = 182;
         int $$7 = 91;
         $$0.c().a();
         $$0.c().a(0.0F, 0.0F, -90.0F);
         $$0.a(gpn::H, i, $$5 - 91, $$0.b() - 22, 182, 22);
         $$0.a(gpn::H, j, $$5 - 91 - 1 + $$2.gi().j * 20, $$0.b() - 22 - 1, 24, 23);
         if (!$$3.f()) {
            if ($$4 == bws.a) {
               $$0.a(gpn::H, k, $$5 - 91 - 29, $$0.b() - 23, 29, 24);
            } else {
               $$0.a(gpn::H, l, $$5 + 91, $$0.b() - 23, 29, 24);
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
            if ($$4 == bws.a) {
               this.a($$0, $$5 - 91 - 26, $$12, $$1, $$2, $$3, $$8++);
            } else {
               this.a($$0, $$5 + 91 + 10, $$12, $$1, $$2, $$3, $$8++);
            }
         }

         if (this.ak.n.F().c() == fnm.c) {
            float $$13 = this.ak.t.H(0.0F);
            if ($$13 < 1.0F) {
               int $$14 = $$0.b() - 20;
               int $$15 = $$5 + 91 + 6;
               if ($$4 == bws.b) {
                  $$15 = $$5 - 91 - 22;
               }

               int $$16 = (int)($$13 * 19.0F);
               $$0.a(gpn::H, m, $$15, $$14, 18, 18);
               $$0.a(gpn::H, n, 18, 18, 0, 18 - $$16, $$15, $$14 + 18 - $$16, 18, $$16);
            }
         }
      }
   }

   private void a(bxj $$0, frc $$1, int $$2) {
      bqi.a().a("jumpBar");
      float $$3 = this.ak.t.v();
      int $$4 = 182;
      int $$5 = (int)($$3 * 183.0F);
      int $$6 = $$1.b() - 32 + 3;
      $$1.a(gpn::H, o, $$2, $$6, 182, 5);
      if ($$0.c() > 0) {
         $$1.a(gpn::H, p, $$2, $$6, 182, 5);
      } else if ($$5 > 0) {
         $$1.a(gpn::H, q, 182, 5, 0, 0, $$2, $$6, $$5, 5);
      }

      bqi.a().c();
   }

   private void a(frc $$0, int $$1) {
      bqi.a().a("expBar");
      int $$2 = this.ak.t.gs();
      if ($$2 > 0) {
         int $$3 = 182;
         int $$4 = (int)(this.ak.t.cg * 183.0F);
         int $$5 = $$0.b() - 32 + 3;
         $$0.a(gpn::H, r, $$1, $$5, 182, 5);
         if ($$4 > 0) {
            $$0.a(gpn::H, s, 182, 5, 0, 0, $$1, $$5, $$4, 5);
         }
      }

      bqi.a().c();
   }

   private void n(frc $$0, fnv $$1) {
      int $$2 = this.ak.t.ce;
      if (this.m() && $$2 > 0) {
         bqi.a().a("expLevel");
         String $$3 = $$2 + "";
         int $$4 = ($$0.a() - this.f().b($$3)) / 2;
         int $$5 = $$0.b() - 31 - 4;
         $$0.a(this.f(), $$3, $$4 + 1, $$5, 0, false);
         $$0.a(this.f(), $$3, $$4 - 1, $$5, 0, false);
         $$0.a(this.f(), $$3, $$4, $$5 + 1, 0, false);
         $$0.a(this.f(), $$3, $$4, $$5 - 1, 0, false);
         $$0.a(this.f(), $$3, $$4, $$5, 8453920, false);
         bqi.a().c();
      }
   }

   private boolean m() {
      return this.ak.t.u() == null && this.ak.r.d();
   }

   private void a(frc $$0) {
      bqi.a().a("selectedItemName");
      if (this.ar > 0 && !this.as.f()) {
         xk $$1 = ww.i().b(this.as.y()).a(this.as.D().a());
         if (this.as.c(kj.g)) {
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
            $$0.a(this.f(), (ww)$$1, $$3, $$4, $$2, axu.c($$5, -1));
         }
      }

      bqi.a().c();
   }

   private void o(frc $$0, fnv $$1) {
      if (this.ak.K()) {
         bqi.a().a("demo");
         ww $$2;
         if (this.ak.s.ae() >= 120500L) {
            $$2 = M;
         } else {
            $$2 = ww.a("demo.remainingTime", baj.a((int)(120500L - this.ak.s.ae()), this.ak.s.u().f()));
         }

         int $$4 = this.f().a($$2);
         int $$5 = $$0.a() - $$4 - 10;
         int $$6 = 5;
         $$0.a(this.f(), $$2, $$5, 5, $$4, -1);
         bqi.a().c();
      }
   }

   private void a(frc $$0, fet $$1) {
      ffb $$2 = $$1.a();
      ym $$3 = $$1.a(yp.c);

      record a(ww a, ww b, int c) {
      }

      a[] $$4 = $$2.i($$1).stream().filter($$0x -> !$$0x.a()).sorted(L).limit(15L).map($$2x -> {
         few $$3x = $$2.e($$2x.c());
         ww $$4x = $$2x.b();
         ww $$5x = few.a($$3x, $$4x);
         ww $$6x = $$2x.a($$3);
         int $$7x = this.f().a($$6x);
         return new a($$5x, $$6x, $$7x);
      }).toArray(a[]::new);
      ww $$5 = $$1.d();
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
   private cqs n() {
      return this.ak.ao() instanceof cqs $$0 ? $$0 : null;
   }

   @Nullable
   private bwz o() {
      cqs $$0 = this.n();
      if ($$0 != null) {
         bwa $$1 = $$0.dk();
         if ($$1 == null) {
            return null;
         }

         if ($$1 instanceof bwz) {
            return (bwz)$$1;
         }
      }

      return null;
   }

   private int a(@Nullable bwz $$0) {
      if ($$0 != null && $$0.bN()) {
         float $$1 = $$0.eT();
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

   private void b(frc $$0) {
      cqs $$1 = this.n();
      if ($$1 != null) {
         int $$2 = azk.f($$1.eF());
         boolean $$3 = this.aH > (long)this.am && (this.aH - (long)this.am) / 3L % 2L == 1L;
         long $$4 = af.c();
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
         float $$9 = Math.max((float)$$1.h(byf.s), (float)Math.max($$5, $$2));
         int $$10 = azk.f($$1.fv());
         int $$11 = azk.f(($$9 + (float)$$10) / 2.0F / 10.0F);
         int $$12 = Math.max(10 - ($$11 - 2), 3);
         int $$13 = $$8 - 10;
         int $$14 = -1;
         if ($$1.b(bvg.j)) {
            $$14 = this.am % azk.f($$9 + 5.0F);
         }

         bqi.a().a("armor");
         a($$0, $$1, $$8, $$11, $$12, $$6);
         bqi.a().b("health");
         this.a($$0, $$1, $$6, $$8, $$12, $$14, $$9, $$2, $$5, $$10, $$3);
         bwz $$15 = this.o();
         int $$16 = this.a($$15);
         if ($$16 == 0) {
            bqi.a().b("food");
            this.a($$0, $$1, $$8, $$7);
            $$13 -= 10;
         }

         bqi.a().b("air");
         this.a($$0, $$1, $$16, $$13, $$7);
         bqi.a().c();
      }
   }

   private static void a(frc $$0, cqs $$1, int $$2, int $$3, int $$4, int $$5) {
      int $$6 = $$1.eQ();
      if ($$6 > 0) {
         int $$7 = $$2 - ($$3 - 1) * $$4 - 10;

         for (int $$8 = 0; $$8 < 10; $$8++) {
            int $$9 = $$5 + $$8 * 8;
            if ($$8 * 2 + 1 < $$6) {
               $$0.a(gpn::H, v, $$9, $$7, 9, 9);
            }

            if ($$8 * 2 + 1 == $$6) {
               $$0.a(gpn::H, u, $$9, $$7, 9, 9);
            }

            if ($$8 * 2 + 1 > $$6) {
               $$0.a(gpn::H, t, $$9, $$7, 9, 9);
            }
         }
      }
   }

   private void a(frc $$0, cqs $$1, int $$2, int $$3, int $$4, int $$5, float $$6, int $$7, int $$8, int $$9, boolean $$10) {
      frb.b $$11 = frb.b.a($$1);
      boolean $$12 = $$1.dV().y_().l();
      int $$13 = azk.c((double)$$6 / 2.0);
      int $$14 = azk.c((double)$$9 / 2.0);
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

         this.a($$0, frb.b.a, $$19, $$20, $$12, $$10, false);
         int $$21 = $$16 * 2;
         boolean $$22 = $$16 >= $$13;
         if ($$22) {
            int $$23 = $$21 - $$15;
            if ($$23 < $$9) {
               boolean $$24 = $$23 + 1 == $$9;
               this.a($$0, $$11 == frb.b.d ? $$11 : frb.b.e, $$19, $$20, $$12, false, $$24);
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

   private void a(frc $$0, frb.b $$1, int $$2, int $$3, boolean $$4, boolean $$5, boolean $$6) {
      $$0.a(gpn::H, $$1.a($$4, $$6, $$5), $$2, $$3, 9, 9);
   }

   private void a(frc $$0, cqs $$1, int $$2, int $$3, int $$4) {
      int $$5 = $$1.cs();
      int $$6 = Math.clamp((long)$$1.ct(), 0, $$5);
      boolean $$7 = $$1.a(axf.a);
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
               $$0.a(gpn::H, C, $$13, $$3, 9, 9);
            } else if ($$11 && $$12 == $$9 && $$7) {
               $$0.a(gpn::H, D, $$13, $$3, 9, 9);
               this.a($$12, $$1, $$10);
            } else if ($$12 > 10 - $$10) {
               int $$14 = $$10 == 10 && this.am % 2 == 0 ? this.aj.a(2) : 0;
               $$0.a(gpn::H, E, $$13, $$3 + $$14, 9, 9);
            }
         }
      }
   }

   private int a(int $$0, int $$1) {
      int $$2 = this.a($$0) - 1;
      return $$1 - $$2 * 10;
   }

   private static int b(int $$0, int $$1, int $$2) {
      return azk.f((float)(($$0 + $$2) * 10) / (float)$$1);
   }

   private static int a(int $$0, boolean $$1) {
      return $$0 != 0 && $$1 ? 1 : 0;
   }

   private void a(int $$0, cqs $$1, int $$2) {
      if (this.aI != $$0) {
         float $$3 = 0.5F + 0.1F * (float)Math.max(0, $$2 - 3 + 1);
         float $$4 = 1.0F + 0.1F * (float)Math.max(0, $$2 - 5 + 1);
         $$1.a(awl.dc, $$3, $$4);
         this.aI = $$0;
      }
   }

   private void a(frc $$0, cqs $$1, int $$2, int $$3) {
      cug $$4 = $$1.gt();
      int $$5 = $$4.a();

      for (int $$6 = 0; $$6 < 10; $$6++) {
         int $$7 = $$2;
         ale $$8;
         ale $$9;
         ale $$10;
         if ($$1.b(bvg.q)) {
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
         $$0.a(gpn::H, $$8, $$14, $$7, 9, 9);
         if ($$6 * 2 + 1 < $$5) {
            $$0.a(gpn::H, $$10, $$14, $$7, 9, 9);
         }

         if ($$6 * 2 + 1 == $$5) {
            $$0.a(gpn::H, $$9, $$14, $$7, 9, 9);
         }
      }
   }

   private void c(frc $$0) {
      bwz $$1 = this.o();
      if ($$1 != null) {
         int $$2 = this.a($$1);
         if ($$2 != 0) {
            int $$3 = (int)Math.ceil((double)$$1.eF());
            bqi.a().b("mountHealth");
            int $$4 = $$0.b() - 39;
            int $$5 = $$0.a() / 2 + 91;
            int $$6 = $$4;

            for (int $$7 = 0; $$2 > 0; $$7 += 20) {
               int $$8 = Math.min($$2, 10);
               $$2 -= $$8;

               for (int $$9 = 0; $$9 < $$8; $$9++) {
                  int $$10 = $$5 - $$9 * 8 - 9;
                  $$0.a(gpn::H, F, $$10, $$6, 9, 9);
                  if ($$9 * 2 + 1 + $$7 < $$3) {
                     $$0.a(gpn::H, G, $$10, $$6, 9, 9);
                  }

                  if ($$9 * 2 + 1 + $$7 == $$3) {
                     $$0.a(gpn::H, H, $$10, $$6, 9, 9);
                  }
               }

               $$6 -= 10;
            }
         }
      }
   }

   private void a(frc $$0, ale $$1, float $$2) {
      int $$3 = axu.a($$2);
      $$0.a(gpn::F, $$1, 0, 0, 0.0F, 0.0F, $$0.a(), $$0.b(), $$0.a(), $$0.b(), $$3);
   }

   private void a(frc $$0, float $$1) {
      float $$2 = (float)Math.min($$0.a(), $$0.b());
      float $$4 = Math.min((float)$$0.a() / $$2, (float)$$0.b() / $$2) * $$1;
      int $$5 = azk.d($$2 * $$4);
      int $$6 = azk.d($$2 * $$4);
      int $$7 = ($$0.a() - $$5) / 2;
      int $$8 = ($$0.b() - $$6) / 2;
      int $$9 = $$7 + $$5;
      int $$10 = $$8 + $$6;
      $$0.a(gpn::H, J, $$7, $$8, 0.0F, 0.0F, $$5, $$6, $$5, $$6);
      $$0.a(gpn.L(), 0, $$10, $$0.a(), $$0.b(), -90, -16777216);
      $$0.a(gpn.L(), 0, 0, $$0.a(), $$8, -90, -16777216);
      $$0.a(gpn.L(), 0, $$8, $$7, $$10, -90, -16777216);
      $$0.a(gpn.L(), $$9, $$8, $$0.a(), $$10, -90, -16777216);
   }

   private void a(bwa $$0) {
      iu $$1 = iu.a($$0.dA(), $$0.dE(), $$0.dG());
      float $$2 = gpa.a($$0.dV().B_(), $$0.dV().B($$1));
      float $$3 = azk.a(1.0F - $$2, 0.0F, 1.0F);
      this.b = this.b + ($$3 - this.b) * 0.01F;
   }

   private void a(frc $$0, @Nullable bwa $$1) {
      ebg $$2 = this.ak.s.A_();
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
         $$3 = azk.a($$3, 0.0F, 1.0F);
         $$7 = axu.a(1.0F, 0.0F, $$3, $$3);
      } else {
         float $$8 = this.b;
         $$8 = azk.a($$8, 0.0F, 1.0F);
         $$7 = axu.a(1.0F, $$8, $$8, $$8);
      }

      $$0.a(gpn::I, I, 0, 0, 0.0F, 0.0F, $$0.a(), $$0.b(), $$0.a(), $$0.b(), $$7);
   }

   private void b(frc $$0, float $$1) {
      if ($$1 < 1.0F) {
         $$1 *= $$1;
         $$1 *= $$1;
         $$1 = $$1 * 0.8F + 0.2F;
      }

      int $$2 = axu.a($$1);
      hhz $$3 = this.ak.ap().a().a(dlw.eq.m());
      $$0.a(gpn::F, $$3, 0, 0, $$0.a(), $$0.b(), $$2);
   }

   private void c(frc $$0, float $$1) {
      int $$2 = $$0.a();
      int $$3 = $$0.b();
      $$0.c().a();
      float $$4 = azk.h($$1, 2.0F, 1.0F);
      $$0.c().a((float)$$2 / 2.0F, (float)$$3 / 2.0F, 0.0F);
      $$0.c().b($$4, $$4, $$4);
      $$0.c().a((float)(-$$2) / 2.0F, (float)(-$$3) / 2.0F, 0.0F);
      float $$5 = 0.2F * $$1;
      float $$6 = 0.4F * $$1;
      float $$7 = 0.2F * $$1;
      $$0.a($$0x -> gpn.M(), a, 0, 0, 0.0F, 0.0F, $$2, $$3, $$2, $$3, axu.a(1.0F, $$5, $$6, $$7));
      $$0.c().b();
   }

   private void a(frc $$0, int $$1, int $$2, fnv $$3, cqs $$4, cys $$5, int $$6) {
      if (!$$5.f()) {
         float $$7 = (float)$$5.L() - $$3.a(false);
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
      bwa $$0 = this.ak.ao();
      if ($$0 != null) {
         this.a($$0);
      }

      if (this.ak.t != null) {
         cys $$1 = this.ak.t.gi().f();
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
      this.aJ = azk.h(0.2F, this.aJ, $$1 ? 1.0F : 0.0F);
   }

   public void a(ww $$0) {
      ww $$1 = ww.a("record.nowPlaying", $$0);
      this.a($$1, true);
      this.ak.aY().c($$1);
   }

   public void a(ww $$0, boolean $$1) {
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

   public void b(ww $$0) {
      this.aA = $$0;
   }

   public void c(ww $$0) {
      this.az = $$0;
      this.ay = this.aB + this.aC + this.aD;
   }

   public void c() {
      this.az = null;
      this.aA = null;
      this.ay = 0;
   }

   public frr d() {
      return this.al;
   }

   public int e() {
      return this.am;
   }

   public fra f() {
      return this.ak.h;
   }

   public ftq g() {
      return this.av;
   }

   public fsr h() {
      return this.aw;
   }

   public void i() {
      this.aw.a();
      this.ax.a();
      this.ak.aA().b();
      this.at.p();
      this.al.a(true);
      this.c();
      this.a();
   }

   public frp j() {
      return this.ax;
   }

   public fry k() {
      return this.at;
   }

   public void l() {
      this.at.a();
   }

   public void b(frc $$0, fnv $$1) {
      if (this.ak.n.ai().c() && (this.aJ > 0.0F || this.aK > 0.0F)) {
         int $$2 = azk.d(255.0F * azk.a(azk.h($$1.b(), this.aK, this.aJ), 0.0F, 1.0F));
         if ($$2 > 8) {
            fra $$3 = this.f();
            int $$4 = $$3.a(N);
            int $$5 = axu.c($$2, -1);
            int $$6 = $$0.a() - $$4 - 5;
            int $$7 = $$0.b() - 9 - 5;
            $$0.a($$3, N, $$6, $$7, $$4, $$5);
         }
      }
   }

   static enum b {
      a(
         ale.b("hud/heart/container"),
         ale.b("hud/heart/container_blinking"),
         ale.b("hud/heart/container"),
         ale.b("hud/heart/container_blinking"),
         ale.b("hud/heart/container_hardcore"),
         ale.b("hud/heart/container_hardcore_blinking"),
         ale.b("hud/heart/container_hardcore"),
         ale.b("hud/heart/container_hardcore_blinking")
      ),
      b(
         ale.b("hud/heart/full"),
         ale.b("hud/heart/full_blinking"),
         ale.b("hud/heart/half"),
         ale.b("hud/heart/half_blinking"),
         ale.b("hud/heart/hardcore_full"),
         ale.b("hud/heart/hardcore_full_blinking"),
         ale.b("hud/heart/hardcore_half"),
         ale.b("hud/heart/hardcore_half_blinking")
      ),
      c(
         ale.b("hud/heart/poisoned_full"),
         ale.b("hud/heart/poisoned_full_blinking"),
         ale.b("hud/heart/poisoned_half"),
         ale.b("hud/heart/poisoned_half_blinking"),
         ale.b("hud/heart/poisoned_hardcore_full"),
         ale.b("hud/heart/poisoned_hardcore_full_blinking"),
         ale.b("hud/heart/poisoned_hardcore_half"),
         ale.b("hud/heart/poisoned_hardcore_half_blinking")
      ),
      d(
         ale.b("hud/heart/withered_full"),
         ale.b("hud/heart/withered_full_blinking"),
         ale.b("hud/heart/withered_half"),
         ale.b("hud/heart/withered_half_blinking"),
         ale.b("hud/heart/withered_hardcore_full"),
         ale.b("hud/heart/withered_hardcore_full_blinking"),
         ale.b("hud/heart/withered_hardcore_half"),
         ale.b("hud/heart/withered_hardcore_half_blinking")
      ),
      e(
         ale.b("hud/heart/absorbing_full"),
         ale.b("hud/heart/absorbing_full_blinking"),
         ale.b("hud/heart/absorbing_half"),
         ale.b("hud/heart/absorbing_half_blinking"),
         ale.b("hud/heart/absorbing_hardcore_full"),
         ale.b("hud/heart/absorbing_hardcore_full_blinking"),
         ale.b("hud/heart/absorbing_hardcore_half"),
         ale.b("hud/heart/absorbing_hardcore_half_blinking")
      ),
      f(
         ale.b("hud/heart/frozen_full"),
         ale.b("hud/heart/frozen_full_blinking"),
         ale.b("hud/heart/frozen_half"),
         ale.b("hud/heart/frozen_half_blinking"),
         ale.b("hud/heart/frozen_hardcore_full"),
         ale.b("hud/heart/frozen_hardcore_full_blinking"),
         ale.b("hud/heart/frozen_hardcore_half"),
         ale.b("hud/heart/frozen_hardcore_half_blinking")
      );

      private final ale g;
      private final ale h;
      private final ale i;
      private final ale j;
      private final ale k;
      private final ale l;
      private final ale m;
      private final ale n;

      private b(final ale $$0, final ale $$1, final ale $$2, final ale $$3, final ale $$4, final ale $$5, final ale $$6, final ale $$7) {
         this.g = $$0;
         this.h = $$1;
         this.i = $$2;
         this.j = $$3;
         this.k = $$4;
         this.l = $$5;
         this.m = $$6;
         this.n = $$7;
      }

      public ale a(boolean $$0, boolean $$1, boolean $$2) {
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

      static frb.b a(cqs $$0) {
         frb.b $$1;
         if ($$0.b(bvg.s)) {
            $$1 = c;
         } else if ($$0.b(bvg.t)) {
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
