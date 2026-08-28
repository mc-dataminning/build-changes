import com.mojang.serialization.MapCodec;

public class dom extends dil {
   public static final MapCodec<dom> c = b(dom::new);
   public static final ewi e = dex.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);

   @Override
   public MapCodec<dom> a() {
      return c;
   }

   public dom(drz.d $$0) {
      super($$0, je.a, e, false);
   }

   @Override
   protected dim c() {
      return (dim)dez.oz;
   }
}
