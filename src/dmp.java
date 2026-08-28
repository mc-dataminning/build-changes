import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dmp extends ded {
   public static final MapCodec<dmp> c = b(dmp::new);

   @Override
   public MapCodec<dmp> a() {
      return c;
   }

   protected dmp(dsk.d $$0) {
      super($$0);
   }

   @Override
   public dpq a(ja $$0, dsl $$1) {
      return new dre($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dpq> dpr<T> a(dcg $$0, dsl $$1, dps<T> $$2) {
      return a($$0, $$2, dps.B);
   }

   @Override
   protected void a(dcg $$0, ja $$1, cml $$2) {
      dpq $$3 = $$0.c_($$1);
      if ($$3 instanceof dre) {
         $$2.a((bql)$$3);
         $$2.a(avr.at);
      }
   }

   @Override
   public void a(dsl $$0, dcg $$1, ja $$2, ayo $$3) {
      if ($$0.c(b)) {
         double $$4 = (double)$$2.u() + 0.5;
         double $$5 = (double)$$2.v();
         double $$6 = (double)$$2.w() + 0.5;
         if ($$3.j() < 0.1) {
            $$1.a($$4, $$5, $$6, avh.yk, avi.e, 1.0F, 1.0F, false);
         }

         $$1.a(lj.ae, $$4, $$5 + 1.1, $$6, 0.0, 0.0, 0.0);
      }
   }
}
