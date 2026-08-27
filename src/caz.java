import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class caz extends cbc<bqt> {
   @Override
   public Set<bzw<?>> a() {
      return ImmutableSet.of(bzw.j, bzw.k, bzw.l);
   }

   @Override
   protected void a(apu $$0, bqt $$1) {
      List<cka> $$2 = $$0.x().stream().filter(bqf.f).filter($$1x -> $$1.a($$1x, 16.0)).sorted(Comparator.comparingDouble($$1::g)).collect(Collectors.toList());
      bru<?> $$3 = $$1.dP();
      $$3.a(bzw.j, $$2);
      List<cka> $$4 = $$2.stream().filter($$1x -> b($$1, $$1x)).collect(Collectors.toList());
      $$3.a(bzw.k, $$4.isEmpty() ? null : $$4.get(0));
      Optional<cka> $$5 = $$4.stream().filter($$1x -> c($$1, $$1x)).findFirst();
      $$3.a(bzw.l, $$5);
   }
}
