import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.MapCodec;
import java.util.Set;

public class euy implements evc {
   private static final euy b = new euy();
   public static final MapCodec<euy> a = MapCodec.unit(b);

   private euy() {
   }

   @Override
   public evd b() {
      return eve.l;
   }

   @Override
   public Set<euk<?>> a() {
      return ImmutableSet.of(eun.j);
   }

   public boolean a(err $$0) {
      Float $$1 = $$0.c(eun.j);
      if ($$1 != null) {
         ayw $$2 = $$0.b();
         float $$3 = 1.0F / $$1;
         return $$2.i() <= $$3;
      } else {
         return true;
      }
   }

   public static evc.a c() {
      return () -> b;
   }
}
