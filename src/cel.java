import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class cel extends ceo<buf> {
   @Override
   public Set<cdi<?>> a() {
      return ImmutableSet.of(cdi.j, cdi.k, cdi.l);
   }

   @Override
   protected void a(arg $$0, buf $$1) {
      List<cnp> $$2 = $$0.x()
         .stream()
         .filter(bto.f)
         .filter($$1x -> $$1.a($$1x, this.a($$1)))
         .sorted(Comparator.comparingDouble($$1::g))
         .collect(Collectors.toList());
      bvg<?> $$3 = $$1.dX();
      $$3.a(cdi.j, $$2);
      List<cnp> $$4 = $$2.stream().filter($$1x -> b($$1, $$1x)).collect(Collectors.toList());
      $$3.a(cdi.k, $$4.isEmpty() ? null : $$4.get(0));
      Optional<cnp> $$5 = $$4.stream().filter($$1x -> c($$1, $$1x)).findFirst();
      $$3.a(cdi.l, $$5);
   }

   protected double a(buf $$0) {
      return $$0.h(bvm.m);
   }
}
