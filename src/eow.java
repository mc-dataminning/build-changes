import com.mojang.serialization.MapCodec;

public class eow extends ept {
   public static final MapCodec<eow> a = MapCodec.unit(() -> eow.b);
   public static final eow b = new eow();

   private eow() {
   }

   @Override
   public boolean a(dvj $$0, azs $$1) {
      return true;
   }

   @Override
   protected epu<?> a() {
      return epu.a;
   }
}
