public class bqi extends bqd {
   private final bvq a;
   private akt b;
   private boolean c;

   public bqi(bvq $$0) {
      this.a = $$0;
   }

   @Override
   public boolean a() {
      akt $$0 = (akt)this.a.O_();
      boolean $$1 = $$0 != null && !$$0.M_() && !$$0.fS().b && !$$0.aX() && !$$0.aA;
      return !this.a.gd() && $$1 && this.a.gm();
   }

   @Override
   public boolean P_() {
      return !this.c;
   }

   @Override
   public void c() {
      this.b = (akt)this.a.O_();
      this.c = false;
   }

   @Override
   public void e() {
      if (!this.c && !this.a.y() && !this.a.fR()) {
         if (this.a.cG().c(this.b.cG())) {
            this.c = this.a.b(this.b);
         }
      }
   }
}
