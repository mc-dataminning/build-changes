import javax.annotation.Nullable;

public class eez extends efk {
   private final boolean l;
   private float m;
   private float n;

   public eez(boolean $$0) {
      this.l = $$0;
   }

   @Override
   public void a(cub $$0, bmm $$1) {
      super.a($$0, $$1);
      $$1.a(efb.j, 0.0F);
      this.m = $$1.a(efb.c);
      $$1.a(efb.c, 6.0F);
      this.n = $$1.a(efb.k);
      $$1.a(efb.k, 4.0F);
   }

   @Override
   public void b() {
      this.b.a(efb.c, this.m);
      this.b.a(efb.k, this.n);
      super.b();
   }

   @Override
   public efd a() {
      return !this.b.aZ() ? super.a() : this.c(new hx(aun.a(this.b.cH().a), aun.a(this.b.cH().b + 0.5), aun.a(this.b.cH().c)));
   }

   @Override
   public efj a(double $$0, double $$1, double $$2) {
      return this.a(this.b(aun.a($$0), aun.a($$1 + 0.5), aun.a($$2)));
   }

   @Override
   public int a(efd[] $$0, efd $$1) {
      int $$2 = super.a($$0, $$1);
      efb $$3 = this.a(this.b, $$1.a, $$1.b + 1, $$1.c);
      efb $$4 = this.a(this.b, $$1.a, $$1.b, $$1.c);
      int $$5;
      if (this.b.a($$3) >= 0.0F && $$4 != efb.w) {
         $$5 = aun.d(Math.max(1.0F, this.b.dG()));
      } else {
         $$5 = 0;
      }

      double $$7 = this.d(new hx($$1.a, $$1.b, $$1.c));
      efd $$8 = this.a($$1.a, $$1.b + 1, $$1.c, Math.max(0, $$5 - 1), $$7, ic.b, $$4);
      efd $$9 = this.a($$1.a, $$1.b - 1, $$1.c, $$5, $$7, ic.a, $$4);
      if (this.b($$8, $$1)) {
         $$0[$$2++] = $$8;
      }

      if (this.b($$9, $$1) && $$4 != efb.e) {
         $$0[$$2++] = $$9;
      }

      for (int $$10 = 0; $$10 < $$2; $$10++) {
         efd $$11 = $$0[$$10];
         if ($$11.l == efb.j && this.l && $$11.b < this.b.dM().A_() - 10) {
            $$11.k++;
         }
      }

      return $$2;
   }

   private boolean b(@Nullable efd $$0, efd $$1) {
      return this.a($$0, $$1) && $$0.l == efb.j;
   }

   @Override
   protected boolean c() {
      return true;
   }

   @Override
   public efb a(csu $$0, int $$1, int $$2, int $$3) {
      hx.a $$4 = new hx.a();
      efb $$5 = b($$0, $$4.d($$1, $$2, $$3));
      if ($$5 == efb.j) {
         for (ic $$6 : ic.values()) {
            efb $$7 = b($$0, $$4.d($$1, $$2, $$3).c($$6));
            if ($$7 == efb.a) {
               return efb.k;
            }
         }

         return efb.j;
      } else {
         return a($$0, $$4);
      }
   }
}
