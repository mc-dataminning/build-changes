import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class ccu extends ccx<bso> {
   @Override
   public Set<cbr<?>> a() {
      return ImmutableSet.of(cbr.j, cbr.k, cbr.l);
   }

   @Override
   protected void a(aqt $$0, bso $$1) {
      List<cly> $$2 = $$0.x().stream().filter(bsa.f).filter($$1x -> $$1.a($$1x, 16.0)).sorted(Comparator.comparingDouble($$1::g)).collect(Collectors.toList());
      btp<?> $$3 = $$1.dZ();
      $$3.a(cbr.j, $$2);
      List<cly> $$4 = $$2.stream().filter($$1x -> b($$1, $$1x)).collect(Collectors.toList());
      $$3.a(cbr.k, $$4.isEmpty() ? null : $$4.get(0));
      Optional<cly> $$5 = $$4.stream().filter($$1x -> c($$1, $$1x)).findFirst();
      $$3.a(cbr.l, $$5);
   }
}
