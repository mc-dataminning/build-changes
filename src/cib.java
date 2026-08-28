import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class cib extends cie<bxw> {
   @Override
   public Set<cgy<?>> a() {
      return ImmutableSet.of(cgy.j, cgy.k, cgy.l, cgy.m);
   }

   @Override
   protected void a(aru $$0, bxw $$1) {
      List<crz> $$2 = $$0.z()
         .stream()
         .filter(bxc.f)
         .filter($$1x -> $$1.a($$1x, this.a($$1)))
         .sorted(Comparator.comparingDouble($$1::g))
         .collect(Collectors.toList());
      byw<?> $$3 = $$1.ec();
      $$3.a(cgy.j, $$2);
      List<crz> $$4 = $$2.stream().filter($$2x -> b($$0, $$1, $$2x)).collect(Collectors.toList());
      $$3.a(cgy.k, $$4.isEmpty() ? null : $$4.get(0));
      List<crz> $$5 = $$4.stream().filter($$2x -> c($$0, $$1, $$2x)).toList();
      $$3.a(cgy.m, $$5);
      $$3.a(cgy.l, $$5.isEmpty() ? null : $$5.get(0));
   }

   protected double a(bxw $$0) {
      return $$0.h(bzc.m);
   }
}
