public abstract class cqi extends bto {
   protected static final akg<Integer> f = akk.a(cqi.class, aki.b);
   protected static final akg<Integer> g = akk.a(cqi.class, aki.b);
   protected static final akg<Float> h = akk.a(cqi.class, aki.d);

   public cqi(btv<?> $$0, deg $$1) {
      super($$0, $$1);
   }

   @Override
   public boolean a(bsg $$0, float $$1) {
      if (this.dS().B || this.dN()) {
         return true;
      } else if (this.b($$0)) {
         return false;
      } else {
         this.m(-this.T());
         this.d(10);
         this.bA();
         this.b(this.R() + $$1 * 10.0F);
         this.a(dzl.o, $$0.d());
         boolean $$2 = $$0.d() instanceof cnu && ((cnu)$$0.d()).gd().d;
         if (($$2 || !(this.R() > 40.0F)) && !this.d($$0)) {
            if ($$2) {
               this.as();
            }
         } else {
            this.a($$0);
         }

         return true;
      }
   }

   boolean d(bsg $$0) {
      return false;
   }

   public void b(cvk $$0) {
      this.ar();
      if (this.dS().ac().b(dec.i)) {
         cvp $$1 = new cvp($$0);
         $$1.b(kr.g, this.al());
         this.b($$1);
      }
   }

   @Override
   protected void a(akk.a $$0) {
      $$0.a(f, 0);
      $$0.a(g, 1);
      $$0.a(h, 0.0F);
   }

   public void d(int $$0) {
      this.am.a(f, $$0);
   }

   public void m(int $$0) {
      this.am.a(g, $$0);
   }

   public void b(float $$0) {
      this.am.a(h, $$0);
   }

   public float R() {
      return this.am.a(h);
   }

   public int S() {
      return this.am.a(f);
   }

   public int T() {
      return this.am.a(g);
   }

   protected void a(bsg $$0) {
      this.b(this.aj_());
   }

   @Override
   public int bU() {
      return 10;
   }

   abstract cvk aj_();
}
