import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class che extends chh<bwz> {
   @Override
   public Set<cgb<?>> a() {
      return ImmutableSet.of(cgb.j, cgb.k, cgb.l, cgb.m);
   }

   @Override
   protected void a(aro $$0, bwz $$1) {
      List<cqs> $$2 = $$0.z()
         .stream()
         .filter(bwh.f)
         .filter($$1x -> $$1.a($$1x, this.a($$1)))
         .sorted(Comparator.comparingDouble($$1::g))
         .collect(Collectors.toList());
      bxz<?> $$3 = $$1.eb();
      $$3.a(cgb.j, $$2);
      List<cqs> $$4 = $$2.stream().filter($$2x -> b($$0, $$1, $$2x)).collect(Collectors.toList());
      $$3.a(cgb.k, $$4.isEmpty() ? null : $$4.get(0));
      List<cqs> $$5 = $$4.stream().filter($$2x -> c($$0, $$1, $$2x)).toList();
      $$3.a(cgb.m, $$5);
      $$3.a(cgb.l, $$5.isEmpty() ? null : $$5.get(0));
   }

   protected double a(bwz $$0) {
      return $$0.h(byf.m);
   }
}
