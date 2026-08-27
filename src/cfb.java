public abstract class cfb extends bjt {
   protected static final afc<Integer> f = aff.a(cfb.class, afe.b);
   protected static final afc<Integer> g = aff.a(cfb.class, afe.b);
   protected static final afc<Float> h = aff.a(cfb.class, afe.d);

   public cfb(bjx<?> $$0, cqz $$1) {
      super($$0, $$1);
   }

   @Override
   public boolean a(bir $$0, float $$1) {
      if (this.dL().B || this.dG()) {
         return true;
      } else if (this.b($$0)) {
         return false;
      } else {
         this.m(-this.O());
         this.d(10);
         this.bo();
         this.b(this.M() + $$1 * 10.0F);
         this.a(dkl.o, $$0.d());
         boolean $$2 = $$0.d() instanceof ccx && ((ccx)$$0.d()).fT().d;
         if (($$2 || !(this.M() > 40.0F)) && (!$$2 || !this.ah_())) {
            if ($$2) {
               this.ak();
            }
         } else {
            this.a($$0);
         }

         return true;
      }
   }

   boolean ah_() {
      return false;
   }

   public void b(cke $$0) {
      this.aj();
      if (this.dL().X().b(cqv.h)) {
         ckj $$1 = new ckj($$0);
         if (this.ac()) {
            $$1.a(this.ad());
         }

         this.b($$1);
      }
   }

   @Override
   protected void b_() {
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

   public float M() {
      return this.an.b(h);
   }

   public int N() {
      return this.an.b(f);
   }

   public int O() {
      return this.an.b(g);
   }

   protected void a(bir $$0) {
      this.b(this.ag_());
   }

   abstract cke ag_();
}
