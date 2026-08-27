public abstract class ccy extends ccz implements ccp {
   private static final aef<cjl> b = aei.a(ccy.class, aeh.h);

   public ccy(bja<? extends ccy> $$0, cqb $$1) {
      super($$0, $$1);
   }

   public ccy(bja<? extends ccy> $$0, double $$1, double $$2, double $$3, cqb $$4) {
      super($$0, $$1, $$2, $$3, $$4);
   }

   public ccy(bja<? extends ccy> $$0, bjm $$1, cqb $$2) {
      super($$0, $$1, $$2);
   }

   public void a(cjl $$0) {
      if (!$$0.a(this.s()) || $$0.u()) {
         this.al().b(b, $$0.c(1));
      }
   }

   protected abstract cjg s();

   protected cjl t() {
      return this.al().b(b);
   }

   @Override
   public cjl q() {
      cjl $$0 = this.t();
      return $$0.b() ? new cjl(this.s()) : $$0;
   }

   @Override
   protected void a_() {
      this.al().a(b, cjl.b);
   }

   @Override
   public void b(qw $$0) {
      super.b($$0);
      cjl $$1 = this.t();
      if (!$$1.b()) {
         $$0.a("Item", $$1.b(new qw()));
      }
   }

   @Override
   public void a(qw $$0) {
      super.a($$0);
      cjl $$1 = cjl.a($$0.p("Item"));
      this.a($$1);
   }
}
