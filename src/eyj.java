import javax.annotation.Nullable;

public class eyj extends eyw {
   private final boolean a;
   private float m;
   private float n;

   public eyj(boolean $$0) {
      this.a = $$0;
   }

   @Override
   public void a(dkw $$0, byh $$1) {
      super.a($$0, $$1);
      $$1.a(eyr.j, 0.0F);
      this.m = $$1.a(eyr.c);
      $$1.a(eyr.c, 6.0F);
      this.n = $$1.a(eyr.k);
      $$1.a(eyr.k, 4.0F);
   }

   @Override
   public void b() {
      this.c.a(eyr.c, this.m);
      this.c.a(eyr.k, this.n);
      super.b();
   }

   @Override
   public eym a() {
      return !this.c.bi() ? super.a() : this.c(new iw(azz.a(this.c.cR().a), azz.a(this.c.cR().b + 0.5), azz.a(this.c.cR().c)));
   }

   @Override
   public eyv a(double $$0, double $$1, double $$2) {
      return this.b($$0, $$1 + 0.5, $$2);
   }

   @Override
   public int a(eym[] $$0, eym $$1) {
      int $$2 = super.a($$0, $$1);
      eyr $$3 = this.b($$1.a, $$1.b + 1, $$1.c);
      eyr $$4 = this.b($$1.a, $$1.b, $$1.c);
      int $$5;
      if (this.c.a($$3) >= 0.0F && $$4 != eyr.w) {
         $$5 = azz.d(Math.max(1.0F, this.c.dP()));
      } else {
         $$5 = 0;
      }

      double $$7 = this.d(new iw($$1.a, $$1.b, $$1.c));
      eym $$8 = this.a($$1.a, $$1.b + 1, $$1.c, Math.max(0, $$5 - 1), $$7, jc.b, $$4);
      eym $$9 = this.a($$1.a, $$1.b - 1, $$1.c, $$5, $$7, jc.a, $$4);
      if (this.b($$8, $$1)) {
         $$0[$$2++] = $$8;
      }

      if (this.b($$9, $$1) && $$4 != eyr.e) {
         $$0[$$2++] = $$9;
      }

      for (int $$10 = 0; $$10 < $$2; $$10++) {
         eym $$11 = $$0[$$10];
         if ($$11.l == eyr.j && this.a && $$11.b < this.c.dV().P() - 10) {
            $$11.k++;
         }
      }

      return $$2;
   }

   private boolean b(@Nullable eym $$0, eym $$1) {
      return this.a($$0, $$1) && $$0.l == eyr.j;
   }

   @Override
   protected boolean c() {
      return true;
   }

   @Override
   public eyr a(eyt $$0, int $$1, int $$2, int $$3) {
      eyr $$4 = $$0.a($$1, $$2, $$3);
      if ($$4 == eyr.j) {
         iw.a $$5 = new iw.a();

         for (jc $$6 : jc.values()) {
            $$5.d($$1, $$2, $$3).c($$6);
            eyr $$7 = $$0.a($$5.u(), $$5.v(), $$5.w());
            if ($$7 == eyr.a) {
               return eyr.k;
            }
         }

         return eyr.j;
      } else {
         return super.a($$0, $$1, $$2, $$3);
      }
   }
}
