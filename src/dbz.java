import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dbz extends cxn {
   public static final MapCodec<dbz> c = b(dbz::new);

   @Override
   public MapCodec<dbz> a() {
      return c;
   }

   protected dbz(dli.d $$0) {
      super($$0);
   }

   @Override
   public dix a(hz $$0, dlj $$1) {
      return new djt($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dix> diy<T> a(cvr $$0, dlj $$1, diz<T> $$2) {
      return a($$0, $$2, diz.a);
   }

   @Override
   protected void a(cvr $$0, hz $$1, chl $$2) {
      dix $$3 = $$0.c_($$1);
      if ($$3 instanceof djt) {
         $$2.a((bma)$$3);
         $$2.a(atv.am);
      }
   }

   @Override
   public void a(dlj $$0, cvr $$1, hz $$2, awp $$3) {
      if ($$0.c(b)) {
         double $$4 = (double)$$2.u() + 0.5;
         double $$5 = (double)$$2.v();
         double $$6 = (double)$$2.w() + 0.5;
         if ($$3.j() < 0.1) {
            $$1.a($$4, $$5, $$6, atl.jK, atm.e, 1.0F, 1.0F, false);
         }

         ie $$7 = $$0.c(a);
         ie.a $$8 = $$7.o();
         double $$9 = 0.52;
         double $$10 = $$3.j() * 0.6 - 0.3;
         double $$11 = $$8 == ie.a.a ? (double)$$7.j() * 0.52 : $$10;
         double $$12 = $$3.j() * 6.0 / 16.0;
         double $$13 = $$8 == ie.a.c ? (double)$$7.l() * 0.52 : $$10;
         $$1.a(jz.ab, $$4 + $$11, $$5 + $$12, $$6 + $$13, 0.0, 0.0, 0.0);
         $$1.a(jz.E, $$4 + $$11, $$5 + $$12, $$6 + $$13, 0.0, 0.0, 0.0);
      }
   }
}
