import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dmh extends ddv {
   public static final MapCodec<dmh> c = b(dmh::new);

   @Override
   public MapCodec<dmh> a() {
      return c;
   }

   protected dmh(dsc.d $$0) {
      super($$0);
   }

   @Override
   public dpi a(iz $$0, dsd $$1) {
      return new dqv($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dpi> dpj<T> a(dbz $$0, dsd $$1, dpk<T> $$2) {
      return a($$0, $$2, dpk.B);
   }

   @Override
   protected void a(dbz $$0, iz $$1, cmy $$2) {
      dpi $$3 = $$0.c_($$1);
      if ($$3 instanceof dqv) {
         $$2.a((bqz)$$3);
         $$2.a(awk.at);
      }
   }

   @Override
   public void a(dsd $$0, dbz $$1, iz $$2, azh $$3) {
      if ($$0.c(b)) {
         double $$4 = (double)$$2.u() + 0.5;
         double $$5 = (double)$$2.v();
         double $$6 = (double)$$2.w() + 0.5;
         if ($$3.j() < 0.1) {
            $$1.a($$4, $$5, $$6, awa.yh, awb.e, 1.0F, 1.0F, false);
         }

         $$1.a(li.ae, $$4, $$5 + 1.1, $$6, 0.0, 0.0, 0.0);
      }
   }
}
