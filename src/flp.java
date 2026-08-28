import com.google.common.collect.Lists;
import com.google.common.collect.Ordering;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;
import org.joml.Matrix4fStack;

public class flp {
   private static final alj c = alj.b("hud/crosshair");
   private static final alj d = alj.b("hud/crosshair_attack_indicator_full");
   private static final alj e = alj.b("hud/crosshair_attack_indicator_background");
   private static final alj f = alj.b("hud/crosshair_attack_indicator_progress");
   private static final alj g = alj.b("hud/effect_background_ambient");
   private static final alj h = alj.b("hud/effect_background");
   private static final alj i = alj.b("hud/hotbar");
   private static final alj j = alj.b("hud/hotbar_selection");
   private static final alj k = alj.b("hud/hotbar_offhand_left");
   private static final alj l = alj.b("hud/hotbar_offhand_right");
   private static final alj m = alj.b("hud/hotbar_attack_indicator_background");
   private static final alj n = alj.b("hud/hotbar_attack_indicator_progress");
   private static final alj o = alj.b("hud/jump_bar_background");
   private static final alj p = alj.b("hud/jump_bar_cooldown");
   private static final alj q = alj.b("hud/jump_bar_progress");
   private static final alj r = alj.b("hud/experience_bar_background");
   private static final alj s = alj.b("hud/experience_bar_progress");
   private static final alj t = alj.b("hud/armor_empty");
   private static final alj u = alj.b("hud/armor_half");
   private static final alj v = alj.b("hud/armor_full");
   private static final alj w = alj.b("hud/food_empty_hunger");
   private static final alj x = alj.b("hud/food_half_hunger");
   private static final alj y = alj.b("hud/food_full_hunger");
   private static final alj z = alj.b("hud/food_empty");
   private static final alj A = alj.b("hud/food_half");
   private static final alj B = alj.b("hud/food_full");
   private static final alj C = alj.b("hud/air");
   private static final alj D = alj.b("hud/air_bursting");
   private static final alj E = alj.b("hud/heart/vehicle_container");
   private static final alj F = alj.b("hud/heart/vehicle_full");
   private static final alj G = alj.b("hud/heart/vehicle_half");
   private static final alj H = alj.b("textures/misc/vignette.png");
   public static final alj a = alj.b("textures/misc/nausea.png");
   private static final alj I = alj.b("textures/misc/pumpkinblur.png");
   private static final alj J = alj.b("textures/misc/spyglass_scope.png");
   private static final alj K = alj.b("textures/misc/powder_snow_outline.png");
   private static final Comparator<faw> L = Comparator.comparing(faw::d).reversed().thenComparing(faw::c, String.CASE_INSENSITIVE_ORDER);
   private static final xj M = xj.c("demo.demoExpired");
   private static final xj N = xj.c("menu.savingLevel");
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
   private final azu Y = azu.a();
   private final fke Z;
   private final fme aa;
   private int ab;
   @Nullable
   private xj ac;
   private int ad;
   private boolean ae;
   private boolean af;
   public float b = 1.0F;
   private int ag;
   private cwm ah = cwm.k;
   private final fml ai;
   private final fnl aj;
   private final fod ak;
   private final fne al;
   private final fmc am;
   private int an;
   @Nullable
   private xj ao;
   @Nullable
   private xj ap;
   private int aq;
   private int ar;
   private int as;
   private int at;
   private int au;
   private long av;
   private long aw;
   private float ax;
   private float ay;
   private final flt az = new flt();
   private float aA;

