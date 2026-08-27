public class dhv extends dih {
   public static final int e = 9;
   private iq<cng> f = iq.a(9, cng.f);

   protected dhv(dhf<?> $$0, hx $$1, djp $$2) {
      super($$0, $$1, $$2);
   }

   public dhv(hx $$0, djp $$1) {
      this(dhf.f, $$0, $$1);
   }

   @Override
   public int b() {
      return 9;
   }

   public int a(auw $$0) {
      this.e_(null);
      int $$1 = -1;
      int $$2 = 1;

      for (int $$3 = 0; $$3 < this.f.size(); $$3++) {
         if (!this.f.get($$3).b() && $$0.a($$2++) == 0) {
            $$1 = $$3;
         }
      }

      return $$1;
   }

   public int a(cng $$0) {
      for (int $$1 = 0; $$1 < this.f.size(); $$1++) {
         if (this.f.get($$1).b()) {
            this.a($$1, $$0);
            return $$1;
         }
      }

      return -1;
   }

   @Override
   protected vg l() {
      return vg.c("container.dispenser");
   }

   @Override
   public void a(so $$0) {
      super.a($$0);
      this.f = iq.a(this.b(), cng.f);
      if (!this.c_($$0)) {
         bjw.b($$0, this.f);
      }
   }

   @Override
   protected void b(so $$0) {
      super.b($$0);
      if (!this.d_($$0)) {
         bjw.a($$0, this.f);
      }
   }

   @Override
   protected iq<cng> k() {
      return this.f;
   }

   @Override
   protected void a(iq<cng> $$0) {
      this.f = $$0;
   }

   @Override
   protected cij a(int $$0, cfp $$1) {
      return new cjc($$0, $$1, this);
   }
}
