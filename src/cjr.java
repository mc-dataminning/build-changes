public abstract class cjr extends bnq {
   protected static final aie<Integer> f = aih.a(cjr.class, aig.b);
   protected static final aie<Integer> g = aih.a(cjr.class, aig.b);
   protected static final aie<Float> h = aih.a(cjr.class, aig.d);

   public cjr(bnw<?> $$0, cvr $$1) {
      super($$0, $$1);
   }

   @Override
   public boolean a(bmp $$0, float $$1) {
      if (this.dM().B || this.dH()) {
         return true;
      } else if (this.b($$0)) {
         return false;
      } else {
         this.n(-this.P());
         this.d(10);
         this.bq();
         this.b(this.N() + $$1 * 10.0F);
         this.a(dpw.o, $$0.d());
         boolean $$2 = $$0.d() instanceof chl && ((chl)$$0.d()).fU().d;
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

   boolean d(bmp $$0) {
      return false;
   }

   public void b(coy $$0) {
      this.al();
      if (this.dM().Z().b(cvn.i)) {
         cpd $$1 = new cpd($$0);
         if (this.ae()) {
            $$1.a(this.af());
         }

         this.b($$1);
      }
   }

   @Override
   protected void c_() {
      this.am.a(f, 0);
      this.am.a(g, 1);
      this.am.a(h, 0.0F);
   }

   public void d(int $$0) {
      this.am.b(f, $$0);
   }

   public void n(int $$0) {
      this.am.b(g, $$0);
   }

   public void b(float $$0) {
      this.am.b(h, $$0);
   }

   public float N() {
      return this.am.b(h);
   }

   public int O() {
      return this.am.b(f);
   }

   public int P() {
      return this.am.b(g);
   }

   protected void a(bmp $$0) {
      this.b(this.ai_());
   }

   abstract coy ai_();
}
