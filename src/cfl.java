import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class cfl extends cfo<bve> {
   @Override
   public Set<cei<?>> a() {
      return ImmutableSet.of(cei.j, cei.k, cei.l);
   }

   @Override
   protected void a(arq $$0, bve $$1) {
      List<cor> $$2 = $$0.x()
         .stream()
         .filter(bun.f)
         .filter($$1x -> $$1.a($$1x, this.a($$1)))
         .sorted(Comparator.comparingDouble($$1::g))
         .collect(Collectors.toList());
      bwg<?> $$3 = $$1.ee();
      $$3.a(cei.j, $$2);
      List<cor> $$4 = $$2.stream().filter($$1x -> b($$1, $$1x)).collect(Collectors.toList());
      $$3.a(cei.k, $$4.isEmpty() ? null : $$4.get(0));
      Optional<cor> $$5 = $$4.stream().filter($$1x -> c($$1, $$1x)).findFirst();
      $$3.a(cei.l, $$5);
   }

   protected double a(bve $$0) {
      return $$0.h(bwm.m);
   }
}
