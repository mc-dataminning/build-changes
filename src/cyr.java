import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class cyr extends cxn {
   public static final MapCodec<cyr> c = b(cyr::new);

   @Override
   public MapCodec<cyr> a() {
      return c;
   }

   protected cyr(dli.d $$0) {
      super($$0);
   }

   @Override
   public dix a(hz $$0, dlj $$1) {
      return new diw($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dix> diy<T> a(cvr $$0, dlj $$1, diz<T> $$2) {
      return a($$0, $$2, diz.C);
   }

   @Override
   protected void a(cvr $$0, hz $$1, chl $$2) {
      dix $$3 = $$0.c_($$1);
      if ($$3 instanceof diw) {
         $$2.a((bma)$$3);
         $$2.a(atv.as);
      }
   }

   @Override
   public void a(dlj $$0, cvr $$1, hz $$2, awp $$3) {
      if ($$0.c(b)) {
         double $$4 = (double)$$2.u() + 0.5;
         double $$5 = (double)$$2.v();
         double $$6 = (double)$$2.w() + 0.5;
         if ($$3.j() < 0.1) {
            $$1.a($$4, $$5, $$6, atl.ct, atm.e, 1.0F, 1.0F, false);
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