   public flp(fke $$0) {
      this.Z = $$0;
      this.ai = new fml($$0);
      this.ak = new fod($$0);
      this.aa = new fme($$0);
      this.al = new fne($$0, this);
      this.am = new fmc($$0);
      this.aj = new fnl($$0);
      this.a();
      flt $$1 = new flt().a(this::c).a(this::j).a(this::l).a(this::n).a(this::k).a(($$0x, $$1x) -> this.am.a($$0x));
      flt $$2 = new flt().a(this::o).a(($$0x, $$1x) -> {
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

   public void a(flq $$0, fju $$1) {
      this.az.a($$0, $$1);
   }

   private void c(flq $$0, fju $$1) {
      if (fke.N()) {
         this.a($$0, this.Z.ao());
      }

      float $$2 = $$1.a();
      this.aA = azm.h(0.5F * $$2, this.aA, 1.125F);
      if (this.Z.n.aD().a()) {
         if (this.Z.t.gF()) {
            this.a($$0, this.aA);
         } else {
            this.aA = 0.5F;
            cwm $$3 = this.Z.t.gg().g(3);
            if ($$3.a(dis.ee.j())) {
               this.a($$0, I, 1.0F);
            }
         }
      }

      if (this.Z.t.cu() > 0) {
         this.a($$0, K, this.Z.t.cv());
      }

      float $$4 = azm.h($$1.a(false), this.Z.t.cG, this.Z.t.cF);
      if ($$4 > 0.0F) {
         if (!this.Z.t.b(bts.i)) {
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

   private void d(flq $$0, fju $$1) {
      if (this.Z.t.gl() > 0) {
         bot.a().a("sleep");
         float $$2 = (float)this.Z.t.gl();
         float $$3 = $$2 / 100.0F;
         if ($$3 > 1.0F) {
            $$3 = 1.0F - ($$2 - 100.0F) / 10.0F;
         }

         int $$4 = (int)(220.0F * $$3) << 24 | 1052704;
         $$0.a(gjq.G(), 0, 0, $$0.a(), $$0.b(), $$4);
         bot.a().c();
      }
   }

   private void e(flq $$0, fju $$1) {
      flo $$2 = this.f();
      if (this.ac != null && this.ad > 0) {
         bot.a().a("overlayMessage");
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
               $$5 = azm.a($$3 / 50.0F, 0.7F, 0.6F, $$4);
            } else {
               $$5 = axx.c($$4, -1);
            }

            int $$7 = $$2.a(this.ac);
            $$0.a($$2, this.ac, -$$7 / 2, -4, $$7, $$5);
            $$0.c().b();
         }

         bot.a().c();
      }
   }

   private void f(flq $$0, fju $$1) {
      if (this.ao != null && this.an > 0) {
         flo $$2 = this.f();
         bot.a().a("titleAndSubtitle");
         float $$3 = (float)this.an - $$1.a(false);
         int $$4 = 255;
         if (this.an > this.as + this.ar) {
            float $$5 = (float)(this.aq + this.ar + this.as) - $$3;
            $$4 = (int)($$5 * 255.0F / (float)this.aq);
         }

         if (this.an <= this.as) {
            $$4 = (int)($$3 * 255.0F / (float)this.as);
         }

         $$4 = azm.a($$4, 0, 255);
         if ($$4 > 8) {
            $$0.c().a();
            $$0.c().a((float)($$0.a() / 2), (float)($$0.b() / 2), 0.0F);
            $$0.c().a();
            $$0.c().b(4.0F, 4.0F, 4.0F);
            int $$6 = $$2.a(this.ao);
            int $$7 = axx.c($$4, -1);
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

         bot.a().c();
      }
   }

   private void g(flq $$0, fju $$1) {
      if (!this.aa.e()) {
         fdu $$2 = this.Z.aO();
         int $$3 = azm.a(this.Z.o.e() * (double)$$2.o() / (double)$$2.m());
         int $$4 = azm.a(this.Z.o.f() * (double)$$2.p() / (double)$$2.n());
         this.aa.a($$0, this.ab, $$3, $$4, false);
      }
   }

   private void h(flq $$0, fju $$1) {
      fbd $$2 = this.Z.s.P();
      fav $$3 = null;
      fay $$4 = $$2.e(this.Z.t.cI());
      if ($$4 != null) {
         fau $$5 = fau.a($$4.n());
         if ($$5 != null) {
            $$3 = $$2.a($$5);
         }
      }

      fav $$6 = $$3 != null ? $$3 : $$2.a(fau.b);
      if ($$6 != null) {
         this.a($$0, $$6);
      }
   }

   private void i(flq $$0, fju $$1) {
      fbd $$2 = this.Z.s.P();
      fav $$3 = $$2.a(fau.a);
      if (!this.Z.n.J.e() || this.Z.T() && this.Z.t.i.l().size() <= 1 && $$3 == null) {
         this.al.a(false);
      } else {
         this.al.a(true);
         this.al.a($$0, $$0.a(), $$2, $$3);
      }
   }

   private void j(flq $$0, fju $$1) {
      fki $$2 = this.Z.n;
      if ($$2.aD().a()) {
         if (this.Z.r.j() != dfj.d || this.a(this.Z.w)) {
            if (this.ai.d() && !this.Z.t.gx() && !$$2.X().c()) {
               fjn $$3 = this.Z.j.k();
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
               $$0.a(gjq::D, c, ($$0.a() - 15) / 2, ($$0.b() - 15) / 2, 15, 15);
               if (this.Z.n.E().c() == fjm.b) {
                  float $$6 = this.Z.t.H(0.0F);
                  boolean $$7 = false;
                  if (this.Z.v != null && this.Z.v instanceof bvh && $$6 >= 1.0F) {
                     $$7 = this.Z.t.gA() > 5.0F;
                     $$7 &= this.Z.v.bL();
                  }

                  int $$8 = $$0.b() / 2 - 7 + 16;
                  int $$9 = $$0.a() / 2 - 8;
                  if ($$7) {
                     $$0.a(gjq::D, d, $$9, $$8, 16, 16);
                  } else if ($$6 < 1.0F) {
                     int $$10 = (int)($$6 * 17.0F);
                     $$0.a(gjq::D, e, $$9, $$8, 16, 4);
                     $$0.a(gjq::D, f, 16, 4, 0, 0, $$9, $$8, $$10, 4);
                  }
               }
            }
         }
      }
   }

   private boolean a(@Nullable ezw $$0) {
      if ($$0 == null) {
         return false;
      } else if ($$0.d() == ezw.a.c) {
         return ((ezv)$$0).a() instanceof bsm;
      } else if ($$0.d() == ezw.a.b) {
         jh $$1 = ((ezu)$$0).b();
         dfm $$2 = this.Z.s;
         return $$2.a_($$1).c($$2, $$1) != null;
      } else {
         return false;
      }
   }

   private void k(flq $$0, fju $$1) {
      Collection<btq> $$2 = this.Z.t.eA();
      if (!$$2.isEmpty() && (this.Z.z == null || !this.Z.z.D())) {
         int $$3 = 0;
         int $$4 = 0;
         had $$5 = this.Z.aG();
         List<Runnable> $$6 = Lists.newArrayListWithExpectedSize($$2.size());

         for (btq $$7 : Ordering.natural().reverse().sortedCopy($$2)) {
            jq<bto> $$8 = $$7.c();
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
                  $$0.a(gjq::B, g, $$9, $$10, 24, 24);
               } else {
                  $$0.a(gjq::B, h, $$9, $$10, 24, 24);
                  if ($$7.a(200)) {
                     int $$12 = $$7.d();
                     int $$13 = 10 - $$12 / 20;
                     $$11 = azm.a((float)$$12 / 10.0F / 5.0F * 0.5F, 0.0F, 0.5F)
                        + azm.b((float)$$12 * (float) Math.PI / 5.0F) * azm.a((float)$$13 / 10.0F * 0.25F, 0.0F, 0.25F);
                     $$11 = azm.a($$11, 0.0F, 1.0F);
                  }
               }

               gze $$14 = $$5.a($$8);
               int $$15 = $$9;
               int $$16 = $$10;
               float $$17 = $$11;
               $$6.add(() -> {
                  int $$5x = axx.a($$17);
                  $$0.a(gjq::B, $$14, $$15 + 3, $$16 + 3, 18, 18, $$5x);
               });
            }
         }

         $$6.forEach(Runnable::run);
      }
   }

   private void l(flq $$0, fju $$1) {
      if (this.Z.r.j() == dfj.d) {
         this.ak.a($$0);
      } else {
         this.m($$0, $$1);
      }

      int $$2 = $$0.a() / 2 - 91;
      bvr $$3 = this.Z.t.v();
      if ($$3 != null) {
         this.a($$3, $$0, $$2);
      } else if (this.m()) {
         this.a($$0, $$2);
      }

      if (this.Z.r.a()) {
         this.b($$0);
      }

      this.c($$0);
      if (this.Z.r.j() != dfj.d) {
         this.a($$0);
      } else if (this.Z.t.Y_()) {
         this.ak.b($$0);
      }
   }

   private void m(flq $$0, fju $$1) {
      cou $$2 = this.n();
      if ($$2 != null) {
         cwm $$3 = $$2.eY();
         bvb $$4 = $$2.fw().e();
         int $$5 = $$0.a() / 2;
         int $$6 = 182;
         int $$7 = 91;
         $$0.c().a();
         $$0.c().a(0.0F, 0.0F, -90.0F);
         $$0.a(gjq::B, i, $$5 - 91, $$0.b() - 22, 182, 22);
         $$0.a(gjq::B, j, $$5 - 91 - 1 + $$2.gg().j * 20, $$0.b() - 22 - 1, 24, 23);
         if (!$$3.f()) {
            if ($$4 == bvb.a) {
               $$0.a(gjq::B, k, $$5 - 91 - 29, $$0.b() - 23, 29, 24);
            } else {
               $$0.a(gjq::B, l, $$5 + 91, $$0.b() - 23, 29, 24);
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
            if ($$4 == bvb.a) {
               this.a($$0, $$5 - 91 - 26, $$12, $$1, $$2, $$3, $$8++);
            } else {
               this.a($$0, $$5 + 91 + 10, $$12, $$1, $$2, $$3, $$8++);
            }
         }

         if (this.Z.n.E().c() == fjm.c) {
            float $$13 = this.Z.t.H(0.0F);
            if ($$13 < 1.0F) {
               int $$14 = $$0.b() - 20;
               int $$15 = $$5 + 91 + 6;
               if ($$4 == bvb.b) {
                  $$15 = $$5 - 91 - 22;
               }

               int $$16 = (int)($$13 * 19.0F);
               $$0.a(gjq::B, m, $$15, $$14, 18, 18);
               $$0.a(gjq::B, n, 18, 18, 0, 18 - $$16, $$15, $$14 + 18 - $$16, 18, $$16);
            }
         }
      }
   }

   private void a(bvr $$0, flq $$1, int $$2) {
      bot.a().a("jumpBar");
      float $$3 = this.Z.t.y();
      int $$4 = 182;
      int $$5 = (int)($$3 * 183.0F);
      int $$6 = $$1.b() - 32 + 3;
      $$1.a(gjq::B, o, $$2, $$6, 182, 5);
      if ($$0.c() > 0) {
         $$1.a(gjq::B, p, $$2, $$6, 182, 5);
      } else if ($$5 > 0) {
         $$1.a(gjq::B, q, 182, 5, 0, 0, $$2, $$6, $$5, 5);
      }

      bot.a().c();
   }

   private void a(flq $$0, int $$1) {
      bot.a().a("expBar");
      int $$2 = this.Z.t.gq();
      if ($$2 > 0) {
         int $$3 = 182;
         int $$4 = (int)(this.Z.t.cr * 183.0F);
         int $$5 = $$0.b() - 32 + 3;
         $$0.a(gjq::B, r, $$1, $$5, 182, 5);
         if ($$4 > 0) {
            $$0.a(gjq::B, s, 182, 5, 0, 0, $$1, $$5, $$4, 5);
         }
      }

      bot.a().c();
   }

   private void n(flq $$0, fju $$1) {
      int $$2 = this.Z.t.cp;
      if (this.m() && $$2 > 0) {
         bot.a().a("expLevel");
         String $$3 = $$2 + "";
         int $$4 = ($$0.a() - this.f().b($$3)) / 2;
         int $$5 = $$0.b() - 31 - 4;
         $$0.a(this.f(), $$3, $$4 + 1, $$5, 0, false);
         $$0.a(this.f(), $$3, $$4 - 1, $$5, 0, false);
         $$0.a(this.f(), $$3, $$4, $$5 + 1, 0, false);
         $$0.a(this.f(), $$3, $$4, $$5 - 1, 0, false);
         $$0.a(this.f(), $$3, $$4, $$5, 8453920, false);
         bot.a().c();
      }
   }

   private boolean m() {
      return this.Z.t.v() == null && this.Z.r.d();
   }

   private void a(flq $$0) {
      bot.a().a("selectedItemName");
      if (this.ag > 0 && !this.ah.f()) {
         xx $$1 = xj.i().b(this.ah.y()).a(this.ah.C().a());
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
            $$0.a(this.f(), (xj)$$1, $$3, $$4, $$2, axx.c($$5, -1));
         }
      }

      bot.a().c();
   }

   private void o(flq $$0, fju $$1) {
      if (this.Z.K()) {
         bot.a().a("demo");
         xj $$2;
         if (this.Z.s.ab() >= 120500L) {
            $$2 = M;
         } else {
            $$2 = xj.a("demo.remainingTime", baj.a((int)(120500L - this.Z.s.ab()), this.Z.s.t().f()));
         }

         int $$4 = this.f().a($$2);
         int $$5 = $$0.a() - $$4 - 10;
         int $$6 = 5;
         $$0.a(this.f(), $$2, $$5, 5, $$4, -1);
         bot.a().c();
      }
   }

   private void a(flq $$0, fav $$1) {
      fbd $$2 = $$1.a();
      yz $$3 = $$1.a(zc.c);

      record a(xj a, xj b, int c) {
      }

      a[] $$4 = $$2.i($$1).stream().filter($$0x -> !$$0x.a()).sorted(L).limit(15L).map($$2x -> {
         fay $$3x = $$2.e($$2x.c());
         xj $$4x = $$2x.b();
         xj $$5x = fay.a($$3x, $$4x);
         xj $$6x = $$2x.a($$3);
         int $$7x = this.f().a($$6x);
         return new a($$5x, $$6x, $$7x);
      }).toArray(a[]::new);
      xj $$5 = $$1.d();
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
   private cou n() {
      return this.Z.ao() instanceof cou $$0 ? $$0 : null;
   }

   @Nullable
   private bvh o() {
      cou $$0 = this.n();
      if ($$0 != null) {
         bul $$1 = $$0.dk();
         if ($$1 == null) {
            return null;
         }

         if ($$1 instanceof bvh) {
            return (bvh)$$1;
         }
      }

      return null;
   }

   private int a(@Nullable bvh $$0) {
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

   private void b(flq $$0) {
      cou $$1 = this.n();
      if ($$1 != null) {
         int $$2 = azm.f($$1.eD());
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
         float $$9 = Math.max((float)$$1.h(bwp.s), (float)Math.max($$5, $$2));
         int $$10 = azm.f($$1.fu());
         int $$11 = azm.f(($$9 + (float)$$10) / 2.0F / 10.0F);
         int $$12 = Math.max(10 - ($$11 - 2), 3);
         int $$13 = $$8 - 10;
         int $$14 = -1;
         if ($$1.b(bts.j)) {
            $$14 = this.ab % azm.f($$9 + 5.0F);
         }

         bot.a().a("armor");
         a($$0, $$1, $$8, $$11, $$12, $$6);
         bot.a().b("health");
         this.a($$0, $$1, $$6, $$8, $$12, $$14, $$9, $$2, $$5, $$10, $$3);
         bvh $$15 = this.o();
         int $$16 = this.a($$15);
         if ($$16 == 0) {
            bot.a().b("food");
            this.a($$0, $$1, $$8, $$7);
            $$13 -= 10;
         }

         bot.a().b("air");
         int $$17 = $$1.cs();
         int $$18 = Math.min($$1.ct(), $$17);
         if ($$1.a(axi.a) || $$18 < $$17) {
            int $$19 = this.a($$16) - 1;
            $$13 -= $$19 * 10;
            int $$20 = azm.c((double)($$18 - 2) * 10.0 / (double)$$17);
            int $$21 = azm.c((double)$$18 * 10.0 / (double)$$17) - $$20;

            for (int $$22 = 0; $$22 < $$20 + $$21; $$22++) {
               if ($$22 < $$20) {
                  $$0.a(gjq::B, C, $$7 - $$22 * 8 - 9, $$13, 9, 9);
               } else {
                  $$0.a(gjq::B, D, $$7 - $$22 * 8 - 9, $$13, 9, 9);
               }
            }
         }

         bot.a().c();
      }
   }

   private static void a(flq $$0, cou $$1, int $$2, int $$3, int $$4, int $$5) {
      int $$6 = $$1.eO();
      if ($$6 > 0) {
         int $$7 = $$2 - ($$3 - 1) * $$4 - 10;

         for (int $$8 = 0; $$8 < 10; $$8++) {
            int $$9 = $$5 + $$8 * 8;
            if ($$8 * 2 + 1 < $$6) {
               $$0.a(gjq::B, v, $$9, $$7, 9, 9);
            }

            if ($$8 * 2 + 1 == $$6) {
               $$0.a(gjq::B, u, $$9, $$7, 9, 9);
            }

            if ($$8 * 2 + 1 > $$6) {
               $$0.a(gjq::B, t, $$9, $$7, 9, 9);
            }
         }
      }
   }

   private void a(flq $$0, cou $$1, int $$2, int $$3, int $$4, int $$5, float $$6, int $$7, int $$8, int $$9, boolean $$10) {
      flp.b $$11 = flp.b.a($$1);
      boolean $$12 = $$1.dV().C_().l();
      int $$13 = azm.c((double)$$6 / 2.0);
      int $$14 = azm.c((double)$$9 / 2.0);
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

         this.a($$0, flp.b.a, $$19, $$20, $$12, $$10, false);
         int $$21 = $$16 * 2;
         boolean $$22 = $$16 >= $$13;
         if ($$22) {
            int $$23 = $$21 - $$15;
            if ($$23 < $$9) {
               boolean $$24 = $$23 + 1 == $$9;
               this.a($$0, $$11 == flp.b.d ? $$11 : flp.b.e, $$19, $$20, $$12, false, $$24);
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

   private void a(flq $$0, flp.b $$1, int $$2, int $$3, boolean $$4, boolean $$5, boolean $$6) {
      $$0.a(gjq::B, $$1.a($$4, $$6, $$5), $$2, $$3, 9, 9);
   }

   private void a(flq $$0, cou $$1, int $$2, int $$3) {
      crv $$4 = $$1.gr();
      int $$5 = $$4.a();

      for (int $$6 = 0; $$6 < 10; $$6++) {
         int $$7 = $$2;
         alj $$8;
         alj $$9;
         alj $$10;
         if ($$1.b(bts.q)) {
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
         $$0.a(gjq::B, $$8, $$14, $$7, 9, 9);
         if ($$6 * 2 + 1 < $$5) {
            $$0.a(gjq::B, $$10, $$14, $$7, 9, 9);
         }

         if ($$6 * 2 + 1 == $$5) {
            $$0.a(gjq::B, $$9, $$14, $$7, 9, 9);
         }
      }
   }

   private void c(flq $$0) {
      bvh $$1 = this.o();
      if ($$1 != null) {
         int $$2 = this.a($$1);
         if ($$2 != 0) {
            int $$3 = (int)Math.ceil((double)$$1.eD());
            bot.a().b("mountHealth");
            int $$4 = $$0.b() - 39;
            int $$5 = $$0.a() / 2 + 91;
            int $$6 = $$4;

            for (int $$7 = 0; $$2 > 0; $$7 += 20) {
               int $$8 = Math.min($$2, 10);
               $$2 -= $$8;

               for (int $$9 = 0; $$9 < $$8; $$9++) {
                  int $$10 = $$5 - $$9 * 8 - 9;
                  $$0.a(gjq::B, E, $$10, $$6, 9, 9);
                  if ($$9 * 2 + 1 + $$7 < $$3) {
                     $$0.a(gjq::B, F, $$10, $$6, 9, 9);
                  }

                  if ($$9 * 2 + 1 + $$7 == $$3) {
                     $$0.a(gjq::B, G, $$10, $$6, 9, 9);
                  }
               }

               $$6 -= 10;
            }
         }
      }
   }

   private void a(flq $$0, alj $$1, float $$2) {
      int $$3 = axx.a($$2);
      $$0.a(gjq::z, $$1, 0, 0, 0.0F, 0.0F, $$0.a(), $$0.b(), $$0.a(), $$0.b(), $$3);
   }

   private void a(flq $$0, float $$1) {
      float $$2 = (float)Math.min($$0.a(), $$0.b());
      float $$4 = Math.min((float)$$0.a() / $$2, (float)$$0.b() / $$2) * $$1;
      int $$5 = azm.d($$2 * $$4);
      int $$6 = azm.d($$2 * $$4);
      int $$7 = ($$0.a() - $$5) / 2;
      int $$8 = ($$0.b() - $$6) / 2;
      int $$9 = $$7 + $$5;
      int $$10 = $$8 + $$6;
      $$0.a(gjq::B, J, $$7, $$8, 0.0F, 0.0F, $$5, $$6, $$5, $$6);
      $$0.a(gjq.G(), 0, $$10, $$0.a(), $$0.b(), -90, -16777216);
      $$0.a(gjq.G(), 0, 0, $$0.a(), $$8, -90, -16777216);
      $$0.a(gjq.G(), 0, $$8, $$7, $$10, -90, -16777216);
      $$0.a(gjq.G(), $$9, $$8, $$0.a(), $$10, -90, -16777216);
   }

   private void a(bul $$0) {
      jh $$1 = jh.a($$0.dA(), $$0.dE(), $$0.dG());
      float $$2 = gje.a($$0.dV().F_(), $$0.dV().A($$1));
      float $$3 = azm.a(1.0F - $$2, 0.0F, 1.0F);
      this.b = this.b + ($$3 - this.b) * 0.01F;
   }

   private void a(flq $$0, @Nullable bul $$1) {
      dxl $$2 = this.Z.s.E_();
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
         $$3 = azm.a($$3, 0.0F, 1.0F);
         $$7 = axx.a(1.0F, 0.0F, $$3, $$3);
      } else {
         float $$8 = this.b;
         $$8 = azm.a($$8, 0.0F, 1.0F);
         $$7 = axx.a(1.0F, $$8, $$8, $$8);
      }

      $$0.a(gjq::C, H, 0, 0, 0.0F, 0.0F, $$0.a(), $$0.b(), $$0.a(), $$0.b(), $$7);
   }

   private void b(flq $$0, float $$1) {
      if ($$1 < 1.0F) {
         $$1 *= $$1;
         $$1 *= $$1;
         $$1 = $$1 * 0.8F + 0.2F;
      }

      int $$2 = axx.a($$1);
      gze $$3 = this.Z.ap().a().a(dis.ed.m());
      $$0.a(gjq::z, $$3, 0, 0, $$0.a(), $$0.b(), $$2);
   }

   private void c(flq $$0, float $$1) {
      int $$2 = $$0.a();
      int $$3 = $$0.b();
      $$0.c().a();
      float $$4 = azm.h($$1, 2.0F, 1.0F);
      $$0.c().a((float)$$2 / 2.0F, (float)$$3 / 2.0F, 0.0F);
      $$0.c().b($$4, $$4, $$4);
      $$0.c().a((float)(-$$2) / 2.0F, (float)(-$$3) / 2.0F, 0.0F);
      float $$5 = 0.2F * $$1;
      float $$6 = 0.4F * $$1;
      float $$7 = 0.2F * $$1;
      $$0.a($$0x -> gjq.H(), a, 0, 0, 0.0F, 0.0F, $$2, $$3, $$2, $$3, axx.a(1.0F, $$5, $$6, $$7));
      $$0.c().b();
   }

   private void a(flq $$0, int $$1, int $$2, fju $$3, cou $$4, cwm $$5, int $$6) {
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
      bul $$0 = this.Z.ao();
      if ($$0 != null) {
         this.a($$0);
      }

      if (this.Z.t != null) {
         cwm $$1 = this.Z.t.gg().f();
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
      boolean $$1 = $$0 != null && $$0.bf();
      this.ay = this.ax;
      this.ax = azm.h(0.2F, this.ax, $$1 ? 1.0F : 0.0F);
   }

   public void a(xj $$0) {
      xj $$1 = xj.a("record.nowPlaying", $$0);
      this.a($$1, true);
      this.Z.aZ().c($$1);
   }

   public void a(xj $$0, boolean $$1) {
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

   public void b(xj $$0) {
      this.ap = $$0;
   }

   public void c(xj $$0) {
      this.ao = $$0;
      this.an = this.aq + this.ar + this.as;
   }

   public void c() {
      this.ao = null;
      this.ap = null;
      this.an = 0;
   }

   public fme d() {
      return this.aa;
   }

   public int e() {
      return this.ab;
   }

   public flo f() {
      return this.Z.h;
   }

   public fod g() {
      return this.ak;
   }

   public fne h() {
      return this.al;
   }

   public void i() {
      this.al.a();
      this.am.a();
      this.Z.aA().b();
      this.ai.p();
      this.aa.a(true);
   }

   public fmc j() {
      return this.am;
   }

   public fml k() {
      return this.ai;
   }

   public void l() {
      this.ai.a();
   }

   public void b(flq $$0, fju $$1) {
      if (this.Z.n.ah().c() && (this.ax > 0.0F || this.ay > 0.0F)) {
         int $$2 = azm.d(255.0F * azm.a(azm.h($$1.b(), this.ay, this.ax), 0.0F, 1.0F));
         if ($$2 > 8) {
            flo $$3 = this.f();
            int $$4 = $$3.a(N);
            int $$5 = axx.c($$2, -1);
            int $$6 = $$0.a() - $$4 - 5;
            int $$7 = $$0.b() - 9 - 5;
            $$0.a($$3, N, $$6, $$7, $$4, $$5);
         }
      }
   }

   static enum b {
      a(
         alj.b("hud/heart/container"),
         alj.b("hud/heart/container_blinking"),
         alj.b("hud/heart/container"),
         alj.b("hud/heart/container_blinking"),
         alj.b("hud/heart/container_hardcore"),
         alj.b("hud/heart/container_hardcore_blinking"),
         alj.b("hud/heart/container_hardcore"),
         alj.b("hud/heart/container_hardcore_blinking")
      ),
      b(
         alj.b("hud/heart/full"),
         alj.b("hud/heart/full_blinking"),
         alj.b("hud/heart/half"),
         alj.b("hud/heart/half_blinking"),
         alj.b("hud/heart/hardcore_full"),
         alj.b("hud/heart/hardcore_full_blinking"),
         alj.b("hud/heart/hardcore_half"),
         alj.b("hud/heart/hardcore_half_blinking")
      ),
      c(
         alj.b("hud/heart/poisoned_full"),
         alj.b("hud/heart/poisoned_full_blinking"),
         alj.b("hud/heart/poisoned_half"),
         alj.b("hud/heart/poisoned_half_blinking"),
         alj.b("hud/heart/poisoned_hardcore_full"),
         alj.b("hud/heart/poisoned_hardcore_full_blinking"),
         alj.b("hud/heart/poisoned_hardcore_half"),
         alj.b("hud/heart/poisoned_hardcore_half_blinking")
      ),
      d(
         alj.b("hud/heart/withered_full"),
         alj.b("hud/heart/withered_full_blinking"),
         alj.b("hud/heart/withered_half"),
         alj.b("hud/heart/withered_half_blinking"),
         alj.b("hud/heart/withered_hardcore_full"),
         alj.b("hud/heart/withered_hardcore_full_blinking"),
         alj.b("hud/heart/withered_hardcore_half"),
         alj.b("hud/heart/withered_hardcore_half_blinking")
      ),
      e(
         alj.b("hud/heart/absorbing_full"),
         alj.b("hud/heart/absorbing_full_blinking"),
         alj.b("hud/heart/absorbing_half"),
         alj.b("hud/heart/absorbing_half_blinking"),
         alj.b("hud/heart/absorbing_hardcore_full"),
         alj.b("hud/heart/absorbing_hardcore_full_blinking"),
         alj.b("hud/heart/absorbing_hardcore_half"),
         alj.b("hud/heart/absorbing_hardcore_half_blinking")
      ),
      f(
         alj.b("hud/heart/frozen_full"),
         alj.b("hud/heart/frozen_full_blinking"),
         alj.b("hud/heart/frozen_half"),
         alj.b("hud/heart/frozen_half_blinking"),
         alj.b("hud/heart/frozen_hardcore_full"),
         alj.b("hud/heart/frozen_hardcore_full_blinking"),
         alj.b("hud/heart/frozen_hardcore_half"),
         alj.b("hud/heart/frozen_hardcore_half_blinking")
      );

      private final alj g;
      private final alj h;
      private final alj i;
      private final alj j;
      private final alj k;
      private final alj l;
      private final alj m;
      private final alj n;

      private b(final alj $$0, final alj $$1, final alj $$2, final alj $$3, final alj $$4, final alj $$5, final alj $$6, final alj $$7) {
         this.g = $$0;
         this.h = $$1;
         this.i = $$2;
         this.j = $$3;
         this.k = $$4;
         this.l = $$5;
         this.m = $$6;
         this.n = $$7;
      }

      public alj a(boolean $$0, boolean $$1, boolean $$2) {
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

      static flp.b a(cou $$0) {
         flp.b $$1;
         if ($$0.b(bts.s)) {
            $$1 = c;
         } else if ($$0.b(bts.t)) {
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
