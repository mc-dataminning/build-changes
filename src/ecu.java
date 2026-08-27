import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public class ecu implements ecw {
   private static final ecu b = new ecu();
   public static final Codec<ecu> a = Codec.unit(b);

   @Override
   public sj a(auf $$0, @Nullable sj $$1) {
      return new sj();
   }

   @Override
   public ecx<?> a() {
      return ecx.a;
   }
}
