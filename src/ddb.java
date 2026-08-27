public class ddb extends ddn {
   public static final int c = 9;
   private ho<ciw> f = ho.a(9, ciw.b);

   protected ddb(dcm<?> $$0, gv $$1, dey $$2) {
      super($$0, $$1, $$2);
   }

   public ddb(gv $$0, dey $$1) {
      this(dcm.f, $$0, $$1);
   }

   @Override
   public int b() {
      return 9;
   }

   public int a(art $$0) {
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

   public int a(ciw $$0) {
      for (int $$1 = 0; $$1 < this.f.size(); $$1++) {
         if (this.f.get($$1).b()) {
            this.a($$1, $$0);
            return $$1;
         }
      }

      return -1;
   }

   @Override
   protected te g() {
      return te.c("container.dispenser");
   }

   @Override
   public void a(qs $$0) {
      super.a($$0);
      this.f = ho.a(this.b(), ciw.b);
      if (!this.d($$0)) {
         bgi.b($$0, this.f);
      }
   }

   @Override
   protected void b(qs $$0) {
      super.b($$0);
      if (!this.e($$0)) {
         bgi.a($$0, this.f);
      }
   }

   @Override
   protected ho<ciw> f() {
      return this.f;
   }

   @Override
   protected void a(ho<ciw> $$0) {
      this.f = $$0;
   }

   @Override
   protected cec a(int $$0, cbk $$1) {
      return new cet($$0, $$1, this);
   }
}
