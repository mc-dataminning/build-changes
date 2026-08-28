import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class cfo extends cfr<bvh> {
   @Override
   public Set<cel<?>> a() {
      return ImmutableSet.of(cel.j, cel.k, cel.l);
   }

   @Override
   protected void a(ard $$0, bvh $$1) {
      List<cox> $$2 = $$0.z()
         .stream()
         .filter(buq.f)
         .filter($$1x -> $$1.a($$1x, this.a($$1)))
         .sorted(Comparator.comparingDouble($$1::g))
         .collect(Collectors.toList());
      bwj<?> $$3 = $$1.eb();
      $$3.a(cel.j, $$2);
      List<cox> $$4 = $$2.stream().filter($$2x -> b($$0, $$1, $$2x)).collect(Collectors.toList());
      $$3.a(cel.k, $$4.isEmpty() ? null : $$4.get(0));
      Optional<cox> $$5 = $$4.stream().filter($$2x -> c($$0, $$1, $$2x)).findFirst();
      $$3.a(cel.l, $$5);
   }

   protected double a(bvh $$0) {
      return $$0.h(bwp.m);
   }
}
