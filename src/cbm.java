public class cbm extends cbh {
   private final cgx a;
   private ari b;
   private boolean c;

   public cbm(cgx $$0) {
      this.a = $$0;
   }

   @Override
   public boolean b() {
      ari $$0 = (ari)this.a.R_();
      boolean $$1 = $$0 != null && !$$0.P_() && !$$0.gd().b && !$$0.bi() && !$$0.aw;
      return !this.a.gp() && $$1 && this.a.gF();
   }

   @Override
   public boolean S_() {
      return !this.c;
   }

   @Override
   public void d() {
      this.b = (ari)this.a.R_();
      this.c = false;
   }

   @Override
   public void a() {
      if (!this.c && !this.a.y() && !this.a.K_()) {
         if (this.a.cO().c(this.b.cO())) {
            this.c = this.a.b(this.b);
         }
      }
   }
}
