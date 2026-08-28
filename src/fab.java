import com.mojang.serialization.MapCodec;
import java.util.Set;

public class fab implements ezx {
   private static final fab b = new fab();
   public static final MapCodec<fab> a = MapCodec.unit(b);

   private fab() {
   }

   @Override
   public ezy b() {
      return ezz.g;
   }

   @Override
   public Set<bai<?>> a() {
      return Set.of(ezi.b);
   }

   public boolean a(ewo $$0) {
      return $$0.a(ezi.b);
   }

   public static ezx.a c() {
      return () -> b;
   }
}
