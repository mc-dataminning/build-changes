import com.google.common.collect.Lists;
import com.google.common.collect.Ordering;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;
import org.joml.Matrix4fStack;

public class fjw {
   private static final alc c = alc.b("hud/crosshair");
   private static final alc d = alc.b("hud/crosshair_attack_indicator_full");
   private static final alc e = alc.b("hud/crosshair_attack_indicator_background");
   private static final alc f = alc.b("hud/crosshair_attack_indicator_progress");
   private static final alc g = alc.b("hud/effect_background_ambient");
   private static final alc h = alc.b("hud/effect_background");
   private static final alc i = alc.b("hud/hotbar");
   private static final alc j = alc.b("hud/hotbar_selection");
   private static final alc k = alc.b("hud/hotbar_offhand_left");
   private static final alc l = alc.b("hud/hotbar_offhand_right");
   private static final alc m = alc.b("hud/hotbar_attack_indicator_background");
   private static final alc n = alc.b("hud/hotbar_attack_indicator_progress");
   private static final alc o = alc.b("hud/jump_bar_background");
   private static final alc p = alc.b("hud/jump_bar_cooldown");
   private static final alc q = alc.b("hud/jump_bar_progress");
   private static final alc r = alc.b("hud/experience_bar_background");
   private static final alc s = alc.b("hud/experience_bar_progress");
   private static final alc t = alc.b("hud/armor_empty");
   private static final alc u = alc.b("hud/armor_half");
   private static final alc v = alc.b("hud/armor_full");
   private static final alc w = alc.b("hud/food_empty_hunger");
   private static final alc x = alc.b("hud/food_half_hunger");
   private static final alc y = alc.b("hud/food_full_hunger");
   private static final alc z = alc.b("hud/food_empty");
   private static final alc A = alc.b("hud/food_half");
   private static final alc B = alc.b("hud/food_full");
   private static final alc C = alc.b("hud/air");
   private static final alc D = alc.b("hud/air_bursting");
   private static final alc E = alc.b("hud/heart/vehicle_container");
   private static final alc F = alc.b("hud/heart/vehicle_full");
   private static final alc G = alc.b("hud/heart/vehicle_half");
   private static final alc H = alc.b("textures/misc/vignette.png");
   public static final alc a = alc.b("textures/misc/nausea.png");
   private static final alc I = alc.b("textures/misc/pumpkinblur.png");
   private static final alc J = alc.b("textures/misc/spyglass_scope.png");
   private static final alc K = alc.b("textures/misc/powder_snow_outline.png");
   private static final Comparator<ezq> L = Comparator.comparing(ezq::d).reversed().thenComparing(ezq::c, String.CASE_INSENSITIVE_ORDER);
   private static final xd M = xd.c("demo.demoExpired");
   private static final xd N = xd.c("menu.savingLevel");
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
   private final azl Y = azl.a();
   private final fil Z;
   private final fkl aa;
   private int ab;
   @Nullable
   private xd ac;
   private int ad;
   private boolean ae;
   private boolean af;
   public float b = 1.0F;
   private int ag;
   private cvp ah = cvp.k;
   private final fks ai;
   private final fls aj;
   private final fmk ak;
   private final fll al;
   private final fkj am;
   private int an;
   @Nullable
   private xd ao;
   @Nullable
   private xd ap;
   private int aq;
   private int ar;
   private int as;
   private int at;
   private int au;
   private long av;
   private long aw;
   private float ax;
   private float ay;
   private final fka az = new fka();
   private float aA;

