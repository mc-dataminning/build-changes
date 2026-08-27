import java.util.List;

public class exb extends evp<cdb> {
   private static final acq w = new acq("textures/gui/container/stonecutter.png");
   private static final int x = 12;
   private static final int y = 15;
   private static final int z = 4;
   private static final int A = 3;
   private static final int C = 16;
   private static final int D = 18;
   private static final int E = 54;
   private static final int F = 52;
   private static final int G = 14;
   private float H;
   private boolean I;
   private int J;
   private boolean K;

   public exb(cdb $$0, byn $$1, sw $$2) {
      super($$0, $$1, $$2);
      $$0.a(this::F);
      this.m--;
   }

   @Override
   public void a(eox $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.a($$0, $$1, $$2);
   }

   @Override
   protected void a(eox $$0, float $$1, int $$2, int $$3) {
      this.a($$0);
      int $$4 = this.s;
      int $$5 = this.t;
      $$0.a(w, $$4, $$5, 0, 0, this.c, this.k);
      int $$6 = (int)(41.0F * this.H);
      $$0.a(w, $$4 + 119, $$5 + 15 + $$6, 176 + (this.E() ? 0 : 12), 0, 12, 15);
      int $$7 = this.s + 52;
      int $$8 = this.t + 14;
      int $$9 = this.J + 12;
      this.a($$0, $$2, $$3, $$7, $$8, $$9);
      this.b($$0, $$7, $$8, $$9);
   }

   @Override
   protected void a(eox $$0, int $$1, int $$2) {
      super.a($$0, $$1, $$2);
      if (this.K) {
         int $$3 = this.s + 52;
         int $$4 = this.t + 14;
         int $$5 = this.J + 12;
         List<cjt> $$6 = this.p.m();

         for (int $$7 = this.J; $$7 < $$5 && $$7 < this.p.n(); $$7++) {
            int $$8 = $$7 - this.J;
            int $$9 = $$3 + $$8 % 4 * 16;
            int $$10 = $$4 + $$8 / 4 * 18 + 2;
            if ($$1 >= $$9 && $$1 < $$9 + 16 && $$2 >= $$10 && $$2 < $$10 + 18) {
               $$0.b(this.i, $$6.get($$7).a(this.f.s.B_()), $$1, $$2);
            }
         }
      }
   }

   private void a(eox $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
      for (int $$6 = this.J; $$6 < $$5 && $$6 < this.p.n(); $$6++) {
         int $$7 = $$6 - this.J;
         int $$8 = $$3 + $$7 % 4 * 16;
         int $$9 = $$7 / 4;
         int $$10 = $$4 + $$9 * 18 + 2;
         int $$11 = this.k;
         if ($$6 == this.p.l()) {
            $$11 += 18;
         } else if ($$1 >= $$8 && $$2 >= $$10 && $$1 < $$8 + 16 && $$2 < $$10 + 18) {
            $$11 += 36;
         }

         $$0.a(w, $$8, $$10 - 1, 0, $$11, 16, 18);
      }
   }

   private void b(eox $$0, int $$1, int $$2, int $$3) {
      List<cjt> $$4 = this.p.m();

      for (int $$5 = this.J; $$5 < $$3 && $$5 < this.p.n(); $$5++) {
         int $$6 = $$5 - this.J;
         int $$7 = $$1 + $$6 % 4 * 16;
         int $$8 = $$6 / 4;
         int $$9 = $$2 + $$8 * 18 + 2;
         $$0.a($$4.get($$5).a(this.f.s.B_()), $$7, $$9);
      }
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      this.I = false;
      if (this.K) {
         int $$3 = this.s + 52;
         int $$4 = this.t + 14;
         int $$5 = this.J + 12;

         for (int $$6 = this.J; $$6 < $$5; $$6++) {
            int $$7 = $$6 - this.J;
            double $$8 = $$0 - (double)($$3 + $$7 % 4 * 16);
            double $$9 = $$1 - (double)($$4 + $$7 / 4 * 18);
            if ($$8 >= 0.0 && $$9 >= 0.0 && $$8 < 16.0 && $$9 < 18.0 && this.p.b(this.f.t, $$6)) {
               enn.N().ah().a(fxt.a(amh.yt, 1.0F));
               this.f.r.a(this.p.j, $$6);
               return true;
            }
         }

         $$3 = this.s + 119;
         $$4 = this.t + 9;
         if ($$0 >= (double)$$3 && $$0 < (double)($$3 + 12) && $$1 >= (double)$$4 && $$1 < (double)($$4 + 54)) {
            this.I = true;
         }
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2, double $$3, double $$4) {
      if (this.I && this.E()) {
         int $$5 = this.t + 14;
         int $$6 = $$5 + 54;
         this.H = ((float)$$1 - (float)$$5 - 7.5F) / ((float)($$6 - $$5) - 15.0F);
         this.H = apa.a(this.H, 0.0F, 1.0F);
         this.J = (int)((double)(this.H * (float)this.D()) + 0.5) * 4;
         return true;
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public boolean a(double $$0, double $$1, double $$2) {
      if (this.E()) {
         int $$3 = this.D();
         float $$4 = (float)$$2 / (float)$$3;
         this.H = apa.a(this.H - $$4, 0.0F, 1.0F);
         this.J = (int)((double)(this.H * (float)$$3) + 0.5) * 4;
      }

      return true;
   }

   private boolean E() {
      return this.K && this.p.n() > 12;
   }

   protected int D() {
      return (this.p.n() + 4 - 1) / 4 - 3;
   }

   private void F() {
      this.K = this.p.o();
      if (!this.K) {
         this.H = 0.0F;
         this.J = 0;
      }
   }
}
