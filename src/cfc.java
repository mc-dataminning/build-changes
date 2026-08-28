import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class cfc extends cff<buv> {
   @Override
   public Set<cdz<?>> a() {
      return ImmutableSet.of(cdz.j, cdz.k, cdz.l);
   }

   @Override
   protected void a(arm $$0, buv $$1) {
      List<coh> $$2 = $$0.x()
         .stream()
         .filter(bue.f)
         .filter($$1x -> $$1.a($$1x, this.a($$1)))
         .sorted(Comparator.comparingDouble($$1::g))
         .collect(Collectors.toList());
      bvx<?> $$3 = $$1.ed();
      $$3.a(cdz.j, $$2);
      List<coh> $$4 = $$2.stream().filter($$1x -> b($$1, $$1x)).collect(Collectors.toList());
      $$3.a(cdz.k, $$4.isEmpty() ? null : $$4.get(0));
      Optional<coh> $$5 = $$4.stream().filter($$1x -> c($$1, $$1x)).findFirst();
      $$3.a(cdz.l, $$5);
   }

   protected double a(buv $$0) {
      return $$0.h(bwd.m);
   }
}
