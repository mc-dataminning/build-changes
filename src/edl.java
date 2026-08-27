import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public class edl implements edn {
   private static final edl b = new edl();
   public static final Codec<edl> a = Codec.unit(b);

   @Override
   public sn a(auu $$0, @Nullable sn $$1) {
      return new sn();
   }

   @Override
   public edo<?> a() {
      return edo.a;
   }
}
