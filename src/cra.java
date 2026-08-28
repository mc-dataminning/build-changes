public abstract class cra extends bue {
   protected static final akl<Integer> f = akp.a(cra.class, akn.b);
   protected static final akl<Integer> g = akp.a(cra.class, akn.b);
   protected static final akl<Float> h = akp.a(cra.class, akn.d);

   public cra(bul<?> $$0, dfb $$1) {
      super($$0, $$1);
   }

   @Override
   public boolean a(bsu $$0, float $$1) {
      if (this.dX().C || this.dS()) {
         return true;
      } else if (this.b($$0)) {
         return false;
      } else {
         this.m(-this.S());
         this.d(10);
         this.bE();
         this.b(this.Q() + $$1 * 10.0F);
         this.a(eag.o, $$0.d());
         boolean $$2 = $$0.d() instanceof com && ((com)$$0.d()).gl().d;
         if (($$2 || !(this.Q() > 40.0F)) && !this.d($$0)) {
            if ($$2) {
               this.av();
            }
         } else {
            this.a($$0);
         }

         return true;
      }
   }

   boolean d(bsu $$0) {
      return false;
   }

   @Override
   public boolean a(det $$0) {
      return $$0.b() instanceof bvc && !this.dX().ac().b(dex.c);
   }

   public void b(cvx $$0) {
      this.au();
      if (this.dX().ac().b(dex.i)) {
         cwb $$1 = new cwb($$0);
         $$1.b(ku.g, this.ao());
         this.b($$1);
      }
   }

   @Override
   protected void a(akp.a $$0) {
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

   protected void a(bsu $$0) {
      this.b(this.al_());
   }

   @Override
   public int bY() {
      return 10;
   }

   abstract cvx al_();
}
