public class cex extends ces {
   private final cko a;
   private boolean b;

   public cex(cko $$0) {
      this.a = $$0;
   }

   @Override
   public boolean b() {
      if (!(this.a.e() instanceof arv $$0)) {
         return false;
      } else {
         boolean $$1 = !$$0.Z_() && !$$0.gk().b && !$$0.bi() && !$$0.av;
         return !this.a.gu() && $$1 && this.a.gK();
      }
   }

   @Override
   public boolean U_() {
      return !this.b;
   }

   @Override
   public void d() {
      this.b = false;
   }

   @Override
   public void a() {
      if (!this.b && !this.a.x() && !this.a.S_()) {
         if (this.a.e() instanceof arv $$0 && this.a.cR().c($$0.cR())) {
            this.b = this.a.b($$0);
         }
      }
   }
}
