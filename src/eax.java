import com.mojang.serialization.Codec;

public class eax extends ebj {
   public static final Codec<eax> a = Codec.unit(() -> eax.b);
   public static final eax b = new eax();

   private eax() {
   }

   @Override
   protected ebl<?> a() {
      return ebl.j;
   }
}
