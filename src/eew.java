import com.mojang.serialization.Codec;

public class eew extends efi {
   public static final Codec<eew> a = Codec.unit(() -> eew.b);
   public static final eew b = new eew();

   private eew() {
   }

   @Override
   protected efk<?> a() {
      return efk.j;
   }
}
