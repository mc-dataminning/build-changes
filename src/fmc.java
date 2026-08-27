public class fmc extends fku {
   private final cyh p;

   public fmc(cyh $$0) {
      this.p = $$0;
   }

   @Override
   public cyh m() {
      return this.p;
   }

   @Override
   int C() {
      return 150;
   }

   @Override
   protected void aM_() {
      super.aM_();
      this.a.a(this.m().m());
   }

   @Override
   protected void a(cyh $$0) {
      if ($$0 instanceof cmd.a $$1) {
         this.j.L().b(new ahb($$1.h().aj(), this.a.a(), $$0.p()));
      }
   }
}
