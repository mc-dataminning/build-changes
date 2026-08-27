import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public class edn implements edo {
   public static final edn a = new edn();
   public static final Codec<edn> b = Codec.unit(a);

   @Nullable
   @Override
   public sn a(auv $$0, @Nullable sn $$1) {
      return $$1;
   }

   @Override
   public edp<?> a() {
      return edp.b;
   }
}
