public class cci extends ccd {
   private final cht a;
   private ard b;
   private boolean c;

   public cci(cht $$0) {
      this.a = $$0;
   }

   @Override
   public boolean b() {
      ard $$0 = (ard)this.a.ag_();
      boolean $$1 = $$0 != null && !$$0.Z_() && !$$0.gj().b && !$$0.bj() && !$$0.av;
      return !this.a.gp() && $$1 && this.a.gF();
   }

   @Override
   public boolean U_() {
      return !this.c;
   }

   @Override
   public void d() {
      this.b = (ard)this.a.ag_();
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
