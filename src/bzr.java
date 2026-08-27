public class bzr extends bzm {
   private final cfb a;
   private aqn b;
   private boolean c;

   public bzr(cfb $$0) {
      this.a = $$0;
   }

   @Override
   public boolean a() {
      aqn $$0 = (aqn)this.a.P_();
      boolean $$1 = $$0 != null && !$$0.N_() && !$$0.gd().b && !$$0.be() && !$$0.aB;
      return !this.a.gp() && $$1 && this.a.gy();
   }

   @Override
   public boolean Q_() {
      return !this.c;
   }

   @Override
   public void c() {
      this.b = (aqn)this.a.P_();
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
