import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.MapCodec;
import java.util.Set;

public class etj implements etn {
   private static final etj b = new etj();
   public static final MapCodec<etj> a = MapCodec.unit(b);

   private etj() {
   }

   @Override
   public eto b() {
      return etp.n;
   }

   @Override
   public Set<esw<?>> a() {
      return ImmutableSet.of(esz.j);
   }

   public boolean a(eqd $$0) {
      Float $$1 = $$0.c(esz.j);
      if ($$1 != null) {
         azc $$2 = $$0.b();
         float $$3 = 1.0F / $$1;
         return $$2.i() <= $$3;
      } else {
         return true;
      }
   }

   public static etn.a c() {
      return () -> b;
   }
}
