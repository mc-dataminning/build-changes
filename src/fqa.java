public class fqa extends fos {
   private final dbx u;

   public fqa(dbx $$0) {
      this.u = $$0;
   }

   @Override
   public dbx m() {
      return this.u;
   }

   @Override
   int C() {
      return 150;
   }

   @Override
   protected void aT_() {
      super.aT_();
      this.a.a(this.m().m());
   }

   @Override
   protected void a(dbx $$0) {
      if ($$0 instanceof cpb.a $$1) {
         this.l.L().b(new ahx($$1.h().an(), this.a.a(), $$0.p()));
      }
   }
}
