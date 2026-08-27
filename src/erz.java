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

public class erz {
   private static final aeu b = new aeu("hud/crosshair");
   private static final aeu c = new aeu("hud/crosshair_attack_indicator_full");
   private static final aeu d = new aeu("hud/crosshair_attack_indicator_background");
   private static final aeu e = new aeu("hud/crosshair_attack_indicator_progress");
   private static final aeu f = new aeu("hud/effect_background_ambient");
   private static final aeu g = new aeu("hud/effect_background");
   private static final aeu h = new aeu("hud/hotbar");
   private static final aeu i = new aeu("hud/hotbar_selection");
   private static final aeu j = new aeu("hud/hotbar_offhand_left");
   private static final aeu k = new aeu("hud/hotbar_offhand_right");
   private static final aeu l = new aeu("hud/hotbar_attack_indicator_background");
   private static final aeu m = new aeu("hud/hotbar_attack_indicator_progress");
   private static final aeu n = new aeu("hud/jump_bar_background");
   private static final aeu o = new aeu("hud/jump_bar_cooldown");
   private static final aeu p = new aeu("hud/jump_bar_progress");
   private static final aeu q = new aeu("hud/experience_bar_background");
   private static final aeu r = new aeu("hud/experience_bar_progress");
   private static final aeu s = new aeu("hud/armor_empty");
   private static final aeu t = new aeu("hud/armor_half");
   private static final aeu u = new aeu("hud/armor_full");
   private static final aeu v = new aeu("hud/food_empty_hunger");
   private static final aeu w = new aeu("hud/food_half_hunger");
   private static final aeu x = new aeu("hud/food_full_hunger");
   private static final aeu y = new aeu("hud/food_empty");
   private static final aeu z = new aeu("hud/food_half");
   private static final aeu A = new aeu("hud/food_full");
   private static final aeu B = new aeu("hud/air");
   private static final aeu C = new aeu("hud/air_bursting");
   private static final aeu D = new aeu("hud/heart/vehicle_container");
   private static final aeu E = new aeu("hud/heart/vehicle_full");
   private static final aeu F = new aeu("hud/heart/vehicle_half");
   private static final aeu G = new aeu("textures/misc/vignette.png");
   private static final aeu H = new aeu("textures/misc/pumpkinblur.png");
   private static final aeu I = new aeu("textures/misc/spyglass_scope.png");
   private static final aeu J = new aeu("textures/misc/powder_snow_outline.png");
   private static final ti K = ti.c("demo.demoExpired");
   private static final ti L = ti.c("menu.savingLevel");
   private static final int M = 16777215;
   private static final float N = 5.0F;
   private static final int O = 10;
   private static final int P = 10;
   private static final String Q = ": ";
   private static final float R = 0.2F;
   private static final int S = 9;
   private static final int T = 8;
   private static final float U = 0.2F;
   private final arx V = arx.a();
   private final eqq W;
   private final fua X;
   private final esm Y;
   private int Z;
   @Nullable
   private ti aa;
   private int ab;
   private boolean ac;
   private boolean ad;
   public float a = 1.0F;
   private int ae;
   private cja af = cja.b;
   private final est ag;
   private final ets ah;
   private final eui ai;
   private final etm aj;
   private final esk ak;
   private int al;
   @Nullable
   private ti am;
   @Nullable
   private ti an;
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

   public erz(eqq $$0, fua $$1) {
      this.W = $$0;
      this.X = $$1;
      this.ag = new est($$0);
      this.ai = new eui($$0);
      this.Y = new esm($$0);
      this.aj = new etm($$0, this);
      this.ak = new esk($$0);
      this.ah = new ets($$0);
      this.a();
   }

   public void a() {
      this.ao = 10;
      this.ap = 70;
      this.aq = 20;
   }

