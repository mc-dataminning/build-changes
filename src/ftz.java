import java.util.List;

public class ftz extends fsl<cuc> {
   private static final alj G = alj.b("container/stonecutter/scroller");
   private static final alj H = alj.b("container/stonecutter/scroller_disabled");
   private static final alj I = alj.b("container/stonecutter/recipe_selected");
   private static final alj J = alj.b("container/stonecutter/recipe_highlighted");
   private static final alj K = alj.b("container/stonecutter/recipe");
   private static final alj L = alj.b("textures/gui/container/stonecutter.png");
   private static final int M = 12;
   private static final int N = 15;
   private static final int O = 4;
   private static final int P = 3;
   private static final int Q = 16;
   private static final int R = 18;
   private static final int S = 54;
   private static final int T = 52;
   private static final int U = 14;
   private float V;
   private boolean W;
   private int X;
   private boolean Y;

   public ftz(cuc $$0, cot $$1, xj $$2) {
      super($$0, $$1, $$2);
      $$0.a(this::L);
      this.w--;
   }

   @Override
   public void a(flq $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.a($$0, $$1, $$2);
   }

   @Override
   protected void a(flq $$0, float $$1, int $$2, int $$3) {
      int $$4 = this.C;
      int $$5 = this.D;
      $$0.a(gjq::B, L, $$4, $$5, 0.0F, 0.0F, this.s, this.u, 256, 256);
      int $$6 = (int)(41.0F * this.V);
      alj $$7 = this.K() ? G : H;
      $$0.a(gjq::B, $$7, $$4 + 119, $$5 + 15 + $$6, 12, 15);
      int $$8 = this.C + 52;
      int $$9 = this.D + 14;
      int $$10 = this.X + 12;
      this.a($$0, $$2, $$3, $$8, $$9, $$10);
      this.a($$0, $$8, $$9, $$10);
   }

   @Override
   protected void a(flq $$0, int $$1, int $$2) {
      super.a($$0, $$1, $$2);
      if (this.Y) {
         int $$3 = this.C + 52;
         int $$4 = this.D + 14;
         int $$5 = this.X + 12;
         List<dbc<dbw>> $$6 = this.z.m();

         for (int $$7 = this.X; $$7 < $$5 && $$7 < this.z.n(); $$7++) {
            int $$8 = $$7 - this.X;
            int $$9 = $$3 + $$8 % 4 * 16;
            int $$10 = $$4 + $$8 / 4 * 18 + 2;
            if ($$1 >= $$9 && $$1 < $$9 + 16 && $$2 >= $$10 && $$2 < $$10 + 18) {
               $$0.b(this.p, $$6.get($$7).b().a(this.m.s.J_()), $$1, $$2);
            }
         }
      }
   }

   private void a(flq $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
      for (int $$6 = this.X; $$6 < $$5 && $$6 < this.z.n(); $$6++) {
         int $$7 = $$6 - this.X;
         int $$8 = $$3 + $$7 % 4 * 16;
         int $$9 = $$7 / 4;
         int $$10 = $$4 + $$9 * 18 + 2;
         alj $$11;
         if ($$6 == this.z.l()) {
            $$11 = I;
         } else if ($$1 >= $$8 && $$2 >= $$10 && $$1 < $$8 + 16 && $$2 < $$10 + 18) {
            $$11 = J;
         } else {
            $$11 = K;
         }

         $$0.a(gjq::B, $$11, $$8, $$10 - 1, 16, 18);
      }
   }

   private void a(flq $$0, int $$1, int $$2, int $$3) {
      List<dbc<dbw>> $$4 = this.z.m();

      for (int $$5 = this.X; $$5 < $$3 && $$5 < this.z.n(); $$5++) {
         int $$6 = $$5 - this.X;
         int $$7 = $$1 + $$6 % 4 * 16;
         int $$8 = $$6 / 4;
         int $$9 = $$2 + $$8 * 18 + 2;
         $$0.a($$4.get($$5).b().a(this.m.s.J_()), $$7, $$9);
      }
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      this.W = false;
      if (this.Y) {
         int $$3 = this.C + 52;
         int $$4 = this.D + 14;
         int $$5 = this.X + 12;

         for (int $$6 = this.X; $$6 < $$5; $$6++) {
            int $$7 = $$6 - this.X;
            double $$8 = $$0 - (double)($$3 + $$7 % 4 * 16);
            double $$9 = $$1 - (double)($$4 + $$7 / 4 * 18);
            if ($$8 >= 0.0 && $$9 >= 0.0 && $$8 < 16.0 && $$9 < 18.0 && this.z.a(this.m.t, $$6)) {
               fke.Q().ak().a(hcw.a(awn.AA, 1.0F));
               this.m.r.a(this.z.l, $$6);
               return true;
            }
         }

         $$3 = this.C + 119;
         $$4 = this.D + 9;
         if ($$0 >= (double)$$3 && $$0 < (double)($$3 + 12) && $$1 >= (double)$$4 && $$1 < (double)($$4 + 54)) {
            this.W = true;
         }
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2, double $$3, double $$4) {
      if (this.W && this.K()) {
         int $$5 = this.D + 14;
         int $$6 = $$5 + 54;
         this.V = ((float)$$1 - (float)$$5 - 7.5F) / ((float)($$6 - $$5) - 15.0F);
         this.V = azm.a(this.V, 0.0F, 1.0F);
         this.X = (int)((double)(this.V * (float)this.J()) + 0.5) * 4;
         return true;
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public boolean a(double $$0, double $$1, double $$2, double $$3) {
      if (super.a($$0, $$1, $$2, $$3)) {
         return true;
      } else {
         if (this.K()) {
            int $$4 = this.J();
            float $$5 = (float)$$3 / (float)$$4;
            this.V = azm.a(this.V - $$5, 0.0F, 1.0F);
            this.X = (int)((double)(this.V * (float)$$4) + 0.5) * 4;
         }

         return true;
      }
   }

   private boolean K() {
      return this.Y && this.z.n() > 12;
   }

   protected int J() {
      return (this.z.n() + 4 - 1) / 4 - 3;
   }

   private void L() {
      this.Y = this.z.o();
      if (!this.Y) {
         this.V = 0.0F;
         this.X = 0;
      }
   }
}
