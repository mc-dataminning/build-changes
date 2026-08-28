public class cbh extends cbc {
   private final cgs a;
   private arh b;
   private boolean c;

   public cbh(cgs $$0) {
      this.a = $$0;
   }

   @Override
   public boolean b() {
      arh $$0 = (arh)this.a.R_();
      boolean $$1 = $$0 != null && !$$0.P_() && !$$0.gd().b && !$$0.bi() && !$$0.aw;
      return !this.a.go() && $$1 && this.a.gE();
   }

   @Override
   public boolean S_() {
      return !this.c;
   }

   @Override
   public void d() {
      this.b = (arh)this.a.R_();
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
