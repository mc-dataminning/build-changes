public abstract class csf extends bvb {
   protected static final aks<Integer> e = akw.a(csf.class, aku.b);
   protected static final aks<Integer> f = akw.a(csf.class, aku.b);
   protected static final aks<Float> g = akw.a(csf.class, aku.d);

   public csf(bvi<?> $$0, dgz $$1) {
      super($$0, $$1);
   }

   @Override
   public boolean b(btr $$0) {
      return true;
   }

   @Override
   public boolean a(arx $$0, btr $$1, float $$2) {
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
            this.a(eck.o, $$1.d());
            if ($$1.d() instanceof cpo $$3 && $$3.gj().d) {
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

   boolean a(btr $$0) {
      return false;
   }

   @Override
   public boolean a(dgr $$0) {
      return $$0.c() instanceof bvz && !$$0.a().O().b(dgv.c);
   }

   public void a(arx $$0, cxc $$1) {
      this.c($$0);
      if ($$0.O().b(dgv.i)) {
         cxg $$2 = new cxg($$1);
         $$2.b(ku.g, this.an());
         this.a($$0, $$2);
      }
   }

   @Override
   protected void a(akw.a $$0) {
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

   protected void a(arx $$0, btr $$1) {
      this.a($$0, this.u());
   }

   @Override
   public int bX() {
      return 10;
   }

   protected abstract cxc u();
}
