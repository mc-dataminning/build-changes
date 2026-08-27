public class bsw extends bsr {
   private final byf a;
   private amq b;
   private boolean c;

   public bsw(byf $$0) {
      this.a = $$0;
   }

   @Override
   public boolean a() {
      amq $$0 = (amq)this.a.R_();
      boolean $$1 = $$0 != null && !$$0.P_() && !$$0.fT().b && !$$0.aZ() && !$$0.aA;
      return !this.a.ge() && $$1 && this.a.gn();
   }

   @Override
   public boolean S_() {
      return !this.c;
   }

   @Override
   public void c() {
      this.b = (amq)this.a.R_();
      this.c = false;
   }

   @Override
   public void e() {
      if (!this.c && !this.a.A() && !this.a.fS()) {
         if (this.a.cH().c(this.b.cH())) {
            this.c = this.a.b(this.b);
         }
      }
   }
}
