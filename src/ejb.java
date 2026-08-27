import com.mojang.serialization.Codec;

public class ejb extends ejn {
   public static final Codec<ejb> a = Codec.unit(() -> ejb.b);
   public static final ejb b = new ejb();

   private ejb() {
   }

   @Override
   protected ejp<?> a() {
      return ejp.j;
   }
}
