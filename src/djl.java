public class djl extends djx {
   public static final int e = 9;
   private is<coz> f = is.a(9, coz.h);

   protected djl(div<?> $$0, hz $$1, dlf $$2) {
      super($$0, $$1, $$2);
   }

   public djl(hz $$0, dlf $$1) {
      this(div.f, $$0, $$1);
   }

   @Override
   public int b() {
      return 9;
   }

   public int a(awo $$0) {
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

   public int a(coz $$0) {
      for (int $$1 = 0; $$1 < this.f.size(); $$1++) {
         if (this.f.get($$1).b()) {
            this.a($$1, $$0);
            return $$1;
         }
      }

      return -1;
   }

   @Override
   protected vq l() {
      return vq.c("container.dispenser");
   }

   @Override
   public void a(sw $$0) {
      super.a($$0);
      this.f = is.a(this.b(), coz.h);
      if (!this.c_($$0)) {
         blo.b($$0, this.f);
      }
   }

   @Override
   protected void b(sw $$0) {
      super.b($$0);
      if (!this.d_($$0)) {
         blo.a($$0, this.f);
      }
   }

   @Override
   protected is<coz> k() {
      return this.f;
   }

   @Override
   protected void a(is<coz> $$0) {
      this.f = $$0;
   }

   @Override
   protected ckb a(int $$0, chg $$1) {
      return new cku($$0, $$1, this);
   }
}
