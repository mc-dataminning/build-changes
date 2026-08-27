public abstract class chg extends blp {
   protected static final agj<Integer> f = agm.a(chg.class, agl.b);
   protected static final agj<Integer> g = agm.a(chg.class, agl.b);
   protected static final agj<Float> h = agm.a(chg.class, agl.d);

   public chg(blt<?> $$0, cti $$1) {
      super($$0, $$1);
   }

   @Override
   public boolean a(bkn $$0, float $$1) {
      if (this.dM().B || this.dH()) {
         return true;
      } else if (this.b($$0)) {
         return false;
      } else {
         this.m(-this.P());
         this.d(10);
         this.bq();
         this.b(this.N() + $$1 * 10.0F);
         this.a(dnk.o, $$0.d());
         boolean $$2 = $$0.d() instanceof cfb && ((cfb)$$0.d()).fT().d;
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

   boolean d(bkn $$0) {
      return false;
   }

   public void b(cmm $$0) {
      this.al();
      if (this.dM().Z().b(cte.i)) {
         cmr $$1 = new cmr($$0);
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

   protected void a(bkn $$0) {
      this.b(this.ah_());
   }

   abstract cmm ah_();
}
