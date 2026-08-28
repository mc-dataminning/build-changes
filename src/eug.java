import javax.annotation.Nullable;

public class eug extends eut {
   private final boolean a;
   private float m;
   private float n;

   public eug(boolean $$0) {
      this.a = $$0;
   }

   @Override
   public void a(dhv $$0, bwi $$1) {
      super.a($$0, $$1);
      $$1.a(euo.j, 0.0F);
      this.m = $$1.a(euo.c);
      $$1.a(euo.c, 6.0F);
      this.n = $$1.a(euo.k);
      $$1.a(euo.k, 4.0F);
   }

   @Override
   public void b() {
      this.c.a(euo.c, this.m);
      this.c.a(euo.k, this.n);
      super.b();
   }

   @Override
   public euj a() {
      return !this.c.bj() ? super.a() : this.c(new jh(bae.a(this.c.cR().a), bae.a(this.c.cR().b + 0.5), bae.a(this.c.cR().c)));
   }

   @Override
   public eus a(double $$0, double $$1, double $$2) {
      return this.b($$0, $$1 + 0.5, $$2);
   }

   @Override
   public int a(euj[] $$0, euj $$1) {
      int $$2 = super.a($$0, $$1);
      euo $$3 = this.b($$1.a, $$1.b + 1, $$1.c);
      euo $$4 = this.b($$1.a, $$1.b, $$1.c);
      int $$5;
      if (this.c.a($$3) >= 0.0F && $$4 != euo.w) {
         $$5 = bae.d(Math.max(1.0F, this.c.dQ()));
      } else {
         $$5 = 0;
      }

      double $$7 = this.d(new jh($$1.a, $$1.b, $$1.c));
      euj $$8 = this.a($$1.a, $$1.b + 1, $$1.c, Math.max(0, $$5 - 1), $$7, jm.b, $$4);
      euj $$9 = this.a($$1.a, $$1.b - 1, $$1.c, $$5, $$7, jm.a, $$4);
      if (this.b($$8, $$1)) {
         $$0[$$2++] = $$8;
      }

      if (this.b($$9, $$1) && $$4 != euo.e) {
         $$0[$$2++] = $$9;
      }

      for (int $$10 = 0; $$10 < $$2; $$10++) {
         euj $$11 = $$0[$$10];
         if ($$11.l == euo.j && this.a && $$11.b < this.c.dW().O() - 10) {
            $$11.k++;
         }
      }

      return $$2;
   }

   private boolean b(@Nullable euj $$0, euj $$1) {
      return this.a($$0, $$1) && $$0.l == euo.j;
   }

   @Override
   protected boolean c() {
      return true;
   }

   @Override
   public euo a(euq $$0, int $$1, int $$2, int $$3) {
      euo $$4 = $$0.a($$1, $$2, $$3);
      if ($$4 == euo.j) {
         jh.a $$5 = new jh.a();

         for (jm $$6 : jm.values()) {
            $$5.d($$1, $$2, $$3).c($$6);
            euo $$7 = $$0.a($$5.u(), $$5.v(), $$5.w());
            if ($$7 == euo.a) {
               return euo.k;
            }
         }

         return euo.j;
      } else {
         return super.a($$0, $$1, $$2, $$3);
      }
   }
}
