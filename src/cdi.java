import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class cdi extends cdl<btb> {
   @Override
   public Set<ccf<?>> a() {
      return ImmutableSet.of(ccf.j, ccf.k, ccf.l);
   }

   @Override
   protected void a(aqm $$0, btb $$1) {
      List<cmk> $$2 = $$0.x().stream().filter(bsl.f).filter($$1x -> $$1.a($$1x, 16.0)).sorted(Comparator.comparingDouble($$1::g)).collect(Collectors.toList());
      bud<?> $$3 = $$1.dU();
      $$3.a(ccf.j, $$2);
      List<cmk> $$4 = $$2.stream().filter($$1x -> b($$1, $$1x)).collect(Collectors.toList());
      $$3.a(ccf.k, $$4.isEmpty() ? null : $$4.get(0));
      Optional<cmk> $$5 = $$4.stream().filter($$1x -> c($$1, $$1x)).findFirst();
      $$3.a(ccf.l, $$5);
   }
}
