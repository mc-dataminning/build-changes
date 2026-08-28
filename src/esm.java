import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class esm implements esn {
   public static final esm a = new esm();
   public static final MapCodec<esm> b = MapCodec.unit(a);

   @Nullable
   @Override
   public um a(bac $$0, @Nullable um $$1) {
      return $$1;
   }

   @Override
   public eso<?> a() {
      return eso.b;
   }
}
