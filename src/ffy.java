import java.util.List;

public class ffy extends fel<cki> {
   private static final ahh x = new ahh("container/stonecutter/scroller");
   private static final ahh y = new ahh("container/stonecutter/scroller_disabled");
   private static final ahh z = new ahh("container/stonecutter/recipe_selected");
   private static final ahh A = new ahh("container/stonecutter/recipe_highlighted");
   private static final ahh B = new ahh("container/stonecutter/recipe");
   private static final ahh C = new ahh("textures/gui/container/stonecutter.png");
   private static final int D = 12;
   private static final int E = 15;
   private static final int F = 4;
   private static final int G = 3;
   private static final int H = 16;
   private static final int I = 18;
   private static final int J = 54;
   private static final int K = 52;
   private static final int L = 14;
   private float M;
   private boolean N;
   private int O;
   private boolean P;

   public ffy(cki $$0, cfp $$1, vg $$2) {
      super($$0, $$1, $$2);
      $$0.a(this::K);
      this.m--;
   }

   @Override
   public void a(exe $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.a($$0, $$1, $$2);
   }

   @Override
   protected void a(exe $$0, float $$1, int $$2, int $$3) {
      int $$4 = this.t;
      int $$5 = this.u;
      $$0.a(C, $$4, $$5, 0, 0, this.c, this.k);
      int $$6 = (int)(41.0F * this.M);
      ahh $$7 = this.J() ? x : y;
      $$0.a($$7, $$4 + 119, $$5 + 15 + $$6, 12, 15);
      int $$8 = this.t + 52;
      int $$9 = this.u + 14;
      int $$10 = this.O + 12;
      this.a($$0, $$2, $$3, $$8, $$9, $$10);
      this.b($$0, $$8, $$9, $$10);
   }

   @Override
   protected void a(exe $$0, int $$1, int $$2) {
      super.a($$0, $$1, $$2);
      if (this.P) {
         int $$3 = this.t + 52;
         int $$4 = this.u + 14;
         int $$5 = this.O + 12;
         List<cqm<cre>> $$6 = this.p.m();

         for (int $$7 = this.O; $$7 < $$5 && $$7 < this.p.n(); $$7++) {
            int $$8 = $$7 - this.O;
            int $$9 = $$3 + $$8 % 4 * 16;
            int $$10 = $$4 + $$8 / 4 * 18 + 2;
            if ($$1 >= $$9 && $$1 < $$9 + 16 && $$2 >= $$10 && $$2 < $$10 + 18) {
               $$0.b(this.i, $$6.get($$7).b().a(this.f.r.I_()), $$1, $$2);
            }
         }
      }
   }

   private void a(exe $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
      for (int $$6 = this.O; $$6 < $$5 && $$6 < this.p.n(); $$6++) {
         int $$7 = $$6 - this.O;
         int $$8 = $$3 + $$7 % 4 * 16;
         int $$9 = $$7 / 4;
         int $$10 = $$4 + $$9 * 18 + 2;
         ahh $$11;
         if ($$6 == this.p.l()) {
            $$11 = z;
         } else if ($$1 >= $$8 && $$2 >= $$10 && $$1 < $$8 + 16 && $$2 < $$10 + 18) {
            $$11 = A;
         } else {
            $$11 = B;
         }

         $$0.a($$11, $$8, $$10 - 1, 16, 18);
      }
   }

   private void b(exe $$0, int $$1, int $$2, int $$3) {
      List<cqm<cre>> $$4 = this.p.m();

      for (int $$5 = this.O; $$5 < $$3 && $$5 < this.p.n(); $$5++) {
         int $$6 = $$5 - this.O;
         int $$7 = $$1 + $$6 % 4 * 16;
         int $$8 = $$6 / 4;
         int $$9 = $$2 + $$8 * 18 + 2;
         $$0.a($$4.get($$5).b().a(this.f.r.I_()), $$7, $$9);
      }
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      this.N = false;
      if (this.P) {
         int $$3 = this.t + 52;
         int $$4 = this.u + 14;
         int $$5 = this.O + 12;

         for (int $$6 = this.O; $$6 < $$5; $$6++) {
            int $$7 = $$6 - this.O;
            double $$8 = $$0 - (double)($$3 + $$7 % 4 * 16);
            double $$9 = $$1 - (double)($$4 + $$7 / 4 * 18);
            if ($$8 >= 0.0 && $$9 >= 0.0 && $$8 < 16.0 && $$9 < 18.0 && this.p.b(this.f.s, $$6)) {
               evr.O().ai().a(gij.a(art.zO, 1.0F));
               this.f.q.a(this.p.j, $$6);
               return true;
            }
         }

         $$3 = this.t + 119;
         $$4 = this.u + 9;
         if ($$0 >= (double)$$3 && $$0 < (double)($$3 + 12) && $$1 >= (double)$$4 && $$1 < (double)($$4 + 54)) {
            this.N = true;
         }
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2, double $$3, double $$4) {
      if (this.N && this.J()) {
         int $$5 = this.u + 14;
         int $$6 = $$5 + 54;
         this.M = ((float)$$1 - (float)$$5 - 7.5F) / ((float)($$6 - $$5) - 15.0F);
         this.M = aup.a(this.M, 0.0F, 1.0F);
         this.O = (int)((double)(this.M * (float)this.I()) + 0.5) * 4;
         return true;
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public boolean a(double $$0, double $$1, double $$2, double $$3) {
      if (this.J()) {
         int $$4 = this.I();
         float $$5 = (float)$$3 / (float)$$4;
         this.M = aup.a(this.M - $$5, 0.0F, 1.0F);
         this.O = (int)((double)(this.M * (float)$$4) + 0.5) * 4;
      }

      return true;
   }

   private boolean J() {
      return this.P && this.p.n() > 12;
   }

   protected int I() {
      return (this.p.n() + 4 - 1) / 4 - 3;
   }

   private void K() {
      this.P = this.p.o();
      if (!this.P) {
         this.M = 0.0F;
         this.O = 0;
      }
   }
}
