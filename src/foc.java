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

public class foc {
   private static final aku c = aku.b("hud/crosshair");
   private static final aku d = aku.b("hud/crosshair_attack_indicator_full");
   private static final aku e = aku.b("hud/crosshair_attack_indicator_background");
   private static final aku f = aku.b("hud/crosshair_attack_indicator_progress");
   private static final aku g = aku.b("hud/effect_background_ambient");
   private static final aku h = aku.b("hud/effect_background");
   private static final aku i = aku.b("hud/hotbar");
   private static final aku j = aku.b("hud/hotbar_selection");
   private static final aku k = aku.b("hud/hotbar_offhand_left");
   private static final aku l = aku.b("hud/hotbar_offhand_right");
   private static final aku m = aku.b("hud/hotbar_attack_indicator_background");
   private static final aku n = aku.b("hud/hotbar_attack_indicator_progress");
   private static final aku o = aku.b("hud/jump_bar_background");
   private static final aku p = aku.b("hud/jump_bar_cooldown");
   private static final aku q = aku.b("hud/jump_bar_progress");
   private static final aku r = aku.b("hud/experience_bar_background");
   private static final aku s = aku.b("hud/experience_bar_progress");
   private static final aku t = aku.b("hud/armor_empty");
   private static final aku u = aku.b("hud/armor_half");
   private static final aku v = aku.b("hud/armor_full");
   private static final aku w = aku.b("hud/food_empty_hunger");
   private static final aku x = aku.b("hud/food_half_hunger");
   private static final aku y = aku.b("hud/food_full_hunger");
   private static final aku z = aku.b("hud/food_empty");
   private static final aku A = aku.b("hud/food_half");
   private static final aku B = aku.b("hud/food_full");
   private static final aku C = aku.b("hud/air");
   private static final aku D = aku.b("hud/air_bursting");
   private static final aku E = aku.b("hud/air_empty");
   private static final aku F = aku.b("hud/heart/vehicle_container");
   private static final aku G = aku.b("hud/heart/vehicle_full");
   private static final aku H = aku.b("hud/heart/vehicle_half");
   private static final aku I = aku.b("textures/misc/vignette.png");
   public static final aku a = aku.b("textures/misc/nausea.png");
   private static final aku J = aku.b("textures/misc/spyglass_scope.png");
   private static final aku K = aku.b("textures/misc/powder_snow_outline.png");
   private static final Comparator<fby> L = Comparator.comparing(fby::d).reversed().thenComparing(fby::c, String.CASE_INSENSITIVE_ORDER);
   private static final wo M = wo.c("demo.demoExpired");
   private static final wo N = wo.c("menu.savingLevel");
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
   private final azh aj = azh.a();
   private final flj ak;
   private final fot al;
   private int am;
   @Nullable
   private wo an;
   private int ao;
   private boolean ap;
   private boolean aq;
   public float b = 1.0F;
   private int ar;
   private cwp as = cwp.j;
   private final fpa at;
   private final fqa au;
   private final fqs av;
   private final fpt aw;
   private final foq ax;
   private int ay;
   @Nullable
   private wo az;
   @Nullable
   private wo aA;
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
   private final fog aL = new fog();
   private float aM;

