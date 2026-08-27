public abstract class cwd extends cwb implements css {
   public static final dge d = dfu.ax;
   public static final int e = 25;
   private final double f;

   protected cwd(dfd.d $$0, hc $$1, eib $$2, boolean $$3, double $$4) {
      super($$0, $$1, $$2, $$3);
      this.f = $$4;
      this.k(this.C.b().a(d, Integer.valueOf(0)));
   }

   @Override
   public dfe a(cpr $$0) {
      return this.n().a(d, Integer.valueOf($$0.y_().a(25)));
   }

   @Override
   public boolean e_(dfe $$0) {
      return $$0.c(d) < 25;
   }

   @Override
   public void b(dfe $$0, akn $$1, gw $$2, arx $$3) {
      if ($$0.c(d) < 25 && $$3.j() < this.f) {
         gw $$4 = $$2.a(this.a);
         if (this.g($$1.a_($$4))) {
            $$1.b($$4, this.a($$0, $$1.z));
         }
      }
   }

   protected dfe a(dfe $$0, arx $$1) {
      return $$0.a(d);
   }

   public dfe n(dfe $$0) {
      return $$0.a(d, Integer.valueOf(25));
   }

   public boolean o(dfe $$0) {
      return $$0.c(d) == 25;
   }

   protected dfe a(dfe $$0, dfe $$1) {
      return $$1;
   }

   @Override
   public dfe a(dfe $$0, hc $$1, dfe $$2, cpr $$3, gw $$4, gw $$5) {
      if ($$1 == this.a.g() && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      if ($$1 != this.a || !$$2.a(this) && !$$2.a(this.a())) {
         if (this.b) {
            $$3.a($$4, eai.c, eai.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         return this.a($$0, this.a().n());
      }
   }

   @Override
   protected void a(dff.a<csq, dfe> $$0) {
      $$0.a(d);
   }

   @Override
   public boolean a(cpt $$0, gw $$1, dfe $$2) {
      return this.g($$0.a_($$1.a(this.a)));
   }

   @Override
   public boolean a(cpq $$0, arx $$1, gw $$2, dfe $$3) {
      return true;
   }

   @Override
   public void a(akn $$0, arx $$1, gw $$2, dfe $$3) {
      gw $$4 = $$2.a(this.a);
      int $$5 = Math.min($$3.c(d) + 1, 25);
      int $$6 = this.a($$1);

      for (int $$7 = 0; $$7 < $$6 && this.g($$0.a_($$4)); $$7++) {
         $$0.b($$4, $$3.a(d, Integer.valueOf($$5)));
         $$4 = $$4.a(this.a);
         $$5 = Math.min($$5 + 1, 25);
      }
   }

   protected abstract int a(arx var1);

   protected abstract boolean g(dfe var1);

   @Override
   protected cwd b() {
      return this;
   }
}
