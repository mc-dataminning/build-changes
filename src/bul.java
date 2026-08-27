import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class bul extends buo<bkj> {
   @Override
   public Set<btk<?>> a() {
      return ImmutableSet.of(btk.j, btk.k, btk.l);
   }

   @Override
   protected void a(alq $$0, bkj $$1) {
      List<ccx> $$2 = $$0.v().stream().filter(bjw.f).filter($$1x -> $$1.a($$1x, 16.0)).sorted(Comparator.comparingDouble($$1::f)).collect(Collectors.toList());
      blj<?> $$3 = $$1.dN();
      $$3.a(btk.j, $$2);
      List<ccx> $$4 = $$2.stream().filter($$1x -> b($$1, $$1x)).collect(Collectors.toList());
      $$3.a(btk.k, $$4.isEmpty() ? null : $$4.get(0));
      Optional<ccx> $$5 = $$4.stream().filter($$1x -> c($$1, $$1x)).findFirst();
      $$3.a(btk.l, $$5);
   }
}
