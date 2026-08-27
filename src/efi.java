import javax.annotation.Nullable;

public class efi extends eft {
   private final boolean l;
   private float m;
   private float n;

   public efi(boolean $$0) {
      this.l = $$0;
   }

   @Override
   public void a(cuk $$0, bmq $$1) {
      super.a($$0, $$1);
      $$1.a(efk.j, 0.0F);
      this.m = $$1.a(efk.c);
      $$1.a(efk.c, 6.0F);
      this.n = $$1.a(efk.k);
      $$1.a(efk.k, 4.0F);
   }

   @Override
   public void b() {
      this.b.a(efk.c, this.m);
      this.b.a(efk.k, this.n);
      super.b();
   }

   @Override
   public efm a() {
      return !this.b.aZ() ? super.a() : this.c(new hx(aup.a(this.b.cH().a), aup.a(this.b.cH().b + 0.5), aup.a(this.b.cH().c)));
   }

   @Override
   public efs a(double $$0, double $$1, double $$2) {
      return this.a(this.b(aup.a($$0), aup.a($$1 + 0.5), aup.a($$2)));
   }

   @Override
   public int a(efm[] $$0, efm $$1) {
      int $$2 = super.a($$0, $$1);
      efk $$3 = this.a(this.b, $$1.a, $$1.b + 1, $$1.c);
      efk $$4 = this.a(this.b, $$1.a, $$1.b, $$1.c);
      int $$5;
      if (this.b.a($$3) >= 0.0F && $$4 != efk.w) {
         $$5 = aup.d(Math.max(1.0F, this.b.dF()));
      } else {
         $$5 = 0;
      }

      double $$7 = this.d(new hx($$1.a, $$1.b, $$1.c));
      efm $$8 = this.a($$1.a, $$1.b + 1, $$1.c, Math.max(0, $$5 - 1), $$7, ic.b, $$4);
      efm $$9 = this.a($$1.a, $$1.b - 1, $$1.c, $$5, $$7, ic.a, $$4);
      if (this.b($$8, $$1)) {
         $$0[$$2++] = $$8;
      }

      if (this.b($$9, $$1) && $$4 != efk.e) {
         $$0[$$2++] = $$9;
      }

      for (int $$10 = 0; $$10 < $$2; $$10++) {
         efm $$11 = $$0[$$10];
         if ($$11.l == efk.j && this.l && $$11.b < this.b.dL().A_() - 10) {
            $$11.k++;
         }
      }

      return $$2;
   }

   private boolean b(@Nullable efm $$0, efm $$1) {
      return this.a($$0, $$1) && $$0.l == efk.j;
   }

   @Override
   protected boolean c() {
      return true;
   }

   @Override
   public efk a(ctd $$0, int $$1, int $$2, int $$3) {
      hx.a $$4 = new hx.a();
      efk $$5 = b($$0, $$4.d($$1, $$2, $$3));
      if ($$5 == efk.j) {
         for (ic $$6 : ic.values()) {
            efk $$7 = b($$0, $$4.d($$1, $$2, $$3).c($$6));
            if ($$7 == efk.a) {
               return efk.k;
            }
         }

         return efk.j;
      } else {
         return a($$0, $$4);
      }
   }
}
