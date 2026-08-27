import com.mojang.serialization.MapCodec;

public abstract class cxw extends cva implements cxv {
   public cxw(dhh.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends cxw> a();

   @Override
   public void b(dhi $$0, csa $$1, ht $$2, dhi $$3, boolean $$4) {
      $$1.a($$2, this, this.b());
   }

   @Override
   public dhi a(dhi $$0, hx $$1, dhi $$2, csb $$3, ht $$4, ht $$5) {
      $$3.a($$4, this, this.b());
      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void a(dhi $$0, ame $$1, ht $$2, ats $$3) {
      if (h($$1.a_($$2.d())) && $$2.v() >= $$1.I_()) {
         cam $$4 = cam.a($$1, $$2, $$0);
         this.a($$4);
      }
   }

   protected void a(cam $$0) {
   }

   protected int b() {
      return 2;
   }

   public static boolean h(dhi $$0) {
      return $$0.i() || $$0.a(arg.aJ) || $$0.k() || $$0.r();
   }

   @Override
   public void a(dhi $$0, csa $$1, ht $$2, ats $$3) {
      if ($$3.a(16) == 0) {
         ht $$4 = $$2.d();
         if (h($$1.a_($$4))) {
            atp.a($$1, $$2, $$3, new jk(js.z, $$0));
         }
      }
   }

   public int b(dhi $$0, crg $$1, ht $$2) {
      return -16777216;
   }
}
