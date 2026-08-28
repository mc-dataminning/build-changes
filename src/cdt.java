import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class cdt extends cdw<btl> {
   @Override
   public Set<ccq<?>> a() {
      return ImmutableSet.of(ccq.j, ccq.k, ccq.l);
   }

   @Override
   protected void a(aqt $$0, btl $$1) {
      List<cmv> $$2 = $$0.x().stream().filter(bsv.f).filter($$1x -> $$1.a($$1x, 16.0)).sorted(Comparator.comparingDouble($$1::g)).collect(Collectors.toList());
      buo<?> $$3 = $$1.dU();
      $$3.a(ccq.j, $$2);
      List<cmv> $$4 = $$2.stream().filter($$1x -> b($$1, $$1x)).collect(Collectors.toList());
      $$3.a(ccq.k, $$4.isEmpty() ? null : $$4.get(0));
      Optional<cmv> $$5 = $$4.stream().filter($$1x -> c($$1, $$1x)).findFirst();
      $$3.a(ccq.l, $$5);
   }
}
