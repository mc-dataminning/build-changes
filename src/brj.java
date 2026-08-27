public class brj extends bre {
   private final bwr a;
   private alr b;
   private boolean c;

   public brj(bwr $$0) {
      this.a = $$0;
   }

   @Override
   public boolean a() {
      alr $$0 = (alr)this.a.P_();
      boolean $$1 = $$0 != null && !$$0.N_() && !$$0.fT().b && !$$0.aX() && !$$0.aA;
      return !this.a.ge() && $$1 && this.a.gn();
   }

   @Override
   public boolean Q_() {
      return !this.c;
   }

   @Override
   public void c() {
      this.b = (alr)this.a.P_();
      this.c = false;
   }

   @Override
   public void e() {
      if (!this.c && !this.a.y() && !this.a.fS()) {
         if (this.a.cG().c(this.b.cG())) {
            this.c = this.a.b(this.b);
         }
      }
   }
}
