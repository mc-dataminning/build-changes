public class ddo extends dea {
   public static final int c = 9;
   private hp<cjh> f = hp.a(9, cjh.b);

   protected ddo(dcz<?> $$0, gw $$1, dfl $$2) {
      super($$0, $$1, $$2);
   }

   public ddo(gw $$0, dfl $$1) {
      this(dcz.f, $$0, $$1);
   }

   @Override
   public int b() {
      return 9;
   }

   public int a(ase $$0) {
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

   public int a(cjh $$0) {
      for (int $$1 = 0; $$1 < this.f.size(); $$1++) {
         if (this.f.get($$1).b()) {
            this.a($$1, $$0);
            return $$1;
         }
      }

      return -1;
   }

   @Override
   protected tn g() {
      return tn.c("container.dispenser");
   }

   @Override
   public void a(qy $$0) {
      super.a($$0);
      this.f = hp.a(this.b(), cjh.b);
      if (!this.d($$0)) {
         bgu.b($$0, this.f);
      }
   }

   @Override
   protected void b(qy $$0) {
      super.b($$0);
      if (!this.e($$0)) {
         bgu.a($$0, this.f);
      }
   }

   @Override
   protected hp<cjh> f() {
      return this.f;
   }

   @Override
   protected void a(hp<cjh> $$0) {
      this.f = $$0;
   }

   @Override
   protected cen a(int $$0, cbv $$1) {
      return new cfe($$0, $$1, this);
   }
}
