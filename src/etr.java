import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.MapCodec;
import java.util.Set;

public class etr implements etn {
   private static final etr b = new etr();
   public static final MapCodec<etr> a = MapCodec.unit(b);

   private etr() {
   }

   @Override
   public eto b() {
      return etp.i;
   }

   @Override
   public Set<esw<?>> a() {
      return ImmutableSet.of(esz.b);
   }

   public boolean a(eqd $$0) {
      return $$0.a(esz.b);
   }

   public static etn.a c() {
      return () -> b;
   }
}
