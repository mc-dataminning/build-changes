import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.MapCodec;
import java.util.Set;

public class eud implements euh {
   private static final eud b = new eud();
   public static final MapCodec<eud> a = MapCodec.unit(b);

   private eud() {
   }

   @Override
   public eui b() {
      return euj.l;
   }

   @Override
   public Set<etp<?>> a() {
      return ImmutableSet.of(ets.j);
   }

   public boolean a(eqw $$0) {
      Float $$1 = $$0.c(ets.j);
      if ($$1 != null) {
         ayo $$2 = $$0.b();
         float $$3 = 1.0F / $$1;
         return $$2.i() <= $$3;
      } else {
         return true;
      }
   }

   public static euh.a c() {
      return () -> b;
   }
}
