import com.mojang.serialization.MapCodec;

public class emj extends emv {
   public static final MapCodec<emj> a = MapCodec.unit(() -> emj.b);
   public static final emj b = new emj();

   private emj() {
   }

   @Override
   protected emx<?> a() {
      return emx.j;
   }
}
