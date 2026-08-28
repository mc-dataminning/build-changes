import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.MapCodec;
import java.util.Set;

public class etx implements ett {
   private static final etx b = new etx();
   public static final MapCodec<etx> a = MapCodec.unit(b);

   private etx() {
   }

   @Override
   public etu b() {
      return etv.i;
   }

   @Override
   public Set<etc<?>> a() {
      return ImmutableSet.of(etf.b);
   }

   public boolean a(eqj $$0) {
      return $$0.a(etf.b);
   }

   public static ett.a c() {
      return () -> b;
   }
}
