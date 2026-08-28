import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class cfm extends cfp<bvf> {
   @Override
   public Set<cej<?>> a() {
      return ImmutableSet.of(cej.j, cej.k, cej.l);
   }

   @Override
   protected void a(arc $$0, bvf $$1) {
      List<cov> $$2 = $$0.z()
         .stream()
         .filter(buo.f)
         .filter($$1x -> $$1.a($$1x, this.a($$1)))
         .sorted(Comparator.comparingDouble($$1::g))
         .collect(Collectors.toList());
      bwh<?> $$3 = $$1.ec();
      $$3.a(cej.j, $$2);
      List<cov> $$4 = $$2.stream().filter($$2x -> b($$0, $$1, $$2x)).collect(Collectors.toList());
      $$3.a(cej.k, $$4.isEmpty() ? null : $$4.get(0));
      Optional<cov> $$5 = $$4.stream().filter($$2x -> c($$0, $$1, $$2x)).findFirst();
      $$3.a(cej.l, $$5);
   }

   protected double a(bvf $$0) {
      return $$0.h(bwn.m);
   }
}
