import com.mojang.serialization.Codec;

public class dve extends dvq {
   public static final Codec<dve> a = Codec.unit(() -> dve.b);
   public static final dve b = new dve();

   private dve() {
   }

   @Override
   protected dvs<?> a() {
      return dvs.j;
   }
}
