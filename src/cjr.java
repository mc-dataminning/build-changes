public abstract class cjr extends cjs implements cjh {
   private static final aim<cqk> b = aiq.a(cjr.class, aio.h);

   public cjr(bpc<? extends cjr> $$0, cwz $$1) {
      super($$0, $$1);
   }

   public cjr(bpc<? extends cjr> $$0, double $$1, double $$2, double $$3, cwz $$4) {
      super($$0, $$1, $$2, $$3, $$4);
   }

   public cjr(bpc<? extends cjr> $$0, bpo $$1, cwz $$2) {
      super($$0, $$1, $$2);
   }

   public void a(cqk $$0) {
      this.an().a(b, $$0.c(1));
   }

   protected abstract cqf r();

   @Override
   public cqk p() {
      return this.an().a(b);
   }

   @Override
   protected void a(aiq.a $$0) {
      $$0.a(b, new cqk(this.r()));
   }

   @Override
   public void b(ta $$0) {
      super.b($$0);
      $$0.a("Item", this.p().b(new ta()));
   }

   @Override
   public void a(ta $$0) {
      super.a($$0);
      if ($$0.b("Item", 10)) {
         this.a(cqk.a($$0.p("Item")));
      } else {
         this.a(new cqk(this.r()));
      }
   }
}
