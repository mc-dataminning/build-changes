import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dhi extends dge {
   public static final MapCodec<dhi> c = b(dhi::new);

   @Override
   public MapCodec<dhi> a() {
      return c;
   }

   protected dhi(dun.d $$0) {
      super($$0);
   }

   @Override
   public drs a(je $$0, duo $$1) {
      return new drr($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends drs> drt<T> a(deg $$0, duo $$1, dru<T> $$2) {
      return a($$0, $$2, dru.C);
   }

   @Override
   protected void a(deg $$0, je $$1, cnu $$2) {
      drs $$3 = $$0.c_($$1);
      if ($$3 instanceof drr) {
         $$2.a((brr)$$3);
         $$2.a(awo.as);
      }
   }

   @Override
   public void a(duo $$0, deg $$1, je $$2, azl $$3) {
      if ($$0.c(b)) {
         double $$4 = (double)$$2.u() + 0.5;
         double $$5 = (double)$$2.v();
         double $$6 = (double)$$2.w() + 0.5;
         if ($$3.j() < 0.1) {
            $$1.a($$4, $$5, $$6, awe.cA, awf.e, 1.0F, 1.0F, false);
         }

         jj $$7 = $$0.c(a);
         jj.a $$8 = $$7.o();
         double $$9 = 0.52;
         double $$10 = $$3.j() * 0.6 - 0.3;
         double $$11 = $$8 == jj.a.a ? (double)$$7.j() * 0.52 : $$10;
         double $$12 = $$3.j() * 9.0 / 16.0;
         double $$13 = $$8 == jj.a.c ? (double)$$7.l() * 0.52 : $$10;
         $$1.a(ln.ae, $$4 + $$11, $$5 + $$12, $$6 + $$13, 0.0, 0.0, 0.0);
      }
   }
}
