public abstract class cta extends csy implements cpp {
   public static final ddb d = dcr.ax;
   public static final int e = 25;
   private final double f;

   protected cta(dca.d $$0, ha $$1, efb $$2, boolean $$3, double $$4) {
      super($$0, $$1, $$2, $$3);
      this.f = $$4;
      this.k(this.C.b().a(d, Integer.valueOf(0)));
   }

   @Override
   public dcb a(cmn $$0) {
      return this.n().a(d, Integer.valueOf($$0.y_().a(25)));
   }

   @Override
   public boolean e_(dcb $$0) {
      return $$0.c(d) < 25;
   }

   @Override
   public void b(dcb $$0, aif $$1, gu $$2, apf $$3) {
      if ($$0.c(d) < 25 && $$3.j() < this.f) {
         gu $$4 = $$2.a(this.a);
         if (this.g($$1.a_($$4))) {
            $$1.b($$4, this.a($$0, $$1.z));
         }
      }
   }

   protected dcb a(dcb $$0, apf $$1) {
      return $$0.a(d);
   }

   public dcb n(dcb $$0) {
      return $$0.a(d, Integer.valueOf(25));
   }

   public boolean o(dcb $$0) {
      return $$0.c(d) == 25;
   }

   protected dcb a(dcb $$0, dcb $$1) {
      return $$1;
   }

   @Override
   public dcb a(dcb $$0, ha $$1, dcb $$2, cmn $$3, gu $$4, gu $$5) {
      if ($$1 == this.a.g() && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      if ($$1 != this.a || !$$2.a(this) && !$$2.a(this.a())) {
         if (this.b) {
            $$3.a($$4, dxf.c, dxf.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         return this.a($$0, this.a().n());
      }
   }

   @Override
   protected void a(dcc.a<cpn, dcb> $$0) {
      $$0.a(d);
   }

   @Override
   public boolean a(cmp $$0, gu $$1, dcb $$2, boolean $$3) {
      return this.g($$0.a_($$1.a(this.a)));
   }

   @Override
   public boolean a(cmm $$0, apf $$1, gu $$2, dcb $$3) {
      return true;
   }

   @Override
   public void a(aif $$0, apf $$1, gu $$2, dcb $$3) {
      gu $$4 = $$2.a(this.a);
      int $$5 = Math.min($$3.c(d) + 1, 25);
      int $$6 = this.a($$1);

      for (int $$7 = 0; $$7 < $$6 && this.g($$0.a_($$4)); $$7++) {
         $$0.b($$4, $$3.a(d, Integer.valueOf($$5)));
         $$4 = $$4.a(this.a);
         $$5 = Math.min($$5 + 1, 25);
      }
   }

   protected abstract int a(apf var1);

   protected abstract boolean g(dcb var1);

   @Override
   protected cta b() {
      return this;
   }
}
