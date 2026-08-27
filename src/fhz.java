import com.google.common.collect.Lists;
import com.google.common.collect.Ordering;
import com.mojang.blaze3d.platform.GlStateManager;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;
import org.joml.Matrix4fStack;

public class fhz {
   private static final akt b = new akt("hud/crosshair");
   private static final akt c = new akt("hud/crosshair_attack_indicator_full");
   private static final akt d = new akt("hud/crosshair_attack_indicator_background");
   private static final akt e = new akt("hud/crosshair_attack_indicator_progress");
   private static final akt f = new akt("hud/effect_background_ambient");
   private static final akt g = new akt("hud/effect_background");
   private static final akt h = new akt("hud/hotbar");
   private static final akt i = new akt("hud/hotbar_selection");
   private static final akt j = new akt("hud/hotbar_offhand_left");
   private static final akt k = new akt("hud/hotbar_offhand_right");
   private static final akt l = new akt("hud/hotbar_attack_indicator_background");
   private static final akt m = new akt("hud/hotbar_attack_indicator_progress");
   private static final akt n = new akt("hud/jump_bar_background");
   private static final akt o = new akt("hud/jump_bar_cooldown");
   private static final akt p = new akt("hud/jump_bar_progress");
   private static final akt q = new akt("hud/experience_bar_background");
   private static final akt r = new akt("hud/experience_bar_progress");
   private static final akt s = new akt("hud/armor_empty");
   private static final akt t = new akt("hud/armor_half");
   private static final akt u = new akt("hud/armor_full");
   private static final akt v = new akt("hud/food_empty_hunger");
   private static final akt w = new akt("hud/food_half_hunger");
   private static final akt x = new akt("hud/food_full_hunger");
   private static final akt y = new akt("hud/food_empty");
   private static final akt z = new akt("hud/food_half");
   private static final akt A = new akt("hud/food_full");
   private static final akt B = new akt("hud/air");
   private static final akt C = new akt("hud/air_bursting");
   private static final akt D = new akt("hud/heart/vehicle_container");
   private static final akt E = new akt("hud/heart/vehicle_full");
   private static final akt F = new akt("hud/heart/vehicle_half");
   private static final akt G = new akt("textures/misc/vignette.png");
   private static final akt H = new akt("textures/misc/pumpkinblur.png");
   private static final akt I = new akt("textures/misc/spyglass_scope.png");
   private static final akt J = new akt("textures/misc/powder_snow_outline.png");
   private static final Comparator<exr> K = Comparator.comparing(exr::d).reversed().thenComparing(exr::c, String.CASE_INSENSITIVE_ORDER);
   private static final xe L = xe.c("demo.demoExpired");
   private static final xe M = xe.c("menu.savingLevel");
   private static final int N = 16777215;
   private static final float O = 5.0F;
   private static final int P = 10;
   private static final int Q = 10;
   private static final String R = ": ";
   private static final float S = 0.2F;
   private static final int T = 9;
   private static final int U = 8;
   private static final float V = 0.2F;
   private final ayt W = ayt.a();
   private final fgj X;
   private final fio Y;
   private int Z;
   @Nullable
   private xe aa;
   private int ab;
   private boolean ac;
   private boolean ad;
   public float a = 1.0F;
   private int ae;
   private cuh af = cuh.i;
   private final fiv ag;
   private final fjv ah;
   private final fkm ai;
   private final fjo aj;
   private final fim ak;
   private int al;
   @Nullable
   private xe am;
   @Nullable
   private xe an;
   private int ao;
   private int ap;
   private int aq;
   private int ar;
   private int as;
   private long at;
   private long au;
   private float av;
   private float aw;
   private final fic ax = new fic();
   private float ay;
   @Nullable
   private fia.a az = null;
   private String aA = "";

   public fhz(fgj $$0) {
      this.X = $$0;
      this.ag = new fiv($$0);
      this.ai = new fkm($$0);
      this.Y = new fio($$0);
      this.aj = new fjo($$0, this);
      this.ak = new fim($$0);
      this.ah = new fjv($$0);
      this.a();
      fic $$1 = new fic().a(this::c).a(this::f).a(this::k).a(this::m).a(this::o).a(this::l).a(($$0x, $$1x) -> this.ak.a($$0x));
      fic $$2 = new fic().a(this::p).a(($$0x, $$1x) -> {
         if (this.ag.d()) {
            this.ag.a($$0x);
         }
      }).a(this::i).a(this::e).a(this::g).a(this::h).a(this::j).a(($$0x, $$1x) -> this.ah.a($$0x));
      this.ax.a($$1, () -> !$$0.m.aa).a(this::d).a($$2, () -> !$$0.m.aa);
   }

   public void a() {
      this.ao = 10;
      this.ap = 70;
      this.aq = 20;
   }

   public void a(fia $$0, float $$1) {
      RenderSystem.enableDepthTest();
      this.ax.a($$0, $$1);
      RenderSystem.disableDepthTest();
   }

