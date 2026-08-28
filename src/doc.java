import com.mojang.serialization.MapCodec;

public class doc extends dke {
   public static final MapCodec<doc> a = b(doc::new);
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
   public MapCodec<doc> a() {
      return a;
   }

   public doc(dvn.d $$0) {
      super($$0);
   }

   @Override
   protected dfe d() {
      return cwj.uy;
   }

   @Override
   protected fal a(dvo $$0, dek $$1, jh $$2, ezw $$3) {
      return b[this.h($$0)];
   }
}
