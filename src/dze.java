import com.mojang.serialization.Codec;

public class dze extends dzq {
   public static final Codec<dze> a = Codec.unit(() -> dze.b);
   public static final dze b = new dze();

   private dze() {
   }

   @Override
   protected dzs<?> a() {
      return dzs.j;
   }
}