   public fjw(fil $$0) {
      this.Z = $$0;
      this.ai = new fks($$0);
      this.ak = new fmk($$0);
      this.aa = new fkl($$0);
      this.al = new fll($$0, this);
      this.am = new fkj($$0);
      this.aj = new fls($$0);
      this.a();
      fka $$1 = new fka().a(this::c).a(this::j).a(this::l).a(this::n).a(this::k).a(($$0x, $$1x) -> this.am.a($$0x));
      fka $$2 = new fka().a(this::o).a(($$0x, $$1x) -> {
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

   public void a(fjx $$0, fib $$1) {
      this.az.a($$0, $$1);
   }

   private void c(fjx $$0, fib $$1) {
      if (fil.N()) {
         this.a($$0, this.Z.ao());
      }

      float $$2 = $$1.a();
      this.aA = azd.h(0.5F * $$2, this.aA, 1.125F);
      if (this.Z.n.aD().a()) {
         if (this.Z.t.gA()) {
            this.a($$0, this.aA);
         } else {
            this.aA = 0.5F;
            cvp $$3 = this.Z.t.gc().g(3);
            if ($$3.a(dhl.ee.q())) {
               this.a($$0, I, 1.0F);
            }
         }
      }

      if (this.Z.t.cr() > 0) {
         this.a($$0, K, this.Z.t.cs());
      }

      float $$4 = azd.h($$1.a(false), this.Z.t.cG, this.Z.t.cF);
      if ($$4 > 0.0F) {
         if (!this.Z.t.b(bsx.i)) {
            this.b($$0, $$4);
         } else {
            float $$5 = this.Z.n.al().c().floatValue();
            if ($$5 < 1.0F) {
               float $$6 = $$4 * (1.0F - $$5);
               this.c($$0, $$6);
            }
         }
      }
   }

   private void d(fjx $$0, fib $$1) {
      if (this.Z.t.gg() > 0) {
         this.Z.aK().a("sleep");
         float $$2 = (float)this.Z.t.gg();
         float $$3 = $$2 / 100.0F;
         if ($$3 > 1.0F) {
            $$3 = 1.0F - ($$2 - 100.0F) / 10.0F;
         }

         int $$4 = (int)(220.0F * $$3) << 24 | 1052704;
         $$0.a(ghq.G(), 0, 0, $$0.a(), $$0.b(), $$4);
         this.Z.aK().c();
      }
   }

   private void e(fjx $$0, fib $$1) {
      fjv $$2 = this.f();
      if (this.ac != null && this.ad > 0) {
         this.Z.aK().a("overlayMessage");
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
               $$5 = azd.a($$3 / 50.0F, 0.7F, 0.6F, $$4);
            } else {
               $$5 = axo.c($$4, -1);
            }

            int $$7 = $$2.a(this.ac);
            $$0.a($$2, this.ac, -$$7 / 2, -4, $$7, $$5);
            $$0.c().b();
         }

         this.Z.aK().c();
      }
   }

   private void f(fjx $$0, fib $$1) {
      if (this.ao != null && this.an > 0) {
         fjv $$2 = this.f();
         this.Z.aK().a("titleAndSubtitle");
         float $$3 = (float)this.an - $$1.a(false);
         int $$4 = 255;
         if (this.an > this.as + this.ar) {
            float $$5 = (float)(this.aq + this.ar + this.as) - $$3;
            $$4 = (int)($$5 * 255.0F / (float)this.aq);
         }

         if (this.an <= this.as) {
            $$4 = (int)($$3 * 255.0F / (float)this.as);
         }

         $$4 = azd.a($$4, 0, 255);
         if ($$4 > 8) {
            $$0.c().a();
            $$0.c().a((float)($$0.a() / 2), (float)($$0.b() / 2), 0.0F);
            $$0.c().a();
            $$0.c().b(4.0F, 4.0F, 4.0F);
            int $$6 = $$2.a(this.ao);
            int $$7 = axo.c($$4, -1);
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

         this.Z.aK().c();
      }
   }

   private void g(fjx $$0, fib $$1) {
      if (!this.aa.e()) {
         fch $$2 = this.Z.aP();
         int $$3 = azd.a(this.Z.o.e() * (double)$$2.p() / (double)$$2.n());
         int $$4 = azd.a(this.Z.o.f() * (double)$$2.q() / (double)$$2.o());
         this.aa.a($$0, this.ab, $$3, $$4, false);
      }
   }

   private void h(fjx $$0, fib $$1) {
      ezx $$2 = this.Z.s.O();
      ezp $$3 = null;
      ezs $$4 = $$2.e(this.Z.t.cF());
      if ($$4 != null) {
         ezo $$5 = ezo.a($$4.n());
         if ($$5 != null) {
            $$3 = $$2.a($$5);
         }
      }

      ezp $$6 = $$3 != null ? $$3 : $$2.a(ezo.b);
      if ($$6 != null) {
         this.a($$0, $$6);
      }
   }

   private void i(fjx $$0, fib $$1) {
      ezx $$2 = this.Z.s.O();
      ezp $$3 = $$2.a(ezo.a);
      if (!this.Z.n.J.e() || this.Z.T() && this.Z.t.cw.l().size() <= 1 && $$3 == null) {
         this.al.a(false);
      } else {
         this.al.a(true);
         this.al.a($$0, $$0.a(), $$2, $$3);
      }
   }

   private void j(fjx $$0, fib $$1) {
      fip $$2 = this.Z.n;
      if ($$2.aD().a()) {
         if (this.Z.r.j() != ded.d || this.a(this.Z.w)) {
            if (this.ai.d() && !this.Z.t.gs() && !$$2.X().c()) {
               fhu $$3 = this.Z.j.k();
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
               $$0.a(ghq::D, c, ($$0.a() - 15) / 2, ($$0.b() - 15) / 2, 15, 15);
               if (this.Z.n.E().c() == fht.b) {
                  float $$6 = this.Z.t.H(0.0F);
                  boolean $$7 = false;
                  if (this.Z.v != null && this.Z.v instanceof buk && $$6 >= 1.0F) {
                     $$7 = this.Z.t.gv() > 5.0F;
                     $$7 &= this.Z.v.bI();
                  }

                  int $$8 = $$0.b() / 2 - 7 + 16;
                  int $$9 = $$0.a() / 2 - 8;
                  if ($$7) {
                     $$0.a(ghq::D, d, $$9, $$8, 16, 16);
                  } else if ($$6 < 1.0F) {
                     int $$10 = (int)($$6 * 17.0F);
                     $$0.a(ghq::D, e, $$9, $$8, 16, 4);
                     $$0.a(ghq::D, f, 16, 4, 0, 0, $$9, $$8, $$10, 4);
                  }
               }
            }
         }
      }
   }

   private boolean a(@Nullable eyq $$0) {
      if ($$0 == null) {
         return false;
      } else if ($$0.d() == eyq.a.c) {
         return ((eyp)$$0).a() instanceof brr;
      } else if ($$0.d() == eyq.a.b) {
         je $$1 = ((eyo)$$0).b();
         deg $$2 = this.Z.s;
         return $$2.a_($$1).b($$2, $$1) != null;
      } else {
         return false;
      }
   }

   private void k(fjx $$0, fib $$1) {
      Collection<bsv> $$2 = this.Z.t.ex();
      if (!$$2.isEmpty()) {
         if (this.Z.z instanceof frk $$3 && $$3.J()) {
            return;
         }

         int $$4 = 0;
         int $$5 = 0;
         gya $$6 = this.Z.aG();
         List<Runnable> $$7 = Lists.newArrayListWithExpectedSize($$2.size());

         for (bsv $$8 : Ordering.natural().reverse().sortedCopy($$2)) {
            jn<bst> $$9 = $$8.c();
            if ($$8.h()) {
               int $$10 = $$0.a();
               int $$11 = 1;
               if (this.Z.K()) {
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
                  $$0.a(ghq::B, g, $$10, $$11, 24, 24);
               } else {
                  $$0.a(ghq::B, h, $$10, $$11, 24, 24);
                  if ($$8.a(200)) {
                     int $$13 = $$8.d();
                     int $$14 = 10 - $$13 / 20;
                     $$12 = azd.a((float)$$13 / 10.0F / 5.0F * 0.5F, 0.0F, 0.5F)
                        + azd.b((float)$$13 * (float) Math.PI / 5.0F) * azd.a((float)$$14 / 10.0F * 0.25F, 0.0F, 0.25F);
                     $$12 = azd.a($$12, 0.0F, 1.0F);
                  }
               }

               gxb $$15 = $$6.a($$9);
               int $$16 = $$10;
               int $$17 = $$11;
               float $$18 = $$12;
               $$7.add(() -> {
                  int $$5x = axo.a($$18);
                  $$0.a(ghq::B, $$15, $$16 + 3, $$17 + 3, 18, 18, $$5x);
               });
            }
         }

         $$7.forEach(Runnable::run);
      }
   }

   private void l(fjx $$0, fib $$1) {
      if (this.Z.r.j() == ded.d) {
         this.ak.a($$0);
      } else {
         this.m($$0, $$1);
      }

      int $$2 = $$0.a() / 2 - 91;
      buu $$3 = this.Z.t.p();
      if ($$3 != null) {
         this.a($$3, $$0, $$2);
      } else if (this.m()) {
         this.a($$0, $$2);
      }

      if (this.Z.r.a()) {
         this.b($$0);
      }

      this.c($$0);
      if (this.Z.r.j() != ded.d) {
         this.a($$0);
      } else if (this.Z.t.P_()) {
         this.ak.b($$0);
      }
   }

   private void m(fjx $$0, fib $$1) {
      cnu $$2 = this.n();
      if ($$2 != null) {
         cvp $$3 = $$2.eX();
         bue $$4 = $$2.fu().e();
         int $$5 = $$0.a() / 2;
         int $$6 = 182;
         int $$7 = 91;
         $$0.c().a();
         $$0.c().a(0.0F, 0.0F, -90.0F);
         $$0.a(ghq::B, i, $$5 - 91, $$0.b() - 22, 182, 22);
         $$0.a(ghq::B, j, $$5 - 91 - 1 + $$2.gc().j * 20, $$0.b() - 22 - 1, 24, 23);
         if (!$$3.f()) {
            if ($$4 == bue.a) {
               $$0.a(ghq::B, k, $$5 - 91 - 29, $$0.b() - 23, 29, 24);
            } else {
               $$0.a(ghq::B, l, $$5 + 91, $$0.b() - 23, 29, 24);
            }
         }

         $$0.c().b();
         int $$8 = 1;

         for (int $$9 = 0; $$9 < 9; $$9++) {
            int $$10 = $$5 - 90 + $$9 * 20 + 2;
            int $$11 = $$0.b() - 16 - 3;
            this.a($$0, $$10, $$11, $$1, $$2, $$2.gc().g.get($$9), $$8++);
         }

         if (!$$3.f()) {
            int $$12 = $$0.b() - 16 - 3;
            if ($$4 == bue.a) {
               this.a($$0, $$5 - 91 - 26, $$12, $$1, $$2, $$3, $$8++);
            } else {
               this.a($$0, $$5 + 91 + 10, $$12, $$1, $$2, $$3, $$8++);
            }
         }

         if (this.Z.n.E().c() == fht.c) {
            float $$13 = this.Z.t.H(0.0F);
            if ($$13 < 1.0F) {
               int $$14 = $$0.b() - 20;
               int $$15 = $$5 + 91 + 6;
               if ($$4 == bue.b) {
                  $$15 = $$5 - 91 - 22;
               }

               int $$16 = (int)($$13 * 19.0F);
               $$0.a(ghq::B, m, $$15, $$14, 18, 18);
               $$0.a(ghq::B, n, 18, 18, 0, 18 - $$16, $$15, $$14 + 18 - $$16, 18, $$16);
            }
         }
      }
   }

   private void a(buu $$0, fjx $$1, int $$2) {
      this.Z.aK().a("jumpBar");
      float $$3 = this.Z.t.q();
      int $$4 = 182;
      int $$5 = (int)($$3 * 183.0F);
      int $$6 = $$1.b() - 32 + 3;
      $$1.a(ghq::B, o, $$2, $$6, 182, 5);
      if ($$0.c() > 0) {
         $$1.a(ghq::B, p, $$2, $$6, 182, 5);
      } else if ($$5 > 0) {
         $$1.a(ghq::B, q, 182, 5, 0, 0, $$2, $$6, $$5, 5);
      }

      this.Z.aK().c();
   }

   private void a(fjx $$0, int $$1) {
      this.Z.aK().a("expBar");
      int $$2 = this.Z.t.gl();
      if ($$2 > 0) {
         int $$3 = 182;
         int $$4 = (int)(this.Z.t.co * 183.0F);
         int $$5 = $$0.b() - 32 + 3;
         $$0.a(ghq::B, r, $$1, $$5, 182, 5);
         if ($$4 > 0) {
            $$0.a(ghq::B, s, 182, 5, 0, 0, $$1, $$5, $$4, 5);
         }
      }

      this.Z.aK().c();
   }

   private void n(fjx $$0, fib $$1) {
      int $$2 = this.Z.t.cm;
      if (this.m() && $$2 > 0) {
         this.Z.aK().a("expLevel");
         String $$3 = $$2 + "";
         int $$4 = ($$0.a() - this.f().b($$3)) / 2;
         int $$5 = $$0.b() - 31 - 4;
         $$0.a(this.f(), $$3, $$4 + 1, $$5, 0, false);
         $$0.a(this.f(), $$3, $$4 - 1, $$5, 0, false);
         $$0.a(this.f(), $$3, $$4, $$5 + 1, 0, false);
         $$0.a(this.f(), $$3, $$4, $$5 - 1, 0, false);
         $$0.a(this.f(), $$3, $$4, $$5, 8453920, false);
         this.Z.aK().c();
      }
   }

   private boolean m() {
      return this.Z.t.p() == null && this.Z.r.d();
   }

   private void a(fjx $$0) {
      this.Z.aK().a("selectedItemName");
      if (this.ag > 0 && !this.ah.f()) {
         xr $$1 = xd.i().b(this.ah.y()).a(this.ah.A().a());
         if (this.ah.b(kr.g)) {
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
            $$0.a(this.f(), (xd)$$1, $$3, $$4, $$2, axo.c($$5, -1));
         }
      }

      this.Z.aK().c();
   }

   private void o(fjx $$0, fib $$1) {
      if (this.Z.K()) {
         this.Z.aK().a("demo");
         xd $$2;
         if (this.Z.s.aa() >= 120500L) {
            $$2 = M;
         } else {
            $$2 = xd.a("demo.remainingTime", baa.a((int)(120500L - this.Z.s.aa()), this.Z.s.s().f()));
         }

         int $$4 = this.f().a($$2);
         int $$5 = $$0.a() - $$4 - 10;
         int $$6 = 5;
         $$0.a(this.f(), $$2, $$5, 5, $$4, -1);
         this.Z.aK().c();
      }
   }

   private void a(fjx $$0, ezp $$1) {
      ezx $$2 = $$1.a();
      yt $$3 = $$1.a(yw.c);

      record a(xd a, xd b, int c) {
      }

      a[] $$4 = $$2.i($$1).stream().filter($$0x -> !$$0x.a()).sorted(L).limit(15L).map($$2x -> {
         ezs $$3x = $$2.e($$2x.c());
         xd $$4x = $$2x.b();
         xd $$5x = ezs.a($$3x, $$4x);
         xd $$6x = $$2x.a($$3);
         int $$7x = this.f().a($$6x);
         return new a($$5x, $$6x, $$7x);
      }).toArray(a[]::new);
      xd $$5 = $$1.d();
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
   private cnu n() {
      return this.Z.ao() instanceof cnu $$0 ? $$0 : null;
   }

   @Nullable
   private buk o() {
      cnu $$0 = this.n();
      if ($$0 != null) {
         bto $$1 = $$0.dg();
         if ($$1 == null) {
            return null;
         }

         if ($$1 instanceof buk) {
            return (buk)$$1;
         }
      }

      return null;
   }

   private int a(@Nullable buk $$0) {
      if ($$0 != null && $$0.bL()) {
         float $$1 = $$0.eQ();
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

   private void b(fjx $$0) {
      cnu $$1 = this.n();
      if ($$1 != null) {
         int $$2 = azd.f($$1.eA());
         boolean $$3 = this.aw > (long)this.ab && (this.aw - (long)this.ab) / 3L % 2L == 1L;
         long $$4 = ad.c();
         if ($$2 < this.at && $$1.ak > 0) {
            this.av = $$4;
            this.aw = (long)(this.ab + 20);
         } else if ($$2 > this.at && $$1.ak > 0) {
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
         float $$9 = Math.max((float)$$1.h(bvr.s), (float)Math.max($$5, $$2));
         int $$10 = azd.f($$1.fs());
         int $$11 = azd.f(($$9 + (float)$$10) / 2.0F / 10.0F);
         int $$12 = Math.max(10 - ($$11 - 2), 3);
         int $$13 = $$8 - 10;
         int $$14 = -1;
         if ($$1.b(bsx.j)) {
            $$14 = this.ab % azd.f($$9 + 5.0F);
         }

         this.Z.aK().a("armor");
         a($$0, $$1, $$8, $$11, $$12, $$6);
         this.Z.aK().b("health");
         this.a($$0, $$1, $$6, $$8, $$12, $$14, $$9, $$2, $$5, $$10, $$3);
         buk $$15 = this.o();
         int $$16 = this.a($$15);
         if ($$16 == 0) {
            this.Z.aK().b("food");
            this.a($$0, $$1, $$8, $$7);
            $$13 -= 10;
         }

         this.Z.aK().b("air");
         int $$17 = $$1.cp();
         int $$18 = Math.min($$1.cq(), $$17);
         if ($$1.a(awz.a) || $$18 < $$17) {
            int $$19 = this.a($$16) - 1;
            $$13 -= $$19 * 10;
            int $$20 = azd.c((double)($$18 - 2) * 10.0 / (double)$$17);
            int $$21 = azd.c((double)$$18 * 10.0 / (double)$$17) - $$20;

            for (int $$22 = 0; $$22 < $$20 + $$21; $$22++) {
               if ($$22 < $$20) {
                  $$0.a(ghq::B, C, $$7 - $$22 * 8 - 9, $$13, 9, 9);
               } else {
                  $$0.a(ghq::B, D, $$7 - $$22 * 8 - 9, $$13, 9, 9);
               }
            }
         }

         this.Z.aK().c();
      }
   }

   private static void a(fjx $$0, cnu $$1, int $$2, int $$3, int $$4, int $$5) {
      int $$6 = $$1.eN();
      if ($$6 > 0) {
         int $$7 = $$2 - ($$3 - 1) * $$4 - 10;

         for (int $$8 = 0; $$8 < 10; $$8++) {
            int $$9 = $$5 + $$8 * 8;
            if ($$8 * 2 + 1 < $$6) {
               $$0.a(ghq::B, v, $$9, $$7, 9, 9);
            }

            if ($$8 * 2 + 1 == $$6) {
               $$0.a(ghq::B, u, $$9, $$7, 9, 9);
            }

            if ($$8 * 2 + 1 > $$6) {
               $$0.a(ghq::B, t, $$9, $$7, 9, 9);
            }
         }
      }
   }

   private void a(fjx $$0, cnu $$1, int $$2, int $$3, int $$4, int $$5, float $$6, int $$7, int $$8, int $$9, boolean $$10) {
      fjw.b $$11 = fjw.b.a($$1);
      boolean $$12 = $$1.dS().y_().l();
      int $$13 = azd.c((double)$$6 / 2.0);
      int $$14 = azd.c((double)$$9 / 2.0);
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

         this.a($$0, fjw.b.a, $$19, $$20, $$12, $$10, false);
         int $$21 = $$16 * 2;
         boolean $$22 = $$16 >= $$13;
         if ($$22) {
            int $$23 = $$21 - $$15;
            if ($$23 < $$9) {
               boolean $$24 = $$23 + 1 == $$9;
               this.a($$0, $$11 == fjw.b.d ? $$11 : fjw.b.e, $$19, $$20, $$12, false, $$24);
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

   private void a(fjx $$0, fjw.b $$1, int $$2, int $$3, boolean $$4, boolean $$5, boolean $$6) {
      $$0.a(ghq::B, $$1.a($$4, $$6, $$5), $$2, $$3, 9, 9);
   }

   private void a(fjx $$0, cnu $$1, int $$2, int $$3) {
      cqs $$4 = $$1.gm();
      int $$5 = $$4.a();

      for (int $$6 = 0; $$6 < 10; $$6++) {
         int $$7 = $$2;
         alc $$8;
         alc $$9;
         alc $$10;
         if ($$1.b(bsx.q)) {
            $$8 = w;
            $$9 = x;
            $$10 = y;
         } else {
            $$8 = z;
            $$9 = A;
            $$10 = B;
         }

         if ($$1.gm().e() <= 0.0F && this.ab % ($$5 * 3 + 1) == 0) {
            $$7 = $$2 + (this.Y.a(3) - 1);
         }

         int $$14 = $$3 - $$6 * 8 - 9;
         $$0.a(ghq::B, $$8, $$14, $$7, 9, 9);
         if ($$6 * 2 + 1 < $$5) {
            $$0.a(ghq::B, $$10, $$14, $$7, 9, 9);
         }

         if ($$6 * 2 + 1 == $$5) {
            $$0.a(ghq::B, $$9, $$14, $$7, 9, 9);
         }
      }
   }

   private void c(fjx $$0) {
      buk $$1 = this.o();
      if ($$1 != null) {
         int $$2 = this.a($$1);
         if ($$2 != 0) {
            int $$3 = (int)Math.ceil((double)$$1.eA());
            this.Z.aK().b("mountHealth");
            int $$4 = $$0.b() - 39;
            int $$5 = $$0.a() / 2 + 91;
            int $$6 = $$4;

            for (int $$7 = 0; $$2 > 0; $$7 += 20) {
               int $$8 = Math.min($$2, 10);
               $$2 -= $$8;

               for (int $$9 = 0; $$9 < $$8; $$9++) {
                  int $$10 = $$5 - $$9 * 8 - 9;
                  $$0.a(ghq::B, E, $$10, $$6, 9, 9);
                  if ($$9 * 2 + 1 + $$7 < $$3) {
                     $$0.a(ghq::B, F, $$10, $$6, 9, 9);
                  }

                  if ($$9 * 2 + 1 + $$7 == $$3) {
                     $$0.a(ghq::B, G, $$10, $$6, 9, 9);
                  }
               }

               $$6 -= 10;
            }
         }
      }
   }

   private void a(fjx $$0, alc $$1, float $$2) {
      int $$3 = axo.a($$2);
      $$0.a(ghq::z, $$1, 0, 0, 0.0F, 0.0F, $$0.a(), $$0.b(), $$0.a(), $$0.b(), $$3);
   }

   private void a(fjx $$0, float $$1) {
      float $$2 = (float)Math.min($$0.a(), $$0.b());
      float $$4 = Math.min((float)$$0.a() / $$2, (float)$$0.b() / $$2) * $$1;
      int $$5 = azd.d($$2 * $$4);
      int $$6 = azd.d($$2 * $$4);
      int $$7 = ($$0.a() - $$5) / 2;
      int $$8 = ($$0.b() - $$6) / 2;
      int $$9 = $$7 + $$5;
      int $$10 = $$8 + $$6;
      $$0.a(ghq::B, J, $$7, $$8, 0.0F, 0.0F, $$5, $$6, $$5, $$6);
      $$0.a(ghq.G(), 0, $$10, $$0.a(), $$0.b(), -90, -16777216);
      $$0.a(ghq.G(), 0, 0, $$0.a(), $$8, -90, -16777216);
      $$0.a(ghq.G(), 0, $$8, $$7, $$10, -90, -16777216);
      $$0.a(ghq.G(), $$9, $$8, $$0.a(), $$10, -90, -16777216);
   }

   private void a(bto $$0) {
      je $$1 = je.a($$0.dx(), $$0.dB(), $$0.dD());
      float $$2 = ghe.a($$0.dS().B_(), $$0.dS().A($$1));
      float $$3 = azd.a(1.0F - $$2, 0.0F, 1.0F);
      this.b = this.b + ($$3 - this.b) * 0.01F;
   }

   private void a(fjx $$0, @Nullable bto $$1) {
      dwf $$2 = this.Z.s.A_();
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
         $$3 = azd.a($$3, 0.0F, 1.0F);
         $$7 = axo.a(1.0F, 0.0F, $$3, $$3);
      } else {
         float $$8 = this.b;
         $$8 = azd.a($$8, 0.0F, 1.0F);
         $$7 = axo.a(1.0F, $$8, $$8, $$8);
      }

      $$0.a(ghq::C, H, 0, 0, 0.0F, 0.0F, $$0.a(), $$0.b(), $$0.a(), $$0.b(), $$7);
   }

   private void b(fjx $$0, float $$1) {
      if ($$1 < 1.0F) {
         $$1 *= $$1;
         $$1 *= $$1;
         $$1 = $$1 * 0.8F + 0.2F;
      }

      int $$2 = axo.a($$1);
      gxb $$3 = this.Z.ap().a().a(dhl.ed.o());
      $$0.a(ghq::z, $$3, 0, 0, $$0.a(), $$0.b(), $$2);
   }

   private void c(fjx $$0, float $$1) {
      int $$2 = $$0.a();
      int $$3 = $$0.b();
      $$0.c().a();
      float $$4 = azd.h($$1, 2.0F, 1.0F);
      $$0.c().a((float)$$2 / 2.0F, (float)$$3 / 2.0F, 0.0F);
      $$0.c().b($$4, $$4, $$4);
      $$0.c().a((float)(-$$2) / 2.0F, (float)(-$$3) / 2.0F, 0.0F);
      float $$5 = 0.2F * $$1;
      float $$6 = 0.4F * $$1;
      float $$7 = 0.2F * $$1;
      $$0.a($$0x -> ghq.H(), a, 0, 0, 0.0F, 0.0F, $$2, $$3, $$2, $$3, axo.a(1.0F, $$5, $$6, $$7));
      $$0.c().b();
   }

   private void a(fjx $$0, int $$1, int $$2, fib $$3, cnu $$4, cvp $$5, int $$6) {
      if (!$$5.f()) {
         float $$7 = (float)$$5.I() - $$3.a(false);
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
      bto $$0 = this.Z.ao();
      if ($$0 != null) {
         this.a($$0);
      }

      if (this.Z.t != null) {
         cvp $$1 = this.Z.t.gc().f();
         if ($$1.f()) {
            this.ag = 0;
         } else if (this.ah.f() || !$$1.a(this.ah.h()) || !$$1.y().equals(this.ah.y())) {
            this.ag = (int)(40.0 * this.Z.n.C().c());
         } else if (this.ag > 0) {
            this.ag--;
         }

         this.ah = $$1;
      }

      this.aa.a();
   }

   private void q() {
      MinecraftServer $$0 = this.Z.V();
      boolean $$1 = $$0 != null && $$0.bg();
      this.ay = this.ax;
      this.ax = azd.h(0.2F, this.ax, $$1 ? 1.0F : 0.0F);
   }

   public void a(xd $$0) {
      xd $$1 = xd.a("record.nowPlaying", $$0);
      this.a($$1, true);
      this.Z.aZ().c($$1);
   }

   public void a(xd $$0, boolean $$1) {
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

   public void b(xd $$0) {
      this.ap = $$0;
   }

   public void c(xd $$0) {
      this.ao = $$0;
      this.an = this.aq + this.ar + this.as;
   }

   public void c() {
      this.ao = null;
      this.ap = null;
      this.an = 0;
   }

   public fkl d() {
      return this.aa;
   }

   public int e() {
      return this.ab;
   }

   public fjv f() {
      return this.Z.h;
   }

   public fmk g() {
      return this.ak;
   }

   public fll h() {
      return this.al;
   }

   public void i() {
      this.al.a();
      this.am.a();
      this.Z.aA().b();
      this.ai.p();
      this.aa.a(true);
   }

   public fkj j() {
      return this.am;
   }

   public fks k() {
      return this.ai;
   }

   public void l() {
      this.ai.a();
   }

   public void b(fjx $$0, fib $$1) {
      if (this.Z.n.ah().c() && (this.ax > 0.0F || this.ay > 0.0F)) {
         int $$2 = azd.d(255.0F * azd.a(azd.h($$1.b(), this.ay, this.ax), 0.0F, 1.0F));
         if ($$2 > 8) {
            fjv $$3 = this.f();
            int $$4 = $$3.a(N);
            int $$5 = axo.c($$2, -1);
            int $$6 = $$0.a() - $$4 - 5;
            int $$7 = $$0.b() - 9 - 5;
            $$0.a($$3, N, $$6, $$7, $$4, $$5);
         }
      }
   }

   static enum b {
      a(
         alc.b("hud/heart/container"),
         alc.b("hud/heart/container_blinking"),
         alc.b("hud/heart/container"),
         alc.b("hud/heart/container_blinking"),
         alc.b("hud/heart/container_hardcore"),
         alc.b("hud/heart/container_hardcore_blinking"),
         alc.b("hud/heart/container_hardcore"),
         alc.b("hud/heart/container_hardcore_blinking")
      ),
      b(
         alc.b("hud/heart/full"),
         alc.b("hud/heart/full_blinking"),
         alc.b("hud/heart/half"),
         alc.b("hud/heart/half_blinking"),
         alc.b("hud/heart/hardcore_full"),
         alc.b("hud/heart/hardcore_full_blinking"),
         alc.b("hud/heart/hardcore_half"),
         alc.b("hud/heart/hardcore_half_blinking")
      ),
      c(
         alc.b("hud/heart/poisoned_full"),
         alc.b("hud/heart/poisoned_full_blinking"),
         alc.b("hud/heart/poisoned_half"),
         alc.b("hud/heart/poisoned_half_blinking"),
         alc.b("hud/heart/poisoned_hardcore_full"),
         alc.b("hud/heart/poisoned_hardcore_full_blinking"),
         alc.b("hud/heart/poisoned_hardcore_half"),
         alc.b("hud/heart/poisoned_hardcore_half_blinking")
      ),
      d(
         alc.b("hud/heart/withered_full"),
         alc.b("hud/heart/withered_full_blinking"),
         alc.b("hud/heart/withered_half"),
         alc.b("hud/heart/withered_half_blinking"),
         alc.b("hud/heart/withered_hardcore_full"),
         alc.b("hud/heart/withered_hardcore_full_blinking"),
         alc.b("hud/heart/withered_hardcore_half"),
         alc.b("hud/heart/withered_hardcore_half_blinking")
      ),
      e(
         alc.b("hud/heart/absorbing_full"),
         alc.b("hud/heart/absorbing_full_blinking"),
         alc.b("hud/heart/absorbing_half"),
         alc.b("hud/heart/absorbing_half_blinking"),
         alc.b("hud/heart/absorbing_hardcore_full"),
         alc.b("hud/heart/absorbing_hardcore_full_blinking"),
         alc.b("hud/heart/absorbing_hardcore_half"),
         alc.b("hud/heart/absorbing_hardcore_half_blinking")
      ),
      f(
         alc.b("hud/heart/frozen_full"),
         alc.b("hud/heart/frozen_full_blinking"),
         alc.b("hud/heart/frozen_half"),
         alc.b("hud/heart/frozen_half_blinking"),
         alc.b("hud/heart/frozen_hardcore_full"),
         alc.b("hud/heart/frozen_hardcore_full_blinking"),
         alc.b("hud/heart/frozen_hardcore_half"),
         alc.b("hud/heart/frozen_hardcore_half_blinking")
      );

      private final alc g;
      private final alc h;
      private final alc i;
      private final alc j;
      private final alc k;
      private final alc l;
      private final alc m;
      private final alc n;

      private b(final alc $$0, final alc $$1, final alc $$2, final alc $$3, final alc $$4, final alc $$5, final alc $$6, final alc $$7) {
         this.g = $$0;
         this.h = $$1;
         this.i = $$2;
         this.j = $$3;
         this.k = $$4;
         this.l = $$5;
         this.m = $$6;
         this.n = $$7;
      }

      public alc a(boolean $$0, boolean $$1, boolean $$2) {
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

      static fjw.b a(cnu $$0) {
         fjw.b $$1;
         if ($$0.b(bsx.s)) {
            $$1 = c;
         } else if ($$0.b(bsx.t)) {
            $$1 = d;
         } else if ($$0.ct()) {
            $$1 = f;
         } else {
            $$1 = b;
         }

         return $$1;
      }
   }
}
