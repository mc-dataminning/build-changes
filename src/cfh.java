import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class cfh extends cfk<bva> {
   @Override
   public Set<cee<?>> a() {
      return ImmutableSet.of(cee.j, cee.k, cee.l);
   }

   @Override
   protected void a(arn $$0, bva $$1) {
      List<com> $$2 = $$0.x()
         .stream()
         .filter(buj.f)
         .filter($$1x -> $$1.a($$1x, this.a($$1)))
         .sorted(Comparator.comparingDouble($$1::g))
         .collect(Collectors.toList());
      bwc<?> $$3 = $$1.ed();
      $$3.a(cee.j, $$2);
      List<com> $$4 = $$2.stream().filter($$1x -> b($$1, $$1x)).collect(Collectors.toList());
      $$3.a(cee.k, $$4.isEmpty() ? null : $$4.get(0));
      Optional<com> $$5 = $$4.stream().filter($$1x -> c($$1, $$1x)).findFirst();
      $$3.a(cee.l, $$5);
   }

   protected double a(bva $$0) {
      return $$0.h(bwi.m);
   }
}
