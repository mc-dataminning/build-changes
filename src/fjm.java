import com.google.common.collect.Lists;
import com.google.common.collect.Ordering;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;
import org.joml.Matrix4fStack;

public class fjm {
   private static final alb c = alb.b("hud/crosshair");
   private static final alb d = alb.b("hud/crosshair_attack_indicator_full");
   private static final alb e = alb.b("hud/crosshair_attack_indicator_background");
   private static final alb f = alb.b("hud/crosshair_attack_indicator_progress");
   private static final alb g = alb.b("hud/effect_background_ambient");
   private static final alb h = alb.b("hud/effect_background");
   private static final alb i = alb.b("hud/hotbar");
   private static final alb j = alb.b("hud/hotbar_selection");
   private static final alb k = alb.b("hud/hotbar_offhand_left");
   private static final alb l = alb.b("hud/hotbar_offhand_right");
   private static final alb m = alb.b("hud/hotbar_attack_indicator_background");
   private static final alb n = alb.b("hud/hotbar_attack_indicator_progress");
   private static final alb o = alb.b("hud/jump_bar_background");
   private static final alb p = alb.b("hud/jump_bar_cooldown");
   private static final alb q = alb.b("hud/jump_bar_progress");
   private static final alb r = alb.b("hud/experience_bar_background");
   private static final alb s = alb.b("hud/experience_bar_progress");
   private static final alb t = alb.b("hud/armor_empty");
   private static final alb u = alb.b("hud/armor_half");
   private static final alb v = alb.b("hud/armor_full");
   private static final alb w = alb.b("hud/food_empty_hunger");
   private static final alb x = alb.b("hud/food_half_hunger");
   private static final alb y = alb.b("hud/food_full_hunger");
   private static final alb z = alb.b("hud/food_empty");
   private static final alb A = alb.b("hud/food_half");
   private static final alb B = alb.b("hud/food_full");
   private static final alb C = alb.b("hud/air");
   private static final alb D = alb.b("hud/air_bursting");
   private static final alb E = alb.b("hud/heart/vehicle_container");
   private static final alb F = alb.b("hud/heart/vehicle_full");
   private static final alb G = alb.b("hud/heart/vehicle_half");
   private static final alb H = alb.b("textures/misc/vignette.png");
   public static final alb a = alb.b("textures/misc/nausea.png");
   private static final alb I = alb.b("textures/misc/pumpkinblur.png");
   private static final alb J = alb.b("textures/misc/spyglass_scope.png");
   private static final alb K = alb.b("textures/misc/powder_snow_outline.png");
   private static final Comparator<ezb> L = Comparator.comparing(ezb::d).reversed().thenComparing(ezb::c, String.CASE_INSENSITIVE_ORDER);
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
   private final azk Y = azk.a();
   private final fib Z;
   private final fkb aa;
   private int ab;
   @Nullable
   private xd ac;
   private int ad;
   private boolean ae;
   private boolean af;
   public float b = 1.0F;
   private int ag;
   private cvl ah = cvl.k;
   private final fki ai;
   private final fli aj;
   private final fma ak;
   private final flb al;
   private final fjz am;
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
   private final fjq az = new fjq();
   private float aA;

