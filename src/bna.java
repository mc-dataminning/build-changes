public class bna extends bmv {
   private final bsi a;
   private aig b;
   private boolean c;

   public bna(bsi $$0) {
      this.a = $$0;
   }

   @Override
   public boolean a() {
      aig $$0 = (aig)this.a.I_();
      boolean $$1 = $$0 != null && !$$0.G_() && !$$0.fO().b && !$$0.aV() && !$$0.az;
      return !this.a.fY() && $$1 && this.a.gh();
   }

   @Override
   public boolean J_() {
      return !this.c;
   }

   @Override
   public void c() {
      this.b = (aig)this.a.I_();
      this.c = false;
   }

   @Override
   public void e() {
      if (!this.c && !this.a.w() && !this.a.fO()) {
         if (this.a.cE().c(this.b.cE())) {
            this.c = this.a.b(this.b);
         }
      }
   }
}
