public abstract class cre extends bui {
   protected static final ako<Integer> f = aks.a(cre.class, akq.b);
   protected static final ako<Integer> g = aks.a(cre.class, akq.b);
   protected static final ako<Float> h = aks.a(cre.class, akq.d);

   public cre(bup<?> $$0, dff $$1) {
      super($$0, $$1);
   }

   @Override
   public boolean a(bsy $$0, float $$1) {
      if (this.dY().C || this.dT()) {
         return true;
      } else if (this.b($$0)) {
         return false;
      } else {
         this.m(-this.T());
         this.d(10);
         this.bF();
         this.b(this.R() + $$1 * 10.0F);
         this.a(eak.o, $$0.d());
         boolean $$2 = $$0.d() instanceof cor && ((cor)$$0.d()).gm().d;
         if (($$2 || !(this.R() > 40.0F)) && !this.d($$0)) {
            if ($$2) {
               this.av();
            }
         } else {
            this.a($$0);
         }

         return true;
      }
   }

   boolean d(bsy $$0) {
      return false;
   }

   @Override
   public boolean a(dex $$0) {
      return $$0.b() instanceof bvg && !this.dY().ac().b(dfb.c);
   }

   public void b(cwb $$0) {
      this.au();
      if (this.dY().ac().b(dfb.i)) {
         cwf $$1 = new cwf($$0);
         $$1.b(ku.g, this.ao());
         this.b($$1);
      }
   }

   @Override
   protected void a(aks.a $$0) {
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

   protected void a(bsy $$0) {
      this.b(this.al_());
   }

   @Override
   public int bZ() {
      return 10;
   }

   abstract cwb al_();
}
