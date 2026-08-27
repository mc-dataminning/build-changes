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

public class erv {
   private static final aer b = new aer("hud/crosshair");
   private static final aer c = new aer("hud/crosshair_attack_indicator_full");
   private static final aer d = new aer("hud/crosshair_attack_indicator_background");
   private static final aer e = new aer("hud/crosshair_attack_indicator_progress");
   private static final aer f = new aer("hud/effect_background_ambient");
   private static final aer g = new aer("hud/effect_background");
   private static final aer h = new aer("hud/hotbar");
   private static final aer i = new aer("hud/hotbar_selection");
   private static final aer j = new aer("hud/hotbar_offhand_left");
   private static final aer k = new aer("hud/hotbar_offhand_right");
   private static final aer l = new aer("hud/hotbar_attack_indicator_background");
   private static final aer m = new aer("hud/hotbar_attack_indicator_progress");
   private static final aer n = new aer("hud/jump_bar_background");
   private static final aer o = new aer("hud/jump_bar_cooldown");
   private static final aer p = new aer("hud/jump_bar_progress");
   private static final aer q = new aer("hud/experience_bar_background");
   private static final aer r = new aer("hud/experience_bar_progress");
   private static final aer s = new aer("hud/armor_empty");
   private static final aer t = new aer("hud/armor_half");
   private static final aer u = new aer("hud/armor_full");
   private static final aer v = new aer("hud/food_empty_hunger");
   private static final aer w = new aer("hud/food_half_hunger");
   private static final aer x = new aer("hud/food_full_hunger");
   private static final aer y = new aer("hud/food_empty");
   private static final aer z = new aer("hud/food_half");
   private static final aer A = new aer("hud/food_full");
   private static final aer B = new aer("hud/air");
   private static final aer C = new aer("hud/air_bursting");
   private static final aer D = new aer("hud/heart/vehicle_container");
   private static final aer E = new aer("hud/heart/vehicle_full");
   private static final aer F = new aer("hud/heart/vehicle_half");
   private static final aer G = new aer("textures/misc/vignette.png");
   private static final aer H = new aer("textures/misc/pumpkinblur.png");
   private static final aer I = new aer("textures/misc/spyglass_scope.png");
   private static final aer J = new aer("textures/misc/powder_snow_outline.png");
   private static final tf K = tf.c("demo.demoExpired");
   private static final tf L = tf.c("menu.savingLevel");
   private static final int M = 16777215;
   private static final float N = 5.0F;
   private static final int O = 10;
   private static final int P = 10;
   private static final String Q = ": ";
   private static final float R = 0.2F;
   private static final int S = 9;
   private static final int T = 8;
   private static final float U = 0.2F;
   private final aru V = aru.a();
   private final eqm W;
   private final ftm X;
   private final esi Y;
   private int Z;
   @Nullable
   private tf aa;
   private int ab;
   private boolean ac;
   private boolean ad;
   public float a = 1.0F;
   private int ae;
   private ciy af = ciy.b;
   private final esp ag;
   private final etn ah;
   private final eud ai;
   private final eth aj;
   private final esg ak;
   private int al;
   @Nullable
   private tf am;
   @Nullable
   private tf an;
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

   public erv(eqm $$0, ftm $$1) {
      this.W = $$0;
      this.X = $$1;
      this.ag = new esp($$0);
      this.ai = new eud($$0);
      this.Y = new esi($$0);
      this.aj = new eth($$0, this);
      this.ak = new esg($$0);
      this.ah = new etn($$0);
      this.a();
   }

   public void a() {
      this.ao = 10;
      this.ap = 70;
      this.aq = 20;
   }

