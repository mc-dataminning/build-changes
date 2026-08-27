import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class bwt extends bww<bmo> {
   @Override
   public Set<bvq<?>> a() {
      return ImmutableSet.of(bvq.j, bvq.k, bvq.l);
   }

   @Override
   protected void a(ane $$0, bmo $$1) {
      List<cfq> $$2 = $$0.x().stream().filter(bmb.f).filter($$1x -> $$1.a($$1x, 16.0)).sorted(Comparator.comparingDouble($$1::f)).collect(Collectors.toList());
      bno<?> $$3 = $$1.dN();
      $$3.a(bvq.j, $$2);
      List<cfq> $$4 = $$2.stream().filter($$1x -> b($$1, $$1x)).collect(Collectors.toList());
      $$3.a(bvq.k, $$4.isEmpty() ? null : $$4.get(0));
      Optional<cfq> $$5 = $$4.stream().filter($$1x -> c($$1, $$1x)).findFirst();
      $$3.a(bvq.l, $$5);
   }
}
