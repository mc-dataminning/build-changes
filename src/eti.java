import javax.annotation.Nullable;

public class eti extends etv {
   private final boolean a;
   private float m;
   private float n;

   public eti(boolean $$0) {
      this.a = $$0;
   }

   @Override
   public void a(dgv $$0, bvj $$1) {
      super.a($$0, $$1);
      $$1.a(etq.j, 0.0F);
      this.m = $$1.a(etq.c);
      $$1.a(etq.c, 6.0F);
      this.n = $$1.a(etq.k);
      $$1.a(etq.k, 4.0F);
   }

   @Override
   public void b() {
      this.c.a(etq.c, this.m);
      this.c.a(etq.k, this.n);
      super.b();
   }

   @Override
   public etl a() {
      return !this.c.bj() ? super.a() : this.c(new ji(ayz.a(this.c.cR().a), ayz.a(this.c.cR().b + 0.5), ayz.a(this.c.cR().c)));
   }

   @Override
   public etu a(double $$0, double $$1, double $$2) {
      return this.b($$0, $$1 + 0.5, $$2);
   }

   @Override
   public int a(etl[] $$0, etl $$1) {
      int $$2 = super.a($$0, $$1);
      etq $$3 = this.b($$1.a, $$1.b + 1, $$1.c);
      etq $$4 = this.b($$1.a, $$1.b, $$1.c);
      int $$5;
      if (this.c.a($$3) >= 0.0F && $$4 != etq.w) {
         $$5 = ayz.d(Math.max(1.0F, this.c.dP()));
      } else {
         $$5 = 0;
      }

      double $$7 = this.d(new ji($$1.a, $$1.b, $$1.c));
      etl $$8 = this.a($$1.a, $$1.b + 1, $$1.c, Math.max(0, $$5 - 1), $$7, jn.b, $$4);
      etl $$9 = this.a($$1.a, $$1.b - 1, $$1.c, $$5, $$7, jn.a, $$4);
      if (this.b($$8, $$1)) {
         $$0[$$2++] = $$8;
      }

      if (this.b($$9, $$1) && $$4 != etq.e) {
         $$0[$$2++] = $$9;
      }

      for (int $$10 = 0; $$10 < $$2; $$10++) {
         etl $$11 = $$0[$$10];
         if ($$11.l == etq.j && this.a && $$11.b < this.c.dV().P() - 10) {
            $$11.k++;
         }
      }

      return $$2;
   }

   private boolean b(@Nullable etl $$0, etl $$1) {
      return this.a($$0, $$1) && $$0.l == etq.j;
   }

   @Override
   protected boolean c() {
      return true;
   }

   @Override
   public etq a(ets $$0, int $$1, int $$2, int $$3) {
      etq $$4 = $$0.a($$1, $$2, $$3);
      if ($$4 == etq.j) {
         ji.a $$5 = new ji.a();

         for (jn $$6 : jn.values()) {
            $$5.d($$1, $$2, $$3).c($$6);
            etq $$7 = $$0.a($$5.u(), $$5.v(), $$5.w());
            if ($$7 == etq.a) {
               return etq.k;
            }
         }

         return etq.j;
      } else {
         return super.a($$0, $$1, $$2, $$3);
      }
   }
}
