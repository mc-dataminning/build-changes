import com.mojang.serialization.MapCodec;

public class emk extends eml {
   public static final MapCodec<emk> a = MapCodec.unit(() -> emk.b);
   public static final emk b = new emk();

   private emk() {
   }

   @Override
   public boolean a(ja $$0, ja $$1, ja $$2, ayo $$3) {
      return true;
   }

   @Override
   protected emm<?> a() {
      return emm.a;
   }
}
