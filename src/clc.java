public abstract class clc extends box {
   protected static final aim<Integer> f = aiq.a(clc.class, aio.b);
   protected static final aim<Integer> g = aiq.a(clc.class, aio.b);
   protected static final aim<Float> h = aiq.a(clc.class, aio.d);

   public clc(bpd<?> $$0, cxb $$1) {
      super($$0, $$1);
   }

   @Override
   public boolean a(bnw $$0, float $$1) {
      if (this.dM().B || this.dH()) {
         return true;
      } else if (this.b($$0)) {
         return false;
      } else {
         this.n(-this.P());
         this.d(10);
         this.bt();
         this.b(this.N() + $$1 * 10.0F);
         this.a(drp.o, $$0.d());
         boolean $$2 = $$0.d() instanceof ciu && ((ciu)$$0.d()).ga().d;
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

   boolean d(bnw $$0) {
      return false;
   }

   public void b(cqh $$0) {
      this.al();
      if (this.dM().Z().b(cwx.i)) {
         cqm $$1 = new cqm($$0);
         if (this.ae()) {
            $$1.a(this.af());
         }

         this.b($$1);
      }
   }

   @Override
   protected void a(aiq.a $$0) {
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

   protected void a(bnw $$0) {
      this.b(this.ah_());
   }

   abstract cqh ah_();
}
