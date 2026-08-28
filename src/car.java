public class car extends cam {
   private final cgb a;
   private aqv b;
   private boolean c;

   public car(cgb $$0) {
      this.a = $$0;
   }

   @Override
   public boolean b() {
      aqv $$0 = (aqv)this.a.T_();
      boolean $$1 = $$0 != null && !$$0.R_() && !$$0.ga().b && !$$0.bf() && !$$0.az;
      return !this.a.gl() && $$1 && this.a.gz();
   }

   @Override
   public boolean U_() {
      return !this.c;
   }

   @Override
   public void d() {
      this.b = (aqv)this.a.T_();
      this.c = false;
   }

   @Override
   public void a() {
      if (!this.c && !this.a.x() && !this.a.N_()) {
         if (this.a.cL().c(this.b.cL())) {
            this.c = this.a.b(this.b);
         }
      }
   }
}
