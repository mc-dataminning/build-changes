public abstract class ccg extends ccb implements ccj {
   private static final aee<cjf> e = aeh.a(ccg.class, aeg.h);

   public ccg(biu<? extends ccg> $$0, cpv $$1) {
      super($$0, $$1);
   }

   public ccg(biu<? extends ccg> $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, cpv $$7) {
      super($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   public ccg(biu<? extends ccg> $$0, bjg $$1, double $$2, double $$3, double $$4, cpv $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public void a(cjf $$0) {
      if (!$$0.a(cji.tf) || $$0.u()) {
         this.al().b(e, $$0.c(1));
      }
   }

   protected cjf w() {
      return this.al().b(e);
   }

   @Override
   public cjf q() {
      cjf $$0 = this.w();
      return $$0.b() ? new cjf(cji.tf) : $$0;
   }

   @Override
   protected void a_() {
      this.al().a(e, cjf.b);
   }

   @Override
   public void b(qw $$0) {
      super.b($$0);
      cjf $$1 = this.w();
      if (!$$1.b()) {
         $$0.a("Item", $$1.b(new qw()));
      }
   }

   @Override
   public void a(qw $$0) {
      super.a($$0);
      cjf $$1 = cjf.a($$0.p("Item"));
      this.a($$1);
   }
}
