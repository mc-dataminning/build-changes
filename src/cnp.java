public abstract class cnp extends brh {
   protected static final ajm<Integer> f = ajq.a(cnp.class, ajo.b);
   protected static final ajm<Integer> g = ajq.a(cnp.class, ajo.b);
   protected static final ajm<Float> h = ajq.a(cnp.class, ajo.d);

   public cnp(brn<?> $$0, dad $$1) {
      super($$0, $$1);
   }

   @Override
   public boolean a(bqf $$0, float $$1) {
      if (this.dN().B || this.dI()) {
         return true;
      } else if (this.b($$0)) {
         return false;
      } else {
         this.n(-this.P());
         this.d(10);
         this.bt();
         this.b(this.N() + $$1 * 10.0F);
         this.a(dva.o, $$0.d());
         boolean $$2 = $$0.d() instanceof clh && ((clh)$$0.d()).gb().d;
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

   boolean d(bqf $$0) {
      return false;
   }

   public void b(csu $$0) {
      this.al();
      if (this.dN().aa().b(czz.i)) {
         csz $$1 = new csz($$0);
         $$1.b(ka.f, this.af());
         this.b($$1);
      }
   }

   @Override
   protected void a(ajq.a $$0) {
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

   protected void a(bqf $$0) {
      this.b(this.ag_());
   }

   abstract csu ag_();
}
