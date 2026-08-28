public abstract class cqc extends btj {
   protected static final akg<Integer> f = akk.a(cqc.class, aki.b);
   protected static final akg<Integer> g = akk.a(cqc.class, aki.b);
   protected static final akg<Float> h = akk.a(cqc.class, aki.d);

   public cqc(btq<?> $$0, dds $$1) {
      super($$0, $$1);
   }

   @Override
   public boolean a(bsb $$0, float $$1) {
      if (this.dS().B || this.dN()) {
         return true;
      } else if (this.b($$0)) {
         return false;
      } else {
         this.m(-this.S());
         this.d(10);
         this.bA();
         this.b(this.Q() + $$1 * 10.0F);
         this.a(dyx.o, $$0.d());
         boolean $$2 = $$0.d() instanceof cnp && ((cnp)$$0.d()).gd().d;
         if (($$2 || !(this.Q() > 40.0F)) && !this.d($$0)) {
            if ($$2) {
               this.as();
            }
         } else {
            this.a($$0);
         }

         return true;
      }
   }

   boolean d(bsb $$0) {
      return false;
   }

   public void b(cvg $$0) {
      this.ar();
      if (this.dS().ac().b(ddo.i)) {
         cvl $$1 = new cvl($$0);
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

   public float Q() {
      return this.am.a(h);
   }

   public int R() {
      return this.am.a(f);
   }

   public int S() {
      return this.am.a(g);
   }

   protected void a(bsb $$0) {
      this.b(this.aj_());
   }

   @Override
   public int bU() {
      return 10;
   }

   abstract cvg aj_();
}
