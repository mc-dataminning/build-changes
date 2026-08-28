public class caf extends caa {
   private final cfp a;
   private aqn b;
   private boolean c;

   public caf(cfp $$0) {
      this.a = $$0;
   }

   @Override
   public boolean a() {
      aqn $$0 = (aqn)this.a.P_();
      boolean $$1 = $$0 != null && !$$0.N_() && !$$0.gb().b && !$$0.bg() && !$$0.aB;
      return !this.a.gn() && $$1 && this.a.gw();
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
      if (!this.c && !this.a.x() && !this.a.fZ()) {
         if (this.a.cM().c(this.b.cM())) {
            this.c = this.a.b(this.b);
         }
      }
   }
}
