public class bvk extends bvf {
   private final cau a;
   private aox b;
   private boolean c;

   public bvk(cau $$0) {
      this.a = $$0;
   }

   @Override
   public boolean a() {
      aox $$0 = (aox)this.a.R_();
      boolean $$1 = $$0 != null && !$$0.P_() && !$$0.fU().b && !$$0.aZ() && !$$0.az;
      return !this.a.gg() && $$1 && this.a.gp();
   }

   @Override
   public boolean S_() {
      return !this.c;
   }

   @Override
   public void c() {
      this.b = (aox)this.a.R_();
      this.c = false;
   }

   @Override
   public void e() {
      if (!this.c && !this.a.A() && !this.a.fU()) {
         if (this.a.cH().c(this.b.cH())) {
            this.c = this.a.b(this.b);
         }
      }
   }
}
