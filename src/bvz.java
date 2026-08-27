public class bvz extends bvu {
   private final cbj a;
   private apb b;
   private boolean c;

   public bvz(cbj $$0) {
      this.a = $$0;
   }

   @Override
   public boolean a() {
      apb $$0 = (apb)this.a.R_();
      boolean $$1 = $$0 != null && !$$0.P_() && !$$0.fW().b && !$$0.aZ() && !$$0.az;
      return !this.a.gl() && $$1 && this.a.gu();
   }

   @Override
   public boolean S_() {
      return !this.c;
   }

   @Override
   public void c() {
      this.b = (apb)this.a.R_();
      this.c = false;
   }

   @Override
   public void e() {
      if (!this.c && !this.a.A() && !this.a.fZ()) {
         if (this.a.cE().c(this.b.cE())) {
            this.c = this.a.b(this.b);
         }
      }
   }
}
