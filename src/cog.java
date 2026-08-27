public abstract class cog extends brw {
   protected static final ajs<Integer> f = ajw.a(cog.class, aju.b);
   protected static final ajs<Integer> g = ajw.a(cog.class, aju.b);
   protected static final ajs<Float> h = ajw.a(cog.class, aju.d);

   public cog(bsc<?> $$0, daz $$1) {
      super($$0, $$1);
   }

   @Override
   public boolean a(bqp $$0, float $$1) {
      if (this.dP().B || this.dK()) {
         return true;
      } else if (this.b($$0)) {
         return false;
      } else {
         this.n(-this.P());
         this.d(10);
         this.bv();
         this.b(this.N() + $$1 * 10.0F);
         this.a(dvw.o, $$0.d());
         boolean $$2 = $$0.d() instanceof cly && ((cly)$$0.d()).gd().d;
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

   boolean d(bqp $$0) {
      return false;
   }

   public void b(ctl $$0) {
      this.an();
      if (this.dP().aa().b(dav.i)) {
         ctq $$1 = new ctq($$0);
         $$1.b(kb.f, this.ah());
         this.b($$1);
      }
   }

   @Override
   protected void a(ajw.a $$0) {
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

   protected void a(bqp $$0) {
      this.b(this.ah_());
   }

   abstract ctl ah_();
}
