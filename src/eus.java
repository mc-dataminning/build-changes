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

public class eus {
   private static final agm b = new agm("hud/crosshair");
   private static final agm c = new agm("hud/crosshair_attack_indicator_full");
   private static final agm d = new agm("hud/crosshair_attack_indicator_background");
   private static final agm e = new agm("hud/crosshair_attack_indicator_progress");
   private static final agm f = new agm("hud/effect_background_ambient");
   private static final agm g = new agm("hud/effect_background");
   private static final agm h = new agm("hud/hotbar");
   private static final agm i = new agm("hud/hotbar_selection");
   private static final agm j = new agm("hud/hotbar_offhand_left");
   private static final agm k = new agm("hud/hotbar_offhand_right");
   private static final agm l = new agm("hud/hotbar_attack_indicator_background");
   private static final agm m = new agm("hud/hotbar_attack_indicator_progress");
   private static final agm n = new agm("hud/jump_bar_background");
   private static final agm o = new agm("hud/jump_bar_cooldown");
   private static final agm p = new agm("hud/jump_bar_progress");
   private static final agm q = new agm("hud/experience_bar_background");
   private static final agm r = new agm("hud/experience_bar_progress");
   private static final agm s = new agm("hud/armor_empty");
   private static final agm t = new agm("hud/armor_half");
   private static final agm u = new agm("hud/armor_full");
   private static final agm v = new agm("hud/food_empty_hunger");
   private static final agm w = new agm("hud/food_half_hunger");
   private static final agm x = new agm("hud/food_full_hunger");
   private static final agm y = new agm("hud/food_empty");
   private static final agm z = new agm("hud/food_half");
   private static final agm A = new agm("hud/food_full");
   private static final agm B = new agm("hud/air");
   private static final agm C = new agm("hud/air_bursting");
   private static final agm D = new agm("hud/heart/vehicle_container");
   private static final agm E = new agm("hud/heart/vehicle_full");
   private static final agm F = new agm("hud/heart/vehicle_half");
   private static final agm G = new agm("textures/misc/vignette.png");
   private static final agm H = new agm("textures/misc/pumpkinblur.png");
   private static final agm I = new agm("textures/misc/spyglass_scope.png");
   private static final agm J = new agm("textures/misc/powder_snow_outline.png");
   private static final uv K = uv.c("demo.demoExpired");
   private static final uv L = uv.c("menu.savingLevel");
   private static final int M = 16777215;
   private static final float N = 5.0F;
   private static final int O = 10;
   private static final int P = 10;
   private static final String Q = ": ";
   private static final float R = 0.2F;
   private static final int S = 9;
   private static final int T = 8;
   private static final float U = 0.2F;
   private final atw V = atw.a();
   private final eti W;
   private final fxa X;
   private final evf Y;
   private int Z;
   @Nullable
   private uv aa;
   private int ab;
   private boolean ac;
   private boolean ad;
   public float a = 1.0F;
   private int ae;
   private clo af = clo.b;
   private final evm ag;
   private final ewm ah;
   private final exc ai;
   private final ewf aj;
   private final evd ak;
   private int al;
   @Nullable
   private uv am;
   @Nullable
   private uv an;
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

   public eus(eti $$0, fxa $$1) {
      this.W = $$0;
      this.X = $$1;
      this.ag = new evm($$0);
      this.ai = new exc($$0);
      this.Y = new evf($$0);
      this.aj = new ewf($$0, this);
      this.ak = new evd($$0);
      this.ah = new ewm($$0);
      this.a();
   }

   public void a() {
      this.ao = 10;
      this.ap = 70;
      this.aq = 20;
   }

