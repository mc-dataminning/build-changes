import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.MapCodec;
import java.util.Set;

public class eyc implements exy {
   private static final eyc b = new eyc();
   public static final MapCodec<eyc> a = MapCodec.unit(b);

   private eyc() {
   }

   @Override
   public exz b() {
      return eya.g;
   }

   @Override
   public Set<exg<?>> a() {
      return ImmutableSet.of(exj.b);
   }

   public boolean a(eun $$0) {
      return $$0.a(exj.b);
   }

   public static exy.a c() {
      return () -> b;
   }
}
