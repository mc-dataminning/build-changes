import javax.annotation.Nullable;

public class ety extends eul {
   private final boolean a;
   private float m;
   private float n;

   public ety(boolean $$0) {
      this.a = $$0;
   }

   @Override
   public void a(dhn $$0, bwd $$1) {
      super.a($$0, $$1);
      $$1.a(eug.j, 0.0F);
      this.m = $$1.a(eug.c);
      $$1.a(eug.c, 6.0F);
      this.n = $$1.a(eug.k);
      $$1.a(eug.k, 4.0F);
   }

   @Override
   public void b() {
      this.c.a(eug.c, this.m);
      this.c.a(eug.k, this.n);
      super.b();
   }

   @Override
   public eub a() {
      return !this.c.bj() ? super.a() : this.c(new jh(bae.a(this.c.cR().a), bae.a(this.c.cR().b + 0.5), bae.a(this.c.cR().c)));
   }

   @Override
   public euk a(double $$0, double $$1, double $$2) {
      return this.b($$0, $$1 + 0.5, $$2);
   }

   @Override
   public int a(eub[] $$0, eub $$1) {
      int $$2 = super.a($$0, $$1);
      eug $$3 = this.b($$1.a, $$1.b + 1, $$1.c);
      eug $$4 = this.b($$1.a, $$1.b, $$1.c);
      int $$5;
      if (this.c.a($$3) >= 0.0F && $$4 != eug.w) {
         $$5 = bae.d(Math.max(1.0F, this.c.dP()));
      } else {
         $$5 = 0;
      }

      double $$7 = this.d(new jh($$1.a, $$1.b, $$1.c));
      eub $$8 = this.a($$1.a, $$1.b + 1, $$1.c, Math.max(0, $$5 - 1), $$7, jm.b, $$4);
      eub $$9 = this.a($$1.a, $$1.b - 1, $$1.c, $$5, $$7, jm.a, $$4);
      if (this.b($$8, $$1)) {
         $$0[$$2++] = $$8;
      }

      if (this.b($$9, $$1) && $$4 != eug.e) {
         $$0[$$2++] = $$9;
      }

      for (int $$10 = 0; $$10 < $$2; $$10++) {
         eub $$11 = $$0[$$10];
         if ($$11.l == eug.j && this.a && $$11.b < this.c.dV().O() - 10) {
            $$11.k++;
         }
      }

      return $$2;
   }

   private boolean b(@Nullable eub $$0, eub $$1) {
      return this.a($$0, $$1) && $$0.l == eug.j;
   }

   @Override
   protected boolean c() {
      return true;
   }

   @Override
   public eug a(eui $$0, int $$1, int $$2, int $$3) {
      eug $$4 = $$0.a($$1, $$2, $$3);
      if ($$4 == eug.j) {
         jh.a $$5 = new jh.a();

         for (jm $$6 : jm.values()) {
            $$5.d($$1, $$2, $$3).c($$6);
            eug $$7 = $$0.a($$5.u(), $$5.v(), $$5.w());
            if ($$7 == eug.a) {
               return eug.k;
            }
         }

         return eug.j;
      } else {
         return super.a($$0, $$1, $$2, $$3);
      }
   }
}
