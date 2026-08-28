import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.MapCodec;
import java.util.Set;

public class exr implements exn {
   private static final exr b = new exr();
   public static final MapCodec<exr> a = MapCodec.unit(b);

   private exr() {
   }

   @Override
   public exo b() {
      return exp.g;
   }

   @Override
   public Set<ewv<?>> a() {
      return ImmutableSet.of(ewy.b);
   }

   public boolean a(euc $$0) {
      return $$0.a(ewy.b);
   }

   public static exn.a c() {
      return () -> b;
   }
}
