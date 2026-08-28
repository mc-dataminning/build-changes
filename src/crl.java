public abstract class crl extends bul {
   protected static final akm<Integer> e = akq.a(crl.class, ako.b);
   protected static final akm<Integer> f = akq.a(crl.class, ako.b);
   protected static final akm<Float> g = akq.a(crl.class, ako.d);

   public crl(bus<?> $$0, dfm $$1) {
      super($$0, $$1);
   }

   @Override
   public boolean b(btb $$0) {
      return true;
   }

   @Override
   public boolean a(arp $$0, btb $$1, float $$2) {
      if (this.dQ()) {
         return true;
      } else if (this.d($$1)) {
         return false;
      } else {
         boolean var10000;
         label32: {
            this.l(-this.N());
            this.d(10);
            this.bD();
            this.b(this.K() + $$2 * 10.0F);
            this.a(ear.o, $$1.d());
            if ($$1.d() instanceof cou $$3 && $$3.gh().d) {
               var10000 = true;
               break label32;
            }

            var10000 = false;
         }

         boolean $$4 = var10000;
         if (($$4 || !(this.K() > 40.0F)) && !this.a($$1)) {
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
   public boolean a(dfe $$0) {
      return $$0.c() instanceof bvj && !$$0.a().N().b(dfi.c);
   }

   public void a(arp $$0, cwi $$1) {
      this.c($$0);
      if ($$0.N().b(dfi.i)) {
         cwm $$2 = new cwm($$1);
         $$2.b(ku.g, this.an());
         this.a($$0, $$2);
      }
   }

   @Override
   protected void a(akq.a $$0) {
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

   public float K() {
      return this.al.a(g);
   }

   public int L() {
      return this.al.a(e);
   }

   public int N() {
      return this.al.a(f);
   }

   protected void a(arp $$0, btb $$1) {
      this.a($$0, this.t());
   }

   @Override
   public int bX() {
      return 10;
   }

   protected abstract cwi t();
}
