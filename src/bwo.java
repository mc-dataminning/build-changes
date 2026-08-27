import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class bwo extends bww<bmq> {
   private static final long c = 32L;
   private static final long d = 16L;
   public static final int a = 32;

   @Override
   public Set<bvq<?>> a() {
      return ImmutableSet.of(bvq.L);
   }

   protected void a(ane $$0, bmq $$1) {
      bno<?> $$2 = $$1.dN();
      List<ccb> $$3 = $$0.a(ccb.class, $$1.cH().c(32.0, 16.0, 32.0), $$0x -> true);
      $$3.sort(Comparator.comparingDouble($$1::f));
      Optional<ccb> $$4 = $$3.stream().filter($$1x -> $$1.k($$1x.q())).filter($$1x -> $$1x.a($$1, 32.0)).filter($$1::D).findFirst();
      $$2.a(bvq.L, $$4);
   }
}
