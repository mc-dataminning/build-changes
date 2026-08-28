import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dme extends dds {
   public static final MapCodec<dme> c = b(dme::new);

   @Override
   public MapCodec<dme> a() {
      return c;
   }

   protected dme(drz.d $$0) {
      super($$0);
   }

   @Override
   public dpf a(iz $$0, dsa $$1) {
      return new dqs($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dpf> dpg<T> a(dbw $$0, dsa $$1, dph<T> $$2) {
      return a($$0, $$2, dph.B);
   }

   @Override
   protected void a(dbw $$0, iz $$1, cmv $$2) {
      dpf $$3 = $$0.c_($$1);
      if ($$3 instanceof dqs) {
         $$2.a((bqw)$$3);
         $$2.a(awj.at);
      }
   }

   @Override
   public void a(dsa $$0, dbw $$1, iz $$2, azf $$3) {
      if ($$0.c(b)) {
         double $$4 = (double)$$2.u() + 0.5;
         double $$5 = (double)$$2.v();
         double $$6 = (double)$$2.w() + 0.5;
         if ($$3.j() < 0.1) {
            $$1.a($$4, $$5, $$6, avz.yh, awa.e, 1.0F, 1.0F, false);
         }

         $$1.a(li.ae, $$4, $$5 + 1.1, $$6, 0.0, 0.0, 0.0);
      }
   }
}
