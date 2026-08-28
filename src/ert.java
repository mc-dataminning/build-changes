import javax.annotation.Nullable;

public class ert extends esg {
   private final boolean l;
   private float m;
   private float n;

   public ert(boolean $$0) {
      this.l = $$0;
   }

   @Override
   public void a(dfo $$0, bvc $$1) {
      super.a($$0, $$1);
      $$1.a(esb.j, 0.0F);
      this.m = $$1.a(esb.c);
      $$1.a(esb.c, 6.0F);
      this.n = $$1.a(esb.k);
      $$1.a(esb.k, 4.0F);
   }

   @Override
   public void b() {
      this.b.a(esb.c, this.m);
      this.b.a(esb.k, this.n);
      super.b();
   }

   @Override
   public erw a() {
      return !this.b.bk() ? super.a() : this.c(new jh(azk.a(this.b.cS().a), azk.a(this.b.cS().b + 0.5), azk.a(this.b.cS().c)));
   }

   @Override
   public esf a(double $$0, double $$1, double $$2) {
      return this.b($$0, $$1 + 0.5, $$2);
   }

   @Override
   public int a(erw[] $$0, erw $$1) {
      int $$2 = super.a($$0, $$1);
      esb $$3 = this.b($$1.a, $$1.b + 1, $$1.c);
      esb $$4 = this.b($$1.a, $$1.b, $$1.c);
      int $$5;
      if (this.b.a($$3) >= 0.0F && $$4 != esb.w) {
         $$5 = azk.d(Math.max(1.0F, this.b.dR()));
      } else {
         $$5 = 0;
      }

      double $$7 = this.d(new jh($$1.a, $$1.b, $$1.c));
      erw $$8 = this.a($$1.a, $$1.b + 1, $$1.c, Math.max(0, $$5 - 1), $$7, jm.b, $$4);
      erw $$9 = this.a($$1.a, $$1.b - 1, $$1.c, $$5, $$7, jm.a, $$4);
      if (this.b($$8, $$1)) {
         $$0[$$2++] = $$8;
      }

      if (this.b($$9, $$1) && $$4 != esb.e) {
         $$0[$$2++] = $$9;
      }

      for (int $$10 = 0; $$10 < $$2; $$10++) {
         erw $$11 = $$0[$$10];
         if ($$11.l == esb.j && this.l && $$11.b < this.b.dX().N() - 10) {
            $$11.k++;
         }
      }

      return $$2;
   }

   private boolean b(@Nullable erw $$0, erw $$1) {
      return this.a($$0, $$1) && $$0.l == esb.j;
   }

   @Override
   protected boolean c() {
      return true;
   }

   @Override
   public esb a(esd $$0, int $$1, int $$2, int $$3) {
      esb $$4 = $$0.a($$1, $$2, $$3);
      if ($$4 == esb.j) {
         jh.a $$5 = new jh.a();

         for (jm $$6 : jm.values()) {
            $$5.d($$1, $$2, $$3).c($$6);
            esb $$7 = $$0.a($$5.u(), $$5.v(), $$5.w());
            if ($$7 == esb.a) {
               return esb.k;
            }
         }

         return esb.j;
      } else {
         return super.a($$0, $$1, $$2, $$3);
      }
   }
}
