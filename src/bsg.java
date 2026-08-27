public class bsg extends bsb {
   private final bxo a;
   private amf b;
   private boolean c;

   public bsg(bxo $$0) {
      this.a = $$0;
   }

   @Override
   public boolean a() {
      amf $$0 = (amf)this.a.Q_();
      boolean $$1 = $$0 != null && !$$0.O_() && !$$0.fU().b && !$$0.aZ() && !$$0.aA;
      return !this.a.gf() && $$1 && this.a.go();
   }

   @Override
   public boolean R_() {
      return !this.c;
   }

   @Override
   public void c() {
      this.b = (amf)this.a.Q_();
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
