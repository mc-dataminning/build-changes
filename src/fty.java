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

public class fty {
   private static final alk c = alk.b("hud/crosshair");
   private static final alk d = alk.b("hud/crosshair_attack_indicator_full");
   private static final alk e = alk.b("hud/crosshair_attack_indicator_background");
   private static final alk f = alk.b("hud/crosshair_attack_indicator_progress");
   private static final alk g = alk.b("hud/effect_background_ambient");
   private static final alk h = alk.b("hud/effect_background");
   private static final alk i = alk.b("hud/hotbar");
   private static final alk j = alk.b("hud/hotbar_selection");
   private static final alk k = alk.b("hud/hotbar_offhand_left");
   private static final alk l = alk.b("hud/hotbar_offhand_right");
   private static final alk m = alk.b("hud/hotbar_attack_indicator_background");
   private static final alk n = alk.b("hud/hotbar_attack_indicator_progress");
   private static final alk o = alk.b("hud/jump_bar_background");
   private static final alk p = alk.b("hud/jump_bar_cooldown");
   private static final alk q = alk.b("hud/jump_bar_progress");
   private static final alk r = alk.b("hud/experience_bar_background");
   private static final alk s = alk.b("hud/experience_bar_progress");
   private static final alk t = alk.b("hud/armor_empty");
   private static final alk u = alk.b("hud/armor_half");
   private static final alk v = alk.b("hud/armor_full");
   private static final alk w = alk.b("hud/food_empty_hunger");
   private static final alk x = alk.b("hud/food_half_hunger");
   private static final alk y = alk.b("hud/food_full_hunger");
   private static final alk z = alk.b("hud/food_empty");
   private static final alk A = alk.b("hud/food_half");
   private static final alk B = alk.b("hud/food_full");
   private static final alk C = alk.b("hud/air");
   private static final alk D = alk.b("hud/air_bursting");
   private static final alk E = alk.b("hud/air_empty");
   private static final alk F = alk.b("hud/heart/vehicle_container");
   private static final alk G = alk.b("hud/heart/vehicle_full");
   private static final alk H = alk.b("hud/heart/vehicle_half");
   private static final alk I = alk.b("textures/misc/vignette.png");
   public static final alk a = alk.b("textures/misc/nausea.png");
   private static final alk J = alk.b("textures/misc/spyglass_scope.png");
   private static final alk K = alk.b("textures/misc/powder_snow_outline.png");
   private static final Comparator<fgq> L = Comparator.comparing(fgq::d).reversed().thenComparing(fgq::c, String.CASE_INSENSITIVE_ORDER);
   private static final xc M = xc.c("demo.demoExpired");
   private static final xc N = xc.c("menu.savingLevel");
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
   private final azz aj = azz.a();
   private final frf ak;
   private final fuo al;
   private int am;
   @Nullable
   private xc an;
   private int ao;
   private boolean ap;
   private boolean aq;
   public float b = 1.0F;
   private int ar;
   private daa as = daa.k;
   private final fuv at;
   private final fvv au;
   private final fwn av;
   private final fvo aw;
   private final fum ax;
   private int ay;
   @Nullable
   private xc az;
   @Nullable
   private xc aA;
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
   private final fuc aL = new fuc();
   private float aM;

