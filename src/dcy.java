import com.mojang.serialization.MapCodec;

public abstract class dcy extends dac implements dcx {
   public dcy(dna.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dcy> a();

   @Override
   protected void b(dnb $$0, cxb $$1, ib $$2, dnb $$3, boolean $$4) {
      $$1.a($$2, this, this.b());
   }

   @Override
   protected dnb a(dnb $$0, ih $$1, dnb $$2, cxc $$3, ib $$4, ib $$5) {
      $$3.a($$4, this, this.b());
      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dnb $$0, apf $$1, ib $$2, axd $$3) {
      if (m($$1.a_($$2.d())) && $$2.v() >= $$1.I_()) {
         cfd $$4 = cfd.a($$1, $$2, $$0);
         this.a($$4);
      }
   }

   protected void a(cfd $$0) {
   }

   protected int b() {
      return 2;
   }

   public static boolean m(dnb $$0) {
      return $$0.i() || $$0.a(aun.aK) || $$0.k() || $$0.r();
   }

   @Override
   public void a(dnb $$0, cxb $$1, ib $$2, axd $$3) {
      if ($$3.a(16) == 0) {
         ib $$4 = $$2.d();
         if (m($$1.a_($$4))) {
            awz.a($$1, $$2, $$3, new ju(kc.C, $$0));
         }
      }
   }

   public int b(dnb $$0, cwh $$1, ib $$2) {
      return -16777216;
   }
}
