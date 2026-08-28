import javax.annotation.Nullable;

public class ese extends esr {
   private final boolean l;
   private float m;
   private float n;

   public ese(boolean $$0) {
      this.l = $$0;
   }

   @Override
   public void a(dfz $$0, bvj $$1) {
      super.a($$0, $$1);
      $$1.a(esm.j, 0.0F);
      this.m = $$1.a(esm.c);
      $$1.a(esm.c, 6.0F);
      this.n = $$1.a(esm.k);
      $$1.a(esm.k, 4.0F);
   }

   @Override
   public void b() {
      this.b.a(esm.c, this.m);
      this.b.a(esm.k, this.n);
      super.b();
   }

   @Override
   public esh a() {
      return !this.b.bj() ? super.a() : this.c(new jh(azm.a(this.b.cR().a), azm.a(this.b.cR().b + 0.5), azm.a(this.b.cR().c)));
   }

   @Override
   public esq a(double $$0, double $$1, double $$2) {
      return this.b($$0, $$1 + 0.5, $$2);
   }

   @Override
   public int a(esh[] $$0, esh $$1) {
      int $$2 = super.a($$0, $$1);
      esm $$3 = this.b($$1.a, $$1.b + 1, $$1.c);
      esm $$4 = this.b($$1.a, $$1.b, $$1.c);
      int $$5;
      if (this.b.a($$3) >= 0.0F && $$4 != esm.w) {
         $$5 = azm.d(Math.max(1.0F, this.b.dP()));
      } else {
         $$5 = 0;
      }

      double $$7 = this.d(new jh($$1.a, $$1.b, $$1.c));
      esh $$8 = this.a($$1.a, $$1.b + 1, $$1.c, Math.max(0, $$5 - 1), $$7, jm.b, $$4);
      esh $$9 = this.a($$1.a, $$1.b - 1, $$1.c, $$5, $$7, jm.a, $$4);
      if (this.b($$8, $$1)) {
         $$0[$$2++] = $$8;
      }

      if (this.b($$9, $$1) && $$4 != esm.e) {
         $$0[$$2++] = $$9;
      }

      for (int $$10 = 0; $$10 < $$2; $$10++) {
         esh $$11 = $$0[$$10];
         if ($$11.l == esm.j && this.l && $$11.b < this.b.dV().O() - 10) {
            $$11.k++;
         }
      }

      return $$2;
   }

   private boolean b(@Nullable esh $$0, esh $$1) {
      return this.a($$0, $$1) && $$0.l == esm.j;
   }

   @Override
   protected boolean c() {
      return true;
   }

   @Override
   public esm a(eso $$0, int $$1, int $$2, int $$3) {
      esm $$4 = $$0.a($$1, $$2, $$3);
      if ($$4 == esm.j) {
         jh.a $$5 = new jh.a();

         for (jm $$6 : jm.values()) {
            $$5.d($$1, $$2, $$3).c($$6);
            esm $$7 = $$0.a($$5.u(), $$5.v(), $$5.w());
            if ($$7 == esm.a) {
               return esm.k;
            }
         }

         return esm.j;
      } else {
         return super.a($$0, $$1, $$2, $$3);
      }
   }
}
