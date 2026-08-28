import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.MapCodec;
import java.util.Set;

public class etn implements etr {
   private static final etn b = new etn();
   public static final MapCodec<etn> a = MapCodec.unit(b);

   private etn() {
   }

   @Override
   public ets b() {
      return ett.n;
   }

   @Override
   public Set<eta<?>> a() {
      return ImmutableSet.of(etd.j);
   }

   public boolean a(eqh $$0) {
      Float $$1 = $$0.c(etd.j);
      if ($$1 != null) {
         azg $$2 = $$0.b();
         float $$3 = 1.0F / $$1;
         return $$2.i() <= $$3;
      } else {
         return true;
      }
   }

   public static etr.a c() {
      return () -> b;
   }
}
