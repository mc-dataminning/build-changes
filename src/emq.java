import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class emq implements ems {
   private static final emq b = new emq();
   public static final MapCodec<emq> a = MapCodec.unit(b);

   @Override
   public us a(azh $$0, @Nullable us $$1) {
      return new us();
   }

   @Override
   public emt<?> a() {
      return emt.a;
   }
}
