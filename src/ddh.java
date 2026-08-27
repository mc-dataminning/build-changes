public class ddh extends ddt {
   public static final int c = 9;
   private hp<cja> f = hp.a(9, cja.b);

   protected ddh(dcs<?> $$0, gw $$1, dfe $$2) {
      super($$0, $$1, $$2);
   }

   public ddh(gw $$0, dfe $$1) {
      this(dcs.f, $$0, $$1);
   }

   @Override
   public int b() {
      return 9;
   }

   public int a(arx $$0) {
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

   public int a(cja $$0) {
      for (int $$1 = 0; $$1 < this.f.size(); $$1++) {
         if (this.f.get($$1).b()) {
            this.a($$1, $$0);
            return $$1;
         }
      }

      return -1;
   }

   @Override
   protected ti g() {
      return ti.c("container.dispenser");
   }

   @Override
   public void a(qu $$0) {
      super.a($$0);
      this.f = hp.a(this.b(), cja.b);
      if (!this.d($$0)) {
         bgn.b($$0, this.f);
      }
   }

   @Override
   protected void b(qu $$0) {
      super.b($$0);
      if (!this.e($$0)) {
         bgn.a($$0, this.f);
      }
   }

   @Override
   protected hp<cja> f() {
      return this.f;
   }

   @Override
   protected void a(hp<cja> $$0) {
      this.f = $$0;
   }

   @Override
   protected ceg a(int $$0, cbo $$1) {
      return new cex($$0, $$1, this);
   }
}
