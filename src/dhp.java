import com.mojang.serialization.MapCodec;

public class dhp extends den {
   public static final MapCodec<dhp> a = b(dhp::new);
   protected static final ewm b = dfb.a(0.0, 6.0, 0.0, 16.0, 12.0, 16.0);

   @Override
   public MapCodec<dhp> a() {
      return a;
   }

   protected dhp(dsd.d $$0) {
      super($$0);
   }

   @Override
   public dpj a(iz $$0, dse $$1) {
      return new dra($$0, $$1);
   }

   @Override
   protected ewm a(dse $$0, dbg $$1, iz $$2, evy $$3) {
      return b;
   }

   @Override
   protected void a(dse $$0, dca $$1, iz $$2, bsw $$3) {
      if ($$1 instanceof arf && $$3.cw() && ewj.c(ewj.a($$3.cK().d((double)(-$$2.u()), (double)(-$$2.v()), (double)(-$$2.w()))), $$0.j($$1, $$2), evx.i)) {
         ale<dca> $$4 = $$1.af() == dca.j ? dca.h : dca.j;
         arf $$5 = ((arf)$$1).o().a($$4);
         if ($$5 == null) {
            return;
         }

         $$3.b($$5);
      }
   }

   @Override
   public void a(dse $$0, dca $$1, iz $$2, azh $$3) {
      double $$4 = (double)$$2.u() + $$3.j();
      double $$5 = (double)$$2.v() + 0.8;
      double $$6 = (double)$$2.w() + $$3.j();
      $$1.a(li.ae, $$4, $$5, $$6, 0.0, 0.0, 0.0);
   }

   @Override
   public cur a(dcd $$0, iz $$1, dse $$2) {
      return cur.l;
   }

   @Override
   protected boolean a(dse $$0, enw $$1) {
      return false;
   }
}
