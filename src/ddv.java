import com.mojang.serialization.MapCodec;

public class ddv extends dex {
   public static final MapCodec<ddv> a = b(ddv::new);

   @Override
   public MapCodec<? extends ddv> a() {
      return a;
   }

   public ddv(drz.d $$0) {
      super($$0);
   }

   @Override
   protected void a(dbw $$0, dsa $$1, evl $$2, cnn $$3) {
      if (!$$0.B) {
         iz $$4 = $$2.a();
         $$0.a(null, $$4, avz.G, awa.e, 1.0F, 0.5F + $$0.z.i() * 1.2F);
         $$0.a(null, $$4, avz.E, awa.e, 1.0F, 0.5F + $$0.z.i() * 1.2F);
      }
   }
}
