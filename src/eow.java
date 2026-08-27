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

public class eow {
   private static final acq b = new acq("textures/misc/vignette.png");
   private static final acq c = new acq("textures/gui/widgets.png");
   private static final acq d = new acq("textures/misc/pumpkinblur.png");
   private static final acq e = new acq("textures/misc/spyglass_scope.png");
   private static final acq f = new acq("textures/misc/powder_snow_outline.png");
   private static final acq g = new acq("textures/gui/icons.png");
   private static final sw h = sw.c("demo.demoExpired");
   private static final sw i = sw.c("menu.savingLevel");
   private static final int j = 16777215;
   private static final float k = 5.0F;
   private static final int l = 10;
   private static final int m = 10;
   private static final String n = ": ";
   private static final float o = 0.2F;
   private static final int p = 9;
   private static final int q = 8;
   private static final float r = 0.2F;
   private final apf s = apf.a();
   private final enn t;
   private final fpw u;
   private final epj v;
   private int w;
   @Nullable
   private sw x;
   private int y;
   private boolean z;
   private boolean A;
   public float a = 1.0F;
   private int B;
   private cfz C = cfz.b;
   private final epq D;
   private final eql E;
   private final eqw F;
   private final eqg G;
   private final eph H;
   private int I;
   @Nullable
   private sw J;
   @Nullable
   private sw K;
   private int L;
   private int M;
   private int N;
   private int O;
   private int P;
   private long Q;
   private long R;
   private int S;
   private int T;
   private float U;
   private float V;
   private float W;

   public eow(enn $$0, fpw $$1) {
      this.t = $$0;
      this.u = $$1;
      this.D = new epq($$0);
      this.F = new eqw($$0);
      this.v = new epj($$0);
      this.G = new eqg($$0, this);
      this.H = new eph($$0);
      this.E = new eql($$0);
      this.a();
   }

   public void a() {
      this.L = 10;
      this.M = 70;
      this.N = 20;
   }

