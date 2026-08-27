public class ccg extends cbx {
   public ccg(bik<? extends ccg> $$0, cpk $$1) {
      super($$0, $$1);
   }

   public ccg(cpk $$0, biw $$1, double $$2, double $$3, double $$4) {
      super(bik.aM, $$1, $$2, $$3, $$4, $$0);
   }

   public ccg(cpk $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
      super(bik.aM, $$1, $$2, $$3, $$4, $$5, $$6, $$0);
   }

   @Override
   protected void a(ehc $$0) {
      super.a($$0);
      if (!this.dK().B) {
         big $$1 = $$0.a();
         big $$2 = this.v();
         int $$3 = $$1.ax();
         $$1.g(5);
         if (!$$1.a(this.dL().a((cbx)this, $$2), 5.0F)) {
            $$1.h($$3);
         } else if ($$2 instanceof biw) {
            this.a((biw)$$2, $$1);
         }
      }
   }

   @Override
   protected void a(ehb $$0) {
      super.a($$0);
      if (!this.dK().B) {
         big $$1 = this.v();
         if (!($$1 instanceof biy) || this.dK().X().b(cpg.c)) {
            gv $$2 = $$0.a().a($$0.b());
            if (this.dK().t($$2)) {
               this.dK().b($$2, cry.a(this.dK(), $$2));
            }
         }
      }
   }

   @Override
   protected void a(ehd $$0) {
      super.a($$0);
      if (!this.dK().B) {
         this.ak();
      }
   }

   @Override
   public boolean br() {
      return false;
   }

   @Override
   public boolean a(bhe $$0, float $$1) {
      return false;
   }
}
