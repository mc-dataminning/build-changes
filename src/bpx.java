public class bpx extends bps {
   private final bvf a;
   private akj b;
   private boolean c;

   public bpx(bvf $$0) {
      this.a = $$0;
   }

   @Override
   public boolean a() {
      akj $$0 = (akj)this.a.I_();
      boolean $$1 = $$0 != null && !$$0.G_() && !$$0.fR().b && !$$0.aX() && !$$0.aA;
      return !this.a.fZ() && $$1 && this.a.gi();
   }

   @Override
   public boolean J_() {
      return !this.c;
   }

   @Override
   public void c() {
      this.b = (akj)this.a.I_();
      this.c = false;
   }

   @Override
   public void e() {
      if (!this.c && !this.a.t() && !this.a.fO()) {
         if (this.a.cG().c(this.b.cG())) {
            this.c = this.a.b(this.b);
         }
      }
   }
}
