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

public class fhg {
   private static final akk b = new akk("hud/crosshair");
   private static final akk c = new akk("hud/crosshair_attack_indicator_full");
   private static final akk d = new akk("hud/crosshair_attack_indicator_background");
   private static final akk e = new akk("hud/crosshair_attack_indicator_progress");
   private static final akk f = new akk("hud/effect_background_ambient");
   private static final akk g = new akk("hud/effect_background");
   private static final akk h = new akk("hud/hotbar");
   private static final akk i = new akk("hud/hotbar_selection");
   private static final akk j = new akk("hud/hotbar_offhand_left");
   private static final akk k = new akk("hud/hotbar_offhand_right");
   private static final akk l = new akk("hud/hotbar_attack_indicator_background");
   private static final akk m = new akk("hud/hotbar_attack_indicator_progress");
   private static final akk n = new akk("hud/jump_bar_background");
   private static final akk o = new akk("hud/jump_bar_cooldown");
   private static final akk p = new akk("hud/jump_bar_progress");
   private static final akk q = new akk("hud/experience_bar_background");
   private static final akk r = new akk("hud/experience_bar_progress");
   private static final akk s = new akk("hud/armor_empty");
   private static final akk t = new akk("hud/armor_half");
   private static final akk u = new akk("hud/armor_full");
   private static final akk v = new akk("hud/food_empty_hunger");
   private static final akk w = new akk("hud/food_half_hunger");
   private static final akk x = new akk("hud/food_full_hunger");
   private static final akk y = new akk("hud/food_empty");
   private static final akk z = new akk("hud/food_half");
   private static final akk A = new akk("hud/food_full");
   private static final akk B = new akk("hud/air");
   private static final akk C = new akk("hud/air_bursting");
   private static final akk D = new akk("hud/heart/vehicle_container");
   private static final akk E = new akk("hud/heart/vehicle_full");
   private static final akk F = new akk("hud/heart/vehicle_half");
   private static final akk G = new akk("textures/misc/vignette.png");
   private static final akk H = new akk("textures/misc/pumpkinblur.png");
   private static final akk I = new akk("textures/misc/spyglass_scope.png");
   private static final akk J = new akk("textures/misc/powder_snow_outline.png");
   private static final Comparator<exe> K = Comparator.comparing(exe::d).reversed().thenComparing(exe::c, String.CASE_INSENSITIVE_ORDER);
   private static final wu L = wu.c("demo.demoExpired");
   private static final wu M = wu.c("menu.savingLevel");
   private static final float N = 5.0F;
   private static final int O = 10;
   private static final int P = 10;
   private static final String Q = ": ";
   private static final float R = 0.2F;
   private static final int S = 9;
   private static final int T = 8;
   private static final float U = 0.2F;
   private final ayo V = ayo.a();
   private final ffw W;
   private final fhv X;
   private int Y;
   @Nullable
   private wu Z;
   private int aa;
   private boolean ab;
   private boolean ac;
   public float a = 1.0F;
   private int ad;
   private cud ae = cud.l;
   private final fic af;
   private final fjc ag;
   private final fjt ah;
   private final fiv ai;
   private final fht aj;
   private int ak;
   @Nullable
   private wu al;
   @Nullable
   private wu am;
   private int an;
   private int ao;
   private int ap;
   private int aq;
   private int ar;
   private long as;
   private long at;
   private float au;
   private float av;
   private final fhj aw = new fhj();
   private float ax;

   public fhg(ffw $$0) {
      this.W = $$0;
      this.af = new fic($$0);
      this.ah = new fjt($$0);
      this.X = new fhv($$0);
      this.ai = new fiv($$0, this);
      this.aj = new fht($$0);
      this.ag = new fjc($$0);
      this.a();
      fhj $$1 = new fhj().a(this::c).a(this::j).a(this::l).a(this::n).a(this::k).a(($$0x, $$1x) -> this.aj.a($$0x));
      fhj $$2 = new fhj().a(this::o).a(($$0x, $$1x) -> {
         if (this.af.d()) {
            this.af.a($$0x);
         }
      }).a(this::h).a(this::e).a(this::f).a(this::g).a(this::i).a(($$0x, $$1x) -> this.ag.a($$0x));
      this.aw.a($$1, () -> !$$0.m.Y).a(this::d).a($$2, () -> !$$0.m.Y);
   }

