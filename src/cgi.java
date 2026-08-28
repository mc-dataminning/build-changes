import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class cgi extends cgl<bwb> {
   @Override
   public Set<cff<?>> a() {
      return ImmutableSet.of(cff.j, cff.k, cff.l);
   }

   @Override
   protected void a(ash $$0, bwb $$1) {
      List<cps> $$2 = $$0.y()
         .stream()
         .filter(bvk.f)
         .filter($$1x -> $$1.a($$1x, this.a($$1)))
         .sorted(Comparator.comparingDouble($$1::g))
         .collect(Collectors.toList());
      bxd<?> $$3 = $$1.eb();
      $$3.a(cff.j, $$2);
      List<cps> $$4 = $$2.stream().filter($$2x -> b($$0, $$1, $$2x)).collect(Collectors.toList());
      $$3.a(cff.k, $$4.isEmpty() ? null : $$4.get(0));
      Optional<cps> $$5 = $$4.stream().filter($$2x -> c($$0, $$1, $$2x)).findFirst();
      $$3.a(cff.l, $$5);
   }

   protected double a(bwb $$0) {
      return $$0.h(bxj.m);
   }
}
