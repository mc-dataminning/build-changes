import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.common.collect.Ordering;
import com.mojang.blaze3d.platform.GlStateManager;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.datafixers.util.Pair;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class esx {
   private static final afw b = new afw("hud/crosshair");
   private static final afw c = new afw("hud/crosshair_attack_indicator_full");
   private static final afw d = new afw("hud/crosshair_attack_indicator_background");
   private static final afw e = new afw("hud/crosshair_attack_indicator_progress");
   private static final afw f = new afw("hud/effect_background_ambient");
   private static final afw g = new afw("hud/effect_background");
   private static final afw h = new afw("hud/hotbar");
   private static final afw i = new afw("hud/hotbar_selection");
   private static final afw j = new afw("hud/hotbar_offhand_left");
   private static final afw k = new afw("hud/hotbar_offhand_right");
   private static final afw l = new afw("hud/hotbar_attack_indicator_background");
   private static final afw m = new afw("hud/hotbar_attack_indicator_progress");
   private static final afw n = new afw("hud/jump_bar_background");
   private static final afw o = new afw("hud/jump_bar_cooldown");
   private static final afw p = new afw("hud/jump_bar_progress");
   private static final afw q = new afw("hud/experience_bar_background");
   private static final afw r = new afw("hud/experience_bar_progress");
   private static final afw s = new afw("hud/armor_empty");
   private static final afw t = new afw("hud/armor_half");
   private static final afw u = new afw("hud/armor_full");
   private static final afw v = new afw("hud/food_empty_hunger");
   private static final afw w = new afw("hud/food_half_hunger");
   private static final afw x = new afw("hud/food_full_hunger");
   private static final afw y = new afw("hud/food_empty");
   private static final afw z = new afw("hud/food_half");
   private static final afw A = new afw("hud/food_full");
   private static final afw B = new afw("hud/air");
   private static final afw C = new afw("hud/air_bursting");
   private static final afw D = new afw("hud/heart/vehicle_container");
   private static final afw E = new afw("hud/heart/vehicle_full");
   private static final afw F = new afw("hud/heart/vehicle_half");
   private static final afw G = new afw("textures/misc/vignette.png");
   private static final afw H = new afw("textures/misc/pumpkinblur.png");
   private static final afw I = new afw("textures/misc/spyglass_scope.png");
   private static final afw J = new afw("textures/misc/powder_snow_outline.png");
   private static final ui K = ui.c("demo.demoExpired");
   private static final ui L = ui.c("menu.savingLevel");
   private static final int M = 16777215;
   private static final float N = 5.0F;
   private static final int O = 10;
   private static final int P = 10;
   private static final String Q = ": ";
   private static final float R = 0.2F;
   private static final int S = 9;
   private static final int T = 8;
   private static final float U = 0.2F;
   private final ate V = ate.a();
   private final ero W;
   private final fvb X;
   private final etk Y;
   private int Z;
   @Nullable
   private ui aa;
   private int ab;
   private boolean ac;
   private boolean ad;
   public float a = 1.0F;
   private int ae;
   private ckj af = ckj.b;
   private final etr ag;
   private final eur ah;
   private final evh ai;
   private final euk aj;
   private final eti ak;
   private int al;
   @Nullable
   private ui am;
   @Nullable
   private ui an;
   private int ao;
   private int ap;
   private int aq;
   private int ar;
   private int as;
   private long at;
   private long au;
   private int av;
   private int aw;
   private float ax;
   private float ay;
   private float az;

   public esx(ero $$0, fvb $$1) {
      this.W = $$0;
      this.X = $$1;
      this.ag = new etr($$0);
      this.ai = new evh($$0);
      this.Y = new etk($$0);
      this.aj = new euk($$0, this);
      this.ak = new eti($$0);
      this.ah = new eur($$0);
      this.a();
   }

   public void a() {
      this.ao = 10;
      this.ap = 70;
      this.aq = 20;
   }

   public void a(esy $$0, float $$1) {
      ell $$2 = this.W.aM();
      this.av = $$0.a();
      this.aw = $$0.b();
      esw $$3 = this.f();
      RenderSystem.enableBlend();
      if (ero.L()) {
         this.a($$0, this.W.am());
      } else {
         RenderSystem.enableDepthTest();
      }

      float $$4 = this.W.av();
      this.az = asy.i(0.5F * $$4, this.az, 1.125F);
      if (this.W.m.aw().a()) {
         if (this.W.s.gq()) {
            this.b($$0, this.az);
         } else {
            this.az = 0.5F;
            ckj $$5 = this.W.s.fS().e(3);
            if ($$5.a(cuc.ee.k())) {
               this.a($$0, H, 1.0F);
            }
         }
      }

      if (this.W.s.ci() > 0) {
         this.a($$0, J, this.W.s.cj());
      }

      float $$6 = asy.i($$1, this.W.s.cw, this.W.s.cv);
      if ($$6 > 0.0F && !this.W.s.a(bji.i)) {
         this.c($$0, $$6);
      }

      if (this.W.q.l() == cqw.d) {
         this.ai.a($$0);
      } else if (!this.W.m.Z) {
         this.a($$1, $$0);
      }

      if (!this.W.m.Z) {
         RenderSystem.enableBlend();
         this.d($$0);
         this.W.aG().a("bossHealth");
         this.ak.a($$0);
         this.W.aG().c();
         if (this.W.q.a()) {
            this.e($$0);
         }

         this.f($$0);
         RenderSystem.disableBlend();
         int $$7 = this.av / 2 - 91;
         bku $$8 = this.W.s.s();
         if ($$8 != null) {
            this.a($$8, $$0, $$7);
         } else if (this.W.q.e()) {
            this.a($$0, $$7);
         }

         if (this.W.q.l() != cqw.d) {
            this.b($$0);
         } else if (this.W.s.N_()) {
            this.ai.b($$0);
         }
      }

      if (this.W.s.fW() > 0) {
         this.W.aG().a("sleep");
         float $$9 = (float)this.W.s.fW();
         float $$10 = $$9 / 100.0F;
         if ($$10 > 1.0F) {
            $$10 = 1.0F - ($$9 - 100.0F) / 10.0F;
         }

         int $$11 = (int)(220.0F * $$10) << 24 | 1052704;
         $$0.a(fpj.D(), 0, 0, this.av, this.aw, $$11);
         this.W.aG().c();
      }

      if (this.W.I()) {
         this.c($$0);
      }

      this.a($$0);
      if (this.ag.d()) {
         this.ag.a($$0);
      }

      if (!this.W.m.Z) {
         if (this.aa != null && this.ab > 0) {
            this.W.aG().a("overlayMessage");
            float $$12 = (float)this.ab - $$1;
            int $$13 = (int)($$12 * 255.0F / 20.0F);
            if ($$13 > 255) {
               $$13 = 255;
            }

            if ($$13 > 8) {
               $$0.c().a();
               $$0.c().a((float)(this.av / 2), (float)(this.aw - 68), 0.0F);
               int $$14 = 16777215;
               if (this.ac) {
                  $$14 = asy.h($$12 / 50.0F, 0.7F, 0.6F) & 16777215;
               }

               int $$15 = $$13 << 24 & 0xFF000000;
               int $$16 = $$3.a(this.aa);
               this.a($$0, $$3, -4, $$16, 16777215 | $$15);
               $$0.b($$3, this.aa, -$$16 / 2, -4, $$14 | $$15);
               $$0.c().b();
            }

            this.W.aG().c();
         }

         if (this.am != null && this.al > 0) {
            this.W.aG().a("titleAndSubtitle");
            float $$17 = (float)this.al - $$1;
            int $$18 = 255;
            if (this.al > this.aq + this.ap) {
               float $$19 = (float)(this.ao + this.ap + this.aq) - $$17;
               $$18 = (int)($$19 * 255.0F / (float)this.ao);
            }

            if (this.al <= this.aq) {
               $$18 = (int)($$17 * 255.0F / (float)this.aq);
            }

            $$18 = asy.a($$18, 0, 255);
            if ($$18 > 8) {
               $$0.c().a();
               $$0.c().a((float)(this.av / 2), (float)(this.aw / 2), 0.0F);
               RenderSystem.enableBlend();
               $$0.c().a();
               $$0.c().b(4.0F, 4.0F, 4.0F);
               int $$20 = $$18 << 24 & 0xFF000000;
               int $$21 = $$3.a(this.am);
               this.a($$0, $$3, -10, $$21, 16777215 | $$20);
               $$0.b($$3, this.am, -$$21 / 2, -10, 16777215 | $$20);
               $$0.c().b();
               if (this.an != null) {
                  $$0.c().a();
                  $$0.c().b(2.0F, 2.0F, 2.0F);
                  int $$22 = $$3.a(this.an);
                  this.a($$0, $$3, 5, $$22, 16777215 | $$20);
                  $$0.b($$3, this.an, -$$22 / 2, 5, 16777215 | $$20);
                  $$0.c().b();
               }

               RenderSystem.disableBlend();
               $$0.c().b();
            }

            this.W.aG().c();
         }

         this.ah.a($$0);
         eje $$23 = this.W.r.I();
         ejb $$24 = null;
         ejc $$25 = $$23.g(this.W.s.cx());
         if ($$25 != null) {
            eja $$26 = eja.a($$25.n());
            if ($$26 != null) {
               $$24 = $$23.a($$26);
            }
         }

         ejb $$27 = $$24 != null ? $$24 : $$23.a(eja.b);
         if ($$27 != null) {
            this.a($$0, $$27);
         }

         RenderSystem.enableBlend();
         int $$28 = asy.a(this.W.n.e() * (double)$$2.o() / (double)$$2.m());
         int $$29 = asy.a(this.W.n.f() * (double)$$2.p() / (double)$$2.n());
         this.W.aG().a("chat");
         this.Y.a($$0, this.Z, $$28, $$29);
         this.W.aG().c();
         $$27 = $$23.a(eja.a);
         if (!this.W.m.L.e() || this.W.R() && this.W.s.cn.n().size() <= 1 && $$27 == null) {
            this.aj.a(false);
         } else {
            this.aj.a(true);
            this.aj.a($$0, this.av, $$23, $$27);
         }

         this.g($$0);
      }
   }

   private void a(esy $$0, esw $$1, int $$2, int $$3, int $$4) {
      int $$5 = this.W.m.b(0.0F);
      if ($$5 != 0) {
         int $$6 = -$$3 / 2;
         $$0.a($$6 - 2, $$2 - 2, $$6 + $$3 + 2, $$2 + 9 + 2, asi.b.a($$5, $$4));
      }
   }

   private void d(esy $$0) {
      ers $$1 = this.W.m;
      if ($$1.aw().a()) {
         if (this.W.q.l() != cqw.d || this.a(this.W.v)) {
            if (this.ag.d() && !this.W.s.gi() && !$$1.R().c()) {
               eqz $$2 = this.W.j.m();
               emh $$3 = RenderSystem.getModelViewStack();
               $$3.a();
               $$3.a($$0.c().c().a());
               $$3.a((float)(this.av / 2), (float)(this.aw / 2), 0.0F);
               $$3.a(a.a.rotationDegrees($$2.d()));
               $$3.a(a.d.rotationDegrees($$2.e()));
               $$3.b(-1.0F, -1.0F, -1.0F);
               RenderSystem.applyModelViewMatrix();
               RenderSystem.renderCrosshair(10);
               $$3.b();
               RenderSystem.applyModelViewMatrix();
            } else {
               RenderSystem.blendFuncSeparate(
                  GlStateManager.SourceFactor.ONE_MINUS_DST_COLOR,
                  GlStateManager.DestFactor.ONE_MINUS_SRC_COLOR,
                  GlStateManager.SourceFactor.ONE,
                  GlStateManager.DestFactor.ZERO
               );
               int $$4 = 15;
               $$0.a(b, (this.av - 15) / 2, (this.aw - 15) / 2, 15, 15);
               if (this.W.m.A().c() == eqy.b) {
                  float $$5 = this.W.s.B(0.0F);
                  boolean $$6 = false;
                  if (this.W.u != null && this.W.u instanceof bkj && $$5 >= 1.0F) {
                     $$6 = this.W.s.gl() > 5.0F;
                     $$6 &= this.W.u.bv();
                  }

                  int $$7 = this.aw / 2 - 7 + 16;
                  int $$8 = this.av / 2 - 8;
                  if ($$6) {
                     $$0.a(c, $$8, $$7, 16, 16);
                  } else if ($$5 < 1.0F) {
                     int $$9 = (int)($$5 * 17.0F);
                     $$0.a(d, $$8, $$7, 16, 4);
                     $$0.a(e, 16, 4, 0, 0, $$8, $$7, $$9, 4);
                  }
               }

               RenderSystem.defaultBlendFunc();
            }
         }
      }
   }

   private boolean a(eid $$0) {
      if ($$0 == null) {
         return false;
      } else if ($$0.c() == eid.a.c) {
         return ((eic)$$0).a() instanceof bie;
      } else if ($$0.c() == eid.a.b) {
         ht $$1 = ((eib)$$0).a();
         cqz $$2 = this.W.r;
         return $$2.a_($$1).b($$2, $$1) != null;
      } else {
         return false;
      }
   }

   protected void a(esy $$0) {
      Collection<bjg> $$1 = this.W.s.er();
      if (!$$1.isEmpty()) {
         if (this.W.y instanceof fat $$2 && $$2.G()) {
            return;
         }

         RenderSystem.enableBlend();
         int $$3 = 0;
         int $$4 = 0;
         gay $$5 = this.W.aE();
         List<Runnable> $$6 = Lists.newArrayListWithExpectedSize($$1.size());

         for (bjg $$7 : Ordering.natural().reverse().sortedCopy($$1)) {
            bje $$8 = $$7.c();
            if ($$7.h()) {
               int $$9 = this.av;
               int $$10 = 1;
               if (this.W.I()) {
                  $$10 += 15;
               }

               if ($$8.i()) {
                  $$3++;
                  $$9 -= 25 * $$3;
               } else {
                  $$4++;
                  $$9 -= 25 * $$4;
                  $$10 += 26;
               }

               float $$11 = 1.0F;
               if ($$7.f()) {
                  $$0.a(f, $$9, $$10, 24, 24);
               } else {
                  $$0.a(g, $$9, $$10, 24, 24);
                  if ($$7.a(200)) {
                     int $$12 = $$7.d();
                     int $$13 = 10 - $$12 / 20;
                     $$11 = asy.a((float)$$12 / 10.0F / 5.0F * 0.5F, 0.0F, 0.5F)
                        + asy.b((float)$$12 * (float) Math.PI / 5.0F) * asy.a((float)$$13 / 10.0F * 0.25F, 0.0F, 0.25F);
                  }
               }

               gaa $$14 = $$5.a($$8);
               int $$15 = $$9;
               int $$16 = $$10;
               float $$17 = $$11;
               $$6.add(() -> {
                  $$0.a(1.0F, 1.0F, 1.0F, $$17);
                  $$0.a($$15 + 3, $$16 + 3, 0, 18, 18, $$14);
                  $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
               });
            }
         }

         $$6.forEach(Runnable::run);
      }
   }

   private void a(float $$0, esy $$1) {
      ccx $$2 = this.m();
      if ($$2 != null) {
         ckj $$3 = $$2.eT();
         bkd $$4 = $$2.fm().e();
         int $$5 = this.av / 2;
         int $$6 = 182;
         int $$7 = 91;
         $$1.c().a();
         $$1.c().a(0.0F, 0.0F, -90.0F);
         $$1.a(h, $$5 - 91, this.aw - 22, 182, 22);
         $$1.a(i, $$5 - 91 - 1 + $$2.fS().l * 20, this.aw - 22 - 1, 24, 23);
         if (!$$3.b()) {
            if ($$4 == bkd.a) {
               $$1.a(j, $$5 - 91 - 29, this.aw - 23, 29, 24);
            } else {
               $$1.a(k, $$5 + 91, this.aw - 23, 29, 24);
            }
         }

         $$1.c().b();
         int $$8 = 1;

         for (int $$9 = 0; $$9 < 9; $$9++) {
            int $$10 = $$5 - 90 + $$9 * 20 + 2;
            int $$11 = this.aw - 16 - 3;
            this.a($$1, $$10, $$11, $$0, $$2, $$2.fS().i.get($$9), $$8++);
         }

         if (!$$3.b()) {
            int $$12 = this.aw - 16 - 3;
            if ($$4 == bkd.a) {
               this.a($$1, $$5 - 91 - 26, $$12, $$0, $$2, $$3, $$8++);
            } else {
               this.a($$1, $$5 + 91 + 10, $$12, $$0, $$2, $$3, $$8++);
            }
         }

         RenderSystem.enableBlend();
         if (this.W.m.A().c() == eqy.c) {
            float $$13 = this.W.s.B(0.0F);
            if ($$13 < 1.0F) {
               int $$14 = this.aw - 20;
               int $$15 = $$5 + 91 + 6;
               if ($$4 == bkd.b) {
                  $$15 = $$5 - 91 - 22;
               }

               int $$16 = (int)($$13 * 19.0F);
               $$1.a(l, $$15, $$14, 18, 18);
               $$1.a(m, 18, 18, 0, 18 - $$16, $$15, $$14 + 18 - $$16, 18, $$16);
            }
         }

         RenderSystem.disableBlend();
      }
   }

   public void a(bku $$0, esy $$1, int $$2) {
      this.W.aG().a("jumpBar");
      float $$3 = this.W.s.t();
      int $$4 = 182;
      int $$5 = (int)($$3 * 183.0F);
      int $$6 = this.aw - 32 + 3;
      $$1.a(n, $$2, $$6, 182, 5);
      if ($$0.ab_() > 0) {
         $$1.a(o, $$2, $$6, 182, 5);
      } else if ($$5 > 0) {
         $$1.a(p, 182, 5, 0, 0, $$2, $$6, $$5, 5);
      }

      this.W.aG().c();
   }

   public void a(esy $$0, int $$1) {
      this.W.aG().a("expBar");
      int $$2 = this.W.s.gb();
      if ($$2 > 0) {
         int $$3 = 182;
         int $$4 = (int)(this.W.s.ch * 183.0F);
         int $$5 = this.aw - 32 + 3;
         $$0.a(q, $$1, $$5, 182, 5);
         if ($$4 > 0) {
            $$0.a(r, 182, 5, 0, 0, $$1, $$5, $$4, 5);
         }
      }

      this.W.aG().c();
      if (this.W.s.cf > 0) {
         this.W.aG().a("expLevel");
         String $$6 = this.W.s.cf + "";
         int $$7 = (this.av - this.f().b($$6)) / 2;
         int $$8 = this.aw - 31 - 4;
         $$0.a(this.f(), $$6, $$7 + 1, $$8, 0, false);
         $$0.a(this.f(), $$6, $$7 - 1, $$8, 0, false);
         $$0.a(this.f(), $$6, $$7, $$8 + 1, 0, false);
         $$0.a(this.f(), $$6, $$7, $$8 - 1, 0, false);
         $$0.a(this.f(), $$6, $$7, $$8, 8453920, false);
         this.W.aG().c();
      }
   }

   public void b(esy $$0) {
      this.W.aG().a("selectedItemName");
      if (this.ae > 0 && !this.af.b()) {
         uw $$1 = ui.i().b(this.af.y()).a(this.af.C().e);
         if (this.af.A()) {
            $$1.a(n.u);
         }

         int $$2 = this.f().a($$1);
         int $$3 = (this.av - $$2) / 2;
         int $$4 = this.aw - 59;
         if (!this.W.q.a()) {
            $$4 += 14;
         }

         int $$5 = (int)((float)this.ae * 256.0F / 10.0F);
         if ($$5 > 255) {
            $$5 = 255;
         }

         if ($$5 > 0) {
            $$0.a($$3 - 2, $$4 - 2, $$3 + $$2 + 2, $$4 + 9 + 2, this.W.m.a(0));
            $$0.b(this.f(), $$1, $$3, $$4, 16777215 + ($$5 << 24));
         }
      }

      this.W.aG().c();
   }

   public void c(esy $$0) {
      this.W.aG().a("demo");
      ui $$1;
      if (this.W.r.V() >= 120500L) {
         $$1 = K;
      } else {
         $$1 = ui.a("demo.remainingTime", ats.a((int)(120500L - this.W.r.V())));
      }

      int $$3 = this.f().a($$1);
      $$0.b(this.f(), $$1, this.av - $$3 - 10, 5, 16777215);
      this.W.aG().c();
   }

   private void a(esy $$0, ejb $$1) {
      eje $$2 = $$1.a();
      Collection<ejd> $$3 = $$2.i($$1);
      List<ejd> $$4 = $$3.stream().filter($$0x -> $$0x.e() != null && !$$0x.e().startsWith("#")).collect(Collectors.toList());
      if ($$4.size() > 15) {
         $$3 = Lists.newArrayList(Iterables.skip($$4, $$3.size() - 15));
      } else {
         $$3 = $$4;
      }

      List<Pair<ejd, ui>> $$5 = Lists.newArrayListWithCapacity($$3.size());
      ui $$6 = $$1.d();
      int $$7 = this.f().a($$6);
      int $$8 = $$7;
      int $$9 = this.f().b(": ");

      for (ejd $$10 : $$3) {
         ejc $$11 = $$2.g($$10.e());
         ui $$12 = ejc.a($$11, ui.b($$10.e()));
         $$5.add(Pair.of($$10, $$12));
         $$8 = Math.max($$8, this.f().a($$12) + $$9 + this.f().b(Integer.toString($$10.b())));
      }

      int $$13 = $$3.size() * 9;
      int $$14 = this.aw / 2 + $$13 / 3;
      int $$15 = 3;
      int $$16 = this.av - $$8 - 3;
      int $$17 = 0;
      int $$18 = this.W.m.b(0.3F);
      int $$19 = this.W.m.b(0.4F);

      for (Pair<ejd, ui> $$20 : $$5) {
         $$17++;
         ejd $$21 = (ejd)$$20.getFirst();
         ui $$22 = (ui)$$20.getSecond();
         String $$23 = "" + n.m + $$21.b();
         int $$25 = $$14 - $$17 * 9;
         int $$26 = this.av - 3 + 2;
         $$0.a($$16 - 2, $$25, $$26, $$25 + 9, $$18);
         $$0.a(this.f(), $$22, $$16, $$25, -1, false);
         $$0.a(this.f(), $$23, $$26 - this.f().b($$23), $$25, -1, false);
         if ($$17 == $$3.size()) {
            $$0.a($$16 - 2, $$25 - 9 - 1, $$26, $$25 - 1, $$19);
            $$0.a($$16 - 2, $$25 - 1, $$26, $$25, $$18);
            $$0.a(this.f(), $$6, $$16 + $$8 / 2 - $$7 / 2, $$25 - 9, -1, false);
         }
      }
   }

   private ccx m() {
      return !(this.W.am() instanceof ccx) ? null : (ccx)this.W.am();
   }

   private bkj n() {
      ccx $$0 = this.m();
      if ($$0 != null) {
         bjt $$1 = $$0.cY();
         if ($$1 == null) {
            return null;
         }

         if ($$1 instanceof bkj) {
            return (bkj)$$1;
         }
      }

      return null;
   }

   private int a(bkj $$0) {
      if ($$0 != null && $$0.bz()) {
         float $$1 = $$0.eL();
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

   private void e(esy $$0) {
      ccx $$1 = this.m();
      if ($$1 != null) {
         int $$2 = asy.f($$1.eu());
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
         this.V.b((long)(this.Z * 312871));
         cfl $$6 = $$1.gc();
         int $$7 = $$6.a();
         int $$8 = this.av / 2 - 91;
         int $$9 = this.av / 2 + 91;
         int $$10 = this.aw - 39;
         float $$11 = Math.max((float)$$1.b(blp.l), (float)Math.max($$5, $$2));
         int $$12 = asy.f($$1.fk());
         int $$13 = asy.f(($$11 + (float)$$12) / 2.0F / 10.0F);
         int $$14 = Math.max(10 - ($$13 - 2), 3);
         int $$15 = $$10 - ($$13 - 1) * $$14 - 10;
         int $$16 = $$10 - 10;
         int $$17 = $$1.eI();
         int $$18 = -1;
         if ($$1.a(bji.j)) {
            $$18 = this.Z % asy.f($$11 + 5.0F);
         }

         this.W.aG().a("armor");

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

         this.W.aG().b("health");
         this.a($$0, $$1, $$8, $$10, $$14, $$18, $$11, $$2, $$5, $$12, $$3);
         bkj $$21 = this.n();
         int $$22 = this.a($$21);
         if ($$22 == 0) {
            this.W.aG().b("food");

            for (int $$23 = 0; $$23 < 10; $$23++) {
               int $$24 = $$10;
               afw $$25;
               afw $$26;
               afw $$27;
               if ($$1.a(bji.q)) {
                  $$25 = v;
                  $$26 = w;
                  $$27 = x;
               } else {
                  $$25 = y;
                  $$26 = z;
                  $$27 = A;
               }

               if ($$1.gc().e() <= 0.0F && this.Z % ($$7 * 3 + 1) == 0) {
                  $$24 = $$10 + (this.V.a(3) - 1);
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

         this.W.aG().b("air");
         int $$32 = $$1.cg();
         int $$33 = Math.min($$1.ch(), $$32);
         if ($$1.a(aqx.a) || $$33 < $$32) {
            int $$34 = this.a($$22) - 1;
            $$16 -= $$34 * 10;
            int $$35 = asy.c((double)($$33 - 2) * 10.0 / (double)$$32);
            int $$36 = asy.c((double)$$33 * 10.0 / (double)$$32) - $$35;

            for (int $$37 = 0; $$37 < $$35 + $$36; $$37++) {
               if ($$37 < $$35) {
                  $$0.a(B, $$9 - $$37 * 8 - 9, $$16, 9, 9);
               } else {
                  $$0.a(C, $$9 - $$37 * 8 - 9, $$16, 9, 9);
               }
            }
         }

         this.W.aG().c();
      }
   }

   private void a(esy $$0, ccx $$1, int $$2, int $$3, int $$4, int $$5, float $$6, int $$7, int $$8, int $$9, boolean $$10) {
      esx.a $$11 = esx.a.a($$1);
      boolean $$12 = $$1.dL().A_().n();
      int $$13 = asy.c((double)$$6 / 2.0);
      int $$14 = asy.c((double)$$9 / 2.0);
      int $$15 = $$13 * 2;

      for (int $$16 = $$13 + $$14 - 1; $$16 >= 0; $$16--) {
         int $$17 = $$16 / 10;
         int $$18 = $$16 % 10;
         int $$19 = $$2 + $$18 * 8;
         int $$20 = $$3 - $$17 * $$4;
         if ($$7 + $$9 <= 4) {
            $$20 += this.V.a(2);
         }

         if ($$16 < $$13 && $$16 == $$5) {
            $$20 -= 2;
         }

         this.a($$0, esx.a.a, $$19, $$20, $$12, $$10, false);
         int $$21 = $$16 * 2;
         boolean $$22 = $$16 >= $$13;
         if ($$22) {
            int $$23 = $$21 - $$15;
            if ($$23 < $$9) {
               boolean $$24 = $$23 + 1 == $$9;
               this.a($$0, $$11 == esx.a.d ? $$11 : esx.a.e, $$19, $$20, $$12, false, $$24);
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

   private void a(esy $$0, esx.a $$1, int $$2, int $$3, boolean $$4, boolean $$5, boolean $$6) {
      $$0.a($$1.a($$4, $$6, $$5), $$2, $$3, 9, 9);
   }

   private void f(esy $$0) {
      bkj $$1 = this.n();
      if ($$1 != null) {
         int $$2 = this.a($$1);
         if ($$2 != 0) {
            int $$3 = (int)Math.ceil((double)$$1.eu());
            this.W.aG().b("mountHealth");
            int $$4 = this.aw - 39;
            int $$5 = this.av / 2 + 91;
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

   private void a(esy $$0, afw $$1, float $$2) {
      RenderSystem.disableDepthTest();
      RenderSystem.depthMask(false);
      $$0.a(1.0F, 1.0F, 1.0F, $$2);
      $$0.a($$1, 0, 0, -90, 0.0F, 0.0F, this.av, this.aw, this.av, this.aw);
      RenderSystem.depthMask(true);
      RenderSystem.enableDepthTest();
      $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
   }

   private void b(esy $$0, float $$1) {
      float $$2 = (float)Math.min(this.av, this.aw);
      float $$4 = Math.min((float)this.av / $$2, (float)this.aw / $$2) * $$1;
      int $$5 = asy.d($$2 * $$4);
      int $$6 = asy.d($$2 * $$4);
      int $$7 = (this.av - $$5) / 2;
      int $$8 = (this.aw - $$6) / 2;
      int $$9 = $$7 + $$5;
      int $$10 = $$8 + $$6;
      $$0.a(I, $$7, $$8, -90, 0.0F, 0.0F, $$5, $$6, $$5, $$6);
      $$0.a(fpj.D(), 0, $$10, this.av, this.aw, -90, -16777216);
      $$0.a(fpj.D(), 0, 0, this.av, $$8, -90, -16777216);
      $$0.a(fpj.D(), 0, $$8, $$7, $$10, -90, -16777216);
      $$0.a(fpj.D(), $$9, $$8, this.av, $$10, -90, -16777216);
   }

   private void a(bjt $$0) {
      if ($$0 != null) {
         ht $$1 = ht.a($$0.dq(), $$0.du(), $$0.dw());
         float $$2 = fpa.a($$0.dL().D_(), $$0.dL().z($$1));
         float $$3 = asy.a(1.0F - $$2, 0.0F, 1.0F);
         this.a = this.a + ($$3 - this.a) * 0.01F;
      }
   }

   private void a(esy $$0, bjt $$1) {
      dhs $$2 = this.W.r.C_();
      float $$3 = (float)$$2.a($$1);
      double $$4 = Math.min($$2.p() * (double)$$2.q() * 1000.0, Math.abs($$2.k() - $$2.i()));
      double $$5 = Math.max((double)$$2.r(), $$4);
      if ((double)$$3 < $$5) {
         $$3 = 1.0F - (float)((double)$$3 / $$5);
      } else {
         $$3 = 0.0F;
      }

      RenderSystem.disableDepthTest();
      RenderSystem.depthMask(false);
      RenderSystem.blendFuncSeparate(
         GlStateManager.SourceFactor.ZERO, GlStateManager.DestFactor.ONE_MINUS_SRC_COLOR, GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO
      );
      if ($$3 > 0.0F) {
         $$3 = asy.a($$3, 0.0F, 1.0F);
         $$0.a(0.0F, $$3, $$3, 1.0F);
      } else {
         float $$6 = this.a;
         $$6 = asy.a($$6, 0.0F, 1.0F);
         $$0.a($$6, $$6, $$6, 1.0F);
      }

      $$0.a(G, 0, 0, -90, 0.0F, 0.0F, this.av, this.aw, this.av, this.aw);
      RenderSystem.depthMask(true);
      RenderSystem.enableDepthTest();
      $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
      RenderSystem.defaultBlendFunc();
   }

   private void c(esy $$0, float $$1) {
      if ($$1 < 1.0F) {
         $$1 *= $$1;
         $$1 *= $$1;
         $$1 = $$1 * 0.8F + 0.2F;
      }

      RenderSystem.disableDepthTest();
      RenderSystem.depthMask(false);
      $$0.a(1.0F, 1.0F, 1.0F, $$1);
      gaa $$2 = this.W.an().a().a(cuc.ed.o());
      $$0.a(0, 0, -90, this.av, this.aw, $$2);
      RenderSystem.depthMask(true);
      RenderSystem.enableDepthTest();
      $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
   }

   private void a(esy $$0, int $$1, int $$2, float $$3, ccx $$4, ckj $$5, int $$6) {
      if (!$$5.b()) {
         float $$7 = (float)$$5.K() - $$3;
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

         $$0.a(this.W.h, $$5, $$1, $$2);
      }
   }

   public void a(boolean $$0) {
      this.p();
      if (!$$0) {
         this.o();
      }
   }

   private void o() {
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
      bjt $$0 = this.W.am();
      if ($$0 != null) {
         this.a($$0);
      }

      if (this.W.s != null) {
         ckj $$1 = this.W.s.fS().f();
         if ($$1.b()) {
            this.ae = 0;
         } else if (this.af.b() || !$$1.a(this.af.d()) || !$$1.y().equals(this.af.y())) {
            this.ae = (int)(40.0 * this.W.m.y().c());
         } else if (this.ae > 0) {
            this.ae--;
         }

         this.af = $$1;
      }

      this.Y.a();
   }

   private void p() {
      MinecraftServer $$0 = this.W.T();
      boolean $$1 = $$0 != null && $$0.aY();
      this.ay = this.ax;
      this.ax = asy.i(0.2F, this.ax, $$1 ? 1.0F : 0.0F);
   }

   public void a(ui $$0) {
      ui $$1 = ui.a("record.nowPlaying", $$0);
      this.a($$1, true);
      this.W.aV().c($$1);
   }

   public void a(ui $$0, boolean $$1) {
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

   public void b(ui $$0) {
      this.an = $$0;
   }

   public void c(ui $$0) {
      this.am = $$0;
      this.al = this.ao + this.ap + this.aq;
   }

   public void c() {
      this.am = null;
      this.an = null;
      this.al = 0;
   }

   public etk d() {
      return this.Y;
   }

   public int e() {
      return this.Z;
   }

   public esw f() {
      return this.W.h;
   }

   public evh g() {
      return this.ai;
   }

   public euk h() {
      return this.aj;
   }

   public void i() {
      this.aj.a();
      this.ak.a();
      this.W.ay().a();
      this.ag.m();
      this.Y.a(true);
   }

   public eti j() {
      return this.ak;
   }

   public etr k() {
      return this.ag;
   }

   public void l() {
      this.ag.a();
   }

   private void g(esy $$0) {
      if (this.W.m.ab().c() && (this.ax > 0.0F || this.ay > 0.0F)) {
         int $$1 = asy.d(255.0F * asy.a(asy.i(this.W.as(), this.ay, this.ax), 0.0F, 1.0F));
         if ($$1 > 8) {
            esw $$2 = this.f();
            int $$3 = $$2.a(L);
            int $$4 = 16777215 | $$1 << 24 & 0xFF000000;
            $$0.b($$2, L, this.av - $$3 - 10, this.aw - 15, $$4);
         }
      }
   }

   static enum a {
      a(
         new afw("hud/heart/container"),
         new afw("hud/heart/container_blinking"),
         new afw("hud/heart/container"),
         new afw("hud/heart/container_blinking"),
         new afw("hud/heart/container_hardcore"),
         new afw("hud/heart/container_hardcore_blinking"),
         new afw("hud/heart/container_hardcore"),
         new afw("hud/heart/container_hardcore_blinking")
      ),
      b(
         new afw("hud/heart/full"),
         new afw("hud/heart/full_blinking"),
         new afw("hud/heart/half"),
         new afw("hud/heart/half_blinking"),
         new afw("hud/heart/hardcore_full"),
         new afw("hud/heart/hardcore_full_blinking"),
         new afw("hud/heart/hardcore_half"),
         new afw("hud/heart/hardcore_half_blinking")
      ),
      c(
         new afw("hud/heart/poisoned_full"),
         new afw("hud/heart/poisoned_full_blinking"),
         new afw("hud/heart/poisoned_half"),
         new afw("hud/heart/poisoned_half_blinking"),
         new afw("hud/heart/poisoned_hardcore_full"),
         new afw("hud/heart/poisoned_hardcore_full_blinking"),
         new afw("hud/heart/poisoned_hardcore_half"),
         new afw("hud/heart/poisoned_hardcore_half_blinking")
      ),
      d(
         new afw("hud/heart/withered_full"),
         new afw("hud/heart/withered_full_blinking"),
         new afw("hud/heart/withered_half"),
         new afw("hud/heart/withered_half_blinking"),
         new afw("hud/heart/withered_hardcore_full"),
         new afw("hud/heart/withered_hardcore_full_blinking"),
         new afw("hud/heart/withered_hardcore_half"),
         new afw("hud/heart/withered_hardcore_half_blinking")
      ),
      e(
         new afw("hud/heart/absorbing_full"),
         new afw("hud/heart/absorbing_full_blinking"),
         new afw("hud/heart/absorbing_half"),
         new afw("hud/heart/absorbing_half_blinking"),
         new afw("hud/heart/absorbing_hardcore_full"),
         new afw("hud/heart/absorbing_hardcore_full_blinking"),
         new afw("hud/heart/absorbing_hardcore_half"),
         new afw("hud/heart/absorbing_hardcore_half_blinking")
      ),
      f(
         new afw("hud/heart/frozen_full"),
         new afw("hud/heart/frozen_full_blinking"),
         new afw("hud/heart/frozen_half"),
         new afw("hud/heart/frozen_half_blinking"),
         new afw("hud/heart/frozen_hardcore_full"),
         new afw("hud/heart/frozen_hardcore_full_blinking"),
         new afw("hud/heart/frozen_hardcore_half"),
         new afw("hud/heart/frozen_hardcore_half_blinking")
      );

      private final afw g;
      private final afw h;
      private final afw i;
      private final afw j;
      private final afw k;
      private final afw l;
      private final afw m;
      private final afw n;

      private a(afw $$0, afw $$1, afw $$2, afw $$3, afw $$4, afw $$5, afw $$6, afw $$7) {
         this.g = $$0;
         this.h = $$1;
         this.i = $$2;
         this.j = $$3;
         this.k = $$4;
         this.l = $$5;
         this.m = $$6;
         this.n = $$7;
      }

      public afw a(boolean $$0, boolean $$1, boolean $$2) {
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

      static esx.a a(ccx $$0) {
         esx.a $$1;
         if ($$0.a(bji.s)) {
            $$1 = c;
         } else if ($$0.a(bji.t)) {
            $$1 = d;
         } else if ($$0.ck()) {
            $$1 = f;
         } else {
            $$1 = b;
         }

         return $$1;
      }
   }
}
