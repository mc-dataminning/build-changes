import com.mojang.serialization.MapCodec;

public class dhi extends deg {
   public static final MapCodec<dhi> a = b(dhi::new);
   protected static final ewf b = deu.a(0.0, 6.0, 0.0, 16.0, 12.0, 16.0);

   @Override
   public MapCodec<dhi> a() {
      return a;
   }

   protected dhi(drw.d $$0) {
      super($$0);
   }

   @Override
   public dpc a(iz $$0, drx $$1) {
      return new dqt($$0, $$1);
   }

   @Override
   protected ewf a(drx $$0, daz $$1, iz $$2, evr $$3) {
      return b;
   }

   @Override
   protected void a(drx $$0, dbt $$1, iz $$2, bsp $$3) {
      if ($$1 instanceof arb && $$3.cw() && ewc.c(ewc.a($$3.cK().d((double)(-$$2.u()), (double)(-$$2.v()), (double)(-$$2.w()))), $$0.j($$1, $$2), evq.i)) {
         ala<dbt> $$4 = $$1.af() == dbt.j ? dbt.h : dbt.j;
         arb $$5 = ((arb)$$1).o().a($$4);
         if ($$5 == null) {
            return;
         }

         $$3.b($$5);
      }
   }

   @Override
   public void a(drx $$0, dbt $$1, iz $$2, azc $$3) {
      double $$4 = (double)$$2.u() + $$3.j();
      double $$5 = (double)$$2.v() + 0.8;
      double $$6 = (double)$$2.w() + $$3.j();
      $$1.a(lj.ae, $$4, $$5, $$6, 0.0, 0.0, 0.0);
   }

   @Override
   public cuk a(dbw $$0, iz $$1, drx $$2) {
      return cuk.l;
   }

   @Override
   protected boolean a(drx $$0, enp $$1) {
      return false;
   }
}
