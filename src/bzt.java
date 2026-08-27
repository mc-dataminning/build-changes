public class bzt extends bzo {
   private final cfd a;
   private aqo b;
   private boolean c;

   public bzt(cfd $$0) {
      this.a = $$0;
   }

   @Override
   public boolean a() {
      aqo $$0 = (aqo)this.a.P_();
      boolean $$1 = $$0 != null && !$$0.N_() && !$$0.gd().b && !$$0.be() && !$$0.aB;
      return !this.a.gp() && $$1 && this.a.gy();
   }

   @Override
   public boolean Q_() {
      return !this.c;
   }

   @Override
   public void c() {
      this.b = (aqo)this.a.P_();
      this.c = false;
   }

   @Override
   public void e() {
      if (!this.c && !this.a.y() && !this.a.gc()) {
         if (this.a.cK().c(this.b.cK())) {
            this.c = this.a.b(this.b);
         }
      }
   }
}