   public fjm(fib $$0) {
      this.Z = $$0;
      this.ai = new fki($$0);
      this.ak = new fma($$0);
      this.aa = new fkb($$0);
      this.al = new flb($$0, this);
      this.am = new fjz($$0);
      this.aj = new fli($$0);
      this.a();
      fjq $$1 = new fjq().a(this::c).a(this::j).a(this::l).a(this::n).a(this::k).a(($$0x, $$1x) -> this.am.a($$0x));
      fjq $$2 = new fjq().a(this::o).a(($$0x, $$1x) -> {
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

   public void a(fjn $$0, fhr $$1) {
      this.az.a($$0, $$1);
   }

   private void c(fjn $$0, fhr $$1) {
      if (fib.N()) {
         this.a($$0, this.Z.an());
      }

      float $$2 = $$1.a();
      this.aA = azc.h(0.5F * $$2, this.aA, 1.125F);
      if (this.Z.n.aD().a()) {
         if (this.Z.t.gA()) {
            this.a($$0, this.aA);
         } else {
            this.aA = 0.5F;
            cvl $$3 = this.Z.t.gc().g(3);
            if ($$3.a(dgx.ee.r())) {
               this.a($$0, I, 1.0F);
            }
         }
      }

      if (this.Z.t.cr() > 0) {
         this.a($$0, K, this.Z.t.cs());
      }

      float $$4 = azc.h($$1.a(false), this.Z.t.cH, this.Z.t.cG);
      if ($$4 > 0.0F) {
         if (!this.Z.t.b(bss.i)) {
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

   private void d(fjn $$0, fhr $$1) {
      if (this.Z.t.gg() > 0) {
         this.Z.aJ().a("sleep");
         float $$2 = (float)this.Z.t.gg();
         float $$3 = $$2 / 100.0F;
         if ($$3 > 1.0F) {
            $$3 = 1.0F - ($$2 - 100.0F) / 10.0F;
         }

         int $$4 = (int)(220.0F * $$3) << 24 | 1052704;
         $$0.a(ghe.H(), 0, 0, $$0.a(), $$0.b(), $$4);
         this.Z.aJ().c();
      }
   }

   private void e(fjn $$0, fhr $$1) {
      fjl $$2 = this.f();
      if (this.ac != null && this.ad > 0) {
         this.Z.aJ().a("overlayMessage");
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
               $$5 = azc.a($$3 / 50.0F, 0.7F, 0.6F, $$4);
            } else {
               $$5 = axn.c($$4, -1);
            }

            int $$7 = $$2.a(this.ac);
            $$0.a($$2, this.ac, -$$7 / 2, -4, $$7, $$5);
            $$0.c().b();
         }

         this.Z.aJ().c();
      }
   }

   private void f(fjn $$0, fhr $$1) {
      if (this.ao != null && this.an > 0) {
         fjl $$2 = this.f();
         this.Z.aJ().a("titleAndSubtitle");
         float $$3 = (float)this.an - $$1.a(false);
         int $$4 = 255;
         if (this.an > this.as + this.ar) {
            float $$5 = (float)(this.aq + this.ar + this.as) - $$3;
            $$4 = (int)($$5 * 255.0F / (float)this.aq);
         }

         if (this.an <= this.as) {
            $$4 = (int)($$3 * 255.0F / (float)this.as);
         }

         $$4 = azc.a($$4, 0, 255);
         if ($$4 > 8) {
            $$0.c().a();
            $$0.c().a((float)($$0.a() / 2), (float)($$0.b() / 2), 0.0F);
            $$0.c().a();
            $$0.c().b(4.0F, 4.0F, 4.0F);
            int $$6 = $$2.a(this.ao);
            int $$7 = axn.c($$4, -1);
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

         this.Z.aJ().c();
      }
   }

   private void g(fjn $$0, fhr $$1) {
      if (!this.aa.e()) {
         fbs $$2 = this.Z.aO();
         int $$3 = azc.a(this.Z.o.e() * (double)$$2.p() / (double)$$2.n());
         int $$4 = azc.a(this.Z.o.f() * (double)$$2.q() / (double)$$2.o());
         this.aa.a($$0, this.ab, $$3, $$4, false);
      }
   }

   private void h(fjn $$0, fhr $$1) {
      ezi $$2 = this.Z.s.O();
      eza $$3 = null;
      ezd $$4 = $$2.e(this.Z.t.cF());
      if ($$4 != null) {
         eyz $$5 = eyz.a($$4.n());
         if ($$5 != null) {
            $$3 = $$2.a($$5);
         }
      }

      eza $$6 = $$3 != null ? $$3 : $$2.a(eyz.b);
      if ($$6 != null) {
         this.a($$0, $$6);
      }
   }

   private void i(fjn $$0, fhr $$1) {
      ezi $$2 = this.Z.s.O();
      eza $$3 = $$2.a(eyz.a);
      if (!this.Z.n.J.e() || this.Z.T() && this.Z.t.cx.l().size() <= 1 && $$3 == null) {
         this.al.a(false);
      } else {
         this.al.a(true);
         this.al.a($$0, $$0.a(), $$2, $$3);
      }
   }

   private void j(fjn $$0, fhr $$1) {
      fif $$2 = this.Z.n;
      if ($$2.aD().a()) {
         if (this.Z.r.j() != ddp.d || this.a(this.Z.w)) {
            if (this.ai.d() && !this.Z.t.gs() && !$$2.X().c()) {
               fhk $$3 = this.Z.j.l();
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
               $$0.a(ghe::E, c, ($$0.a() - 15) / 2, ($$0.b() - 15) / 2, 15, 15);
               if (this.Z.n.E().c() == fhj.b) {
                  float $$6 = this.Z.t.H(0.0F);
                  boolean $$7 = false;
                  if (this.Z.v != null && this.Z.v instanceof buf && $$6 >= 1.0F) {
                     $$7 = this.Z.t.gv() > 5.0F;
                     $$7 &= this.Z.v.bI();
                  }

                  int $$8 = $$0.b() / 2 - 7 + 16;
                  int $$9 = $$0.a() / 2 - 8;
                  if ($$7) {
                     $$0.a(ghe::E, d, $$9, $$8, 16, 16);
                  } else if ($$6 < 1.0F) {
                     int $$10 = (int)($$6 * 17.0F);
                     $$0.a(ghe::E, e, $$9, $$8, 16, 4);
                     $$0.a(ghe::E, f, 16, 4, 0, 0, $$9, $$8, $$10, 4);
                  }
               }
            }
         }
      }
   }

   private boolean a(@Nullable eyc $$0) {
      if ($$0 == null) {
         return false;
      } else if ($$0.c() == eyc.a.c) {
         return ((eyb)$$0).a() instanceof brm;
      } else if ($$0.c() == eyc.a.b) {
         je $$1 = ((eya)$$0).a();
         dds $$2 = this.Z.s;
         return $$2.a_($$1).b($$2, $$1) != null;
      } else {
         return false;
      }
   }

   private void k(fjn $$0, fhr $$1) {
      Collection<bsq> $$2 = this.Z.t.ex();
      if (!$$2.isEmpty()) {
         if (this.Z.z instanceof fra $$3 && $$3.J()) {
            return;
         }

         int $$4 = 0;
         int $$5 = 0;
         gxj $$6 = this.Z.aF();
         List<Runnable> $$7 = Lists.newArrayListWithExpectedSize($$2.size());

         for (bsq $$8 : Ordering.natural().reverse().sortedCopy($$2)) {
            jn<bso> $$9 = $$8.c();
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
                  $$0.a(ghe::C, g, $$10, $$11, 24, 24);
               } else {
                  $$0.a(ghe::C, h, $$10, $$11, 24, 24);
                  if ($$8.a(200)) {
                     int $$13 = $$8.d();
                     int $$14 = 10 - $$13 / 20;
                     $$12 = azc.a((float)$$13 / 10.0F / 5.0F * 0.5F, 0.0F, 0.5F)
                        + azc.b((float)$$13 * (float) Math.PI / 5.0F) * azc.a((float)$$14 / 10.0F * 0.25F, 0.0F, 0.25F);
                     $$12 = azc.a($$12, 0.0F, 1.0F);
                  }
               }

               gwk $$15 = $$6.a($$9);
               int $$16 = $$10;
               int $$17 = $$11;
               float $$18 = $$12;
               $$7.add(() -> {
                  int $$5x = axn.a($$18);
                  $$0.a(ghe::C, $$15, $$16 + 3, $$17 + 3, 18, 18, $$5x);
               });
            }
         }

         $$7.forEach(Runnable::run);
      }
   }

   private void l(fjn $$0, fhr $$1) {
      if (this.Z.r.j() == ddp.d) {
         this.ak.a($$0);
      } else {
         this.m($$0, $$1);
      }

      int $$2 = $$0.a() / 2 - 91;
      bup $$3 = this.Z.t.p();
      if ($$3 != null) {
         this.a($$3, $$0, $$2);
      } else if (this.m()) {
         this.a($$0, $$2);
      }

      if (this.Z.r.a()) {
         this.b($$0);
      }

      this.c($$0);
      if (this.Z.r.j() != ddp.d) {
         this.a($$0);
      } else if (this.Z.t.P_()) {
         this.ak.b($$0);
      }
   }

   private void m(fjn $$0, fhr $$1) {
      cnp $$2 = this.n();
      if ($$2 != null) {
         cvl $$3 = $$2.eX();
         btz $$4 = $$2.fu().e();
         int $$5 = $$0.a() / 2;
         int $$6 = 182;
         int $$7 = 91;
         $$0.c().a();
         $$0.c().a(0.0F, 0.0F, -90.0F);
         $$0.a(ghe::C, i, $$5 - 91, $$0.b() - 22, 182, 22);
         $$0.a(ghe::C, j, $$5 - 91 - 1 + $$2.gc().j * 20, $$0.b() - 22 - 1, 24, 23);
         if (!$$3.f()) {
            if ($$4 == btz.a) {
               $$0.a(ghe::C, k, $$5 - 91 - 29, $$0.b() - 23, 29, 24);
            } else {
               $$0.a(ghe::C, l, $$5 + 91, $$0.b() - 23, 29, 24);
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
            if ($$4 == btz.a) {
               this.a($$0, $$5 - 91 - 26, $$12, $$1, $$2, $$3, $$8++);
            } else {
               this.a($$0, $$5 + 91 + 10, $$12, $$1, $$2, $$3, $$8++);
            }
         }

         if (this.Z.n.E().c() == fhj.c) {
            float $$13 = this.Z.t.H(0.0F);
            if ($$13 < 1.0F) {
               int $$14 = $$0.b() - 20;
               int $$15 = $$5 + 91 + 6;
               if ($$4 == btz.b) {
                  $$15 = $$5 - 91 - 22;
               }

               int $$16 = (int)($$13 * 19.0F);
               $$0.a(ghe::C, m, $$15, $$14, 18, 18);
               $$0.a(ghe::C, n, 18, 18, 0, 18 - $$16, $$15, $$14 + 18 - $$16, 18, $$16);
            }
         }
      }
   }

   private void a(bup $$0, fjn $$1, int $$2) {
      this.Z.aJ().a("jumpBar");
      float $$3 = this.Z.t.q();
      int $$4 = 182;
      int $$5 = (int)($$3 * 183.0F);
      int $$6 = $$1.b() - 32 + 3;
      $$1.a(ghe::C, o, $$2, $$6, 182, 5);
      if ($$0.c() > 0) {
         $$1.a(ghe::C, p, $$2, $$6, 182, 5);
      } else if ($$5 > 0) {
         $$1.a(ghe::C, q, 182, 5, 0, 0, $$2, $$6, $$5, 5);
      }

      this.Z.aJ().c();
   }

   private void a(fjn $$0, int $$1) {
      this.Z.aJ().a("expBar");
      int $$2 = this.Z.t.gl();
      if ($$2 > 0) {
         int $$3 = 182;
         int $$4 = (int)(this.Z.t.cp * 183.0F);
         int $$5 = $$0.b() - 32 + 3;
         $$0.a(ghe::C, r, $$1, $$5, 182, 5);
         if ($$4 > 0) {
            $$0.a(ghe::C, s, 182, 5, 0, 0, $$1, $$5, $$4, 5);
         }
      }

      this.Z.aJ().c();
   }

   private void n(fjn $$0, fhr $$1) {
      int $$2 = this.Z.t.cn;
      if (this.m() && $$2 > 0) {
         this.Z.aJ().a("expLevel");
         String $$3 = $$2 + "";
         int $$4 = ($$0.a() - this.f().b($$3)) / 2;
         int $$5 = $$0.b() - 31 - 4;
         $$0.a(this.f(), $$3, $$4 + 1, $$5, 0, false);
         $$0.a(this.f(), $$3, $$4 - 1, $$5, 0, false);
         $$0.a(this.f(), $$3, $$4, $$5 + 1, 0, false);
         $$0.a(this.f(), $$3, $$4, $$5 - 1, 0, false);
         $$0.a(this.f(), $$3, $$4, $$5, 8453920, false);
         this.Z.aJ().c();
      }
   }

   private boolean m() {
      return this.Z.t.p() == null && this.Z.r.d();
   }

   private void a(fjn $$0) {
      this.Z.aJ().a("selectedItemName");
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
            $$0.a(this.f(), (xd)$$1, $$3, $$4, $$2, axn.c($$5, -1));
         }
      }

      this.Z.aJ().c();
   }

   private void o(fjn $$0, fhr $$1) {
      if (this.Z.K()) {
         this.Z.aJ().a("demo");
         xd $$2;
         if (this.Z.s.aa() >= 120500L) {
            $$2 = M;
         } else {
            $$2 = xd.a("demo.remainingTime", azz.a((int)(120500L - this.Z.s.aa()), this.Z.s.s().f()));
         }

         int $$4 = this.f().a($$2);
         int $$5 = $$0.a() - $$4 - 10;
         int $$6 = 5;
         $$0.a(this.f(), $$2, $$5, 5, $$4, -1);
         this.Z.aJ().c();
      }
   }

   private void a(fjn $$0, eza $$1) {
      ezi $$2 = $$1.a();
      yt $$3 = $$1.a(yw.c);

      record a(xd a, xd b, int c) {
      }

      a[] $$4 = $$2.i($$1).stream().filter($$0x -> !$$0x.a()).sorted(L).limit(15L).map($$2x -> {
         ezd $$3x = $$2.e($$2x.c());
         xd $$4x = $$2x.b();
         xd $$5x = ezd.a($$3x, $$4x);
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
   private cnp n() {
      return this.Z.an() instanceof cnp $$0 ? $$0 : null;
   }

   @Nullable
   private buf o() {
      cnp $$0 = this.n();
      if ($$0 != null) {
         btj $$1 = $$0.dg();
         if ($$1 == null) {
            return null;
         }

         if ($$1 instanceof buf) {
            return (buf)$$1;
         }
      }

      return null;
   }

   private int a(@Nullable buf $$0) {
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

   private void b(fjn $$0) {
      cnp $$1 = this.n();
      if ($$1 != null) {
         int $$2 = azc.f($$1.eA());
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
         float $$9 = Math.max((float)$$1.h(bvm.s), (float)Math.max($$5, $$2));
         int $$10 = azc.f($$1.fs());
         int $$11 = azc.f(($$9 + (float)$$10) / 2.0F / 10.0F);
         int $$12 = Math.max(10 - ($$11 - 2), 3);
         int $$13 = $$8 - 10;
         int $$14 = -1;
         if ($$1.b(bss.j)) {
            $$14 = this.ab % azc.f($$9 + 5.0F);
         }

         this.Z.aJ().a("armor");
         a($$0, $$1, $$8, $$11, $$12, $$6);
         this.Z.aJ().b("health");
         this.a($$0, $$1, $$6, $$8, $$12, $$14, $$9, $$2, $$5, $$10, $$3);
         buf $$15 = this.o();
         int $$16 = this.a($$15);
         if ($$16 == 0) {
            this.Z.aJ().b("food");
            this.a($$0, $$1, $$8, $$7);
            $$13 -= 10;
         }

         this.Z.aJ().b("air");
         int $$17 = $$1.cp();
         int $$18 = Math.min($$1.cq(), $$17);
         if ($$1.a(awy.a) || $$18 < $$17) {
            int $$19 = this.a($$16) - 1;
            $$13 -= $$19 * 10;
            int $$20 = azc.c((double)($$18 - 2) * 10.0 / (double)$$17);
            int $$21 = azc.c((double)$$18 * 10.0 / (double)$$17) - $$20;

            for (int $$22 = 0; $$22 < $$20 + $$21; $$22++) {
               if ($$22 < $$20) {
                  $$0.a(ghe::C, C, $$7 - $$22 * 8 - 9, $$13, 9, 9);
               } else {
                  $$0.a(ghe::C, D, $$7 - $$22 * 8 - 9, $$13, 9, 9);
               }
            }
         }

         this.Z.aJ().c();
      }
   }

   private static void a(fjn $$0, cnp $$1, int $$2, int $$3, int $$4, int $$5) {
      int $$6 = $$1.eN();
      if ($$6 > 0) {
         int $$7 = $$2 - ($$3 - 1) * $$4 - 10;

         for (int $$8 = 0; $$8 < 10; $$8++) {
            int $$9 = $$5 + $$8 * 8;
            if ($$8 * 2 + 1 < $$6) {
               $$0.a(ghe::C, v, $$9, $$7, 9, 9);
            }

            if ($$8 * 2 + 1 == $$6) {
               $$0.a(ghe::C, u, $$9, $$7, 9, 9);
            }

            if ($$8 * 2 + 1 > $$6) {
               $$0.a(ghe::C, t, $$9, $$7, 9, 9);
            }
         }
      }
   }

   private void a(fjn $$0, cnp $$1, int $$2, int $$3, int $$4, int $$5, float $$6, int $$7, int $$8, int $$9, boolean $$10) {
      fjm.b $$11 = fjm.b.a($$1);
      boolean $$12 = $$1.dS().y_().l();
      int $$13 = azc.c((double)$$6 / 2.0);
      int $$14 = azc.c((double)$$9 / 2.0);
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

         this.a($$0, fjm.b.a, $$19, $$20, $$12, $$10, false);
         int $$21 = $$16 * 2;
         boolean $$22 = $$16 >= $$13;
         if ($$22) {
            int $$23 = $$21 - $$15;
            if ($$23 < $$9) {
               boolean $$24 = $$23 + 1 == $$9;
               this.a($$0, $$11 == fjm.b.d ? $$11 : fjm.b.e, $$19, $$20, $$12, false, $$24);
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

   private void a(fjn $$0, fjm.b $$1, int $$2, int $$3, boolean $$4, boolean $$5, boolean $$6) {
      $$0.a(ghe::C, $$1.a($$4, $$6, $$5), $$2, $$3, 9, 9);
   }

   private void a(fjn $$0, cnp $$1, int $$2, int $$3) {
      cqm $$4 = $$1.gm();
      int $$5 = $$4.a();

      for (int $$6 = 0; $$6 < 10; $$6++) {
         int $$7 = $$2;
         alb $$8;
         alb $$9;
         alb $$10;
         if ($$1.b(bss.q)) {
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
         $$0.a(ghe::C, $$8, $$14, $$7, 9, 9);
         if ($$6 * 2 + 1 < $$5) {
            $$0.a(ghe::C, $$10, $$14, $$7, 9, 9);
         }

         if ($$6 * 2 + 1 == $$5) {
            $$0.a(ghe::C, $$9, $$14, $$7, 9, 9);
         }
      }
   }

   private void c(fjn $$0) {
      buf $$1 = this.o();
      if ($$1 != null) {
         int $$2 = this.a($$1);
         if ($$2 != 0) {
            int $$3 = (int)Math.ceil((double)$$1.eA());
            this.Z.aJ().b("mountHealth");
            int $$4 = $$0.b() - 39;
            int $$5 = $$0.a() / 2 + 91;
            int $$6 = $$4;

            for (int $$7 = 0; $$2 > 0; $$7 += 20) {
               int $$8 = Math.min($$2, 10);
               $$2 -= $$8;

               for (int $$9 = 0; $$9 < $$8; $$9++) {
                  int $$10 = $$5 - $$9 * 8 - 9;
                  $$0.a(ghe::C, E, $$10, $$6, 9, 9);
                  if ($$9 * 2 + 1 + $$7 < $$3) {
                     $$0.a(ghe::C, F, $$10, $$6, 9, 9);
                  }

                  if ($$9 * 2 + 1 + $$7 == $$3) {
                     $$0.a(ghe::C, G, $$10, $$6, 9, 9);
                  }
               }

               $$6 -= 10;
            }
         }
      }
   }

   private void a(fjn $$0, alb $$1, float $$2) {
      int $$3 = axn.a($$2);
      $$0.a(ghe::A, $$1, 0, 0, 0.0F, 0.0F, $$0.a(), $$0.b(), $$0.a(), $$0.b(), $$3);
   }

   private void a(fjn $$0, float $$1) {
      float $$2 = (float)Math.min($$0.a(), $$0.b());
      float $$4 = Math.min((float)$$0.a() / $$2, (float)$$0.b() / $$2) * $$1;
      int $$5 = azc.d($$2 * $$4);
      int $$6 = azc.d($$2 * $$4);
      int $$7 = ($$0.a() - $$5) / 2;
      int $$8 = ($$0.b() - $$6) / 2;
      int $$9 = $$7 + $$5;
      int $$10 = $$8 + $$6;
      $$0.a(ghe::C, J, $$7, $$8, 0.0F, 0.0F, $$5, $$6, $$5, $$6);
      $$0.a(ghe.H(), 0, $$10, $$0.a(), $$0.b(), -90, -16777216);
      $$0.a(ghe.H(), 0, 0, $$0.a(), $$8, -90, -16777216);
      $$0.a(ghe.H(), 0, $$8, $$7, $$10, -90, -16777216);
      $$0.a(ghe.H(), $$9, $$8, $$0.a(), $$10, -90, -16777216);
   }

   private void a(btj $$0) {
      je $$1 = je.a($$0.dx(), $$0.dB(), $$0.dD());
      float $$2 = ggt.a($$0.dS().B_(), $$0.dS().A($$1));
      float $$3 = azc.a(1.0F - $$2, 0.0F, 1.0F);
      this.b = this.b + ($$3 - this.b) * 0.01F;
   }

   private void a(fjn $$0, @Nullable btj $$1) {
      dvr $$2 = this.Z.s.A_();
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
         $$3 = azc.a($$3, 0.0F, 1.0F);
         $$7 = axn.a(1.0F, 0.0F, $$3, $$3);
      } else {
         float $$8 = this.b;
         $$8 = azc.a($$8, 0.0F, 1.0F);
         $$7 = axn.a(1.0F, $$8, $$8, $$8);
      }

      $$0.a(ghe::D, H, 0, 0, 0.0F, 0.0F, $$0.a(), $$0.b(), $$0.a(), $$0.b(), $$7);
   }

   private void b(fjn $$0, float $$1) {
      if ($$1 < 1.0F) {
         $$1 *= $$1;
         $$1 *= $$1;
         $$1 = $$1 * 0.8F + 0.2F;
      }

      int $$2 = axn.a($$1);
      gwk $$3 = this.Z.ao().a().a(dgx.ed.o());
      $$0.a(ghe::A, $$3, 0, 0, $$0.a(), $$0.b(), $$2);
   }

   private void c(fjn $$0, float $$1) {
      int $$2 = $$0.a();
      int $$3 = $$0.b();
      $$0.c().a();
      float $$4 = azc.h($$1, 2.0F, 1.0F);
      $$0.c().a((float)$$2 / 2.0F, (float)$$3 / 2.0F, 0.0F);
      $$0.c().b($$4, $$4, $$4);
      $$0.c().a((float)(-$$2) / 2.0F, (float)(-$$3) / 2.0F, 0.0F);
      float $$5 = 0.2F * $$1;
      float $$6 = 0.4F * $$1;
      float $$7 = 0.2F * $$1;
      $$0.a($$0x -> ghe.I(), a, 0, 0, 0.0F, 0.0F, $$2, $$3, $$2, $$3, axn.a(1.0F, $$5, $$6, $$7));
      $$0.c().b();
   }

   private void a(fjn $$0, int $$1, int $$2, fhr $$3, cnp $$4, cvl $$5, int $$6) {
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
      btj $$0 = this.Z.an();
      if ($$0 != null) {
         this.a($$0);
      }

      if (this.Z.t != null) {
         cvl $$1 = this.Z.t.gc().f();
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
      this.ax = azc.h(0.2F, this.ax, $$1 ? 1.0F : 0.0F);
   }

   public void a(xd $$0) {
      xd $$1 = xd.a("record.nowPlaying", $$0);
      this.a($$1, true);
      this.Z.aY().c($$1);
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

   public fkb d() {
      return this.aa;
   }

   public int e() {
      return this.ab;
   }

   public fjl f() {
      return this.Z.h;
   }

   public fma g() {
      return this.ak;
   }

   public flb h() {
      return this.al;
   }

   public void i() {
      this.al.a();
      this.am.a();
      this.Z.az().b();
      this.ai.p();
      this.aa.a(true);
   }

   public fjz j() {
      return this.am;
   }

   public fki k() {
      return this.ai;
   }

   public void l() {
      this.ai.a();
   }

   public void b(fjn $$0, fhr $$1) {
      if (this.Z.n.ah().c() && (this.ax > 0.0F || this.ay > 0.0F)) {
         int $$2 = azc.d(255.0F * azc.a(azc.h($$1.b(), this.ay, this.ax), 0.0F, 1.0F));
         if ($$2 > 8) {
            fjl $$3 = this.f();
            int $$4 = $$3.a(N);
            int $$5 = axn.c($$2, -1);
            int $$6 = $$0.a() - $$4 - 5;
            int $$7 = $$0.b() - 9 - 5;
            $$0.a($$3, N, $$6, $$7, $$4, $$5);
         }
      }
   }

   static enum b {
      a(
         alb.b("hud/heart/container"),
         alb.b("hud/heart/container_blinking"),
         alb.b("hud/heart/container"),
         alb.b("hud/heart/container_blinking"),
         alb.b("hud/heart/container_hardcore"),
         alb.b("hud/heart/container_hardcore_blinking"),
         alb.b("hud/heart/container_hardcore"),
         alb.b("hud/heart/container_hardcore_blinking")
      ),
      b(
         alb.b("hud/heart/full"),
         alb.b("hud/heart/full_blinking"),
         alb.b("hud/heart/half"),
         alb.b("hud/heart/half_blinking"),
         alb.b("hud/heart/hardcore_full"),
         alb.b("hud/heart/hardcore_full_blinking"),
         alb.b("hud/heart/hardcore_half"),
         alb.b("hud/heart/hardcore_half_blinking")
      ),
      c(
         alb.b("hud/heart/poisoned_full"),
         alb.b("hud/heart/poisoned_full_blinking"),
         alb.b("hud/heart/poisoned_half"),
         alb.b("hud/heart/poisoned_half_blinking"),
         alb.b("hud/heart/poisoned_hardcore_full"),
         alb.b("hud/heart/poisoned_hardcore_full_blinking"),
         alb.b("hud/heart/poisoned_hardcore_half"),
         alb.b("hud/heart/poisoned_hardcore_half_blinking")
      ),
      d(
         alb.b("hud/heart/withered_full"),
         alb.b("hud/heart/withered_full_blinking"),
         alb.b("hud/heart/withered_half"),
         alb.b("hud/heart/withered_half_blinking"),
         alb.b("hud/heart/withered_hardcore_full"),
         alb.b("hud/heart/withered_hardcore_full_blinking"),
         alb.b("hud/heart/withered_hardcore_half"),
         alb.b("hud/heart/withered_hardcore_half_blinking")
      ),
      e(
         alb.b("hud/heart/absorbing_full"),
         alb.b("hud/heart/absorbing_full_blinking"),
         alb.b("hud/heart/absorbing_half"),
         alb.b("hud/heart/absorbing_half_blinking"),
         alb.b("hud/heart/absorbing_hardcore_full"),
         alb.b("hud/heart/absorbing_hardcore_full_blinking"),
         alb.b("hud/heart/absorbing_hardcore_half"),
         alb.b("hud/heart/absorbing_hardcore_half_blinking")
      ),
      f(
         alb.b("hud/heart/frozen_full"),
         alb.b("hud/heart/frozen_full_blinking"),
         alb.b("hud/heart/frozen_half"),
         alb.b("hud/heart/frozen_half_blinking"),
         alb.b("hud/heart/frozen_hardcore_full"),
         alb.b("hud/heart/frozen_hardcore_full_blinking"),
         alb.b("hud/heart/frozen_hardcore_half"),
         alb.b("hud/heart/frozen_hardcore_half_blinking")
      );

      private final alb g;
      private final alb h;
      private final alb i;
      private final alb j;
      private final alb k;
      private final alb l;
      private final alb m;
      private final alb n;

      private b(final alb $$0, final alb $$1, final alb $$2, final alb $$3, final alb $$4, final alb $$5, final alb $$6, final alb $$7) {
         this.g = $$0;
         this.h = $$1;
         this.i = $$2;
         this.j = $$3;
         this.k = $$4;
         this.l = $$5;
         this.m = $$6;
         this.n = $$7;
      }

      public alb a(boolean $$0, boolean $$1, boolean $$2) {
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

      static fjm.b a(cnp $$0) {
         fjm.b $$1;
         if ($$0.b(bss.s)) {
            $$1 = c;
         } else if ($$0.b(bss.t)) {
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
