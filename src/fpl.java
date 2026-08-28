public class fpl extends foc {
   private final dbb s;

   public fpl(dbb $$0) {
      this.s = $$0;
   }

   @Override
   public dbb m() {
      return this.s;
   }

   @Override
   int E() {
      return 150;
   }

   @Override
   protected void aM_() {
      super.aM_();
      this.a.a(this.m().m());
   }

   @Override
   protected void a(dbb $$0) {
      if ($$0 instanceof cpd.a $$1) {
         this.m.L().b(new ail($$1.h().al(), this.a.a(), $$0.p()));
      }
   }
}
