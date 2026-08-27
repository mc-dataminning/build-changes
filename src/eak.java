import javax.annotation.Nullable;

public class eak extends eav {
   private final boolean l;
   private float m;
   private float n;

   public eak(boolean $$0) {
      this.l = $$0;
   }

   @Override
   public void a(cpx $$0, biy $$1) {
      super.a($$0, $$1);
      $$1.a(eam.j, 0.0F);
      this.m = $$1.a(eam.c);
      $$1.a(eam.c, 6.0F);
      this.n = $$1.a(eam.k);
      $$1.a(eam.k, 4.0F);
   }

   @Override
   public void b() {
      this.b.a(eam.c, this.m);
      this.b.a(eam.k, this.n);
      super.b();
   }

   @Override
   public eao a() {
      return !this.b.aX() ? super.a() : this.c(new gv(aro.a(this.b.cG().a), aro.a(this.b.cG().b + 0.5), aro.a(this.b.cG().c)));
   }

   @Override
   public eau a(double $$0, double $$1, double $$2) {
      return this.a(this.b(aro.a($$0), aro.a($$1 + 0.5), aro.a($$2)));
   }

   @Override
   public int a(eao[] $$0, eao $$1) {
      int $$2 = super.a($$0, $$1);
      eam $$3 = this.a(this.b, $$1.a, $$1.b + 1, $$1.c);
      eam $$4 = this.a(this.b, $$1.a, $$1.b, $$1.c);
      int $$5;
      if (this.b.a($$3) >= 0.0F && $$4 != eam.w) {
         $$5 = aro.d(Math.max(1.0F, this.b.dE()));
      } else {
         $$5 = 0;
      }

      double $$7 = this.d(new gv($$1.a, $$1.b, $$1.c));
      eao $$8 = this.a($$1.a, $$1.b + 1, $$1.c, Math.max(0, $$5 - 1), $$7, hb.b, $$4);
      eao $$9 = this.a($$1.a, $$1.b - 1, $$1.c, $$5, $$7, hb.a, $$4);
      if (this.b($$8, $$1)) {
         $$0[$$2++] = $$8;
      }

      if (this.b($$9, $$1) && $$4 != eam.e) {
         $$0[$$2++] = $$9;
      }

      for (int $$10 = 0; $$10 < $$2; $$10++) {
         eao $$11 = $$0[$$10];
         if ($$11.l == eam.j && this.l && $$11.b < this.b.dK().t_() - 10) {
            $$11.k++;
         }
      }

      return $$2;
   }

   private boolean b(@Nullable eao $$0, eao $$1) {
      return this.a($$0, $$1) && $$0.l == eam.j;
   }

   @Override
   protected boolean c() {
      return true;
   }

   @Override
   public eam a(coq $$0, int $$1, int $$2, int $$3) {
      gv.a $$4 = new gv.a();
      eam $$5 = b($$0, $$4.d($$1, $$2, $$3));
      if ($$5 == eam.j) {
         for (hb $$6 : hb.values()) {
            eam $$7 = b($$0, $$4.d($$1, $$2, $$3).c($$6));
            if ($$7 == eam.a) {
               return eam.k;
            }
         }

         return eam.j;
      } else {
         return a($$0, $$4);
      }
   }
}