   public void a(erw $$0, float $$1) {
      ekk $$2 = this.W.aN();
      this.av = $$0.a();
      this.aw = $$0.b();
      eru $$3 = this.f();
      RenderSystem.enableBlend();
      if (eqm.L()) {
         this.a($$0, this.W.am());
      } else {
         RenderSystem.enableDepthTest();
      }

      float $$4 = this.W.aw();
      this.az = arp.i(0.5F * $$4, this.az, 1.125F);
      if (this.W.m.au().a()) {
         if (this.W.v.go()) {
            this.b($$0, this.az);
         } else {
            this.az = 0.5F;
            ciy $$5 = this.W.v.fQ().e(3);
            if ($$5.a(csn.ef.k())) {
               this.a($$0, H, 1.0F);
            }
         }
      }

      if (this.W.v.ci() > 0) {
         this.a($$0, J, this.W.v.cj());
      }

      float $$6 = arp.i($$1, this.W.v.cu, this.W.v.ct);
      if ($$6 > 0.0F && !this.W.v.a(bhx.i)) {
         this.c($$0, $$6);
      }

      if (this.W.t.l() == cpj.d) {
         this.ai.a($$0);
      } else if (!this.W.m.Z) {
         this.a($$1, $$0);
      }

      if (!this.W.m.Z) {
         RenderSystem.enableBlend();
         this.d($$0);
         this.W.aH().a("bossHealth");
         this.ak.a($$0);
         this.W.aH().c();
         if (this.W.t.a()) {
            this.e($$0);
         }

         this.f($$0);
         RenderSystem.disableBlend();
         int $$7 = this.av / 2 - 91;
         bjj $$8 = this.W.v.p();
         if ($$8 != null) {
            this.a($$8, $$0, $$7);
         } else if (this.W.t.e()) {
            this.a($$0, $$7);
         }

         if (this.W.t.l() != cpj.d) {
            this.b($$0);
         } else if (this.W.v.G_()) {
            this.ai.b($$0);
         }
      }

      if (this.W.v.fU() > 0) {
         this.W.aH().a("sleep");
         float $$9 = (float)this.W.v.fU();
         float $$10 = $$9 / 100.0F;
         if ($$10 > 1.0F) {
            $$10 = 1.0F - ($$9 - 100.0F) / 10.0F;
         }

         int $$11 = (int)(220.0F * $$10) << 24 | 1052704;
         $$0.a(fnt.D(), 0, 0, this.av, this.aw, $$11);
         this.W.aH().c();
      }

      if (this.W.I()) {
         this.c($$0);
      }

      this.a($$0);
      if (this.W.m.aa) {
         this.ag.a($$0);
      }

      if (!this.W.m.Z) {
         if (this.aa != null && this.ab > 0) {
            this.W.aH().a("overlayMessage");
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
                  $$14 = arp.h($$12 / 50.0F, 0.7F, 0.6F) & 16777215;
               }

               int $$15 = $$13 << 24 & 0xFF000000;
               int $$16 = $$3.a(this.aa);
               this.a($$0, $$3, -4, $$16, 16777215 | $$15);
               $$0.b($$3, this.aa, -$$16 / 2, -4, $$14 | $$15);
               $$0.c().b();
            }

            this.W.aH().c();
         }

         if (this.am != null && this.al > 0) {
            this.W.aH().a("titleAndSubtitle");
            float $$17 = (float)this.al - $$1;
            int $$18 = 255;
            if (this.al > this.aq + this.ap) {
               float $$19 = (float)(this.ao + this.ap + this.aq) - $$17;
               $$18 = (int)($$19 * 255.0F / (float)this.ao);
            }

            if (this.al <= this.aq) {
               $$18 = (int)($$17 * 255.0F / (float)this.aq);
            }

            $$18 = arp.a($$18, 0, 255);
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

            this.W.aH().c();
         }

         this.ah.a($$0);
         eid $$23 = this.W.u.I();
         eia $$24 = null;
         eib $$25 = $$23.g(this.W.v.cx());
         if ($$25 != null) {
            ehz $$26 = ehz.a($$25.n());
            if ($$26 != null) {
               $$24 = $$23.a($$26);
            }
         }

         eia $$27 = $$24 != null ? $$24 : $$23.a(ehz.b);
         if ($$27 != null) {
            this.a($$0, $$27);
         }

         RenderSystem.enableBlend();
         int $$28 = arp.a(this.W.n.e() * (double)$$2.o() / (double)$$2.m());
         int $$29 = arp.a(this.W.n.f() * (double)$$2.p() / (double)$$2.n());
         this.W.aH().a("chat");
         this.Y.a($$0, this.Z, $$28, $$29);
         this.W.aH().c();
         $$27 = $$23.a(ehz.a);
         if (!this.W.m.L.e() || this.W.R() && this.W.v.cl.m().size() <= 1 && $$27 == null) {
            this.aj.a(false);
         } else {
            this.aj.a(true);
            this.aj.a($$0, this.av, $$23, $$27);
         }

