import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.MapCodec;
import java.util.Set;

public class exv implements exr {
   private static final exv b = new exv();
   public static final MapCodec<exv> a = MapCodec.unit(b);

   private exv() {
   }

   @Override
   public exs b() {
      return ext.g;
   }

   @Override
   public Set<ewz<?>> a() {
      return ImmutableSet.of(exc.b);
   }

   public boolean a(eug $$0) {
      return $$0.a(exc.b);
   }

   public static exr.a c() {
      return () -> b;
   }
}
