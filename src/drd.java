import com.mojang.serialization.MapCodec;

public class drd extends dlw {
   public static final MapCodec<drd> c = b(drd::new);
   public static final fal e = dij.a(4.0, 0.0, 4.0, 12.0, 16.0, 12.0);

   @Override
   public MapCodec<drd> a() {
      return c;
   }

   public drd(dvn.d $$0) {
      super($$0, jm.b, e, false);
   }

   @Override
   protected dlx c() {
      return (dlx)dil.oB;
   }
}