   public void a(eox $$0, float $$1) {
      ehn $$2 = this.t.aM();
      this.S = $$0.a();
      this.T = $$0.b();
      eov $$3 = this.f();
      RenderSystem.enableBlend();
      if (enn.K()) {
         this.a($$0, this.t.al());
      } else {
         RenderSystem.enableDepthTest();
      }

      float $$4 = this.t.aw();
      this.W = apa.i(0.5F * $$4, this.W, 1.125F);
      if (this.t.m.au().a()) {
         if (this.t.t.gl()) {
            this.b($$0, this.W);
         } else {
            this.W = 0.5F;
            cfz $$5 = this.t.t.fN().e(3);
            if ($$5.a(cpo.ef.k())) {
               this.a($$0, d, 1.0F);
            }
         }
      }

      if (this.t.t.cg() > 0) {
         this.a($$0, f, this.t.t.ch());
      }

      float $$6 = apa.i($$1, this.t.t.cu, this.t.t.ct);
      if ($$6 > 0.0F && !this.t.t.a(bfc.i)) {
         this.c($$0, $$6);
      }

      if (this.t.r.l() == cmj.d) {
         this.F.a($$0);
      } else if (!this.t.m.Z) {
         this.a($$1, $$0);
      }

      if (!this.t.m.Z) {
         RenderSystem.enableBlend();
         this.d($$0);
         this.t.aG().a("bossHealth");
         this.H.a($$0);
         this.t.aG().c();
         if (this.t.r.a()) {
            this.e($$0);
         }

         this.f($$0);
         RenderSystem.disableBlend();
         int $$7 = this.S / 2 - 91;
         bgk $$8 = this.t.t.z();
         if ($$8 != null) {
            this.a($$8, $$0, $$7);
         } else if (this.t.r.e()) {
            this.a($$0, $$7);
         }

         if (this.t.r.l() != cmj.d) {
            this.b($$0);
         } else if (this.t.t.G_()) {
            this.F.b($$0);
         }
      }

      if (this.t.t.fR() > 0) {
         this.t.aG().a("sleep");
         float $$9 = (float)this.t.t.fR();
         float $$10 = $$9 / 100.0F;
         if ($$10 > 1.0F) {
            $$10 = 1.0F - ($$9 - 100.0F) / 10.0F;
         }

         int $$11 = (int)(220.0F * $$10) << 24 | 1052704;
         $$0.a(fkf.D(), 0, 0, this.S, this.T, $$11);
         this.t.aG().c();
      }

      if (this.t.H()) {
         this.c($$0);
      }

      this.a($$0);
      if (this.t.m.aa) {
         this.D.a($$0);
      }

      if (!this.t.m.Z) {
         if (this.x != null && this.y > 0) {
            this.t.aG().a("overlayMessage");
            float $$12 = (float)this.y - $$1;
            int $$13 = (int)($$12 * 255.0F / 20.0F);
            if ($$13 > 255) {
               $$13 = 255;
            }

            if ($$13 > 8) {
               $$0.c().a();
               $$0.c().a((float)(this.S / 2), (float)(this.T - 68), 0.0F);
               int $$14 = 16777215;
               if (this.z) {
                  $$14 = apa.h($$12 / 50.0F, 0.7F, 0.6F) & 16777215;
               }

               int $$15 = $$13 << 24 & 0xFF000000;
               int $$16 = $$3.a(this.x);
               this.a($$0, $$3, -4, $$16, 16777215 | $$15);
               $$0.b($$3, this.x, -$$16 / 2, -4, $$14 | $$15);
               $$0.c().b();
            }

            this.t.aG().c();
         }

         if (this.J != null && this.I > 0) {
            this.t.aG().a("titleAndSubtitle");
            float $$17 = (float)this.I - $$1;
            int $$18 = 255;
            if (this.I > this.N + this.M) {
               float $$19 = (float)(this.L + this.M + this.N) - $$17;
               $$18 = (int)($$19 * 255.0F / (float)this.L);
            }

            if (this.I <= this.N) {
               $$18 = (int)($$17 * 255.0F / (float)this.N);
            }

            $$18 = apa.a($$18, 0, 255);
            if ($$18 > 8) {
               $$0.c().a();
               $$0.c().a((float)(this.S / 2), (float)(this.T / 2), 0.0F);
               RenderSystem.enableBlend();
               $$0.c().a();
               $$0.c().b(4.0F, 4.0F, 4.0F);
               int $$20 = $$18 << 24 & 0xFF000000;
               int $$21 = $$3.a(this.J);
               this.a($$0, $$3, -10, $$21, 16777215 | $$20);
               $$0.b($$3, this.J, -$$21 / 2, -10, 16777215 | $$20);
               $$0.c().b();
               if (this.K != null) {
                  $$0.c().a();
                  $$0.c().b(2.0F, 2.0F, 2.0F);
                  int $$22 = $$3.a(this.K);
                  this.a($$0, $$3, 5, $$22, 16777215 | $$20);
                  $$0.b($$3, this.K, -$$22 / 2, 5, 16777215 | $$20);
                  $$0.c().b();
               }

               RenderSystem.disableBlend();
               $$0.c().b();
            }

            this.t.aG().c();
         }

         this.E.a($$0);
         efg $$23 = this.t.s.I();
         efd $$24 = null;
         efe $$25 = $$23.i(this.t.t.cv());
         if ($$25 != null) {
            int $$26 = $$25.n().b();
            if ($$26 >= 0) {
               $$24 = $$23.a(3 + $$26);
            }
         }

         efd $$27 = $$24 != null ? $$24 : $$23.a(1);
         if ($$27 != null) {
            this.a($$0, $$27);
         }

         RenderSystem.enableBlend();
         int $$28 = apa.a(this.t.n.e() * (double)$$2.o() / (double)$$2.m());
         int $$29 = apa.a(this.t.n.f() * (double)$$2.p() / (double)$$2.n());
         this.t.aG().a("chat");
         this.v.a($$0, this.w, $$28, $$29);
         this.t.aG().c();
         $$27 = $$23.a(0);
         if (!this.t.m.L.e() || this.t.Q() && this.t.t.cl.h().size() <= 1 && $$27 == null) {
            this.G.a(false);
         } else {
            this.G.a(true);
            this.G.a($$0, this.S, $$23, $$27);
         }

         this.g($$0);
      }
   }

   private void a(eox $$0, eov $$1, int $$2, int $$3, int $$4) {
      int $$5 = this.t.m.b(0.0F);
      if ($$5 != 0) {
         int $$6 = -$$3 / 2;
         $$0.a($$6 - 2, $$2 - 2, $$6 + $$3 + 2, $$2 + 9 + 2, aok.b.a($$5, $$4));
      }
   }