   public void a() {
      this.an = 10;
      this.ao = 70;
      this.ap = 20;
   }

   public void a(fhh $$0, ffn $$1) {
      RenderSystem.enableDepthTest();
      this.aw.a($$0, $$1);
      RenderSystem.disableDepthTest();
   }

   private void c(fhh $$0, ffn $$1) {
      if (ffw.N()) {
         this.a($$0, this.W.an());
      }

      float $$2 = $$1.a();
      this.ax = ayg.i(0.5F * $$2, this.ax, 1.125F);
      if (this.W.m.aA().a()) {
         if (this.W.s.gy()) {
            this.a($$0, this.ax);
         } else {
            this.ax = 0.5F;
            cud $$3 = this.W.s.ga().e(3);
            if ($$3.a(dfk.ee.r())) {
               this.a($$0, H, 1.0F);
            }
         }
      }

      if (this.W.s.co() > 0) {
         this.a($$0, J, this.W.s.cp());
      }

      float $$4 = ayg.i($$1.a(false), this.W.s.cK, this.W.s.cJ);
      if ($$4 > 0.0F && !this.W.s.b(brr.i)) {
         this.b($$0, $$4);
      }
   }

   private void d(fhh $$0, ffn $$1) {
      if (this.W.s.ge() > 0) {
         this.W.aH().a("sleep");
         float $$2 = (float)this.W.s.ge();
         float $$3 = $$2 / 100.0F;
         if ($$3 > 1.0F) {
            $$3 = 1.0F - ($$2 - 100.0F) / 10.0F;
         }

         int $$4 = (int)(220.0F * $$3) << 24 | 1052704;
         $$0.a(gen.E(), 0, 0, $$0.a(), $$0.b(), $$4);
         this.W.aH().c();
      }
   }

   private void e(fhh $$0, ffn $$1) {
      fhf $$2 = this.f();
      if (this.Z != null && this.aa > 0) {
         this.W.aH().a("overlayMessage");
         float $$3 = (float)this.aa - $$1.a(false);
         int $$4 = (int)($$3 * 255.0F / 20.0F);
         if ($$4 > 255) {
            $$4 = 255;
         }

         if ($$4 > 8) {
            $$0.c().a();
            $$0.c().a((float)($$0.a() / 2), (float)($$0.b() - 68), 0.0F);
            int $$5;
            if (this.ab) {
               $$5 = ayg.a($$3 / 50.0F, 0.7F, 0.6F, $$4);
            } else {
               $$5 = axq.b.b($$4, -1);
            }

            int $$7 = $$2.a(this.Z);
            $$0.a($$2, this.Z, -$$7 / 2, -4, $$7, $$5);
            $$0.c().b();
         }

         this.W.aH().c();
      }
   }

   private void f(fhh $$0, ffn $$1) {
      if (this.al != null && this.ak > 0) {
         fhf $$2 = this.f();
         this.W.aH().a("titleAndSubtitle");
         float $$3 = (float)this.ak - $$1.a(false);
         int $$4 = 255;
         if (this.ak > this.ap + this.ao) {
            float $$5 = (float)(this.an + this.ao + this.ap) - $$3;
            $$4 = (int)($$5 * 255.0F / (float)this.an);
         }

         if (this.ak <= this.ap) {
            $$4 = (int)($$3 * 255.0F / (float)this.ap);
         }

         $$4 = ayg.a($$4, 0, 255);
         if ($$4 > 8) {
            $$0.c().a();
            $$0.c().a((float)($$0.a() / 2), (float)($$0.b() / 2), 0.0F);
            $$0.c().a();
            $$0.c().b(4.0F, 4.0F, 4.0F);
            int $$6 = $$2.a(this.al);
            int $$7 = axq.b.b($$4, -1);
            $$0.a($$2, this.al, -$$6 / 2, -10, $$6, $$7);
            $$0.c().b();
            if (this.am != null) {
               $$0.c().a();
               $$0.c().b(2.0F, 2.0F, 2.0F);
               int $$8 = $$2.a(this.am);
               $$0.a($$2, this.am, -$$8 / 2, 5, $$8, $$7);
               $$0.c().b();
            }

            $$0.c().b();
         }

         this.W.aH().c();
      }
   }

