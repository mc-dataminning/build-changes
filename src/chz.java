import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class chz extends cic<bxu> {
   @Override
   public Set<cgw<?>> a() {
      return ImmutableSet.of(cgw.j, cgw.k, cgw.l, cgw.m);
   }

   @Override
   protected void a(ars $$0, bxu $$1) {
      List<crx> $$2 = $$0.z()
         .stream()
         .filter(bxa.f)
         .filter($$1x -> $$1.a($$1x, this.a($$1)))
         .sorted(Comparator.comparingDouble($$1::g))
         .collect(Collectors.toList());
      byu<?> $$3 = $$1.ec();
      $$3.a(cgw.j, $$2);
      List<crx> $$4 = $$2.stream().filter($$2x -> b($$0, $$1, $$2x)).collect(Collectors.toList());
      $$3.a(cgw.k, $$4.isEmpty() ? null : $$4.get(0));
      List<crx> $$5 = $$4.stream().filter($$2x -> c($$0, $$1, $$2x)).toList();
      $$3.a(cgw.m, $$5);
      $$3.a(cgw.l, $$5.isEmpty() ? null : $$5.get(0));
   }

   protected double a(bxu $$0) {
      return $$0.h(bza.m);
   }
}
