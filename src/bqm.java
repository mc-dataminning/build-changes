public class bqm extends bqh {
   private final bvu a;
   private aku b;
   private boolean c;

   public bqm(bvu $$0) {
      this.a = $$0;
   }

   @Override
   public boolean a() {
      aku $$0 = (aku)this.a.O_();
      boolean $$1 = $$0 != null && !$$0.M_() && !$$0.fT().b && !$$0.aX() && !$$0.aA;
      return !this.a.ge() && $$1 && this.a.gn();
   }

   @Override
   public boolean P_() {
      return !this.c;
   }

   @Override
   public void c() {
      this.b = (aku)this.a.O_();
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
