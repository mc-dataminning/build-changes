public abstract class cpe extends bsq {
   protected static final ajv<Integer> f = ajz.a(cpe.class, ajx.b);
   protected static final ajv<Integer> g = ajz.a(cpe.class, ajx.b);
   protected static final ajv<Float> h = ajz.a(cpe.class, ajx.d);

   public cpe(bsw<?> $$0, dcu $$1) {
      super($$0, $$1);
   }

   @Override
   public boolean a(brj $$0, float $$1) {
      if (this.dQ().B || this.dL()) {
         return true;
      } else if (this.b($$0)) {
         return false;
      } else {
         this.m(-this.P());
         this.d(10);
         this.bw();
         this.b(this.N() + $$1 * 10.0F);
         this.a(dxw.o, $$0.d());
         boolean $$2 = $$0.d() instanceof cmv && ((cmv)$$0.d()).ga().d;
         if (($$2 || !(this.N() > 40.0F)) && !this.d($$0)) {
            if ($$2) {
               this.aq();
            }
         } else {
            this.a($$0);
         }

         return true;
      }
   }

   boolean d(brj $$0) {
      return false;
   }

   public void b(cuj $$0) {
      this.ap();
      if (this.dQ().ab().b(dcq.i)) {
         cuo $$1 = new cuo($$0);
         $$1.b(kq.g, this.aj());
         this.b($$1);
      }
   }

   @Override
   protected void a(ajz.a $$0) {
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

   protected void a(brj $$0) {
      this.b(this.ag_());
   }

   abstract cuj ag_();
}
