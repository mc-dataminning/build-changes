public abstract class cpi extends bsw {
   protected static final akk<Integer> f = ako.a(cpi.class, akm.b);
   protected static final akk<Integer> g = ako.a(cpi.class, akm.b);
   protected static final akk<Float> h = ako.a(cpi.class, akm.d);

   public cpi(btc<?> $$0, dca $$1) {
      super($$0, $$1);
   }

   @Override
   public boolean a(brp $$0, float $$1) {
      if (this.dP().B || this.dK()) {
         return true;
      } else if (this.b($$0)) {
         return false;
      } else {
         this.n(-this.P());
         this.d(10);
         this.bv();
         this.b(this.N() + $$1 * 10.0F);
         this.a(dwx.o, $$0.d());
         boolean $$2 = $$0.d() instanceof cmz && ((cmz)$$0.d()).gd().d;
         if (($$2 || !(this.N() > 40.0F)) && !this.d($$0)) {
            if ($$2) {
               this.ao();
            }
         } else {
            this.a($$0);
         }

         return true;
      }
   }

   boolean d(brp $$0) {
      return false;
   }

   public void b(cum $$0) {
      this.an();
      if (this.dP().ab().b(dbw.i)) {
         cur $$1 = new cur($$0);
         $$1.b(km.g, this.ah());
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
      this.ao.a(f, $$0);
   }

   public void n(int $$0) {
      this.ao.a(g, $$0);
   }

   public void b(float $$0) {
      this.ao.a(h, $$0);
   }

   public float N() {
      return this.ao.a(h);
   }

   public int O() {
      return this.ao.a(f);
   }

   public int P() {
      return this.ao.a(g);
   }

   protected void a(brp $$0) {
      this.b(this.ag_());
   }

   abstract cum ag_();
}