   public void a(eut $$0, float $$1) {
      enf $$2 = this.W.aL();
      this.av = $$0.a();
      this.aw = $$0.b();
      eur $$3 = this.f();
      RenderSystem.enableBlend();
      if (eti.K()) {
         this.a($$0, this.W.al());
      } else {
         RenderSystem.enableDepthTest();
      }

      float $$4 = this.W.as();
      this.az = atq.i(0.5F * $$4, this.az, 1.125F);
      if (this.W.m.ax().a()) {
         if (this.W.s.gr()) {
            this.b($$0, this.az);
         } else {
            this.az = 0.5F;
            clo $$5 = this.W.s.fT().e(3);
            if ($$5.a(cvh.ee.k())) {
               this.a($$0, H, 1.0F);
            }
         }
      }

      if (this.W.s.cj() > 0) {
         this.a($$0, J, this.W.s.ck());
      }

      float $$6 = atq.i($$1, this.W.s.cw, this.W.s.cv);
      if ($$6 > 0.0F && !this.W.s.a(bkk.i)) {
         this.c($$0, $$6);
      }

      if (this.W.q.l() == csc.d) {
         this.ai.a($$0);
      } else if (!this.W.m.Z) {
         this.a($$1, $$0);
      }

      if (!this.W.m.Z) {
         RenderSystem.enableBlend();
         this.d($$0);
         this.W.aF().a("bossHealth");
         this.ak.a($$0);
         this.W.aF().c();
         if (this.W.q.a()) {
            this.e($$0);
         }

         this.f($$0);
         RenderSystem.disableBlend();
         int $$7 = this.av / 2 - 91;
         blw $$8 = this.W.s.q();
         if ($$8 != null) {
            this.a($$8, $$0, $$7);
         } else if (this.W.q.e()) {
            this.a($$0, $$7);
         }

         if (this.W.q.l() != csc.d) {
            this.b($$0);
         } else if (this.W.s.P_()) {
            this.ai.b($$0);
         }
      }

      if (this.W.s.fX() > 0) {
         this.W.aF().a("sleep");
         float $$9 = (float)this.W.s.fX();
         float $$10 = $$9 / 100.0F;
         if ($$10 > 1.0F) {
            $$10 = 1.0F - ($$9 - 100.0F) / 10.0F;
         }

         int $$11 = (int)(220.0F * $$10) << 24 | 1052704;
         $$0.a(frh.C(), 0, 0, this.av, this.aw, $$11);
         this.W.aF().c();
      }

      if (this.W.H()) {
         this.c($$0);
      }

      this.a($$0);
      if (this.ag.d()) {
         this.ag.a($$0);
      }

      if (!this.W.m.Z) {
         if (this.aa != null && this.ab > 0) {
            this.W.aF().a("overlayMessage");
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
                  $$14 = atq.h($$12 / 50.0F, 0.7F, 0.6F) & 16777215;
               }

               int $$15 = $$13 << 24 & 0xFF000000;
               int $$16 = $$3.a(this.aa);
               this.a($$0, $$3, -4, $$16, 16777215 | $$15);
               $$0.b($$3, this.aa, -$$16 / 2, -4, $$14 | $$15);
               $$0.c().b();
            }

            this.W.aF().c();
         }

         if (this.am != null && this.al > 0) {
            this.W.aF().a("titleAndSubtitle");
            float $$17 = (float)this.al - $$1;
            int $$18 = 255;
            if (this.al > this.aq + this.ap) {
               float $$19 = (float)(this.ao + this.ap + this.aq) - $$17;
               $$18 = (int)($$19 * 255.0F / (float)this.ao);
            }

            if (this.al <= this.aq) {
               $$18 = (int)($$17 * 255.0F / (float)this.aq);
            }

            $$18 = atq.a($$18, 0, 255);
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

            this.W.aF().c();
         }

         this.ah.a($$0);
         eky $$23 = this.W.r.J();
         ekv $$24 = null;
         ekw $$25 = $$23.g(this.W.s.cy());
         if ($$25 != null) {
            eku $$26 = eku.a($$25.n());
            if ($$26 != null) {
               $$24 = $$23.a($$26);
            }
         }

         ekv $$27 = $$24 != null ? $$24 : $$23.a(eku.b);
         if ($$27 != null) {
            this.a($$0, $$27);
         }

         RenderSystem.enableBlend();
         int $$28 = atq.a(this.W.n.e() * (double)$$2.o() / (double)$$2.m());
         int $$29 = atq.a(this.W.n.f() * (double)$$2.p() / (double)$$2.n());
         this.W.aF().a("chat");
         this.Y.a($$0, this.Z, $$28, $$29);
         this.W.aF().c();
         $$27 = $$23.a(eku.a);
         if (!this.W.m.L.e() || this.W.Q() && this.W.s.cn.n().size() <= 1 && $$27 == null) {
            this.aj.a(false);
         } else {
            this.aj.a(true);
            this.aj.a($$0, this.av, $$23, $$27);
         }