   public void a(esa $$0, float $$1) {
      eko $$2 = this.W.aM();
      this.av = $$0.a();
      this.aw = $$0.b();
      ery $$3 = this.f();
      RenderSystem.enableBlend();
      if (eqq.L()) {
         this.a($$0, this.W.am());
      } else {
         RenderSystem.enableDepthTest();
      }

      float $$4 = this.W.av();
      this.az = ars.i(0.5F * $$4, this.az, 1.125F);
      if (this.W.m.av().a()) {
         if (this.W.s.go()) {
            this.b($$0, this.az);
         } else {
            this.az = 0.5F;
            cja $$5 = this.W.s.fQ().e(3);
            if ($$5.a(csr.ef.k())) {
               this.a($$0, H, 1.0F);
            }
         }
      }

      if (this.W.s.ci() > 0) {
         this.a($$0, J, this.W.s.cj());
      }

      float $$6 = ars.i($$1, this.W.s.cu, this.W.s.ct);
      if ($$6 > 0.0F && !this.W.s.a(bia.i)) {
         this.c($$0, $$6);
      }

      if (this.W.q.l() == cpn.d) {
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
         bjm $$8 = this.W.s.p();
         if ($$8 != null) {
            this.a($$8, $$0, $$7);
         } else if (this.W.q.e()) {
            this.a($$0, $$7);
         }

         if (this.W.q.l() != cpn.d) {
            this.b($$0);
         } else if (this.W.s.G_()) {
            this.ai.b($$0);
         }
      }

      if (this.W.s.fU() > 0) {
         this.W.aG().a("sleep");
         float $$9 = (float)this.W.s.fU();
         float $$10 = $$9 / 100.0F;
         if ($$10 > 1.0F) {
            $$10 = 1.0F - ($$9 - 100.0F) / 10.0F;
         }

         int $$11 = (int)(220.0F * $$10) << 24 | 1052704;
         $$0.a(foh.D(), 0, 0, this.av, this.aw, $$11);
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
                  $$14 = ars.h($$12 / 50.0F, 0.7F, 0.6F) & 16777215;
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

            $$18 = ars.a($$18, 0, 255);
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
         eih $$23 = this.W.r.I();
         eie $$24 = null;
         eif $$25 = $$23.g(this.W.s.cx());
         if ($$25 != null) {
            eid $$26 = eid.a($$25.n());
            if ($$26 != null) {
               $$24 = $$23.a($$26);
            }
         }

         eie $$27 = $$24 != null ? $$24 : $$23.a(eid.b);
         if ($$27 != null) {
            this.a($$0, $$27);
         }

         RenderSystem.enableBlend();
         int $$28 = ars.a(this.W.n.e() * (double)$$2.o() / (double)$$2.m());
         int $$29 = ars.a(this.W.n.f() * (double)$$2.p() / (double)$$2.n());
         this.W.aG().a("chat");
         this.Y.a($$0, this.Z, $$28, $$29);
         this.W.aG().c();
         $$27 = $$23.a(eid.a);
         if (!this.W.m.L.e() || this.W.R() && this.W.s.cl.m().size() <= 1 && $$27 == null) {
            this.aj.a(false);
         } else {
            this.aj.a(true);
            this.aj.a($$0, this.av, $$23, $$27);
         }

         this.g($$0);
      }
   }

   private void a(esa $$0, ery $$1, int $$2, int $$3, int $$4) {
      int $$5 = this.W.m.b(0.0F);
      if ($$5 != 0) {
         int $$6 = -$$3 / 2;
         $$0.a($$6 - 2, $$2 - 2, $$6 + $$3 + 2, $$2 + 9 + 2, ard.b.a($$5, $$4));
      }
   }

