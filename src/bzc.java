public class bzc extends byx {
   private final cem a;
   private aqi b;
   private boolean c;

   public bzc(cem $$0) {
      this.a = $$0;
   }

   @Override
   public boolean a() {
      aqi $$0 = (aqi)this.a.P_();
      boolean $$1 = $$0 != null && !$$0.N_() && !$$0.gb().b && !$$0.bc() && !$$0.aB;
      return !this.a.gp() && $$1 && this.a.gy();
   }

   @Override
   public boolean Q_() {
      return !this.c;
   }

   @Override
   public void c() {
      this.b = (aqi)this.a.P_();
      this.c = false;
   }

   @Override
   public void e() {
      if (!this.c && !this.a.y() && !this.a.gc()) {
         if (this.a.cI().c(this.b.cI())) {
            this.c = this.a.b(this.b);
         }
      }
   }
}
