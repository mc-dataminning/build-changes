public class cab extends bzw {
   private final cfl a;
   private aql b;
   private boolean c;

   public cab(cfl $$0) {
      this.a = $$0;
   }

   @Override
   public boolean a() {
      aql $$0 = (aql)this.a.P_();
      boolean $$1 = $$0 != null && !$$0.N_() && !$$0.fZ().b && !$$0.be() && !$$0.aB;
      return !this.a.gn() && $$1 && this.a.gw();
   }

   @Override
   public boolean Q_() {
      return !this.c;
   }

   @Override
   public void c() {
      this.b = (aql)this.a.P_();
      this.c = false;
   }

   @Override
   public void e() {
      if (!this.c && !this.a.y() && !this.a.fZ()) {
         if (this.a.cK().c(this.b.cK())) {
            this.c = this.a.b(this.b);
         }
      }
   }
}
