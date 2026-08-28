import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dfh extends ded {
   public static final MapCodec<dfh> c = b(dfh::new);

   @Override
   public MapCodec<dfh> a() {
      return c;
   }

   protected dfh(dsk.d $$0) {
      super($$0);
   }

   @Override
   public dpq a(ja $$0, dsl $$1) {
      return new dpp($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dpq> dpr<T> a(dcg $$0, dsl $$1, dps<T> $$2) {
      return a($$0, $$2, dps.C);
   }

   @Override
   protected void a(dcg $$0, ja $$1, cml $$2) {
      dpq $$3 = $$0.c_($$1);
      if ($$3 instanceof dpp) {
         $$2.a((bql)$$3);
         $$2.a(avr.as);
      }
   }

   @Override
   public void a(dsl $$0, dcg $$1, ja $$2, ayo $$3) {
      if ($$0.c(b)) {
         double $$4 = (double)$$2.u() + 0.5;
         double $$5 = (double)$$2.v();
         double $$6 = (double)$$2.w() + 0.5;
         if ($$3.j() < 0.1) {
            $$1.a($$4, $$5, $$6, avh.cA, avi.e, 1.0F, 1.0F, false);
         }

         jf $$7 = $$0.c(a);
         jf.a $$8 = $$7.o();
         double $$9 = 0.52;
         double $$10 = $$3.j() * 0.6 - 0.3;
         double $$11 = $$8 == jf.a.a ? (double)$$7.j() * 0.52 : $$10;
         double $$12 = $$3.j() * 9.0 / 16.0;
         double $$13 = $$8 == jf.a.c ? (double)$$7.l() * 0.52 : $$10;
         $$1.a(lj.ae, $$4 + $$11, $$5 + $$12, $$6 + $$13, 0.0, 0.0, 0.0);
      }
   }
}