   private void g(fhh $$0, ffn $$1) {
      if (!this.X.e()) {
         ezs $$2 = this.W.aM();
         int $$3 = ayg.a(this.W.n.e() * (double)$$2.o() / (double)$$2.m());
         int $$4 = ayg.a(this.W.n.f() * (double)$$2.p() / (double)$$2.n());
         this.X.a($$0, this.Y, $$3, $$4, false);
      }
   }

   private void h(fhh $$0, ffn $$1) {
      exl $$2 = this.W.r.M();
      exd $$3 = null;
      exg $$4 = $$2.e(this.W.s.cD());
      if ($$4 != null) {
         exc $$5 = exc.a($$4.n());
         if ($$5 != null) {
            $$3 = $$2.a($$5);
         }
      }

      exd $$6 = $$3 != null ? $$3 : $$2.a(exc.b);
      if ($$6 != null) {
         this.a($$0, $$6);
      }
   }

   private void i(fhh $$0, ffn $$1) {
      exl $$2 = this.W.r.M();
      exd $$3 = $$2.a(exc.a);
      if (!this.W.m.K.e() || this.W.T() && this.W.s.h.l().size() <= 1 && $$3 == null) {
         this.ai.a(false);
      } else {
         this.ai.a(true);
         this.ai.a($$0, $$0.a(), $$2, $$3);
      }
   }

