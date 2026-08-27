public class ccx extends ccp {
   private static final int b = 40;
   private int c;

   public ccx(ccm $$0) {
      super($$0);
   }

   @Override
   public void b() {
      this.a.dM().a(this.a.dr(), this.a.dt(), this.a.dx(), atk.hP, this.a.db(), 2.5F, 0.8F + this.a.eh().i() * 0.3F, false);
   }

   @Override
   public void c() {
      if (this.c++ >= 40) {
         this.a.gd().a(cdc.f);
      }
   }

   @Override
   public void d() {
      this.c = 0;
   }

   @Override
   public cdc<ccx> i() {
      return cdc.h;
   }
}
