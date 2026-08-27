public class ddd extends ddp {
   public static final int c = 9;
   private hn<ciy> f = hn.a(9, ciy.b);

   protected ddd(dco<?> $$0, gu $$1, dfa $$2) {
      super($$0, $$1, $$2);
   }

   public ddd(gu $$0, dfa $$1) {
      this(dco.f, $$0, $$1);
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

   public int a(ciy $$0) {
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
      this.f = hn.a(this.b(), ciy.b);
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
   protected hn<ciy> f() {
      return this.f;
   }

   @Override
   protected void a(hn<ciy> $$0) {
      this.f = $$0;
   }

   @Override
   protected cee a(int $$0, cbm $$1) {
      return new cev($$0, $$1, this);
   }
}
