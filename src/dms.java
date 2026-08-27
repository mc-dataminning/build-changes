import com.mojang.serialization.MapCodec;

public class dms extends dhm {
   public static final MapCodec<dms> c = b(dms::new);
   public static final evd e = ddy.a(4.0, 0.0, 4.0, 12.0, 16.0, 12.0);

   @Override
   public MapCodec<dms> a() {
      return c;
   }

   public dms(dra.d $$0) {
      super($$0, it.b, e, false);
   }

   @Override
   protected dhn c() {
      return (dhn)dea.oB;
   }
}
