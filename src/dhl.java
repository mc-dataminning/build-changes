import com.mojang.serialization.MapCodec;

public class dhl extends dej {
   public static final MapCodec<dhl> a = b(dhl::new);
   protected static final ewi b = dex.a(0.0, 6.0, 0.0, 16.0, 12.0, 16.0);

   @Override
   public MapCodec<dhl> a() {
      return a;
   }

   protected dhl(drz.d $$0) {
      super($$0);
   }

   @Override
   public dpf a(iz $$0, dsa $$1) {
      return new dqw($$0, $$1);
   }

   @Override
   protected ewi a(dsa $$0, dbc $$1, iz $$2, evu $$3) {
      return b;
   }

   @Override
   protected void a(dsa $$0, dbw $$1, iz $$2, bss $$3) {
      if ($$1 instanceof are && $$3.cw() && ewf.c(ewf.a($$3.cK().d((double)(-$$2.u()), (double)(-$$2.v()), (double)(-$$2.w()))), $$0.j($$1, $$2), evt.i)) {
         ald<dbw> $$4 = $$1.af() == dbw.j ? dbw.h : dbw.j;
         are $$5 = ((are)$$1).o().a($$4);
         if ($$5 == null) {
            return;
         }

         $$3.b($$5);
      }
   }

   @Override
   public void a(dsa $$0, dbw $$1, iz $$2, azf $$3) {
      double $$4 = (double)$$2.u() + $$3.j();
      double $$5 = (double)$$2.v() + 0.8;
      double $$6 = (double)$$2.w() + $$3.j();
      $$1.a(li.ae, $$4, $$5, $$6, 0.0, 0.0, 0.0);
   }

   @Override
   public cun a(dbz $$0, iz $$1, dsa $$2) {
      return cun.l;
   }

   @Override
   protected boolean a(dsa $$0, ens $$1) {
      return false;
   }
}
