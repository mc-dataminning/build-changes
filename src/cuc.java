public abstract class cuc extends bwd {
   protected static final akj<Integer> e = akn.a(cuc.class, akl.b);
   protected static final akj<Integer> f = akn.a(cuc.class, akl.b);
   protected static final akj<Float> g = akn.a(cuc.class, akl.d);

   public cuc(bwm<?> $$0, div $$1) {
      super($$0, $$1);
   }

   @Override
   public boolean b(bus $$0) {
      return true;
   }

   @Override
   public boolean a(arq $$0, bus $$1, float $$2) {
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
            this.a(eez.o, $$1.d());
            if ($$1.d() instanceof cqy $$3 && $$3.gj().d) {
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

   boolean e(bus $$0) {
      return false;
   }

   @Override
   public boolean a(dio $$0) {
      return $$0.c() instanceof bxe && !$$0.a().O().c(dir.c);
   }

   public void a(arq $$0, cyu $$1) {
      this.c($$0);
      if ($$0.O().c(dir.i)) {
         cyy $$2 = new cyy($$1);
         $$2.b(kj.g, this.an());
         this.a($$0, $$2);
      }
   }

   @Override
   protected void a(akn.a $$0) {
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

   protected void a(arq $$0, bus $$1) {
      this.a($$0, this.o());
   }

   @Override
   public int bX() {
      return 10;
   }

   protected abstract cyu o();
}
