import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.MapCodec;
import java.util.Set;

public class etv implements etr {
   private static final etv b = new etv();
   public static final MapCodec<etv> a = MapCodec.unit(b);

   private etv() {
   }

   @Override
   public ets b() {
      return ett.i;
   }

   @Override
   public Set<eta<?>> a() {
      return ImmutableSet.of(etd.b);
   }

   public boolean a(eqh $$0) {
      return $$0.a(etd.b);
   }

   public static etr.a c() {
      return () -> b;
   }
}