   public foc(flj $$0) {
      this.ak = $$0;
      this.at = new fpa($$0);
      this.av = new fqs($$0);
      this.al = new fot($$0);
      this.aw = new fpt($$0, this);
      this.ax = new foq($$0);
      this.au = new fqa($$0);
      this.a();
      fog $$1 = new fog().a(this::c).a(this::j).a(this::l).a(this::n).a(this::k).a(($$0x, $$1x) -> this.ax.a($$0x));
      fog $$2 = new fog().a(this::o).a(($$0x, $$1x) -> {
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

   public void a(fod $$0, fkz $$1) {
      this.aL.a($$0, $$1);
   }

   private void c(fod $$0, fkz $$1) {
      if (flj.N()) {
         this.a($$0, this.ak.ao());
      }

      float $$2 = $$1.a();
      this.aM = ayz.h(0.5F * $$2, this.aM, 1.125F);
      if (this.ak.n.aE().a()) {
         if (this.ak.t.gH()) {
            this.a($$0, this.aM);
         } else {
            this.aM = 0.5F;

            for (bus $$3 : bus.values()) {
               cwp $$4 = this.ak.t.a($$3);
               deu $$5 = $$4.a(kv.D);
               if ($$5 != null && $$5.a() == $$3 && $$5.d().isPresent()) {
                  this.a($$0, $$5.d().get().a((UnaryOperator<String>)($$0x -> "textures/" + $$0x + ".png")), 1.0F);
               }
            }
         }
      }

      if (this.ak.t.cu() > 0) {
         this.a($$0, K, this.ak.t.cv());
      }

      float $$6 = ayz.h($$1.a(false), this.ak.t.cJ, this.ak.t.cI);
      if ($$6 > 0.0F) {
         if (!this.ak.t.b(btr.i)) {
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

   private void d(fod $$0, fkz $$1) {
      if (this.ak.t.gn() > 0) {
         bor.a().a("sleep");
         float $$2 = (float)this.ak.t.gn();
         float $$3 = $$2 / 100.0F;
         if ($$3 > 1.0F) {
            $$3 = 1.0F - ($$2 - 100.0F) / 10.0F;
         }

         int $$4 = (int)(220.0F * $$3) << 24 | 1052704;
         $$0.a(gmh.L(), 0, 0, $$0.a(), $$0.b(), $$4);
         bor.a().c();
      }
   }

   private void e(fod $$0, fkz $$1) {
      fob $$2 = this.f();
      if (this.an != null && this.ao > 0) {
         bor.a().a("overlayMessage");
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
               $$5 = ayz.a($$3 / 50.0F, 0.7F, 0.6F, $$4);
            } else {
               $$5 = axk.c($$4, -1);
            }

            int $$7 = $$2.a(this.an);
            $$0.a($$2, this.an, -$$7 / 2, -4, $$7, $$5);
            $$0.c().b();
         }

         bor.a().c();
      }
   }

   private void f(fod $$0, fkz $$1) {
      if (this.az != null && this.ay > 0) {
         fob $$2 = this.f();
         bor.a().a("titleAndSubtitle");
         float $$3 = (float)this.ay - $$1.a(false);
         int $$4 = 255;
         if (this.ay > this.aD + this.aC) {
            float $$5 = (float)(this.aB + this.aC + this.aD) - $$3;
            $$4 = (int)($$5 * 255.0F / (float)this.aB);
         }

         if (this.ay <= this.aD) {
            $$4 = (int)($$3 * 255.0F / (float)this.aD);
         }

         $$4 = ayz.a($$4, 0, 255);
         if ($$4 > 8) {
            $$0.c().a();
            $$0.c().a((float)($$0.a() / 2), (float)($$0.b() / 2), 0.0F);
            $$0.c().a();
            $$0.c().b(4.0F, 4.0F, 4.0F);
            int $$6 = $$2.a(this.az);
            int $$7 = axk.c($$4, -1);
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

         bor.a().c();
      }
   }

   private void g(fod $$0, fkz $$1) {
      if (!this.al.e()) {
         fex $$2 = this.ak.aO();
         int $$3 = ayz.a(this.ak.o.e() * (double)$$2.o() / (double)$$2.m());
         int $$4 = ayz.a(this.ak.o.f() * (double)$$2.p() / (double)$$2.n());
         this.al.a($$0, this.am, $$3, $$4, false);
      }
   }

   private void h(fod $$0, fkz $$1) {
      fcf $$2 = this.ak.s.R();
      fbx $$3 = null;
      fca $$4 = $$2.e(this.ak.t.cI());
      if ($$4 != null) {
         fbw $$5 = fbw.a($$4.n());
         if ($$5 != null) {
            $$3 = $$2.a($$5);
         }
      }

      fbx $$6 = $$3 != null ? $$3 : $$2.a(fbw.b);
      if ($$6 != null) {
         this.a($$0, $$6);
      }
   }

   private void i(fod $$0, fkz $$1) {
      fcf $$2 = this.ak.s.R();
      fbx $$3 = $$2.a(fbw.a);
      if (!this.ak.n.J.e() || this.ak.T() && this.ak.t.j.l().size() <= 1 && $$3 == null) {
         this.aw.a(false);
      } else {
         this.aw.a(true);
         this.aw.a($$0, $$0.a(), $$2, $$3);
      }
   }

   private void j(fod $$0, fkz $$1) {
      fln $$2 = this.ak.n;
      if ($$2.aE().a()) {
         if (this.ak.r.j() != dgf.d || this.a(this.ak.w)) {
            if (this.at.d() && !this.ak.t.gz() && !$$2.Y().c()) {
               fkr $$3 = this.ak.j.k();
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
               $$0.a(gmh::J, c, ($$0.a() - 15) / 2, ($$0.b() - 15) / 2, 15, 15);
               if (this.ak.n.F().c() == fkq.b) {
                  float $$6 = this.ak.t.H(0.0F);
                  boolean $$7 = false;
                  if (this.ak.v != null && this.ak.v instanceof bvg && $$6 >= 1.0F) {
                     $$7 = this.ak.t.gC() > 5.0F;
                     $$7 &= this.ak.v.bL();
                  }

                  int $$8 = $$0.b() / 2 - 7 + 16;
                  int $$9 = $$0.a() / 2 - 8;
                  if ($$7) {
                     $$0.a(gmh::J, d, $$9, $$8, 16, 16);
                  } else if ($$6 < 1.0F) {
                     int $$10 = (int)($$6 * 17.0F);
                     $$0.a(gmh::J, e, $$9, $$8, 16, 4);
                     $$0.a(gmh::J, f, 16, 4, 0, 0, $$9, $$8, $$10, 4);
                  }
               }
            }
         }
      }
   }

   private boolean a(@Nullable fay $$0) {
      if ($$0 == null) {
         return false;
      } else if ($$0.d() == fay.a.c) {
         return ((fax)$$0).a() instanceof bsl;
      } else if ($$0.d() == fay.a.b) {
         ji $$1 = ((faw)$$0).b();
         dgi $$2 = this.ak.s;
         return $$2.a_($$1).c($$2, $$1) != null;
      } else {
         return false;
      }
   }

   private void k(fod $$0, fkz $$1) {
      Collection<btp> $$2 = this.ak.t.eB();
      if (!$$2.isEmpty() && (this.ak.z == null || !this.ak.z.C())) {
         int $$3 = 0;
         int $$4 = 0;
         hfi $$5 = this.ak.aG();
         List<Runnable> $$6 = Lists.newArrayListWithExpectedSize($$2.size());

         for (btp $$7 : Ordering.natural().reverse().sortedCopy($$2)) {
            jr<btn> $$8 = $$7.c();
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
                  $$0.a(gmh::H, g, $$9, $$10, 24, 24);
               } else {
                  $$0.a(gmh::H, h, $$9, $$10, 24, 24);
                  if ($$7.a(200)) {
                     int $$12 = $$7.d();
                     int $$13 = 10 - $$12 / 20;
                     $$11 = ayz.a((float)$$12 / 10.0F / 5.0F * 0.5F, 0.0F, 0.5F)
                        + ayz.b((float)$$12 * (float) Math.PI / 5.0F) * ayz.a((float)$$13 / 10.0F * 0.25F, 0.0F, 0.25F);
                     $$11 = ayz.a($$11, 0.0F, 1.0F);
                  }
               }

               hej $$14 = $$5.a($$8);
               int $$15 = $$9;
               int $$16 = $$10;
               float $$17 = $$11;
               $$6.add(() -> {
                  int $$5x = axk.a($$17);
                  $$0.a(gmh::H, $$14, $$15 + 3, $$16 + 3, 18, 18, $$5x);
               });
            }
         }

         $$6.forEach(Runnable::run);
      }
   }

   private void l(fod $$0, fkz $$1) {
      if (this.ak.r.j() == dgf.d) {
         this.av.a($$0);
      } else {
         this.m($$0, $$1);
      }

      int $$2 = $$0.a() / 2 - 91;
      bvq $$3 = this.ak.t.v();
      if ($$3 != null) {
         this.a($$3, $$0, $$2);
      } else if (this.m()) {
         this.a($$0, $$2);
      }

      if (this.ak.r.a()) {
         this.b($$0);
      }

      this.c($$0);
      if (this.ak.r.j() != dgf.d) {
         this.a($$0);
      } else if (this.ak.t.Z_()) {
         this.av.b($$0);
      }
   }

   private void m(fod $$0, fkz $$1) {
      cox $$2 = this.n();
      if ($$2 != null) {
         cwp $$3 = $$2.fa();
         bva $$4 = $$2.fy().e();
         int $$5 = $$0.a() / 2;
         int $$6 = 182;
         int $$7 = 91;
         $$0.c().a();
         $$0.c().a(0.0F, 0.0F, -90.0F);
         $$0.a(gmh::H, i, $$5 - 91, $$0.b() - 22, 182, 22);
         $$0.a(gmh::H, j, $$5 - 91 - 1 + $$2.gi().j * 20, $$0.b() - 22 - 1, 24, 23);
         if (!$$3.f()) {
            if ($$4 == bva.a) {
               $$0.a(gmh::H, k, $$5 - 91 - 29, $$0.b() - 23, 29, 24);
            } else {
               $$0.a(gmh::H, l, $$5 + 91, $$0.b() - 23, 29, 24);
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
            if ($$4 == bva.a) {
               this.a($$0, $$5 - 91 - 26, $$12, $$1, $$2, $$3, $$8++);
            } else {
               this.a($$0, $$5 + 91 + 10, $$12, $$1, $$2, $$3, $$8++);
            }
         }

         if (this.ak.n.F().c() == fkq.c) {
            float $$13 = this.ak.t.H(0.0F);
            if ($$13 < 1.0F) {
               int $$14 = $$0.b() - 20;
               int $$15 = $$5 + 91 + 6;
               if ($$4 == bva.b) {
                  $$15 = $$5 - 91 - 22;
               }

               int $$16 = (int)($$13 * 19.0F);
               $$0.a(gmh::H, m, $$15, $$14, 18, 18);
               $$0.a(gmh::H, n, 18, 18, 0, 18 - $$16, $$15, $$14 + 18 - $$16, 18, $$16);
            }
         }
      }
   }

   private void a(bvq $$0, fod $$1, int $$2) {
      bor.a().a("jumpBar");
      float $$3 = this.ak.t.y();
      int $$4 = 182;
      int $$5 = (int)($$3 * 183.0F);
      int $$6 = $$1.b() - 32 + 3;
      $$1.a(gmh::H, o, $$2, $$6, 182, 5);
      if ($$0.c() > 0) {
         $$1.a(gmh::H, p, $$2, $$6, 182, 5);
      } else if ($$5 > 0) {
         $$1.a(gmh::H, q, 182, 5, 0, 0, $$2, $$6, $$5, 5);
      }

      bor.a().c();
   }

   private void a(fod $$0, int $$1) {
      bor.a().a("expBar");
      int $$2 = this.ak.t.gs();
      if ($$2 > 0) {
         int $$3 = 182;
         int $$4 = (int)(this.ak.t.ct * 183.0F);
         int $$5 = $$0.b() - 32 + 3;
         $$0.a(gmh::H, r, $$1, $$5, 182, 5);
         if ($$4 > 0) {
            $$0.a(gmh::H, s, 182, 5, 0, 0, $$1, $$5, $$4, 5);
         }
      }

      bor.a().c();
   }

   private void n(fod $$0, fkz $$1) {
      int $$2 = this.ak.t.cr;
      if (this.m() && $$2 > 0) {
         bor.a().a("expLevel");
         String $$3 = $$2 + "";
         int $$4 = ($$0.a() - this.f().b($$3)) / 2;
         int $$5 = $$0.b() - 31 - 4;
         $$0.a(this.f(), $$3, $$4 + 1, $$5, 0, false);
         $$0.a(this.f(), $$3, $$4 - 1, $$5, 0, false);
         $$0.a(this.f(), $$3, $$4, $$5 + 1, 0, false);
         $$0.a(this.f(), $$3, $$4, $$5 - 1, 0, false);
         $$0.a(this.f(), $$3, $$4, $$5, 8453920, false);
         bor.a().c();
      }
   }

   private boolean m() {
      return this.ak.t.v() == null && this.ak.r.d();
   }

   private void a(fod $$0) {
      bor.a().a("selectedItemName");
      if (this.ar > 0 && !this.as.f()) {
         xc $$1 = wo.i().b(this.as.y()).a(this.as.D().a());
         if (this.as.b(kv.g)) {
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
            $$0.a(this.f(), (wo)$$1, $$3, $$4, $$2, axk.c($$5, -1));
         }
      }

      bor.a().c();
   }

   private void o(fod $$0, fkz $$1) {
      if (this.ak.K()) {
         bor.a().a("demo");
         wo $$2;
         if (this.ak.s.ad() >= 120500L) {
            $$2 = M;
         } else {
            $$2 = wo.a("demo.remainingTime", azw.a((int)(120500L - this.ak.s.ad()), this.ak.s.u().f()));
         }

         int $$4 = this.f().a($$2);
         int $$5 = $$0.a() - $$4 - 10;
         int $$6 = 5;
         $$0.a(this.f(), $$2, $$5, 5, $$4, -1);
         bor.a().c();
      }
   }

   private void a(fod $$0, fbx $$1) {
      fcf $$2 = $$1.a();
      ye $$3 = $$1.a(yh.c);

      record a(wo a, wo b, int c) {
      }

      a[] $$4 = $$2.i($$1).stream().filter($$0x -> !$$0x.a()).sorted(L).limit(15L).map($$2x -> {
         fca $$3x = $$2.e($$2x.c());
         wo $$4x = $$2x.b();
         wo $$5x = fca.a($$3x, $$4x);
         wo $$6x = $$2x.a($$3);
         int $$7x = this.f().a($$6x);
         return new a($$5x, $$6x, $$7x);
      }).toArray(a[]::new);
      wo $$5 = $$1.d();
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
   private cox n() {
      return this.ak.ao() instanceof cox $$0 ? $$0 : null;
   }

   @Nullable
   private bvg o() {
      cox $$0 = this.n();
      if ($$0 != null) {
         buk $$1 = $$0.dl();
         if ($$1 == null) {
            return null;
         }

         if ($$1 instanceof bvg) {
            return (bvg)$$1;
         }
      }

      return null;
   }

   private int a(@Nullable bvg $$0) {
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

   private void b(fod $$0) {
      cox $$1 = this.n();
      if ($$1 != null) {
         int $$2 = ayz.f($$1.eE());
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
         float $$9 = Math.max((float)$$1.h(bwo.s), (float)Math.max($$5, $$2));
         int $$10 = ayz.f($$1.fw());
         int $$11 = ayz.f(($$9 + (float)$$10) / 2.0F / 10.0F);
         int $$12 = Math.max(10 - ($$11 - 2), 3);
         int $$13 = $$8 - 10;
         int $$14 = -1;
         if ($$1.b(btr.j)) {
            $$14 = this.am % ayz.f($$9 + 5.0F);
         }

         bor.a().a("armor");
         a($$0, $$1, $$8, $$11, $$12, $$6);
         bor.a().b("health");
         this.a($$0, $$1, $$6, $$8, $$12, $$14, $$9, $$2, $$5, $$10, $$3);
         bvg $$15 = this.o();
         int $$16 = this.a($$15);
         if ($$16 == 0) {
            bor.a().b("food");
            this.a($$0, $$1, $$8, $$7);
            $$13 -= 10;
         }

         bor.a().b("air");
         this.a($$0, $$1, $$16, $$13, $$7);
         bor.a().c();
      }
   }

   private static void a(fod $$0, cox $$1, int $$2, int $$3, int $$4, int $$5) {
      int $$6 = $$1.eP();
      if ($$6 > 0) {
         int $$7 = $$2 - ($$3 - 1) * $$4 - 10;

         for (int $$8 = 0; $$8 < 10; $$8++) {
            int $$9 = $$5 + $$8 * 8;
            if ($$8 * 2 + 1 < $$6) {
               $$0.a(gmh::H, v, $$9, $$7, 9, 9);
            }

            if ($$8 * 2 + 1 == $$6) {
               $$0.a(gmh::H, u, $$9, $$7, 9, 9);
            }

            if ($$8 * 2 + 1 > $$6) {
               $$0.a(gmh::H, t, $$9, $$7, 9, 9);
            }
         }
      }
   }

   private void a(fod $$0, cox $$1, int $$2, int $$3, int $$4, int $$5, float $$6, int $$7, int $$8, int $$9, boolean $$10) {
      foc.b $$11 = foc.b.a($$1);
      boolean $$12 = $$1.dW().D_().l();
      int $$13 = ayz.c((double)$$6 / 2.0);
      int $$14 = ayz.c((double)$$9 / 2.0);
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

         this.a($$0, foc.b.a, $$19, $$20, $$12, $$10, false);
         int $$21 = $$16 * 2;
         boolean $$22 = $$16 >= $$13;
         if ($$22) {
            int $$23 = $$21 - $$15;
            if ($$23 < $$9) {
               boolean $$24 = $$23 + 1 == $$9;
               this.a($$0, $$11 == foc.b.d ? $$11 : foc.b.e, $$19, $$20, $$12, false, $$24);
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

   private void a(fod $$0, foc.b $$1, int $$2, int $$3, boolean $$4, boolean $$5, boolean $$6) {
      $$0.a(gmh::H, $$1.a($$4, $$6, $$5), $$2, $$3, 9, 9);
   }

   private void a(fod $$0, cox $$1, int $$2, int $$3, int $$4) {
      int $$5 = $$1.cs();
      int $$6 = Math.clamp((long)$$1.ct(), 0, $$5);
      boolean $$7 = $$1.a(awv.a);
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
               $$0.a(gmh::H, C, $$13, $$3, 9, 9);
            } else if ($$11 && $$12 == $$9 && $$7) {
               $$0.a(gmh::H, D, $$13, $$3, 9, 9);
               this.a($$12, $$1, $$10);
            } else if ($$12 > 10 - $$10) {
               int $$14 = $$10 == 10 && this.am % 2 == 0 ? this.aj.a(2) : 0;
               $$0.a(gmh::H, E, $$13, $$3 + $$14, 9, 9);
            }
         }
      }
   }

   private int a(int $$0, int $$1) {
      int $$2 = this.a($$0) - 1;
      return $$1 - $$2 * 10;
   }

   private static int b(int $$0, int $$1, int $$2) {
      return ayz.f((float)(($$0 + $$2) * 10) / (float)$$1);
   }

   private static int a(int $$0, boolean $$1) {
      return $$0 != 0 && $$1 ? 4 : 0;
   }

   private void a(int $$0, cox $$1, int $$2) {
      if (this.aI != $$0) {
         float $$3 = 0.5F + 0.1F * (float)Math.max(0, $$2 - 3 + 1);
         float $$4 = 1.0F + 0.1F * (float)Math.max(0, $$2 - 5 + 1);
         $$1.a(awa.dc, $$3, $$4);
         this.aI = $$0;
      }
   }

   private void a(fod $$0, cox $$1, int $$2, int $$3) {
      cry $$4 = $$1.gt();
      int $$5 = $$4.a();

      for (int $$6 = 0; $$6 < 10; $$6++) {
         int $$7 = $$2;
         aku $$8;
         aku $$9;
         aku $$10;
         if ($$1.b(btr.q)) {
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
         $$0.a(gmh::H, $$8, $$14, $$7, 9, 9);
         if ($$6 * 2 + 1 < $$5) {
            $$0.a(gmh::H, $$10, $$14, $$7, 9, 9);
         }

         if ($$6 * 2 + 1 == $$5) {
            $$0.a(gmh::H, $$9, $$14, $$7, 9, 9);
         }
      }
   }

   private void c(fod $$0) {
      bvg $$1 = this.o();
      if ($$1 != null) {
         int $$2 = this.a($$1);
         if ($$2 != 0) {
            int $$3 = (int)Math.ceil((double)$$1.eE());
            bor.a().b("mountHealth");
            int $$4 = $$0.b() - 39;
            int $$5 = $$0.a() / 2 + 91;
            int $$6 = $$4;

            for (int $$7 = 0; $$2 > 0; $$7 += 20) {
               int $$8 = Math.min($$2, 10);
               $$2 -= $$8;

               for (int $$9 = 0; $$9 < $$8; $$9++) {
                  int $$10 = $$5 - $$9 * 8 - 9;
                  $$0.a(gmh::H, F, $$10, $$6, 9, 9);
                  if ($$9 * 2 + 1 + $$7 < $$3) {
                     $$0.a(gmh::H, G, $$10, $$6, 9, 9);
                  }

                  if ($$9 * 2 + 1 + $$7 == $$3) {
                     $$0.a(gmh::H, H, $$10, $$6, 9, 9);
                  }
               }

               $$6 -= 10;
            }
         }
      }
   }

   private void a(fod $$0, aku $$1, float $$2) {
      int $$3 = axk.a($$2);
      $$0.a(gmh::F, $$1, 0, 0, 0.0F, 0.0F, $$0.a(), $$0.b(), $$0.a(), $$0.b(), $$3);
   }

   private void a(fod $$0, float $$1) {
      float $$2 = (float)Math.min($$0.a(), $$0.b());
      float $$4 = Math.min((float)$$0.a() / $$2, (float)$$0.b() / $$2) * $$1;
      int $$5 = ayz.d($$2 * $$4);
      int $$6 = ayz.d($$2 * $$4);
      int $$7 = ($$0.a() - $$5) / 2;
      int $$8 = ($$0.b() - $$6) / 2;
      int $$9 = $$7 + $$5;
      int $$10 = $$8 + $$6;
      $$0.a(gmh::H, J, $$7, $$8, 0.0F, 0.0F, $$5, $$6, $$5, $$6);
      $$0.a(gmh.L(), 0, $$10, $$0.a(), $$0.b(), -90, -16777216);
      $$0.a(gmh.L(), 0, 0, $$0.a(), $$8, -90, -16777216);
      $$0.a(gmh.L(), 0, $$8, $$7, $$10, -90, -16777216);
      $$0.a(gmh.L(), $$9, $$8, $$0.a(), $$10, -90, -16777216);
   }

   private void a(buk $$0) {
      ji $$1 = ji.a($$0.dB(), $$0.dF(), $$0.dH());
      float $$2 = glv.a($$0.dW().G_(), $$0.dW().A($$1));
      float $$3 = ayz.a(1.0F - $$2, 0.0F, 1.0F);
      this.b = this.b + ($$3 - this.b) * 0.01F;
   }

   private void a(fod $$0, @Nullable buk $$1) {
      dyn $$2 = this.ak.s.F_();
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
         $$3 = ayz.a($$3, 0.0F, 1.0F);
         $$7 = axk.a(1.0F, 0.0F, $$3, $$3);
      } else {
         float $$8 = this.b;
         $$8 = ayz.a($$8, 0.0F, 1.0F);
         $$7 = axk.a(1.0F, $$8, $$8, $$8);
      }

      $$0.a(gmh::I, I, 0, 0, 0.0F, 0.0F, $$0.a(), $$0.b(), $$0.a(), $$0.b(), $$7);
   }

   private void b(fod $$0, float $$1) {
      if ($$1 < 1.0F) {
         $$1 *= $$1;
         $$1 *= $$1;
         $$1 = $$1 * 0.8F + 0.2F;
      }

      int $$2 = axk.a($$1);
      hej $$3 = this.ak.ap().a().a(djo.eq.m());
      $$0.a(gmh::F, $$3, 0, 0, $$0.a(), $$0.b(), $$2);
   }

   private void c(fod $$0, float $$1) {
      int $$2 = $$0.a();
      int $$3 = $$0.b();
      $$0.c().a();
      float $$4 = ayz.h($$1, 2.0F, 1.0F);
      $$0.c().a((float)$$2 / 2.0F, (float)$$3 / 2.0F, 0.0F);
      $$0.c().b($$4, $$4, $$4);
      $$0.c().a((float)(-$$2) / 2.0F, (float)(-$$3) / 2.0F, 0.0F);
      float $$5 = 0.2F * $$1;
      float $$6 = 0.4F * $$1;
      float $$7 = 0.2F * $$1;
      $$0.a($$0x -> gmh.M(), a, 0, 0, 0.0F, 0.0F, $$2, $$3, $$2, $$3, axk.a(1.0F, $$5, $$6, $$7));
      $$0.c().b();
   }

   private void a(fod $$0, int $$1, int $$2, fkz $$3, cox $$4, cwp $$5, int $$6) {
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
      buk $$0 = this.ak.ao();
      if ($$0 != null) {
         this.a($$0);
      }

      if (this.ak.t != null) {
         cwp $$1 = this.ak.t.gi().f();
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
      this.aJ = ayz.h(0.2F, this.aJ, $$1 ? 1.0F : 0.0F);
   }

   public void a(wo $$0) {
      wo $$1 = wo.a("record.nowPlaying", $$0);
      this.a($$1, true);
      this.ak.aY().c($$1);
   }

   public void a(wo $$0, boolean $$1) {
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

   public void b(wo $$0) {
      this.aA = $$0;
   }

   public void c(wo $$0) {
      this.az = $$0;
      this.ay = this.aB + this.aC + this.aD;
   }

   public void c() {
      this.az = null;
      this.aA = null;
      this.ay = 0;
   }

   public fot d() {
      return this.al;
   }

   public int e() {
      return this.am;
   }

   public fob f() {
      return this.ak.h;
   }

   public fqs g() {
      return this.av;
   }

   public fpt h() {
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

   public foq j() {
      return this.ax;
   }

   public fpa k() {
      return this.at;
   }

   public void l() {
      this.at.a();
   }

   public void b(fod $$0, fkz $$1) {
      if (this.ak.n.ai().c() && (this.aJ > 0.0F || this.aK > 0.0F)) {
         int $$2 = ayz.d(255.0F * ayz.a(ayz.h($$1.b(), this.aK, this.aJ), 0.0F, 1.0F));
         if ($$2 > 8) {
            fob $$3 = this.f();
            int $$4 = $$3.a(N);
            int $$5 = axk.c($$2, -1);
            int $$6 = $$0.a() - $$4 - 5;
            int $$7 = $$0.b() - 9 - 5;
            $$0.a($$3, N, $$6, $$7, $$4, $$5);
         }
      }
   }

   static enum b {
      a(
         aku.b("hud/heart/container"),
         aku.b("hud/heart/container_blinking"),
         aku.b("hud/heart/container"),
         aku.b("hud/heart/container_blinking"),
         aku.b("hud/heart/container_hardcore"),
         aku.b("hud/heart/container_hardcore_blinking"),
         aku.b("hud/heart/container_hardcore"),
         aku.b("hud/heart/container_hardcore_blinking")
      ),
      b(
         aku.b("hud/heart/full"),
         aku.b("hud/heart/full_blinking"),
         aku.b("hud/heart/half"),
         aku.b("hud/heart/half_blinking"),
         aku.b("hud/heart/hardcore_full"),
         aku.b("hud/heart/hardcore_full_blinking"),
         aku.b("hud/heart/hardcore_half"),
         aku.b("hud/heart/hardcore_half_blinking")
      ),
      c(
         aku.b("hud/heart/poisoned_full"),
         aku.b("hud/heart/poisoned_full_blinking"),
         aku.b("hud/heart/poisoned_half"),
         aku.b("hud/heart/poisoned_half_blinking"),
         aku.b("hud/heart/poisoned_hardcore_full"),
         aku.b("hud/heart/poisoned_hardcore_full_blinking"),
         aku.b("hud/heart/poisoned_hardcore_half"),
         aku.b("hud/heart/poisoned_hardcore_half_blinking")
      ),
      d(
         aku.b("hud/heart/withered_full"),
         aku.b("hud/heart/withered_full_blinking"),
         aku.b("hud/heart/withered_half"),
         aku.b("hud/heart/withered_half_blinking"),
         aku.b("hud/heart/withered_hardcore_full"),
         aku.b("hud/heart/withered_hardcore_full_blinking"),
         aku.b("hud/heart/withered_hardcore_half"),
         aku.b("hud/heart/withered_hardcore_half_blinking")
      ),
      e(
         aku.b("hud/heart/absorbing_full"),
         aku.b("hud/heart/absorbing_full_blinking"),
         aku.b("hud/heart/absorbing_half"),
         aku.b("hud/heart/absorbing_half_blinking"),
         aku.b("hud/heart/absorbing_hardcore_full"),
         aku.b("hud/heart/absorbing_hardcore_full_blinking"),
         aku.b("hud/heart/absorbing_hardcore_half"),
         aku.b("hud/heart/absorbing_hardcore_half_blinking")
      ),
      f(
         aku.b("hud/heart/frozen_full"),
         aku.b("hud/heart/frozen_full_blinking"),
         aku.b("hud/heart/frozen_half"),
         aku.b("hud/heart/frozen_half_blinking"),
         aku.b("hud/heart/frozen_hardcore_full"),
         aku.b("hud/heart/frozen_hardcore_full_blinking"),
         aku.b("hud/heart/frozen_hardcore_half"),
         aku.b("hud/heart/frozen_hardcore_half_blinking")
      );

      private final aku g;
      private final aku h;
      private final aku i;
      private final aku j;
      private final aku k;
      private final aku l;
      private final aku m;
      private final aku n;

      private b(final aku $$0, final aku $$1, final aku $$2, final aku $$3, final aku $$4, final aku $$5, final aku $$6, final aku $$7) {
         this.g = $$0;
         this.h = $$1;
         this.i = $$2;
         this.j = $$3;
         this.k = $$4;
         this.l = $$5;
         this.m = $$6;
         this.n = $$7;
      }

      public aku a(boolean $$0, boolean $$1, boolean $$2) {
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

      static foc.b a(cox $$0) {
         foc.b $$1;
         if ($$0.b(btr.s)) {
            $$1 = c;
         } else if ($$0.b(btr.t)) {
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
