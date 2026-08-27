public class bxq extends bxl {
   private final cda a;
   private apt b;
   private boolean c;

   public bxq(cda $$0) {
      this.a = $$0;
   }

   @Override
   public boolean a() {
      apt $$0 = (apt)this.a.P_();
      boolean $$1 = $$0 != null && !$$0.N_() && !$$0.ga().b && !$$0.bc() && !$$0.aA;
      return !this.a.gn() && $$1 && this.a.gw();
   }

   @Override
   public boolean Q_() {
      return !this.c;
   }

   @Override
   public void c() {
      this.b = (apt)this.a.P_();
      this.c = false;
   }

   @Override
   public void e() {
      if (!this.c && !this.a.y() && !this.a.gb()) {
         if (this.a.cH().c(this.b.cH())) {
            this.c = this.a.b(this.b);
         }
      }
   }
}
