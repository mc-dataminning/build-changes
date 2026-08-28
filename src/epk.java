import com.mojang.serialization.MapCodec;

public class epk extends epw {
   public static final MapCodec<epk> a = MapCodec.unit(() -> epk.b);
   public static final epk b = new epk();

   private epk() {
   }

   @Override
   protected epy<?> a() {
      return epy.j;
   }
}
