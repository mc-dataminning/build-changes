import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class chj extends chm<bxe> {
   @Override
   public Set<cgg<?>> a() {
      return ImmutableSet.of(cgg.j, cgg.k, cgg.l, cgg.m);
   }

   @Override
   protected void a(arq $$0, bxe $$1) {
      List<crc> $$2 = $$0.z()
         .stream()
         .filter(bwm.f)
         .filter($$1x -> $$1.a($$1x, this.a($$1)))
         .sorted(Comparator.comparingDouble($$1::g))
         .collect(Collectors.toList());
      bye<?> $$3 = $$1.ec();
      $$3.a(cgg.j, $$2);
      List<crc> $$4 = $$2.stream().filter($$2x -> b($$0, $$1, $$2x)).collect(Collectors.toList());
      $$3.a(cgg.k, $$4.isEmpty() ? null : $$4.get(0));
      List<crc> $$5 = $$4.stream().filter($$2x -> c($$0, $$1, $$2x)).toList();
      $$3.a(cgg.m, $$5);
      $$3.a(cgg.l, $$5.isEmpty() ? null : $$5.get(0));
   }

   protected double a(bxe $$0) {
      return $$0.h(byk.m);
   }
}
