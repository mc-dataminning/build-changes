public abstract class cgd extends bkv {
   protected static final afs<Integer> f = afv.a(cgd.class, afu.b);
   protected static final afs<Integer> g = afv.a(cgd.class, afu.b);
   protected static final afs<Float> h = afv.a(cgd.class, afu.d);

   public cgd(bkz<?> $$0, csf $$1) {
      super($$0, $$1);
   }

   @Override
   public boolean a(bjt $$0, float $$1) {
      if (this.dN().B || this.dI()) {
         return true;
      } else if (this.b($$0)) {
         return false;
      } else {
         this.m(-this.P());
         this.d(10);
         this.bq();
         this.b(this.N() + $$1 * 10.0F);
         this.a(dlx.o, $$0.d());
         boolean $$2 = $$0.d() instanceof cdz && ((cdz)$$0.d()).fU().d;
         if (($$2 || !(this.N() > 40.0F)) && (!$$2 || !this.ai_())) {
            if ($$2) {
               this.am();
            }
         } else {
            this.a($$0);
         }

         return true;
      }
   }

   boolean ai_() {
      return false;
   }

   public void b(clj $$0) {
      this.al();
      if (this.dN().Y().b(csb.i)) {
         clo $$1 = new clo($$0);
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

   protected void a(bjt $$0) {
      this.b(this.ah_());
   }

   abstract clj ah_();
}
