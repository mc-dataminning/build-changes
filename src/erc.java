import javax.annotation.Nullable;

public class erc extends erp {
   private final boolean l;
   private float m;
   private float n;

   public erc(boolean $$0) {
      this.l = $$0;
   }

   @Override
   public void a(dew $$0, bup $$1) {
      super.a($$0, $$1);
      $$1.a(erk.j, 0.0F);
      this.m = $$1.a(erk.c);
      $$1.a(erk.c, 6.0F);
      this.n = $$1.a(erk.k);
      $$1.a(erk.k, 4.0F);
   }

   @Override
   public void b() {
      this.b.a(erk.c, this.m);
      this.b.a(erk.k, this.n);
      super.b();
   }

   @Override
   public erf a() {
      return !this.b.bi() ? super.a() : this.c(new jf(azf.a(this.b.cO().a), azf.a(this.b.cO().b + 0.5), azf.a(this.b.cO().c)));
   }

   @Override
   public ero a(double $$0, double $$1, double $$2) {
      return this.b($$0, $$1 + 0.5, $$2);
   }

   @Override
   public int a(erf[] $$0, erf $$1) {
      int $$2 = super.a($$0, $$1);
      erk $$3 = this.b($$1.a, $$1.b + 1, $$1.c);
      erk $$4 = this.b($$1.a, $$1.b, $$1.c);
      int $$5;
      if (this.b.a($$3) >= 0.0F && $$4 != erk.w) {
         $$5 = azf.d(Math.max(1.0F, this.b.dM()));
      } else {
         $$5 = 0;
      }

      double $$7 = this.d(new jf($$1.a, $$1.b, $$1.c));
      erf $$8 = this.a($$1.a, $$1.b + 1, $$1.c, Math.max(0, $$5 - 1), $$7, jk.b, $$4);
      erf $$9 = this.a($$1.a, $$1.b - 1, $$1.c, $$5, $$7, jk.a, $$4);
      if (this.b($$8, $$1)) {
         $$0[$$2++] = $$8;
      }

      if (this.b($$9, $$1) && $$4 != erk.e) {
         $$0[$$2++] = $$9;
      }

      for (int $$10 = 0; $$10 < $$2; $$10++) {
         erf $$11 = $$0[$$10];
         if ($$11.l == erk.j && this.l && $$11.b < this.b.dS().N() - 10) {
            $$11.k++;
         }
      }

      return $$2;
   }

   private boolean b(@Nullable erf $$0, erf $$1) {
      return this.a($$0, $$1) && $$0.l == erk.j;
   }

   @Override
   protected boolean c() {
      return true;
   }

   @Override
   public erk a(erm $$0, int $$1, int $$2, int $$3) {
      erk $$4 = $$0.a($$1, $$2, $$3);
      if ($$4 == erk.j) {
         jf.a $$5 = new jf.a();

         for (jk $$6 : jk.values()) {
            $$5.d($$1, $$2, $$3).c($$6);
            erk $$7 = $$0.a($$5.u(), $$5.v(), $$5.w());
            if ($$7 == erk.a) {
               return erk.k;
            }
         }

         return erk.j;
      } else {
         return super.a($$0, $$1, $$2, $$3);
      }
   }
}
