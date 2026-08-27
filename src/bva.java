import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class bva extends bvd<bky> {
   @Override
   public Set<btz<?>> a() {
      return ImmutableSet.of(btz.j, btz.k, btz.l);
   }

   @Override
   protected void a(ama $$0, bky $$1) {
      List<cdm> $$2 = $$0.v().stream().filter(bkl.f).filter($$1x -> $$1.a($$1x, 16.0)).sorted(Comparator.comparingDouble($$1::f)).collect(Collectors.toList());
      bly<?> $$3 = $$1.dN();
      $$3.a(btz.j, $$2);
      List<cdm> $$4 = $$2.stream().filter($$1x -> b($$1, $$1x)).collect(Collectors.toList());
      $$3.a(btz.k, $$4.isEmpty() ? null : $$4.get(0));
      Optional<cdm> $$5 = $$4.stream().filter($$1x -> c($$1, $$1x)).findFirst();
      $$3.a(btz.l, $$5);
   }
}
