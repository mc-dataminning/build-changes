import com.mojang.serialization.MapCodec;

public class dhm extends dek {
   public static final MapCodec<dhm> a = b(dhm::new);
   protected static final ewj b = dey.a(0.0, 6.0, 0.0, 16.0, 12.0, 16.0);

   @Override
   public MapCodec<dhm> a() {
      return a;
   }

   protected dhm(dsa.d $$0) {
      super($$0);
   }

   @Override
   public dpg a(iz $$0, dsb $$1) {
      return new dqx($$0, $$1);
   }

   @Override
   protected ewj a(dsb $$0, dbd $$1, iz $$2, evv $$3) {
      return b;
   }

   @Override
   protected void a(dsb $$0, dbx $$1, iz $$2, bst $$3) {
      if ($$1 instanceof are && $$3.cw() && ewg.c(ewg.a($$3.cK().d((double)(-$$2.u()), (double)(-$$2.v()), (double)(-$$2.w()))), $$0.j($$1, $$2), evu.i)) {
         ald<dbx> $$4 = $$1.af() == dbx.j ? dbx.h : dbx.j;
         are $$5 = ((are)$$1).o().a($$4);
         if ($$5 == null) {
            return;
         }

         $$3.b($$5);
      }
   }

   @Override
   public void a(dsb $$0, dbx $$1, iz $$2, azg $$3) {
      double $$4 = (double)$$2.u() + $$3.j();
      double $$5 = (double)$$2.v() + 0.8;
      double $$6 = (double)$$2.w() + $$3.j();
      $$1.a(li.ae, $$4, $$5, $$6, 0.0, 0.0, 0.0);
   }

   @Override
   public cuo a(dca $$0, iz $$1, dsb $$2) {
      return cuo.l;
   }

   @Override
   protected boolean a(dsb $$0, ent $$1) {
      return false;
   }
}
