import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class chh extends chk<bxc> {
   @Override
   public Set<cge<?>> a() {
      return ImmutableSet.of(cge.j, cge.k, cge.l, cge.m);
   }

   @Override
   protected void a(arq $$0, bxc $$1) {
      List<cqy> $$2 = $$0.z()
         .stream()
         .filter(bwk.f)
         .filter($$1x -> $$1.a($$1x, this.a($$1)))
         .sorted(Comparator.comparingDouble($$1::g))
         .collect(Collectors.toList());
      byc<?> $$3 = $$1.eb();
      $$3.a(cge.j, $$2);
      List<cqy> $$4 = $$2.stream().filter($$2x -> b($$0, $$1, $$2x)).collect(Collectors.toList());
      $$3.a(cge.k, $$4.isEmpty() ? null : $$4.get(0));
      List<cqy> $$5 = $$4.stream().filter($$2x -> c($$0, $$1, $$2x)).toList();
      $$3.a(cge.m, $$5);
      $$3.a(cge.l, $$5.isEmpty() ? null : $$5.get(0));
   }

   protected double a(bxc $$0) {
      return $$0.h(byi.m);
   }
}
