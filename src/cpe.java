public abstract class cpe extends bss {
   protected static final akj<Integer> f = akn.a(cpe.class, akl.b);
   protected static final akj<Integer> g = akn.a(cpe.class, akl.b);
   protected static final akj<Float> h = akn.a(cpe.class, akl.d);

   public cpe(bsy<?> $$0, dbw $$1) {
      super($$0, $$1);
   }

   @Override
   public boolean a(brl $$0, float $$1) {
      if (this.dP().B || this.dK()) {
         return true;
      } else if (this.b($$0)) {
         return false;
      } else {
         this.n(-this.P());
         this.d(10);
         this.bv();
         this.b(this.N() + $$1 * 10.0F);
         this.a(dwt.o, $$0.d());
         boolean $$2 = $$0.d() instanceof cmv && ((cmv)$$0.d()).gd().d;
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

   boolean d(brl $$0) {
      return false;
   }

   public void b(cui $$0) {
      this.an();
      if (this.dP().ab().b(dbs.i)) {
         cun $$1 = new cun($$0);
         $$1.b(km.f, this.ah());
         this.b($$1);
      }
   }

   @Override
   protected void a(akn.a $$0) {
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

   protected void a(brl $$0) {
      this.b(this.ah_());
   }

   abstract cui ah_();
}
