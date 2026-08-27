public abstract class chv extends blw {
   protected static final agn<Integer> f = agq.a(chv.class, agp.b);
   protected static final agn<Integer> g = agq.a(chv.class, agp.b);
   protected static final agn<Float> h = agq.a(chv.class, agp.d);

   public chv(bmc<?> $$0, ctx $$1) {
      super($$0, $$1);
   }

   @Override
   public boolean a(bkv $$0, float $$1) {
      if (this.dL().B || this.dG()) {
         return true;
      } else if (this.b($$0)) {
         return false;
      } else {
         this.m(-this.P());
         this.d(10);
         this.bq();
         this.b(this.N() + $$1 * 10.0F);
         this.a(dnz.o, $$0.d());
         boolean $$2 = $$0.d() instanceof cfq && ((cfq)$$0.d()).fT().d;
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

   boolean d(bkv $$0) {
      return false;
   }

   public void b(cnb $$0) {
      this.al();
      if (this.dL().Z().b(ctt.i)) {
         cng $$1 = new cng($$0);
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

   protected void a(bkv $$0) {
      this.b(this.ai_());
   }

   abstract cnb ai_();
}
