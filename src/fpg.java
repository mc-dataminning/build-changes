public class fpg extends fnx {
   private final dbg s;

   public fpg(dbg $$0) {
      this.s = $$0;
   }

   @Override
   public dbg m() {
      return this.s;
   }

   @Override
   int E() {
      return 150;
   }

   @Override
   protected void aP_() {
      super.aP_();
      this.a.a(this.m().m());
   }

   @Override
   protected void a(dbg $$0) {
      if ($$0 instanceof coo.a $$1) {
         this.l.L().b(new ahq($$1.h().am(), this.a.a(), $$0.p()));
      }
   }
}
