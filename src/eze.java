import com.mojang.serialization.MapCodec;
import java.util.Set;

public class eze implements eza {
   private static final eze b = new eze();
   public static final MapCodec<eze> a = MapCodec.unit(b);

   private eze() {
   }

   @Override
   public ezb b() {
      return ezc.g;
   }

   @Override
   public Set<bai<?>> a() {
      return Set.of(eyl.b);
   }

   public boolean a(evr $$0) {
      return $$0.a(eyl.b);
   }

   public static eza.a c() {
      return () -> b;
   }
}