   private void c(fia $$0, float $$1) {
      if (fgj.N()) {
         this.a($$0, this.X.ao());
      }

      float $$2 = this.X.av();
      this.ay = aym.i(0.5F * $$2, this.ay, 1.125F);
      if (this.X.m.aA().a()) {
         if (this.X.s.gL()) {
            this.q($$0, this.ay);
         } else {
            this.ay = 0.5F;
            cuh $$3 = this.X.s.gl().e(3);
            if ($$3.a(dfe.eU.q())) {
               this.a($$0, H, 1.0F);
            }
         }
      }

      if (this.X.s.cr() > 0) {
         this.a($$0, J, this.X.s.cs());
      }

      float $$4 = aym.i($$1, this.X.s.cX, this.X.s.cW);
      if ($$4 > 0.0F && !this.X.s.b(brj.i)) {
         this.r($$0, $$4);
      }
   }

   private void d(fia $$0, float $$1) {
      if (this.X.s.gp() > 0) {
         this.X.aJ().a("sleep");
         float $$2 = (float)this.X.s.gp();
         float $$3 = $$2 / 100.0F;
         if ($$3 > 1.0F) {
            $$3 = 1.0F - ($$2 - 100.0F) / 10.0F;
         }

         int $$4 = (int)(220.0F * $$3) << 24 | 1052704;
         $$0.a(gfo.F(), 0, 0, $$0.a(), $$0.b(), $$4);
         this.X.aJ().c();
      }
   }

   private void e(fia $$0, float $$1) {
      fhy $$2 = this.f();
      if (this.aa != null && this.ab > 0) {
         this.X.aJ().a("overlayMessage");
         float $$3 = (float)this.ab - $$1;
         int $$4 = (int)($$3 * 255.0F / 20.0F);
         if ($$4 > 255) {
            $$4 = 255;
         }

         if ($$4 > 8) {
            $$0.c().a();
            $$0.c().a((float)($$0.a() / 2), (float)($$0.b() - 68), 0.0F);
            int $$5 = 16777215;
            if (this.ac) {
               $$5 = aym.h($$3 / 50.0F, 0.7F, 0.6F) & 16777215;
            }

            int $$6 = $$4 << 24 & 0xFF000000;
            int $$7 = $$2.a(this.aa);
            this.a($$0, $$2, -4, $$7, 16777215 | $$6);
            $$0.b($$2, this.aa, -$$7 / 2, -4, $$5 | $$6);
            $$0.c().b();
         }

         this.X.aJ().c();
      }
   }

   private void f(fia $$0, float $$1) {
      cuh $$2 = this.X.s.gl().e(3);
      if (!$$2.a(cuk.AH)) {
         this.az = null;
      } else {
         float $$3 = (float)this.e() + $$1;
         fbc $$4 = $$0.c();
         fhy $$5 = this.f();
         cuh $$6 = new cuh(cuk.AH);
         $$6.b(ke.ag, true);
         if (this.az == null || !this.aA.equals(this.X.s.E())) {
            this.aA = this.X.s.E();
            xe $$7 = xe.a(this.aA, this.X.s.P_(), this.X.m.B.k(), this.X.m.H.k());
            this.az = $$0.a((double)$$3, 2.0, $$5, $$7.getString(), 16777215, $$0.a() - 72);
         }

         if (this.X.s.ap().a(cly.cn)) {
            this.X.L().b(new agv(agv.a.c));
            String $$8 = avz.i.b(avz.aJ).a(this.X.s.j().a(avz.i.b(avz.aJ)));
            RenderSystem.disableDepthTest();
            RenderSystem.depthMask(false);
            $$4.a();
            $$0.a($$5, xe.a("stat.minecraft.potato_quest_time_format", $$8), $$0.a() / 2, 48, 16777215);
            $$4.b();
            RenderSystem.enableDepthTest();
            RenderSystem.depthMask(true);
         }

         if (!((double)$$3 - this.az.a() > 200.0)) {
            RenderSystem.disableDepthTest();
            RenderSystem.depthMask(false);
            $$0.a(0, 0, $$0.a(), 32, 0, 1073741824);
            $$0.b(0, 32, $$0.a(), 64, 1073741824, 0);
            $$4.a();
            $$4.a(-4.0F, -12.0F, 0.0F);
            $$4.b(4.0F, 4.0F, 1.0F);
            $$4.a(a.f.rotationDegrees(aym.a(((float)this.Z + $$1) / 5.0F) * 20.0F), 8.0F, 8.0F, 0.0F);
            $$0.a($$6, 0, 0);
            $$4.b();
            $$4.a();
            if (this.az.a((double)$$3, 72, 16)) {
               this.X.ak().a(guh.a(avo.ss, aym.b(this.X.s.et(), 1.25F, 1.75F)));
            }

            $$4.b();
            RenderSystem.enableDepthTest();
            RenderSystem.depthMask(true);
         }
      }
   }

   private void g(fia $$0, float $$1) {
      if (this.am != null && this.al > 0) {
         fhy $$2 = this.f();
         this.X.aJ().a("titleAndSubtitle");
         float $$3 = (float)this.al - $$1;
         int $$4 = 255;
         if (this.al > this.aq + this.ap) {
            float $$5 = (float)(this.ao + this.ap + this.aq) - $$3;
            $$4 = (int)($$5 * 255.0F / (float)this.ao);
         }

         if (this.al <= this.aq) {
            $$4 = (int)($$3 * 255.0F / (float)this.aq);
         }

         $$4 = aym.a($$4, 0, 255);
         if ($$4 > 8) {
            $$0.c().a();
            $$0.c().a((float)($$0.a() / 2), (float)($$0.b() / 2), 0.0F);
            $$0.c().a();
            $$0.c().b(4.0F, 4.0F, 4.0F);
            int $$6 = $$4 << 24 & 0xFF000000;
            int $$7 = $$2.a(this.am);
            this.a($$0, $$2, -10, $$7, 16777215 | $$6);
            $$0.b($$2, this.am, -$$7 / 2, -10, 16777215 | $$6);
            $$0.c().b();
            if (this.an != null) {
               $$0.c().a();
               $$0.c().b(2.0F, 2.0F, 2.0F);
               int $$8 = $$2.a(this.an);
               this.a($$0, $$2, 5, $$8, 16777215 | $$6);
               $$0.b($$2, this.an, -$$8 / 2, 5, 16777215 | $$6);
               $$0.c().b();
            }

            $$0.c().b();
         }

         this.X.aJ().c();
      }
   }

