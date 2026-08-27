public class dhg extends dhs {
   public static final int e = 9;
   private iq<cmr> f = iq.a(9, cmr.f);

   protected dhg(dgq<?> $$0, hx $$1, dja $$2) {
      super($$0, $$1, $$2);
   }

   public dhg(hx $$0, dja $$1) {
      this(dgq.f, $$0, $$1);
   }

   @Override
   public int b() {
      return 9;
   }

   public int a(aup $$0) {
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

   public int a(cmr $$0) {
      for (int $$1 = 0; $$1 < this.f.size(); $$1++) {
         if (this.f.get($$1).b()) {
            this.a($$1, $$0);
            return $$1;
         }
      }

      return -1;
   }

   @Override
   protected vd l() {
      return vd.c("container.dispenser");
   }

   @Override
   public void a(sl $$0) {
      super.a($$0);
      this.f = iq.a(this.b(), cmr.f);
      if (!this.c_($$0)) {
         bjp.b($$0, this.f);
      }
   }

   @Override
   protected void b(sl $$0) {
      super.b($$0);
      if (!this.d_($$0)) {
         bjp.a($$0, this.f);
      }
   }

   @Override
   protected iq<cmr> k() {
      return this.f;
   }

   @Override
   protected void a(iq<cmr> $$0) {
      this.f = $$0;
   }

   @Override
   protected chu a(int $$0, cfa $$1) {
      return new cin($$0, $$1, this);
   }
}
