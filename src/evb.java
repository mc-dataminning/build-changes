import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class evb implements evd {
   private static final evb b = new evb();
   public static final MapCodec<evb> a = MapCodec.unit(b);

   @Override
   public tz a(azv $$0, @Nullable tz $$1) {
      return new tz();
   }

   @Override
   public eve<?> a() {
      return eve.a;
   }
}