   private void d(esa $$0) {
      equ $$1 = this.W.m;
      if ($$1.av().a()) {
         if (this.W.q.l() != cpn.d || this.a(this.W.v)) {
            if (this.ag.d() && !this.W.s.gg() && !$$1.R().c()) {
               eqb $$2 = this.W.j.m();
               elk $$3 = RenderSystem.getModelViewStack();
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
               if (this.W.m.A().c() == eqa.b) {
                  float $$5 = this.W.s.B(0.0F);
                  boolean $$6 = false;
                  if (this.W.u != null && this.W.u instanceof bjb && $$5 >= 1.0F) {
                     $$6 = this.W.s.gj() > 5.0F;
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

   private boolean a(ehg $$0) {
      if ($$0 == null) {
         return false;
      } else if ($$0.c() == ehg.a.c) {
         return ((ehf)$$0).a() instanceof bgw;
      } else if ($$0.c() == ehg.a.b) {
         gw $$1 = ((ehe)$$0).a();
         cpq $$2 = this.W.r;
         return $$2.a_($$1).b($$2, $$1) != null;
      } else {
         return false;
      }
   }

   protected void a(esa $$0) {
      Collection<bhy> $$1 = this.W.s.eq();
      if (!$$1.isEmpty()) {
         if (this.W.y instanceof ezu $$2 && $$2.G()) {
            return;
         }

         RenderSystem.enableBlend();
         int $$3 = 0;
         int $$4 = 0;
         fzx $$5 = this.W.aE();
         List<Runnable> $$6 = Lists.newArrayListWithExpectedSize($$1.size());

         for (bhy $$7 : Ordering.natural().reverse().sortedCopy($$1)) {
            bhw $$8 = $$7.c();
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
                     $$11 = ars.a((float)$$12 / 10.0F / 5.0F * 0.5F, 0.0F, 0.5F)
                        + ars.b((float)$$12 * (float) Math.PI / 5.0F) * ars.a((float)$$13 / 10.0F * 0.25F, 0.0F, 0.25F);
                  }
               }

               fyz $$14 = $$5.a($$8);
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

   private void a(float $$0, esa $$1) {
      cbp $$2 = this.m();
      if ($$2 != null) {
         cja $$3 = $$2.eS();
         biv $$4 = $$2.fk().e();
         int $$5 = this.av / 2;
         int $$6 = 182;
         int $$7 = 91;
         $$1.c().a();
         $$1.c().a(0.0F, 0.0F, -90.0F);
         $$1.a(h, $$5 - 91, this.aw - 22, 182, 22);
         $$1.a(i, $$5 - 91 - 1 + $$2.fQ().l * 20, this.aw - 22 - 1, 24, 23);
         if (!$$3.b()) {
            if ($$4 == biv.a) {
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
            this.a($$1, $$10, $$11, $$0, $$2, $$2.fQ().i.get($$9), $$8++);
         }

         if (!$$3.b()) {
            int $$12 = this.aw - 16 - 3;
            if ($$4 == biv.a) {
               this.a($$1, $$5 - 91 - 26, $$12, $$0, $$2, $$3, $$8++);
            } else {
               this.a($$1, $$5 + 91 + 10, $$12, $$0, $$2, $$3, $$8++);
            }
         }

         RenderSystem.enableBlend();
         if (this.W.m.A().c() == eqa.c) {
            float $$13 = this.W.s.B(0.0F);
            if ($$13 < 1.0F) {
               int $$14 = this.aw - 20;
               int $$15 = $$5 + 91 + 6;
               if ($$4 == biv.b) {
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

   public void a(bjm $$0, esa $$1, int $$2) {
      this.W.aG().a("jumpBar");
      float $$3 = this.W.s.s();
      int $$4 = 182;
      int $$5 = (int)($$3 * 183.0F);
      int $$6 = this.aw - 32 + 3;
      $$1.a(n, $$2, $$6, 182, 5);
      if ($$0.V_() > 0) {
         $$1.a(o, $$2, $$6, 182, 5);
      } else if ($$5 > 0) {
         $$1.a(p, 182, 5, 0, 0, $$2, $$6, $$5, 5);
      }

      this.W.aG().c();
   }

   public void a(esa $$0, int $$1) {
      this.W.aG().a("expBar");
      int $$2 = this.W.s.fZ();
      if ($$2 > 0) {
         int $$3 = 182;
         int $$4 = (int)(this.W.s.cf * 183.0F);
         int $$5 = this.aw - 32 + 3;
         $$0.a(q, $$1, $$5, 182, 5);
         if ($$4 > 0) {
            $$0.a(r, 182, 5, 0, 0, $$1, $$5, $$4, 5);
         }
      }

      this.W.aG().c();
      if (this.W.s.cd > 0) {
         this.W.aG().a("expLevel");
         String $$6 = this.W.s.cd + "";
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

   public void b(esa $$0) {
      this.W.aG().a("selectedItemName");
      if (this.ae > 0 && !this.af.b()) {
         tv $$1 = ti.h().b(this.af.y()).a(this.af.C().e);
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

   public void c(esa $$0) {
      this.W.aG().a("demo");
      ti $$1;
      if (this.W.r.V() >= 120500L) {
         $$1 = K;
      } else {
         $$1 = ti.a("demo.remainingTime", asl.a((int)(120500L - this.W.r.V())));
      }

      int $$3 = this.f().a($$1);
      $$0.b(this.f(), $$1, this.av - $$3 - 10, 5, 16777215);
      this.W.aG().c();
   }

   private void a(esa $$0, eie $$1) {
      eih $$2 = $$1.a();
      Collection<eig> $$3 = $$2.i($$1);
      List<eig> $$4 = $$3.stream().filter($$0x -> $$0x.e() != null && !$$0x.e().startsWith("#")).collect(Collectors.toList());
      if ($$4.size() > 15) {
         $$3 = Lists.newArrayList(Iterables.skip($$4, $$3.size() - 15));
      } else {
         $$3 = $$4;
      }

      List<Pair<eig, ti>> $$5 = Lists.newArrayListWithCapacity($$3.size());
      ti $$6 = $$1.d();
      int $$7 = this.f().a($$6);
      int $$8 = $$7;
      int $$9 = this.f().b(": ");

      for (eig $$10 : $$3) {
         eif $$11 = $$2.g($$10.e());
         ti $$12 = eif.a($$11, ti.b($$10.e()));
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

      for (Pair<eig, ti> $$20 : $$5) {
         $$17++;
         eig $$21 = (eig)$$20.getFirst();
         ti $$22 = (ti)$$20.getSecond();
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

   private cbp m() {
      return !(this.W.am() instanceof cbp) ? null : (cbp)this.W.am();
   }

   private bjb n() {
      cbp $$0 = this.m();
      if ($$0 != null) {
         bil $$1 = $$0.cY();
         if ($$1 == null) {
            return null;
         }

         if ($$1 instanceof bjb) {
            return (bjb)$$1;
         }
      }

      return null;
   }

   private int a(bjb $$0) {
      if ($$0 != null && $$0.bz()) {
         float $$1 = $$0.eK();
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

   private void e(esa $$0) {
      cbp $$1 = this.m();
      if ($$1 != null) {
         int $$2 = ars.f($$1.et());
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
         cec $$6 = $$1.ga();
         int $$7 = $$6.a();
         int $$8 = this.av / 2 - 91;
         int $$9 = this.av / 2 + 91;
         int $$10 = this.aw - 39;
         float $$11 = Math.max((float)$$1.b(bkh.a), (float)Math.max($$5, $$2));
         int $$12 = ars.f($$1.fi());
         int $$13 = ars.f(($$11 + (float)$$12) / 2.0F / 10.0F);
         int $$14 = Math.max(10 - ($$13 - 2), 3);
         int $$15 = $$10 - ($$13 - 1) * $$14 - 10;
         int $$16 = $$10 - 10;
         int $$17 = $$1.eH();
         int $$18 = -1;
         if ($$1.a(bia.j)) {
            $$18 = this.Z % ars.f($$11 + 5.0F);
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
         bjb $$21 = this.n();
         int $$22 = this.a($$21);
         if ($$22 == 0) {
            this.W.aG().b("food");

            for (int $$23 = 0; $$23 < 10; $$23++) {
               int $$24 = $$10;
               aeu $$25;
               aeu $$26;
               aeu $$27;
               if ($$1.a(bia.q)) {
                  $$25 = v;
                  $$26 = w;
                  $$27 = x;
               } else {
                  $$25 = y;
                  $$26 = z;
                  $$27 = A;
               }

               if ($$1.ga().e() <= 0.0F && this.Z % ($$7 * 3 + 1) == 0) {
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
         if ($$1.a(apt.a) || $$33 < $$32) {
            int $$34 = this.a($$22) - 1;
            $$16 -= $$34 * 10;
            int $$35 = ars.c((double)($$33 - 2) * 10.0 / (double)$$32);
            int $$36 = ars.c((double)$$33 * 10.0 / (double)$$32) - $$35;

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

   private void a(esa $$0, cbp $$1, int $$2, int $$3, int $$4, int $$5, float $$6, int $$7, int $$8, int $$9, boolean $$10) {
      erz.a $$11 = erz.a.a($$1);
      boolean $$12 = $$1.dK().u_().n();
      int $$13 = ars.c((double)$$6 / 2.0);
      int $$14 = ars.c((double)$$9 / 2.0);
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

         this.a($$0, erz.a.a, $$19, $$20, $$12, $$10, false);
         int $$21 = $$16 * 2;
         boolean $$22 = $$16 >= $$13;
         if ($$22) {
            int $$23 = $$21 - $$15;
            if ($$23 < $$9) {
               boolean $$24 = $$23 + 1 == $$9;
               this.a($$0, $$11 == erz.a.d ? $$11 : erz.a.e, $$19, $$20, $$12, false, $$24);
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

   private void a(esa $$0, erz.a $$1, int $$2, int $$3, boolean $$4, boolean $$5, boolean $$6) {
      $$0.a($$1.a($$4, $$6, $$5), $$2, $$3, 9, 9);
   }

   private void f(esa $$0) {
      bjb $$1 = this.n();
      if ($$1 != null) {
         int $$2 = this.a($$1);
         if ($$2 != 0) {
            int $$3 = (int)Math.ceil((double)$$1.et());
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

   private void a(esa $$0, aeu $$1, float $$2) {
      RenderSystem.disableDepthTest();
      RenderSystem.depthMask(false);
      $$0.a(1.0F, 1.0F, 1.0F, $$2);
      $$0.a($$1, 0, 0, -90, 0.0F, 0.0F, this.av, this.aw, this.av, this.aw);
      RenderSystem.depthMask(true);
      RenderSystem.enableDepthTest();
      $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
   }

   private void b(esa $$0, float $$1) {
      float $$2 = (float)Math.min(this.av, this.aw);
      float $$4 = Math.min((float)this.av / $$2, (float)this.aw / $$2) * $$1;
      int $$5 = ars.d($$2 * $$4);
      int $$6 = ars.d($$2 * $$4);
      int $$7 = (this.av - $$5) / 2;
      int $$8 = (this.aw - $$6) / 2;
      int $$9 = $$7 + $$5;
      int $$10 = $$8 + $$6;
      $$0.a(I, $$7, $$8, -90, 0.0F, 0.0F, $$5, $$6, $$5, $$6);
      $$0.a(foh.D(), 0, $$10, this.av, this.aw, -90, -16777216);
      $$0.a(foh.D(), 0, 0, this.av, $$8, -90, -16777216);
      $$0.a(foh.D(), 0, $$8, $$7, $$10, -90, -16777216);
      $$0.a(foh.D(), $$9, $$8, this.av, $$10, -90, -16777216);
   }

   private void a(bil $$0) {
      if ($$0 != null) {
         gw $$1 = gw.a($$0.dp(), $$0.dt(), $$0.dv());
         float $$2 = fny.a($$0.dK().x_(), $$0.dK().z($$1));
         float $$3 = ars.a(1.0F - $$2, 0.0F, 1.0F);
         this.a = this.a + ($$3 - this.a) * 0.01F;
      }
   }

   private void a(esa $$0, bil $$1) {
      dgv $$2 = this.W.r.w_();
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
         $$3 = ars.a($$3, 0.0F, 1.0F);
         $$0.a(0.0F, $$3, $$3, 1.0F);
      } else {
         float $$6 = this.a;
         $$6 = ars.a($$6, 0.0F, 1.0F);
         $$0.a($$6, $$6, $$6, 1.0F);
      }

      $$0.a(G, 0, 0, -90, 0.0F, 0.0F, this.av, this.aw, this.av, this.aw);
      RenderSystem.depthMask(true);
      RenderSystem.enableDepthTest();
      $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
      RenderSystem.defaultBlendFunc();
   }

   private void c(esa $$0, float $$1) {
      if ($$1 < 1.0F) {
         $$1 *= $$1;
         $$1 *= $$1;
         $$1 = $$1 * 0.8F + 0.2F;
      }

      RenderSystem.disableDepthTest();
      RenderSystem.depthMask(false);
      $$0.a(1.0F, 1.0F, 1.0F, $$1);
      fyz $$2 = this.W.an().a().a(csr.ee.n());
      $$0.a(0, 0, -90, this.av, this.aw, $$2);
      RenderSystem.depthMask(true);
      RenderSystem.enableDepthTest();
      $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
   }

   private void a(esa $$0, int $$1, int $$2, float $$3, cbp $$4, cja $$5, int $$6) {
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
      bil $$0 = this.W.am();
      if ($$0 != null) {
         this.a($$0);
      }

      if (this.W.s != null) {
         cja $$1 = this.W.s.fQ().f();
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
      this.ax = ars.i(0.2F, this.ax, $$1 ? 1.0F : 0.0F);
   }

   public void a(ti $$0) {
      ti $$1 = ti.a("record.nowPlaying", $$0);
      this.a($$1, true);
      this.W.aV().c($$1);
   }

   public void a(ti $$0, boolean $$1) {
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

   public void b(ti $$0) {
      this.an = $$0;
   }

   public void c(ti $$0) {
      this.am = $$0;
      this.al = this.ao + this.ap + this.aq;
   }

   public void c() {
      this.am = null;
      this.an = null;
      this.al = 0;
   }

   public esm d() {
      return this.Y;
   }

   public int e() {
      return this.Z;
   }

   public ery f() {
      return this.W.h;
   }

   public eui g() {
      return this.ai;
   }

   public etm h() {
      return this.aj;
   }

   public void i() {
      this.aj.a();
      this.ak.a();
      this.W.ay().a();
      this.ag.m();
      this.Y.a(true);
   }

   public esk j() {
      return this.ak;
   }

   public est k() {
      return this.ag;
   }

   public void l() {
      this.ag.a();
   }

   private void g(esa $$0) {
      if (this.W.m.ab().c() && (this.ax > 0.0F || this.ay > 0.0F)) {
         int $$1 = ars.d(255.0F * ars.a(ars.i(this.W.as(), this.ay, this.ax), 0.0F, 1.0F));
         if ($$1 > 8) {
            ery $$2 = this.f();
            int $$3 = $$2.a(L);
            int $$4 = 16777215 | $$1 << 24 & 0xFF000000;
            $$0.b($$2, L, this.av - $$3 - 10, this.aw - 15, $$4);
         }
      }
   }

   static enum a {
      a(
         new aeu("hud/heart/container"),
         new aeu("hud/heart/container_blinking"),
         new aeu("hud/heart/container"),
         new aeu("hud/heart/container_blinking"),
         new aeu("hud/heart/container_hardcore"),
         new aeu("hud/heart/container_hardcore_blinking"),
         new aeu("hud/heart/container_hardcore"),
         new aeu("hud/heart/container_hardcore_blinking")
      ),
      b(
         new aeu("hud/heart/full"),
         new aeu("hud/heart/full_blinking"),
         new aeu("hud/heart/half"),
         new aeu("hud/heart/half_blinking"),
         new aeu("hud/heart/hardcore_full"),
         new aeu("hud/heart/hardcore_full_blinking"),
         new aeu("hud/heart/hardcore_half"),
         new aeu("hud/heart/hardcore_half_blinking")
      ),
      c(
         new aeu("hud/heart/poisoned_full"),
         new aeu("hud/heart/poisoned_full_blinking"),
         new aeu("hud/heart/poisoned_half"),
         new aeu("hud/heart/poisoned_half_blinking"),
         new aeu("hud/heart/poisoned_hardcore_full"),
         new aeu("hud/heart/poisoned_hardcore_full_blinking"),
         new aeu("hud/heart/poisoned_hardcore_half"),
         new aeu("hud/heart/poisoned_hardcore_half_blinking")
      ),
      d(
         new aeu("hud/heart/withered_full"),
         new aeu("hud/heart/withered_full_blinking"),
         new aeu("hud/heart/withered_half"),
         new aeu("hud/heart/withered_half_blinking"),
         new aeu("hud/heart/withered_hardcore_full"),
         new aeu("hud/heart/withered_hardcore_full_blinking"),
         new aeu("hud/heart/withered_hardcore_half"),
         new aeu("hud/heart/withered_hardcore_half_blinking")
      ),
      e(
         new aeu("hud/heart/absorbing_full"),
         new aeu("hud/heart/absorbing_full_blinking"),
         new aeu("hud/heart/absorbing_half"),
         new aeu("hud/heart/absorbing_half_blinking"),
         new aeu("hud/heart/absorbing_hardcore_full"),
         new aeu("hud/heart/absorbing_hardcore_full_blinking"),
         new aeu("hud/heart/absorbing_hardcore_half"),
         new aeu("hud/heart/absorbing_hardcore_half_blinking")
      ),
      f(
         new aeu("hud/heart/frozen_full"),
         new aeu("hud/heart/frozen_full_blinking"),
         new aeu("hud/heart/frozen_half"),
         new aeu("hud/heart/frozen_half_blinking"),
         new aeu("hud/heart/frozen_hardcore_full"),
         new aeu("hud/heart/frozen_hardcore_full_blinking"),
         new aeu("hud/heart/frozen_hardcore_half"),
         new aeu("hud/heart/frozen_hardcore_half_blinking")
      );

      private final aeu g;
      private final aeu h;
      private final aeu i;
      private final aeu j;
      private final aeu k;
      private final aeu l;
      private final aeu m;
      private final aeu n;

      private a(aeu $$0, aeu $$1, aeu $$2, aeu $$3, aeu $$4, aeu $$5, aeu $$6, aeu $$7) {
         this.g = $$0;
         this.h = $$1;
         this.i = $$2;
         this.j = $$3;
         this.k = $$4;
         this.l = $$5;
         this.m = $$6;
         this.n = $$7;
      }

      public aeu a(boolean $$0, boolean $$1, boolean $$2) {
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

      static erz.a a(cbp $$0) {
         erz.a $$1;
         if ($$0.a(bia.s)) {
            $$1 = c;
         } else if ($$0.a(bia.t)) {
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
