import com.mojang.serialization.MapCodec;

public class dcq extends czo {
   public static final MapCodec<dcq> a = b(dcq::new);
   protected static final eqm b = dac.a(0.0, 6.0, 0.0, 16.0, 12.0, 16.0);

   @Override
   public MapCodec<dcq> a() {
      return a;
   }

   protected dcq(dna.d $$0) {
      super($$0);
   }

   @Override
   public dki a(ib $$0, dnb $$1) {
      return new dly($$0, $$1);
   }

   @Override
   protected eqm a(dnb $$0, cwh $$1, ib $$2, epy $$3) {
      return b;
   }

   @Override
   protected void a(dnb $$0, cxb $$1, ib $$2, box $$3) {
      if ($$1 instanceof apf && $$3.ct() && eqj.c(eqj.a($$3.cH().d((double)(-$$2.u()), (double)(-$$2.v()), (double)(-$$2.w()))), $$0.j($$1, $$2), epx.i)) {
         ajg<cxb> $$4 = $$1.ad() == cxb.j ? cxb.h : cxb.j;
         apf $$5 = ((apf)$$1).o().a($$4);
         if ($$5 == null) {
            return;
         }

         $$3.b($$5);
      }
   }

   @Override
   public void a(dnb $$0, cxb $$1, ib $$2, axd $$3) {
      double $$4 = (double)$$2.u() + $$3.j();
      double $$5 = (double)$$2.v() + 0.8;
      double $$6 = (double)$$2.w() + $$3.j();
      $$1.a(kc.ac, $$4, $$5, $$6, 0.0, 0.0, 0.0);
   }

   @Override
   public cqm a(cxe $$0, ib $$1, dnb $$2) {
      return cqm.h;
   }

   @Override
   protected boolean a(dnb $$0, eio $$1) {
      return false;
   }
}
