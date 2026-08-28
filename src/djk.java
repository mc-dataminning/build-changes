import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class djk extends dig {
   public static final MapCodec<djk> c = b(djk::new);

   @Override
   public MapCodec<djk> a() {
      return c;
   }

   protected djk(dwv.d $$0) {
      super($$0);
   }

   @Override
   public dty a(ji $$0, dww $$1) {
      return new dtx($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dty> dtz<T> a(dgh $$0, dww $$1, dua<T> $$2) {
      return a($$0, $$2, dua.D);
   }

   @Override
   protected void a(dgh $$0, ji $$1, cow $$2) {
      dty $$3 = $$0.c_($$1);
      if ($$3 instanceof dtx) {
         $$2.a((bsl)$$3);
         $$2.a(awk.as);
      }
   }

   @Override
   public void a(dww $$0, dgh $$1, ji $$2, azh $$3) {
      if ($$0.c(b)) {
         double $$4 = (double)$$2.u() + 0.5;
         double $$5 = (double)$$2.v();
         double $$6 = (double)$$2.w() + 0.5;
         if ($$3.j() < 0.1) {
            $$1.a($$4, $$5, $$6, awa.cA, awb.e, 1.0F, 1.0F, false);
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
