import javax.annotation.Nullable;

public class eiw extends ejh {
   private final boolean l;
   private float m;
   private float n;

   public eiw(boolean $$0) {
      this.l = $$0;
   }

   @Override
   public void a(cxm $$0, bpq $$1) {
      super.a($$0, $$1);
      $$1.a(eiy.j, 0.0F);
      this.m = $$1.a(eiy.c);
      $$1.a(eiy.c, 6.0F);
      this.n = $$1.a(eiy.k);
      $$1.a(eiy.k, 4.0F);
   }

   @Override
   public void b() {
      this.b.a(eiy.c, this.m);
      this.b.a(eiy.k, this.n);
      super.b();
   }

   @Override
   public eja a() {
      return !this.b.bc() ? super.a() : this.c(new ib(aww.a(this.b.cH().a), aww.a(this.b.cH().b + 0.5), aww.a(this.b.cH().c)));
   }

   @Override
   public ejg a(double $$0, double $$1, double $$2) {
      return this.a(this.b(aww.a($$0), aww.a($$1 + 0.5), aww.a($$2)));
   }

   @Override
   public int a(eja[] $$0, eja $$1) {
      int $$2 = super.a($$0, $$1);
      eiy $$3 = this.a(this.b, $$1.a, $$1.b + 1, $$1.c);
      eiy $$4 = this.a(this.b, $$1.a, $$1.b, $$1.c);
      int $$5;
      if (this.b.a($$3) >= 0.0F && $$4 != eiy.w) {
         $$5 = aww.d(Math.max(1.0F, this.b.dG()));
      } else {
         $$5 = 0;
      }

      double $$7 = this.d(new ib($$1.a, $$1.b, $$1.c));
      eja $$8 = this.a($$1.a, $$1.b + 1, $$1.c, Math.max(0, $$5 - 1), $$7, ih.b, $$4);
      eja $$9 = this.a($$1.a, $$1.b - 1, $$1.c, $$5, $$7, ih.a, $$4);
      if (this.b($$8, $$1)) {
         $$0[$$2++] = $$8;
      }

      if (this.b($$9, $$1) && $$4 != eiy.e) {
         $$0[$$2++] = $$9;
      }

      for (int $$10 = 0; $$10 < $$2; $$10++) {
         eja $$11 = $$0[$$10];
         if ($$11.l == eiy.j && this.l && $$11.b < this.b.dM().z_() - 10) {
            $$11.k++;
         }
      }

      return $$2;
   }

   private boolean b(@Nullable eja $$0, eja $$1) {
      return this.a($$0, $$1) && $$0.l == eiy.j;
   }

   @Override
   protected boolean c() {
      return true;
   }

   @Override
   public eiy a(cwf $$0, int $$1, int $$2, int $$3) {
      ib.a $$4 = new ib.a();
      eiy $$5 = b($$0, $$4.d($$1, $$2, $$3));
      if ($$5 == eiy.j) {
         for (ih $$6 : ih.values()) {
            eiy $$7 = b($$0, $$4.d($$1, $$2, $$3).c($$6));
            if ($$7 == eiy.a) {
               return eiy.k;
            }
         }

         return eiy.j;
      } else {
         return a($$0, $$4);
      }
   }
}
