import com.mojang.serialization.MapCodec;

public class dnr extends dil {
   public static final MapCodec<dnr> c = b(dnr::new);
   public static final ewi e = dex.a(4.0, 0.0, 4.0, 12.0, 16.0, 12.0);

   @Override
   public MapCodec<dnr> a() {
      return c;
   }

   public dnr(drz.d $$0) {
      super($$0, je.b, e, false);
   }

   @Override
   protected dim c() {
      return (dim)dez.oB;
   }
}
