import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class cgw extends cgz<bwr> {
   @Override
   public Set<cft<?>> a() {
      return ImmutableSet.of(cft.j, cft.k, cft.l, cft.m);
   }

   @Override
   protected void a(arn $$0, bwr $$1) {
      List<cqi> $$2 = $$0.z()
         .stream()
         .filter(bvz.f)
         .filter($$1x -> $$1.a($$1x, this.a($$1)))
         .sorted(Comparator.comparingDouble($$1::g))
         .collect(Collectors.toList());
      bxr<?> $$3 = $$1.eb();
      $$3.a(cft.j, $$2);
      List<cqi> $$4 = $$2.stream().filter($$2x -> b($$0, $$1, $$2x)).collect(Collectors.toList());
      $$3.a(cft.k, $$4.isEmpty() ? null : $$4.get(0));
      List<cqi> $$5 = $$4.stream().filter($$2x -> c($$0, $$1, $$2x)).toList();
      $$3.a(cft.m, $$5);
      $$3.a(cft.l, $$5.isEmpty() ? null : $$5.get(0));
   }

   protected double a(bwr $$0) {
      return $$0.h(bxx.m);
   }
}
