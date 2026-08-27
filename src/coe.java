public abstract class coe extends bru {
   protected static final ajr<Integer> f = ajv.a(coe.class, ajt.b);
   protected static final ajr<Integer> g = ajv.a(coe.class, ajt.b);
   protected static final ajr<Float> h = ajv.a(coe.class, ajt.d);

   public coe(bsa<?> $$0, dax $$1) {
      super($$0, $$1);
   }

   @Override
   public boolean a(bqn $$0, float $$1) {
      if (this.dP().B || this.dK()) {
         return true;
      } else if (this.b($$0)) {
         return false;
      } else {
         this.n(-this.P());
         this.d(10);
         this.bv();
         this.b(this.N() + $$1 * 10.0F);
         this.a(dvu.o, $$0.d());
         boolean $$2 = $$0.d() instanceof clw && ((clw)$$0.d()).gd().d;
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

   boolean d(bqn $$0) {
      return false;
   }

   public void b(ctj $$0) {
      this.an();
      if (this.dP().aa().b(dat.i)) {
         cto $$1 = new cto($$0);
         $$1.b(kb.f, this.ah());
         this.b($$1);
      }
   }

   @Override
   protected void a(ajv.a $$0) {
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

   protected void a(bqn $$0) {
      this.b(this.ag_());
   }

   abstract ctj ag_();
}
