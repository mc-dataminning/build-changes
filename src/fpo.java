import java.util.List;

public class fpo extends foa<cru> {
   private static final ale D = new ale("container/stonecutter/scroller");
   private static final ale E = new ale("container/stonecutter/scroller_disabled");
   private static final ale F = new ale("container/stonecutter/recipe_selected");
   private static final ale G = new ale("container/stonecutter/recipe_highlighted");
   private static final ale H = new ale("container/stonecutter/recipe");
   private static final ale I = new ale("textures/gui/container/stonecutter.png");
   private static final int J = 12;
   private static final int K = 15;
   private static final int L = 4;
   private static final int M = 3;
   private static final int N = 16;
   private static final int O = 18;
   private static final int P = 54;
   private static final int Q = 52;
   private static final int R = 14;
   private float S;
   private boolean T;
   private int U;
   private boolean V;

   public fpo(cru $$0, cmv $$1, xo $$2) {
      super($$0, $$1, $$2);
      $$0.a(this::K);
      this.s--;
   }

   @Override
   public void a(fgq $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.a($$0, $$1, $$2);
   }

   @Override
   protected void a(fgq $$0, float $$1, int $$2, int $$3) {
      int $$4 = this.z;
      int $$5 = this.A;
      $$0.a(I, $$4, $$5, 0, 0, this.c, this.d);
      int $$6 = (int)(41.0F * this.S);
      ale $$7 = this.J() ? D : E;
      $$0.a($$7, $$4 + 119, $$5 + 15 + $$6, 12, 15);
      int $$8 = this.z + 52;
      int $$9 = this.A + 14;
      int $$10 = this.U + 12;
      this.a($$0, $$2, $$3, $$8, $$9, $$10);
      this.b($$0, $$8, $$9, $$10);
   }

   @Override
   protected void a(fgq $$0, int $$1, int $$2) {
      super.a($$0, $$1, $$2);
      if (this.V) {
         int $$3 = this.z + 52;
         int $$4 = this.A + 14;
         int $$5 = this.U + 12;
         List<cyw<czo>> $$6 = this.w.m();

         for (int $$7 = this.U; $$7 < $$5 && $$7 < this.w.n(); $$7++) {
            int $$8 = $$7 - this.U;
            int $$9 = $$3 + $$8 % 4 * 16;
            int $$10 = $$4 + $$8 / 4 * 18 + 2;
            if ($$1 >= $$9 && $$1 < $$9 + 16 && $$2 >= $$10 && $$2 < $$10 + 18) {
               $$0.b(this.p, $$6.get($$7).b().a(this.m.r.H_()), $$1, $$2);
            }
         }
      }
   }

   private void a(fgq $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
      for (int $$6 = this.U; $$6 < $$5 && $$6 < this.w.n(); $$6++) {
         int $$7 = $$6 - this.U;
         int $$8 = $$3 + $$7 % 4 * 16;
         int $$9 = $$7 / 4;
         int $$10 = $$4 + $$9 * 18 + 2;
         ale $$11;
         if ($$6 == this.w.l()) {
            $$11 = F;
         } else if ($$1 >= $$8 && $$2 >= $$10 && $$1 < $$8 + 16 && $$2 < $$10 + 18) {
            $$11 = G;
         } else {
            $$11 = H;
         }

         $$0.a($$11, $$8, $$10 - 1, 16, 18);
      }
   }

   private void b(fgq $$0, int $$1, int $$2, int $$3) {
      List<cyw<czo>> $$4 = this.w.m();

      for (int $$5 = this.U; $$5 < $$3 && $$5 < this.w.n(); $$5++) {
         int $$6 = $$5 - this.U;
         int $$7 = $$1 + $$6 % 4 * 16;
         int $$8 = $$6 / 4;
         int $$9 = $$2 + $$8 * 18 + 2;
         $$0.a($$4.get($$5).b().a(this.m.r.H_()), $$7, $$9);
      }
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      this.T = false;
      if (this.V) {
         int $$3 = this.z + 52;
         int $$4 = this.A + 14;
         int $$5 = this.U + 12;

         for (int $$6 = this.U; $$6 < $$5; $$6++) {
            int $$7 = $$6 - this.U;
            double $$8 = $$0 - (double)($$3 + $$7 % 4 * 16);
            double $$9 = $$1 - (double)($$4 + $$7 / 4 * 18);
            if ($$8 >= 0.0 && $$9 >= 0.0 && $$8 < 16.0 && $$9 < 18.0 && this.w.b(this.m.s, $$6)) {
               ffe.Q().aj().a(gsh.a(avz.At, 1.0F));
               this.m.q.a(this.w.j, $$6);
               return true;
            }
         }

         $$3 = this.z + 119;
         $$4 = this.A + 9;
         if ($$0 >= (double)$$3 && $$0 < (double)($$3 + 12) && $$1 >= (double)$$4 && $$1 < (double)($$4 + 54)) {
            this.T = true;
         }
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2, double $$3, double $$4) {
      if (this.T && this.J()) {
         int $$5 = this.A + 14;
         int $$6 = $$5 + 54;
         this.S = ((float)$$1 - (float)$$5 - 7.5F) / ((float)($$6 - $$5) - 15.0F);
         this.S = ayy.a(this.S, 0.0F, 1.0F);
         this.U = (int)((double)(this.S * (float)this.I()) + 0.5) * 4;
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
         this.S = ayy.a(this.S - $$5, 0.0F, 1.0F);
         this.U = (int)((double)(this.S * (float)$$4) + 0.5) * 4;
      }

      return true;
   }

   private boolean J() {
      return this.V && this.w.n() > 12;
   }

   protected int I() {
      return (this.w.n() + 4 - 1) / 4 - 3;
   }

   private void K() {
      this.V = this.w.o();
      if (!this.V) {
         this.S = 0.0F;
         this.U = 0;
      }
   }
}
