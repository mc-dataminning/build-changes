import javax.annotation.Nullable;

public class eoq extends epd {
   private final boolean l;
   private float m;
   private float n;

   public eoq(boolean $$0) {
      this.l = $$0;
   }

   @Override
   public void a(dcs $$0, btd $$1) {
      super.a($$0, $$1);
      $$1.a(eoy.j, 0.0F);
      this.m = $$1.a(eoy.c);
      $$1.a(eoy.c, 6.0F);
      this.n = $$1.a(eoy.k);
      $$1.a(eoy.k, 4.0F);
   }

   @Override
   public void b() {
      this.b.a(eoy.c, this.m);
      this.b.a(eoy.k, this.n);
      super.b();
   }

   @Override
   public eot a() {
      return !this.b.bf() ? super.a() : this.c(new ja(ayg.a(this.b.cL().a), ayg.a(this.b.cL().b + 0.5), ayg.a(this.b.cL().c)));
   }

   @Override
   public epc a(double $$0, double $$1, double $$2) {
      return this.b($$0, $$1 + 0.5, $$2);
   }

   @Override
   public int a(eot[] $$0, eot $$1) {
      int $$2 = super.a($$0, $$1);
      eoy $$3 = this.b($$1.a, $$1.b + 1, $$1.c);
      eoy $$4 = this.b($$1.a, $$1.b, $$1.c);
      int $$5;
      if (this.b.a($$3) >= 0.0F && $$4 != eoy.w) {
         $$5 = ayg.d(Math.max(1.0F, this.b.dK()));
      } else {
         $$5 = 0;
      }

      double $$7 = this.d(new ja($$1.a, $$1.b, $$1.c));
      eot $$8 = this.a($$1.a, $$1.b + 1, $$1.c, Math.max(0, $$5 - 1), $$7, jf.b, $$4);
      eot $$9 = this.a($$1.a, $$1.b - 1, $$1.c, $$5, $$7, jf.a, $$4);
      if (this.b($$8, $$1)) {
         $$0[$$2++] = $$8;
      }

      if (this.b($$9, $$1) && $$4 != eoy.e) {
         $$0[$$2++] = $$9;
      }

      for (int $$10 = 0; $$10 < $$2; $$10++) {
         eot $$11 = $$0[$$10];
         if ($$11.l == eoy.j && this.l && $$11.b < this.b.dQ().z_() - 10) {
            $$11.k++;
         }
      }

      return $$2;
   }

   private boolean b(@Nullable eot $$0, eot $$1) {
      return this.a($$0, $$1) && $$0.l == eoy.j;
   }

   @Override
   protected boolean c() {
      return true;
   }

   @Override
   public eoy a(epa $$0, int $$1, int $$2, int $$3) {
      eoy $$4 = $$0.a($$1, $$2, $$3);
      if ($$4 == eoy.j) {
         ja.a $$5 = new ja.a();

         for (jf $$6 : jf.values()) {
            $$5.d($$1, $$2, $$3).c($$6);
            eoy $$7 = $$0.a($$5.u(), $$5.v(), $$5.w());
            if ($$7 == eoy.a) {
               return eoy.k;
            }
         }

         return eoy.j;
      } else {
         return super.a($$0, $$1, $$2, $$3);
      }
   }
}
