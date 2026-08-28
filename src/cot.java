public abstract class cot extends bsg {
   protected static final ajp<Integer> f = ajt.a(cot.class, ajr.b);
   protected static final ajp<Integer> g = ajt.a(cot.class, ajr.b);
   protected static final ajp<Float> h = ajt.a(cot.class, ajr.d);

   public cot(bsm<?> $$0, dcf $$1) {
      super($$0, $$1);
   }

   @Override
   public boolean a(bqz $$0, float $$1) {
      if (this.dQ().B || this.dL()) {
         return true;
      } else if (this.b($$0)) {
         return false;
      } else {
         this.m(-this.P());
         this.d(10);
         this.bw();
         this.b(this.N() + $$1 * 10.0F);
         this.a(dxg.o, $$0.d());
         boolean $$2 = $$0.d() instanceof cmk && ((cmk)$$0.d()).ga().d;
         if (($$2 || !(this.N() > 40.0F)) && !this.d($$0)) {
            if ($$2) {
               this.ap();
            }
         } else {
            this.a($$0);
         }

         return true;
      }
   }

   boolean d(bqz $$0) {
      return false;
   }

   public void b(ctx $$0) {
      this.ao();
      if (this.dQ().ab().b(dcb.i)) {
         cuc $$1 = new cuc($$0);
         $$1.b(kn.g, this.ai());
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

   protected void a(bqz $$0) {
      this.b(this.ag_());
   }

   abstract ctx ag_();
}
