import com.mojang.serialization.Codec;

public class eep extends efb {
   public static final Codec<eep> a = Codec.unit(() -> eep.b);
   public static final eep b = new eep();

   private eep() {
   }

   @Override
   protected efd<?> a() {
      return efd.j;
   }
}
