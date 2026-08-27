import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class bsz extends btc<biw> {
   @Override
   public Set<bry<?>> a() {
      return ImmutableSet.of(bry.j, bry.k, bry.l);
   }

   @Override
   protected void a(aki $$0, biw $$1) {
      List<cbl> $$2 = $$0.v().stream().filter(bij.f).filter($$1x -> $$1.a($$1x, 16.0)).sorted(Comparator.comparingDouble($$1::f)).collect(Collectors.toList());
      bjx<?> $$3 = $$1.dM();
      $$3.a(bry.j, $$2);
      List<cbl> $$4 = $$2.stream().filter($$1x -> b($$1, $$1x)).collect(Collectors.toList());
      $$3.a(bry.k, $$4.isEmpty() ? null : $$4.get(0));
      Optional<cbl> $$5 = $$4.stream().filter($$1x -> c($$1, $$1x)).findFirst();
      $$3.a(bry.l, $$5);
   }
}
