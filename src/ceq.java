import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class ceq extends cet<buk> {
   @Override
   public Set<cdn<?>> a() {
      return ImmutableSet.of(cdn.j, cdn.k, cdn.l);
   }

   @Override
   protected void a(arh $$0, buk $$1) {
      List<cnu> $$2 = $$0.x()
         .stream()
         .filter(btt.f)
         .filter($$1x -> $$1.a($$1x, this.a($$1)))
         .sorted(Comparator.comparingDouble($$1::g))
         .collect(Collectors.toList());
      bvl<?> $$3 = $$1.dX();
      $$3.a(cdn.j, $$2);
      List<cnu> $$4 = $$2.stream().filter($$1x -> b($$1, $$1x)).collect(Collectors.toList());
      $$3.a(cdn.k, $$4.isEmpty() ? null : $$4.get(0));
      Optional<cnu> $$5 = $$4.stream().filter($$1x -> c($$1, $$1x)).findFirst();
      $$3.a(cdn.l, $$5);
   }

   protected double a(buk $$0) {
      return $$0.h(bvr.m);
   }
}
