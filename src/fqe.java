import java.util.List;

public class fqe extends foq<crw> {
   private static final akr E = akr.b("container/stonecutter/scroller");
   private static final akr F = akr.b("container/stonecutter/scroller_disabled");
   private static final akr G = akr.b("container/stonecutter/recipe_selected");
   private static final akr H = akr.b("container/stonecutter/recipe_highlighted");
   private static final akr I = akr.b("container/stonecutter/recipe");
   private static final akr J = akr.b("textures/gui/container/stonecutter.png");
   private static final int K = 12;
   private static final int L = 15;
   private static final int M = 4;
   private static final int N = 3;
   private static final int O = 16;
   private static final int P = 18;
   private static final int Q = 54;
   private static final int R = 52;
   private static final int S = 14;
   private float T;
   private boolean U;
   private int V;
   private boolean W;

   public fqe(crw $$0, cmw $$1, wz $$2) {
      super($$0, $$1, $$2);
      $$0.a(this::G);
      this.u--;
   }

   @Override
   public void a(fhx $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.a($$0, $$1, $$2);
   }

   @Override
   protected void a(fhx $$0, float $$1, int $$2, int $$3) {
      int $$4 = this.A;
      int $$5 = this.B;
      $$0.a(J, $$4, $$5, 0, 0, this.c, this.r);
      int $$6 = (int)(41.0F * this.T);
      akr $$7 = this.F() ? E : F;
      $$0.a($$7, $$4 + 119, $$5 + 15 + $$6, 12, 15);
      int $$8 = this.A + 52;
      int $$9 = this.B + 14;
      int $$10 = this.V + 12;
      this.a($$0, $$2, $$3, $$8, $$9, $$10);
      this.b($$0, $$8, $$9, $$10);
   }

   @Override
   protected void a(fhx $$0, int $$1, int $$2) {
      super.a($$0, $$1, $$2);
      if (this.W) {
         int $$3 = this.A + 52;
         int $$4 = this.B + 14;
         int $$5 = this.V + 12;
         List<czb<czw>> $$6 = this.x.m();

         for (int $$7 = this.V; $$7 < $$5 && $$7 < this.x.n(); $$7++) {
            int $$8 = $$7 - this.V;
            int $$9 = $$3 + $$8 % 4 * 16;
            int $$10 = $$4 + $$8 / 4 * 18 + 2;
            if ($$1 >= $$9 && $$1 < $$9 + 16 && $$2 >= $$10 && $$2 < $$10 + 18) {
               $$0.b(this.o, $$6.get($$7).b().a(this.l.r.H_()), $$1, $$2);
            }
         }
      }
   }

   private void a(fhx $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
      for (int $$6 = this.V; $$6 < $$5 && $$6 < this.x.n(); $$6++) {
         int $$7 = $$6 - this.V;
         int $$8 = $$3 + $$7 % 4 * 16;
         int $$9 = $$7 / 4;
         int $$10 = $$4 + $$9 * 18 + 2;
         akr $$11;
         if ($$6 == this.x.l()) {
            $$11 = G;
         } else if ($$1 >= $$8 && $$2 >= $$10 && $$1 < $$8 + 16 && $$2 < $$10 + 18) {
            $$11 = H;
         } else {
            $$11 = I;
         }

         $$0.a($$11, $$8, $$10 - 1, 16, 18);
      }
   }

   private void b(fhx $$0, int $$1, int $$2, int $$3) {
      List<czb<czw>> $$4 = this.x.m();

      for (int $$5 = this.V; $$5 < $$3 && $$5 < this.x.n(); $$5++) {
         int $$6 = $$5 - this.V;
         int $$7 = $$1 + $$6 % 4 * 16;
         int $$8 = $$6 / 4;
         int $$9 = $$2 + $$8 * 18 + 2;
         $$0.a($$4.get($$5).b().a(this.l.r.H_()), $$7, $$9);
      }
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      this.U = false;
      if (this.W) {
         int $$3 = this.A + 52;
         int $$4 = this.B + 14;
         int $$5 = this.V + 12;

         for (int $$6 = this.V; $$6 < $$5; $$6++) {
            int $$7 = $$6 - this.V;
            double $$8 = $$0 - (double)($$3 + $$7 % 4 * 16);
            double $$9 = $$1 - (double)($$4 + $$7 / 4 * 18);
            if ($$8 >= 0.0 && $$9 >= 0.0 && $$8 < 16.0 && $$9 < 18.0 && this.x.a(this.l.s, $$6)) {
               fgm.Q().aj().a(gtt.a(avp.Aw, 1.0F));
               this.l.q.a(this.x.j, $$6);
               return true;
            }
         }

         $$3 = this.A + 119;
         $$4 = this.B + 9;
         if ($$0 >= (double)$$3 && $$0 < (double)($$3 + 12) && $$1 >= (double)$$4 && $$1 < (double)($$4 + 54)) {
            this.U = true;
         }
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2, double $$3, double $$4) {
      if (this.U && this.F()) {
         int $$5 = this.B + 14;
         int $$6 = $$5 + 54;
         this.T = ((float)$$1 - (float)$$5 - 7.5F) / ((float)($$6 - $$5) - 15.0F);
         this.T = ayo.a(this.T, 0.0F, 1.0F);
         this.V = (int)((double)(this.T * (float)this.E()) + 0.5) * 4;
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
         this.T = ayo.a(this.T - $$5, 0.0F, 1.0F);
         this.V = (int)((double)(this.T * (float)$$4) + 0.5) * 4;
      }

      return true;
   }

   private boolean F() {
      return this.W && this.x.n() > 12;
   }

   protected int E() {
      return (this.x.n() + 4 - 1) / 4 - 3;
   }

   private void G() {
      this.W = this.x.o();
      if (!this.W) {
         this.T = 0.0F;
         this.V = 0;
      }
   }
}