         this.g($$0);
      }
   }

   private void a(eut $$0, eur $$1, int $$2, int $$3, int $$4) {
      int $$5 = this.W.m.b(0.0F);
      if ($$5 != 0) {
         int $$6 = -$$3 / 2;
         $$0.a($$6 - 2, $$2 - 2, $$6 + $$3 + 2, $$2 + 9 + 2, ata.b.a($$5, $$4));
      }
   }

   private void d(eut $$0) {
      etm $$1 = this.W.m;
      if ($$1.ax().a()) {
         if (this.W.q.l() != csc.d || this.a(this.W.v)) {
            if (this.ag.d() && !this.W.s.gj() && !$$1.S().c()) {
               est $$2 = this.W.j.m();
               eob $$3 = RenderSystem.getModelViewStack();
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
               if (this.W.m.B().c() == ess.b) {
                  float $$5 = this.W.s.B(0.0F);
                  boolean $$6 = false;
                  if (this.W.u != null && this.W.u instanceof bll && $$5 >= 1.0F) {
                     $$6 = this.W.s.gm() > 5.0F;
                     $$6 &= this.W.u.bx();
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

   private boolean a(ejx $$0) {
      if ($$0 == null) {
         return false;
      } else if ($$0.c() == ejx.a.c) {
         return ((ejw)$$0).a() instanceof bje;
      } else if ($$0.c() == ejx.a.b) {
         hx $$1 = ((ejv)$$0).a();
         csf $$2 = this.W.r;
         return $$2.a_($$1).b($$2, $$1) != null;
      } else {
         return false;
      }
   }

   protected void a(eut $$0) {
      Collection<bki> $$1 = this.W.s.et();
      if (!$$1.isEmpty()) {
         if (this.W.y instanceof fcq $$2 && $$2.G()) {
            return;
         }

         RenderSystem.enableBlend();
         int $$3 = 0;
         int $$4 = 0;
         gcx $$5 = this.W.aD();
         List<Runnable> $$6 = Lists.newArrayListWithExpectedSize($$1.size());

         for (bki $$7 : Ordering.natural().reverse().sortedCopy($$1)) {
            bkg $$8 = $$7.c();
            if ($$7.h()) {
               int $$9 = this.av;
               int $$10 = 1;
               if (this.W.H()) {
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
                     $$11 = atq.a((float)$$12 / 10.0F / 5.0F * 0.5F, 0.0F, 0.5F)
                        + atq.b((float)$$12 * (float) Math.PI / 5.0F) * atq.a((float)$$13 / 10.0F * 0.25F, 0.0F, 0.25F);
                  }
               }

               gbz $$14 = $$5.a($$8);
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

   private void a(float $$0, eut $$1) {
      cdz $$2 = this.m();
      if ($$2 != null) {
         clo $$3 = $$2.eV();
         blf $$4 = $$2.fn().e();
         int $$5 = this.av / 2;
         int $$6 = 182;
         int $$7 = 91;
         $$1.c().a();
         $$1.c().a(0.0F, 0.0F, -90.0F);
         $$1.a(h, $$5 - 91, this.aw - 22, 182, 22);
         $$1.a(i, $$5 - 91 - 1 + $$2.fT().l * 20, this.aw - 22 - 1, 24, 23);
         if (!$$3.b()) {
            if ($$4 == blf.a) {
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
            this.a($$1, $$10, $$11, $$0, $$2, $$2.fT().i.get($$9), $$8++);
         }

         if (!$$3.b()) {
            int $$12 = this.aw - 16 - 3;
            if ($$4 == blf.a) {
               this.a($$1, $$5 - 91 - 26, $$12, $$0, $$2, $$3, $$8++);
            } else {
               this.a($$1, $$5 + 91 + 10, $$12, $$0, $$2, $$3, $$8++);
            }
         }

         RenderSystem.enableBlend();
         if (this.W.m.B().c() == ess.c) {
            float $$13 = this.W.s.B(0.0F);
            if ($$13 < 1.0F) {
               int $$14 = this.aw - 20;
               int $$15 = $$5 + 91 + 6;
               if ($$4 == blf.b) {
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

   public void a(blw $$0, eut $$1, int $$2) {
      this.W.aF().a("jumpBar");
      float $$3 = this.W.s.u();
      int $$4 = 182;
      int $$5 = (int)($$3 * 183.0F);
      int $$6 = this.aw - 32 + 3;
      $$1.a(n, $$2, $$6, 182, 5);
      if ($$0.ad_() > 0) {
         $$1.a(o, $$2, $$6, 182, 5);
      } else if ($$5 > 0) {
         $$1.a(p, 182, 5, 0, 0, $$2, $$6, $$5, 5);
      }

      this.W.aF().c();
   }

   public void a(eut $$0, int $$1) {
      this.W.aF().a("expBar");
      int $$2 = this.W.s.gc();
      if ($$2 > 0) {
         int $$3 = 182;
         int $$4 = (int)(this.W.s.ch * 183.0F);
         int $$5 = this.aw - 32 + 3;
         $$0.a(q, $$1, $$5, 182, 5);
         if ($$4 > 0) {
            $$0.a(r, 182, 5, 0, 0, $$1, $$5, $$4, 5);
         }
      }

      this.W.aF().c();
      if (this.W.s.cf > 0) {
         this.W.aF().a("expLevel");
         String $$6 = this.W.s.cf + "";
         int $$7 = (this.av - this.f().b($$6)) / 2;
         int $$8 = this.aw - 31 - 4;
         $$0.a(this.f(), $$6, $$7 + 1, $$8, 0, false);
         $$0.a(this.f(), $$6, $$7 - 1, $$8, 0, false);
         $$0.a(this.f(), $$6, $$7, $$8 + 1, 0, false);
         $$0.a(this.f(), $$6, $$7, $$8 - 1, 0, false);
         $$0.a(this.f(), $$6, $$7, $$8, 8453920, false);
         this.W.aF().c();
      }
   }

   public void b(eut $$0) {
      this.W.aF().a("selectedItemName");
      if (this.ae > 0 && !this.af.b()) {
         vj $$1 = uv.i().b(this.af.y()).a(this.af.C().e);
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

      this.W.aF().c();
   }

   public void c(eut $$0) {
      this.W.aF().a("demo");
      uv $$1;
      if (this.W.r.W() >= 120500L) {
         $$1 = K;
      } else {
         $$1 = uv.a("demo.remainingTime", aul.a((int)(120500L - this.W.r.W())));
      }

      int $$3 = this.f().a($$1);
      $$0.b(this.f(), $$1, this.av - $$3 - 10, 5, 16777215);
      this.W.aF().c();
   }

   private void a(eut $$0, ekv $$1) {
      eky $$2 = $$1.a();
      Collection<ekx> $$3 = $$2.i($$1);
      List<ekx> $$4 = $$3.stream().filter($$0x -> $$0x.e() != null && !$$0x.e().startsWith("#")).collect(Collectors.toList());
      if ($$4.size() > 15) {
         $$3 = Lists.newArrayList(Iterables.skip($$4, $$3.size() - 15));
      } else {
         $$3 = $$4;
      }

      List<Pair<ekx, uv>> $$5 = Lists.newArrayListWithCapacity($$3.size());
      uv $$6 = $$1.d();
      int $$7 = this.f().a($$6);
      int $$8 = $$7;
      int $$9 = this.f().b(": ");

      for (ekx $$10 : $$3) {
         ekw $$11 = $$2.g($$10.e());
         uv $$12 = ekw.a($$11, uv.b($$10.e()));
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

      for (Pair<ekx, uv> $$20 : $$5) {
         $$17++;
         ekx $$21 = (ekx)$$20.getFirst();
         uv $$22 = (uv)$$20.getSecond();
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

   private cdz m() {
      return !(this.W.al() instanceof cdz) ? null : (cdz)this.W.al();
   }

   private bll n() {
      cdz $$0 = this.m();
      if ($$0 != null) {
         bkv $$1 = $$0.da();
         if ($$1 == null) {
            return null;
         }

         if ($$1 instanceof bll) {
            return (bll)$$1;
         }
      }

      return null;
   }

   private int a(bll $$0) {
      if ($$0 != null && $$0.bA()) {
         float $$1 = $$0.eN();
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

   private void e(eut $$0) {
      cdz $$1 = this.m();
      if ($$1 != null) {
         int $$2 = atq.f($$1.ew());
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
         cgn $$6 = $$1.gd();
         int $$7 = $$6.a();
         int $$8 = this.av / 2 - 91;
         int $$9 = this.av / 2 + 91;
         int $$10 = this.aw - 39;
         float $$11 = Math.max((float)$$1.b(bmr.l), (float)Math.max($$5, $$2));
         int $$12 = atq.f($$1.fl());
         int $$13 = atq.f(($$11 + (float)$$12) / 2.0F / 10.0F);
         int $$14 = Math.max(10 - ($$13 - 2), 3);
         int $$15 = $$10 - ($$13 - 1) * $$14 - 10;
         int $$16 = $$10 - 10;
         int $$17 = $$1.eK();
         int $$18 = -1;
         if ($$1.a(bkk.j)) {
            $$18 = this.Z % atq.f($$11 + 5.0F);
         }

         this.W.aF().a("armor");

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

         this.W.aF().b("health");
         this.a($$0, $$1, $$8, $$10, $$14, $$18, $$11, $$2, $$5, $$12, $$3);
         bll $$21 = this.n();
         int $$22 = this.a($$21);
         if ($$22 == 0) {
            this.W.aF().b("food");

            for (int $$23 = 0; $$23 < 10; $$23++) {
               int $$24 = $$10;
               agm $$25;
               agm $$26;
               agm $$27;
               if ($$1.a(bkk.q)) {
                  $$25 = v;
                  $$26 = w;
                  $$27 = x;
               } else {
                  $$25 = y;
                  $$26 = z;
                  $$27 = A;
               }

               if ($$1.gd().e() <= 0.0F && this.Z % ($$7 * 3 + 1) == 0) {
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

         this.W.aF().b("air");
         int $$32 = $$1.ch();
         int $$33 = Math.min($$1.ci(), $$32);
         if ($$1.a(arp.a) || $$33 < $$32) {
            int $$34 = this.a($$22) - 1;
            $$16 -= $$34 * 10;
            int $$35 = atq.c((double)($$33 - 2) * 10.0 / (double)$$32);
            int $$36 = atq.c((double)$$33 * 10.0 / (double)$$32) - $$35;

            for (int $$37 = 0; $$37 < $$35 + $$36; $$37++) {
               if ($$37 < $$35) {
                  $$0.a(B, $$9 - $$37 * 8 - 9, $$16, 9, 9);
               } else {
                  $$0.a(C, $$9 - $$37 * 8 - 9, $$16, 9, 9);
               }
            }
         }

         this.W.aF().c();
      }
   }

   private void a(eut $$0, cdz $$1, int $$2, int $$3, int $$4, int $$5, float $$6, int $$7, int $$8, int $$9, boolean $$10) {
      eus.a $$11 = eus.a.a($$1);
      boolean $$12 = $$1.dN().B_().n();
      int $$13 = atq.c((double)$$6 / 2.0);
      int $$14 = atq.c((double)$$9 / 2.0);
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

         this.a($$0, eus.a.a, $$19, $$20, $$12, $$10, false);
         int $$21 = $$16 * 2;
         boolean $$22 = $$16 >= $$13;
         if ($$22) {
            int $$23 = $$21 - $$15;
            if ($$23 < $$9) {
               boolean $$24 = $$23 + 1 == $$9;
               this.a($$0, $$11 == eus.a.d ? $$11 : eus.a.e, $$19, $$20, $$12, false, $$24);
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

   private void a(eut $$0, eus.a $$1, int $$2, int $$3, boolean $$4, boolean $$5, boolean $$6) {
      $$0.a($$1.a($$4, $$6, $$5), $$2, $$3, 9, 9);
   }

   private void f(eut $$0) {
      bll $$1 = this.n();
      if ($$1 != null) {
         int $$2 = this.a($$1);
         if ($$2 != 0) {
            int $$3 = (int)Math.ceil((double)$$1.ew());
            this.W.aF().b("mountHealth");
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

   private void a(eut $$0, agm $$1, float $$2) {
      RenderSystem.disableDepthTest();
      RenderSystem.depthMask(false);
      $$0.a(1.0F, 1.0F, 1.0F, $$2);
      $$0.a($$1, 0, 0, -90, 0.0F, 0.0F, this.av, this.aw, this.av, this.aw);
      RenderSystem.depthMask(true);
      RenderSystem.enableDepthTest();
      $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
   }

   private void b(eut $$0, float $$1) {
      float $$2 = (float)Math.min(this.av, this.aw);
      float $$4 = Math.min((float)this.av / $$2, (float)this.aw / $$2) * $$1;
      int $$5 = atq.d($$2 * $$4);
      int $$6 = atq.d($$2 * $$4);
      int $$7 = (this.av - $$5) / 2;
      int $$8 = (this.aw - $$6) / 2;
      int $$9 = $$7 + $$5;
      int $$10 = $$8 + $$6;
      $$0.a(I, $$7, $$8, -90, 0.0F, 0.0F, $$5, $$6, $$5, $$6);
      $$0.a(frh.C(), 0, $$10, this.av, this.aw, -90, -16777216);
      $$0.a(frh.C(), 0, 0, this.av, $$8, -90, -16777216);
      $$0.a(frh.C(), 0, $$8, $$7, $$10, -90, -16777216);
      $$0.a(frh.C(), $$9, $$8, this.av, $$10, -90, -16777216);
   }

   private void a(bkv $$0) {
      if ($$0 != null) {
         hx $$1 = hx.a($$0.ds(), $$0.dw(), $$0.dy());
         float $$2 = fqy.a($$0.dN().E_(), $$0.dN().z($$1));
         float $$3 = atq.a(1.0F - $$2, 0.0F, 1.0F);
         this.a = this.a + ($$3 - this.a) * 0.01F;
      }
   }

   private void a(eut $$0, bkv $$1) {
      dje $$2 = this.W.r.D_();
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
         $$3 = atq.a($$3, 0.0F, 1.0F);
         $$0.a(0.0F, $$3, $$3, 1.0F);
      } else {
         float $$6 = this.a;
         $$6 = atq.a($$6, 0.0F, 1.0F);
         $$0.a($$6, $$6, $$6, 1.0F);
      }

      $$0.a(G, 0, 0, -90, 0.0F, 0.0F, this.av, this.aw, this.av, this.aw);
      RenderSystem.depthMask(true);
      RenderSystem.enableDepthTest();
      $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
      RenderSystem.defaultBlendFunc();
   }

   private void c(eut $$0, float $$1) {
      if ($$1 < 1.0F) {
         $$1 *= $$1;
         $$1 *= $$1;
         $$1 = $$1 * 0.8F + 0.2F;
      }

      RenderSystem.disableDepthTest();
      RenderSystem.depthMask(false);
      $$0.a(1.0F, 1.0F, 1.0F, $$1);
      gbz $$2 = this.W.am().a().a(cvh.ed.o());
      $$0.a(0, 0, -90, this.av, this.aw, $$2);
      RenderSystem.depthMask(true);
      RenderSystem.enableDepthTest();
      $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
   }

   private void a(eut $$0, int $$1, int $$2, float $$3, cdz $$4, clo $$5, int $$6) {
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
      bkv $$0 = this.W.al();
      if ($$0 != null) {
         this.a($$0);
      }

      if (this.W.s != null) {
         clo $$1 = this.W.s.fT().f();
         if ($$1.b()) {
            this.ae = 0;
         } else if (this.af.b() || !$$1.a(this.af.d()) || !$$1.y().equals(this.af.y())) {
            this.ae = (int)(40.0 * this.W.m.z().c());
         } else if (this.ae > 0) {
            this.ae--;
         }

         this.af = $$1;
      }

      this.Y.a();
   }

   private void p() {
      MinecraftServer $$0 = this.W.S();
      boolean $$1 = $$0 != null && $$0.bd();
      this.ay = this.ax;
      this.ax = atq.i(0.2F, this.ax, $$1 ? 1.0F : 0.0F);
   }

   public void a(uv $$0) {
      uv $$1 = uv.a("record.nowPlaying", $$0);
      this.a($$1, true);
      this.W.aU().c($$1);
   }

   public void a(uv $$0, boolean $$1) {
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

   public void b(uv $$0) {
      this.an = $$0;
   }

   public void c(uv $$0) {
      this.am = $$0;
      this.al = this.ao + this.ap + this.aq;
   }

   public void c() {
      this.am = null;
      this.an = null;
      this.al = 0;
   }

   public evf d() {
      return this.Y;
   }

   public int e() {
      return this.Z;
   }

   public eur f() {
      return this.W.h;
   }

   public exc g() {
      return this.ai;
   }

   public ewf h() {
      return this.aj;
   }

   public void i() {
      this.aj.a();
      this.ak.a();
      this.W.ax().a();
      this.ag.m();
      this.Y.a(true);
   }

   public evd j() {
      return this.ak;
   }

   public evm k() {
      return this.ag;
   }

   public void l() {
      this.ag.a();
   }

   private void g(eut $$0) {
      if (this.W.m.ac().c() && (this.ax > 0.0F || this.ay > 0.0F)) {
         int $$1 = atq.d(255.0F * atq.a(atq.i(this.W.ar(), this.ay, this.ax), 0.0F, 1.0F));
         if ($$1 > 8) {
            eur $$2 = this.f();
            int $$3 = $$2.a(L);
            int $$4 = 16777215 | $$1 << 24 & 0xFF000000;
            $$0.b($$2, L, this.av - $$3 - 10, this.aw - 15, $$4);
         }
      }
   }

   static enum a {
      a(
         new agm("hud/heart/container"),
         new agm("hud/heart/container_blinking"),
         new agm("hud/heart/container"),
         new agm("hud/heart/container_blinking"),
         new agm("hud/heart/container_hardcore"),
         new agm("hud/heart/container_hardcore_blinking"),
         new agm("hud/heart/container_hardcore"),
         new agm("hud/heart/container_hardcore_blinking")
      ),
      b(
         new agm("hud/heart/full"),
         new agm("hud/heart/full_blinking"),
         new agm("hud/heart/half"),
         new agm("hud/heart/half_blinking"),
         new agm("hud/heart/hardcore_full"),
         new agm("hud/heart/hardcore_full_blinking"),
         new agm("hud/heart/hardcore_half"),
         new agm("hud/heart/hardcore_half_blinking")
      ),
      c(
         new agm("hud/heart/poisoned_full"),
         new agm("hud/heart/poisoned_full_blinking"),
         new agm("hud/heart/poisoned_half"),
         new agm("hud/heart/poisoned_half_blinking"),
         new agm("hud/heart/poisoned_hardcore_full"),
         new agm("hud/heart/poisoned_hardcore_full_blinking"),
         new agm("hud/heart/poisoned_hardcore_half"),
         new agm("hud/heart/poisoned_hardcore_half_blinking")
      ),
      d(
         new agm("hud/heart/withered_full"),
         new agm("hud/heart/withered_full_blinking"),
         new agm("hud/heart/withered_half"),
         new agm("hud/heart/withered_half_blinking"),
         new agm("hud/heart/withered_hardcore_full"),
         new agm("hud/heart/withered_hardcore_full_blinking"),
         new agm("hud/heart/withered_hardcore_half"),
         new agm("hud/heart/withered_hardcore_half_blinking")
      ),
      e(
         new agm("hud/heart/absorbing_full"),
         new agm("hud/heart/absorbing_full_blinking"),
         new agm("hud/heart/absorbing_half"),
         new agm("hud/heart/absorbing_half_blinking"),
         new agm("hud/heart/absorbing_hardcore_full"),
         new agm("hud/heart/absorbing_hardcore_full_blinking"),
         new agm("hud/heart/absorbing_hardcore_half"),
         new agm("hud/heart/absorbing_hardcore_half_blinking")
      ),
      f(
         new agm("hud/heart/frozen_full"),
         new agm("hud/heart/frozen_full_blinking"),
         new agm("hud/heart/frozen_half"),
         new agm("hud/heart/frozen_half_blinking"),
         new agm("hud/heart/frozen_hardcore_full"),
         new agm("hud/heart/frozen_hardcore_full_blinking"),
         new agm("hud/heart/frozen_hardcore_half"),
         new agm("hud/heart/frozen_hardcore_half_blinking")
      );

      private final agm g;
      private final agm h;
      private final agm i;
      private final agm j;
      private final agm k;
      private final agm l;
      private final agm m;
      private final agm n;

      private a(agm $$0, agm $$1, agm $$2, agm $$3, agm $$4, agm $$5, agm $$6, agm $$7) {
         this.g = $$0;
         this.h = $$1;
         this.i = $$2;
         this.j = $$3;
         this.k = $$4;
         this.l = $$5;
         this.m = $$6;
         this.n = $$7;
      }

      public agm a(boolean $$0, boolean $$1, boolean $$2) {
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

      static eus.a a(cdz $$0) {
         eus.a $$1;
         if ($$0.a(bkk.s)) {
            $$1 = c;
         } else if ($$0.a(bkk.t)) {
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
