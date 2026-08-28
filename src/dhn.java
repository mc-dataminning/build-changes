import com.mojang.serialization.MapCodec;

public class dhn extends del {
   public static final MapCodec<dhn> a = b(dhn::new);
   protected static final ewk b = dez.a(0.0, 6.0, 0.0, 16.0, 12.0, 16.0);

   @Override
   public MapCodec<dhn> a() {
      return a;
   }

   protected dhn(dsb.d $$0) {
      super($$0);
   }

   @Override
   public dph a(iz $$0, dsc $$1) {
      return new dqy($$0, $$1);
   }

   @Override
   protected ewk a(dsc $$0, dbe $$1, iz $$2, evw $$3) {
      return b;
   }

   @Override
   protected void a(dsc $$0, dby $$1, iz $$2, bsu $$3) {
      if ($$1 instanceof arf && $$3.cw() && ewh.c(ewh.a($$3.cK().d((double)(-$$2.u()), (double)(-$$2.v()), (double)(-$$2.w()))), $$0.j($$1, $$2), evv.i)) {
         ale<dby> $$4 = $$1.af() == dby.j ? dby.h : dby.j;
         arf $$5 = ((arf)$$1).o().a($$4);
         if ($$5 == null) {
            return;
         }

         $$3.b($$5);
      }
   }

   @Override
   public void a(dsc $$0, dby $$1, iz $$2, azh $$3) {
      double $$4 = (double)$$2.u() + $$3.j();
      double $$5 = (double)$$2.v() + 0.8;
      double $$6 = (double)$$2.w() + $$3.j();
      $$1.a(li.ae, $$4, $$5, $$6, 0.0, 0.0, 0.0);
   }

   @Override
   public cup a(dcb $$0, iz $$1, dsc $$2) {
      return cup.l;
   }

   @Override
   protected boolean a(dsc $$0, enu $$1) {
      return false;
   }
}
