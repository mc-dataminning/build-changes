import javax.annotation.Nullable;

public class eav extends ebg {
   private final boolean l;
   private float m;
   private float n;

   public eav(boolean $$0) {
      this.l = $$0;
   }

   @Override
   public void a(cqi $$0, bji $$1) {
      super.a($$0, $$1);
      $$1.a(eax.j, 0.0F);
      this.m = $$1.a(eax.c);
      $$1.a(eax.c, 6.0F);
      this.n = $$1.a(eax.k);
      $$1.a(eax.k, 4.0F);
   }

   @Override
   public void b() {
      this.b.a(eax.c, this.m);
      this.b.a(eax.k, this.n);
      super.b();
   }

   @Override
   public eaz a() {
      return !this.b.aX() ? super.a() : this.c(new gw(arw.a(this.b.cG().a), arw.a(this.b.cG().b + 0.5), arw.a(this.b.cG().c)));
   }

   @Override
   public ebf a(double $$0, double $$1, double $$2) {
      return this.a(this.b(arw.a($$0), arw.a($$1 + 0.5), arw.a($$2)));
   }

   @Override
   public int a(eaz[] $$0, eaz $$1) {
      int $$2 = super.a($$0, $$1);
      eax $$3 = this.a(this.b, $$1.a, $$1.b + 1, $$1.c);
      eax $$4 = this.a(this.b, $$1.a, $$1.b, $$1.c);
      int $$5;
      if (this.b.a($$3) >= 0.0F && $$4 != eax.w) {
         $$5 = arw.d(Math.max(1.0F, this.b.dF()));
      } else {
         $$5 = 0;
      }

      double $$7 = this.d(new gw($$1.a, $$1.b, $$1.c));
      eaz $$8 = this.a($$1.a, $$1.b + 1, $$1.c, Math.max(0, $$5 - 1), $$7, ha.b, $$4);
      eaz $$9 = this.a($$1.a, $$1.b - 1, $$1.c, $$5, $$7, ha.a, $$4);
      if (this.b($$8, $$1)) {
         $$0[$$2++] = $$8;
      }

      if (this.b($$9, $$1) && $$4 != eax.e) {
         $$0[$$2++] = $$9;
      }

      for (int $$10 = 0; $$10 < $$2; $$10++) {
         eaz $$11 = $$0[$$10];
         if ($$11.l == eax.j && this.l && $$11.b < this.b.dL().y_() - 10) {
            $$11.k++;
         }
      }

      return $$2;
   }

   private boolean b(@Nullable eaz $$0, eaz $$1) {
      return this.a($$0, $$1) && $$0.l == eax.j;
   }

   @Override
   protected boolean c() {
      return true;
   }

   @Override
   public eax a(cpb $$0, int $$1, int $$2, int $$3) {
      gw.a $$4 = new gw.a();
      eax $$5 = b($$0, $$4.d($$1, $$2, $$3));
      if ($$5 == eax.j) {
         for (ha $$6 : ha.values()) {
            eax $$7 = b($$0, $$4.d($$1, $$2, $$3).c($$6));
            if ($$7 == eax.a) {
               return eax.k;
            }
         }

         return eax.j;
      } else {
         return a($$0, $$4);
      }
   }
}
