import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class byk extends byn<bog> {
   @Override
   public Set<bxh<?>> a() {
      return ImmutableSet.of(bxh.j, bxh.k, bxh.l);
   }

   @Override
   protected void a(aov $$0, bog $$1) {
      List<chh> $$2 = $$0.x().stream().filter(bnt.f).filter($$1x -> $$1.a($$1x, 16.0)).sorted(Comparator.comparingDouble($$1::f)).collect(Collectors.toList());
      bpf<?> $$3 = $$1.dO();
      $$3.a(bxh.j, $$2);
      List<chh> $$4 = $$2.stream().filter($$1x -> b($$1, $$1x)).collect(Collectors.toList());
      $$3.a(bxh.k, $$4.isEmpty() ? null : $$4.get(0));
      Optional<chh> $$5 = $$4.stream().filter($$1x -> c($$1, $$1x)).findFirst();
      $$3.a(bxh.l, $$5);
   }
}
