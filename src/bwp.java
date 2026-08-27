import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class bwp extends bws<bml> {
   @Override
   public Set<bvn<?>> a() {
      return ImmutableSet.of(bvn.j, bvn.k, bvn.l);
   }

   @Override
   protected void a(and $$0, bml $$1) {
      List<cfi> $$2 = $$0.x().stream().filter(bly.f).filter($$1x -> $$1.a($$1x, 16.0)).sorted(Comparator.comparingDouble($$1::f)).collect(Collectors.toList());
      bnl<?> $$3 = $$1.dO();
      $$3.a(bvn.j, $$2);
      List<cfi> $$4 = $$2.stream().filter($$1x -> b($$1, $$1x)).collect(Collectors.toList());
      $$3.a(bvn.k, $$4.isEmpty() ? null : $$4.get(0));
      Optional<cfi> $$5 = $$4.stream().filter($$1x -> c($$1, $$1x)).findFirst();
      $$3.a(bvn.l, $$5);
   }
}
