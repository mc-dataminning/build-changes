import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dff extends dat {
   public static final MapCodec<dff> c = b(dff::new);

   @Override
   public MapCodec<dff> a() {
      return c;
   }

   protected dff(doy.d $$0) {
      super($$0);
   }

   @Override
   public dmf a(ib $$0, doz $$1) {
      return new dnb($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dmf> dmg<T> a(cyx $$0, doz $$1, dmh<T> $$2) {
      return a($$0, $$2, dmh.a);
   }

   @Override
   protected void a(cyx $$0, ib $$1, cjt $$2) {
      dmf $$3 = $$0.c_($$1);
      if ($$3 instanceof dnb) {
         $$2.a((boe)$$3);
         $$2.a(auw.am);
      }
   }

   @Override
   public void a(doz $$0, cyx $$1, ib $$2, axr $$3) {
      if ($$0.c(b)) {
         double $$4 = (double)$$2.u() + 0.5;
         double $$5 = (double)$$2.v();
         double $$6 = (double)$$2.w() + 0.5;
         if ($$3.j() < 0.1) {
            $$1.a($$4, $$5, $$6, aum.jT, aun.e, 1.0F, 1.0F, false);
         }

         ih $$7 = $$0.c(a);
         ih.a $$8 = $$7.o();
         double $$9 = 0.52;
         double $$10 = $$3.j() * 0.6 - 0.3;
         double $$11 = $$8 == ih.a.a ? (double)$$7.j() * 0.52 : $$10;
         double $$12 = $$3.j() * 6.0 / 16.0;
         double $$13 = $$8 == ih.a.c ? (double)$$7.l() * 0.52 : $$10;
         $$1.a(kl.ac, $$4 + $$11, $$5 + $$12, $$6 + $$13, 0.0, 0.0, 0.0);
         $$1.a(kl.F, $$4 + $$11, $$5 + $$12, $$6 + $$13, 0.0, 0.0, 0.0);
      }
   }
}
