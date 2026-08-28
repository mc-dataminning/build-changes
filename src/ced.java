public class ced extends cdy {
   private final cjt a;
   private boolean b;

   public ced(cjt $$0) {
      this.a = $$0;
   }

   @Override
   public boolean b() {
      if (!(this.a.e() instanceof arr $$0)) {
         return false;
      } else {
         boolean $$1 = !$$0.U_() && !$$0.gj().b && !$$0.bj() && !$$0.av;
         return !this.a.gq() && $$1 && this.a.gG();
      }
   }

   @Override
   public boolean P_() {
      return !this.b;
   }

   @Override
   public void d() {
      this.b = false;
   }

   @Override
   public void a() {
      if (!this.b && !this.a.x() && !this.a.O_()) {
         if (this.a.e() instanceof arr $$0 && this.a.cR().c($$0.cR())) {
            this.b = this.a.b($$0);
         }
      }
   }
}
