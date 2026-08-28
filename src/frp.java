public class frp extends fqh {
   private final dcs u;

   public frp(dcs $$0) {
      this.u = $$0;
   }

   @Override
   public dcs m() {
      return this.u;
   }

   @Override
   int D() {
      return 150;
   }

   @Override
   protected void aT_() {
      super.aT_();
      this.a.a(this.m().m());
   }

   @Override
   protected void a(dcs $$0) {
      if ($$0 instanceof cpv.a $$1) {
         this.m.L().b(new aih($$1.h().ap(), this.a.a(), $$0.p()));
      }
   }
}
