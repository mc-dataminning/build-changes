public class btp extends btk {
   private final byz a;
   private anf b;
   private boolean c;

   public btp(byz $$0) {
      this.a = $$0;
   }

   @Override
   public boolean a() {
      anf $$0 = (anf)this.a.R_();
      boolean $$1 = $$0 != null && !$$0.P_() && !$$0.fT().b && !$$0.aZ() && !$$0.aA;
      return !this.a.gf() && $$1 && this.a.go();
   }

   @Override
   public boolean S_() {
      return !this.c;
   }

   @Override
   public void c() {
      this.b = (anf)this.a.R_();
      this.c = false;
   }

   @Override
   public void e() {
      if (!this.c && !this.a.A() && !this.a.fT()) {
         if (this.a.cH().c(this.b.cH())) {
            this.c = this.a.b(this.b);
         }
      }
   }
}
