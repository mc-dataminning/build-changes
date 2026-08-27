import com.mojang.serialization.MapCodec;

public class cvh extends cwj {
   public static final MapCodec<cvh> a = b(cvh::new);

   @Override
   public MapCodec<? extends cvh> a() {
      return a;
   }

   public cvh(diz.d $$0) {
      super($$0);
   }

   @Override
   public void a(cti $$0, dja $$1, eli $$2, cft $$3) {
      if (!$$0.B) {
         hx $$4 = $$2.a();
         $$0.a(null, $$4, arm.G, arn.e, 1.0F, 0.5F + $$0.z.i() * 1.2F);
         $$0.a(null, $$4, arm.E, arn.e, 1.0F, 0.5F + $$0.z.i() * 1.2F);
      }
   }
}
