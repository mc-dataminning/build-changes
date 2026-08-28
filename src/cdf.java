import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class cdf extends cdi<bsy> {
   @Override
   public Set<ccc<?>> a() {
      return ImmutableSet.of(ccc.j, ccc.k, ccc.l);
   }

   @Override
   protected void a(aqk $$0, bsy $$1) {
      List<cmh> $$2 = $$0.x().stream().filter(bsi.f).filter($$1x -> $$1.a($$1x, 16.0)).sorted(Comparator.comparingDouble($$1::g)).collect(Collectors.toList());
      bua<?> $$3 = $$1.dT();
      $$3.a(ccc.j, $$2);
      List<cmh> $$4 = $$2.stream().filter($$1x -> b($$1, $$1x)).collect(Collectors.toList());
      $$3.a(ccc.k, $$4.isEmpty() ? null : $$4.get(0));
      Optional<cmh> $$5 = $$4.stream().filter($$1x -> c($$1, $$1x)).findFirst();
      $$3.a(ccc.l, $$5);
   }
}
