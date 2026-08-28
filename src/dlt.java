import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dlt extends dkp {
   public static final MapCodec<dlt> c = b(dlt::new);

   @Override
   public MapCodec<dlt> a() {
      return c;
   }

   protected dlt(dzn.d $$0) {
      super($$0);
   }

   @Override
   public dwn a(iu $$0, dzo $$1) {
      return new dwm($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dwn> dwo<T> a(dip $$0, dzo $$1, dwp<T> $$2) {
      return a($$0, $$2, dwp.D);
   }

   @Override
   protected void a(dip $$0, iu $$1, cqs $$2) {
      dwn $$3 = $$0.c_($$1);
      if ($$3 instanceof dwm) {
         $$2.a((bua)$$3);
         $$2.a(awv.as);
      }
   }

   @Override
   public void a(dzo $$0, dip $$1, iu $$2, azt $$3) {
      if ($$0.c(b)) {
         double $$4 = (double)$$2.u() + 0.5;
         double $$5 = (double)$$2.v();
         double $$6 = (double)$$2.w() + 0.5;
         if ($$3.j() < 0.1) {
            $$1.a($$4, $$5, $$6, awl.cA, awm.e, 1.0F, 1.0F, false);
         }

         ja $$7 = $$0.c(a);
         ja.a $$8 = $$7.o();
         double $$9 = 0.52;
         double $$10 = $$3.j() * 0.6 - 0.3;
         double $$11 = $$8 == ja.a.a ? (double)$$7.j() * 0.52 : $$10;
         double $$12 = $$3.j() * 9.0 / 16.0;
         double $$13 = $$8 == ja.a.c ? (double)$$7.l() * 0.52 : $$10;
         $$1.a(lx.ah, $$4 + $$11, $$5 + $$12, $$6 + $$13, 0.0, 0.0, 0.0);
      }
   }
}
