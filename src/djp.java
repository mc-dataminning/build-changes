public class djp extends dkb {
   public static final int e = 9;
   private is<cpd> f = is.a(9, cpd.h);

   protected djp(diz<?> $$0, hz $$1, dlj $$2) {
      super($$0, $$1, $$2);
   }

   public djp(hz $$0, dlj $$1) {
      this(diz.f, $$0, $$1);
   }

   @Override
   public int b() {
      return 9;
   }

   public int a(awp $$0) {
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

   public int a(cpd $$0) {
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
      this.f = is.a(this.b(), cpd.h);
      if (!this.c_($$0)) {
         blq.b($$0, this.f);
      }
   }

   @Override
   protected void b(sw $$0) {
      super.b($$0);
      if (!this.d_($$0)) {
         blq.a($$0, this.f);
      }
   }

   @Override
   protected is<cpd> k() {
      return this.f;
   }

   @Override
   protected void a(is<cpd> $$0) {
      this.f = $$0;
   }

   @Override
   protected ckf a(int $$0, chk $$1) {
      return new cky($$0, $$1, this);
   }
}