   public fty(frf $$0) {
      this.ak = $$0;
      this.at = new fuv($$0);
      this.av = new fwn($$0);
      this.al = new fuo($$0);
      this.aw = new fvo($$0, this);
      this.ax = new fum($$0);
      this.au = new fvv($$0);
      this.a();
      fuc $$1 = new fuc().a(this::c).a(this::j).a(this::l).a(this::n).a(this::k).a(($$0x, $$1x) -> this.ax.a($$0x));
      fuc $$2 = new fuc().a(this::o).a(($$0x, $$1x) -> {
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

   public void a(ftz $$0, fqv $$1) {
      this.aL.a($$0, $$1);
   }

   private void c(ftz $$0, fqv $$1) {
      if (frf.N()) {
         this.a($$0, this.ak.ao());
      }

      grb $$2 = this.ak.t;
      float $$3 = $$1.a();
      this.aM = azq.h(0.5F * $$3, this.aM, 1.125F);
      if (this.ak.n.aE().a()) {
         if ($$2.gH()) {
            this.a($$0, this.aM);
         } else {
            this.aM = 0.5F;

            for (bxf $$4 : bxf.values()) {
               daa $$5 = $$2.a($$4);
               dij $$6 = $$5.a(kl.D);
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
      float $$8 = azq.h($$7, $$2.cx, $$2.cw);
      float $$9 = $$2.a(bwb.i, $$7);
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

   private void d(ftz $$0, fqv $$1) {
      if (this.ak.t.gp() > 0) {
         brc.a().a("sleep");
         float $$2 = (float)this.ak.t.gp();
         float $$3 = $$2 / 100.0F;
         if ($$3 > 1.0F) {
            $$3 = 1.0F - ($$2 - 100.0F) / 10.0F;
         }

         int $$4 = (int)(220.0F * $$3) << 24 | 1052704;
         $$0.a(gsn.G(), 0, 0, $$0.a(), $$0.b(), $$4);
         brc.a().c();
      }
   }

   private void e(ftz $$0, fqv $$1) {
      ftx $$2 = this.f();
      if (this.an != null && this.ao > 0) {
         brc.a().a("overlayMessage");
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
               $$5 = azq.a($$3 / 50.0F, 0.7F, 0.6F, $$4);
            } else {
               $$5 = aya.c($$4, -1);
            }

            int $$7 = $$2.a(this.an);
            $$0.a($$2, this.an, -$$7 / 2, -4, $$7, $$5);
            $$0.c().b();
         }

         brc.a().c();
      }
   }

   private void f(ftz $$0, fqv $$1) {
      if (this.az != null && this.ay > 0) {
         ftx $$2 = this.f();
         brc.a().a("titleAndSubtitle");
         float $$3 = (float)this.ay - $$1.a(false);
         int $$4 = 255;
         if (this.ay > this.aD + this.aC) {
            float $$5 = (float)(this.aB + this.aC + this.aD) - $$3;
            $$4 = (int)($$5 * 255.0F / (float)this.aB);
         }

         if (this.ay <= this.aD) {
            $$4 = (int)($$3 * 255.0F / (float)this.aD);
         }

         $$4 = azq.a($$4, 0, 255);
         if ($$4 > 8) {
            $$0.c().a();
            $$0.c().a((float)($$0.a() / 2), (float)($$0.b() / 2), 0.0F);
            $$0.c().a();
            $$0.c().b(4.0F, 4.0F, 4.0F);
            int $$6 = $$2.a(this.az);
            int $$7 = aya.c($$4, -1);
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

         brc.a().c();
      }
   }

   private void g(ftz $$0, fqv $$1) {
      if (!this.al.e()) {
         fkm $$2 = this.ak.aO();
         int $$3 = azq.a(this.ak.o.e() * (double)$$2.o() / (double)$$2.m());
         int $$4 = azq.a(this.ak.o.f() * (double)$$2.p() / (double)$$2.n());
         this.al.a($$0, this.am, $$3, $$4, false);
      }
   }

   private void h(ftz $$0, fqv $$1) {
      fgx $$2 = this.ak.s.R();
      fgp $$3 = null;
      fgs $$4 = $$2.e(this.ak.t.cI());
      if ($$4 != null) {
         fgo $$5 = fgo.a($$4.o());
         if ($$5 != null) {
            $$3 = $$2.a($$5);
         }
      }

      fgp $$6 = $$3 != null ? $$3 : $$2.a(fgo.b);
      if ($$6 != null) {
         this.a($$0, $$6);
      }
   }

   private void i(ftz $$0, fqv $$1) {
      fgx $$2 = this.ak.s.R();
      fgp $$3 = $$2.a(fgo.a);
      if (!this.ak.n.J.e() || this.ak.T() && this.ak.t.j.l().size() <= 1 && $$3 == null) {
         this.aw.a(false);
      } else {
         this.aw.a(true);
         this.aw.a($$0, $$0.a(), $$2, $$3);
      }
   }

   private void j(ftz $$0, fqv $$1) {
      frj $$2 = this.ak.n;
      if ($$2.aE().a()) {
         if (this.ak.r.i() != djw.d || this.a(this.ak.w)) {
            if (this.at.d() && !this.ak.t.gA() && !$$2.Y().c()) {
               fqn $$3 = this.ak.j.k();
               Matrix4fStack $$4 = RenderSystem.getModelViewStack();
               $$4.pushMatrix();
               $$4.mul($$0.c().c().a());
               $$4.translate((float)($$0.a() / 2), (float)($$0.b() / 2), 0.0F);
               $$4.rotateX(-$$3.d() * (float) (Math.PI / 180.0));
               $$4.rotateY($$3.e() * (float) (Math.PI / 180.0));
               $$4.scale(-1.0F, -1.0F, -1.0F);
               this.at.q();
               $$4.popMatrix();
            } else {
               int $$5 = 15;
               $$0.a(gsn::J, c, ($$0.a() - 15) / 2, ($$0.b() - 15) / 2, 15, 15);
               if (this.ak.n.F().c() == fqm.b) {
                  float $$6 = this.ak.t.H(0.0F);
                  boolean $$7 = false;
                  if (this.ak.v != null && this.ak.v instanceof bxw && $$6 >= 1.0F) {
                     $$7 = this.ak.t.gD() > 5.0F;
                     $$7 &= this.ak.v.bJ();
                  }

                  int $$8 = $$0.b() / 2 - 7 + 16;
                  int $$9 = $$0.a() / 2 - 8;
                  if ($$7) {
                     $$0.a(gsn::J, d, $$9, $$8, 16, 16);
                  } else if ($$6 < 1.0F) {
                     int $$10 = (int)($$6 * 17.0F);
                     $$0.a(gsn::J, e, $$9, $$8, 16, 4);
                     $$0.a(gsn::J, f, 16, 4, 0, 0, $$9, $$8, $$10, 4);
                  }
               }
            }
         }
      }
   }

   private boolean a(@Nullable ffq $$0) {
      if ($$0 == null) {
         return false;
      } else if ($$0.d() == ffq.a.c) {
         return ((ffp)$$0).a() instanceof buv;
      } else if ($$0.d() == ffq.a.b) {
         iw $$1 = ((ffo)$$0).b();
         djz $$2 = this.ak.s;
         return $$2.a_($$1).b($$2, $$1) != null;
      } else {
         return false;
      }
   }

   private void k(ftz $$0, fqv $$1) {
      Collection<bvz> $$2 = this.ak.t.eD();
      if (!$$2.isEmpty() && (this.ak.z == null || !this.ak.z.C())) {
         int $$3 = 0;
         int $$4 = 0;
         hmc $$5 = this.ak.aG();
         List<Runnable> $$6 = Lists.newArrayListWithExpectedSize($$2.size());

         for (bvz $$7 : Ordering.natural().reverse().sortedCopy($$2)) {
            jg<bvx> $$8 = $$7.c();
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
                  $$0.a(gsn::H, g, $$9, $$10, 24, 24);
               } else {
                  $$0.a(gsn::H, h, $$9, $$10, 24, 24);
                  if ($$7.a(200)) {
                     int $$12 = $$7.d();
                     int $$13 = 10 - $$12 / 20;
                     $$11 = azq.a((float)$$12 / 10.0F / 5.0F * 0.5F, 0.0F, 0.5F)
                        + azq.b((float)$$12 * (float) Math.PI / 5.0F) * azq.a((float)$$13 / 10.0F * 0.25F, 0.0F, 0.25F);
                     $$11 = azq.a($$11, 0.0F, 1.0F);
                  }
               }

               hlc $$14 = $$5.a($$8);
               int $$15 = $$9;
               int $$16 = $$10;
               float $$17 = $$11;
               $$6.add(() -> {
                  int $$5x = aya.a($$17);
                  $$0.a(gsn::H, $$14, $$15 + 3, $$16 + 3, 18, 18, $$5x);
               });
            }
         }

         $$6.forEach(Runnable::run);
      }
   }

   private void l(ftz $$0, fqv $$1) {
      if (this.ak.r.i() == djw.d) {
         this.av.a($$0);
      } else {
         this.m($$0, $$1);
      }

      int $$2 = $$0.a() / 2 - 91;
      byg $$3 = this.ak.t.u();
      if ($$3 != null) {
         this.a($$3, $$0, $$2);
      } else if (this.m()) {
         this.a($$0, $$2);
      }

      if (this.ak.r.a()) {
         this.b($$0);
      }

      this.c($$0);
      if (this.ak.r.i() != djw.d) {
         this.a($$0);
      } else if (this.ak.t.Z_()) {
         this.av.b($$0);
      }
   }

   private void m(ftz $$0, fqv $$1) {
      crz $$2 = this.n();
      if ($$2 != null) {
         daa $$3 = $$2.fc();
         bxn $$4 = $$2.fy().e();
         int $$5 = $$0.a() / 2;
         int $$6 = 182;
         int $$7 = 91;
         $$0.c().a();
         $$0.c().a(0.0F, 0.0F, -90.0F);
         $$0.a(gsn::H, i, $$5 - 91, $$0.b() - 22, 182, 22);
         $$0.a(gsn::H, j, $$5 - 91 - 1 + $$2.gj().f() * 20, $$0.b() - 22 - 1, 24, 23);
         if (!$$3.f()) {
            if ($$4 == bxn.a) {
               $$0.a(gsn::H, k, $$5 - 91 - 29, $$0.b() - 23, 29, 24);
            } else {
               $$0.a(gsn::H, l, $$5 + 91, $$0.b() - 23, 29, 24);
            }
         }

         $$0.c().b();
         int $$8 = 1;

         for (int $$9 = 0; $$9 < 9; $$9++) {
            int $$10 = $$5 - 90 + $$9 * 20 + 2;
            int $$11 = $$0.b() - 16 - 3;
            this.a($$0, $$10, $$11, $$1, $$2, $$2.gj().a($$9), $$8++);
         }

         if (!$$3.f()) {
            int $$12 = $$0.b() - 16 - 3;
            if ($$4 == bxn.a) {
               this.a($$0, $$5 - 91 - 26, $$12, $$1, $$2, $$3, $$8++);
            } else {
               this.a($$0, $$5 + 91 + 10, $$12, $$1, $$2, $$3, $$8++);
            }
         }

         if (this.ak.n.F().c() == fqm.c) {
            float $$13 = this.ak.t.H(0.0F);
            if ($$13 < 1.0F) {
               int $$14 = $$0.b() - 20;
               int $$15 = $$5 + 91 + 6;
               if ($$4 == bxn.b) {
                  $$15 = $$5 - 91 - 22;
               }

               int $$16 = (int)($$13 * 19.0F);
               $$0.a(gsn::H, m, $$15, $$14, 18, 18);
               $$0.a(gsn::H, n, 18, 18, 0, 18 - $$16, $$15, $$14 + 18 - $$16, 18, $$16);
            }
         }
      }
   }

   private void a(byg $$0, ftz $$1, int $$2) {
      brc.a().a("jumpBar");
      float $$3 = this.ak.t.v();
      int $$4 = 182;
      int $$5 = (int)($$3 * 183.0F);
      int $$6 = $$1.b() - 32 + 3;
      $$1.a(gsn::H, o, $$2, $$6, 182, 5);
      if ($$0.c() > 0) {
         $$1.a(gsn::H, p, $$2, $$6, 182, 5);
      } else if ($$5 > 0) {
         $$1.a(gsn::H, q, 182, 5, 0, 0, $$2, $$6, $$5, 5);
      }

      brc.a().c();
   }

   private void a(ftz $$0, int $$1) {
      brc.a().a("expBar");
      int $$2 = this.ak.t.gt();
      if ($$2 > 0) {
         int $$3 = 182;
         int $$4 = (int)(this.ak.t.ch * 183.0F);
         int $$5 = $$0.b() - 32 + 3;
         $$0.a(gsn::H, r, $$1, $$5, 182, 5);
         if ($$4 > 0) {
            $$0.a(gsn::H, s, 182, 5, 0, 0, $$1, $$5, $$4, 5);
         }
      }

      brc.a().c();
   }

   private void n(ftz $$0, fqv $$1) {
      int $$2 = this.ak.t.cf;
      if (this.m() && $$2 > 0) {
         brc.a().a("expLevel");
         String $$3 = $$2 + "";
         int $$4 = ($$0.a() - this.f().b($$3)) / 2;
         int $$5 = $$0.b() - 31 - 4;
         $$0.a(this.f(), $$3, $$4 + 1, $$5, 0, false);
         $$0.a(this.f(), $$3, $$4 - 1, $$5, 0, false);
         $$0.a(this.f(), $$3, $$4, $$5 + 1, 0, false);
         $$0.a(this.f(), $$3, $$4, $$5 - 1, 0, false);
         $$0.a(this.f(), $$3, $$4, $$5, 8453920, false);
         brc.a().c();
      }
   }

   private boolean m() {
      return this.ak.t.u() == null && this.ak.r.d();
   }

   private void a(ftz $$0) {
      brc.a().a("selectedItemName");
      if (this.ar > 0 && !this.as.f()) {
         xq $$1 = xc.i().b(this.as.y()).a(this.as.D().a());
         if (this.as.c(kl.g)) {
            $$1.a(o.u);
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
            $$0.a(this.f(), (xc)$$1, $$3, $$4, $$2, aya.c($$5, -1));
         }
      }

      brc.a().c();
   }

   private void o(ftz $$0, fqv $$1) {
      if (this.ak.K()) {
         brc.a().a("demo");
         xc $$2;
         if (this.ak.s.ae() >= 120500L) {
            $$2 = M;
         } else {
            $$2 = xc.a("demo.remainingTime", bap.a((int)(120500L - this.ak.s.ae()), this.ak.s.u().f()));
         }

         int $$4 = this.f().a($$2);
         int $$5 = $$0.a() - $$4 - 10;
         int $$6 = 5;
         $$0.a(this.f(), $$2, $$5, 5, $$4, -1);
         brc.a().c();
      }
   }

   private void a(ftz $$0, fgp $$1) {
      fgx $$2 = $$1.b();
      ys $$3 = $$1.a(yv.c);

      record a(xc a, xc b, int c) {
      }

      a[] $$4 = $$2.i($$1).stream().filter($$0x -> !$$0x.a()).sorted(L).limit(15L).map($$2x -> {
         fgs $$3x = $$2.e($$2x.c());
         xc $$4x = $$2x.b();
         xc $$5x = fgs.a($$3x, $$4x);
         xc $$6x = $$2x.a($$3);
         int $$7x = this.f().a($$6x);
         return new a($$5x, $$6x, $$7x);
      }).toArray(a[]::new);
      xc $$5 = $$1.e();
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
   private crz n() {
      return this.ak.ao() instanceof crz $$0 ? $$0 : null;
   }

   @Nullable
   private bxw o() {
      crz $$0 = this.n();
      if ($$0 != null) {
         bwv $$1 = $$0.dk();
         if ($$1 == null) {
            return null;
         }

         if ($$1 instanceof bxw) {
            return (bxw)$$1;
         }
      }

      return null;
   }

   private int a(@Nullable bxw $$0) {
      if ($$0 != null && $$0.bM()) {
         float $$1 = $$0.eU();
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

   private void b(ftz $$0) {
      crz $$1 = this.n();
      if ($$1 != null) {
         int $$2 = azq.f($$1.eG());
         boolean $$3 = this.aH > (long)this.am && (this.aH - (long)this.am) / 3L % 2L == 1L;
         long $$4 = ag.c();
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
         float $$9 = Math.max((float)$$1.h(bzc.s), (float)Math.max($$5, $$2));
         int $$10 = azq.f($$1.fw());
         int $$11 = azq.f(($$9 + (float)$$10) / 2.0F / 10.0F);
         int $$12 = Math.max(10 - ($$11 - 2), 3);
         int $$13 = $$8 - 10;
         int $$14 = -1;
         if ($$1.b(bwb.j)) {
            $$14 = this.am % azq.f($$9 + 5.0F);
         }

         brc.a().a("armor");
         a($$0, $$1, $$8, $$11, $$12, $$6);
         brc.a().b("health");
         this.a($$0, $$1, $$6, $$8, $$12, $$14, $$9, $$2, $$5, $$10, $$3);
         bxw $$15 = this.o();
         int $$16 = this.a($$15);
         if ($$16 == 0) {
            brc.a().b("food");
            this.a($$0, $$1, $$8, $$7);
            $$13 -= 10;
         }

         brc.a().b("air");
         this.a($$0, $$1, $$16, $$13, $$7);
         brc.a().c();
      }
   }

   private static void a(ftz $$0, crz $$1, int $$2, int $$3, int $$4, int $$5) {
      int $$6 = $$1.eR();
      if ($$6 > 0) {
         int $$7 = $$2 - ($$3 - 1) * $$4 - 10;

         for (int $$8 = 0; $$8 < 10; $$8++) {
            int $$9 = $$5 + $$8 * 8;
            if ($$8 * 2 + 1 < $$6) {
               $$0.a(gsn::H, v, $$9, $$7, 9, 9);
            }

            if ($$8 * 2 + 1 == $$6) {
               $$0.a(gsn::H, u, $$9, $$7, 9, 9);
            }

            if ($$8 * 2 + 1 > $$6) {
               $$0.a(gsn::H, t, $$9, $$7, 9, 9);
            }
         }
      }
   }

   private void a(ftz $$0, crz $$1, int $$2, int $$3, int $$4, int $$5, float $$6, int $$7, int $$8, int $$9, boolean $$10) {
      fty.b $$11 = fty.b.a($$1);
      boolean $$12 = $$1.dV().C_().l();
      int $$13 = azq.c((double)$$6 / 2.0);
      int $$14 = azq.c((double)$$9 / 2.0);
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

         this.a($$0, fty.b.a, $$19, $$20, $$12, $$10, false);
         int $$21 = $$16 * 2;
         boolean $$22 = $$16 >= $$13;
         if ($$22) {
            int $$23 = $$21 - $$15;
            if ($$23 < $$9) {
               boolean $$24 = $$23 + 1 == $$9;
               this.a($$0, $$11 == fty.b.d ? $$11 : fty.b.e, $$19, $$20, $$12, false, $$24);
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

   private void a(ftz $$0, fty.b $$1, int $$2, int $$3, boolean $$4, boolean $$5, boolean $$6) {
      $$0.a(gsn::H, $$1.a($$4, $$6, $$5), $$2, $$3, 9, 9);
   }

   private void a(ftz $$0, crz $$1, int $$2, int $$3, int $$4) {
      int $$5 = $$1.cr();
      int $$6 = Math.clamp((long)$$1.cs(), 0, $$5);
      boolean $$7 = $$1.a(axl.a);
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
               $$0.a(gsn::H, C, $$13, $$3, 9, 9);
            } else if ($$11 && $$12 == $$9 && $$7) {
               $$0.a(gsn::H, D, $$13, $$3, 9, 9);
               this.a($$12, $$1, $$10);
            } else if ($$12 > 10 - $$10) {
               int $$14 = $$10 == 10 && this.am % 2 == 0 ? this.aj.a(2) : 0;
               $$0.a(gsn::H, E, $$13, $$3 + $$14, 9, 9);
            }
         }
      }
   }

   private int a(int $$0, int $$1) {
      int $$2 = this.a($$0) - 1;
      return $$1 - $$2 * 10;
   }

   private static int b(int $$0, int $$1, int $$2) {
      return azq.f((float)(($$0 + $$2) * 10) / (float)$$1);
   }

   private static int a(int $$0, boolean $$1) {
      return $$0 != 0 && $$1 ? 1 : 0;
   }

   private void a(int $$0, crz $$1, int $$2) {
      if (this.aI != $$0) {
         float $$3 = 0.5F + 0.1F * (float)Math.max(0, $$2 - 3 + 1);
         float $$4 = 1.0F + 0.1F * (float)Math.max(0, $$2 - 5 + 1);
         $$1.a(awr.dc, $$3, $$4);
         this.aI = $$0;
      }
   }

   private void a(ftz $$0, crz $$1, int $$2, int $$3) {
      cvo $$4 = $$1.gu();
      int $$5 = $$4.a();

      for (int $$6 = 0; $$6 < 10; $$6++) {
         int $$7 = $$2;
         alk $$8;
         alk $$9;
         alk $$10;
         if ($$1.b(bwb.q)) {
            $$8 = w;
            $$9 = x;
            $$10 = y;
         } else {
            $$8 = z;
            $$9 = A;
            $$10 = B;
         }

         if ($$1.gu().c() <= 0.0F && this.am % ($$5 * 3 + 1) == 0) {
            $$7 = $$2 + (this.aj.a(3) - 1);
         }

         int $$14 = $$3 - $$6 * 8 - 9;
         $$0.a(gsn::H, $$8, $$14, $$7, 9, 9);
         if ($$6 * 2 + 1 < $$5) {
            $$0.a(gsn::H, $$10, $$14, $$7, 9, 9);
         }

         if ($$6 * 2 + 1 == $$5) {
            $$0.a(gsn::H, $$9, $$14, $$7, 9, 9);
         }
      }
   }

   private void c(ftz $$0) {
      bxw $$1 = this.o();
      if ($$1 != null) {
         int $$2 = this.a($$1);
         if ($$2 != 0) {
            int $$3 = (int)Math.ceil((double)$$1.eG());
            brc.a().b("mountHealth");
            int $$4 = $$0.b() - 39;
            int $$5 = $$0.a() / 2 + 91;
            int $$6 = $$4;

            for (int $$7 = 0; $$2 > 0; $$7 += 20) {
               int $$8 = Math.min($$2, 10);
               $$2 -= $$8;

               for (int $$9 = 0; $$9 < $$8; $$9++) {
                  int $$10 = $$5 - $$9 * 8 - 9;
                  $$0.a(gsn::H, F, $$10, $$6, 9, 9);
                  if ($$9 * 2 + 1 + $$7 < $$3) {
                     $$0.a(gsn::H, G, $$10, $$6, 9, 9);
                  }

                  if ($$9 * 2 + 1 + $$7 == $$3) {
                     $$0.a(gsn::H, H, $$10, $$6, 9, 9);
                  }
               }

               $$6 -= 10;
            }
         }
      }
   }

   private void a(ftz $$0, alk $$1, float $$2) {
      int $$3 = aya.a($$2);
      $$0.a(gsn::F, $$1, 0, 0, 0.0F, 0.0F, $$0.a(), $$0.b(), $$0.a(), $$0.b(), $$3);
   }

   private void a(ftz $$0, float $$1) {
      float $$2 = (float)Math.min($$0.a(), $$0.b());
      float $$4 = Math.min((float)$$0.a() / $$2, (float)$$0.b() / $$2) * $$1;
      int $$5 = azq.d($$2 * $$4);
      int $$6 = azq.d($$2 * $$4);
      int $$7 = ($$0.a() - $$5) / 2;
      int $$8 = ($$0.b() - $$6) / 2;
      int $$9 = $$7 + $$5;
      int $$10 = $$8 + $$6;
      $$0.a(gsn::H, J, $$7, $$8, 0.0F, 0.0F, $$5, $$6, $$5, $$6);
      $$0.a(gsn.G(), 0, $$10, $$0.a(), $$0.b(), -90, -16777216);
      $$0.a(gsn.G(), 0, 0, $$0.a(), $$8, -90, -16777216);
      $$0.a(gsn.G(), 0, $$8, $$7, $$10, -90, -16777216);
      $$0.a(gsn.G(), $$9, $$8, $$0.a(), $$10, -90, -16777216);
   }

   private void a(bwv $$0) {
      iw $$1 = iw.a($$0.dA(), $$0.dE(), $$0.dG());
      float $$2 = grz.a($$0.dV().F_(), $$0.dV().B($$1));
      float $$3 = azq.a(1.0F - $$2, 0.0F, 1.0F);
      this.b = this.b + ($$3 - this.b) * 0.01F;
   }

   private void a(ftz $$0, @Nullable bwv $$1) {
      ecy $$2 = this.ak.s.E_();
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
         $$3 = azq.a($$3, 0.0F, 1.0F);
         $$7 = aya.a(1.0F, 0.0F, $$3, $$3);
      } else {
         float $$8 = this.b;
         $$8 = azq.a($$8, 0.0F, 1.0F);
         $$7 = aya.a(1.0F, $$8, $$8, $$8);
      }

      $$0.a(gsn::I, I, 0, 0, 0.0F, 0.0F, $$0.a(), $$0.b(), $$0.a(), $$0.b(), $$7);
   }

   private void b(ftz $$0, float $$1) {
      if ($$1 < 1.0F) {
         $$1 *= $$1;
         $$1 *= $$1;
         $$1 = $$1 * 0.8F + 0.2F;
      }

      int $$2 = aya.a($$1);
      hlc $$3 = this.ak.ap().a().a(dng.eu.m());
      $$0.a(gsn::F, $$3, 0, 0, $$0.a(), $$0.b(), $$2);
   }

   private void c(ftz $$0, float $$1) {
      int $$2 = $$0.a();
      int $$3 = $$0.b();
      $$0.c().a();
      float $$4 = azq.h($$1, 2.0F, 1.0F);
      $$0.c().a((float)$$2 / 2.0F, (float)$$3 / 2.0F, 0.0F);
      $$0.c().b($$4, $$4, $$4);
      $$0.c().a((float)(-$$2) / 2.0F, (float)(-$$3) / 2.0F, 0.0F);
      float $$5 = 0.2F * $$1;
      float $$6 = 0.4F * $$1;
      float $$7 = 0.2F * $$1;
      $$0.a($$0x -> gsn.H(), a, 0, 0, 0.0F, 0.0F, $$2, $$3, $$2, $$3, aya.a(1.0F, $$5, $$6, $$7));
      $$0.c().b();
   }

   private void a(ftz $$0, int $$1, int $$2, fqv $$3, crz $$4, daa $$5, int $$6) {
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
      bwv $$0 = this.ak.ao();
      if ($$0 != null) {
         this.a($$0);
      }

      if (this.ak.t != null) {
         daa $$1 = this.ak.t.gj().g();
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
      this.aJ = azq.h(0.2F, this.aJ, $$1 ? 1.0F : 0.0F);
   }

   public void a(xc $$0) {
      xc $$1 = xc.a("record.nowPlaying", $$0);
      this.a($$1, true);
      this.ak.aY().c($$1);
   }

   public void a(xc $$0, boolean $$1) {
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

   public void b(xc $$0) {
      this.aA = $$0;
   }

   public void c(xc $$0) {
      this.az = $$0;
      this.ay = this.aB + this.aC + this.aD;
   }

   public void c() {
      this.az = null;
      this.aA = null;
      this.ay = 0;
   }

   public fuo d() {
      return this.al;
   }

   public int e() {
      return this.am;
   }

   public ftx f() {
      return this.ak.h;
   }

   public fwn g() {
      return this.av;
   }

   public fvo h() {
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

   public fum j() {
      return this.ax;
   }

   public fuv k() {
      return this.at;
   }

   public void l() {
      this.at.a();
   }

   public void b(ftz $$0, fqv $$1) {
      if (this.ak.n.ai().c() && (this.aJ > 0.0F || this.aK > 0.0F)) {
         int $$2 = azq.d(255.0F * azq.a(azq.h($$1.b(), this.aK, this.aJ), 0.0F, 1.0F));
         if ($$2 > 8) {
            ftx $$3 = this.f();
            int $$4 = $$3.a(N);
            int $$5 = aya.c($$2, -1);
            int $$6 = $$0.a() - $$4 - 5;
            int $$7 = $$0.b() - 9 - 5;
            $$0.a($$3, N, $$6, $$7, $$4, $$5);
         }
      }
   }

   static enum b {
      a(
         alk.b("hud/heart/container"),
         alk.b("hud/heart/container_blinking"),
         alk.b("hud/heart/container"),
         alk.b("hud/heart/container_blinking"),
         alk.b("hud/heart/container_hardcore"),
         alk.b("hud/heart/container_hardcore_blinking"),
         alk.b("hud/heart/container_hardcore"),
         alk.b("hud/heart/container_hardcore_blinking")
      ),
      b(
         alk.b("hud/heart/full"),
         alk.b("hud/heart/full_blinking"),
         alk.b("hud/heart/half"),
         alk.b("hud/heart/half_blinking"),
         alk.b("hud/heart/hardcore_full"),
         alk.b("hud/heart/hardcore_full_blinking"),
         alk.b("hud/heart/hardcore_half"),
         alk.b("hud/heart/hardcore_half_blinking")
      ),
      c(
         alk.b("hud/heart/poisoned_full"),
         alk.b("hud/heart/poisoned_full_blinking"),
         alk.b("hud/heart/poisoned_half"),
         alk.b("hud/heart/poisoned_half_blinking"),
         alk.b("hud/heart/poisoned_hardcore_full"),
         alk.b("hud/heart/poisoned_hardcore_full_blinking"),
         alk.b("hud/heart/poisoned_hardcore_half"),
         alk.b("hud/heart/poisoned_hardcore_half_blinking")
      ),
      d(
         alk.b("hud/heart/withered_full"),
         alk.b("hud/heart/withered_full_blinking"),
         alk.b("hud/heart/withered_half"),
         alk.b("hud/heart/withered_half_blinking"),
         alk.b("hud/heart/withered_hardcore_full"),
         alk.b("hud/heart/withered_hardcore_full_blinking"),
         alk.b("hud/heart/withered_hardcore_half"),
         alk.b("hud/heart/withered_hardcore_half_blinking")
      ),
      e(
         alk.b("hud/heart/absorbing_full"),
         alk.b("hud/heart/absorbing_full_blinking"),
         alk.b("hud/heart/absorbing_half"),
         alk.b("hud/heart/absorbing_half_blinking"),
         alk.b("hud/heart/absorbing_hardcore_full"),
         alk.b("hud/heart/absorbing_hardcore_full_blinking"),
         alk.b("hud/heart/absorbing_hardcore_half"),
         alk.b("hud/heart/absorbing_hardcore_half_blinking")
      ),
      f(
         alk.b("hud/heart/frozen_full"),
         alk.b("hud/heart/frozen_full_blinking"),
         alk.b("hud/heart/frozen_half"),
         alk.b("hud/heart/frozen_half_blinking"),
         alk.b("hud/heart/frozen_hardcore_full"),
         alk.b("hud/heart/frozen_hardcore_full_blinking"),
         alk.b("hud/heart/frozen_hardcore_half"),
         alk.b("hud/heart/frozen_hardcore_half_blinking")
      );

      private final alk g;
      private final alk h;
      private final alk i;
      private final alk j;
      private final alk k;
      private final alk l;
      private final alk m;
      private final alk n;

      private b(final alk $$0, final alk $$1, final alk $$2, final alk $$3, final alk $$4, final alk $$5, final alk $$6, final alk $$7) {
         this.g = $$0;
         this.h = $$1;
         this.i = $$2;
         this.j = $$3;
         this.k = $$4;
         this.l = $$5;
         this.m = $$6;
         this.n = $$7;
      }

      public alk a(boolean $$0, boolean $$1, boolean $$2) {
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

      static fty.b a(crz $$0) {
         fty.b $$1;
         if ($$0.b(bwb.s)) {
            $$1 = c;
         } else if ($$0.b(bwb.t)) {
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
