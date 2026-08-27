import javax.annotation.Nullable;

public class eiy extends ejj {
   private final boolean l;
   private float m;
   private float n;

   public eiy(boolean $$0) {
      this.l = $$0;
   }

   @Override
   public void a(cxo $$0, bpr $$1) {
      super.a($$0, $$1);
      $$1.a(ejg.j, 0.0F);
      this.m = $$1.a(ejg.c);
      $$1.a(ejg.c, 6.0F);
      this.n = $$1.a(ejg.k);
      $$1.a(ejg.k, 4.0F);
   }

   @Override
   public void b() {
      this.b.a(ejg.c, this.m);
      this.b.a(ejg.k, this.n);
      super.b();
   }

   @Override
   public ejb a() {
      return !this.b.bc() ? super.a() : this.c(new ib(aww.a(this.b.cH().a), aww.a(this.b.cH().b + 0.5), aww.a(this.b.cH().c)));
   }

   @Override
   public eji a(double $$0, double $$1, double $$2) {
      return this.b($$0, $$1 + 0.5, $$2);
   }

   @Override
   public int a(ejb[] $$0, ejb $$1) {
      int $$2 = super.a($$0, $$1);
      ejg $$3 = this.b($$1.a, $$1.b + 1, $$1.c);
      ejg $$4 = this.b($$1.a, $$1.b, $$1.c);
      int $$5;
      if (this.b.a($$3) >= 0.0F && $$4 != ejg.w) {
         $$5 = aww.d(Math.max(1.0F, this.b.dG()));
      } else {
         $$5 = 0;
      }

      double $$7 = this.d(new ib($$1.a, $$1.b, $$1.c));
      ejb $$8 = this.a($$1.a, $$1.b + 1, $$1.c, Math.max(0, $$5 - 1), $$7, ih.b, $$4);
      ejb $$9 = this.a($$1.a, $$1.b - 1, $$1.c, $$5, $$7, ih.a, $$4);
      if (this.b($$8, $$1)) {
         $$0[$$2++] = $$8;
      }

      if (this.b($$9, $$1) && $$4 != ejg.e) {
         $$0[$$2++] = $$9;
      }

      for (int $$10 = 0; $$10 < $$2; $$10++) {
         ejb $$11 = $$0[$$10];
         if ($$11.l == ejg.j && this.l && $$11.b < this.b.dM().z_() - 10) {
            $$11.k++;
         }
      }

      return $$2;
   }

   private boolean b(@Nullable ejb $$0, ejb $$1) {
      return this.a($$0, $$1) && $$0.l == ejg.j;
   }

   @Override
   protected boolean c() {
      return true;
   }

   @Override
   public ejg a(cwh $$0, int $$1, int $$2, int $$3) {
      ib.a $$4 = new ib.a();
      ejg $$5 = b($$0, $$4.d($$1, $$2, $$3));
      if ($$5 == ejg.j) {
         for (ih $$6 : ih.values()) {
            ejg $$7 = b($$0, $$4.d($$1, $$2, $$3).c($$6));
            if ($$7 == ejg.a) {
               return ejg.k;
            }
         }

         return ejg.j;
      } else {
         return a($$0, $$4);
      }
   }
}