         this.g($$0);
      }
   }

   private void a(erw $$0, eru $$1, int $$2, int $$3, int $$4) {
      int $$5 = this.W.m.b(0.0F);
      if ($$5 != 0) {
         int $$6 = -$$3 / 2;
         $$0.a($$6 - 2, $$2 - 2, $$6 + $$3 + 2, $$2 + 9 + 2, ara.b.a($$5, $$4));
      }
   }

   private void d(erw $$0) {
      eqq $$1 = this.W.m;
      if ($$1.au().a()) {
         if (this.W.t.l() != cpj.d || this.a(this.W.y)) {
            if ($$1.aa && !$$1.Z && !this.W.v.gg() && !$$1.Q().c()) {
               epx $$2 = this.W.j.m();
               elg $$3 = RenderSystem.getModelViewStack();
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
               if (this.W.m.z().c() == epw.b) {
                  float $$5 = this.W.v.B(0.0F);
                  boolean $$6 = false;
                  if (this.W.x != null && this.W.x instanceof biy && $$5 >= 1.0F) {
                     $$6 = this.W.v.gj() > 5.0F;
                     $$6 &= this.W.x.bv();
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

   private boolean a(ehc $$0) {
      if ($$0 == null) {
         return false;
      } else if ($$0.c() == ehc.a.c) {
         return ((ehb)$$0).a() instanceof bgt;
      } else if ($$0.c() == ehc.a.b) {
         gu $$1 = ((eha)$$0).a();
         cpm $$2 = this.W.u;
         return $$2.a_($$1).b($$2, $$1) != null;
      } else {
         return false;
      }
   }

   protected void a(erw $$0) {
      Collection<bhv> $$1 = this.W.v.eq();
      if (!$$1.isEmpty()) {
         if (this.W.B instanceof ezo $$2 && $$2.F()) {
            return;
         }

         RenderSystem.enableBlend();
         int $$3 = 0;
         int $$4 = 0;
         fzj $$5 = this.W.aF();
         List<Runnable> $$6 = Lists.newArrayListWithExpectedSize($$1.size());

         for (bhv $$7 : Ordering.natural().reverse().sortedCopy($$1)) {
            bht $$8 = $$7.c();
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
                     $$11 = arp.a((float)$$12 / 10.0F / 5.0F * 0.5F, 0.0F, 0.5F)
                        + arp.b((float)$$12 * (float) Math.PI / 5.0F) * arp.a((float)$$13 / 10.0F * 0.25F, 0.0F, 0.25F);
                  }
               }

               fyl $$14 = $$5.a($$8);
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

   private void a(float $$0, erw $$1) {
      cbn $$2 = this.l();
      if ($$2 != null) {
         ciy $$3 = $$2.eS();
         bis $$4 = $$2.fk().e();
         int $$5 = this.av / 2;
         int $$6 = 182;
         int $$7 = 91;
         $$1.c().a();
         $$1.c().a(0.0F, 0.0F, -90.0F);
         $$1.a(h, $$5 - 91, this.aw - 22, 182, 22);
         $$1.a(i, $$5 - 91 - 1 + $$2.fQ().l * 20, this.aw - 22 - 1, 24, 23);
         if (!$$3.b()) {
            if ($$4 == bis.a) {
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
            if ($$4 == bis.a) {
               this.a($$1, $$5 - 91 - 26, $$12, $$0, $$2, $$3, $$8++);
            } else {
               this.a($$1, $$5 + 91 + 10, $$12, $$0, $$2, $$3, $$8++);
            }
         }

         RenderSystem.enableBlend();
         if (this.W.m.z().c() == epw.c) {
            float $$13 = this.W.v.B(0.0F);
            if ($$13 < 1.0F) {
               int $$14 = this.aw - 20;
               int $$15 = $$5 + 91 + 6;
               if ($$4 == bis.b) {
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

   public void a(bjj $$0, erw $$1, int $$2) {
      this.W.aH().a("jumpBar");
      float $$3 = this.W.v.s();
      int $$4 = 182;
      int $$5 = (int)($$3 * 183.0F);
      int $$6 = this.aw - 32 + 3;
      $$1.a(n, $$2, $$6, 182, 5);
      if ($$0.W_() > 0) {
         $$1.a(o, $$2, $$6, 182, 5);
      } else if ($$5 > 0) {
         $$1.a(p, 182, 5, 0, 0, $$2, $$6, $$5, 5);
      }

      this.W.aH().c();
   }

   public void a(erw $$0, int $$1) {
      this.W.aH().a("expBar");
      int $$2 = this.W.v.fZ();
      if ($$2 > 0) {
         int $$3 = 182;
         int $$4 = (int)(this.W.v.cf * 183.0F);
         int $$5 = this.aw - 32 + 3;
         $$0.a(q, $$1, $$5, 182, 5);
         if ($$4 > 0) {
            $$0.a(r, 182, 5, 0, 0, $$1, $$5, $$4, 5);
         }
      }

      this.W.aH().c();
      if (this.W.v.cd > 0) {
         this.W.aH().a("expLevel");
         String $$6 = this.W.v.cd + "";
         int $$7 = (this.av - this.f().b($$6)) / 2;
         int $$8 = this.aw - 31 - 4;
         $$0.a(this.f(), $$6, $$7 + 1, $$8, 0, false);
         $$0.a(this.f(), $$6, $$7 - 1, $$8, 0, false);
         $$0.a(this.f(), $$6, $$7, $$8 + 1, 0, false);
         $$0.a(this.f(), $$6, $$7, $$8 - 1, 0, false);
         $$0.a(this.f(), $$6, $$7, $$8, 8453920, false);
         this.W.aH().c();
      }
   }

   public void b(erw $$0) {
      this.W.aH().a("selectedItemName");
      if (this.ae > 0 && !this.af.b()) {
         ts $$1 = tf.h().b(this.af.y()).a(this.af.C().e);
         if (this.af.A()) {
            $$1.a(n.u);
         }

         int $$2 = this.f().a($$1);
         int $$3 = (this.av - $$2) / 2;
         int $$4 = this.aw - 59;
         if (!this.W.t.a()) {
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

      this.W.aH().c();
   }

   public void c(erw $$0) {
      this.W.aH().a("demo");
      tf $$1;
      if (this.W.u.V() >= 120500L) {
         $$1 = K;
      } else {
         $$1 = tf.a("demo.remainingTime", asi.a((int)(120500L - this.W.u.V())));
      }

      int $$3 = this.f().a($$1);
      $$0.b(this.f(), $$1, this.av - $$3 - 10, 5, 16777215);
      this.W.aH().c();
   }

   private void a(erw $$0, eia $$1) {
      eid $$2 = $$1.a();
      Collection<eic> $$3 = $$2.i($$1);
      List<eic> $$4 = $$3.stream().filter($$0x -> $$0x.e() != null && !$$0x.e().startsWith("#")).collect(Collectors.toList());
      if ($$4.size() > 15) {
         $$3 = Lists.newArrayList(Iterables.skip($$4, $$3.size() - 15));
      } else {
         $$3 = $$4;
      }

      List<Pair<eic, tf>> $$5 = Lists.newArrayListWithCapacity($$3.size());
      tf $$6 = $$1.d();
      int $$7 = this.f().a($$6);
      int $$8 = $$7;
      int $$9 = this.f().b(": ");

      for (eic $$10 : $$3) {
         eib $$11 = $$2.g($$10.e());
         tf $$12 = eib.a($$11, tf.b($$10.e()));
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

      for (Pair<eic, tf> $$20 : $$5) {
         $$17++;
         eic $$21 = (eic)$$20.getFirst();
         tf $$22 = (tf)$$20.getSecond();
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

   private cbn l() {
      return !(this.W.am() instanceof cbn) ? null : (cbn)this.W.am();
   }

   private biy m() {
      cbn $$0 = this.l();
      if ($$0 != null) {
         bii $$1 = $$0.cY();
         if ($$1 == null) {
            return null;
         }

         if ($$1 instanceof biy) {
            return (biy)$$1;
         }
      }

      return null;
   }

   private int a(biy $$0) {
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

   private void e(erw $$0) {
      cbn $$1 = this.l();
      if ($$1 != null) {
         int $$2 = arp.f($$1.et());
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
         cea $$6 = $$1.ga();
         int $$7 = $$6.a();
         int $$8 = this.av / 2 - 91;
         int $$9 = this.av / 2 + 91;
         int $$10 = this.aw - 39;
         float $$11 = Math.max((float)$$1.b(bkf.a), (float)Math.max($$5, $$2));
         int $$12 = arp.f($$1.fi());
         int $$13 = arp.f(($$11 + (float)$$12) / 2.0F / 10.0F);
         int $$14 = Math.max(10 - ($$13 - 2), 3);
         int $$15 = $$10 - ($$13 - 1) * $$14 - 10;
         int $$16 = $$10 - 10;
         int $$17 = $$1.eH();
         int $$18 = -1;
         if ($$1.a(bhx.j)) {
            $$18 = this.Z % arp.f($$11 + 5.0F);
         }

         this.W.aH().a("armor");

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

         this.W.aH().b("health");
         this.a($$0, $$1, $$8, $$10, $$14, $$18, $$11, $$2, $$5, $$12, $$3);
         biy $$21 = this.m();
         int $$22 = this.a($$21);
         if ($$22 == 0) {
            this.W.aH().b("food");

            for (int $$23 = 0; $$23 < 10; $$23++) {
               int $$24 = $$10;
               aer $$25;
               aer $$26;
               aer $$27;
               if ($$1.a(bhx.q)) {
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

         this.W.aH().b("air");
         int $$32 = $$1.cg();
         int $$33 = Math.min($$1.ch(), $$32);
         if ($$1.a(apq.a) || $$33 < $$32) {
            int $$34 = this.a($$22) - 1;
            $$16 -= $$34 * 10;
            int $$35 = arp.c((double)($$33 - 2) * 10.0 / (double)$$32);
            int $$36 = arp.c((double)$$33 * 10.0 / (double)$$32) - $$35;

            for (int $$37 = 0; $$37 < $$35 + $$36; $$37++) {
               if ($$37 < $$35) {
                  $$0.a(B, $$9 - $$37 * 8 - 9, $$16, 9, 9);
               } else {
                  $$0.a(C, $$9 - $$37 * 8 - 9, $$16, 9, 9);
               }
            }
         }

         this.W.aH().c();
      }
   }

   private void a(erw $$0, cbn $$1, int $$2, int $$3, int $$4, int $$5, float $$6, int $$7, int $$8, int $$9, boolean $$10) {
      erv.a $$11 = erv.a.a($$1);
      boolean $$12 = $$1.dK().u_().n();
      int $$13 = arp.c((double)$$6 / 2.0);
      int $$14 = arp.c((double)$$9 / 2.0);
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

         this.a($$0, erv.a.a, $$19, $$20, $$12, $$10, false);
         int $$21 = $$16 * 2;
         boolean $$22 = $$16 >= $$13;
         if ($$22) {
            int $$23 = $$21 - $$15;
            if ($$23 < $$9) {
               boolean $$24 = $$23 + 1 == $$9;
               this.a($$0, $$11 == erv.a.d ? $$11 : erv.a.e, $$19, $$20, $$12, false, $$24);
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

   private void a(erw $$0, erv.a $$1, int $$2, int $$3, boolean $$4, boolean $$5, boolean $$6) {
      $$0.a($$1.a($$4, $$6, $$5), $$2, $$3, 9, 9);
   }

   private void f(erw $$0) {
      biy $$1 = this.m();
      if ($$1 != null) {
         int $$2 = this.a($$1);
         if ($$2 != 0) {
            int $$3 = (int)Math.ceil((double)$$1.et());
            this.W.aH().b("mountHealth");
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

   private void a(erw $$0, aer $$1, float $$2) {
      RenderSystem.disableDepthTest();
      RenderSystem.depthMask(false);
      $$0.a(1.0F, 1.0F, 1.0F, $$2);
      $$0.a($$1, 0, 0, -90, 0.0F, 0.0F, this.av, this.aw, this.av, this.aw);
      RenderSystem.depthMask(true);
      RenderSystem.enableDepthTest();
      $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
   }

   private void b(erw $$0, float $$1) {
      float $$2 = (float)Math.min(this.av, this.aw);
      float $$4 = Math.min((float)this.av / $$2, (float)this.aw / $$2) * $$1;
      int $$5 = arp.d($$2 * $$4);
      int $$6 = arp.d($$2 * $$4);
      int $$7 = (this.av - $$5) / 2;
      int $$8 = (this.aw - $$6) / 2;
      int $$9 = $$7 + $$5;
      int $$10 = $$8 + $$6;
      $$0.a(I, $$7, $$8, -90, 0.0F, 0.0F, $$5, $$6, $$5, $$6);
      $$0.a(fnt.D(), 0, $$10, this.av, this.aw, -90, -16777216);
      $$0.a(fnt.D(), 0, 0, this.av, $$8, -90, -16777216);
      $$0.a(fnt.D(), 0, $$8, $$7, $$10, -90, -16777216);
      $$0.a(fnt.D(), $$9, $$8, this.av, $$10, -90, -16777216);
   }

   private void a(bii $$0) {
      if ($$0 != null) {
         gu $$1 = gu.a($$0.dp(), $$0.dt(), $$0.dv());
         float $$2 = fnk.a($$0.dK().x_(), $$0.dK().z($$1));
         float $$3 = arp.a(1.0F - $$2, 0.0F, 1.0F);
         this.a = this.a + ($$3 - this.a) * 0.01F;
      }
   }

   private void a(erw $$0, bii $$1) {
      dgr $$2 = this.W.u.w_();
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
         $$3 = arp.a($$3, 0.0F, 1.0F);
         $$0.a(0.0F, $$3, $$3, 1.0F);
      } else {
         float $$6 = this.a;
         $$6 = arp.a($$6, 0.0F, 1.0F);
         $$0.a($$6, $$6, $$6, 1.0F);
      }

      $$0.a(G, 0, 0, -90, 0.0F, 0.0F, this.av, this.aw, this.av, this.aw);
      RenderSystem.depthMask(true);
      RenderSystem.enableDepthTest();
      $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
      RenderSystem.defaultBlendFunc();
   }

   private void c(erw $$0, float $$1) {
      if ($$1 < 1.0F) {
         $$1 *= $$1;
         $$1 *= $$1;
         $$1 = $$1 * 0.8F + 0.2F;
      }

      RenderSystem.disableDepthTest();
      RenderSystem.depthMask(false);
      $$0.a(1.0F, 1.0F, 1.0F, $$1);
      fyl $$2 = this.W.an().a().a(csn.ee.n());
      $$0.a(0, 0, -90, this.av, this.aw, $$2);
      RenderSystem.depthMask(true);
      RenderSystem.enableDepthTest();
      $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
   }

   private void a(erw $$0, int $$1, int $$2, float $$3, cbn $$4, ciy $$5, int $$6) {
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
      this.o();
      if (!$$0) {
         this.n();
      }
   }

   private void n() {
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
      bii $$0 = this.W.am();
      if ($$0 != null) {
         this.a($$0);
      }

      if (this.W.v != null) {
         ciy $$1 = this.W.v.fQ().f();
         if ($$1.b()) {
            this.ae = 0;
         } else if (this.af.b() || !$$1.a(this.af.d()) || !$$1.y().equals(this.af.y())) {
            this.ae = (int)(40.0 * this.W.m.x().c());
         } else if (this.ae > 0) {
            this.ae--;
         }

         this.af = $$1;
      }

      this.Y.a();
   }

   private void o() {
      MinecraftServer $$0 = this.W.T();
      boolean $$1 = $$0 != null && $$0.aZ();
      this.ay = this.ax;
      this.ax = arp.i(0.2F, this.ax, $$1 ? 1.0F : 0.0F);
   }

   public void a(tf $$0) {
      tf $$1 = tf.a("record.nowPlaying", $$0);
      this.a($$1, true);
      this.W.aV().c($$1);
   }

   public void a(tf $$0, boolean $$1) {
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

   public void b(tf $$0) {
      this.an = $$0;
   }

   public void c(tf $$0) {
      this.am = $$0;
      this.al = this.ao + this.ap + this.aq;
   }

   public void c() {
      this.am = null;
      this.an = null;
      this.al = 0;
   }

   public esi d() {
      return this.Y;
   }

   public int e() {
      return this.Z;
   }

   public eru f() {
      return this.W.h;
   }

   public eud g() {
      return this.ai;
   }

   public eth h() {
      return this.aj;
   }

   public void i() {
      this.aj.a();
      this.ak.a();
      this.W.az().a();
      this.W.m.aa = false;
      this.Y.a(true);
   }

   public esg j() {
      return this.ak;
   }

   public void k() {
      this.ag.a();
   }

   private void g(erw $$0) {
      if (this.W.m.aa().c() && (this.ax > 0.0F || this.ay > 0.0F)) {
         int $$1 = arp.d(255.0F * arp.a(arp.i(this.W.av(), this.ay, this.ax), 0.0F, 1.0F));
         if ($$1 > 8) {
            eru $$2 = this.f();
            int $$3 = $$2.a(L);
            int $$4 = 16777215 | $$1 << 24 & 0xFF000000;
            $$0.b($$2, L, this.av - $$3 - 10, this.aw - 15, $$4);
         }
      }
   }

   static enum a {
      a(
         new aer("hud/heart/container"),
         new aer("hud/heart/container_blinking"),
         new aer("hud/heart/container"),
         new aer("hud/heart/container_blinking"),
         new aer("hud/heart/container_hardcore"),
         new aer("hud/heart/container_hardcore_blinking"),
         new aer("hud/heart/container_hardcore"),
         new aer("hud/heart/container_hardcore_blinking")
      ),
      b(
         new aer("hud/heart/full"),
         new aer("hud/heart/full_blinking"),
         new aer("hud/heart/half"),
         new aer("hud/heart/half_blinking"),
         new aer("hud/heart/hardcore_full"),
         new aer("hud/heart/hardcore_full_blinking"),
         new aer("hud/heart/hardcore_half"),
         new aer("hud/heart/hardcore_half_blinking")
      ),
      c(
         new aer("hud/heart/poisoned_full"),
         new aer("hud/heart/poisoned_full_blinking"),
         new aer("hud/heart/poisoned_half"),
         new aer("hud/heart/poisoned_half_blinking"),
         new aer("hud/heart/poisoned_hardcore_full"),
         new aer("hud/heart/poisoned_hardcore_full_blinking"),
         new aer("hud/heart/poisoned_hardcore_half"),
         new aer("hud/heart/poisoned_hardcore_half_blinking")
      ),
      d(
         new aer("hud/heart/withered_full"),
         new aer("hud/heart/withered_full_blinking"),
         new aer("hud/heart/withered_half"),
         new aer("hud/heart/withered_half_blinking"),
         new aer("hud/heart/withered_hardcore_full"),
         new aer("hud/heart/withered_hardcore_full_blinking"),
         new aer("hud/heart/withered_hardcore_half"),
         new aer("hud/heart/withered_hardcore_half_blinking")
      ),
      e(
         new aer("hud/heart/absorbing_full"),
         new aer("hud/heart/absorbing_full_blinking"),
         new aer("hud/heart/absorbing_half"),
         new aer("hud/heart/absorbing_half_blinking"),
         new aer("hud/heart/absorbing_hardcore_full"),
         new aer("hud/heart/absorbing_hardcore_full_blinking"),
         new aer("hud/heart/absorbing_hardcore_half"),
         new aer("hud/heart/absorbing_hardcore_half_blinking")
      ),
      f(
         new aer("hud/heart/frozen_full"),
         new aer("hud/heart/frozen_full_blinking"),
         new aer("hud/heart/frozen_half"),
         new aer("hud/heart/frozen_half_blinking"),
         new aer("hud/heart/frozen_hardcore_full"),
         new aer("hud/heart/frozen_hardcore_full_blinking"),
         new aer("hud/heart/frozen_hardcore_half"),
         new aer("hud/heart/frozen_hardcore_half_blinking")
      );

      private final aer g;
      private final aer h;
      private final aer i;
      private final aer j;
      private final aer k;
      private final aer l;
      private final aer m;
      private final aer n;

      private a(aer $$0, aer $$1, aer $$2, aer $$3, aer $$4, aer $$5, aer $$6, aer $$7) {
         this.g = $$0;
         this.h = $$1;
         this.i = $$2;
         this.j = $$3;
         this.k = $$4;
         this.l = $$5;
         this.m = $$6;
         this.n = $$7;
      }

      public aer a(boolean $$0, boolean $$1, boolean $$2) {
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

      static erv.a a(cbn $$0) {
         erv.a $$1;
         if ($$0.a(bhx.s)) {
            $$1 = c;
         } else if ($$0.a(bhx.t)) {
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
