import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class elr implements elt {
   private static final elr b = new elr();
   public static final MapCodec<elr> a = MapCodec.unit(b);

   @Override
   public ud a(aym $$0, @Nullable ud $$1) {
      return new ud();
   }

   @Override
   public elu<?> a() {
      return elu.a;
   }
}
