import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class btb extends bte<biy> {
   @Override
   public Set<bsa<?>> a() {
      return ImmutableSet.of(bsa.j, bsa.k, bsa.l);
   }

   @Override
   protected void a(akk $$0, biy $$1) {
      List<cbn> $$2 = $$0.v().stream().filter(bil.f).filter($$1x -> $$1.a($$1x, 16.0)).sorted(Comparator.comparingDouble($$1::f)).collect(Collectors.toList());
      bjz<?> $$3 = $$1.dM();
      $$3.a(bsa.j, $$2);
      List<cbn> $$4 = $$2.stream().filter($$1x -> b($$1, $$1x)).collect(Collectors.toList());
      $$3.a(bsa.k, $$4.isEmpty() ? null : $$4.get(0));
      Optional<cbn> $$5 = $$4.stream().filter($$1x -> c($$1, $$1x)).findFirst();
      $$3.a(bsa.l, $$5);
   }
}
