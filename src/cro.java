public abstract class cro extends bul {
   protected static final ajy<Integer> e = akc.a(cro.class, aka.b);
   protected static final ajy<Integer> f = akc.a(cro.class, aka.b);
   protected static final ajy<Float> g = akc.a(cro.class, aka.d);

   public cro(bus<?> $$0, dgi $$1) {
      super($$0, $$1);
   }

   @Override
   public boolean b(btb $$0) {
      return true;
   }

   @Override
   public boolean a(ard $$0, btb $$1, float $$2) {
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
            this.a(ebt.o, $$1.d());
            if ($$1.d() instanceof cox $$3 && $$3.gj().d) {
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

   boolean a(btb $$0) {
      return false;
   }

   @Override
   public boolean a(dga $$0) {
      return $$0.c() instanceof bvj && !$$0.a().O().b(dge.c);
   }

   public void a(ard $$0, cwl $$1) {
      this.c($$0);
      if ($$0.O().b(dge.i)) {
         cwp $$2 = new cwp($$1);
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

   protected void a(ard $$0, btb $$1) {
      this.a($$0, this.u());
   }

   @Override
   public int bX() {
      return 10;
   }

   protected abstract cwl u();
}
