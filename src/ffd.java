import com.mojang.datafixers.util.Pair;
import java.util.List;
import javax.annotation.Nullable;

public class ffd extends fdz<cjf> {
   private static final ahg x = new ahg("container/loom/banner_slot");
   private static final ahg y = new ahg("container/loom/dye_slot");
   private static final ahg z = new ahg("container/loom/pattern_slot");
   private static final ahg A = new ahg("container/loom/scroller");
   private static final ahg B = new ahg("container/loom/scroller_disabled");
   private static final ahg C = new ahg("container/loom/pattern_selected");
   private static final ahg D = new ahg("container/loom/pattern_highlighted");
   private static final ahg E = new ahg("container/loom/pattern");
   private static final ahg F = new ahg("container/loom/error");
   private static final ahg G = new ahg("textures/gui/container/loom.png");
   private static final int H = 4;
   private static final int I = 4;
   private static final int J = 12;
   private static final int K = 15;
   private static final int L = 14;
   private static final int M = 56;
   private static final int N = 60;
   private static final int O = 13;
   private fmw P;
   @Nullable
   private List<Pair<ih<dgl>, cll>> Q;
   private cmx R = cmx.f;
   private cmx S = cmx.f;
   private cmx T = cmx.f;
   private boolean U;
   private boolean V;
   private float W;
   private boolean X;
   private int Y;

   public ffd(cjf $$0, cfg $$1, vf $$2) {
      super($$0, $$1, $$2);
      $$0.a(this::I);
      this.m -= 2;
   }

   @Override
   protected void aN_() {
      super.aN_();
      this.P = this.f.aP().a(fmv.f).b("flag");
   }

   @Override
   public void a(ewt $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.a($$0, $$1, $$2);
   }

   private int H() {
      return aun.e(this.p.l().size(), 4);
   }

   @Override
   protected void a(ewt $$0, float $$1, int $$2, int $$3) {
      int $$4 = this.t;
      int $$5 = this.u;
      $$0.a(G, $$4, $$5, 0, 0, this.c, this.k);
      cjv $$6 = this.p.n();
      cjv $$7 = this.p.o();
      cjv $$8 = this.p.p();
      cjv $$9 = this.p.q();
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
      ahg $$11 = this.U ? A : B;
      $$0.a($$11, $$4 + 119, $$5 + 13 + $$10, 12, 15);
      eow.a();
      if (this.Q != null && !this.V) {
         $$0.c().a();
         $$0.c().a((float)($$4 + 139), (float)($$5 + 52), 0.0F);
         $$0.c().b(24.0F, -24.0F, 1.0F);
         $$0.c().a(0.5F, 0.5F, 0.5F);
         float $$12 = 0.6666667F;
         $$0.c().b(0.6666667F, -0.6666667F, -0.6666667F);
         this.P.e = 0.0F;
         this.P.c = -32.0F;
         fvb.a($$0.c(), $$0.d(), 15728880, ged.d, this.P, ggr.f, true, this.Q);
         $$0.c().b();
         $$0.e();
      } else if (this.V) {
         $$0.a(F, $$4 + $$9.f - 5, $$5 + $$9.g - 5, 26, 26);
      }

      if (this.U) {
         int $$13 = $$4 + 60;
         int $$14 = $$5 + 13;
         List<ih<dgl>> $$15 = this.p.l();

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
               ahg $$23;
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

      eow.b();
   }

   private void a(ewt $$0, ih<dgl> $$1, int $$2, int $$3) {
      sn $$4 = new sn();
      st $$5 = new dgl.a().a(dgm.a, cll.h).a($$1, cll.a).a();
      $$4.a("Patterns", $$5);
      cmx $$6 = new cmx(cna.uP);
      ckq.a($$6, dgw.t, $$4);
      eqa $$7 = new eqa();
      $$7.a();
      $$7.a((float)$$2 + 0.5F, (float)($$3 + 16), 0.0F);
      $$7.b(6.0F, -6.0F, 1.0F);
      $$7.a(0.5F, 0.5F, 0.0F);
      $$7.a(0.5F, 0.5F, 0.5F);
      float $$8 = 0.6666667F;
      $$7.b(0.6666667F, -0.6666667F, -0.6666667F);
      this.P.e = 0.0F;
      this.P.c = -32.0F;
      List<Pair<ih<dgl>, cll>> $$9 = dgk.a(cll.h, dgk.a($$6));
      fvb.a($$7, $$0.d(), 15728880, ged.d, this.P, ggr.f, true, $$9);
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
                  evh.O().ai().a(ghu.a(arr.zv, 1.0F));
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
      int $$5 = this.H() - 4;
      if (this.X && this.U && $$5 > 0) {
         int $$6 = this.u + 13;
         int $$7 = $$6 + 56;
         this.W = ((float)$$1 - (float)$$6 - 7.5F) / ((float)($$7 - $$6) - 15.0F);
         this.W = aun.a(this.W, 0.0F, 1.0F);
         this.Y = Math.max((int)((double)(this.W * (float)$$5) + 0.5), 0);
         return true;
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public boolean a(double $$0, double $$1, double $$2, double $$3) {
      int $$4 = this.H() - 4;
      if (this.U && $$4 > 0) {
         float $$5 = (float)$$3 / (float)$$4;
         this.W = aun.a(this.W - $$5, 0.0F, 1.0F);
         this.Y = Math.max((int)(this.W * (float)$$4 + 0.5F), 0);
      }

      return true;
   }

   @Override
   protected boolean a(double $$0, double $$1, int $$2, int $$3, int $$4) {
      return $$0 < (double)$$2 || $$1 < (double)$$3 || $$0 >= (double)($$2 + this.c) || $$1 >= (double)($$3 + this.k);
   }

   private void I() {
      cmx $$0 = this.p.q().g();
      if ($$0.b()) {
         this.Q = null;
      } else {
         this.Q = dgk.a(((ckn)$$0.d()).b(), dgk.a($$0));
      }

      cmx $$1 = this.p.n().g();
      cmx $$2 = this.p.o().g();
      cmx $$3 = this.p.p().g();
      sn $$4 = ckq.a($$1);
      this.V = $$4 != null && $$4.b("Patterns", 9) && !$$1.b() && $$4.c("Patterns", 10).size() >= 6;
      if (this.V) {
         this.Q = null;
      }

      if (!cmx.a($$1, this.R) || !cmx.a($$2, this.S) || !cmx.a($$3, this.T)) {
         this.U = !$$1.b() && !$$2.b() && !this.V && !this.p.l().isEmpty();
      }

      if (this.Y >= this.H()) {
         this.Y = 0;
         this.W = 0.0F;
      }

      this.R = $$1.p();
      this.S = $$2.p();
      this.T = $$3.p();
   }
}
