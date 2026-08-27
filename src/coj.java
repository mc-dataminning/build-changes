public abstract class coj extends brv {
   protected static final ajy<Integer> f = akc.a(coj.class, aka.b);
   protected static final ajy<Integer> g = akc.a(coj.class, aka.b);
   protected static final ajy<Float> h = akc.a(coj.class, aka.d);

   public coj(bsb<?> $$0, dca $$1) {
      super($$0, $$1);
   }

   @Override
   public boolean a(bqt $$0, float $$1) {
      if (this.dU().C || this.dP()) {
         return true;
      } else if (this.b($$0)) {
         return false;
      } else {
         this.n(-this.P());
         this.d(10);
         this.bA();
         this.b(this.M() + $$1 * 10.0F);
         this.a(dxv.o, $$0.d());
         boolean $$2 = $$0.d() instanceof cly && ((cly)$$0.d()).gm().d;
         if (($$2 || !(this.M() > 40.0F)) && !this.d($$0)) {
            if ($$2) {
               this.ao();
            }
         } else {
            this.a($$0);
         }

         return true;
      }
   }

   boolean d(bqt $$0) {
      return false;
   }

   public void b(cuc $$0) {
      this.an();
      if (this.dU().ab().b(dbw.i)) {
         cuh $$1 = new cuh($$0);
         $$1.b(ke.f, this.ah());
         this.b($$1);
      }
   }

   @Override
   protected void a(akc.a $$0) {
      $$0.a(f, 0);
      $$0.a(g, 1);
      $$0.a(h, 0.0F);
   }

   public void d(int $$0) {
      this.as.a(f, $$0);
   }

   public void n(int $$0) {
      this.as.a(g, $$0);
   }

   public void b(float $$0) {
      this.as.a(h, $$0);
   }

   public float M() {
      return this.as.a(h);
   }

   public int O() {
      return this.as.a(f);
   }

   public int P() {
      return this.as.a(g);
   }

   protected void a(bqt $$0) {
      this.b(this.ah_());
   }

   abstract cuc ah_();
}
