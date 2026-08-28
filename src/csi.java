public abstract class csi extends bva {
   protected static final ajx<Integer> e = akb.a(csi.class, ajz.b);
   protected static final ajx<Integer> f = akb.a(csi.class, ajz.b);
   protected static final ajx<Float> g = akb.a(csi.class, ajz.d);

   public csi(bvi<?> $$0, dgz $$1) {
      super($$0, $$1);
   }

   @Override
   public boolean b(btp $$0) {
      return true;
   }

   @Override
   public boolean a(ard $$0, btp $$1, float $$2) {
      if (this.dP()) {
         return true;
      } else if (this.d($$1)) {
         return false;
      } else {
         boolean var10000;
         label32: {
            this.l(-this.J());
            this.d(10);
            this.bB();
            this.b(this.H() + $$2 * 10.0F);
            this.a(ecp.o, $$1.d());
            if ($$1.d() instanceof cpr $$3 && $$3.gm().d) {
               var10000 = true;
               break label32;
            }

            var10000 = false;
         }

         boolean $$4 = var10000;
         if (($$4 || !(this.H() > 40.0F)) && !this.a($$1)) {
            if ($$4) {
               this.at();
            }
         } else {
            this.a($$0, $$1);
         }

         return true;
      }
   }

   boolean a(btp $$0) {
      return false;
   }

   @Override
   public boolean a(dgs $$0) {
      return $$0.c() instanceof bwa && !$$0.a().O().b(dgv.c);
   }

   public void a(ard $$0, cxd $$1) {
      this.c($$0);
      if ($$0.O().b(dgv.i)) {
         cxh $$2 = new cxh($$1);
         $$2.b(kv.g, this.an());
         this.a($$0, $$2);
      }
   }

   @Override
   protected void a(akb.a $$0) {
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

   protected void a(ard $$0, btp $$1) {
      this.a($$0, this.o());
   }

   @Override
   public int bW() {
      return 10;
   }

   protected abstract cxd o();
}
