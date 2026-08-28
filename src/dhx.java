import com.mojang.serialization.MapCodec;

public abstract class dhx extends dfb implements dhw {
   public dhx(dsd.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dhx> a();

   @Override
   protected void b(dse $$0, dca $$1, iz $$2, dse $$3, boolean $$4) {
      $$1.a($$2, this, this.b());
   }

   @Override
   protected dse a(dse $$0, je $$1, dse $$2, dcb $$3, iz $$4, iz $$5) {
      $$3.a($$4, this, this.b());
      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dse $$0, arf $$1, iz $$2, azh $$3) {
      if (m($$1.a_($$2.d())) && $$2.v() >= $$1.I_()) {
         cji $$4 = cji.a($$1, $$2, $$0);
         this.a($$4);
      }
   }

   protected void a(cji $$0) {
   }

   protected int b() {
      return 2;
   }

   public static boolean m(dse $$0) {
      return $$0.i() || $$0.a(awp.aK) || $$0.k() || $$0.r();
   }

   @Override
   public void a(dse $$0, dca $$1, iz $$2, azh $$3) {
      if ($$3.a(16) == 0) {
         iz $$4 = $$2.d();
         if (m($$1.a_($$4))) {
            azd.a($$1, $$2, $$3, new la(li.C, $$0));
         }
      }
   }

   public int b(dse $$0, dbg $$1, iz $$2) {
      return -16777216;
   }
}
