import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class bto extends btr<bjm> {
   @Override
   public Set<bsn<?>> a() {
      return ImmutableSet.of(bsn.j, bsn.k, bsn.l);
   }

   @Override
   protected void a(akt $$0, bjm $$1) {
      List<cca> $$2 = $$0.v().stream().filter(biz.f).filter($$1x -> $$1.a($$1x, 16.0)).sorted(Comparator.comparingDouble($$1::f)).collect(Collectors.toList());
      bkm<?> $$3 = $$1.dN();
      $$3.a(bsn.j, $$2);
      List<cca> $$4 = $$2.stream().filter($$1x -> b($$1, $$1x)).collect(Collectors.toList());
      $$3.a(bsn.k, $$4.isEmpty() ? null : $$4.get(0));
      Optional<cca> $$5 = $$4.stream().filter($$1x -> c($$1, $$1x)).findFirst();
      $$3.a(bsn.l, $$5);
   }
}
