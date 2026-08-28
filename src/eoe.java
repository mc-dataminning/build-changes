import javax.annotation.Nullable;

public class eoe extends eor {
   private final boolean l;
   private float m;
   private float n;

   public eoe(boolean $$0) {
      this.l = $$0;
   }

   @Override
   public void a(dcl $$0, btr $$1) {
      super.a($$0, $$1);
      $$1.a(eom.j, 0.0F);
      this.m = $$1.a(eom.c);
      $$1.a(eom.c, 6.0F);
      this.n = $$1.a(eom.k);
      $$1.a(eom.k, 4.0F);
   }

   @Override
   public void b() {
      this.b.a(eom.c, this.m);
      this.b.a(eom.k, this.n);
      super.b();
   }

   @Override
   public eoh a() {
      return !this.b.be() ? super.a() : this.c(new iz(ayz.a(this.b.cK().a), ayz.a(this.b.cK().b + 0.5), ayz.a(this.b.cK().c)));
   }

   @Override
   public eoq a(double $$0, double $$1, double $$2) {
      return this.b($$0, $$1 + 0.5, $$2);
   }

   @Override
   public int a(eoh[] $$0, eoh $$1) {
      int $$2 = super.a($$0, $$1);
      eom $$3 = this.b($$1.a, $$1.b + 1, $$1.c);
      eom $$4 = this.b($$1.a, $$1.b, $$1.c);
      int $$5;
      if (this.b.a($$3) >= 0.0F && $$4 != eom.w) {
         $$5 = ayz.d(Math.max(1.0F, this.b.dJ()));
      } else {
         $$5 = 0;
      }

      double $$7 = this.d(new iz($$1.a, $$1.b, $$1.c));
      eoh $$8 = this.a($$1.a, $$1.b + 1, $$1.c, Math.max(0, $$5 - 1), $$7, je.b, $$4);
      eoh $$9 = this.a($$1.a, $$1.b - 1, $$1.c, $$5, $$7, je.a, $$4);
      if (this.b($$8, $$1)) {
         $$0[$$2++] = $$8;
      }

      if (this.b($$9, $$1) && $$4 != eom.e) {
         $$0[$$2++] = $$9;
      }

      for (int $$10 = 0; $$10 < $$2; $$10++) {
         eoh $$11 = $$0[$$10];
         if ($$11.l == eom.j && this.l && $$11.b < this.b.dP().z_() - 10) {
            $$11.k++;
         }
      }

      return $$2;
   }

   private boolean b(@Nullable eoh $$0, eoh $$1) {
      return this.a($$0, $$1) && $$0.l == eom.j;
   }

   @Override
   protected boolean c() {
      return true;
   }

   @Override
   public eom a(eoo $$0, int $$1, int $$2, int $$3) {
      eom $$4 = $$0.a($$1, $$2, $$3);
      if ($$4 == eom.j) {
         iz.a $$5 = new iz.a();

         for (je $$6 : je.values()) {
            $$5.d($$1, $$2, $$3).c($$6);
            eom $$7 = $$0.a($$5.u(), $$5.v(), $$5.w());
            if ($$7 == eom.a) {
               return eom.k;
            }
         }

         return eom.j;
      } else {
         return super.a($$0, $$1, $$2, $$3);
      }
   }
}
