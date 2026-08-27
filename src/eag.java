import com.mojang.serialization.Codec;

public class eag extends eas {
   public static final Codec<eag> a = Codec.unit(() -> eag.b);
   public static final eag b = new eag();

   private eag() {
   }

   @Override
   protected eau<?> a() {
      return eau.j;
   }
}