   private void d(eox $$0) {
      enr $$1 = this.t.m;
      if ($$1.au().a()) {
         if (this.t.r.l() != cmj.d || this.a(this.t.w)) {
            if ($$1.aa && !$$1.Z && !this.t.t.gd() && !$$1.Q().c()) {
               emz $$2 = this.t.j.m();
               eij $$3 = RenderSystem.getModelViewStack();
               $$3.a();
               $$3.a($$0.c().c().a());
               $$3.a((float)(this.S / 2), (float)(this.T / 2), 0.0F);
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
               $$0.a(g, (this.S - 15) / 2, (this.T - 15) / 2, 0, 0, 15, 15);
               if (this.t.m.z().c() == emy.b) {
                  float $$5 = this.t.t.A(0.0F);
                  boolean $$6 = false;
                  if (this.t.v != null && this.t.v instanceof bfz && $$5 >= 1.0F) {
                     $$6 = this.t.t.gg() > 5.0F;
                     $$6 &= this.t.v.bs();
                  }

                  int $$7 = this.T / 2 - 7 + 16;
                  int $$8 = this.S / 2 - 8;
                  if ($$6) {
                     $$0.a(g, $$8, $$7, 68, 94, 16, 16);
                  } else if ($$5 < 1.0F) {
                     int $$9 = (int)($$5 * 17.0F);
                     $$0.a(g, $$8, $$7, 36, 94, 16, 4);
                     $$0.a(g, $$8, $$7, 52, 94, $$9, 4);
                  }
               }

               RenderSystem.defaultBlendFunc();
            }
         }
      }
   }

   private boolean a(eeg $$0) {
      if ($$0 == null) {
         return false;
      } else if ($$0.c() == eeg.a.c) {
         return ((eef)$$0).a() instanceof bea;
      } else if ($$0.c() == eeg.a.b) {
         gu $$1 = ((eee)$$0).a();
         cmm $$2 = this.t.s;
         return $$2.a_($$1).b($$2, $$1) != null;
      } else {
         return false;
      }
   }

