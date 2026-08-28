import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.MapCodec;
import java.util.Set;

public class etp implements ett {
   private static final etp b = new etp();
   public static final MapCodec<etp> a = MapCodec.unit(b);

   private etp() {
   }

   @Override
   public etu b() {
      return etv.n;
   }

   @Override
   public Set<etc<?>> a() {
      return ImmutableSet.of(etf.j);
   }

   public boolean a(eqj $$0) {
      Float $$1 = $$0.c(etf.j);
      if ($$1 != null) {
         azh $$2 = $$0.b();
         float $$3 = 1.0F / $$1;
         return $$2.i() <= $$3;
      } else {
         return true;
      }
   }

   public static ett.a c() {
      return () -> b;
   }
}
