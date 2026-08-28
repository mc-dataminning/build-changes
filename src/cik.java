import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class cik extends cin<byf> {
   @Override
   public Set<chh<?>> a() {
      return ImmutableSet.of(chh.j, chh.k, chh.l, chh.m);
   }

   @Override
   protected void a(asb $$0, byf $$1) {
      List<csi> $$2 = $$0.z()
         .stream()
         .filter(bxl.f)
         .filter($$1x -> $$1.a($$1x, this.a($$1)))
         .sorted(Comparator.comparingDouble($$1::g))
         .collect(Collectors.toList());
      bzf<?> $$3 = $$1.ec();
      $$3.a(chh.j, $$2);
      List<csi> $$4 = $$2.stream().filter($$2x -> b($$0, $$1, $$2x)).collect(Collectors.toList());
      $$3.a(chh.k, $$4.isEmpty() ? null : $$4.get(0));
      List<csi> $$5 = $$4.stream().filter($$2x -> c($$0, $$1, $$2x)).toList();
      $$3.a(chh.m, $$5);
      $$3.a(chh.l, $$5.isEmpty() ? null : $$5.get(0));
   }

   protected double a(byf $$0) {
      return $$0.h(bzl.m);
   }
}
