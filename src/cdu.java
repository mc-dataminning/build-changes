import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class cdu extends cdx<btn> {
   @Override
   public Set<ccr<?>> a() {
      return ImmutableSet.of(ccr.j, ccr.k, ccr.l);
   }

   @Override
   protected void a(are $$0, btn $$1) {
      List<cmv> $$2 = $$0.x().stream().filter(bsx.f).filter($$1x -> $$1.a($$1x, 16.0)).sorted(Comparator.comparingDouble($$1::g)).collect(Collectors.toList());
      bup<?> $$3 = $$1.dS();
      $$3.a(ccr.j, $$2);
      List<cmv> $$4 = $$2.stream().filter($$1x -> b($$1, $$1x)).collect(Collectors.toList());
      $$3.a(ccr.k, $$4.isEmpty() ? null : $$4.get(0));
      Optional<cmv> $$5 = $$4.stream().filter($$1x -> c($$1, $$1x)).findFirst();
      $$3.a(ccr.l, $$5);
   }
}
