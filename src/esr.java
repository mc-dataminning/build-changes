import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.MapCodec;
import java.util.Set;

public class esr implements esn {
   private static final esr b = new esr();
   public static final MapCodec<esr> a = MapCodec.unit(b);

   private esr() {
   }

   @Override
   public eso b() {
      return esp.i;
   }

   @Override
   public Set<erw<?>> a() {
      return ImmutableSet.of(erz.b);
   }

   public boolean a(eph $$0) {
      return $$0.a(erz.b);
   }

   public static esn.a c() {
      return () -> b;
   }
}
