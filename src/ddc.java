public class ddc extends ddo {
   public static final int c = 9;
   private hn<cix> f = hn.a(9, cix.b);

   protected ddc(dcn<?> $$0, gu $$1, dez $$2) {
      super($$0, $$1, $$2);
   }

   public ddc(gu $$0, dez $$1) {
      this(dcn.f, $$0, $$1);
   }

   @Override
   public int b() {
      return 9;
   }

   public int a(aru $$0) {
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

   public int a(cix $$0) {
      for (int $$1 = 0; $$1 < this.f.size(); $$1++) {
         if (this.f.get($$1).b()) {
            this.a($$1, $$0);
            return $$1;
         }
      }

      return -1;
   }

   @Override
   protected tf g() {
      return tf.c("container.dispenser");
   }

   @Override
   public void a(qr $$0) {
      super.a($$0);
      this.f = hn.a(this.b(), cix.b);
      if (!this.d($$0)) {
         bgk.b($$0, this.f);
      }
   }

   @Override
   protected void b(qr $$0) {
      super.b($$0);
      if (!this.e($$0)) {
         bgk.a($$0, this.f);
      }
   }

   @Override
   protected hn<cix> f() {
      return this.f;
   }

   @Override
   protected void a(hn<cix> $$0) {
      this.f = $$0;
   }

   @Override
   protected ced a(int $$0, cbl $$1) {
      return new ceu($$0, $$1, this);
   }
}
