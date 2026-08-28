import com.mojang.serialization.MapCodec;

public class emz extends ena {
   public static final MapCodec<emz> a = MapCodec.unit(() -> emz.b);
   public static final emz b = new emz();

   private emz() {
   }

   @Override
   public boolean a(jd $$0, jd $$1, jd $$2, ayv $$3) {
      return true;
   }

   @Override
   protected enb<?> a() {
      return enb.a;
   }
}
