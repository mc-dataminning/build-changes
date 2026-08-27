import java.util.List;

public class flz extends fkm<cop> {
   private static final ajt A = new ajt("container/stonecutter/scroller");
   private static final ajt B = new ajt("container/stonecutter/scroller_disabled");
   private static final ajt C = new ajt("container/stonecutter/recipe_selected");
   private static final ajt D = new ajt("container/stonecutter/recipe_highlighted");
   private static final ajt E = new ajt("container/stonecutter/recipe");
   private static final ajt F = new ajt("textures/gui/container/stonecutter.png");
   private static final int G = 12;
   private static final int H = 15;
   private static final int I = 4;
   private static final int J = 3;
   private static final int K = 16;
   private static final int L = 18;
   private static final int M = 54;
   private static final int N = 52;
   private static final int O = 14;
   private float P;
   private boolean Q;
   private int R;
   private boolean S;

   public flz(cop $$0, cjs $$1, wg $$2) {
      super($$0, $$1, $$2);
      $$0.a(this::I);
      this.p--;
   }

   @Override
   public void a(fdc $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.a($$0, $$1, $$2);
   }

   @Override
   protected void a(fdc $$0, float $$1, int $$2, int $$3) {
      int $$4 = this.w;
      int $$5 = this.x;
      $$0.a(F, $$4, $$5, 0, 0, this.c, this.d);
      int $$6 = (int)(41.0F * this.P);
      ajt $$7 = this.F() ? A : B;
      $$0.a($$7, $$4 + 119, $$5 + 15 + $$6, 12, 15);
      int $$8 = this.w + 52;
      int $$9 = this.x + 14;
      int $$10 = this.R + 12;
      this.a($$0, $$2, $$3, $$8, $$9, $$10);
      this.b($$0, $$8, $$9, $$10);
   }

   @Override
   protected void a(fdc $$0, int $$1, int $$2) {
      super.a($$0, $$1, $$2);
      if (this.S) {
         int $$3 = this.w + 52;
         int $$4 = this.x + 14;
         int $$5 = this.R + 12;
         List<cvl<cwd>> $$6 = this.s.m();

         for (int $$7 = this.R; $$7 < $$5 && $$7 < this.s.n(); $$7++) {
            int $$8 = $$7 - this.R;
            int $$9 = $$3 + $$8 % 4 * 16;
            int $$10 = $$4 + $$8 / 4 * 18 + 2;
            if ($$1 >= $$9 && $$1 < $$9 + 16 && $$2 >= $$10 && $$2 < $$10 + 18) {
               $$0.b(this.m, $$6.get($$7).b().a(this.j.r.H_()), $$1, $$2);
            }
         }
      }
   }

   private void a(fdc $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
      for (int $$6 = this.R; $$6 < $$5 && $$6 < this.s.n(); $$6++) {
         int $$7 = $$6 - this.R;
         int $$8 = $$3 + $$7 % 4 * 16;
         int $$9 = $$7 / 4;
         int $$10 = $$4 + $$9 * 18 + 2;
         ajt $$11;
         if ($$6 == this.s.l()) {
            $$11 = C;
         } else if ($$1 >= $$8 && $$2 >= $$10 && $$1 < $$8 + 16 && $$2 < $$10 + 18) {
            $$11 = D;
         } else {
            $$11 = E;
         }

         $$0.a($$11, $$8, $$10 - 1, 16, 18);
      }
   }

   private void b(fdc $$0, int $$1, int $$2, int $$3) {
      List<cvl<cwd>> $$4 = this.s.m();

      for (int $$5 = this.R; $$5 < $$3 && $$5 < this.s.n(); $$5++) {
         int $$6 = $$5 - this.R;
         int $$7 = $$1 + $$6 % 4 * 16;
         int $$8 = $$6 / 4;
         int $$9 = $$2 + $$8 * 18 + 2;
         $$0.a($$4.get($$5).b().a(this.j.r.H_()), $$7, $$9);
      }
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      this.Q = false;
      if (this.S) {
         int $$3 = this.w + 52;
         int $$4 = this.x + 14;
         int $$5 = this.R + 12;

         for (int $$6 = this.R; $$6 < $$5; $$6++) {
            int $$7 = $$6 - this.R;
            double $$8 = $$0 - (double)($$3 + $$7 % 4 * 16);
            double $$9 = $$1 - (double)($$4 + $$7 / 4 * 18);
            if ($$8 >= 0.0 && $$9 >= 0.0 && $$8 < 16.0 && $$9 < 18.0 && this.s.b(this.j.s, $$6)) {
               fbp.Q().ak().a(gor.a(aum.Aa, 1.0F));
               this.j.q.a(this.s.j, $$6);
               return true;
            }
         }

         $$3 = this.w + 119;
         $$4 = this.x + 9;
         if ($$0 >= (double)$$3 && $$0 < (double)($$3 + 12) && $$1 >= (double)$$4 && $$1 < (double)($$4 + 54)) {
            this.Q = true;
         }
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2, double $$3, double $$4) {
      if (this.Q && this.F()) {
         int $$5 = this.x + 14;
         int $$6 = $$5 + 54;
         this.P = ((float)$$1 - (float)$$5 - 7.5F) / ((float)($$6 - $$5) - 15.0F);
         this.P = axk.a(this.P, 0.0F, 1.0F);
         this.R = (int)((double)(this.P * (float)this.E()) + 0.5) * 4;
         return true;
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public boolean a(double $$0, double $$1, double $$2, double $$3) {
      if (this.F()) {
         int $$4 = this.E();
         float $$5 = (float)$$3 / (float)$$4;
         this.P = axk.a(this.P - $$5, 0.0F, 1.0F);
         this.R = (int)((double)(this.P * (float)$$4) + 0.5) * 4;
      }

      return true;
   }

   private boolean F() {
      return this.S && this.s.n() > 12;
   }

   protected int E() {
      return (this.s.n() + 4 - 1) / 4 - 3;
   }

   private void I() {
      this.S = this.s.o();
      if (!this.S) {
         this.P = 0.0F;
         this.R = 0;
      }
   }
}