   protected void a(eox $$0) {
      Collection<bfa> $$1 = this.t.t.eo();
      if (!$$1.isEmpty()) {
         if (this.t.z instanceof ewg $$2 && $$2.F()) {
            return;
         }

         RenderSystem.enableBlend();
         int $$3 = 0;
         int $$4 = 0;
         fvs $$5 = this.t.aF();
         List<Runnable> $$6 = Lists.newArrayListWithExpectedSize($$1.size());

         for (bfa $$7 : Ordering.natural().reverse().sortedCopy($$1)) {
            bey $$8 = $$7.c();
            if ($$7.h()) {
               int $$9 = this.S;
               int $$10 = 1;
               if (this.t.H()) {
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
                  $$0.a(evp.a, $$9, $$10, 165, 166, 24, 24);
               } else {
                  $$0.a(evp.a, $$9, $$10, 141, 166, 24, 24);
                  if ($$7.a(200)) {
                     int $$12 = $$7.d();
                     int $$13 = 10 - $$12 / 20;
                     $$11 = apa.a((float)$$12 / 10.0F / 5.0F * 0.5F, 0.0F, 0.5F)
                        + apa.b((float)$$12 * (float) Math.PI / 5.0F) * apa.a((float)$$13 / 10.0F * 0.25F, 0.0F, 0.25F);
                  }
               }

               fuv $$14 = $$5.a($$8);
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

   private void a(float $$0, eox $$1) {
      byo $$2 = this.l();
      if ($$2 != null) {
         cfz $$3 = $$2.eP();
         bft $$4 = $$2.fh().d();
         int $$5 = this.S / 2;
         int $$6 = 182;
         int $$7 = 91;
         $$1.c().a();
         $$1.c().a(0.0F, 0.0F, -90.0F);
         $$1.a(c, $$5 - 91, this.T - 22, 0, 0, 182, 22);
         $$1.a(c, $$5 - 91 - 1 + $$2.fN().l * 20, this.T - 22 - 1, 0, 22, 24, 22);
         if (!$$3.b()) {
            if ($$4 == bft.a) {
               $$1.a(c, $$5 - 91 - 29, this.T - 23, 24, 22, 29, 24);
            } else {
               $$1.a(c, $$5 + 91, this.T - 23, 53, 22, 29, 24);
            }
         }

         $$1.c().b();
         int $$8 = 1;

         for (int $$9 = 0; $$9 < 9; $$9++) {
            int $$10 = $$5 - 90 + $$9 * 20 + 2;
            int $$11 = this.T - 16 - 3;
            this.a($$1, $$10, $$11, $$0, $$2, $$2.fN().i.get($$9), $$8++);
         }

         if (!$$3.b()) {
            int $$12 = this.T - 16 - 3;
            if ($$4 == bft.a) {
               this.a($$1, $$5 - 91 - 26, $$12, $$0, $$2, $$3, $$8++);
            } else {
               this.a($$1, $$5 + 91 + 10, $$12, $$0, $$2, $$3, $$8++);
            }
         }

         RenderSystem.enableBlend();
         if (this.t.m.z().c() == emy.c) {
            float $$13 = this.t.t.A(0.0F);
            if ($$13 < 1.0F) {
               int $$14 = this.T - 20;
               int $$15 = $$5 + 91 + 6;
               if ($$4 == bft.b) {
                  $$15 = $$5 - 91 - 22;
               }

               int $$16 = (int)($$13 * 19.0F);
               $$1.a(g, $$15, $$14, 0, 94, 18, 18);
               $$1.a(g, $$15, $$14 + 18 - $$16, 18, 112 - $$16, 18, $$16);
            }
         }

         RenderSystem.disableBlend();
      }
   }

   public void a(bgk $$0, eox $$1, int $$2) {
      this.t.aG().a("jumpBar");
      float $$3 = this.t.t.A();
      int $$4 = 182;
      int $$5 = (int)($$3 * 183.0F);
      int $$6 = this.T - 32 + 3;
      $$1.a(g, $$2, $$6, 0, 84, 182, 5);
      if ($$0.W_() > 0) {
         $$1.a(g, $$2, $$6, 0, 74, 182, 5);
      } else if ($$5 > 0) {
         $$1.a(g, $$2, $$6, 0, 89, $$5, 5);
      }

      this.t.aG().c();
   }

   public void a(eox $$0, int $$1) {
      this.t.aG().a("expBar");
      int $$2 = this.t.t.fW();
      if ($$2 > 0) {
         int $$3 = 182;
         int $$4 = (int)(this.t.t.cg * 183.0F);
         int $$5 = this.T - 32 + 3;
         $$0.a(g, $$1, $$5, 0, 64, 182, 5);
         if ($$4 > 0) {
            $$0.a(g, $$1, $$5, 0, 69, $$4, 5);
         }
      }

      this.t.aG().c();
      if (this.t.t.ce > 0) {
         this.t.aG().a("expLevel");
         String $$6 = this.t.t.ce + "";
         int $$7 = (this.S - this.f().b($$6)) / 2;
         int $$8 = this.T - 31 - 4;
         $$0.a(this.f(), $$6, $$7 + 1, $$8, 0, false);
         $$0.a(this.f(), $$6, $$7 - 1, $$8, 0, false);
         $$0.a(this.f(), $$6, $$7, $$8 + 1, 0, false);
         $$0.a(this.f(), $$6, $$7, $$8 - 1, 0, false);
         $$0.a(this.f(), $$6, $$7, $$8, 8453920, false);
         this.t.aG().c();
      }
   }

   public void b(eox $$0) {
      this.t.aG().a("selectedItemName");
      if (this.B > 0 && !this.C.b()) {
         tj $$1 = sw.h().b(this.C.y()).a(this.C.C().e);
         if (this.C.A()) {
            $$1.a(n.u);
         }

         int $$2 = this.f().a($$1);
         int $$3 = (this.S - $$2) / 2;
         int $$4 = this.T - 59;
         if (!this.t.r.a()) {
            $$4 += 14;
         }

         int $$5 = (int)((float)this.B * 256.0F / 10.0F);
         if ($$5 > 255) {
            $$5 = 255;
         }

         if ($$5 > 0) {
            $$0.a($$3 - 2, $$4 - 2, $$3 + $$2 + 2, $$4 + 9 + 2, this.t.m.a(0));
            $$0.b(this.f(), $$1, $$3, $$4, 16777215 + ($$5 << 24));
         }
      }

      this.t.aG().c();
   }

   public void c(eox $$0) {
      this.t.aG().a("demo");
      sw $$1;
      if (this.t.s.V() >= 120500L) {
         $$1 = h;
      } else {
         $$1 = sw.a("demo.remainingTime", aps.a((int)(120500L - this.t.s.V())));
      }

      int $$3 = this.f().a($$1);
      $$0.b(this.f(), $$1, this.S - $$3 - 10, 5, 16777215);
      this.t.aG().c();
   }

   private void a(eox $$0, efd $$1) {
      efg $$2 = $$1.a();
      Collection<eff> $$3 = $$2.i($$1);
      List<eff> $$4 = $$3.stream().filter($$0x -> $$0x.e() != null && !$$0x.e().startsWith("#")).collect(Collectors.toList());
      if ($$4.size() > 15) {
         $$3 = Lists.newArrayList(Iterables.skip($$4, $$3.size() - 15));
      } else {
         $$3 = $$4;
      }

      List<Pair<eff, sw>> $$5 = Lists.newArrayListWithCapacity($$3.size());
      sw $$6 = $$1.d();
      int $$7 = this.f().a($$6);
      int $$8 = $$7;
      int $$9 = this.f().b(": ");

      for (eff $$10 : $$3) {
         efe $$11 = $$2.i($$10.e());
         sw $$12 = efe.a($$11, sw.b($$10.e()));
         $$5.add(Pair.of($$10, $$12));
         $$8 = Math.max($$8, this.f().a($$12) + $$9 + this.f().b(Integer.toString($$10.b())));
      }

      int $$13 = $$3.size() * 9;
      int $$14 = this.T / 2 + $$13 / 3;
      int $$15 = 3;
      int $$16 = this.S - $$8 - 3;
      int $$17 = 0;
      int $$18 = this.t.m.b(0.3F);
      int $$19 = this.t.m.b(0.4F);

      for (Pair<eff, sw> $$20 : $$5) {
         $$17++;
         eff $$21 = (eff)$$20.getFirst();
         sw $$22 = (sw)$$20.getSecond();
         String $$23 = "" + n.m + $$21.b();
         int $$25 = $$14 - $$17 * 9;
         int $$26 = this.S - 3 + 2;
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

   private byo l() {
      return !(this.t.al() instanceof byo) ? null : (byo)this.t.al();
   }

   private bfz m() {
      byo $$0 = this.l();
      if ($$0 != null) {
         bfj $$1 = $$0.cW();
         if ($$1 == null) {
            return null;
         }

         if ($$1 instanceof bfz) {
            return (bfz)$$1;
         }
      }

      return null;
   }

   private int a(bfz $$0) {
      if ($$0 != null && $$0.by()) {
         float $$1 = $$0.eI();
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

   private void e(eox $$0) {
      byo $$1 = this.l();
      if ($$1 != null) {
         int $$2 = apa.f($$1.er());
         boolean $$3 = this.R > (long)this.w && (this.R - (long)this.w) / 3L % 2L == 1L;
         long $$4 = ac.b();
         if ($$2 < this.O && $$1.ak > 0) {
            this.Q = $$4;
            this.R = (long)(this.w + 20);
         } else if ($$2 > this.O && $$1.ak > 0) {
            this.Q = $$4;
            this.R = (long)(this.w + 10);
         }

         if ($$4 - this.Q > 1000L) {
            this.O = $$2;
            this.P = $$2;
            this.Q = $$4;
         }

         this.O = $$2;
         int $$5 = this.P;
         this.s.b((long)(this.w * 312871));
         cbb $$6 = $$1.fX();
         int $$7 = $$6.a();
         int $$8 = this.S / 2 - 91;
         int $$9 = this.S / 2 + 91;
         int $$10 = this.T - 39;
         float $$11 = Math.max((float)$$1.b(bhg.a), (float)Math.max($$5, $$2));
         int $$12 = apa.f($$1.ff());
         int $$13 = apa.f(($$11 + (float)$$12) / 2.0F / 10.0F);
         int $$14 = Math.max(10 - ($$13 - 2), 3);
         int $$15 = $$10 - ($$13 - 1) * $$14 - 10;
         int $$16 = $$10 - 10;
         int $$17 = $$1.eF();
         int $$18 = -1;
         if ($$1.a(bfc.j)) {
            $$18 = this.w % apa.f($$11 + 5.0F);
         }

         this.t.aG().a("armor");

         for (int $$19 = 0; $$19 < 10; $$19++) {
            if ($$17 > 0) {
               int $$20 = $$8 + $$19 * 8;
               if ($$19 * 2 + 1 < $$17) {
                  $$0.a(g, $$20, $$15, 34, 9, 9, 9);
               }

               if ($$19 * 2 + 1 == $$17) {
                  $$0.a(g, $$20, $$15, 25, 9, 9, 9);
               }

               if ($$19 * 2 + 1 > $$17) {
                  $$0.a(g, $$20, $$15, 16, 9, 9, 9);
               }
            }
         }

         this.t.aG().b("health");
         this.a($$0, $$1, $$8, $$10, $$14, $$18, $$11, $$2, $$5, $$12, $$3);
         bfz $$21 = this.m();
         int $$22 = this.a($$21);
         if ($$22 == 0) {
            this.t.aG().b("food");

            for (int $$23 = 0; $$23 < 10; $$23++) {
               int $$24 = $$10;
               int $$25 = 16;
               int $$26 = 0;
               if ($$1.a(bfc.q)) {
                  $$25 += 36;
                  $$26 = 13;
               }

               if ($$1.fX().e() <= 0.0F && this.w % ($$7 * 3 + 1) == 0) {
                  $$24 = $$10 + (this.s.a(3) - 1);
               }

               int $$27 = $$9 - $$23 * 8 - 9;
               $$0.a(g, $$27, $$24, 16 + $$26 * 9, 27, 9, 9);
               if ($$23 * 2 + 1 < $$7) {
                  $$0.a(g, $$27, $$24, $$25 + 36, 27, 9, 9);
               }

               if ($$23 * 2 + 1 == $$7) {
                  $$0.a(g, $$27, $$24, $$25 + 45, 27, 9, 9);
               }
            }

            $$16 -= 10;
         }

         this.t.aG().b("air");
         int $$28 = $$1.ce();
         int $$29 = Math.min($$1.cf(), $$28);
         if ($$1.a(anb.a) || $$29 < $$28) {
            int $$30 = this.a($$22) - 1;
            $$16 -= $$30 * 10;
            int $$31 = apa.c((double)($$29 - 2) * 10.0 / (double)$$28);
            int $$32 = apa.c((double)$$29 * 10.0 / (double)$$28) - $$31;

            for (int $$33 = 0; $$33 < $$31 + $$32; $$33++) {
               if ($$33 < $$31) {
                  $$0.a(g, $$9 - $$33 * 8 - 9, $$16, 16, 18, 9, 9);
               } else {
                  $$0.a(g, $$9 - $$33 * 8 - 9, $$16, 25, 18, 9, 9);
               }
            }
         }

         this.t.aG().c();
      }
   }

   private void a(eox $$0, byo $$1, int $$2, int $$3, int $$4, int $$5, float $$6, int $$7, int $$8, int $$9, boolean $$10) {
      eow.a $$11 = eow.a.a($$1);
      int $$12 = 9 * ($$1.dI().u_().n() ? 5 : 0);
      int $$13 = apa.c((double)$$6 / 2.0);
      int $$14 = apa.c((double)$$9 / 2.0);
      int $$15 = $$13 * 2;

      for (int $$16 = $$13 + $$14 - 1; $$16 >= 0; $$16--) {
         int $$17 = $$16 / 10;
         int $$18 = $$16 % 10;
         int $$19 = $$2 + $$18 * 8;
         int $$20 = $$3 - $$17 * $$4;
         if ($$7 + $$9 <= 4) {
            $$20 += this.s.a(2);
         }

         if ($$16 < $$13 && $$16 == $$5) {
            $$20 -= 2;
         }

         this.a($$0, eow.a.a, $$19, $$20, $$12, $$10, false);
         int $$21 = $$16 * 2;
         boolean $$22 = $$16 >= $$13;
         if ($$22) {
            int $$23 = $$21 - $$15;
            if ($$23 < $$9) {
               boolean $$24 = $$23 + 1 == $$9;
               this.a($$0, $$11 == eow.a.d ? $$11 : eow.a.e, $$19, $$20, $$12, false, $$24);
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

   private void a(eox $$0, eow.a $$1, int $$2, int $$3, int $$4, boolean $$5, boolean $$6) {
      $$0.a(g, $$2, $$3, $$1.a($$6, $$5), $$4, 9, 9);
   }

   private void f(eox $$0) {
      bfz $$1 = this.m();
      if ($$1 != null) {
         int $$2 = this.a($$1);
         if ($$2 != 0) {
            int $$3 = (int)Math.ceil((double)$$1.er());
            this.t.aG().b("mountHealth");
            int $$4 = this.T - 39;
            int $$5 = this.S / 2 + 91;
            int $$6 = $$4;
            int $$7 = 0;

            for (boolean $$8 = false; $$2 > 0; $$7 += 20) {
               int $$9 = Math.min($$2, 10);
               $$2 -= $$9;

               for (int $$10 = 0; $$10 < $$9; $$10++) {
                  int $$11 = 52;
                  int $$12 = 0;
                  int $$13 = $$5 - $$10 * 8 - 9;
                  $$0.a(g, $$13, $$6, 52 + $$12 * 9, 9, 9, 9);
                  if ($$10 * 2 + 1 + $$7 < $$3) {
                     $$0.a(g, $$13, $$6, 88, 9, 9, 9);
                  }

                  if ($$10 * 2 + 1 + $$7 == $$3) {
                     $$0.a(g, $$13, $$6, 97, 9, 9, 9);
                  }
               }

               $$6 -= 10;
            }
         }
      }
   }

   private void a(eox $$0, acq $$1, float $$2) {
      RenderSystem.disableDepthTest();
      RenderSystem.depthMask(false);
      $$0.a(1.0F, 1.0F, 1.0F, $$2);
      $$0.a($$1, 0, 0, -90, 0.0F, 0.0F, this.S, this.T, this.S, this.T);
      RenderSystem.depthMask(true);
      RenderSystem.enableDepthTest();
      $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
   }

   private void b(eox $$0, float $$1) {
      float $$2 = (float)Math.min(this.S, this.T);
      float $$4 = Math.min((float)this.S / $$2, (float)this.T / $$2) * $$1;
      int $$5 = apa.d($$2 * $$4);
      int $$6 = apa.d($$2 * $$4);
      int $$7 = (this.S - $$5) / 2;
      int $$8 = (this.T - $$6) / 2;
      int $$9 = $$7 + $$5;
      int $$10 = $$8 + $$6;
      $$0.a(e, $$7, $$8, -90, 0.0F, 0.0F, $$5, $$6, $$5, $$6);
      $$0.a(fkf.D(), 0, $$10, this.S, this.T, -90, -16777216);
      $$0.a(fkf.D(), 0, 0, this.S, $$8, -90, -16777216);
      $$0.a(fkf.D(), 0, $$8, $$7, $$10, -90, -16777216);
      $$0.a(fkf.D(), $$9, $$8, this.S, $$10, -90, -16777216);
   }

   private void a(bfj $$0) {
      if ($$0 != null) {
         gu $$1 = gu.a($$0.dn(), $$0.dr(), $$0.dt());
         float $$2 = fjw.a($$0.dI().x_(), $$0.dI().z($$1));
         float $$3 = apa.a(1.0F - $$2, 0.0F, 1.0F);
         this.a = this.a + ($$3 - this.a) * 0.01F;
      }
   }

   private void a(eox $$0, bfj $$1) {
      dds $$2 = this.t.s.w_();
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
         $$3 = apa.a($$3, 0.0F, 1.0F);
         $$0.a(0.0F, $$3, $$3, 1.0F);
      } else {
         float $$6 = this.a;
         $$6 = apa.a($$6, 0.0F, 1.0F);
         $$0.a($$6, $$6, $$6, 1.0F);
      }

      $$0.a(b, 0, 0, -90, 0.0F, 0.0F, this.S, this.T, this.S, this.T);
      RenderSystem.depthMask(true);
      RenderSystem.enableDepthTest();
      $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
      RenderSystem.defaultBlendFunc();
   }

   private void c(eox $$0, float $$1) {
      if ($$1 < 1.0F) {
         $$1 *= $$1;
         $$1 *= $$1;
         $$1 = $$1 * 0.8F + 0.2F;
      }

      RenderSystem.disableDepthTest();
      RenderSystem.depthMask(false);
      $$0.a(1.0F, 1.0F, 1.0F, $$1);
      fuv $$2 = this.t.am().a().a(cpo.ee.n());
      $$0.a(0, 0, -90, this.S, this.T, $$2);
      RenderSystem.depthMask(true);
      RenderSystem.enableDepthTest();
      $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
   }

   private void a(eox $$0, int $$1, int $$2, float $$3, byo $$4, cfz $$5, int $$6) {
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

         $$0.a(this.t.h, $$5, $$1, $$2);
      }
   }

   public void a(boolean $$0) {
      this.o();
      if (!$$0) {
         this.n();
      }
   }

   private void n() {
      if (this.y > 0) {
         this.y--;
      }

      if (this.I > 0) {
         this.I--;
         if (this.I <= 0) {
            this.J = null;
            this.K = null;
         }
      }

      this.w++;
      bfj $$0 = this.t.al();
      if ($$0 != null) {
         this.a($$0);
      }

      if (this.t.t != null) {
         cfz $$1 = this.t.t.fN().f();
         if ($$1.b()) {
            this.B = 0;
         } else if (this.C.b() || !$$1.a(this.C.d()) || !$$1.y().equals(this.C.y())) {
            this.B = (int)(40.0 * this.t.m.x().c());
         } else if (this.B > 0) {
            this.B--;
         }

         this.C = $$1;
      }

      this.v.a();
   }

   private void o() {
      MinecraftServer $$0 = this.t.S();
      boolean $$1 = $$0 != null && $$0.aZ();
      this.V = this.U;
      this.U = apa.i(0.2F, this.U, $$1 ? 1.0F : 0.0F);
   }

   public void a(sw $$0) {
      sw $$1 = sw.a("record.nowPlaying", $$0);
      this.a($$1, true);
      this.t.aU().c($$1);
   }

   public void a(sw $$0, boolean $$1) {
      this.b(false);
      this.x = $$0;
      this.y = 60;
      this.z = $$1;
   }

   public void b(boolean $$0) {
      this.A = $$0;
   }

   public boolean b() {
      return this.A && this.y > 0;
   }

   public void a(int $$0, int $$1, int $$2) {
      if ($$0 >= 0) {
         this.L = $$0;
      }

      if ($$1 >= 0) {
         this.M = $$1;
      }

      if ($$2 >= 0) {
         this.N = $$2;
      }

      if (this.I > 0) {
         this.I = this.L + this.M + this.N;
      }
   }

   public void b(sw $$0) {
      this.K = $$0;
   }

   public void c(sw $$0) {
      this.J = $$0;
      this.I = this.L + this.M + this.N;
   }

   public void c() {
      this.J = null;
      this.K = null;
      this.I = 0;
   }

   public epj d() {
      return this.v;
   }

   public int e() {
      return this.w;
   }

   public eov f() {
      return this.t.h;
   }

   public eqw g() {
      return this.F;
   }

   public eqg h() {
      return this.G;
   }

   public void i() {
      this.G.a();
      this.H.a();
      this.t.az().a();
      this.t.m.aa = false;
      this.v.a(true);
   }

   public eph j() {
      return this.H;
   }

   public void k() {
      this.D.a();
   }

   private void g(eox $$0) {
      if (this.t.m.aa().c() && (this.U > 0.0F || this.V > 0.0F)) {
         int $$1 = apa.d(255.0F * apa.a(apa.i(this.t.av(), this.V, this.U), 0.0F, 1.0F));
         if ($$1 > 8) {
            eov $$2 = this.f();
            int $$3 = $$2.a(i);
            int $$4 = 16777215 | $$1 << 24 & 0xFF000000;
            $$0.b($$2, i, this.S - $$3 - 10, this.T - 15, $$4);
         }
      }
   }

   static enum a {
      a(0, false),
      b(2, true),
      c(4, true),
      d(6, true),
      e(8, false),
      f(9, false);

      private final int g;
      private final boolean h;

      private a(int $$0, boolean $$1) {
         this.g = $$0;
         this.h = $$1;
      }

      public int a(boolean $$0, boolean $$1) {
         int $$2;
         if (this == a) {
            $$2 = $$1 ? 1 : 0;
         } else {
            int $$3 = $$0 ? 1 : 0;
            int $$4 = this.h && $$1 ? 2 : 0;
            $$2 = $$3 + $$4;
         }

         return 16 + (this.g * 2 + $$2) * 9;
      }

      static eow.a a(byo $$0) {
         eow.a $$1;
         if ($$0.a(bfc.s)) {
            $$1 = c;
         } else if ($$0.a(bfc.t)) {
            $$1 = d;
         } else if ($$0.ci()) {
            $$1 = f;
         } else {
            $$1 = b;
         }

         return $$1;
      }
   }
}
