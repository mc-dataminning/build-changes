import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dmv extends dii {
   public static final MapCodec<dmv> c = b(dmv::new);

   @Override
   public MapCodec<dmv> a() {
      return c;
   }

   protected dmv(dwx.d $$0) {
      super($$0);
   }

   @Override
   public dua a(ji $$0, dwy $$1) {
      return new duz($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dua> dub<T> a(dgj $$0, dwy $$1, duc<T> $$2) {
      return a($$0, $$2, duc.a);
   }

   @Override
   protected void a(dgj $$0, ji $$1, coy $$2) {
      dua $$3 = $$0.c_($$1);
      if ($$3 instanceof duz) {
         $$2.a((bsn)$$3);
         $$2.a(awk.am);
      }
   }

   @Override
   public void a(dwy $$0, dgj $$1, ji $$2, azh $$3) {
      if ($$0.c(b)) {
         double $$4 = (double)$$2.u() + 0.5;
         double $$5 = (double)$$2.v();
         double $$6 = (double)$$2.w() + 0.5;
         if ($$3.j() < 0.1) {
            $$1.a($$4, $$5, $$6, awa.ky, awb.e, 1.0F, 1.0F, false);
         }

         jn $$7 = $$0.c(a);
         jn.a $$8 = $$7.o();
         double $$9 = 0.52;
         double $$10 = $$3.j() * 0.6 - 0.3;
         double $$11 = $$8 == jn.a.a ? (double)$$7.j() * 0.52 : $$10;
         double $$12 = $$3.j() * 6.0 / 16.0;
         double $$13 = $$8 == jn.a.c ? (double)$$7.l() * 0.52 : $$10;
         $$1.a(lt.ag, $$4 + $$11, $$5 + $$12, $$6 + $$13, 0.0, 0.0, 0.0);
         $$1.a(lt.F, $$4 + $$11, $$5 + $$12, $$6 + $$13, 0.0, 0.0, 0.0);
      }
   }
}
