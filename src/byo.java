import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class byo extends byr<boi> {
   @Override
   public Set<bxl<?>> a() {
      return ImmutableSet.of(bxl.j, bxl.k, bxl.l);
   }

   @Override
   protected void a(aow $$0, boi $$1) {
      List<chl> $$2 = $$0.x().stream().filter(bnv.f).filter($$1x -> $$1.a($$1x, 16.0)).sorted(Comparator.comparingDouble($$1::f)).collect(Collectors.toList());
      bpj<?> $$3 = $$1.dO();
      $$3.a(bxl.j, $$2);
      List<chl> $$4 = $$2.stream().filter($$1x -> b($$1, $$1x)).collect(Collectors.toList());
      $$3.a(bxl.k, $$4.isEmpty() ? null : $$4.get(0));
      Optional<chl> $$5 = $$4.stream().filter($$1x -> c($$1, $$1x)).findFirst();
      $$3.a(bxl.l, $$5);
   }
}
