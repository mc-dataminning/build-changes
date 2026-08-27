import javax.annotation.Nullable;

public class edb extends edm {
   private final boolean l;
   private float m;
   private float n;

   public edb(boolean $$0) {
      this.l = $$0;
   }

   @Override
   public void a(csn $$0, bli $$1) {
      super.a($$0, $$1);
      $$1.a(edd.j, 0.0F);
      this.m = $$1.a(edd.c);
      $$1.a(edd.c, 6.0F);
      this.n = $$1.a(edd.k);
      $$1.a(edd.k, 4.0F);
   }

   @Override
   public void b() {
      this.b.a(edd.c, this.m);
      this.b.a(edd.k, this.n);
      super.b();
   }

   @Override
   public edf a() {
      return !this.b.aZ() ? super.a() : this.c(new ht(atm.a(this.b.cH().a), atm.a(this.b.cH().b + 0.5), atm.a(this.b.cH().c)));
   }

   @Override
   public edl a(double $$0, double $$1, double $$2) {
      return this.a(this.b(atm.a($$0), atm.a($$1 + 0.5), atm.a($$2)));
   }

   @Override
   public int a(edf[] $$0, edf $$1) {
      int $$2 = super.a($$0, $$1);
      edd $$3 = this.a(this.b, $$1.a, $$1.b + 1, $$1.c);
      edd $$4 = this.a(this.b, $$1.a, $$1.b, $$1.c);
      int $$5;
      if (this.b.a($$3) >= 0.0F && $$4 != edd.w) {
         $$5 = atm.d(Math.max(1.0F, this.b.dH()));
      } else {
         $$5 = 0;
      }

      double $$7 = this.d(new ht($$1.a, $$1.b, $$1.c));
      edf $$8 = this.a($$1.a, $$1.b + 1, $$1.c, Math.max(0, $$5 - 1), $$7, hx.b, $$4);
      edf $$9 = this.a($$1.a, $$1.b - 1, $$1.c, $$5, $$7, hx.a, $$4);
      if (this.b($$8, $$1)) {
         $$0[$$2++] = $$8;
      }

      if (this.b($$9, $$1) && $$4 != edd.e) {
         $$0[$$2++] = $$9;
      }

      for (int $$10 = 0; $$10 < $$2; $$10++) {
         edf $$11 = $$0[$$10];
         if ($$11.l == edd.j && this.l && $$11.b < this.b.dN().z_() - 10) {
            $$11.k++;
         }
      }

      return $$2;
   }

   private boolean b(@Nullable edf $$0, edf $$1) {
      return this.a($$0, $$1) && $$0.l == edd.j;
   }

   @Override
   protected boolean c() {
      return true;
   }

   @Override
   public edd a(crg $$0, int $$1, int $$2, int $$3) {
      ht.a $$4 = new ht.a();
      edd $$5 = b($$0, $$4.d($$1, $$2, $$3));
      if ($$5 == edd.j) {
         for (hx $$6 : hx.values()) {
            edd $$7 = b($$0, $$4.d($$1, $$2, $$3).c($$6));
            if ($$7 == edd.a) {
               return edd.k;
            }
         }

         return edd.j;
      } else {
         return a($$0, $$4);
      }
   }
}
