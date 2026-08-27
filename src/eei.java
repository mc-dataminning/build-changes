import javax.annotation.Nullable;

public class eei extends eet {
   private final boolean l;
   private float m;
   private float n;

   public eei(boolean $$0) {
      this.l = $$0;
   }

   @Override
   public void a(ctl $$0, blx $$1) {
      super.a($$0, $$1);
      $$1.a(eek.j, 0.0F);
      this.m = $$1.a(eek.c);
      $$1.a(eek.c, 6.0F);
      this.n = $$1.a(eek.k);
      $$1.a(eek.k, 4.0F);
   }

   @Override
   public void b() {
      this.b.a(eek.c, this.m);
      this.b.a(eek.k, this.n);
      super.b();
   }

   @Override
   public eem a() {
      return !this.b.aZ() ? super.a() : this.c(new hv(aty.a(this.b.cH().a), aty.a(this.b.cH().b + 0.5), aty.a(this.b.cH().c)));
   }

   @Override
   public ees a(double $$0, double $$1, double $$2) {
      return this.a(this.b(aty.a($$0), aty.a($$1 + 0.5), aty.a($$2)));
   }

   @Override
   public int a(eem[] $$0, eem $$1) {
      int $$2 = super.a($$0, $$1);
      eek $$3 = this.a(this.b, $$1.a, $$1.b + 1, $$1.c);
      eek $$4 = this.a(this.b, $$1.a, $$1.b, $$1.c);
      int $$5;
      if (this.b.a($$3) >= 0.0F && $$4 != eek.w) {
         $$5 = aty.d(Math.max(1.0F, this.b.dG()));
      } else {
         $$5 = 0;
      }

      double $$7 = this.d(new hv($$1.a, $$1.b, $$1.c));
      eem $$8 = this.a($$1.a, $$1.b + 1, $$1.c, Math.max(0, $$5 - 1), $$7, ia.b, $$4);
      eem $$9 = this.a($$1.a, $$1.b - 1, $$1.c, $$5, $$7, ia.a, $$4);
      if (this.b($$8, $$1)) {
         $$0[$$2++] = $$8;
      }

      if (this.b($$9, $$1) && $$4 != eek.e) {
         $$0[$$2++] = $$9;
      }

      for (int $$10 = 0; $$10 < $$2; $$10++) {
         eem $$11 = $$0[$$10];
         if ($$11.l == eek.j && this.l && $$11.b < this.b.dM().A_() - 10) {
            $$11.k++;
         }
      }

      return $$2;
   }

   private boolean b(@Nullable eem $$0, eem $$1) {
      return this.a($$0, $$1) && $$0.l == eek.j;
   }

   @Override
   protected boolean c() {
      return true;
   }

   @Override
   public eek a(cse $$0, int $$1, int $$2, int $$3) {
      hv.a $$4 = new hv.a();
      eek $$5 = b($$0, $$4.d($$1, $$2, $$3));
      if ($$5 == eek.j) {
         for (ia $$6 : ia.values()) {
            eek $$7 = b($$0, $$4.d($$1, $$2, $$3).c($$6));
            if ($$7 == eek.a) {
               return eek.k;
            }
         }

         return eek.j;
      } else {
         return a($$0, $$4);
      }
   }
}
