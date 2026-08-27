public abstract class ccs extends cct implements ccj {
   private static final aef<cjf> b = aei.a(ccs.class, aeh.h);

   public ccs(biu<? extends ccs> $$0, cpv $$1) {
      super($$0, $$1);
   }

   public ccs(biu<? extends ccs> $$0, double $$1, double $$2, double $$3, cpv $$4) {
      super($$0, $$1, $$2, $$3, $$4);
   }

   public ccs(biu<? extends ccs> $$0, bjg $$1, cpv $$2) {
      super($$0, $$1, $$2);
   }

   public void a(cjf $$0) {
      if (!$$0.a(this.s()) || $$0.u()) {
         this.al().b(b, $$0.c(1));
      }
   }

   protected abstract cja s();

   protected cjf t() {
      return this.al().b(b);
   }

   @Override
   public cjf q() {
      cjf $$0 = this.t();
      return $$0.b() ? new cjf(this.s()) : $$0;
   }

   @Override
   protected void a_() {
      this.al().a(b, cjf.b);
   }

   @Override
   public void b(qy $$0) {
      super.b($$0);
      cjf $$1 = this.t();
      if (!$$1.b()) {
         $$0.a("Item", $$1.b(new qy()));
      }
   }

   @Override
   public void a(qy $$0) {
      super.a($$0);
      cjf $$1 = cjf.a($$0.p("Item"));
      this.a($$1);
   }
}
