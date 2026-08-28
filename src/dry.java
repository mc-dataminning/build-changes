import com.mojang.serialization.MapCodec;

public class dry extends dlw {
   public static final MapCodec<dry> c = b(dry::new);
   public static final fal e = dij.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);

   @Override
   public MapCodec<dry> a() {
      return c;
   }

   public dry(dvn.d $$0) {
      super($$0, jm.a, e, false);
   }

   @Override
   protected dlx c() {
      return (dlx)dil.oz;
   }
}