   private void h(fia $$0, float $$1) {
      if (!this.Y.e()) {
         fag $$2 = this.X.aP();
         int $$3 = aym.a(this.X.n.e() * (double)$$2.o() / (double)$$2.m());
         int $$4 = aym.a(this.X.n.f() * (double)$$2.p() / (double)$$2.n());
         this.Y.a($$0, this.Z, $$3, $$4, false);
      }
   }

   private void i(fia $$0, float $$1) {
      exy $$2 = this.X.r.M();
      exq $$3 = null;
      ext $$4 = $$2.e(this.X.s.cG());
      if ($$4 != null) {
         exp $$5 = exp.a($$4.n());
         if ($$5 != null) {
            $$3 = $$2.a($$5);
         }
      }

      exq $$6 = $$3 != null ? $$3 : $$2.a(exp.b);
      if ($$6 != null) {
         this.a($$0, $$6);
      }
   }

   private void j(fia $$0, float $$1) {
      exy $$2 = this.X.r.M();
      exq $$3 = $$2.a(exp.a);
      if (!this.X.m.L.e() || this.X.T() && this.X.s.h.m().size() <= 1 && $$3 == null) {
         this.aj.a(false);
      } else {
         this.aj.a(true);
         this.aj.a($$0, $$0.a(), $$2, $$3);
      }
   }

   private void a(fia $$0, fhy $$1, int $$2, int $$3, int $$4) {
      int $$5 = this.X.m.b(0.0F);
      if ($$5 != 0) {
         int $$6 = -$$3 / 2;
         $$0.a($$6 - 2, $$2 - 2, $$6 + $$3 + 2, $$2 + 9 + 2, axw.b.a($$5, $$4));
      }
   }

   private void k(fia $$0, float $$1) {
      fgn $$2 = this.X.m;
      if ($$2.aA().a()) {
         if (this.X.q.j() != dbx.d || this.a(this.X.v)) {
            RenderSystem.enableBlend();
            if (this.ag.d() && !this.X.s.gD() && !$$2.V().c()) {
               ffu $$3 = this.X.j.m();
               Matrix4fStack $$4 = RenderSystem.getModelViewStack();
               $$4.pushMatrix();
               $$4.mul($$0.c().c().a());
               $$4.translate((float)($$0.a() / 2), (float)($$0.b() / 2), 0.0F);
               $$4.rotateX(-$$3.d() * (float) (Math.PI / 180.0));
               $$4.rotateY($$3.e() * (float) (Math.PI / 180.0));
               $$4.scale(-1.0F, -1.0F, -1.0F);
               RenderSystem.applyModelViewMatrix();
               RenderSystem.renderCrosshair(10);
               $$4.popMatrix();
               RenderSystem.applyModelViewMatrix();
            } else {
               RenderSystem.blendFuncSeparate(
                  GlStateManager.SourceFactor.ONE_MINUS_DST_COLOR,
                  GlStateManager.DestFactor.ONE_MINUS_SRC_COLOR,
                  GlStateManager.SourceFactor.ONE,
                  GlStateManager.DestFactor.ZERO
               );
               int $$5 = 15;
               $$0.a(b, ($$0.a() - 15) / 2, ($$0.b() - 15) / 2, 15, 15);
               if (this.X.m.D().c() == fft.b) {
                  float $$6 = this.X.s.D(0.0F);
                  boolean $$7 = false;
                  if (this.X.u != null && this.X.u instanceof bso && $$6 >= 1.0F) {
                     $$7 = this.X.s.gG() > 5.0F;
                     $$7 &= this.X.u.bI();
                  }

                  int $$8 = $$0.b() / 2 - 7 + 16;
                  int $$9 = $$0.a() / 2 - 8;
                  if ($$7) {
                     $$0.a(c, $$9, $$8, 16, 16);
                  } else if ($$6 < 1.0F) {
                     int $$10 = (int)($$6 * 17.0F);
                     $$0.a(d, $$9, $$8, 16, 4);
                     $$0.a(e, 16, 4, 0, 0, $$9, $$8, $$10, 4);
                  }
               }

               RenderSystem.defaultBlendFunc();
            }

            RenderSystem.disableBlend();
         }
      }
   }

   private boolean a(@Nullable ews $$0) {
      if ($$0 == null) {
         return false;
      } else if ($$0.c() == ews.a.c) {
         return ((ewr)$$0).a() instanceof bqe;
      } else if ($$0.c() == ews.a.b) {
         ir $$1 = ((ewq)$$0).a();
         dca $$2 = this.X.r;
         return $$2.a_($$1).b($$2, $$1) != null;
      } else {
         return false;
      }
   }

