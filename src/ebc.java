import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public class ebc implements ebd {
   public static final ebc a = new ebc();
   public static final Codec<ebc> b = Codec.unit(a);

   @Nullable
   @Override
   public rz a(ato $$0, @Nullable rz $$1) {
      return $$1;
   }

   @Override
   public ebe<?> a() {
      return ebe.b;
   }
}
