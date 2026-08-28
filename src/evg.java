import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.MapCodec;
import java.util.Set;

public class evg implements evc {
   private static final evg b = new evg();
   public static final MapCodec<evg> a = MapCodec.unit(b);

   private evg() {
   }

   @Override
   public evd b() {
      return eve.g;
   }

   @Override
   public Set<euk<?>> a() {
      return ImmutableSet.of(eun.b);
   }

   public boolean a(err $$0) {
      return $$0.a(eun.b);
   }

   public static evc.a c() {
      return () -> b;
   }
}
