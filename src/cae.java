public class cae extends bzz {
   private final cfo a;
   private aqn b;
   private boolean c;

   public cae(cfo $$0) {
      this.a = $$0;
   }

   @Override
   public boolean a() {
      aqn $$0 = (aqn)this.a.P_();
      boolean $$1 = $$0 != null && !$$0.N_() && !$$0.ga().b && !$$0.bf() && !$$0.aB;
      return !this.a.go() && $$1 && this.a.gx();
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
      if (!this.c && !this.a.y() && !this.a.ga()) {
         if (this.a.cL().c(this.b.cL())) {
            this.c = this.a.b(this.b);
         }
      }
   }
}
