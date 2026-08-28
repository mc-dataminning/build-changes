public abstract class cuo extends bwi {
   protected static final akj<Integer> e = akn.a(cuo.class, akl.b);
   protected static final akj<Integer> f = akn.a(cuo.class, akl.b);
   protected static final akj<Float> g = akn.a(cuo.class, akl.d);

   public cuo(bwr<?> $$0, djh $$1) {
      super($$0, $$1);
   }

   @Override
   public boolean b(bux $$0) {
      return true;
   }

   @Override
   public boolean a(arq $$0, bux $$1, float $$2) {
      if (this.dP()) {
         return true;
      } else if (this.d($$1)) {
         return false;
      } else {
         boolean var10000;
         label32: {
            this.l(-this.I());
            this.d(10);
            this.bA();
            this.b(this.G() + $$2 * 10.0F);
            this.a(efo.o, $$1.d());
            if ($$1.d() instanceof crj $$3 && $$3.gj().d) {
               var10000 = true;
               break label32;
            }

            var10000 = false;
         }

         boolean $$4 = var10000;
         if (($$4 || !(this.G() > 40.0F)) && !this.e($$1)) {
            if ($$4) {
               this.aq();
            }
         } else {
            this.a($$0, $$1);
         }

         return true;
      }
   }

   boolean e(bux $$0) {
      return false;
   }

   @Override
   public boolean a(dja $$0) {
      return $$0.c() instanceof bxl && !$$0.a().O().c(djd.d);
   }

   public void a(arq $$0, czg $$1) {
      this.c($$0);
      if ($$0.O().c(djd.j)) {
         czk $$2 = new czk($$1);
         $$2.b(kk.g, this.ak());
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

   public float G() {
      return this.al.a(g);
   }

   public int H() {
      return this.al.a(e);
   }

   public int I() {
      return this.al.a(f);
   }

   protected void a(arq $$0, bux $$1) {
      this.a($$0, this.o());
   }

   @Override
   public int bV() {
      return 10;
   }

   protected abstract czg o();
}
