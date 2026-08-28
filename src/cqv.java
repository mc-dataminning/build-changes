public abstract class cqv extends cqq implements cqy {
   private static final float d = 12.25F;
   private static final akg<cxy> e = akk.a(cqv.class, aki.h);

   public cqv(bwb<? extends cqv> $$0, dhp $$1) {
      super($$0, $$1);
   }

   public cqv(bwb<? extends cqv> $$0, double $$1, double $$2, double $$3, fcu $$4, dhp $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public cqv(bwb<? extends cqv> $$0, bwr $$1, fcu $$2, dhp $$3) {
      super($$0, $$1, $$2, $$3);
   }

   public void a(cxy $$0) {
      if ($$0.f()) {
         this.au().a(e, this.o());
      } else {
         this.au().a(e, $$0.c(1));
      }
   }

   @Override
   protected void aM() {
   }

   @Override
   public cxy f() {
      return this.au().a(e);
   }

   @Override
   protected void a(akk.a $$0) {
      $$0.a(e, this.o());
   }

   @Override
   public void b(tw $$0) {
      super.b($$0);
      $$0.a("Item", this.f().a(this.dX()));
   }

   @Override
   public void a(tw $$0) {
      super.a($$0);
      if ($$0.b("Item", 10)) {
         this.a(cxy.a(this.dX(), (ut)$$0.p("Item")).orElse(this.o()));
      } else {
         this.a(this.o());
      }
   }

   private cxy o() {
      return new cxy(cyc.uZ);
   }

   @Override
   public bxi a_(int $$0) {
      return $$0 == 0 ? bxi.a(this::f, this::a) : super.a_($$0);
   }

   @Override
   public boolean a(double $$0) {
      return this.af < 2 && $$0 < 12.25 ? false : super.a($$0);
   }
}
