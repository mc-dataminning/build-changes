public abstract class cve extends bwv {
   protected static final akn<Integer> e = akr.a(cve.class, akp.b);
   protected static final akn<Integer> f = akr.a(cve.class, akp.b);
   protected static final akn<Float> g = akr.a(cve.class, akp.d);

   public cve(bxe<?> $$0, djz $$1) {
      super($$0, $$1);
   }

   @Override
   public boolean b(bvk $$0) {
      return true;
   }

   @Override
   public boolean a(aru $$0, bvk $$1, float $$2) {
      if (this.dQ()) {
         return true;
      } else if (this.d($$1)) {
         return false;
      } else {
         boolean var10000;
         label32: {
            this.l(-this.I());
            this.d(10);
            this.bB();
            this.b(this.G() + $$2 * 10.0F);
            this.a(egg.o, $$1.d());
            if ($$1.d() instanceof crz $$3 && $$3.gk().d) {
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

   boolean e(bvk $$0) {
      return false;
   }

   @Override
   public boolean a(djs $$0) {
      return $$0.c() instanceof bxy && !$$0.a().O().c(djv.d);
   }

   public void a(aru $$0, czw $$1) {
      this.c($$0);
      if ($$0.O().c(djv.j)) {
         daa $$2 = new daa($$1);
         $$2.b(kl.g, this.ak());
         this.a($$0, $$2);
      }
   }

   @Override
   protected void a(akr.a $$0) {
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

   protected void a(aru $$0, bvk $$1) {
      this.a($$0, this.o());
   }

   @Override
   public int bW() {
      return 10;
   }

   protected abstract czw o();
}
