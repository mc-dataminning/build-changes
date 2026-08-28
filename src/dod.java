import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dod extends djp {
   public static final MapCodec<dod> c = b(dod::new);

   @Override
   public MapCodec<dod> a() {
      return c;
   }

   protected dod(dyl.d $$0) {
      super($$0);
   }

   @Override
   public dvl a(jj $$0, dym $$1) {
      return new dwl($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dvl> dvm<T> a(dhp $$0, dym $$1, dvn<T> $$2) {
      return a($$0, $$2, dvn.a);
   }

   @Override
   protected void a(dhp $$0, jj $$1, cqi $$2) {
      dvl $$3 = $$0.c_($$1);
      if ($$3 instanceof dwl) {
         $$2.a((bts)$$3);
         $$2.a(awu.am);
      }
   }

   @Override
   public void a(dym $$0, dhp $$1, jj $$2, azs $$3) {
      if ($$0.c(b)) {
         double $$4 = (double)$$2.u() + 0.5;
         double $$5 = (double)$$2.v();
         double $$6 = (double)$$2.w() + 0.5;
         if ($$3.j() < 0.1) {
            $$1.a($$4, $$5, $$6, awk.ky, awl.e, 1.0F, 1.0F, false);
         }

         jo $$7 = $$0.c(a);
         jo.a $$8 = $$7.o();
         double $$9 = 0.52;
         double $$10 = $$3.j() * 0.6 - 0.3;
         double $$11 = $$8 == jo.a.a ? (double)$$7.j() * 0.52 : $$10;
         double $$12 = $$3.j() * 6.0 / 16.0;
         double $$13 = $$8 == jo.a.c ? (double)$$7.l() * 0.52 : $$10;
         $$1.a(lv.ah, $$4 + $$11, $$5 + $$12, $$6 + $$13, 0.0, 0.0, 0.0);
         $$1.a(lv.F, $$4 + $$11, $$5 + $$12, $$6 + $$13, 0.0, 0.0, 0.0);
      }
   }
}
