public class cdi extends cdd {
   private final cit a;
   private asi b;
   private boolean c;

   public cdi(cit $$0) {
      this.a = $$0;
   }

   @Override
   public boolean b() {
      asi $$0 = (asi)this.a.ah_();
      boolean $$1 = $$0 != null && !$$0.aa_() && !$$0.gh().b && !$$0.bj() && !$$0.av;
      return !this.a.gm() && $$1 && this.a.gC();
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
