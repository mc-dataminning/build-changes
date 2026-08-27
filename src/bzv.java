import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class bzv extends bzy<bpp> {
   @Override
   public Set<bys<?>> a() {
      return ImmutableSet.of(bys.j, bys.k, bys.l);
   }

   @Override
   protected void a(apf $$0, bpp $$1) {
      List<ciu> $$2 = $$0.x().stream().filter(bpc.f).filter($$1x -> $$1.a($$1x, 16.0)).sorted(Comparator.comparingDouble($$1::g)).collect(Collectors.toList());
      bqq<?> $$3 = $$1.dP();
      $$3.a(bys.j, $$2);
      List<ciu> $$4 = $$2.stream().filter($$1x -> b($$1, $$1x)).collect(Collectors.toList());
      $$3.a(bys.k, $$4.isEmpty() ? null : $$4.get(0));
      Optional<ciu> $$5 = $$4.stream().filter($$1x -> c($$1, $$1x)).findFirst();
      $$3.a(bys.l, $$5);
   }
}
