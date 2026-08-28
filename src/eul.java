import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.MapCodec;
import java.util.Set;

public class eul implements euh {
   private static final eul b = new eul();
   public static final MapCodec<eul> a = MapCodec.unit(b);

   private eul() {
   }

   @Override
   public eui b() {
      return euj.g;
   }

   @Override
   public Set<etp<?>> a() {
      return ImmutableSet.of(ets.b);
   }

   public boolean a(eqw $$0) {
      return $$0.a(ets.b);
   }

   public static euh.a c() {
      return () -> b;
   }
}
