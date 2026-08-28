import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.MapCodec;
import java.util.Set;

public class etw implements ets {
   private static final etw b = new etw();
   public static final MapCodec<etw> a = MapCodec.unit(b);

   private etw() {
   }

   @Override
   public ett b() {
      return etu.i;
   }

   @Override
   public Set<etb<?>> a() {
      return ImmutableSet.of(ete.b);
   }

   public boolean a(eqi $$0) {
      return $$0.a(ete.b);
   }

   public static ets.a c() {
      return () -> b;
   }
}
