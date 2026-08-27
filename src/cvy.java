public abstract class cvy extends cvw implements csn {
   public static final dfz d = dfp.ax;
   public static final int e = 25;
   private final double f;

   protected cvy(dey.d $$0, ha $$1, ehw $$2, boolean $$3, double $$4) {
      super($$0, $$1, $$2, $$3);
      this.f = $$4;
      this.k(this.C.b().a(d, Integer.valueOf(0)));
   }

   @Override
   public dez a(cpm $$0) {
      return this.n().a(d, Integer.valueOf($$0.y_().a(25)));
   }

   @Override
   public boolean e_(dez $$0) {
      return $$0.c(d) < 25;
   }

   @Override
   public void b(dez $$0, akk $$1, gu $$2, aru $$3) {
      if ($$0.c(d) < 25 && $$3.j() < this.f) {
         gu $$4 = $$2.a(this.a);
         if (this.g($$1.a_($$4))) {
            $$1.b($$4, this.a($$0, $$1.z));
         }
      }
   }

   protected dez a(dez $$0, aru $$1) {
      return $$0.a(d);
   }

   public dez n(dez $$0) {
      return $$0.a(d, Integer.valueOf(25));
   }

   public boolean o(dez $$0) {
      return $$0.c(d) == 25;
   }

   protected dez a(dez $$0, dez $$1) {
      return $$1;
   }

   @Override
   public dez a(dez $$0, ha $$1, dez $$2, cpm $$3, gu $$4, gu $$5) {
      if ($$1 == this.a.g() && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      if ($$1 != this.a || !$$2.a(this) && !$$2.a(this.a())) {
         if (this.b) {
            $$3.a($$4, ead.c, ead.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         return this.a($$0, this.a().n());
      }
   }

   @Override
   protected void a(dfa.a<csl, dez> $$0) {
      $$0.a(d);
   }

   @Override
   public boolean a(cpo $$0, gu $$1, dez $$2) {
      return this.g($$0.a_($$1.a(this.a)));
   }

   @Override
   public boolean a(cpl $$0, aru $$1, gu $$2, dez $$3) {
      return true;
   }

   @Override
   public void a(akk $$0, aru $$1, gu $$2, dez $$3) {
      gu $$4 = $$2.a(this.a);
      int $$5 = Math.min($$3.c(d) + 1, 25);
      int $$6 = this.a($$1);

      for (int $$7 = 0; $$7 < $$6 && this.g($$0.a_($$4)); $$7++) {
         $$0.b($$4, $$3.a(d, Integer.valueOf($$5)));
         $$4 = $$4.a(this.a);
         $$5 = Math.min($$5 + 1, 25);
      }
   }

   protected abstract int a(aru var1);

   protected abstract boolean g(dez var1);

   @Override
   protected cvy b() {
      return this;
   }
}
