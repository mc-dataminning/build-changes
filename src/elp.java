import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class elp implements elr {
   private static final elp b = new elp();
   public static final MapCodec<elp> a = MapCodec.unit(b);

   @Override
   public ud a(ayk $$0, @Nullable ud $$1) {
      return new ud();
   }

   @Override
   public els<?> a() {
      return els.a;
   }
}
