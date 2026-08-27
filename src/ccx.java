import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class ccx extends cda<bsq> {
   @Override
   public Set<cbu<?>> a() {
      return ImmutableSet.of(cbu.j, cbu.k, cbu.l);
   }

   @Override
   protected void a(aqn $$0, bsq $$1) {
      List<cly> $$2 = $$0.x().stream().filter(bsb.f).filter($$1x -> $$1.a($$1x, 16.0)).sorted(Comparator.comparingDouble($$1::g)).collect(Collectors.toList());
      bts<?> $$3 = $$1.dS();
      $$3.a(cbu.j, $$2);
      List<cly> $$4 = $$2.stream().filter($$1x -> b($$1, $$1x)).collect(Collectors.toList());
      $$3.a(cbu.k, $$4.isEmpty() ? null : $$4.get(0));
      Optional<cly> $$5 = $$4.stream().filter($$1x -> c($$1, $$1x)).findFirst();
      $$3.a(cbu.l, $$5);
   }
}
