import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.MapCodec;
import java.util.Set;

public class etm implements etq {
   private static final etm b = new etm();
   public static final MapCodec<etm> a = MapCodec.unit(b);

   private etm() {
   }

   @Override
   public etr b() {
      return ets.n;
   }

   @Override
   public Set<esz<?>> a() {
      return ImmutableSet.of(etc.j);
   }

   public boolean a(eqg $$0) {
      Float $$1 = $$0.c(etc.j);
      if ($$1 != null) {
         azf $$2 = $$0.b();
         float $$3 = 1.0F / $$1;
         return $$2.i() <= $$3;
      } else {
         return true;
      }
   }

   public static etq.a c() {
      return () -> b;
   }
}
