import com.google.common.collect.Lists;
import com.google.common.collect.Ordering;
import com.mojang.blaze3d.platform.GlStateManager;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class ewt {
   private static final ahg b = new ahg("hud/crosshair");
   private static final ahg c = new ahg("hud/crosshair_attack_indicator_full");
   private static final ahg d = new ahg("hud/crosshair_attack_indicator_background");
   private static final ahg e = new ahg("hud/crosshair_attack_indicator_progress");
   private static final ahg f = new ahg("hud/effect_background_ambient");
   private static final ahg g = new ahg("hud/effect_background");
   private static final ahg h = new ahg("hud/hotbar");
   private static final ahg i = new ahg("hud/hotbar_selection");
   private static final ahg j = new ahg("hud/hotbar_offhand_left");
   private static final ahg k = new ahg("hud/hotbar_offhand_right");
   private static final ahg l = new ahg("hud/hotbar_attack_indicator_background");
   private static final ahg m = new ahg("hud/hotbar_attack_indicator_progress");
   private static final ahg n = new ahg("hud/jump_bar_background");
   private static final ahg o = new ahg("hud/jump_bar_cooldown");
   private static final ahg p = new ahg("hud/jump_bar_progress");
   private static final ahg q = new ahg("hud/experience_bar_background");
   private static final ahg r = new ahg("hud/experience_bar_progress");
   private static final ahg s = new ahg("hud/armor_empty");
   private static final ahg t = new ahg("hud/armor_half");
   private static final ahg u = new ahg("hud/armor_full");
   private static final ahg v = new ahg("hud/food_empty_hunger");
   private static final ahg w = new ahg("hud/food_half_hunger");
   private static final ahg x = new ahg("hud/food_full_hunger");
   private static final ahg y = new ahg("hud/food_empty");
   private static final ahg z = new ahg("hud/food_half");
   private static final ahg A = new ahg("hud/food_full");
   private static final ahg B = new ahg("hud/air");
   private static final ahg C = new ahg("hud/air_bursting");
   private static final ahg D = new ahg("hud/heart/vehicle_container");
   private static final ahg E = new ahg("hud/heart/vehicle_full");
   private static final ahg F = new ahg("hud/heart/vehicle_half");
   private static final ahg G = new ahg("textures/misc/vignette.png");
   private static final ahg H = new ahg("textures/misc/pumpkinblur.png");
   private static final ahg I = new ahg("textures/misc/spyglass_scope.png");
   private static final ahg J = new ahg("textures/misc/powder_snow_outline.png");
   private static final Comparator<emq> K = Comparator.comparing(emq::d).reversed().thenComparing(emq::c, String.CASE_INSENSITIVE_ORDER);
   private static final vf L = vf.c("demo.demoExpired");
   private static final vf M = vf.c("menu.savingLevel");
   private static final int N = 16777215;
   private static final float O = 5.0F;
   private static final int P = 10;
   private static final int Q = 10;
   private static final String R = ": ";
   private static final float S = 0.2F;
   private static final int T = 9;
   private static final int U = 8;
   private static final float V = 0.2F;
   private final auv W = auv.a();
   private final evi X;
   private final fzl Y;
   private final exh Z;
   private int aa;
   @Nullable
   private vf ab;
   private int ac;
   private boolean ad;
   private boolean ae;
   public float a = 1.0F;
   private int af;
   private cmy ag = cmy.f;
   private final exo ah;
   private final eyo ai;
   private final eze aj;
   private final eyh ak;
   private final exf al;
   private int am;
   @Nullable
   private vf an;
   @Nullable
   private vf ao;
   private int ap;
   private int aq;
   private int ar;
   private int as;
   private int at;
   private long au;
   private long av;
   private int aw;
   private int ax;
   private float ay;
   private float az;
   private float aA;

   public ewt(evi $$0, fzl $$1) {
      this.X = $$0;
      this.Y = $$1;
      this.ah = new exo($$0);
      this.aj = new eze($$0);
      this.Z = new exh($$0);
      this.ak = new eyh($$0, this);
      this.al = new exf($$0);
      this.ai = new eyo($$0);
      this.a();
   }

   public void a() {
      this.ap = 10;
      this.aq = 70;
      this.ar = 20;
   }

   public void a(ewu $$0, float $$1) {
      epf $$2 = this.X.aM();
      this.aw = $$0.a();
      this.ax = $$0.b();
      ews $$3 = this.f();
      RenderSystem.enableBlend();
      if (evi.L()) {
         this.a($$0, this.X.am());
      } else {
         RenderSystem.enableDepthTest();
      }

      float $$4 = this.X.at();
      this.aA = auo.i(0.5F * $$4, this.aA, 1.125F);
      if (this.X.m.ax().a()) {
         if (this.X.s.gq()) {
            this.b($$0, this.aA);
         } else {
            this.aA = 0.5F;
            cmy $$5 = this.X.s.fS().e(3);
            if ($$5.a(cws.ee.k())) {
               this.a($$0, H, 1.0F);
            }
         }
      }

      if (this.X.s.cj() > 0) {
         this.a($$0, J, this.X.s.ck());
      }

      float $$6 = auo.i($$1, this.X.s.cx, this.X.s.cw);
      if ($$6 > 0.0F && !this.X.s.a(blk.i)) {
         this.c($$0, $$6);
      }

      if (this.X.q.l() == ctm.d) {
         this.aj.a($$0);
      } else if (!this.X.m.Z) {
         this.a($$1, $$0);
      }

      if (!this.X.m.Z) {
         RenderSystem.enableBlend();
         this.d($$0);
         this.X.aG().a("bossHealth");
         this.al.a($$0);
         this.X.aG().c();
         if (this.X.q.a()) {
            this.e($$0);
         }

         this.f($$0);
         RenderSystem.disableBlend();
         int $$7 = this.aw / 2 - 91;
         bmw $$8 = this.X.s.q();
         if ($$8 != null) {
            this.a($$8, $$0, $$7);
         } else if (this.X.q.e()) {
            this.a($$0, $$7);
         }

         if (this.X.q.l() != ctm.d) {
            this.b($$0);
         } else if (this.X.s.P_()) {
            this.aj.b($$0);
         }
      }

      if (this.X.s.fW() > 0) {
         this.X.aG().a("sleep");
         float $$9 = (float)this.X.s.fW();
         float $$10 = $$9 / 100.0F;
         if ($$10 > 1.0F) {
            $$10 = 1.0F - ($$9 - 100.0F) / 10.0F;
         }

         int $$11 = (int)(220.0F * $$10) << 24 | 1052704;
         $$0.a(ftp.C(), 0, 0, this.aw, this.ax, $$11);
         this.X.aG().c();
      }

      if (this.X.I()) {
         this.c($$0);
      }

      this.a($$0);
      if (this.ah.d()) {
         this.ah.a($$0);
      }

      if (!this.X.m.Z) {
         if (this.ab != null && this.ac > 0) {
            this.X.aG().a("overlayMessage");
            float $$12 = (float)this.ac - $$1;
            int $$13 = (int)($$12 * 255.0F / 20.0F);
            if ($$13 > 255) {
               $$13 = 255;
            }

            if ($$13 > 8) {
               $$0.c().a();
               $$0.c().a((float)(this.aw / 2), (float)(this.ax - 68), 0.0F);
               int $$14 = 16777215;
               if (this.ad) {
                  $$14 = auo.h($$12 / 50.0F, 0.7F, 0.6F) & 16777215;
               }

               int $$15 = $$13 << 24 & 0xFF000000;
               int $$16 = $$3.a(this.ab);
               this.a($$0, $$3, -4, $$16, 16777215 | $$15);
               $$0.b($$3, this.ab, -$$16 / 2, -4, $$14 | $$15);
               $$0.c().b();
            }

            this.X.aG().c();
         }

         if (this.an != null && this.am > 0) {
            this.X.aG().a("titleAndSubtitle");
            float $$17 = (float)this.am - $$1;
            int $$18 = 255;
            if (this.am > this.ar + this.aq) {
               float $$19 = (float)(this.ap + this.aq + this.ar) - $$17;
               $$18 = (int)($$19 * 255.0F / (float)this.ap);
            }

            if (this.am <= this.ar) {
               $$18 = (int)($$17 * 255.0F / (float)this.ar);
            }

            $$18 = auo.a($$18, 0, 255);
            if ($$18 > 8) {
               $$0.c().a();
               $$0.c().a((float)(this.aw / 2), (float)(this.ax / 2), 0.0F);
               RenderSystem.enableBlend();
               $$0.c().a();
               $$0.c().b(4.0F, 4.0F, 4.0F);
               int $$20 = $$18 << 24 & 0xFF000000;
               int $$21 = $$3.a(this.an);
               this.a($$0, $$3, -10, $$21, 16777215 | $$20);
               $$0.b($$3, this.an, -$$21 / 2, -10, 16777215 | $$20);
               $$0.c().b();
               if (this.ao != null) {
                  $$0.c().a();
                  $$0.c().b(2.0F, 2.0F, 2.0F);
                  int $$22 = $$3.a(this.ao);
                  this.a($$0, $$3, 5, $$22, 16777215 | $$20);
                  $$0.b($$3, this.ao, -$$22 / 2, 5, 16777215 | $$20);
                  $$0.c().b();
               }

               RenderSystem.disableBlend();
               $$0.c().b();
            }

            this.X.aG().c();
         }

         this.ai.a($$0);
         emx $$23 = this.X.r.K();
         emp $$24 = null;
         ems $$25 = $$23.e(this.X.s.cy());
         if ($$25 != null) {
            emo $$26 = emo.a($$25.n());
            if ($$26 != null) {
               $$24 = $$23.a($$26);
            }
         }

         emp $$27 = $$24 != null ? $$24 : $$23.a(emo.b);
         if ($$27 != null) {
            this.a($$0, $$27);
         }

         RenderSystem.enableBlend();
         int $$28 = auo.a(this.X.n.e() * (double)$$2.o() / (double)$$2.m());
         int $$29 = auo.a(this.X.n.f() * (double)$$2.p() / (double)$$2.n());
         this.X.aG().a("chat");
         this.Z.a($$0, this.aa, $$28, $$29);
         this.X.aG().c();
         $$27 = $$23.a(emo.a);
         if (!this.X.m.L.e() || this.X.R() && this.X.s.cn.n().size() <= 1 && $$27 == null) {
            this.ak.a(false);
         } else {
            this.ak.a(true);
            this.ak.a($$0, this.aw, $$23, $$27);
         }

         this.g($$0);
      }
   }

   private void a(ewu $$0, ews $$1, int $$2, int $$3, int $$4) {
      int $$5 = this.X.m.b(0.0F);
      if ($$5 != 0) {
         int $$6 = -$$3 / 2;
         $$0.a($$6 - 2, $$2 - 2, $$6 + $$3 + 2, $$2 + 9 + 2, aty.b.a($$5, $$4));
      }
   }

   private void d(ewu $$0) {
      evm $$1 = this.X.m;
      if ($$1.ax().a()) {
         if (this.X.q.l() != ctm.d || this.a(this.X.v)) {
            if (this.ah.d() && !this.X.s.gi() && !$$1.S().c()) {
               eut $$2 = this.X.j.m();
               eqb $$3 = RenderSystem.getModelViewStack();
               $$3.a();
               $$3.a($$0.c().c().a());
               $$3.a((float)(this.aw / 2), (float)(this.ax / 2), 0.0F);
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
               $$0.a(b, (this.aw - 15) / 2, (this.ax - 15) / 2, 15, 15);
               if (this.X.m.B().c() == eus.b) {
                  float $$5 = this.X.s.B(0.0F);
                  boolean $$6 = false;
                  if (this.X.u != null && this.X.u instanceof bml && $$5 >= 1.0F) {
                     $$6 = this.X.s.gl() > 5.0F;
                     $$6 &= this.X.u.bx();
                  }

                  int $$7 = this.ax / 2 - 7 + 16;
                  int $$8 = this.aw / 2 - 8;
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

   private boolean a(@Nullable elr $$0) {
      if ($$0 == null) {
         return false;
      } else if ($$0.c() == elr.a.c) {
         return ((elq)$$0).a() instanceof bke;
      } else if ($$0.c() == elr.a.b) {
         hx $$1 = ((elp)$$0).a();
         ctp $$2 = this.X.r;
         return $$2.a_($$1).b($$2, $$1) != null;
      } else {
         return false;
      }
   }

   protected void a(ewu $$0) {
      Collection<bli> $$1 = this.X.s.es();
      if (!$$1.isEmpty()) {
         if (this.X.y instanceof fes $$2 && $$2.J()) {
            return;
         }

         RenderSystem.enableBlend();
         int $$3 = 0;
         int $$4 = 0;
         gfk $$5 = this.X.aE();
         List<Runnable> $$6 = Lists.newArrayListWithExpectedSize($$1.size());

         for (bli $$7 : Ordering.natural().reverse().sortedCopy($$1)) {
            blg $$8 = $$7.c();
            if ($$7.h()) {
               int $$9 = this.aw;
               int $$10 = 1;
               if (this.X.I()) {
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
                     $$11 = auo.a((float)$$12 / 10.0F / 5.0F * 0.5F, 0.0F, 0.5F)
                        + auo.b((float)$$12 * (float) Math.PI / 5.0F) * auo.a((float)$$13 / 10.0F * 0.25F, 0.0F, 0.25F);
                  }
               }

               gen $$14 = $$5.a($$8);
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

   private void a(float $$0, ewu $$1) {
      cfi $$2 = this.m();
      if ($$2 != null) {
         cmy $$3 = $$2.eU();
         bmf $$4 = $$2.fm().e();
         int $$5 = this.aw / 2;
         int $$6 = 182;
         int $$7 = 91;
         $$1.c().a();
         $$1.c().a(0.0F, 0.0F, -90.0F);
         $$1.a(h, $$5 - 91, this.ax - 22, 182, 22);
         $$1.a(i, $$5 - 91 - 1 + $$2.fS().l * 20, this.ax - 22 - 1, 24, 23);
         if (!$$3.b()) {
            if ($$4 == bmf.a) {
               $$1.a(j, $$5 - 91 - 29, this.ax - 23, 29, 24);
            } else {
               $$1.a(k, $$5 + 91, this.ax - 23, 29, 24);
            }
         }

         $$1.c().b();
         int $$8 = 1;

         for (int $$9 = 0; $$9 < 9; $$9++) {
            int $$10 = $$5 - 90 + $$9 * 20 + 2;
            int $$11 = this.ax - 16 - 3;
            this.a($$1, $$10, $$11, $$0, $$2, $$2.fS().i.get($$9), $$8++);
         }

         if (!$$3.b()) {
            int $$12 = this.ax - 16 - 3;
            if ($$4 == bmf.a) {
               this.a($$1, $$5 - 91 - 26, $$12, $$0, $$2, $$3, $$8++);
            } else {
               this.a($$1, $$5 + 91 + 10, $$12, $$0, $$2, $$3, $$8++);
            }
         }

         RenderSystem.enableBlend();
         if (this.X.m.B().c() == eus.c) {
            float $$13 = this.X.s.B(0.0F);
            if ($$13 < 1.0F) {
               int $$14 = this.ax - 20;
               int $$15 = $$5 + 91 + 6;
               if ($$4 == bmf.b) {
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

   public void a(bmw $$0, ewu $$1, int $$2) {
      this.X.aG().a("jumpBar");
      float $$3 = this.X.s.u();
      int $$4 = 182;
      int $$5 = (int)($$3 * 183.0F);
      int $$6 = this.ax - 32 + 3;
      $$1.a(n, $$2, $$6, 182, 5);
      if ($$0.ad_() > 0) {
         $$1.a(o, $$2, $$6, 182, 5);
      } else if ($$5 > 0) {
         $$1.a(p, 182, 5, 0, 0, $$2, $$6, $$5, 5);
      }

      this.X.aG().c();
   }

   public void a(ewu $$0, int $$1) {
      this.X.aG().a("expBar");
      int $$2 = this.X.s.gb();
      if ($$2 > 0) {
         int $$3 = 182;
         int $$4 = (int)(this.X.s.ch * 183.0F);
         int $$5 = this.ax - 32 + 3;
         $$0.a(q, $$1, $$5, 182, 5);
         if ($$4 > 0) {
            $$0.a(r, 182, 5, 0, 0, $$1, $$5, $$4, 5);
         }
      }

      this.X.aG().c();
      if (this.X.s.cf > 0) {
         this.X.aG().a("expLevel");
         String $$6 = this.X.s.cf + "";
         int $$7 = (this.aw - this.f().b($$6)) / 2;
         int $$8 = this.ax - 31 - 4;
         $$0.a(this.f(), $$6, $$7 + 1, $$8, 0, false);
         $$0.a(this.f(), $$6, $$7 - 1, $$8, 0, false);
         $$0.a(this.f(), $$6, $$7, $$8 + 1, 0, false);
         $$0.a(this.f(), $$6, $$7, $$8 - 1, 0, false);
         $$0.a(this.f(), $$6, $$7, $$8, 8453920, false);
         this.X.aG().c();
      }
   }

   public void b(ewu $$0) {
      this.X.aG().a("selectedItemName");
      if (this.af > 0 && !this.ag.b()) {
         vt $$1 = vf.i().b(this.ag.y()).a(this.ag.C().e);
         if (this.ag.A()) {
            $$1.a(n.u);
         }

         int $$2 = this.f().a($$1);
         int $$3 = (this.aw - $$2) / 2;
         int $$4 = this.ax - 59;
         if (!this.X.q.a()) {
            $$4 += 14;
         }

         int $$5 = (int)((float)this.af * 256.0F / 10.0F);
         if ($$5 > 255) {
            $$5 = 255;
         }

         if ($$5 > 0) {
            $$0.a($$3 - 2, $$4 - 2, $$3 + $$2 + 2, $$4 + 9 + 2, this.X.m.a(0));
            $$0.b(this.f(), $$1, $$3, $$4, 16777215 + ($$5 << 24));
         }
      }

      this.X.aG().c();
   }

   public void c(ewu $$0) {
      this.X.aG().a("demo");
      vf $$1;
      if (this.X.r.X() >= 120500L) {
         $$1 = L;
      } else {
         $$1 = vf.a("demo.remainingTime", avl.a((int)(120500L - this.X.r.X()), this.X.r.s().f()));
      }

      int $$3 = this.f().a($$1);
      $$0.b(this.f(), $$1, this.aw - $$3 - 10, 5, 16777215);
      this.X.aG().c();
   }

   private void a(ewu $$0, emp $$1) {
      emx $$2 = $$1.a();
      wv $$3 = $$1.a(wy.c);

      record a(vf a, vf b, int c) {
      }

      a[] $$4 = $$2.i($$1).stream().filter($$0x -> !$$0x.a()).sorted(K).limit(15L).map($$2x -> {
         ems $$3x = $$2.e($$2x.c());
         vf $$4x = $$2x.b();
         vf $$5x = ems.a($$3x, $$4x);
         vf $$6x = $$2x.a($$3);
         int $$7x = this.f().a($$6x);
         return new a($$5x, $$6x, $$7x);
      }).toArray(a[]::new);
      vf $$5 = $$1.d();
      int $$6 = this.f().a($$5);
      int $$7 = $$6;
      int $$8 = this.f().b(": ");

      for (a $$9 : $$4) {
         $$7 = Math.max($$7, this.f().a($$9.a) + ($$9.c > 0 ? $$8 + $$9.c : 0));
      }

      int $$10 = $$7;
      $$0.a(() -> {
         int $$5x = $$4.length;
         int $$6x = $$5x * 9;
         int $$7x = this.ax / 2 + $$6x / 3;
         int $$8x = 3;
         int $$9x = this.aw - $$10 - 3;
         int $$10x = this.aw - 3 + 2;
         int $$11 = this.X.m.b(0.3F);
         int $$12 = this.X.m.b(0.4F);
         int $$13 = $$7x - $$5x * 9;
         $$0.a($$9x - 2, $$13 - 9 - 1, $$10x, $$13 - 1, $$12);
         $$0.a($$9x - 2, $$13 - 1, $$10x, $$7x, $$11);
         $$0.a(this.f(), $$5, $$9x + $$10 / 2 - $$6 / 2, $$13 - 9, -1, false);

         for (int $$14 = 0; $$14 < $$5x; $$14++) {
            a $$15 = $$4[$$14];
            int $$16 = $$7x - ($$5x - $$14) * 9;
            $$0.a(this.f(), $$15.a, $$9x, $$16, -1, false);
            $$0.a(this.f(), $$15.b, $$10x - $$15.c, $$16, -1, false);
         }
      });
   }

   @Nullable
   private cfi m() {
      return this.X.am() instanceof cfi $$0 ? $$0 : null;
   }

   @Nullable
   private bml n() {
      cfi $$0 = this.m();
      if ($$0 != null) {
         blv $$1 = $$0.cZ();
         if ($$1 == null) {
            return null;
         }

         if ($$1 instanceof bml) {
            return (bml)$$1;
         }
      }

      return null;
   }

   private int a(@Nullable bml $$0) {
      if ($$0 != null && $$0.bA()) {
         float $$1 = $$0.eM();
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

   private void e(ewu $$0) {
      cfi $$1 = this.m();
      if ($$1 != null) {
         int $$2 = auo.f($$1.ev());
         boolean $$3 = this.av > (long)this.aa && (this.av - (long)this.aa) / 3L % 2L == 1L;
         long $$4 = ac.b();
         if ($$2 < this.as && $$1.al > 0) {
            this.au = $$4;
            this.av = (long)(this.aa + 20);
         } else if ($$2 > this.as && $$1.al > 0) {
            this.au = $$4;
            this.av = (long)(this.aa + 10);
         }

         if ($$4 - this.au > 1000L) {
            this.as = $$2;
            this.at = $$2;
            this.au = $$4;
         }

         this.as = $$2;
         int $$5 = this.at;
         this.W.b((long)(this.aa * 312871));
         chx $$6 = $$1.gc();
         int $$7 = $$6.a();
         int $$8 = this.aw / 2 - 91;
         int $$9 = this.aw / 2 + 91;
         int $$10 = this.ax - 39;
         float $$11 = Math.max((float)$$1.b(bnr.l), (float)Math.max($$5, $$2));
         int $$12 = auo.f($$1.fk());
         int $$13 = auo.f(($$11 + (float)$$12) / 2.0F / 10.0F);
         int $$14 = Math.max(10 - ($$13 - 2), 3);
         int $$15 = $$10 - ($$13 - 1) * $$14 - 10;
         int $$16 = $$10 - 10;
         int $$17 = $$1.eJ();
         int $$18 = -1;
         if ($$1.a(blk.j)) {
            $$18 = this.aa % auo.f($$11 + 5.0F);
         }

         this.X.aG().a("armor");

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

         this.X.aG().b("health");
         this.a($$0, $$1, $$8, $$10, $$14, $$18, $$11, $$2, $$5, $$12, $$3);
         bml $$21 = this.n();
         int $$22 = this.a($$21);
         if ($$22 == 0) {
            this.X.aG().b("food");

            for (int $$23 = 0; $$23 < 10; $$23++) {
               int $$24 = $$10;
               ahg $$25;
               ahg $$26;
               ahg $$27;
               if ($$1.a(blk.q)) {
                  $$25 = v;
                  $$26 = w;
                  $$27 = x;
               } else {
                  $$25 = y;
                  $$26 = z;
                  $$27 = A;
               }

               if ($$1.gc().e() <= 0.0F && this.aa % ($$7 * 3 + 1) == 0) {
                  $$24 = $$10 + (this.W.a(3) - 1);
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

         this.X.aG().b("air");
         int $$32 = $$1.ch();
         int $$33 = Math.min($$1.ci(), $$32);
         if ($$1.a(asm.a) || $$33 < $$32) {
            int $$34 = this.a($$22) - 1;
            $$16 -= $$34 * 10;
            int $$35 = auo.c((double)($$33 - 2) * 10.0 / (double)$$32);
            int $$36 = auo.c((double)$$33 * 10.0 / (double)$$32) - $$35;

            for (int $$37 = 0; $$37 < $$35 + $$36; $$37++) {
               if ($$37 < $$35) {
                  $$0.a(B, $$9 - $$37 * 8 - 9, $$16, 9, 9);
               } else {
                  $$0.a(C, $$9 - $$37 * 8 - 9, $$16, 9, 9);
               }
            }
         }

         this.X.aG().c();
      }
   }

   private void a(ewu $$0, cfi $$1, int $$2, int $$3, int $$4, int $$5, float $$6, int $$7, int $$8, int $$9, boolean $$10) {
      ewt.b $$11 = ewt.b.a($$1);
      boolean $$12 = $$1.dM().B_().n();
      int $$13 = auo.c((double)$$6 / 2.0);
      int $$14 = auo.c((double)$$9 / 2.0);
      int $$15 = $$13 * 2;

      for (int $$16 = $$13 + $$14 - 1; $$16 >= 0; $$16--) {
         int $$17 = $$16 / 10;
         int $$18 = $$16 % 10;
         int $$19 = $$2 + $$18 * 8;
         int $$20 = $$3 - $$17 * $$4;
         if ($$7 + $$9 <= 4) {
            $$20 += this.W.a(2);
         }

         if ($$16 < $$13 && $$16 == $$5) {
            $$20 -= 2;
         }

         this.a($$0, ewt.b.a, $$19, $$20, $$12, $$10, false);
         int $$21 = $$16 * 2;
         boolean $$22 = $$16 >= $$13;
         if ($$22) {
            int $$23 = $$21 - $$15;
            if ($$23 < $$9) {
               boolean $$24 = $$23 + 1 == $$9;
               this.a($$0, $$11 == ewt.b.d ? $$11 : ewt.b.e, $$19, $$20, $$12, false, $$24);
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

   private void a(ewu $$0, ewt.b $$1, int $$2, int $$3, boolean $$4, boolean $$5, boolean $$6) {
      $$0.a($$1.a($$4, $$6, $$5), $$2, $$3, 9, 9);
   }

   private void f(ewu $$0) {
      bml $$1 = this.n();
      if ($$1 != null) {
         int $$2 = this.a($$1);
         if ($$2 != 0) {
            int $$3 = (int)Math.ceil((double)$$1.ev());
            this.X.aG().b("mountHealth");
            int $$4 = this.ax - 39;
            int $$5 = this.aw / 2 + 91;
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

   private void a(ewu $$0, ahg $$1, float $$2) {
      RenderSystem.disableDepthTest();
      RenderSystem.depthMask(false);
      $$0.a(1.0F, 1.0F, 1.0F, $$2);
      $$0.a($$1, 0, 0, -90, 0.0F, 0.0F, this.aw, this.ax, this.aw, this.ax);
      RenderSystem.depthMask(true);
      RenderSystem.enableDepthTest();
      $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
   }

   private void b(ewu $$0, float $$1) {
      float $$2 = (float)Math.min(this.aw, this.ax);
      float $$4 = Math.min((float)this.aw / $$2, (float)this.ax / $$2) * $$1;
      int $$5 = auo.d($$2 * $$4);
      int $$6 = auo.d($$2 * $$4);
      int $$7 = (this.aw - $$5) / 2;
      int $$8 = (this.ax - $$6) / 2;
      int $$9 = $$7 + $$5;
      int $$10 = $$8 + $$6;
      $$0.a(I, $$7, $$8, -90, 0.0F, 0.0F, $$5, $$6, $$5, $$6);
      $$0.a(ftp.C(), 0, $$10, this.aw, this.ax, -90, -16777216);
      $$0.a(ftp.C(), 0, 0, this.aw, $$8, -90, -16777216);
      $$0.a(ftp.C(), 0, $$8, $$7, $$10, -90, -16777216);
      $$0.a(ftp.C(), $$9, $$8, this.aw, $$10, -90, -16777216);
   }

   private void a(blv $$0) {
      hx $$1 = hx.a($$0.dr(), $$0.dv(), $$0.dx());
      float $$2 = ftg.a($$0.dM().E_(), $$0.dM().A($$1));
      float $$3 = auo.a(1.0F - $$2, 0.0F, 1.0F);
      this.a = this.a + ($$3 - this.a) * 0.01F;
   }

   private void a(ewu $$0, @Nullable blv $$1) {
      dky $$2 = this.X.r.D_();
      float $$3 = 0.0F;
      if ($$1 != null) {
         float $$4 = (float)$$2.a($$1);
         double $$5 = Math.min($$2.p() * (double)$$2.q() * 1000.0, Math.abs($$2.k() - $$2.i()));
         double $$6 = Math.max((double)$$2.r(), $$5);
         if ((double)$$4 < $$6) {
            $$3 = 1.0F - (float)((double)$$4 / $$6);
         }
      }

      RenderSystem.disableDepthTest();
      RenderSystem.depthMask(false);
      RenderSystem.blendFuncSeparate(
         GlStateManager.SourceFactor.ZERO, GlStateManager.DestFactor.ONE_MINUS_SRC_COLOR, GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO
      );
      if ($$3 > 0.0F) {
         $$3 = auo.a($$3, 0.0F, 1.0F);
         $$0.a(0.0F, $$3, $$3, 1.0F);
      } else {
         float $$7 = this.a;
         $$7 = auo.a($$7, 0.0F, 1.0F);
         $$0.a($$7, $$7, $$7, 1.0F);
      }

      $$0.a(G, 0, 0, -90, 0.0F, 0.0F, this.aw, this.ax, this.aw, this.ax);
      RenderSystem.depthMask(true);
      RenderSystem.enableDepthTest();
      $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
      RenderSystem.defaultBlendFunc();
   }

   private void c(ewu $$0, float $$1) {
      if ($$1 < 1.0F) {
         $$1 *= $$1;
         $$1 *= $$1;
         $$1 = $$1 * 0.8F + 0.2F;
      }

      RenderSystem.disableDepthTest();
      RenderSystem.depthMask(false);
      $$0.a(1.0F, 1.0F, 1.0F, $$1);
      gen $$2 = this.X.an().a().a(cws.ed.o());
      $$0.a(0, 0, -90, this.aw, this.ax, $$2);
      RenderSystem.depthMask(true);
      RenderSystem.enableDepthTest();
      $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
   }

   private void a(ewu $$0, int $$1, int $$2, float $$3, cfi $$4, cmy $$5, int $$6) {
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

         $$0.a(this.X.h, $$5, $$1, $$2);
      }
   }

   public void a(boolean $$0) {
      this.p();
      if (!$$0) {
         this.o();
      }
   }

   private void o() {
      if (this.ac > 0) {
         this.ac--;
      }

      if (this.am > 0) {
         this.am--;
         if (this.am <= 0) {
            this.an = null;
            this.ao = null;
         }
      }

      this.aa++;
      blv $$0 = this.X.am();
      if ($$0 != null) {
         this.a($$0);
      }

      if (this.X.s != null) {
         cmy $$1 = this.X.s.fS().f();
         if ($$1.b()) {
            this.af = 0;
         } else if (this.ag.b() || !$$1.a(this.ag.d()) || !$$1.y().equals(this.ag.y())) {
            this.af = (int)(40.0 * this.X.m.z().c());
         } else if (this.af > 0) {
            this.af--;
         }

         this.ag = $$1;
      }

      this.Z.a();
   }

   private void p() {
      MinecraftServer $$0 = this.X.T();
      boolean $$1 = $$0 != null && $$0.bd();
      this.az = this.ay;
      this.ay = auo.i(0.2F, this.ay, $$1 ? 1.0F : 0.0F);
   }

   public void a(vf $$0) {
      vf $$1 = vf.a("record.nowPlaying", $$0);
      this.a($$1, true);
      this.X.aW().c($$1);
   }

   public void a(vf $$0, boolean $$1) {
      this.b(false);
      this.ab = $$0;
      this.ac = 60;
      this.ad = $$1;
   }

   public void b(boolean $$0) {
      this.ae = $$0;
   }

   public boolean b() {
      return this.ae && this.ac > 0;
   }

   public void a(int $$0, int $$1, int $$2) {
      if ($$0 >= 0) {
         this.ap = $$0;
      }

      if ($$1 >= 0) {
         this.aq = $$1;
      }

      if ($$2 >= 0) {
         this.ar = $$2;
      }

      if (this.am > 0) {
         this.am = this.ap + this.aq + this.ar;
      }
   }

   public void b(vf $$0) {
      this.ao = $$0;
   }

   public void c(vf $$0) {
      this.an = $$0;
      this.am = this.ap + this.aq + this.ar;
   }

   public void c() {
      this.an = null;
      this.ao = null;
      this.am = 0;
   }

   public exh d() {
      return this.Z;
   }

   public int e() {
      return this.aa;
   }

   public ews f() {
      return this.X.h;
   }

   public eze g() {
      return this.aj;
   }

   public eyh h() {
      return this.ak;
   }

   public void i() {
      this.ak.a();
      this.al.a();
      this.X.ay().a();
      this.ah.m();
      this.Z.a(true);
   }

   public exf j() {
      return this.al;
   }

   public exo k() {
      return this.ah;
   }

   public void l() {
      this.ah.a();
   }

   private void g(ewu $$0) {
      if (this.X.m.ac().c() && (this.ay > 0.0F || this.az > 0.0F)) {
         int $$1 = auo.d(255.0F * auo.a(auo.i(this.X.as(), this.az, this.ay), 0.0F, 1.0F));
         if ($$1 > 8) {
            ews $$2 = this.f();
            int $$3 = $$2.a(M);
            int $$4 = 16777215 | $$1 << 24 & 0xFF000000;
            $$0.b($$2, M, this.aw - $$3 - 10, this.ax - 15, $$4);
         }
      }
   }

   static enum b {
      a(
         new ahg("hud/heart/container"),
         new ahg("hud/heart/container_blinking"),
         new ahg("hud/heart/container"),
         new ahg("hud/heart/container_blinking"),
         new ahg("hud/heart/container_hardcore"),
         new ahg("hud/heart/container_hardcore_blinking"),
         new ahg("hud/heart/container_hardcore"),
         new ahg("hud/heart/container_hardcore_blinking")
      ),
      b(
         new ahg("hud/heart/full"),
         new ahg("hud/heart/full_blinking"),
         new ahg("hud/heart/half"),
         new ahg("hud/heart/half_blinking"),
         new ahg("hud/heart/hardcore_full"),
         new ahg("hud/heart/hardcore_full_blinking"),
         new ahg("hud/heart/hardcore_half"),
         new ahg("hud/heart/hardcore_half_blinking")
      ),
      c(
         new ahg("hud/heart/poisoned_full"),
         new ahg("hud/heart/poisoned_full_blinking"),
         new ahg("hud/heart/poisoned_half"),
         new ahg("hud/heart/poisoned_half_blinking"),
         new ahg("hud/heart/poisoned_hardcore_full"),
         new ahg("hud/heart/poisoned_hardcore_full_blinking"),
         new ahg("hud/heart/poisoned_hardcore_half"),
         new ahg("hud/heart/poisoned_hardcore_half_blinking")
      ),
      d(
         new ahg("hud/heart/withered_full"),
         new ahg("hud/heart/withered_full_blinking"),
         new ahg("hud/heart/withered_half"),
         new ahg("hud/heart/withered_half_blinking"),
         new ahg("hud/heart/withered_hardcore_full"),
         new ahg("hud/heart/withered_hardcore_full_blinking"),
         new ahg("hud/heart/withered_hardcore_half"),
         new ahg("hud/heart/withered_hardcore_half_blinking")
      ),
      e(
         new ahg("hud/heart/absorbing_full"),
         new ahg("hud/heart/absorbing_full_blinking"),
         new ahg("hud/heart/absorbing_half"),
         new ahg("hud/heart/absorbing_half_blinking"),
         new ahg("hud/heart/absorbing_hardcore_full"),
         new ahg("hud/heart/absorbing_hardcore_full_blinking"),
         new ahg("hud/heart/absorbing_hardcore_half"),
         new ahg("hud/heart/absorbing_hardcore_half_blinking")
      ),
      f(
         new ahg("hud/heart/frozen_full"),
         new ahg("hud/heart/frozen_full_blinking"),
         new ahg("hud/heart/frozen_half"),
         new ahg("hud/heart/frozen_half_blinking"),
         new ahg("hud/heart/frozen_hardcore_full"),
         new ahg("hud/heart/frozen_hardcore_full_blinking"),
         new ahg("hud/heart/frozen_hardcore_half"),
         new ahg("hud/heart/frozen_hardcore_half_blinking")
      );

      private final ahg g;
      private final ahg h;
      private final ahg i;
      private final ahg j;
      private final ahg k;
      private final ahg l;
      private final ahg m;
      private final ahg n;

      private b(ahg $$0, ahg $$1, ahg $$2, ahg $$3, ahg $$4, ahg $$5, ahg $$6, ahg $$7) {
         this.g = $$0;
         this.h = $$1;
         this.i = $$2;
         this.j = $$3;
         this.k = $$4;
         this.l = $$5;
         this.m = $$6;
         this.n = $$7;
      }

      public ahg a(boolean $$0, boolean $$1, boolean $$2) {
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

      static ewt.b a(cfi $$0) {
         ewt.b $$1;
         if ($$0.a(blk.s)) {
            $$1 = c;
         } else if ($$0.a(blk.t)) {
            $$1 = d;
         } else if ($$0.cl()) {
            $$1 = f;
         } else {
            $$1 = b;
         }

         return $$1;
      }
   }
}
