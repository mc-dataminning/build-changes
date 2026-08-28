import javax.annotation.Nullable;

public class eqk extends eqx {
   private final boolean l;
   private float m;
   private float n;

   public eqk(boolean $$0) {
      this.l = $$0;
   }

   @Override
   public void a(def $$0, buh $$1) {
      super.a($$0, $$1);
      $$1.a(eqs.j, 0.0F);
      this.m = $$1.a(eqs.c);
      $$1.a(eqs.c, 6.0F);
      this.n = $$1.a(eqs.k);
      $$1.a(eqs.k, 4.0F);
   }

   @Override
   public void b() {
      this.b.a(eqs.c, this.m);
      this.b.a(eqs.k, this.n);
      super.b();
   }

   @Override
   public eqn a() {
      return !this.b.bi() ? super.a() : this.c(new je(azc.a(this.b.cO().a), azc.a(this.b.cO().b + 0.5), azc.a(this.b.cO().c)));
   }

   @Override
   public eqw a(double $$0, double $$1, double $$2) {
      return this.b($$0, $$1 + 0.5, $$2);
   }

   @Override
   public int a(eqn[] $$0, eqn $$1) {
      int $$2 = super.a($$0, $$1);
      eqs $$3 = this.b($$1.a, $$1.b + 1, $$1.c);
      eqs $$4 = this.b($$1.a, $$1.b, $$1.c);
      int $$5;
      if (this.b.a($$3) >= 0.0F && $$4 != eqs.w) {
         $$5 = azc.d(Math.max(1.0F, this.b.dM()));
      } else {
         $$5 = 0;
      }

      double $$7 = this.d(new je($$1.a, $$1.b, $$1.c));
      eqn $$8 = this.a($$1.a, $$1.b + 1, $$1.c, Math.max(0, $$5 - 1), $$7, jj.b, $$4);
      eqn $$9 = this.a($$1.a, $$1.b - 1, $$1.c, $$5, $$7, jj.a, $$4);
      if (this.b($$8, $$1)) {
         $$0[$$2++] = $$8;
      }

      if (this.b($$9, $$1) && $$4 != eqs.e) {
         $$0[$$2++] = $$9;
      }

      for (int $$10 = 0; $$10 < $$2; $$10++) {
         eqn $$11 = $$0[$$10];
         if ($$11.l == eqs.j && this.l && $$11.b < this.b.dS().N() - 10) {
            $$11.k++;
         }
      }

      return $$2;
   }

   private boolean b(@Nullable eqn $$0, eqn $$1) {
      return this.a($$0, $$1) && $$0.l == eqs.j;
   }

   @Override
   protected boolean c() {
      return true;
   }

   @Override
   public eqs a(equ $$0, int $$1, int $$2, int $$3) {
      eqs $$4 = $$0.a($$1, $$2, $$3);
      if ($$4 == eqs.j) {
         je.a $$5 = new je.a();

         for (jj $$6 : jj.values()) {
            $$5.d($$1, $$2, $$3).c($$6);
            eqs $$7 = $$0.a($$5.u(), $$5.v(), $$5.w());
            if ($$7 == eqs.a) {
               return eqs.k;
            }
         }

         return eqs.j;
      } else {
         return super.a($$0, $$1, $$2, $$3);
      }
   }
}
