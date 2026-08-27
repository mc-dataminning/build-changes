import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class ccv extends ccy<bso> {
   @Override
   public Set<cbs<?>> a() {
      return ImmutableSet.of(cbs.j, cbs.k, cbs.l);
   }

   @Override
   protected void a(aqm $$0, bso $$1) {
      List<clw> $$2 = $$0.x().stream().filter(brz.f).filter($$1x -> $$1.a($$1x, 16.0)).sorted(Comparator.comparingDouble($$1::g)).collect(Collectors.toList());
      btq<?> $$3 = $$1.dS();
      $$3.a(cbs.j, $$2);
      List<clw> $$4 = $$2.stream().filter($$1x -> b($$1, $$1x)).collect(Collectors.toList());
      $$3.a(cbs.k, $$4.isEmpty() ? null : $$4.get(0));
      Optional<clw> $$5 = $$4.stream().filter($$1x -> c($$1, $$1x)).findFirst();
      $$3.a(cbs.l, $$5);
   }
}
