import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class cdr extends cdu<btk> {
   @Override
   public Set<cco<?>> a() {
      return ImmutableSet.of(cco.j, cco.k, cco.l);
   }

   @Override
   protected void a(arb $$0, btk $$1) {
      List<cms> $$2 = $$0.x().stream().filter(bsu.f).filter($$1x -> $$1.a($$1x, 16.0)).sorted(Comparator.comparingDouble($$1::g)).collect(Collectors.toList());
      bum<?> $$3 = $$1.dS();
      $$3.a(cco.j, $$2);
      List<cms> $$4 = $$2.stream().filter($$1x -> b($$1, $$1x)).collect(Collectors.toList());
      $$3.a(cco.k, $$4.isEmpty() ? null : $$4.get(0));
      Optional<cms> $$5 = $$4.stream().filter($$1x -> c($$1, $$1x)).findFirst();
      $$3.a(cco.l, $$5);
   }
}
