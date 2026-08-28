import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dnn extends dmj {
   public static final MapCodec<dnn> c = b(dnn::new);

   @Override
   public MapCodec<dnn> a() {
      return c;
   }

   protected dnn(ebp.d $$0) {
      super($$0);
   }

   @Override
   public dyo a(iw $$0, ebq $$1) {
      return new dyn($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dyo> dyp<T> a(dkj $$0, ebq $$1, dyq<T> $$2) {
      return a($$0, $$2, dyq.D);
   }

   @Override
   protected void a(dkj $$0, iw $$1, csi $$2) {
      dyo $$3 = $$0.c_($$1);
      if ($$3 instanceof dyn) {
         $$2.a((bve)$$3);
         $$2.a(axi.as);
      }
   }

   @Override
   public void a(ebq $$0, dkj $$1, iw $$2, bai $$3) {
      if ($$0.c(b)) {
         double $$4 = (double)$$2.u() + 0.5;
         double $$5 = (double)$$2.v();
         double $$6 = (double)$$2.w() + 0.5;
         if ($$3.j() < 0.1) {
            $$1.a($$4, $$5, $$6, awy.cA, awz.e, 1.0F, 1.0F, false);
         }

         jc $$7 = $$0.c(a);
         jc.a $$8 = $$7.o();
         double $$9 = 0.52;
         double $$10 = $$3.j() * 0.6 - 0.3;
         double $$11 = $$8 == jc.a.a ? (double)$$7.j() * 0.52 : $$10;
         double $$12 = $$3.j() * 9.0 / 16.0;
         double $$13 = $$8 == jc.a.c ? (double)$$7.l() * 0.52 : $$10;
         $$1.a(lz.ah, $$4 + $$11, $$5 + $$12, $$6 + $$13, 0.0, 0.0, 0.0);
      }
   }
}
