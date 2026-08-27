import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public class edm implements edn {
   public static final edm a = new edm();
   public static final Codec<edm> b = Codec.unit(a);

   @Nullable
   @Override
   public sn a(auu $$0, @Nullable sn $$1) {
      return $$1;
   }

   @Override
   public edo<?> a() {
      return edo.b;
   }
}
