public abstract class coq extends bsd {
   protected static final ajp<Integer> f = ajt.a(coq.class, ajr.b);
   protected static final ajp<Integer> g = ajt.a(coq.class, ajr.b);
   protected static final ajp<Float> h = ajt.a(coq.class, ajr.d);

   public coq(bsj<?> $$0, dcd $$1) {
      super($$0, $$1);
   }

   @Override
   public boolean a(bqw $$0, float $$1) {
      if (this.dP().B || this.dK()) {
         return true;
      } else if (this.b($$0)) {
         return false;
      } else {
         this.m(-this.P());
         this.d(10);
         this.bv();
         this.b(this.N() + $$1 * 10.0F);
         this.a(dxa.o, $$0.d());
         boolean $$2 = $$0.d() instanceof cmh && ((cmh)$$0.d()).fZ().d;
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

   boolean d(bqw $$0) {
      return false;
   }

   public void b(ctv $$0) {
      this.an();
      if (this.dP().ab().b(dbz.i)) {
         cua $$1 = new cua($$0);
         $$1.b(kn.g, this.ah());
         this.b($$1);
      }
   }

   @Override
   protected void a(ajt.a $$0) {
      $$0.a(f, 0);
      $$0.a(g, 1);
      $$0.a(h, 0.0F);
   }

   public void d(int $$0) {
      this.ao.a(f, $$0);
   }

   public void m(int $$0) {
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

   protected void a(bqw $$0) {
      this.b(this.ag_());
   }

   abstract ctv ag_();
}
