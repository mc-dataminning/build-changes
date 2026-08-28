import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class cgn extends cgq<bwg> {
   @Override
   public Set<cfk<?>> a() {
      return ImmutableSet.of(cfk.j, cfk.k, cfk.l);
   }

   @Override
   protected void a(ash $$0, bwg $$1) {
      List<cpx> $$2 = $$0.y()
         .stream()
         .filter(bvp.f)
         .filter($$1x -> $$1.a($$1x, this.a($$1)))
         .sorted(Comparator.comparingDouble($$1::g))
         .collect(Collectors.toList());
      bxi<?> $$3 = $$1.ec();
      $$3.a(cfk.j, $$2);
      List<cpx> $$4 = $$2.stream().filter($$2x -> b($$0, $$1, $$2x)).collect(Collectors.toList());
      $$3.a(cfk.k, $$4.isEmpty() ? null : $$4.get(0));
      Optional<cpx> $$5 = $$4.stream().filter($$2x -> c($$0, $$1, $$2x)).findFirst();
      $$3.a(cfk.l, $$5);
   }

   protected double a(bwg $$0) {
      return $$0.h(bxo.m);
   }
}
