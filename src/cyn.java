import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class cyn extends cxj {
   public static final MapCodec<cyn> c = b(cyn::new);

   @Override
   public MapCodec<cyn> a() {
      return c;
   }

   protected cyn(dle.d $$0) {
      super($$0);
   }

   @Override
   public dit a(hz $$0, dlf $$1) {
      return new dis($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dit> diu<T> a(cvn $$0, dlf $$1, div<T> $$2) {
      return a($$0, $$2, div.C);
   }

   @Override
   protected void a(cvn $$0, hz $$1, chh $$2) {
      dit $$3 = $$0.c_($$1);
      if ($$3 instanceof dis) {
         $$2.a((bly)$$3);
         $$2.a(atu.as);
      }
   }

   @Override
   public void a(dlf $$0, cvn $$1, hz $$2, awo $$3) {
      if ($$0.c(b)) {
         double $$4 = (double)$$2.u() + 0.5;
         double $$5 = (double)$$2.v();
         double $$6 = (double)$$2.w() + 0.5;
         if ($$3.j() < 0.1) {
            $$1.a($$4, $$5, $$6, atk.cs, atl.e, 1.0F, 1.0F, false);
         }

         ie $$7 = $$0.c(a);
         ie.a $$8 = $$7.o();
         double $$9 = 0.52;
         double $$10 = $$3.j() * 0.6 - 0.3;
         double $$11 = $$8 == ie.a.a ? (double)$$7.j() * 0.52 : $$10;
         double $$12 = $$3.j() * 9.0 / 16.0;
         double $$13 = $$8 == ie.a.c ? (double)$$7.l() * 0.52 : $$10;
         $$1.a(jz.ab, $$4 + $$11, $$5 + $$12, $$6 + $$13, 0.0, 0.0, 0.0);
      }
   }
}
