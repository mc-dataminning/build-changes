import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class ccg extends ccj<bsa> {
   @Override
   public Set<cbd<?>> a() {
      return ImmutableSet.of(cbd.j, cbd.k, cbd.l);
   }

   @Override
   protected void a(aqh $$0, bsa $$1) {
      List<clh> $$2 = $$0.x().stream().filter(brm.f).filter($$1x -> $$1.a($$1x, 16.0)).sorted(Comparator.comparingDouble($$1::g)).collect(Collectors.toList());
      btb<?> $$3 = $$1.dQ();
      $$3.a(cbd.j, $$2);
      List<clh> $$4 = $$2.stream().filter($$1x -> b($$1, $$1x)).collect(Collectors.toList());
      $$3.a(cbd.k, $$4.isEmpty() ? null : $$4.get(0));
      Optional<clh> $$5 = $$4.stream().filter($$1x -> c($$1, $$1x)).findFirst();
      $$3.a(cbd.l, $$5);
   }
}
