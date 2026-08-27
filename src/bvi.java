import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class bvi extends bvl<blg> {
   @Override
   public Set<buh<?>> a() {
      return ImmutableSet.of(buh.j, buh.k, buh.l);
   }

   @Override
   protected void a(ame $$0, blg $$1) {
      List<cdu> $$2 = $$0.w().stream().filter(bkt.f).filter($$1x -> $$1.a($$1x, 16.0)).sorted(Comparator.comparingDouble($$1::f)).collect(Collectors.toList());
      bmg<?> $$3 = $$1.dP();
      $$3.a(buh.j, $$2);
      List<cdu> $$4 = $$2.stream().filter($$1x -> b($$1, $$1x)).collect(Collectors.toList());
      $$3.a(buh.k, $$4.isEmpty() ? null : $$4.get(0));
      Optional<cdu> $$5 = $$4.stream().filter($$1x -> c($$1, $$1x)).findFirst();
      $$3.a(buh.l, $$5);
   }
}
