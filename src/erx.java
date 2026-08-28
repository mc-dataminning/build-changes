import javax.annotation.Nullable;

public class erx extends esk {
   private final boolean l;
   private float m;
   private float n;

   public erx(boolean $$0) {
      this.l = $$0;
   }

   @Override
   public void a(dfs $$0, bvg $$1) {
      super.a($$0, $$1);
      $$1.a(esf.j, 0.0F);
      this.m = $$1.a(esf.c);
      $$1.a(esf.c, 6.0F);
      this.n = $$1.a(esf.k);
      $$1.a(esf.k, 4.0F);
   }

   @Override
   public void b() {
      this.b.a(esf.c, this.m);
      this.b.a(esf.k, this.n);
      super.b();
   }

   @Override
   public esa a() {
      return !this.b.bl() ? super.a() : this.c(new jh(azn.a(this.b.cT().a), azn.a(this.b.cT().b + 0.5), azn.a(this.b.cT().c)));
   }

   @Override
   public esj a(double $$0, double $$1, double $$2) {
      return this.b($$0, $$1 + 0.5, $$2);
   }

   @Override
   public int a(esa[] $$0, esa $$1) {
      int $$2 = super.a($$0, $$1);
      esf $$3 = this.b($$1.a, $$1.b + 1, $$1.c);
      esf $$4 = this.b($$1.a, $$1.b, $$1.c);
      int $$5;
      if (this.b.a($$3) >= 0.0F && $$4 != esf.w) {
         $$5 = azn.d(Math.max(1.0F, this.b.dS()));
      } else {
         $$5 = 0;
      }

      double $$7 = this.d(new jh($$1.a, $$1.b, $$1.c));
      esa $$8 = this.a($$1.a, $$1.b + 1, $$1.c, Math.max(0, $$5 - 1), $$7, jm.b, $$4);
      esa $$9 = this.a($$1.a, $$1.b - 1, $$1.c, $$5, $$7, jm.a, $$4);
      if (this.b($$8, $$1)) {
         $$0[$$2++] = $$8;
      }

      if (this.b($$9, $$1) && $$4 != esf.e) {
         $$0[$$2++] = $$9;
      }

      for (int $$10 = 0; $$10 < $$2; $$10++) {
         esa $$11 = $$0[$$10];
         if ($$11.l == esf.j && this.l && $$11.b < this.b.dY().N() - 10) {
            $$11.k++;
         }
      }

      return $$2;
   }

   private boolean b(@Nullable esa $$0, esa $$1) {
      return this.a($$0, $$1) && $$0.l == esf.j;
   }

   @Override
   protected boolean c() {
      return true;
   }

   @Override
   public esf a(esh $$0, int $$1, int $$2, int $$3) {
      esf $$4 = $$0.a($$1, $$2, $$3);
      if ($$4 == esf.j) {
         jh.a $$5 = new jh.a();

         for (jm $$6 : jm.values()) {
            $$5.d($$1, $$2, $$3).c($$6);
            esf $$7 = $$0.a($$5.u(), $$5.v(), $$5.w());
            if ($$7 == esf.a) {
               return esf.k;
            }
         }

         return esf.j;
      } else {
         return super.a($$0, $$1, $$2, $$3);
      }
   }
}
