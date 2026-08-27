import com.mojang.serialization.Codec;

public class dyo extends dza {
   public static final Codec<dyo> a = Codec.unit(() -> dyo.b);
   public static final dyo b = new dyo();

   private dyo() {
   }

   @Override
   protected dzc<?> a() {
      return dzc.j;
   }
}
