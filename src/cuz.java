import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class cuz extends ctv {
   public static final MapCodec<cuz> c = b(cuz::new);

   @Override
   public MapCodec<cuz> a() {
      return c;
   }

   protected cuz(dhh.d $$0) {
      super($$0);
   }

   @Override
   public dfd a(ht $$0, dhi $$1) {
      return new dfc($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dfd> dfe<T> a(csa $$0, dhi $$1, dff<T> $$2) {
      return a($$0, $$2, dff.C);
   }

   @Override
   protected void a(csa $$0, ht $$1, cdu $$2) {
      dfd $$3 = $$0.c_($$1);
      if ($$3 instanceof dfc) {
         $$2.a((bja)$$3);
         $$2.a(arb.as);
      }
   }

   @Override
   public void a(dhi $$0, csa $$1, ht $$2, ats $$3) {
      if ($$0.c(b)) {
         double $$4 = (double)$$2.u() + 0.5;
         double $$5 = (double)$$2.v();
         double $$6 = (double)$$2.w() + 0.5;
         if ($$3.j() < 0.1) {
            $$1.a($$4, $$5, $$6, aqr.cg, aqs.e, 1.0F, 1.0F, false);
         }

         hx $$7 = $$0.c(a);
         hx.a $$8 = $$7.o();
         double $$9 = 0.52;
         double $$10 = $$3.j() * 0.6 - 0.3;
         double $$11 = $$8 == hx.a.a ? (double)$$7.j() * 0.52 : $$10;
         double $$12 = $$3.j() * 9.0 / 16.0;
         double $$13 = $$8 == hx.a.c ? (double)$$7.l() * 0.52 : $$10;
         $$1.a(js.Z, $$4 + $$11, $$5 + $$12, $$6 + $$13, 0.0, 0.0, 0.0);
      }
   }
}
