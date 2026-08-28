public class fpa extends fnr {
   private final dbe s;

   public fpa(dbe $$0) {
      this.s = $$0;
   }

   @Override
   public dbe m() {
      return this.s;
   }

   @Override
   int E() {
      return 150;
   }

   @Override
   protected void aO_() {
      super.aO_();
      this.a.a(this.m().m());
   }

   @Override
   protected void a(dbe $$0) {
      if ($$0 instanceof cok.a $$1) {
         this.l.L().b(new ahq($$1.h().al(), this.a.a(), $$0.p()));
      }
   }
}
