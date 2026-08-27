import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class bwe extends bwm<bmh> {
   private static final long c = 32L;
   private static final long d = 16L;
   public static final int a = 32;

   @Override
   public Set<bvh<?>> a() {
      return ImmutableSet.of(bvh.K);
   }

   protected void a(amz $$0, bmh $$1) {
      bnf<?> $$2 = $$1.dO();
      List<cbo> $$3 = $$0.a(cbo.class, $$1.cH().c(32.0, 16.0, 32.0), $$0x -> true);
      $$3.sort(Comparator.comparingDouble($$1::f));
      Optional<cbo> $$4 = $$3.stream().filter($$1x -> $$1.k($$1x.q())).filter($$1x -> $$1x.a($$1, 32.0)).filter($$1::E).findFirst();
      $$2.a(bvh.K, $$4);
   }
}
