import com.mojang.serialization.MapCodec;

public class emo extends enl {
   public static final MapCodec<emo> a = MapCodec.unit(() -> emo.b);
   public static final emo b = new emo();

   private emo() {
   }

   @Override
   public boolean a(dtc $$0, ayw $$1) {
      return true;
   }

   @Override
   protected enm<?> a() {
      return enm.a;
   }
}
