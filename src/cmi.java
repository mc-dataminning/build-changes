public abstract class cmi extends bqa {
   protected static final aja<Integer> f = aje.a(cmi.class, ajc.b);
   protected static final aja<Integer> g = aje.a(cmi.class, ajc.b);
   protected static final aja<Float> h = aje.a(cmi.class, ajc.d);

   public cmi(bqg<?> $$0, czg $$1) {
      super($$0, $$1);
   }

   @Override
   public boolean a(boy $$0, float $$1) {
      if (this.dM().B || this.dH()) {
         return true;
      } else if (this.b($$0)) {
         return false;
      } else {
         this.n(-this.P());
         this.d(10);
         this.bt();
         this.b(this.N() + $$1 * 10.0F);
         this.a(dub.o, $$0.d());
         boolean $$2 = $$0.d() instanceof cka && ((cka)$$0.d()).ga().d;
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

   boolean d(boy $$0) {
      return false;
   }

   public void b(crn $$0) {
      this.al();
      if (this.dM().aa().b(czc.i)) {
         crs $$1 = new crs($$0);
         $$1.b(jr.d, this.af());
         this.b($$1);
      }
   }

   @Override
   protected void a(aje.a $$0) {
      $$0.a(f, 0);
      $$0.a(g, 1);
      $$0.a(h, 0.0F);
   }

   public void d(int $$0) {
      this.an.a(f, $$0);
   }

   public void n(int $$0) {
      this.an.a(g, $$0);
   }

   public void b(float $$0) {
      this.an.a(h, $$0);
   }

   public float N() {
      return this.an.a(h);
   }

   public int O() {
      return this.an.a(f);
   }

   public int P() {
      return this.an.a(g);
   }

   protected void a(boy $$0) {
      this.b(this.ag_());
   }

   abstract crn ag_();
}
