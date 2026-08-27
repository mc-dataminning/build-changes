import com.mojang.serialization.MapCodec;

public class daq extends cut {
   public static final MapCodec<daq> a = b(daq::new);

   @Override
   public MapCodec<daq> a() {
      return a;
   }

   protected daq(dgv.d $$0) {
      super($$0);
   }

   @Override
   public biq a(dgw $$0, crs $$1, ht $$2, cdm $$3, bip $$4, eje $$5) {
      clb $$6 = $$3.b($$4);
      if ($$6.a(cle.rh)) {
         if (!$$1.B) {
            hx $$7 = $$5.b();
            hx $$8 = $$7.o() == hx.a.b ? $$3.cD().g() : $$7;
            $$1.a(null, $$2, aqn.tn, aqo.e, 1.0F, 1.0F);
            $$1.a($$2, cuv.ee.o().a(cvn.b, $$8), 11);
            caf $$9 = new caf(
               $$1, (double)$$2.u() + 0.5 + (double)$$8.j() * 0.65, (double)$$2.v() + 0.1, (double)$$2.w() + 0.5 + (double)$$8.l() * 0.65, new clb(cle.rk, 4)
            );
            $$9.o(0.05 * (double)$$8.j() + $$1.z.j() * 0.02, 0.05, 0.05 * (double)$$8.l() + $$1.z.j() * 0.02);
            $$1.b($$9);
            $$6.a(1, $$3, $$1x -> $$1x.d($$4));
            $$1.a($$3, dlg.M, $$2);
            $$3.b(aqx.c.b(cle.rh));
         }

         return biq.a($$1.B);
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }
}
