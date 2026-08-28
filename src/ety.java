import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.MapCodec;
import java.util.Set;

public class ety implements etu {
   private static final ety b = new ety();
   public static final MapCodec<ety> a = MapCodec.unit(b);

   private ety() {
   }

   @Override
   public etv b() {
      return etw.i;
   }

   @Override
   public Set<etd<?>> a() {
      return ImmutableSet.of(etg.b);
   }

   public boolean a(eqk $$0) {
      return $$0.a(etg.b);
   }

   public static etu.a c() {
      return () -> b;
   }
}
