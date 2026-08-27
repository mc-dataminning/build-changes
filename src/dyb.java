import com.mojang.serialization.Codec;

public class dyb extends dyn {
   public static final Codec<dyb> a = Codec.unit(() -> dyb.b);
   public static final dyb b = new dyb();

   private dyb() {
   }

   @Override
   protected dyp<?> a() {
      return dyp.j;
   }
}
