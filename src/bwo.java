import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class bwo extends bwr<bmk> {
   @Override
   public Set<bvm<?>> a() {
      return ImmutableSet.of(bvm.j, bvm.k, bvm.l);
   }

   @Override
   protected void a(and $$0, bmk $$1) {
      List<cfh> $$2 = $$0.x().stream().filter(blx.f).filter($$1x -> $$1.a($$1x, 16.0)).sorted(Comparator.comparingDouble($$1::f)).collect(Collectors.toList());
      bnk<?> $$3 = $$1.dO();
      $$3.a(bvm.j, $$2);
      List<cfh> $$4 = $$2.stream().filter($$1x -> b($$1, $$1x)).collect(Collectors.toList());
      $$3.a(bvm.k, $$4.isEmpty() ? null : $$4.get(0));
      Optional<cfh> $$5 = $$4.stream().filter($$1x -> c($$1, $$1x)).findFirst();
      $$3.a(bvm.l, $$5);
   }
}
