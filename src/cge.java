import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class cge extends cgh<bvx> {
   @Override
   public Set<cfb<?>> a() {
      return ImmutableSet.of(cfb.j, cfb.k, cfb.l);
   }

   @Override
   protected void a(arx $$0, bvx $$1) {
      List<cpo> $$2 = $$0.z()
         .stream()
         .filter(bvg.f)
         .filter($$1x -> $$1.a($$1x, this.a($$1)))
         .sorted(Comparator.comparingDouble($$1::g))
         .collect(Collectors.toList());
      bwz<?> $$3 = $$1.ec();
      $$3.a(cfb.j, $$2);
      List<cpo> $$4 = $$2.stream().filter($$2x -> b($$0, $$1, $$2x)).collect(Collectors.toList());
      $$3.a(cfb.k, $$4.isEmpty() ? null : $$4.get(0));
      Optional<cpo> $$5 = $$4.stream().filter($$2x -> c($$0, $$1, $$2x)).findFirst();
      $$3.a(cfb.l, $$5);
   }

   protected double a(bvx $$0) {
      return $$0.h(bxf.m);
   }
}