   private void l(fia $$0, float $$1) {
      Collection<brh> $$2 = this.X.s.eF();
      if (!$$2.isEmpty()) {
         if (this.X.y instanceof fqf $$3 && $$3.I()) {
            return;
         }

         RenderSystem.enableBlend();
         int $$4 = 0;
         int $$5 = 0;
         grw $$6 = this.X.aG();
         List<Runnable> $$7 = Lists.newArrayListWithExpectedSize($$2.size());

         for (brh $$8 : Ordering.natural().reverse().sortedCopy($$2)) {
            ja<brf> $$9 = $$8.c();
            if ($$8.h()) {
               int $$10 = $$0.a();
               int $$11 = 1;
               if (this.X.K()) {
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
                  $$0.a(f, $$10, $$11, 24, 24);
               } else {
                  $$0.a(g, $$10, $$11, 24, 24);
                  if ($$8.a(200)) {
                     int $$13 = $$8.d();
                     int $$14 = 10 - $$13 / 20;
                     $$12 = aym.a((float)$$13 / 10.0F / 5.0F * 0.5F, 0.0F, 0.5F)
                        + aym.b((float)$$13 * (float) Math.PI / 5.0F) * aym.a((float)$$14 / 10.0F * 0.25F, 0.0F, 0.25F);
                  }
               }

               gqy $$15 = $$6.a($$9);
               int $$16 = $$10;
               int $$17 = $$11;
               float $$18 = $$12;
               $$7.add(() -> {
                  $$0.a(1.0F, 1.0F, 1.0F, $$18);
                  $$0.a($$16 + 3, $$17 + 3, 0, 18, 18, $$15);
                  $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
               });
            }
         }

         $$7.forEach(Runnable::run);
         RenderSystem.disableBlend();
      }
   }

   private void m(fia $$0, float $$1) {
      if (this.X.q.j() == dbx.d) {
         this.ai.a($$0);
      } else {
         this.n($$0, $$1);
      }

      int $$2 = $$0.a() / 2 - 91;
      bsy $$3 = this.X.s.q();
      if ($$3 != null) {
         this.a($$3, $$0, $$2);
      } else if (this.m()) {
         this.a($$0, $$2);
      }

      if (this.X.q.a()) {
         this.b($$0);
      }

      this.c($$0);
      if (this.X.q.j() != dbx.d) {
         this.a($$0);
      } else if (this.X.s.O_()) {
         this.ai.b($$0);
      }
   }

   private void n(fia $$0, float $$1) {
      cly $$2 = this.n();
      if ($$2 != null) {
         cuh $$3 = $$2.fh();
         bsi $$4 = $$2.fD().e();
         int $$5 = $$0.a() / 2;
         int $$6 = 182;
         int $$7 = 91;
         RenderSystem.enableBlend();
         $$0.c().a();
         $$0.c().a(0.0F, 0.0F, -90.0F);
         $$0.a(h, $$5 - 91, $$0.b() - 22, 182, 22);
         $$0.a(i, $$5 - 91 - 1 + $$2.gl().k * 20, $$0.b() - 22 - 1, 24, 23);
         if (!$$3.d()) {
            if ($$4 == bsi.a) {
               $$0.a(j, $$5 - 91 - 29, $$0.b() - 23, 29, 24);
            } else {
               $$0.a(k, $$5 + 91, $$0.b() - 23, 29, 24);
            }
         }

         $$0.c().b();
         RenderSystem.disableBlend();
         int $$8 = 1;

         for (int $$9 = 0; $$9 < 9; $$9++) {
            int $$10 = $$5 - 90 + $$9 * 20 + 2;
            int $$11 = $$0.b() - 16 - 3;
            cuh $$12 = $$2.gl().h.get($$9);
            if ($$12.b(ke.ag)) {
               $$12.b(ke.ag, $$2.gl().k == $$9);
            }

            this.a($$0, $$10, $$11, $$1, $$2, $$2.gl().h.get($$9), $$8++);
         }

         if (!$$3.d()) {
            int $$13 = $$0.b() - 16 - 3;
            if ($$4 == bsi.a) {
               this.a($$0, $$5 - 91 - 26, $$13, $$1, $$2, $$3, $$8++);
            } else {
               this.a($$0, $$5 + 91 + 10, $$13, $$1, $$2, $$3, $$8++);
            }
         }

         if (this.X.m.D().c() == fft.c) {
            RenderSystem.enableBlend();
            float $$14 = this.X.s.D(0.0F);
            if ($$14 < 1.0F) {
               int $$15 = $$0.b() - 20;
               int $$16 = $$5 + 91 + 6;
               if ($$4 == bsi.b) {
                  $$16 = $$5 - 91 - 22;
               }

               int $$17 = (int)($$14 * 19.0F);
               $$0.a(l, $$16, $$15, 18, 18);
               $$0.a(m, 18, 18, 0, 18 - $$17, $$16, $$15 + 18 - $$17, 18, $$17);
            }

            RenderSystem.disableBlend();
         }
      }
   }

   private void a(bsy $$0, fia $$1, int $$2) {
      this.X.aJ().a("jumpBar");
      float $$3 = this.X.s.r();
      int $$4 = 182;
      int $$5 = (int)($$3 * 183.0F);
      int $$6 = $$1.b() - 32 + 3;
      RenderSystem.enableBlend();
      $$1.a(n, $$2, $$6, 182, 5);
      if ($$0.c() > 0) {
         $$1.a(o, $$2, $$6, 182, 5);
      } else if ($$5 > 0) {
         $$1.a(p, 182, 5, 0, 0, $$2, $$6, $$5, 5);
      }

      RenderSystem.disableBlend();
      this.X.aJ().c();
   }

