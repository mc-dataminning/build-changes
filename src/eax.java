import javax.annotation.Nullable;

public class eax extends ebi {
   private final boolean l;
   private float m;
   private float n;

   public eax(boolean $$0) {
      this.l = $$0;
   }

   @Override
   public void a(cqk $$0, bjk $$1) {
      super.a($$0, $$1);
      $$1.a(eaz.j, 0.0F);
      this.m = $$1.a(eaz.c);
      $$1.a(eaz.c, 6.0F);
      this.n = $$1.a(eaz.k);
      $$1.a(eaz.k, 4.0F);
   }

   @Override
   public void b() {
      this.b.a(eaz.c, this.m);
      this.b.a(eaz.k, this.n);
      super.b();
   }

   @Override
   public ebb a() {
      return !this.b.aX() ? super.a() : this.c(new gw(ary.a(this.b.cG().a), ary.a(this.b.cG().b + 0.5), ary.a(this.b.cG().c)));
   }

   @Override
   public ebh a(double $$0, double $$1, double $$2) {
      return this.a(this.b(ary.a($$0), ary.a($$1 + 0.5), ary.a($$2)));
   }

   @Override
   public int a(ebb[] $$0, ebb $$1) {
      int $$2 = super.a($$0, $$1);
      eaz $$3 = this.a(this.b, $$1.a, $$1.b + 1, $$1.c);
      eaz $$4 = this.a(this.b, $$1.a, $$1.b, $$1.c);
      int $$5;
      if (this.b.a($$3) >= 0.0F && $$4 != eaz.w) {
         $$5 = ary.d(Math.max(1.0F, this.b.dF()));
      } else {
         $$5 = 0;
      }

      double $$7 = this.d(new gw($$1.a, $$1.b, $$1.c));
      ebb $$8 = this.a($$1.a, $$1.b + 1, $$1.c, Math.max(0, $$5 - 1), $$7, hc.b, $$4);
      ebb $$9 = this.a($$1.a, $$1.b - 1, $$1.c, $$5, $$7, hc.a, $$4);
      if (this.b($$8, $$1)) {
         $$0[$$2++] = $$8;
      }

      if (this.b($$9, $$1) && $$4 != eaz.e) {
         $$0[$$2++] = $$9;
      }

      for (int $$10 = 0; $$10 < $$2; $$10++) {
         ebb $$11 = $$0[$$10];
         if ($$11.l == eaz.j && this.l && $$11.b < this.b.dL().y_() - 10) {
            $$11.k++;
         }
      }

      return $$2;
   }

   private boolean b(@Nullable ebb $$0, ebb $$1) {
      return this.a($$0, $$1) && $$0.l == eaz.j;
   }

   @Override
   protected boolean c() {
      return true;
   }

   @Override
   public eaz a(cpd $$0, int $$1, int $$2, int $$3) {
      gw.a $$4 = new gw.a();
      eaz $$5 = b($$0, $$4.d($$1, $$2, $$3));
      if ($$5 == eaz.j) {
         for (hc $$6 : hc.values()) {
            eaz $$7 = b($$0, $$4.d($$1, $$2, $$3).c($$6));
            if ($$7 == eaz.a) {
               return eaz.k;
            }
         }

         return eaz.j;
      } else {
         return a($$0, $$4);
      }
   }
}
