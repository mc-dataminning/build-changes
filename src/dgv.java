public class dgv extends dhh {
   public static final int e = 9;
   private io<cmh> f = io.a(9, cmh.f);

   protected dgv(dgf<?> $$0, hv $$1, dip $$2) {
      super($$0, $$1, $$2);
   }

   public dgv(hv $$0, dip $$1) {
      this(dgf.f, $$0, $$1);
   }

   @Override
   public int b() {
      return 9;
   }

   public int a(auf $$0) {
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

   public int a(cmh $$0) {
      for (int $$1 = 0; $$1 < this.f.size(); $$1++) {
         if (this.f.get($$1).b()) {
            this.a($$1, $$0);
            return $$1;
         }
      }

      return -1;
   }

   @Override
   protected vb l() {
      return vb.c("container.dispenser");
   }

   @Override
   public void a(sj $$0) {
      super.a($$0);
      this.f = io.a(this.b(), cmh.f);
      if (!this.c_($$0)) {
         bjf.b($$0, this.f);
      }
   }

   @Override
   protected void b(sj $$0) {
      super.b($$0);
      if (!this.d_($$0)) {
         bjf.a($$0, this.f);
      }
   }

   @Override
   protected io<cmh> k() {
      return this.f;
   }

   @Override
   protected void a(io<cmh> $$0) {
      this.f = $$0;
   }

   @Override
   protected chk a(int $$0, ceq $$1) {
      return new cid($$0, $$1, this);
   }
}
