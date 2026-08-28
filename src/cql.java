public abstract class cql extends btr {
   protected static final akh<Integer> f = akl.a(cql.class, akj.b);
   protected static final akh<Integer> g = akl.a(cql.class, akj.b);
   protected static final akh<Float> h = akl.a(cql.class, akj.d);

   public cql(bty<?> $$0, dej $$1) {
      super($$0, $$1);
   }

   @Override
   public boolean a(bsj $$0, float $$1) {
      if (this.dS().B || this.dN()) {
         return true;
      } else if (this.b($$0)) {
         return false;
      } else {
         this.m(-this.T());
         this.d(10);
         this.bA();
         this.b(this.R() + $$1 * 10.0F);
         this.a(dzp.o, $$0.d());
         boolean $$2 = $$0.d() instanceof cnx && ((cnx)$$0.d()).ge().d;
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

   boolean d(bsj $$0) {
      return false;
   }

   @Override
   public boolean a(deb $$0) {
      return $$0.b() instanceof bup && !this.dS().ac().b(def.c);
   }

   public void b(cvn $$0) {
      this.ar();
      if (this.dS().ac().b(def.i)) {
         cvs $$1 = new cvs($$0);
         $$1.b(ks.g, this.al());
         this.b($$1);
      }
   }

   @Override
   protected void a(akl.a $$0) {
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

   protected void a(bsj $$0) {
      this.b(this.ak_());
   }

   @Override
   public int bU() {
      return 10;
   }

   abstract cvn ak_();
}
