import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dex extends ddt {
   public static final MapCodec<dex> c = b(dex::new);

   @Override
   public MapCodec<dex> a() {
      return c;
   }

   protected dex(dsa.d $$0) {
      super($$0);
   }

   @Override
   public dpg a(iz $$0, dsb $$1) {
      return new dpf($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dpg> dph<T> a(dbx $$0, dsb $$1, dpi<T> $$2) {
      return a($$0, $$2, dpi.C);
   }

   @Override
   protected void a(dbx $$0, iz $$1, cmw $$2) {
      dpg $$3 = $$0.c_($$1);
      if ($$3 instanceof dpf) {
         $$2.a((bqx)$$3);
         $$2.a(awj.as);
      }
   }

   @Override
   public void a(dsb $$0, dbx $$1, iz $$2, azg $$3) {
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
