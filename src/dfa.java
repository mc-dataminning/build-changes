import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dfa extends ddw {
   public static final MapCodec<dfa> c = b(dfa::new);

   @Override
   public MapCodec<dfa> a() {
      return c;
   }

   protected dfa(dsd.d $$0) {
      super($$0);
   }

   @Override
   public dpj a(iz $$0, dse $$1) {
      return new dpi($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dpj> dpk<T> a(dca $$0, dse $$1, dpl<T> $$2) {
      return a($$0, $$2, dpl.C);
   }

   @Override
   protected void a(dca $$0, iz $$1, cmz $$2) {
      dpj $$3 = $$0.c_($$1);
      if ($$3 instanceof dpi) {
         $$2.a((bra)$$3);
         $$2.a(awk.as);
      }
   }

   @Override
   public void a(dse $$0, dca $$1, iz $$2, azh $$3) {
      if ($$0.c(b)) {
         double $$4 = (double)$$2.u() + 0.5;
         double $$5 = (double)$$2.v();
         double $$6 = (double)$$2.w() + 0.5;
         if ($$3.j() < 0.1) {
            $$1.a($$4, $$5, $$6, awa.cA, awb.e, 1.0F, 1.0F, false);
         }

         je $$7 = $$0.c(a);
         je.a $$8 = $$7.o();
         double $$9 = 0.52;
         double $$10 = $$3.j() * 0.6 - 0.3;
         double $$11 = $$8 == je.a.a ? (double)$$7.j() * 0.52 : $$10;
         double $$12 = $$3.j() * 9.0 / 16.0;
         double $$13 = $$8 == je.a.c ? (double)$$7.l() * 0.52 : $$10;
         $$1.a(li.ae, $$4 + $$11, $$5 + $$12, $$6 + $$13, 0.0, 0.0, 0.0);
      }
   }
}
