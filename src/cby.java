public class cby extends cbt {
   private final chj a;
   private arn b;
   private boolean c;

   public cby(chj $$0) {
      this.a = $$0;
   }

   @Override
   public boolean b() {
      arn $$0 = (arn)this.a.T_();
      boolean $$1 = $$0 != null && !$$0.R_() && !$$0.gl().b && !$$0.bk() && !$$0.aw;
      return !this.a.gv() && $$1 && this.a.gL();
   }

   @Override
   public boolean U_() {
      return !this.c;
   }

   @Override
   public void d() {
      this.b = (arn)this.a.T_();
      this.c = false;
   }

   @Override
   public void a() {
      if (!this.c && !this.a.y() && !this.a.M_()) {
         if (this.a.cS().c(this.b.cS())) {
            this.c = this.a.b(this.b);
         }
      }
   }
}