   private void j(fhh $$0, ffn $$1) {
      fga $$2 = this.W.m;
      if ($$2.aA().a()) {
         if (this.W.q.j() != dcd.d || this.a(this.W.v)) {
            RenderSystem.enableBlend();
            if (this.af.d() && !this.W.s.gq() && !$$2.V().c()) {
               ffg $$3 = this.W.j.l();
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
               if (this.W.m.D().c() == fff.b) {
                  float $$6 = this.W.s.E(0.0F);
                  boolean $$7 = false;
                  if (this.W.u != null && this.W.u instanceof btc && $$6 >= 1.0F) {
                     $$7 = this.W.s.gt() > 5.0F;
                     $$7 &= this.W.u.bF();
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

   private boolean a(@Nullable ewf $$0) {
      if ($$0 == null) {
         return false;
      } else if ($$0.c() == ewf.a.c) {
         return ((ewe)$$0).a() instanceof bql;
      } else if ($$0.c() == ewf.a.b) {
         ja $$1 = ((ewd)$$0).a();
         dcg $$2 = this.W.r;
         return $$2.a_($$1).b($$2, $$1) != null;
      } else {
         return false;
      }
   }

   private void k(fhh $$0, ffn $$1) {
      Collection<brp> $$2 = this.W.s.ev();
      if (!$$2.isEmpty()) {
         if (this.W.y instanceof fot $$3 && $$3.J()) {
            return;
         }

         RenderSystem.enableBlend();
         int $$4 = 0;
         int $$5 = 0;
         gqo $$6 = this.W.aE();
         List<Runnable> $$7 = Lists.newArrayListWithExpectedSize($$2.size());

         for (brp $$8 : Ordering.natural().reverse().sortedCopy($$2)) {
            jj<brn> $$9 = $$8.c();
            if ($$8.h()) {
               int $$10 = $$0.a();
               int $$11 = 1;
               if (this.W.K()) {
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
                     $$12 = ayg.a((float)$$13 / 10.0F / 5.0F * 0.5F, 0.0F, 0.5F)
                        + ayg.b((float)$$13 * (float) Math.PI / 5.0F) * ayg.a((float)$$14 / 10.0F * 0.25F, 0.0F, 0.25F);
                  }
               }

               gpq $$15 = $$6.a($$9);
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

   private void l(fhh $$0, ffn $$1) {
      if (this.W.q.j() == dcd.d) {
         this.ah.a($$0);
      } else {
         this.m($$0, $$1);
      }

      int $$2 = $$0.a() / 2 - 91;
      btn $$3 = this.W.s.q();
      if ($$3 != null) {
         this.a($$3, $$0, $$2);
      } else if (this.m()) {
         this.a($$0, $$2);
      }

      if (this.W.q.a()) {
         this.b($$0);
      }

      this.c($$0);
      if (this.W.q.j() != dcd.d) {
         this.a($$0);
      } else if (this.W.s.N_()) {
         this.ah.b($$0);
      }
   }

   private void m(fhh $$0, ffn $$1) {
      cml $$2 = this.n();
      if ($$2 != null) {
         cud $$3 = $$2.eW();
         bsw $$4 = $$2.fs().e();
         int $$5 = $$0.a() / 2;
         int $$6 = 182;
         int $$7 = 91;
         RenderSystem.enableBlend();
         $$0.c().a();
         $$0.c().a(0.0F, 0.0F, -90.0F);
         $$0.a(h, $$5 - 91, $$0.b() - 22, 182, 22);
         $$0.a(i, $$5 - 91 - 1 + $$2.ga().k * 20, $$0.b() - 22 - 1, 24, 23);
         if (!$$3.e()) {
            if ($$4 == bsw.a) {
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
            this.a($$0, $$10, $$11, $$1, $$2, $$2.ga().h.get($$9), $$8++);
         }

         if (!$$3.e()) {
            int $$12 = $$0.b() - 16 - 3;
            if ($$4 == bsw.a) {
               this.a($$0, $$5 - 91 - 26, $$12, $$1, $$2, $$3, $$8++);
            } else {
               this.a($$0, $$5 + 91 + 10, $$12, $$1, $$2, $$3, $$8++);
            }
         }

         if (this.W.m.D().c() == fff.c) {
            RenderSystem.enableBlend();
            float $$13 = this.W.s.E(0.0F);
            if ($$13 < 1.0F) {
               int $$14 = $$0.b() - 20;
               int $$15 = $$5 + 91 + 6;
               if ($$4 == bsw.b) {
                  $$15 = $$5 - 91 - 22;
               }

               int $$16 = (int)($$13 * 19.0F);
               $$0.a(l, $$15, $$14, 18, 18);
               $$0.a(m, 18, 18, 0, 18 - $$16, $$15, $$14 + 18 - $$16, 18, $$16);
            }

            RenderSystem.disableBlend();
         }
      }
   }

   private void a(btn $$0, fhh $$1, int $$2) {
      this.W.aH().a("jumpBar");
      float $$3 = this.W.s.v();
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
      this.W.aH().c();
   }

   private void a(fhh $$0, int $$1) {
      this.W.aH().a("expBar");
      int $$2 = this.W.s.gj();
      if ($$2 > 0) {
         int $$3 = 182;
         int $$4 = (int)(this.W.s.ct * 183.0F);
         int $$5 = $$0.b() - 32 + 3;
         RenderSystem.enableBlend();
         $$0.a(q, $$1, $$5, 182, 5);
         if ($$4 > 0) {
            $$0.a(r, 182, 5, 0, 0, $$1, $$5, $$4, 5);
         }

         RenderSystem.disableBlend();
      }

      this.W.aH().c();
   }

   private void n(fhh $$0, ffn $$1) {
      int $$2 = this.W.s.cr;
      if (this.m() && $$2 > 0) {
         this.W.aH().a("expLevel");
         String $$3 = $$2 + "";
         int $$4 = ($$0.a() - this.f().b($$3)) / 2;
         int $$5 = $$0.b() - 31 - 4;
         $$0.a(this.f(), $$3, $$4 + 1, $$5, 0, false);
         $$0.a(this.f(), $$3, $$4 - 1, $$5, 0, false);
         $$0.a(this.f(), $$3, $$4, $$5 + 1, 0, false);
         $$0.a(this.f(), $$3, $$4, $$5 - 1, 0, false);
         $$0.a(this.f(), $$3, $$4, $$5, 8453920, false);
         this.W.aH().c();
      }
   }

   private boolean m() {
      return this.W.s.q() == null && this.W.q.d();
   }

   private void a(fhh $$0) {
      this.W.aH().a("selectedItemName");
      if (this.ad > 0 && !this.ae.e()) {
         xi $$1 = wu.i().b(this.ae.w()).a(this.ae.y().a());
         if (this.ae.b(kn.g)) {
            $$1.a(n.u);
         }

         int $$2 = this.f().a($$1);
         int $$3 = ($$0.a() - $$2) / 2;
         int $$4 = $$0.b() - 59;
         if (!this.W.q.a()) {
            $$4 += 14;
         }

         int $$5 = (int)((float)this.ad * 256.0F / 10.0F);
         if ($$5 > 255) {
            $$5 = 255;
         }

         if ($$5 > 0) {
            $$0.a(this.f(), (wu)$$1, $$3, $$4, $$2, axq.b.b($$5, -1));
         }
      }

      this.W.aH().c();
   }

   private void o(fhh $$0, ffn $$1) {
      if (this.W.K()) {
         this.W.aH().a("demo");
         wu $$2;
         if (this.W.r.Z() >= 120500L) {
            $$2 = L;
         } else {
            $$2 = wu.a("demo.remainingTime", azd.a((int)(120500L - this.W.r.Z()), this.W.r.s().f()));
         }

         int $$4 = this.f().a($$2);
         int $$5 = $$0.a() - $$4 - 10;
         int $$6 = 5;
         $$0.a(this.f(), $$2, $$5, 5, $$4, -1);
         this.W.aH().c();
      }
   }

   private void a(fhh $$0, exd $$1) {
      exl $$2 = $$1.a();
      yk $$3 = $$1.a(yn.c);

      record a(wu a, wu b, int c) {
      }

      a[] $$4 = $$2.i($$1).stream().filter($$0x -> !$$0x.a()).sorted(K).limit(15L).map($$2x -> {
         exg $$3x = $$2.e($$2x.c());
         wu $$4x = $$2x.b();
         wu $$5x = exg.a($$3x, $$4x);
         wu $$6x = $$2x.a($$3);
         int $$7x = this.f().a($$6x);
         return new a($$5x, $$6x, $$7x);
      }).toArray(a[]::new);
      wu $$5 = $$1.d();
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
         int $$11 = this.W.m.b(0.3F);
         int $$12 = this.W.m.b(0.4F);
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
   private cml n() {
      return this.W.an() instanceof cml $$0 ? $$0 : null;
   }

   @Nullable
   private btc o() {
      cml $$0 = this.n();
      if ($$0 != null) {
         bsh $$1 = $$0.de();
         if ($$1 == null) {
            return null;
         }

         if ($$1 instanceof btc) {
            return (btc)$$1;
         }
      }

      return null;
   }

   private int a(@Nullable btc $$0) {
      if ($$0 != null && $$0.bI()) {
         float $$1 = $$0.eP();
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

   private void b(fhh $$0) {
      cml $$1 = this.n();
      if ($$1 != null) {
         int $$2 = ayg.f($$1.ey());
         boolean $$3 = this.at > (long)this.Y && (this.at - (long)this.Y) / 3L % 2L == 1L;
         long $$4 = ac.c();
         if ($$2 < this.aq && $$1.am > 0) {
            this.as = $$4;
            this.at = (long)(this.Y + 20);
         } else if ($$2 > this.aq && $$1.am > 0) {
            this.as = $$4;
            this.at = (long)(this.Y + 10);
         }

         if ($$4 - this.as > 1000L) {
            this.aq = $$2;
            this.ar = $$2;
            this.as = $$4;
         }

         this.aq = $$2;
         int $$5 = this.ar;
         this.V.b((long)(this.Y * 312871));
         int $$6 = $$0.a() / 2 - 91;
         int $$7 = $$0.a() / 2 + 91;
         int $$8 = $$0.b() - 39;
         float $$9 = Math.max((float)$$1.g(buk.s), (float)Math.max($$5, $$2));
         int $$10 = ayg.f($$1.fq());
         int $$11 = ayg.f(($$9 + (float)$$10) / 2.0F / 10.0F);
         int $$12 = Math.max(10 - ($$11 - 2), 3);
         int $$13 = $$8 - 10;
         int $$14 = -1;
         if ($$1.b(brr.j)) {
            $$14 = this.Y % ayg.f($$9 + 5.0F);
         }

         this.W.aH().a("armor");
         a($$0, $$1, $$8, $$11, $$12, $$6);
         this.W.aH().b("health");
         this.a($$0, $$1, $$6, $$8, $$12, $$14, $$9, $$2, $$5, $$10, $$3);
         btc $$15 = this.o();
         int $$16 = this.a($$15);
         if ($$16 == 0) {
            this.W.aH().b("food");
            this.a($$0, $$1, $$8, $$7);
            $$13 -= 10;
         }

         this.W.aH().b("air");
         int $$17 = $$1.cm();
         int $$18 = Math.min($$1.cn(), $$17);
         if ($$1.a(awc.a) || $$18 < $$17) {
            int $$19 = this.a($$16) - 1;
            $$13 -= $$19 * 10;
            int $$20 = ayg.c((double)($$18 - 2) * 10.0 / (double)$$17);
            int $$21 = ayg.c((double)$$18 * 10.0 / (double)$$17) - $$20;
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

         this.W.aH().c();
      }
   }

   private static void a(fhh $$0, cml $$1, int $$2, int $$3, int $$4, int $$5) {
      int $$6 = $$1.eM();
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

   private void a(fhh $$0, cml $$1, int $$2, int $$3, int $$4, int $$5, float $$6, int $$7, int $$8, int $$9, boolean $$10) {
      fhg.b $$11 = fhg.b.a($$1);
      boolean $$12 = $$1.dR().A_().l();
      int $$13 = ayg.c((double)$$6 / 2.0);
      int $$14 = ayg.c((double)$$9 / 2.0);
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

         this.a($$0, fhg.b.a, $$19, $$20, $$12, $$10, false);
         int $$21 = $$16 * 2;
         boolean $$22 = $$16 >= $$13;
         if ($$22) {
            int $$23 = $$21 - $$15;
            if ($$23 < $$9) {
               boolean $$24 = $$23 + 1 == $$9;
               this.a($$0, $$11 == fhg.b.d ? $$11 : fhg.b.e, $$19, $$20, $$12, false, $$24);
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

   private void a(fhh $$0, fhg.b $$1, int $$2, int $$3, boolean $$4, boolean $$5, boolean $$6) {
      RenderSystem.enableBlend();
      $$0.a($$1.a($$4, $$6, $$5), $$2, $$3, 9, 9);
      RenderSystem.disableBlend();
   }

   private void a(fhh $$0, cml $$1, int $$2, int $$3) {
      cpe $$4 = $$1.gk();
      int $$5 = $$4.a();
      RenderSystem.enableBlend();

      for (int $$6 = 0; $$6 < 10; $$6++) {
         int $$7 = $$2;
         akk $$8;
         akk $$9;
         akk $$10;
         if ($$1.b(brr.q)) {
            $$8 = v;
            $$9 = w;
            $$10 = x;
         } else {
            $$8 = y;
            $$9 = z;
            $$10 = A;
         }

         if ($$1.gk().e() <= 0.0F && this.Y % ($$5 * 3 + 1) == 0) {
            $$7 = $$2 + (this.V.a(3) - 1);
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

   private void c(fhh $$0) {
      btc $$1 = this.o();
      if ($$1 != null) {
         int $$2 = this.a($$1);
         if ($$2 != 0) {
            int $$3 = (int)Math.ceil((double)$$1.ey());
            this.W.aH().b("mountHealth");
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

   private void a(fhh $$0, akk $$1, float $$2) {
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

   private void a(fhh $$0, float $$1) {
      float $$2 = (float)Math.min($$0.a(), $$0.b());
      float $$4 = Math.min((float)$$0.a() / $$2, (float)$$0.b() / $$2) * $$1;
      int $$5 = ayg.d($$2 * $$4);
      int $$6 = ayg.d($$2 * $$4);
      int $$7 = ($$0.a() - $$5) / 2;
      int $$8 = ($$0.b() - $$6) / 2;
      int $$9 = $$7 + $$5;
      int $$10 = $$8 + $$6;
      RenderSystem.enableBlend();
      $$0.a(I, $$7, $$8, -90, 0.0F, 0.0F, $$5, $$6, $$5, $$6);
      RenderSystem.disableBlend();
      $$0.a(gen.E(), 0, $$10, $$0.a(), $$0.b(), -90, -16777216);
      $$0.a(gen.E(), 0, 0, $$0.a(), $$8, -90, -16777216);
      $$0.a(gen.E(), 0, $$8, $$7, $$10, -90, -16777216);
      $$0.a(gen.E(), $$9, $$8, $$0.a(), $$10, -90, -16777216);
   }

   private void a(bsh $$0) {
      ja $$1 = ja.a($$0.dw(), $$0.dA(), $$0.dC());
      float $$2 = gee.a($$0.dR().D_(), $$0.dR().A($$1));
      float $$3 = ayg.a(1.0F - $$2, 0.0F, 1.0F);
      this.a = this.a + ($$3 - this.a) * 0.01F;
   }

   private void a(fhh $$0, @Nullable bsh $$1) {
      duc $$2 = this.W.r.C_();
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
         $$3 = ayg.a($$3, 0.0F, 1.0F);
         $$0.a(0.0F, $$3, $$3, 1.0F);
      } else {
         float $$7 = this.a;
         $$7 = ayg.a($$7, 0.0F, 1.0F);
         $$0.a($$7, $$7, $$7, 1.0F);
      }

      $$0.a(G, 0, 0, -90, 0.0F, 0.0F, $$0.a(), $$0.b(), $$0.a(), $$0.b());
      RenderSystem.depthMask(true);
      RenderSystem.enableDepthTest();
      $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
      RenderSystem.defaultBlendFunc();
      RenderSystem.disableBlend();
   }

   private void b(fhh $$0, float $$1) {
      if ($$1 < 1.0F) {
         $$1 *= $$1;
         $$1 *= $$1;
         $$1 = $$1 * 0.8F + 0.2F;
      }

      RenderSystem.disableDepthTest();
      RenderSystem.depthMask(false);
      RenderSystem.enableBlend();
      $$0.a(1.0F, 1.0F, 1.0F, $$1);
      gpq $$2 = this.W.ao().a().a(dfk.ed.o());
      $$0.a(0, 0, -90, $$0.a(), $$0.b(), $$2);
      RenderSystem.disableBlend();
      RenderSystem.depthMask(true);
      RenderSystem.enableDepthTest();
      $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
   }

   private void a(fhh $$0, int $$1, int $$2, ffn $$3, cml $$4, cud $$5, int $$6) {
      if (!$$5.e()) {
         float $$7 = (float)$$5.G() - $$3.a(false);
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
      this.q();
      if (!$$0) {
         this.p();
      }
   }

   private void p() {
      if (this.aa > 0) {
         this.aa--;
      }

      if (this.ak > 0) {
         this.ak--;
         if (this.ak <= 0) {
            this.al = null;
            this.am = null;
         }
      }

      this.Y++;
      bsh $$0 = this.W.an();
      if ($$0 != null) {
         this.a($$0);
      }

      if (this.W.s != null) {
         cud $$1 = this.W.s.ga().f();
         if ($$1.e()) {
            this.ad = 0;
         } else if (this.ae.e() || !$$1.a(this.ae.g()) || !$$1.w().equals(this.ae.w())) {
            this.ad = (int)(40.0 * this.W.m.B().c());
         } else if (this.ad > 0) {
            this.ad--;
         }

         this.ae = $$1;
      }

      this.X.a();
   }

   private void q() {
      MinecraftServer $$0 = this.W.V();
      boolean $$1 = $$0 != null && $$0.bi();
      this.av = this.au;
      this.au = ayg.i(0.2F, this.au, $$1 ? 1.0F : 0.0F);
   }

   public void a(wu $$0) {
      wu $$1 = wu.a("record.nowPlaying", $$0);
      this.a($$1, true);
      this.W.aV().c($$1);
   }

   public void a(wu $$0, boolean $$1) {
      this.b(false);
      this.Z = $$0;
      this.aa = 60;
      this.ab = $$1;
   }

   public void b(boolean $$0) {
      this.ac = $$0;
   }

   public boolean b() {
      return this.ac && this.aa > 0;
   }

   public void a(int $$0, int $$1, int $$2) {
      if ($$0 >= 0) {
         this.an = $$0;
      }

      if ($$1 >= 0) {
         this.ao = $$1;
      }

      if ($$2 >= 0) {
         this.ap = $$2;
      }

      if (this.ak > 0) {
         this.ak = this.an + this.ao + this.ap;
      }
   }

   public void b(wu $$0) {
      this.am = $$0;
   }

   public void c(wu $$0) {
      this.al = $$0;
      this.ak = this.an + this.ao + this.ap;
   }

   public void c() {
      this.al = null;
      this.am = null;
      this.ak = 0;
   }

   public fhv d() {
      return this.X;
   }

   public int e() {
      return this.Y;
   }

   public fhf f() {
      return this.W.h;
   }

   public fjt g() {
      return this.ah;
   }

   public fiv h() {
      return this.ai;
   }

   public void i() {
      this.ai.a();
      this.aj.a();
      this.W.aw().a();
      this.af.o();
      this.X.a(true);
   }

   public fht j() {
      return this.aj;
   }

   public fic k() {
      return this.af;
   }

   public void l() {
      this.af.a();
   }

   public void b(fhh $$0, ffn $$1) {
      if (this.W.m.af().c() && (this.au > 0.0F || this.av > 0.0F)) {
         int $$2 = ayg.d(255.0F * ayg.a(ayg.i($$1.b(), this.av, this.au), 0.0F, 1.0F));
         if ($$2 > 8) {
            fhf $$3 = this.f();
            int $$4 = $$3.a(M);
            int $$5 = axq.b.b($$2, -1);
            int $$6 = $$0.a() - $$4 - 2;
            int $$7 = $$0.b() - 35;
            $$0.a($$3, M, $$6, $$7, $$4, $$5);
         }
      }
   }

   static enum b {
      a(
         new akk("hud/heart/container"),
         new akk("hud/heart/container_blinking"),
         new akk("hud/heart/container"),
         new akk("hud/heart/container_blinking"),
         new akk("hud/heart/container_hardcore"),
         new akk("hud/heart/container_hardcore_blinking"),
         new akk("hud/heart/container_hardcore"),
         new akk("hud/heart/container_hardcore_blinking")
      ),
      b(
         new akk("hud/heart/full"),
         new akk("hud/heart/full_blinking"),
         new akk("hud/heart/half"),
         new akk("hud/heart/half_blinking"),
         new akk("hud/heart/hardcore_full"),
         new akk("hud/heart/hardcore_full_blinking"),
         new akk("hud/heart/hardcore_half"),
         new akk("hud/heart/hardcore_half_blinking")
      ),
      c(
         new akk("hud/heart/poisoned_full"),
         new akk("hud/heart/poisoned_full_blinking"),
         new akk("hud/heart/poisoned_half"),
         new akk("hud/heart/poisoned_half_blinking"),
         new akk("hud/heart/poisoned_hardcore_full"),
         new akk("hud/heart/poisoned_hardcore_full_blinking"),
         new akk("hud/heart/poisoned_hardcore_half"),
         new akk("hud/heart/poisoned_hardcore_half_blinking")
      ),
      d(
         new akk("hud/heart/withered_full"),
         new akk("hud/heart/withered_full_blinking"),
         new akk("hud/heart/withered_half"),
         new akk("hud/heart/withered_half_blinking"),
         new akk("hud/heart/withered_hardcore_full"),
         new akk("hud/heart/withered_hardcore_full_blinking"),
         new akk("hud/heart/withered_hardcore_half"),
         new akk("hud/heart/withered_hardcore_half_blinking")
      ),
      e(
         new akk("hud/heart/absorbing_full"),
         new akk("hud/heart/absorbing_full_blinking"),
         new akk("hud/heart/absorbing_half"),
         new akk("hud/heart/absorbing_half_blinking"),
         new akk("hud/heart/absorbing_hardcore_full"),
         new akk("hud/heart/absorbing_hardcore_full_blinking"),
         new akk("hud/heart/absorbing_hardcore_half"),
         new akk("hud/heart/absorbing_hardcore_half_blinking")
      ),
      f(
         new akk("hud/heart/frozen_full"),
         new akk("hud/heart/frozen_full_blinking"),
         new akk("hud/heart/frozen_half"),
         new akk("hud/heart/frozen_half_blinking"),
         new akk("hud/heart/frozen_hardcore_full"),
         new akk("hud/heart/frozen_hardcore_full_blinking"),
         new akk("hud/heart/frozen_hardcore_half"),
         new akk("hud/heart/frozen_hardcore_half_blinking")
      );

      private final akk g;
      private final akk h;
      private final akk i;
      private final akk j;
      private final akk k;
      private final akk l;
      private final akk m;
      private final akk n;

      private b(final akk $$0, final akk $$1, final akk $$2, final akk $$3, final akk $$4, final akk $$5, final akk $$6, final akk $$7) {
         this.g = $$0;
         this.h = $$1;
         this.i = $$2;
         this.j = $$3;
         this.k = $$4;
         this.l = $$5;
         this.m = $$6;
         this.n = $$7;
      }

      public akk a(boolean $$0, boolean $$1, boolean $$2) {
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

      static fhg.b a(cml $$0) {
         fhg.b $$1;
         if ($$0.b(brr.s)) {
            $$1 = c;
         } else if ($$0.b(brr.t)) {
            $$1 = d;
         } else if ($$0.cq()) {
            $$1 = f;
         } else {
            $$1 = b;
         }

         return $$1;
      }
   }
}
