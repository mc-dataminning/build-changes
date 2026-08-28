import javax.annotation.Nullable;

public class etz extends eum {
   private final boolean a;
   private float m;
   private float n;

   public etz(boolean $$0) {
      this.a = $$0;
   }

   @Override
   public void a(dhm $$0, bvz $$1) {
      super.a($$0, $$1);
      $$1.a(euh.j, 0.0F);
      this.m = $$1.a(euh.c);
      $$1.a(euh.c, 6.0F);
      this.n = $$1.a(euh.k);
      $$1.a(euh.k, 4.0F);
   }

   @Override
   public void b() {
      this.c.a(euh.c, this.m);
      this.c.a(euh.k, this.n);
      super.b();
   }

   @Override
   public euc a() {
      return !this.c.bj() ? super.a() : this.c(new jh(azu.a(this.c.cR().a), azu.a(this.c.cR().b + 0.5), azu.a(this.c.cR().c)));
   }

   @Override
   public eul a(double $$0, double $$1, double $$2) {
      return this.b($$0, $$1 + 0.5, $$2);
   }

   @Override
   public int a(euc[] $$0, euc $$1) {
      int $$2 = super.a($$0, $$1);
      euh $$3 = this.b($$1.a, $$1.b + 1, $$1.c);
      euh $$4 = this.b($$1.a, $$1.b, $$1.c);
      int $$5;
      if (this.c.a($$3) >= 0.0F && $$4 != euh.w) {
         $$5 = azu.d(Math.max(1.0F, this.c.dQ()));
      } else {
         $$5 = 0;
      }

      double $$7 = this.d(new jh($$1.a, $$1.b, $$1.c));
      euc $$8 = this.a($$1.a, $$1.b + 1, $$1.c, Math.max(0, $$5 - 1), $$7, jm.b, $$4);
      euc $$9 = this.a($$1.a, $$1.b - 1, $$1.c, $$5, $$7, jm.a, $$4);
      if (this.b($$8, $$1)) {
         $$0[$$2++] = $$8;
      }

      if (this.b($$9, $$1) && $$4 != euh.e) {
         $$0[$$2++] = $$9;
      }

      for (int $$10 = 0; $$10 < $$2; $$10++) {
         euc $$11 = $$0[$$10];
         if ($$11.l == euh.j && this.a && $$11.b < this.c.dW().P() - 10) {
            $$11.k++;
         }
      }

      return $$2;
   }

   private boolean b(@Nullable euc $$0, euc $$1) {
      return this.a($$0, $$1) && $$0.l == euh.j;
   }

   @Override
   protected boolean c() {
      return true;
   }

   @Override
   public euh a(euj $$0, int $$1, int $$2, int $$3) {
      euh $$4 = $$0.a($$1, $$2, $$3);
      if ($$4 == euh.j) {
         jh.a $$5 = new jh.a();

         for (jm $$6 : jm.values()) {
            $$5.d($$1, $$2, $$3).c($$6);
            euh $$7 = $$0.a($$5.u(), $$5.v(), $$5.w());
            if ($$7 == euh.a) {
               return euh.k;
            }
         }

         return euh.j;
      } else {
         return super.a($$0, $$1, $$2, $$3);
      }
   }
}
