import com.mojang.serialization.MapCodec;

public class dhs extends den {
   public static final MapCodec<dhs> a = b(dhs::new);
   protected static final exn b = dfc.a(0.0, 6.0, 0.0, 16.0, 12.0, 16.0);

   @Override
   public MapCodec<dhs> a() {
      return a;
   }

   protected dhs(dtb.d $$0) {
      super($$0);
   }

   @Override
   public dqc a(ir $$0, dtc $$1) {
      return new dry($$0, $$1);
   }

   @Override
   protected exn a(dtc $$0, dbg $$1, ir $$2, ewz $$3) {
      return b;
   }

   @Override
   protected void a(dtc $$0, dca $$1, ir $$2, brv $$3) {
      if ($$1 instanceof aqt && $$3.cB() && exk.c(exk.a($$3.cP().d((double)(-$$2.u()), (double)(-$$2.v()), (double)(-$$2.w()))), $$0.j($$1, $$2), ewy.i)) {
         aks<dca> $$4 = $$1.af() == dca.j ? dca.h : dca.j;
         aqt $$5 = ((aqt)$$1).o().a($$4);
         if ($$5 == null) {
            return;
         }

         $$3.b($$5, false);
      }
   }

   @Override
   public void a(dtc $$0, dca $$1, ir $$2, ayt $$3) {
      double $$4 = (double)$$2.u() + $$3.j();
      double $$5 = (double)$$2.v() + 0.8;
      double $$6 = (double)$$2.w() + $$3.j();
      $$1.a(lb.ac, $$4, $$5, $$6, 0.0, 0.0, 0.0);
   }

   @Override
   public cuh a(dcd $$0, ir $$1, dtc $$2) {
      return cuh.i;
   }

   @Override
   protected boolean a(dtc $$0, epd $$1) {
      return false;
   }
}
