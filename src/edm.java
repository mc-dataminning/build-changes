import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public class edm implements edo {
   private static final edm b = new edm();
   public static final Codec<edm> a = Codec.unit(b);

   @Override
   public sn a(auv $$0, @Nullable sn $$1) {
      return new sn();
   }

   @Override
   public edp<?> a() {
      return edp.a;
   }
}
