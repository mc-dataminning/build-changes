public class ccj extends cce {
   private final chu a;
   private are b;
   private boolean c;

   public ccj(chu $$0) {
      this.a = $$0;
   }

   @Override
   public boolean b() {
      are $$0 = (are)this.a.ag_();
      boolean $$1 = $$0 != null && !$$0.Z_() && !$$0.gj().b && !$$0.bj() && !$$0.av;
      return !this.a.gs() && $$1 && this.a.gI();
   }

   @Override
   public boolean U_() {
      return !this.c;
   }

   @Override
   public void d() {
      this.b = (are)this.a.ag_();
      this.c = false;
   }

   @Override
   public void a() {
      if (!this.c && !this.a.x() && !this.a.P_()) {
         if (this.a.cR().c(this.b.cR())) {
            this.c = this.a.b(this.b);
         }
      }
   }
}
