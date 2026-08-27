import com.mojang.serialization.Codec;

public class ecq extends edc {
   public static final Codec<ecq> a = Codec.unit(() -> ecq.b);
   public static final ecq b = new ecq();

   private ecq() {
   }

   @Override
   protected ede<?> a() {
      return ede.j;
   }
}
