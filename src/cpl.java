public abstract class cpl extends cpg implements cpo {
   private static final float d = 12.25F;
   private static final ajy<cwq> e = akc.a(cpl.class, aka.h);

   public cpl(but<? extends cpl> $$0, dgj $$1) {
      super($$0, $$1);
   }

   public cpl(but<? extends cpl> $$0, double $$1, double $$2, double $$3, fbb $$4, dgj $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public cpl(but<? extends cpl> $$0, bvi $$1, fbb $$2, dgj $$3) {
      super($$0, $$1, $$2, $$3);
   }

   public void a(cwq $$0) {
      if ($$0.f()) {
         this.au().a(e, this.v());
      } else {
         this.au().a(e, $$0.c(1));
      }
   }

   @Override
   protected void aM() {
   }

   @Override
   public cwq l() {
      return this.au().a(e);
   }

   @Override
   protected void a(akc.a $$0) {
      $$0.a(e, this.v());
   }

   @Override
   public void b(tq $$0) {
      super.b($$0);
      $$0.a("Item", this.l().a(this.dX()));
   }

   @Override
   public void a(tq $$0) {
      super.a($$0);
      if ($$0.b("Item", 10)) {
         this.a(cwq.a(this.dX(), (un)$$0.p("Item")).orElse(this.v()));
      } else {
         this.a(this.v());
      }
   }

   private cwq v() {
      return new cwq(cwu.uV);
   }

   @Override
   public bwa a_(int $$0) {
      return $$0 == 0 ? bwa.a(this::l, this::a) : super.a_($$0);
   }

   @Override
   public boolean a(double $$0) {
      return this.af < 2 && $$0 < 12.25 ? false : super.a($$0);
   }
}
