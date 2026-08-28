public class cap extends cak {
   private final cfz a;
   private aqu b;
   private boolean c;

   public cap(cfz $$0) {
      this.a = $$0;
   }

   @Override
   public boolean b() {
      aqu $$0 = (aqu)this.a.P_();
      boolean $$1 = $$0 != null && !$$0.N_() && !$$0.ga().b && !$$0.bf() && !$$0.az;
      return !this.a.gm() && $$1 && this.a.gA();
   }

   @Override
   public boolean Q_() {
      return !this.c;
   }

   @Override
   public void d() {
      this.b = (aqu)this.a.P_();
      this.c = false;
   }

   @Override
   public void a() {
      if (!this.c && !this.a.x() && !this.a.fY()) {
         if (this.a.cL().c(this.b.cL())) {
            this.c = this.a.b(this.b);
         }
      }
   }
}
