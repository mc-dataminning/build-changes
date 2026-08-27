public class bqg extends bqb {
   private final bvo a;
   private aks b;
   private boolean c;

   public bqg(bvo $$0) {
      this.a = $$0;
   }

   @Override
   public boolean a() {
      aks $$0 = (aks)this.a.O_();
      boolean $$1 = $$0 != null && !$$0.M_() && !$$0.fS().b && !$$0.aY() && !$$0.aA;
      return !this.a.gd() && $$1 && this.a.gm();
   }

   @Override
   public boolean P_() {
      return !this.c;
   }

   @Override
   public void c() {
      this.b = (aks)this.a.O_();
      this.c = false;
   }

   @Override
   public void e() {
      if (!this.c && !this.a.y() && !this.a.fR()) {
         if (this.a.cH().c(this.b.cH())) {
            this.c = this.a.b(this.b);
         }
      }
   }
}
