import javax.annotation.Nullable;

public class etg extends ett {
   private final boolean a;
   private float m;
   private float n;

   public etg(boolean $$0) {
      this.a = $$0;
   }

   @Override
   public void a(dgt $$0, bvh $$1) {
      super.a($$0, $$1);
      $$1.a(eto.j, 0.0F);
      this.m = $$1.a(eto.c);
      $$1.a(eto.c, 6.0F);
      this.n = $$1.a(eto.k);
      $$1.a(eto.k, 4.0F);
   }

   @Override
   public void b() {
      this.c.a(eto.c, this.m);
      this.c.a(eto.k, this.n);
      super.b();
   }

   @Override
   public etj a() {
      return !this.c.bj() ? super.a() : this.c(new ji(ayy.a(this.c.cR().a), ayy.a(this.c.cR().b + 0.5), ayy.a(this.c.cR().c)));
   }

   @Override
   public ets a(double $$0, double $$1, double $$2) {
      return this.b($$0, $$1 + 0.5, $$2);
   }

   @Override
   public int a(etj[] $$0, etj $$1) {
      int $$2 = super.a($$0, $$1);
      eto $$3 = this.b($$1.a, $$1.b + 1, $$1.c);
      eto $$4 = this.b($$1.a, $$1.b, $$1.c);
      int $$5;
      if (this.c.a($$3) >= 0.0F && $$4 != eto.w) {
         $$5 = ayy.d(Math.max(1.0F, this.c.dQ()));
      } else {
         $$5 = 0;
      }

      double $$7 = this.d(new ji($$1.a, $$1.b, $$1.c));
      etj $$8 = this.a($$1.a, $$1.b + 1, $$1.c, Math.max(0, $$5 - 1), $$7, jn.b, $$4);
      etj $$9 = this.a($$1.a, $$1.b - 1, $$1.c, $$5, $$7, jn.a, $$4);
      if (this.b($$8, $$1)) {
         $$0[$$2++] = $$8;
      }

      if (this.b($$9, $$1) && $$4 != eto.e) {
         $$0[$$2++] = $$9;
      }

      for (int $$10 = 0; $$10 < $$2; $$10++) {
         etj $$11 = $$0[$$10];
         if ($$11.l == eto.j && this.a && $$11.b < this.c.dW().P() - 10) {
            $$11.k++;
         }
      }

      return $$2;
   }

   private boolean b(@Nullable etj $$0, etj $$1) {
      return this.a($$0, $$1) && $$0.l == eto.j;
   }

   @Override
   protected boolean c() {
      return true;
   }

   @Override
   public eto a(etq $$0, int $$1, int $$2, int $$3) {
      eto $$4 = $$0.a($$1, $$2, $$3);
      if ($$4 == eto.j) {
         ji.a $$5 = new ji.a();

         for (jn $$6 : jn.values()) {
            $$5.d($$1, $$2, $$3).c($$6);
            eto $$7 = $$0.a($$5.u(), $$5.v(), $$5.w());
            if ($$7 == eto.a) {
               return eto.k;
            }
         }

         return eto.j;
      } else {
         return super.a($$0, $$1, $$2, $$3);
      }
   }
}
