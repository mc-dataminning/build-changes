import javax.annotation.Nullable;

public class eph extends epu {
   private final boolean l;
   private float m;
   private float n;

   public eph(boolean $$0) {
      this.l = $$0;
   }

   @Override
   public void a(ddh $$0, btn $$1) {
      super.a($$0, $$1);
      $$1.a(epp.j, 0.0F);
      this.m = $$1.a(epp.c);
      $$1.a(epp.c, 6.0F);
      this.n = $$1.a(epp.k);
      $$1.a(epp.k, 4.0F);
   }

   @Override
   public void b() {
      this.b.a(epp.c, this.m);
      this.b.a(epp.k, this.n);
      super.b();
   }

   @Override
   public epk a() {
      return !this.b.bf() ? super.a() : this.c(new jd(ayn.a(this.b.cL().a), ayn.a(this.b.cL().b + 0.5), ayn.a(this.b.cL().c)));
   }

   @Override
   public ept a(double $$0, double $$1, double $$2) {
      return this.b($$0, $$1 + 0.5, $$2);
   }

   @Override
   public int a(epk[] $$0, epk $$1) {
      int $$2 = super.a($$0, $$1);
      epp $$3 = this.b($$1.a, $$1.b + 1, $$1.c);
      epp $$4 = this.b($$1.a, $$1.b, $$1.c);
      int $$5;
      if (this.b.a($$3) >= 0.0F && $$4 != epp.w) {
         $$5 = ayn.d(Math.max(1.0F, this.b.dK()));
      } else {
         $$5 = 0;
      }

      double $$7 = this.d(new jd($$1.a, $$1.b, $$1.c));
      epk $$8 = this.a($$1.a, $$1.b + 1, $$1.c, Math.max(0, $$5 - 1), $$7, ji.b, $$4);
      epk $$9 = this.a($$1.a, $$1.b - 1, $$1.c, $$5, $$7, ji.a, $$4);
      if (this.b($$8, $$1)) {
         $$0[$$2++] = $$8;
      }

      if (this.b($$9, $$1) && $$4 != epp.e) {
         $$0[$$2++] = $$9;
      }

      for (int $$10 = 0; $$10 < $$2; $$10++) {
         epk $$11 = $$0[$$10];
         if ($$11.l == epp.j && this.l && $$11.b < this.b.dQ().z_() - 10) {
            $$11.k++;
         }
      }

      return $$2;
   }

   private boolean b(@Nullable epk $$0, epk $$1) {
      return this.a($$0, $$1) && $$0.l == epp.j;
   }

   @Override
   protected boolean c() {
      return true;
   }

   @Override
   public epp a(epr $$0, int $$1, int $$2, int $$3) {
      epp $$4 = $$0.a($$1, $$2, $$3);
      if ($$4 == epp.j) {
         jd.a $$5 = new jd.a();

         for (ji $$6 : ji.values()) {
            $$5.d($$1, $$2, $$3).c($$6);
            epp $$7 = $$0.a($$5.u(), $$5.v(), $$5.w());
            if ($$7 == epp.a) {
               return epp.k;
            }
         }

         return epp.j;
      } else {
         return super.a($$0, $$1, $$2, $$3);
      }
   }
}
