public class dae extends daq {
   public static final int c = 9;
   private hn<cfz> f = hn.a(9, cfz.b);

   protected dae(czp<?> $$0, gu $$1, dcb $$2) {
      super($$0, $$1, $$2);
   }

   public dae(gu $$0, dcb $$1) {
      this(czp.f, $$0, $$1);
   }

   @Override
   public int b() {
      return 9;
   }

   public int a(apf $$0) {
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

   public int a(cfz $$0) {
      for (int $$1 = 0; $$1 < this.f.size(); $$1++) {
         if (this.f.get($$1).b()) {
            this.a($$1, $$0);
            return $$1;
         }
      }

      return -1;
   }

   @Override
   protected sw g() {
      return sw.c("container.dispenser");
   }

   @Override
   public void a(qr $$0) {
      super.a($$0);
      this.f = hn.a(this.b(), cfz.b);
      if (!this.d($$0)) {
         bdr.b($$0, this.f);
      }
   }

   @Override
   protected void b(qr $$0) {
      super.b($$0);
      if (!this.e($$0)) {
         bdr.a($$0, this.f);
      }
   }

   @Override
   protected hn<cfz> f() {
      return this.f;
   }

   @Override
   protected void a(hn<cfz> $$0) {
      this.f = $$0;
   }

   @Override
   protected cbf a(int $$0, byn $$1) {
      return new cbw($$0, $$1, this);
   }
}
