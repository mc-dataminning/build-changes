public abstract class cqv extends btz {
   protected static final akk<Integer> f = ako.a(cqv.class, akm.b);
   protected static final akk<Integer> g = ako.a(cqv.class, akm.b);
   protected static final akk<Float> h = ako.a(cqv.class, akm.d);

   public cqv(bug<?> $$0, dev $$1) {
      super($$0, $$1);
   }

   @Override
   public boolean a(bsp $$0, float $$1) {
      if (this.dX().C || this.dS()) {
         return true;
      } else if (this.b($$0)) {
         return false;
      } else {
         this.m(-this.S());
         this.d(10);
         this.bE();
         this.b(this.Q() + $$1 * 10.0F);
         this.a(eaa.o, $$0.d());
         boolean $$2 = $$0.d() instanceof coh && ((coh)$$0.d()).gl().d;
         if (($$2 || !(this.Q() > 40.0F)) && !this.d($$0)) {
            if ($$2) {
               this.au();
            }
         } else {
            this.a($$0);
         }

         return true;
      }
   }

   boolean d(bsp $$0) {
      return false;
   }

   @Override
   public boolean a(den $$0) {
      return $$0.b() instanceof bux && !this.dX().ac().b(der.c);
   }

   public void b(cvt $$0) {
      this.at();
      if (this.dX().ac().b(der.i)) {
         cvx $$1 = new cvx($$0);
         $$1.b(kt.g, this.an());
         this.b($$1);
      }
   }

   @Override
   protected void a(ako.a $$0) {
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

   protected void a(bsp $$0) {
      this.b(this.al_());
   }

   @Override
   public int bY() {
      return 10;
   }

   abstract cvt al_();
}
