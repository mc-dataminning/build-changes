import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class bta extends btd<biy> {
   @Override
   public Set<brz<?>> a() {
      return ImmutableSet.of(brz.j, brz.k, brz.l);
   }

   @Override
   protected void a(akk $$0, biy $$1) {
      List<cbm> $$2 = $$0.v().stream().filter(bil.f).filter($$1x -> $$1.a($$1x, 16.0)).sorted(Comparator.comparingDouble($$1::f)).collect(Collectors.toList());
      bjy<?> $$3 = $$1.dM();
      $$3.a(brz.j, $$2);
      List<cbm> $$4 = $$2.stream().filter($$1x -> b($$1, $$1x)).collect(Collectors.toList());
      $$3.a(brz.k, $$4.isEmpty() ? null : $$4.get(0));
      Optional<cbm> $$5 = $$4.stream().filter($$1x -> c($$1, $$1x)).findFirst();
      $$3.a(brz.l, $$5);
   }
}