   private void a(fia $$0, int $$1) {
      this.X.aJ().a("expBar");
      int $$2 = this.X.s.gw();
      if ($$2 > 0) {
         int $$3 = 182;
         int $$4 = (int)(this.X.s.cG * 183.0F);
         int $$5 = $$0.b() - 32 + 3;
         RenderSystem.enableBlend();
         $$0.a(q, $$1, $$5, 182, 5);
         if ($$4 > 0) {
            $$0.a(r, 182, 5, 0, 0, $$1, $$5, $$4, 5);
         }

         RenderSystem.disableBlend();
      }

      this.X.aJ().c();
   }

   private void o(fia $$0, float $$1) {
      int $$2 = this.X.s.cE;
      if (this.m() && $$2 > 0) {
         this.X.aJ().a("expLevel");
         String $$3 = $$2 + "";
         int $$4 = ($$0.a() - this.f().b($$3)) / 2;
         int $$5 = $$0.b() - 31 - 4;
         $$0.a(this.f(), $$3, $$4 + 1, $$5, 0, false);
         $$0.a(this.f(), $$3, $$4 - 1, $$5, 0, false);
         $$0.a(this.f(), $$3, $$4, $$5 + 1, 0, false);
         $$0.a(this.f(), $$3, $$4, $$5 - 1, 0, false);
         $$0.a(this.f(), $$3, $$4, $$5, 8453920, false);
         this.X.aJ().c();
      }
   }

   private boolean m() {
      return this.X.s.q() == null && this.X.q.d();
   }

   private void a(fia $$0) {
      this.X.aJ().a("selectedItemName");
      if (this.ae > 0 && !this.af.d()) {
         xs $$1 = xe.i().a(this.af.w()).a(this.af.y().a());
         if (this.af.b(ke.f)) {
            $$1.a(n.u);
         }

         int $$2 = this.f().a($$1);
         int $$3 = ($$0.a() - $$2) / 2;
         int $$4 = $$0.b() - 59;
         if (!this.X.q.a()) {
            $$4 += 14;
         }

         int $$5 = (int)((float)this.ae * 256.0F / 10.0F);
         if ($$5 > 255) {
            $$5 = 255;
         }

         if ($$5 > 0) {
            $$0.a($$3 - 2, $$4 - 2, $$3 + $$2 + 2, $$4 + 9 + 2, this.X.m.a(0));
            $$0.b(this.f(), $$1, $$3, $$4, 16777215 + ($$5 << 24));
         }
      }

      this.X.aJ().c();
   }

   private void p(fia $$0, float $$1) {
      if (this.X.K()) {
         this.X.aJ().a("demo");
         xe $$2;
         if (this.X.r.Z() >= 120500L) {
            $$2 = L;
         } else {
            $$2 = xe.a("demo.remainingTime", azh.a((int)(120500L - this.X.r.Z()), this.X.r.s().f()));
         }

         int $$4 = this.f().a($$2);
         $$0.b(this.f(), $$2, $$0.a() - $$4 - 10, 5, 16777215);
         this.X.aJ().c();
      }
   }

