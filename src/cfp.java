import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class cfp extends cfs<bvi> {
   @Override
   public Set<cem<?>> a() {
      return ImmutableSet.of(cem.j, cem.k, cem.l);
   }

   @Override
   protected void a(ard $$0, bvi $$1) {
      List<coy> $$2 = $$0.z()
         .stream()
         .filter(bur.f)
         .filter($$1x -> $$1.a($$1x, this.a($$1)))
         .sorted(Comparator.comparingDouble($$1::g))
         .collect(Collectors.toList());
      bwk<?> $$3 = $$1.eb();
      $$3.a(cem.j, $$2);
      List<coy> $$4 = $$2.stream().filter($$2x -> b($$0, $$1, $$2x)).collect(Collectors.toList());
      $$3.a(cem.k, $$4.isEmpty() ? null : $$4.get(0));
      Optional<coy> $$5 = $$4.stream().filter($$2x -> c($$0, $$1, $$2x)).findFirst();
      $$3.a(cem.l, $$5);
   }

   protected double a(bvi $$0) {
      return $$0.h(bwq.m);
   }
}
