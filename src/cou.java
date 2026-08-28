public abstract class cou extends bsh {
   protected static final ajp<Integer> f = ajt.a(cou.class, ajr.b);
   protected static final ajp<Integer> g = ajt.a(cou.class, ajr.b);
   protected static final ajp<Float> h = ajt.a(cou.class, ajr.d);

   public cou(bsn<?> $$0, dcg $$1) {
      super($$0, $$1);
   }

   @Override
   public boolean a(bra $$0, float $$1) {
      if (this.dR().B || this.dM()) {
         return true;
      } else if (this.b($$0)) {
         return false;
      } else {
         this.m(-this.P());
         this.d(10);
         this.bx();
         this.b(this.N() + $$1 * 10.0F);
         this.a(dxh.o, $$0.d());
         boolean $$2 = $$0.d() instanceof cml && ((cml)$$0.d()).gb().d;
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

   boolean d(bra $$0) {
      return false;
   }

   public void b(cty $$0) {
      this.ap();
      if (this.dR().ab().b(dcc.i)) {
         cud $$1 = new cud($$0);
         $$1.b(kn.g, this.aj());
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

   protected void a(bra $$0) {
      this.b(this.ag_());
   }

   abstract cty ag_();
}
