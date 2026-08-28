public abstract class ctw extends bwa {
   protected static final akh<Integer> e = akl.a(ctw.class, akj.b);
   protected static final akh<Integer> f = akl.a(ctw.class, akj.b);
   protected static final akh<Float> g = akl.a(ctw.class, akj.d);

   public ctw(bwj<?> $$0, dip $$1) {
      super($$0, $$1);
   }

   @Override
   public boolean b(bup $$0) {
      return true;
   }

   @Override
   public boolean a(aro $$0, bup $$1, float $$2) {
      if (this.dQ()) {
         return true;
      } else if (this.d($$1)) {
         return false;
      } else {
         boolean var10000;
         label32: {
            this.l(-this.J());
            this.d(10);
            this.bC();
            this.b(this.H() + $$2 * 10.0F);
            this.a(eeo.o, $$1.d());
            if ($$1.d() instanceof cqs $$3 && $$3.gj().d) {
               var10000 = true;
               break label32;
            }

            var10000 = false;
         }

         boolean $$4 = var10000;
         if (($$4 || !(this.H() > 40.0F)) && !this.e($$1)) {
            if ($$4) {
               this.at();
            }
         } else {
            this.a($$0, $$1);
         }

         return true;
      }
   }

   boolean e(bup $$0) {
      return false;
   }

   @Override
   public boolean a(dii $$0) {
      return $$0.c() instanceof bxb && !$$0.a().O().c(dil.c);
   }

   public void a(aro $$0, cyo $$1) {
      this.c($$0);
      if ($$0.O().c(dil.i)) {
         cys $$2 = new cys($$1);
         $$2.b(kj.g, this.an());
         this.a($$0, $$2);
      }
   }

   @Override
   protected void a(akl.a $$0) {
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

   public float H() {
      return this.al.a(g);
   }

   public int I() {
      return this.al.a(e);
   }

   public int J() {
      return this.al.a(f);
   }

   protected void a(aro $$0, bup $$1) {
      this.a($$0, this.o());
   }

   @Override
   public int bX() {
      return 10;
   }

   protected abstract cyo o();
}
