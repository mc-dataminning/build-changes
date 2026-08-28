import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dew extends dds {
   public static final MapCodec<dew> c = b(dew::new);

   @Override
   public MapCodec<dew> a() {
      return c;
   }

   protected dew(drz.d $$0) {
      super($$0);
   }

   @Override
   public dpf a(iz $$0, dsa $$1) {
      return new dpe($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dpf> dpg<T> a(dbw $$0, dsa $$1, dph<T> $$2) {
      return a($$0, $$2, dph.C);
   }

   @Override
   protected void a(dbw $$0, iz $$1, cmv $$2) {
      dpf $$3 = $$0.c_($$1);
      if ($$3 instanceof dpe) {
         $$2.a((bqw)$$3);
         $$2.a(awj.as);
      }
   }

   @Override
   public void a(dsa $$0, dbw $$1, iz $$2, azf $$3) {
      if ($$0.c(b)) {
         double $$4 = (double)$$2.u() + 0.5;
         double $$5 = (double)$$2.v();
         double $$6 = (double)$$2.w() + 0.5;
         if ($$3.j() < 0.1) {
            $$1.a($$4, $$5, $$6, avz.cA, awa.e, 1.0F, 1.0F, false);
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
