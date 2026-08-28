public abstract class bus extends bum {
   protected static final float bX = 0.0F;

   protected bus(btv<? extends bus> $$0, deg $$1) {
      super($$0, $$1);
   }

   public float c(je $$0) {
      return this.a($$0, this.dS());
   }

   public float a(je $$0, dej $$1) {
      return 0.0F;
   }

   @Override
   public boolean a(deh $$0, btu $$1) {
      return this.a(this.ds(), $$0) >= 0.0F;
   }

   public boolean gl() {
      return !this.P().m();
   }

   public boolean gm() {
      if (this.bB.a(cdn.Z)) {
         return this.bB.c(cdn.Z).isPresent();
      } else {
         for (ccv $$0 : this.bS.b()) {
            if ($$0.h() && $$0.k() instanceof cca) {
               return true;
            }
         }

         return false;
      }
   }

   protected boolean gn() {
      return true;
   }

   @Override
   public void b(bto $$0) {
      super.b($$0);
      if (this.gn() && !this.gm()) {
         this.bS.b(cbh.a.a);
         float $$1 = 2.0F;
         float $$2 = this.f($$0);
         eys $$3 = new eys($$0.dx() - this.dx(), $$0.dz() - this.dz(), $$0.dD() - this.dD()).d().c((double)Math.max($$2 - 2.0F, 0.0F));
         this.P().a(this.dx() + $$3.d, this.dz() + $$3.e, this.dD() + $$3.f, this.go());
      }
   }

   @Override
   public boolean a(bto $$0, float $$1) {
      this.a($$0.ds(), 5);
      return true;
   }

   protected double go() {
      return 1.0;
   }
}
