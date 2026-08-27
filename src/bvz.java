import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class bvz extends bwc<blv> {
   @Override
   public Set<bux<?>> a() {
      return ImmutableSet.of(bux.j, bux.k, bux.l);
   }

   @Override
   protected void a(amp $$0, blv $$1) {
      List<cer> $$2 = $$0.w().stream().filter(bli.f).filter($$1x -> $$1.a($$1x, 16.0)).sorted(Comparator.comparingDouble($$1::f)).collect(Collectors.toList());
      bmv<?> $$3 = $$1.dO();
      $$3.a(bux.j, $$2);
      List<cer> $$4 = $$2.stream().filter($$1x -> b($$1, $$1x)).collect(Collectors.toList());
      $$3.a(bux.k, $$4.isEmpty() ? null : $$4.get(0));
      Optional<cer> $$5 = $$4.stream().filter($$1x -> c($$1, $$1x)).findFirst();
      $$3.a(bux.l, $$5);
   }
}
