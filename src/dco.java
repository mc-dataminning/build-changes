import com.mojang.serialization.MapCodec;

public class dco extends czm {
   public static final MapCodec<dco> a = b(dco::new);
   protected static final eqk b = daa.a(0.0, 6.0, 0.0, 16.0, 12.0, 16.0);

   @Override
   public MapCodec<dco> a() {
      return a;
   }

   protected dco(dmy.d $$0) {
      super($$0);
   }

   @Override
   public dkg a(ib $$0, dmz $$1) {
      return new dlw($$0, $$1);
   }

   @Override
   protected eqk a(dmz $$0, cwf $$1, ib $$2, epw $$3) {
      return b;
   }

   @Override
   protected void a(dmz $$0, cwz $$1, ib $$2, bow $$3) {
      if ($$1 instanceof apf && $$3.ct() && eqh.c(eqh.a($$3.cH().d((double)(-$$2.u()), (double)(-$$2.v()), (double)(-$$2.w()))), $$0.j($$1, $$2), epv.i)) {
         ajg<cwz> $$4 = $$1.ad() == cwz.j ? cwz.h : cwz.j;
         apf $$5 = ((apf)$$1).o().a($$4);
         if ($$5 == null) {
            return;
         }

         $$3.b($$5);
      }
   }

   @Override
   public void a(dmz $$0, cwz $$1, ib $$2, axd $$3) {
      double $$4 = (double)$$2.u() + $$3.j();
      double $$5 = (double)$$2.v() + 0.8;
      double $$6 = (double)$$2.w() + $$3.j();
      $$1.a(kc.ac, $$4, $$5, $$6, 0.0, 0.0, 0.0);
   }

   @Override
   public cqk a(cxc $$0, ib $$1, dmz $$2) {
      return cqk.h;
   }

   @Override
   protected boolean a(dmz $$0, eim $$1) {
      return false;
   }
}
