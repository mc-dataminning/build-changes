import javax.annotation.Nullable;

public class etj extends etw {
   private final boolean a;
   private float m;
   private float n;

   public etj(boolean $$0) {
      this.a = $$0;
   }

   @Override
   public void a(dgw $$0, bvk $$1) {
      super.a($$0, $$1);
      $$1.a(etr.j, 0.0F);
      this.m = $$1.a(etr.c);
      $$1.a(etr.c, 6.0F);
      this.n = $$1.a(etr.k);
      $$1.a(etr.k, 4.0F);
   }

   @Override
   public void b() {
      this.c.a(etr.c, this.m);
      this.c.a(etr.k, this.n);
      super.b();
   }

   @Override
   public etm a() {
      return !this.c.bj() ? super.a() : this.c(new ji(ayz.a(this.c.cR().a), ayz.a(this.c.cR().b + 0.5), ayz.a(this.c.cR().c)));
   }

   @Override
   public etv a(double $$0, double $$1, double $$2) {
      return this.b($$0, $$1 + 0.5, $$2);
   }

   @Override
   public int a(etm[] $$0, etm $$1) {
      int $$2 = super.a($$0, $$1);
      etr $$3 = this.b($$1.a, $$1.b + 1, $$1.c);
      etr $$4 = this.b($$1.a, $$1.b, $$1.c);
      int $$5;
      if (this.c.a($$3) >= 0.0F && $$4 != etr.w) {
         $$5 = ayz.d(Math.max(1.0F, this.c.dP()));
      } else {
         $$5 = 0;
      }

      double $$7 = this.d(new ji($$1.a, $$1.b, $$1.c));
      etm $$8 = this.a($$1.a, $$1.b + 1, $$1.c, Math.max(0, $$5 - 1), $$7, jn.b, $$4);
      etm $$9 = this.a($$1.a, $$1.b - 1, $$1.c, $$5, $$7, jn.a, $$4);
      if (this.b($$8, $$1)) {
         $$0[$$2++] = $$8;
      }

      if (this.b($$9, $$1) && $$4 != etr.e) {
         $$0[$$2++] = $$9;
      }

      for (int $$10 = 0; $$10 < $$2; $$10++) {
         etm $$11 = $$0[$$10];
         if ($$11.l == etr.j && this.a && $$11.b < this.c.dV().P() - 10) {
            $$11.k++;
         }
      }

      return $$2;
   }

   private boolean b(@Nullable etm $$0, etm $$1) {
      return this.a($$0, $$1) && $$0.l == etr.j;
   }

   @Override
   protected boolean c() {
      return true;
   }

   @Override
   public etr a(ett $$0, int $$1, int $$2, int $$3) {
      etr $$4 = $$0.a($$1, $$2, $$3);
      if ($$4 == etr.j) {
         ji.a $$5 = new ji.a();

         for (jn $$6 : jn.values()) {
            $$5.d($$1, $$2, $$3).c($$6);
            etr $$7 = $$0.a($$5.u(), $$5.v(), $$5.w());
            if ($$7 == etr.a) {
               return etr.k;
            }
         }

         return etr.j;
      } else {
         return super.a($$0, $$1, $$2, $$3);
      }
   }
}
