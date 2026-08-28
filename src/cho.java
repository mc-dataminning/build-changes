import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class cho extends chr<bxj> {
   @Override
   public Set<cgl<?>> a() {
      return ImmutableSet.of(cgl.j, cgl.k, cgl.l, cgl.m);
   }

   @Override
   protected void a(arq $$0, bxj $$1) {
      List<crm> $$2 = $$0.z()
         .stream()
         .filter(bwp.f)
         .filter($$1x -> $$1.a($$1x, this.a($$1)))
         .sorted(Comparator.comparingDouble($$1::g))
         .collect(Collectors.toList());
      byj<?> $$3 = $$1.eb();
      $$3.a(cgl.j, $$2);
      List<crm> $$4 = $$2.stream().filter($$2x -> b($$0, $$1, $$2x)).collect(Collectors.toList());
      $$3.a(cgl.k, $$4.isEmpty() ? null : $$4.get(0));
      List<crm> $$5 = $$4.stream().filter($$2x -> c($$0, $$1, $$2x)).toList();
      $$3.a(cgl.m, $$5);
      $$3.a(cgl.l, $$5.isEmpty() ? null : $$5.get(0));
   }

   protected double a(bxj $$0) {
      return $$0.h(byp.m);
   }
}
