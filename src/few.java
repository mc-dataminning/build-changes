import com.mojang.datafixers.util.Pair;
import java.util.List;
import javax.annotation.Nullable;

public class few extends fds<ciz> {
   private static final ahd x = new ahd("container/loom/banner_slot");
   private static final ahd y = new ahd("container/loom/dye_slot");
   private static final ahd z = new ahd("container/loom/pattern_slot");
   private static final ahd A = new ahd("container/loom/scroller");
   private static final ahd B = new ahd("container/loom/scroller_disabled");
   private static final ahd C = new ahd("container/loom/pattern_selected");
   private static final ahd D = new ahd("container/loom/pattern_highlighted");
   private static final ahd E = new ahd("container/loom/pattern");
   private static final ahd F = new ahd("container/loom/error");
   private static final ahd G = new ahd("textures/gui/container/loom.png");
   private static final int H = 4;
   private static final int I = 4;
   private static final int J = 12;
   private static final int K = 15;
   private static final int L = 14;
   private static final int M = 56;
   private static final int N = 60;
   private static final int O = 13;
   private fmp P;
   @Nullable
   private List<Pair<ih<dgf>, clf>> Q;
   private cmr R = cmr.f;
   private cmr S = cmr.f;
   private cmr T = cmr.f;
   private boolean U;
   private boolean V;
   private float W;
   private boolean X;
   private int Y;

   public few(ciz $$0, cfa $$1, vd $$2) {
      super($$0, $$1, $$2);
      $$0.a(this::H);
      this.m -= 2;
   }

   @Override
   protected void aN_() {
      super.aN_();
      this.P = this.f.aO().a(fmo.f).b("flag");
   }

   @Override
   public void a(ewm $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.a($$0, $$1, $$2);
   }

   private int E() {
      return aui.e(this.p.l().size(), 4);
   }

   @Override
   protected void a(ewm $$0, float $$1, int $$2, int $$3) {
      int $$4 = this.t;
      int $$5 = this.u;
      $$0.a(G, $$4, $$5, 0, 0, this.c, this.k);
      cjp $$6 = this.p.n();
      cjp $$7 = this.p.o();
      cjp $$8 = this.p.p();
      cjp $$9 = this.p.q();
      if (!$$6.h()) {
         $$0.a(x, $$4 + $$6.f, $$5 + $$6.g, 16, 16);
      }

      if (!$$7.h()) {
         $$0.a(y, $$4 + $$7.f, $$5 + $$7.g, 16, 16);
      }

      if (!$$8.h()) {
         $$0.a(z, $$4 + $$8.f, $$5 + $$8.g, 16, 16);
      }

      int $$10 = (int)(41.0F * this.W);
      ahd $$11 = this.U ? A : B;
      $$0.a($$11, $$4 + 119, $$5 + 13 + $$10, 12, 15);
      eop.a();
      if (this.Q != null && !this.V) {
         $$0.c().a();
         $$0.c().a((float)($$4 + 139), (float)($$5 + 52), 0.0F);
         $$0.c().b(24.0F, -24.0F, 1.0F);
         $$0.c().a(0.5F, 0.5F, 0.5F);
         float $$12 = 0.6666667F;
         $$0.c().b(0.6666667F, -0.6666667F, -0.6666667F);
         this.P.e = 0.0F;
         this.P.c = -32.0F;
         fuu.a($$0.c(), $$0.d(), 15728880, gdw.d, this.P, ggl.f, true, this.Q);
         $$0.c().b();
         $$0.e();
      } else if (this.V) {
         $$0.a(F, $$4 + $$9.f - 5, $$5 + $$9.g - 5, 26, 26);
      }

      if (this.U) {
         int $$13 = $$4 + 60;
         int $$14 = $$5 + 13;
         List<ih<dgf>> $$15 = this.p.l();

         label64:
         for (int $$16 = 0; $$16 < 4; $$16++) {
            for (int $$17 = 0; $$17 < 4; $$17++) {
               int $$18 = $$16 + this.Y;
               int $$19 = $$18 * 4 + $$17;
               if ($$19 >= $$15.size()) {
                  break label64;
               }

               int $$20 = $$13 + $$17 * 14;
               int $$21 = $$14 + $$16 * 14;
               boolean $$22 = $$2 >= $$20 && $$3 >= $$21 && $$2 < $$20 + 14 && $$3 < $$21 + 14;
               ahd $$23;
               if ($$19 == this.p.m()) {
                  $$23 = C;
               } else if ($$22) {
                  $$23 = D;
               } else {
                  $$23 = E;
               }

               $$0.a($$23, $$20, $$21, 14, 14);
               this.a($$0, $$15.get($$19), $$20, $$21);
            }
         }
      }

      eop.b();
   }

