import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class djj extends dif {
   public static final MapCodec<djj> c = b(djj::new);

   @Override
   public MapCodec<djj> a() {
      return c;
   }

   protected djj(dwu.d $$0) {
      super($$0);
   }

   @Override
   public dtx a(ji $$0, dwv $$1) {
      return new dtw($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dtx> dty<T> a(dgg $$0, dwv $$1, dtz<T> $$2) {
      return a($$0, $$2, dtz.D);
   }

   @Override
   protected void a(dgg $$0, ji $$1, cov $$2) {
      dtx $$3 = $$0.c_($$1);
      if ($$3 instanceof dtw) {
         $$2.a((bsk)$$3);
         $$2.a(awj.as);
      }
   }

   @Override
   public void a(dwv $$0, dgg $$1, ji $$2, azg $$3) {
      if ($$0.c(b)) {
         double $$4 = (double)$$2.u() + 0.5;
         double $$5 = (double)$$2.v();
         double $$6 = (double)$$2.w() + 0.5;
         if ($$3.j() < 0.1) {
            $$1.a($$4, $$5, $$6, avz.cA, awa.e, 1.0F, 1.0F, false);
         }

         jn $$7 = $$0.c(a);
         jn.a $$8 = $$7.o();
         double $$9 = 0.52;
         double $$10 = $$3.j() * 0.6 - 0.3;
         double $$11 = $$8 == jn.a.a ? (double)$$7.j() * 0.52 : $$10;
         double $$12 = $$3.j() * 9.0 / 16.0;
         double $$13 = $$8 == jn.a.c ? (double)$$7.l() * 0.52 : $$10;
         $$1.a(lt.ag, $$4 + $$11, $$5 + $$12, $$6 + $$13, 0.0, 0.0, 0.0);
      }
   }
}
