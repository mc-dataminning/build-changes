import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class cdy extends ceb<btr> {
   @Override
   public Set<ccv<?>> a() {
      return ImmutableSet.of(ccv.j, ccv.k, ccv.l);
   }

   @Override
   protected void a(arf $$0, btr $$1) {
      List<cmz> $$2 = $$0.x().stream().filter(btb.f).filter($$1x -> $$1.a($$1x, 16.0)).sorted(Comparator.comparingDouble($$1::g)).collect(Collectors.toList());
      but<?> $$3 = $$1.dS();
      $$3.a(ccv.j, $$2);
      List<cmz> $$4 = $$2.stream().filter($$1x -> b($$1, $$1x)).collect(Collectors.toList());
      $$3.a(ccv.k, $$4.isEmpty() ? null : $$4.get(0));
      Optional<cmz> $$5 = $$4.stream().filter($$1x -> c($$1, $$1x)).findFirst();
      $$3.a(ccv.l, $$5);
   }
}
