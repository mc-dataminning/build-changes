public class ddm extends ddy {
   public static final int c = 9;
   private hp<cjf> f = hp.a(9, cjf.b);

   protected ddm(dcx<?> $$0, gw $$1, dfj $$2) {
      super($$0, $$1, $$2);
   }

   public ddm(gw $$0, dfj $$1) {
      this(dcx.f, $$0, $$1);
   }

   @Override
   public int b() {
      return 9;
   }

   public int a(asc $$0) {
      this.e(null);
      int $$1 = -1;
      int $$2 = 1;

      for (int $$3 = 0; $$3 < this.f.size(); $$3++) {
         if (!this.f.get($$3).b() && $$0.a($$2++) == 0) {
            $$1 = $$3;
         }
      }

      return $$1;
   }

   public int a(cjf $$0) {
      for (int $$1 = 0; $$1 < this.f.size(); $$1++) {
         if (this.f.get($$1).b()) {
            this.a($$1, $$0);
            return $$1;
         }
      }

      return -1;
   }

   @Override
   protected tl g() {
      return tl.c("container.dispenser");
   }

   @Override
   public void a(qx $$0) {
      super.a($$0);
      this.f = hp.a(this.b(), cjf.b);
      if (!this.d($$0)) {
         bgs.b($$0, this.f);
      }
   }

   @Override
   protected void b(qx $$0) {
      super.b($$0);
      if (!this.e($$0)) {
         bgs.a($$0, this.f);
      }
   }

   @Override
   protected hp<cjf> f() {
      return this.f;
   }

   @Override
   protected void a(hp<cjf> $$0) {
      this.f = $$0;
   }

   @Override
   protected cel a(int $$0, cbt $$1) {
      return new cfc($$0, $$1, this);
   }
}
