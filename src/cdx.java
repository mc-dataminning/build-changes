import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class cdx extends cea<btq> {
   @Override
   public Set<ccu<?>> a() {
      return ImmutableSet.of(ccu.j, ccu.k, ccu.l);
   }

   @Override
   protected void a(arf $$0, btq $$1) {
      List<cmy> $$2 = $$0.x().stream().filter(bta.f).filter($$1x -> $$1.a($$1x, 16.0)).sorted(Comparator.comparingDouble($$1::g)).collect(Collectors.toList());
      bus<?> $$3 = $$1.dS();
      $$3.a(ccu.j, $$2);
      List<cmy> $$4 = $$2.stream().filter($$1x -> b($$1, $$1x)).collect(Collectors.toList());
      $$3.a(ccu.k, $$4.isEmpty() ? null : $$4.get(0));
      Optional<cmy> $$5 = $$4.stream().filter($$1x -> c($$1, $$1x)).findFirst();
      $$3.a(ccu.l, $$5);
   }
}