   private void a(fia $$0, exq $$1) {
      exy $$2 = $$1.a();
      yu $$3 = $$1.a(yx.c);

      record a(xe a, xe b, int c) {
      }

      a[] $$4 = $$2.i($$1).stream().filter($$0x -> !$$0x.a()).sorted(K).limit(15L).map($$2x -> {
         ext $$3x = $$2.e($$2x.c());
         xe $$4x = $$2x.b();
         xe $$5x = ext.a($$3x, $$4x);
         xe $$6x = $$2x.a($$3);
         int $$7x = this.f().a($$6x);
         return new a($$5x, $$6x, $$7x);
      }).toArray(a[]::new);
      xe $$5 = $$1.d();
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
         int $$7x = $$0.b() / 2 + $$6x / 3;
         int $$8x = 3;
         int $$9x = $$0.a() - $$10 - 3;
         int $$10x = $$0.a() - 3 + 2;
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
   private cly n() {
      return this.X.ao() instanceof cly $$0 ? $$0 : null;
   }

   @Nullable
   private bso o() {
      cly $$0 = this.n();
      if ($$0 != null) {
         brv $$1 = $$0.dh();
         if ($$1 == null) {
            return null;
         }

         if ($$1 instanceof bso) {
            return (bso)$$1;
         }
      }

      return null;
   }

   private int a(@Nullable bso $$0) {
      if ($$0 != null && $$0.bL()) {
         float $$1 = $$0.eZ();
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

   private void b(fia $$0) {
      cly $$1 = this.n();
      if ($$1 != null) {
         int $$2 = aym.f($$1.eI());
         boolean $$3 = this.au > (long)this.Z && (this.au - (long)this.Z) / 3L % 2L == 1L;
         long $$4 = ad.b();
         if ($$2 < this.ar && $$1.aq > 0) {
            this.at = $$4;
            this.au = (long)(this.Z + 20);
         } else if ($$2 > this.ar && $$1.aq > 0) {
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
         this.W.b((long)(this.Z * 312871));
         int $$6 = $$0.a() / 2 - 91;
         int $$7 = $$0.a() / 2 + 91;
         int $$8 = $$0.b() - 39;
         float $$9 = Math.max((float)$$1.g(btv.q), (float)Math.max($$5, $$2));
         int $$10 = aym.f($$1.fB());
         int $$11 = aym.f(($$9 + (float)$$10) / 2.0F / 10.0F);
         int $$12 = Math.max(10 - ($$11 - 2), 3);
         int $$13 = $$8 - 10;
         int $$14 = -1;
         if ($$1.b(brj.j)) {
            $$14 = this.Z % aym.f($$9 + 5.0F);
         }

         this.X.aJ().a("armor");
         a($$0, $$1, $$8, $$11, $$12, $$6);
         this.X.aJ().b("health");
         this.a($$0, $$1, $$6, $$8, $$12, $$14, $$9, $$2, $$5, $$10, $$3);
         bso $$15 = this.o();
         int $$16 = this.a($$15);
         if ($$16 == 0) {
            this.X.aJ().b("food");
            this.a($$0, $$1, $$8, $$7);
            $$13 -= 10;
         }

         this.X.aJ().b("air");
         int $$17 = $$1.cp();
         int $$18 = Math.min($$1.cq(), $$17);
         if ($$1.a(awj.a) || $$18 < $$17) {
            int $$19 = this.a($$16) - 1;
            $$13 -= $$19 * 10;
            int $$20 = aym.c((double)($$18 - 2) * 10.0 / (double)$$17);
            int $$21 = aym.c((double)$$18 * 10.0 / (double)$$17) - $$20;
            RenderSystem.enableBlend();

            for (int $$22 = 0; $$22 < $$20 + $$21; $$22++) {
               if ($$22 < $$20) {
                  $$0.a(B, $$7 - $$22 * 8 - 9, $$13, 9, 9);
               } else {
                  $$0.a(C, $$7 - $$22 * 8 - 9, $$13, 9, 9);
               }
            }

            RenderSystem.disableBlend();
         }

         this.X.aJ().c();
      }
   }

   private static void a(fia $$0, cly $$1, int $$2, int $$3, int $$4, int $$5) {
      int $$6 = $$1.eW();
      if ($$6 > 0) {
         RenderSystem.enableBlend();
         int $$7 = $$2 - ($$3 - 1) * $$4 - 10;

         for (int $$8 = 0; $$8 < 10; $$8++) {
            int $$9 = $$5 + $$8 * 8;
            if ($$8 * 2 + 1 < $$6) {
               $$0.a(u, $$9, $$7, 9, 9);
            }

            if ($$8 * 2 + 1 == $$6) {
               $$0.a(t, $$9, $$7, 9, 9);
            }

            if ($$8 * 2 + 1 > $$6) {
               $$0.a(s, $$9, $$7, 9, 9);
            }
         }

         RenderSystem.disableBlend();
      }
   }

   private void a(fia $$0, cly $$1, int $$2, int $$3, int $$4, int $$5, float $$6, int $$7, int $$8, int $$9, boolean $$10) {
      fhz.b $$11 = fhz.b.a($$1);
      boolean $$12 = $$1.dU().B_().l();
      int $$13 = aym.c((double)$$6 / 2.0);
      int $$14 = aym.c((double)$$9 / 2.0);
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

         this.a($$0, fhz.b.a, $$19, $$20, $$12, $$10, false);
         int $$21 = $$16 * 2;
         boolean $$22 = $$16 >= $$13;
         if ($$22) {
            int $$23 = $$21 - $$15;
            if ($$23 < $$9) {
               boolean $$24 = $$23 + 1 == $$9;
               this.a($$0, $$11 == fhz.b.d ? $$11 : fhz.b.e, $$19, $$20, $$12, false, $$24);
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

   private void a(fia $$0, fhz.b $$1, int $$2, int $$3, boolean $$4, boolean $$5, boolean $$6) {
      RenderSystem.enableBlend();
      $$0.a($$1.a($$4, $$6, $$5), $$2, $$3, 9, 9);
      RenderSystem.disableBlend();
   }

   private void a(fia $$0, cly $$1, int $$2, int $$3) {
      cou $$4 = $$1.gx();
      int $$5 = $$4.a();
      RenderSystem.enableBlend();

      for (int $$6 = 0; $$6 < 10; $$6++) {
         int $$7 = $$2;
         akt $$8;
         akt $$9;
         akt $$10;
         if ($$1.b(brj.q)) {
            $$8 = v;
            $$9 = w;
            $$10 = x;
         } else {
            $$8 = y;
            $$9 = z;
            $$10 = A;
         }

         if ($$1.gx().e() <= 0.0F && this.Z % ($$5 * 3 + 1) == 0) {
            $$7 = $$2 + (this.W.a(3) - 1);
         }

         int $$14 = $$3 - $$6 * 8 - 9;
         $$0.a($$8, $$14, $$7, 9, 9);
         if ($$6 * 2 + 1 < $$5) {
            $$0.a($$10, $$14, $$7, 9, 9);
         }

         if ($$6 * 2 + 1 == $$5) {
            $$0.a($$9, $$14, $$7, 9, 9);
         }
      }

      RenderSystem.disableBlend();
   }

   private void c(fia $$0) {
      bso $$1 = this.o();
      if ($$1 != null) {
         int $$2 = this.a($$1);
         if ($$2 != 0) {
            int $$3 = (int)Math.ceil((double)$$1.eI());
            this.X.aJ().b("mountHealth");
            int $$4 = $$0.b() - 39;
            int $$5 = $$0.a() / 2 + 91;
            int $$6 = $$4;
            int $$7 = 0;
            RenderSystem.enableBlend();

            while ($$2 > 0) {
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
               $$7 += 20;
            }

            RenderSystem.disableBlend();
         }
      }
   }

   private void a(fia $$0, akt $$1, float $$2) {
      RenderSystem.disableDepthTest();
      RenderSystem.depthMask(false);
      RenderSystem.enableBlend();
      $$0.a(1.0F, 1.0F, 1.0F, $$2);
      $$0.a($$1, 0, 0, -90, 0.0F, 0.0F, $$0.a(), $$0.b(), $$0.a(), $$0.b());
      RenderSystem.disableBlend();
      RenderSystem.depthMask(true);
      RenderSystem.enableDepthTest();
      $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
   }

   private void q(fia $$0, float $$1) {
      float $$2 = (float)Math.min($$0.a(), $$0.b());
      float $$4 = Math.min((float)$$0.a() / $$2, (float)$$0.b() / $$2) * $$1;
      int $$5 = aym.d($$2 * $$4);
      int $$6 = aym.d($$2 * $$4);
      int $$7 = ($$0.a() - $$5) / 2;
      int $$8 = ($$0.b() - $$6) / 2;
      int $$9 = $$7 + $$5;
      int $$10 = $$8 + $$6;
      RenderSystem.enableBlend();
      $$0.a(I, $$7, $$8, -90, 0.0F, 0.0F, $$5, $$6, $$5, $$6);
      RenderSystem.disableBlend();
      $$0.a(gfo.F(), 0, $$10, $$0.a(), $$0.b(), -90, -16777216);
      $$0.a(gfo.F(), 0, 0, $$0.a(), $$8, -90, -16777216);
      $$0.a(gfo.F(), 0, $$8, $$7, $$10, -90, -16777216);
      $$0.a(gfo.F(), $$9, $$8, $$0.a(), $$10, -90, -16777216);
   }

   private void a(brv $$0) {
      ir $$1 = ir.a($$0.dz(), $$0.dD(), $$0.dF());
      float $$2 = gff.a($$0.dU().E_(), $$0.dU().A($$1));
      float $$3 = aym.a(1.0F - $$2, 0.0F, 1.0F);
      this.a = this.a + ($$3 - this.a) * 0.01F;
   }

   private void a(fia $$0, @Nullable brv $$1) {
      dut $$2 = this.X.r.D_();
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
      RenderSystem.enableBlend();
      RenderSystem.blendFuncSeparate(
         GlStateManager.SourceFactor.ZERO, GlStateManager.DestFactor.ONE_MINUS_SRC_COLOR, GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO
      );
      if ($$3 > 0.0F) {
         $$3 = aym.a($$3, 0.0F, 1.0F);
         $$0.a(0.0F, $$3, $$3, 1.0F);
      } else {
         float $$7 = this.a;
         $$7 = aym.a($$7, 0.0F, 1.0F);
         $$0.a($$7, $$7, $$7, 1.0F);
      }

      $$0.a(G, 0, 0, -90, 0.0F, 0.0F, $$0.a(), $$0.b(), $$0.a(), $$0.b());
      RenderSystem.depthMask(true);
      RenderSystem.enableDepthTest();
      $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
      RenderSystem.defaultBlendFunc();
      RenderSystem.disableBlend();
   }

   private void r(fia $$0, float $$1) {
      if ($$1 < 1.0F) {
         $$1 *= $$1;
         $$1 *= $$1;
         $$1 = $$1 * 0.8F + 0.2F;
      }

      RenderSystem.disableDepthTest();
      RenderSystem.depthMask(false);
      RenderSystem.enableBlend();
      $$0.a(1.0F, 1.0F, 1.0F, $$1);
      dfc $$2 = dfe.eR;
      if (this.X.r.z_() || this.X.s.dU().a_(this.X.s.du()).a(dfe.eS)) {
         $$2 = dfe.eS;
      }

      gqy $$3 = this.X.ap().a().a($$2.n());
      $$0.a(0, 0, -90, $$0.a(), $$0.b(), $$3);
      RenderSystem.disableBlend();
      RenderSystem.depthMask(true);
      RenderSystem.enableDepthTest();
      $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
   }

   private void a(fia $$0, int $$1, int $$2, float $$3, cly $$4, cuh $$5, int $$6) {
      if (!$$5.d()) {
         float $$7 = (float)$$5.F() - $$3;
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
      this.q();
      if (!$$0) {
         this.p();
      }
   }

   private void p() {
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
      brv $$0 = this.X.ao();
      if ($$0 != null) {
         this.a($$0);
      }

      if (this.X.s != null) {
         cuh $$1 = this.X.s.gl().f();
         if ($$1.d()) {
            this.ae = 0;
         } else if (this.af.d() || !$$1.a(this.af.f()) || !$$1.w().equals(this.af.w())) {
            this.ae = (int)(40.0 * this.X.m.B().c());
         } else if (this.ae > 0) {
            this.ae--;
         }

         this.af = $$1;
      }

      this.Y.a();
   }

   private void q() {
      MinecraftServer $$0 = this.X.V();
      boolean $$1 = $$0 != null && $$0.bh();
      this.aw = this.av;
      this.av = aym.i(0.2F, this.av, $$1 ? 1.0F : 0.0F);
   }

   public void a(xe $$0) {
      xe $$1 = xe.a("record.nowPlaying", $$0);
      this.a($$1, true);
      this.X.aZ().c($$1);
   }

   public void a(xe $$0, boolean $$1) {
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

   public void b(xe $$0) {
      this.an = $$0;
   }

   public void c(xe $$0) {
      this.am = $$0;
      this.al = this.ao + this.ap + this.aq;
   }

   public void c() {
      this.am = null;
      this.an = null;
      this.al = 0;
   }

   public fio d() {
      return this.Y;
   }

   public int e() {
      return this.Z;
   }

   public fhy f() {
      return this.X.h;
   }

   public fkm g() {
      return this.ai;
   }

   public fjo h() {
      return this.aj;
   }

   public void i() {
      this.aj.a();
      this.ak.a();
      this.X.aA().a();
      this.ag.o();
      this.Y.a(true);
   }

   public fim j() {
      return this.ak;
   }

   public fiv k() {
      return this.ag;
   }

   public void l() {
      this.ag.a();
   }

   public void b(fia $$0, float $$1) {
      if (this.X.m.af().c() && (this.av > 0.0F || this.aw > 0.0F)) {
         int $$2 = aym.d(255.0F * aym.a(aym.i(this.X.au(), this.aw, this.av), 0.0F, 1.0F));
         if ($$2 > 8) {
            fhy $$3 = this.f();
            int $$4 = $$3.a(M);
            int $$5 = 16777215 | $$2 << 24 & 0xFF000000;
            $$0.b($$3, M, $$0.a() - $$4 - 10, $$0.b() - 15, $$5);
         }
      }
   }

   static enum b {
      a(
         new akt("hud/heart/container"),
         new akt("hud/heart/container_blinking"),
         new akt("hud/heart/container"),
         new akt("hud/heart/container_blinking"),
         new akt("hud/heart/container_hardcore"),
         new akt("hud/heart/container_hardcore_blinking"),
         new akt("hud/heart/container_hardcore"),
         new akt("hud/heart/container_hardcore_blinking")
      ),
      b(
         new akt("hud/heart/full"),
         new akt("hud/heart/full_blinking"),
         new akt("hud/heart/half"),
         new akt("hud/heart/half_blinking"),
         new akt("hud/heart/hardcore_full"),
         new akt("hud/heart/hardcore_full_blinking"),
         new akt("hud/heart/hardcore_half"),
         new akt("hud/heart/hardcore_half_blinking")
      ),
      c(
         new akt("hud/heart/poisoned_full"),
         new akt("hud/heart/poisoned_full_blinking"),
         new akt("hud/heart/poisoned_half"),
         new akt("hud/heart/poisoned_half_blinking"),
         new akt("hud/heart/poisoned_hardcore_full"),
         new akt("hud/heart/poisoned_hardcore_full_blinking"),
         new akt("hud/heart/poisoned_hardcore_half"),
         new akt("hud/heart/poisoned_hardcore_half_blinking")
      ),
      d(
         new akt("hud/heart/withered_full"),
         new akt("hud/heart/withered_full_blinking"),
         new akt("hud/heart/withered_half"),
         new akt("hud/heart/withered_half_blinking"),
         new akt("hud/heart/withered_hardcore_full"),
         new akt("hud/heart/withered_hardcore_full_blinking"),
         new akt("hud/heart/withered_hardcore_half"),
         new akt("hud/heart/withered_hardcore_half_blinking")
      ),
      e(
         new akt("hud/heart/absorbing_full"),
         new akt("hud/heart/absorbing_full_blinking"),
         new akt("hud/heart/absorbing_half"),
         new akt("hud/heart/absorbing_half_blinking"),
         new akt("hud/heart/absorbing_hardcore_full"),
         new akt("hud/heart/absorbing_hardcore_full_blinking"),
         new akt("hud/heart/absorbing_hardcore_half"),
         new akt("hud/heart/absorbing_hardcore_half_blinking")
      ),
      f(
         new akt("hud/heart/frozen_full"),
         new akt("hud/heart/frozen_full_blinking"),
         new akt("hud/heart/frozen_half"),
         new akt("hud/heart/frozen_half_blinking"),
         new akt("hud/heart/frozen_hardcore_full"),
         new akt("hud/heart/frozen_hardcore_full_blinking"),
         new akt("hud/heart/frozen_hardcore_half"),
         new akt("hud/heart/frozen_hardcore_half_blinking")
      );

      private final akt g;
      private final akt h;
      private final akt i;
      private final akt j;
      private final akt k;
      private final akt l;
      private final akt m;
      private final akt n;

      private b(akt $$0, akt $$1, akt $$2, akt $$3, akt $$4, akt $$5, akt $$6, akt $$7) {
         this.g = $$0;
         this.h = $$1;
         this.i = $$2;
         this.j = $$3;
         this.k = $$4;
         this.l = $$5;
         this.m = $$6;
         this.n = $$7;
      }

      public akt a(boolean $$0, boolean $$1, boolean $$2) {
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

      static fhz.b a(cly $$0) {
         fhz.b $$1;
         if ($$0.b(brj.s)) {
            $$1 = c;
         } else if ($$0.b(brj.t)) {
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
