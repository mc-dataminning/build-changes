import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class cet extends cew<bun> {
   @Override
   public Set<cdq<?>> a() {
      return ImmutableSet.of(cdq.j, cdq.k, cdq.l);
   }

   @Override
   protected void a(arj $$0, bun $$1) {
      List<cnx> $$2 = $$0.x()
         .stream()
         .filter(btw.f)
         .filter($$1x -> $$1.a($$1x, this.a($$1)))
         .sorted(Comparator.comparingDouble($$1::g))
         .collect(Collectors.toList());
      bvo<?> $$3 = $$1.dY();
      $$3.a(cdq.j, $$2);
      List<cnx> $$4 = $$2.stream().filter($$1x -> b($$1, $$1x)).collect(Collectors.toList());
      $$3.a(cdq.k, $$4.isEmpty() ? null : $$4.get(0));
      Optional<cnx> $$5 = $$4.stream().filter($$1x -> c($$1, $$1x)).findFirst();
      $$3.a(cdq.l, $$5);
   }

   protected double a(bun $$0) {
      return $$0.h(bvu.m);
   }
}
