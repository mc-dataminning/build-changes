import javax.annotation.Nullable;

public class ewx extends exk {
   private final boolean a;
   private float m;
   private float n;

   public ewx(boolean $$0) {
      this.a = $$0;
   }

   @Override
   public void a(djn $$0, bxg $$1) {
      super.a($$0, $$1);
      $$1.a(exf.j, 0.0F);
      this.m = $$1.a(exf.c);
      $$1.a(exf.c, 6.0F);
      this.n = $$1.a(exf.k);
      $$1.a(exf.k, 4.0F);
   }

   @Override
   public void b() {
      this.c.a(exf.c, this.m);
      this.c.a(exf.k, this.n);
      super.b();
   }

   @Override
   public exa a() {
      return !this.c.bj() ? super.a() : this.c(new iu(azm.a(this.c.cR().a), azm.a(this.c.cR().b + 0.5), azm.a(this.c.cR().c)));
   }

   @Override
   public exj a(double $$0, double $$1, double $$2) {
      return this.b($$0, $$1 + 0.5, $$2);
   }

   @Override
   public int a(exa[] $$0, exa $$1) {
      int $$2 = super.a($$0, $$1);
      exf $$3 = this.b($$1.a, $$1.b + 1, $$1.c);
      exf $$4 = this.b($$1.a, $$1.b, $$1.c);
      int $$5;
      if (this.c.a($$3) >= 0.0F && $$4 != exf.w) {
         $$5 = azm.d(Math.max(1.0F, this.c.dP()));
      } else {
         $$5 = 0;
      }

      double $$7 = this.d(new iu($$1.a, $$1.b, $$1.c));
      exa $$8 = this.a($$1.a, $$1.b + 1, $$1.c, Math.max(0, $$5 - 1), $$7, ja.b, $$4);
      exa $$9 = this.a($$1.a, $$1.b - 1, $$1.c, $$5, $$7, ja.a, $$4);
      if (this.b($$8, $$1)) {
         $$0[$$2++] = $$8;
      }

      if (this.b($$9, $$1) && $$4 != exf.e) {
         $$0[$$2++] = $$9;
      }

      for (int $$10 = 0; $$10 < $$2; $$10++) {
         exa $$11 = $$0[$$10];
         if ($$11.l == exf.j && this.a && $$11.b < this.c.dV().P() - 10) {
            $$11.k++;
         }
      }

      return $$2;
   }

   private boolean b(@Nullable exa $$0, exa $$1) {
      return this.a($$0, $$1) && $$0.l == exf.j;
   }

   @Override
   protected boolean c() {
      return true;
   }

   @Override
   public exf a(exh $$0, int $$1, int $$2, int $$3) {
      exf $$4 = $$0.a($$1, $$2, $$3);
      if ($$4 == exf.j) {
         iu.a $$5 = new iu.a();

         for (ja $$6 : ja.values()) {
            $$5.d($$1, $$2, $$3).c($$6);
            exf $$7 = $$0.a($$5.u(), $$5.v(), $$5.w());
            if ($$7 == exf.a) {
               return exf.k;
            }
         }

         return exf.j;
      } else {
         return super.a($$0, $$1, $$2, $$3);
      }
   }
}
