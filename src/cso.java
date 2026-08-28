public abstract class cso extends bvk {
   protected static final alc<Integer> e = alg.a(cso.class, ale.b);
   protected static final alc<Integer> f = alg.a(cso.class, ale.b);
   protected static final alc<Float> g = alg.a(cso.class, ale.d);

   public cso(bvr<?> $$0, dhi $$1) {
      super($$0, $$1);
   }

   @Override
   public boolean b(bua $$0) {
      return true;
   }

   @Override
   public boolean a(ash $$0, bua $$1, float $$2) {
      if (this.dR()) {
         return true;
      } else if (this.d($$1)) {
         return false;
      } else {
         boolean var10000;
         label32: {
            this.l(-this.O());
            this.d(10);
            this.bD();
            this.b(this.L() + $$2 * 10.0F);
            this.a(ecr.o, $$1.d());
            if ($$1.d() instanceof cpx $$3 && $$3.gj().d) {
               var10000 = true;
               break label32;
            }

            var10000 = false;
         }

         boolean $$4 = var10000;
         if (($$4 || !(this.L() > 40.0F)) && !this.a($$1)) {
            if ($$4) {
               this.at();
            }
         } else {
            this.a($$0, $$1);
         }

         return true;
      }
   }

   boolean a(bua $$0) {
      return false;
   }

   @Override
   public boolean a(dha $$0) {
      return $$0.c() instanceof bwi && !$$0.a().N().b(dhe.c);
   }

   public void a(ash $$0, cxl $$1) {
      this.c($$0);
      if ($$0.N().b(dhe.i)) {
         cxp $$2 = new cxp($$1);
         $$2.b(ku.g, this.an());
         this.a($$0, $$2);
      }
   }

   @Override
   protected void a(alg.a $$0) {
      $$0.a(e, 0);
      $$0.a(f, 1);
      $$0.a(g, 0.0F);
   }

   public void d(int $$0) {
      this.al.a(e, $$0);
   }

   public void l(int $$0) {
      this.al.a(f, $$0);
   }

   public void b(float $$0) {
      this.al.a(g, $$0);
   }

   public float L() {
      return this.al.a(g);
   }

   public int N() {
      return this.al.a(e);
   }

   public int O() {
      return this.al.a(f);
   }

   protected void a(ash $$0, bua $$1) {
      this.a($$0, this.u());
   }

   @Override
   public int bX() {
      return 10;
   }

   protected abstract cxl u();
}
