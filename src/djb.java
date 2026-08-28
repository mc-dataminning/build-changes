import com.mojang.serialization.MapCodec;

public class djb extends dke {
   public static final MapCodec<djb> a = b(djb::new);
   private static final fal[] b = new fal[]{
      dij.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
      dij.a(0.0, 0.0, 0.0, 16.0, 3.0, 16.0),
      dij.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
      dij.a(0.0, 0.0, 0.0, 16.0, 5.0, 16.0),
      dij.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
      dij.a(0.0, 0.0, 0.0, 16.0, 7.0, 16.0),
      dij.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      dij.a(0.0, 0.0, 0.0, 16.0, 9.0, 16.0)
   };

   @Override
   public MapCodec<djb> a() {
      return a;
   }

   public djb(dvn.d $$0) {
      super($$0);
   }

   @Override
   protected dfe d() {
      return cwj.ux;
   }

   @Override
   protected fal a(dvo $$0, dek $$1, jh $$2, ezw $$3) {
      return b[this.h($$0)];
   }
}
