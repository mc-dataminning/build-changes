import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class cgf extends cgi<bvy> {
   @Override
   public Set<cfc<?>> a() {
      return ImmutableSet.of(cfc.j, cfc.k, cfc.l);
   }

   @Override
   protected void a(ard $$0, bvy $$1) {
      List<cpr> $$2 = $$0.z()
         .stream()
         .filter(bvg.f)
         .filter($$1x -> $$1.a($$1x, this.a($$1)))
         .sorted(Comparator.comparingDouble($$1::g))
         .collect(Collectors.toList());
      bxa<?> $$3 = $$1.ea();
      $$3.a(cfc.j, $$2);
      List<cpr> $$4 = $$2.stream().filter($$2x -> b($$0, $$1, $$2x)).collect(Collectors.toList());
      $$3.a(cfc.k, $$4.isEmpty() ? null : $$4.get(0));
      Optional<cpr> $$5 = $$4.stream().filter($$2x -> c($$0, $$1, $$2x)).findFirst();
      $$3.a(cfc.l, $$5);
   }

   protected double a(bvy $$0) {
      return $$0.h(bxg.m);
   }
}
