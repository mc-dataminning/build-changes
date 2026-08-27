import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class bwj extends bwm<bmf> {
   @Override
   public Set<bvh<?>> a() {
      return ImmutableSet.of(bvh.j, bvh.k, bvh.l);
   }

   @Override
   protected void a(amz $$0, bmf $$1) {
      List<cfb> $$2 = $$0.x().stream().filter(bls.f).filter($$1x -> $$1.a($$1x, 16.0)).sorted(Comparator.comparingDouble($$1::f)).collect(Collectors.toList());
      bnf<?> $$3 = $$1.dO();
      $$3.a(bvh.j, $$2);
      List<cfb> $$4 = $$2.stream().filter($$1x -> b($$1, $$1x)).collect(Collectors.toList());
      $$3.a(bvh.k, $$4.isEmpty() ? null : $$4.get(0));
      Optional<cfb> $$5 = $$4.stream().filter($$1x -> c($$1, $$1x)).findFirst();
      $$3.a(bvh.l, $$5);
   }
}
