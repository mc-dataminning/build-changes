public abstract class chm extends blu {
   protected static final agm<Integer> f = agp.a(chm.class, ago.b);
   protected static final agm<Integer> g = agp.a(chm.class, ago.b);
   protected static final agm<Float> h = agp.a(chm.class, ago.d);

   public chm(bly<?> $$0, cto $$1) {
      super($$0, $$1);
   }

   @Override
   public boolean a(bks $$0, float $$1) {
      if (this.dM().B || this.dH()) {
         return true;
      } else if (this.b($$0)) {
         return false;
      } else {
         this.m(-this.P());
         this.d(10);
         this.bq();
         this.b(this.N() + $$1 * 10.0F);
         this.a(dnq.o, $$0.d());
         boolean $$2 = $$0.d() instanceof cfh && ((cfh)$$0.d()).fT().d;
         if (($$2 || !(this.N() > 40.0F)) && !this.d($$0)) {
            if ($$2) {
               this.am();
            }
         } else {
            this.a($$0);
         }

         return true;
      }
   }

   boolean d(bks $$0) {
      return false;
   }

   public void b(cms $$0) {
      this.al();
      if (this.dM().Z().b(ctk.i)) {
         cmx $$1 = new cmx($$0);
         if (this.ae()) {
            $$1.a(this.af());
         }

         this.b($$1);
      }
   }

   @Override
   protected void c_() {
      this.an.a(f, 0);
      this.an.a(g, 1);
      this.an.a(h, 0.0F);
   }

   public void d(int $$0) {
      this.an.b(f, $$0);
   }

   public void m(int $$0) {
      this.an.b(g, $$0);
   }

   public void b(float $$0) {
      this.an.b(h, $$0);
   }

   public float N() {
      return this.an.b(h);
   }

   public int O() {
      return this.an.b(f);
   }

   public int P() {
      return this.an.b(g);
   }

   protected void a(bks $$0) {
      this.b(this.ah_());
   }

   abstract cms ah_();
}
