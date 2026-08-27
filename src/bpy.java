public class bpy extends bpt {
   private final bvg a;
   private akl b;
   private boolean c;

   public bpy(bvg $$0) {
      this.a = $$0;
   }

   @Override
   public boolean a() {
      akl $$0 = (akl)this.a.I_();
      boolean $$1 = $$0 != null && !$$0.G_() && !$$0.fR().b && !$$0.aX() && !$$0.aA;
      return !this.a.ga() && $$1 && this.a.gj();
   }

   @Override
   public boolean J_() {
      return !this.c;
   }

   @Override
   public void c() {
      this.b = (akl)this.a.I_();
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
