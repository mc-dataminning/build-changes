public class cdj extends cde {
   private final ciu a;
   private asi b;
   private boolean c;

   public cdj(ciu $$0) {
      this.a = $$0;
   }

   @Override
   public boolean b() {
      asi $$0 = (asi)this.a.ah_();
      boolean $$1 = $$0 != null && !$$0.aa_() && !$$0.gj().b && !$$0.bj() && !$$0.av;
      return !this.a.go() && $$1 && this.a.gE();
   }

   @Override
   public boolean U_() {
      return !this.c;
   }

   @Override
   public void d() {
      this.b = (asi)this.a.ah_();
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
