public class fsw extends fro {
   private final deb u;

   public fsw(deb $$0) {
      this.u = $$0;
   }

   @Override
   public deb m() {
      return this.u;
   }

   @Override
   int D() {
      return 150;
   }

   @Override
   protected void aR_() {
      super.aR_();
      this.a.a(this.m().m());
   }

   @Override
   protected void a(deb $$0) {
      if ($$0 instanceof cqt.a $$1) {
         this.m.L().b(new aim($$1.h().as(), this.a.a(), $$0.p()));
      }
   }
}
