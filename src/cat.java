public class cat extends cao {
   private final cgd a;
   private arg b;
   private boolean c;

   public cat(cgd $$0) {
      this.a = $$0;
   }

   @Override
   public boolean a() {
      arg $$0 = (arg)this.a.P_();
      boolean $$1 = $$0 != null && !$$0.N_() && !$$0.gd().b && !$$0.be() && !$$0.aB;
      return !this.a.gq() && $$1 && this.a.gz();
   }

   @Override
   public boolean Q_() {
      return !this.c;
   }

   @Override
   public void c() {
      this.b = (arg)this.a.P_();
      this.c = false;
   }

   @Override
   public void e() {
      if (!this.c && !this.a.y() && !this.a.gd()) {
         if (this.a.cK().c(this.b.cK())) {
            this.c = this.a.b(this.b);
         }
      }
   }
}
