public abstract class crp extends bum {
   protected static final ajy<Integer> e = akc.a(crp.class, aka.b);
   protected static final ajy<Integer> f = akc.a(crp.class, aka.b);
   protected static final ajy<Float> g = akc.a(crp.class, aka.d);

   public crp(but<?> $$0, dgj $$1) {
      super($$0, $$1);
   }

   @Override
   public boolean b(btc $$0) {
      return true;
   }

   @Override
   public boolean a(ard $$0, btc $$1, float $$2) {
      if (this.dQ()) {
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
            this.a(ebu.o, $$1.d());
            if ($$1.d() instanceof coy $$3 && $$3.gj().d) {
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

   boolean a(btc $$0) {
      return false;
   }

   @Override
   public boolean a(dgb $$0) {
      return $$0.c() instanceof bvk && !$$0.a().O().b(dgf.c);
   }

   public void a(ard $$0, cwm $$1) {
      this.c($$0);
      if ($$0.O().b(dgf.i)) {
         cwq $$2 = new cwq($$1);
         $$2.b(kv.g, this.an());
         this.a($$0, $$2);
      }
   }

   @Override
   protected void a(akc.a $$0) {
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

   protected void a(ard $$0, btc $$1) {
      this.a($$0, this.u());
   }

   @Override
   public int bX() {
      return 10;
   }

   protected abstract cwm u();
}
