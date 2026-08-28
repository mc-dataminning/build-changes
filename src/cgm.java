import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class cgm extends cgp<bwf> {
   @Override
   public Set<cfj<?>> a() {
      return ImmutableSet.of(cfj.j, cfj.k, cfj.l);
   }

   @Override
   protected void a(ash $$0, bwf $$1) {
      List<cpw> $$2 = $$0.y()
         .stream()
         .filter(bvo.f)
         .filter($$1x -> $$1.a($$1x, this.a($$1)))
         .sorted(Comparator.comparingDouble($$1::g))
         .collect(Collectors.toList());
      bxh<?> $$3 = $$1.ec();
      $$3.a(cfj.j, $$2);
      List<cpw> $$4 = $$2.stream().filter($$2x -> b($$0, $$1, $$2x)).collect(Collectors.toList());
      $$3.a(cfj.k, $$4.isEmpty() ? null : $$4.get(0));
      Optional<cpw> $$5 = $$4.stream().filter($$2x -> c($$0, $$1, $$2x)).findFirst();
      $$3.a(cfj.l, $$5);
   }

   protected double a(bwf $$0) {
      return $$0.h(bxn.m);
   }
}
