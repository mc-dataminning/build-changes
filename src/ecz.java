import com.mojang.serialization.Codec;

public class ecz extends edl {
   public static final Codec<ecz> a = Codec.unit(() -> ecz.b);
   public static final ecz b = new ecz();

   private ecz() {
   }

   @Override
   protected edn<?> a() {
      return edn.j;
   }
}
