import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class bvd extends bvl<bli> {
   private static final long c = 32L;
   private static final long d = 16L;
   public static final int a = 32;

   @Override
   public Set<buh<?>> a() {
      return ImmutableSet.of(buh.K);
   }

   protected void a(ame $$0, bli $$1) {
      bmg<?> $$2 = $$1.dP();
      List<can> $$3 = $$0.a(can.class, $$1.cH().c(32.0, 16.0, 32.0), $$0x -> true);
      $$3.sort(Comparator.comparingDouble($$1::f));
      Optional<can> $$4 = $$3.stream().filter($$1x -> $$1.k($$1x.q())).filter($$1x -> $$1x.a($$1, 32.0)).filter($$1::E).findFirst();
      $$2.a(buh.K, $$4);
   }
}
