import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class bzu extends bzx<bpo> {
   @Override
   public Set<byr<?>> a() {
      return ImmutableSet.of(byr.j, byr.k, byr.l);
   }

   @Override
   protected void a(apf $$0, bpo $$1) {
      List<cis> $$2 = $$0.x().stream().filter(bpb.f).filter($$1x -> $$1.a($$1x, 16.0)).sorted(Comparator.comparingDouble($$1::g)).collect(Collectors.toList());
      bqp<?> $$3 = $$1.dP();
      $$3.a(byr.j, $$2);
      List<cis> $$4 = $$2.stream().filter($$1x -> b($$1, $$1x)).collect(Collectors.toList());
      $$3.a(byr.k, $$4.isEmpty() ? null : $$4.get(0));
      Optional<cis> $$5 = $$4.stream().filter($$1x -> c($$1, $$1x)).findFirst();
      $$3.a(byr.l, $$5);
   }
}