   private void a(ewm $$0, ih<dgf> $$1, int $$2, int $$3) {
      sl $$4 = new sl();
      sr $$5 = new dgf.a().a(dgg.a, clf.h).a($$1, clf.a).a();
      $$4.a("Patterns", $$5);
      cmr $$6 = new cmr(cmu.uP);
      ckk.a($$6, dgq.t, $$4);
      ept $$7 = new ept();
      $$7.a();
      $$7.a((float)$$2 + 0.5F, (float)($$3 + 16), 0.0F);
      $$7.b(6.0F, -6.0F, 1.0F);
      $$7.a(0.5F, 0.5F, 0.0F);
      $$7.a(0.5F, 0.5F, 0.5F);
      float $$8 = 0.6666667F;
      $$7.b(0.6666667F, -0.6666667F, -0.6666667F);
      this.P.e = 0.0F;
      this.P.c = -32.0F;
      List<Pair<ih<dgf>, clf>> $$9 = dge.a(clf.h, dge.a($$6));
      fuu.a($$7, $$0.d(), 15728880, gdw.d, this.P, ggl.f, true, $$9);
      $$7.b();
      $$0.e();
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      this.X = false;
      if (this.U) {
         int $$3 = this.t + 60;
         int $$4 = this.u + 13;

         for (int $$5 = 0; $$5 < 4; $$5++) {
            for (int $$6 = 0; $$6 < 4; $$6++) {
               double $$7 = $$0 - (double)($$3 + $$6 * 14);
               double $$8 = $$1 - (double)($$4 + $$5 * 14);
               int $$9 = $$5 + this.Y;
               int $$10 = $$9 * 4 + $$6;
               if ($$7 >= 0.0 && $$8 >= 0.0 && $$7 < 14.0 && $$8 < 14.0 && this.p.b(this.f.s, $$10)) {
                  eva.N().ah().a(ghi.a(arm.zv, 1.0F));
                  this.f.q.a(this.p.j, $$10);
                  return true;
               }
            }
         }

         $$3 = this.t + 119;
         $$4 = this.u + 9;
         if ($$0 >= (double)$$3 && $$0 < (double)($$3 + 12) && $$1 >= (double)$$4 && $$1 < (double)($$4 + 56)) {
            this.X = true;
         }
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2, double $$3, double $$4) {
      int $$5 = this.E() - 4;
      if (this.X && this.U && $$5 > 0) {
         int $$6 = this.u + 13;
         int $$7 = $$6 + 56;
         this.W = ((float)$$1 - (float)$$6 - 7.5F) / ((float)($$7 - $$6) - 15.0F);
         this.W = aui.a(this.W, 0.0F, 1.0F);
         this.Y = Math.max((int)((double)(this.W * (float)$$5) + 0.5), 0);
         return true;
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public boolean a(double $$0, double $$1, double $$2, double $$3) {
      int $$4 = this.E() - 4;
      if (this.U && $$4 > 0) {
         float $$5 = (float)$$3 / (float)$$4;
         this.W = aui.a(this.W - $$5, 0.0F, 1.0F);
         this.Y = Math.max((int)(this.W * (float)$$4 + 0.5F), 0);
      }

      return true;
   }

   @Override
   protected boolean a(double $$0, double $$1, int $$2, int $$3, int $$4) {
      return $$0 < (double)$$2 || $$1 < (double)$$3 || $$0 >= (double)($$2 + this.c) || $$1 >= (double)($$3 + this.k);
   }

   private void H() {
      cmr $$0 = this.p.q().g();
      if ($$0.b()) {
         this.Q = null;
      } else {
         this.Q = dge.a(((ckh)$$0.d()).b(), dge.a($$0));
      }

      cmr $$1 = this.p.n().g();
      cmr $$2 = this.p.o().g();
      cmr $$3 = this.p.p().g();
      sl $$4 = ckk.a($$1);
      this.V = $$4 != null && $$4.b("Patterns", 9) && !$$1.b() && $$4.c("Patterns", 10).size() >= 6;
      if (this.V) {
         this.Q = null;
      }

      if (!cmr.a($$1, this.R) || !cmr.a($$2, this.S) || !cmr.a($$3, this.T)) {
         this.U = !$$1.b() && !$$2.b() && !this.V && !this.p.l().isEmpty();
      }

      if (this.Y >= this.E()) {
         this.Y = 0;
         this.W = 0.0F;
      }

      this.R = $$1.p();
      this.S = $$2.p();
      this.T = $$3.p();
   }
}
