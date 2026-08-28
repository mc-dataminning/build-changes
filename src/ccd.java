public class ccd extends cby {
   private final cho a;
   private aro b;
   private boolean c;

   public ccd(cho $$0) {
      this.a = $$0;
   }

   @Override
   public boolean b() {
      aro $$0 = (aro)this.a.T_();
      boolean $$1 = $$0 != null && !$$0.R_() && !$$0.gl().b && !$$0.bk() && !$$0.aw;
      return !this.a.gu() && $$1 && this.a.gK();
   }

   @Override
   public boolean U_() {
      return !this.c;
   }

   @Override
   public void d() {
      this.b = (aro)this.a.T_();
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
