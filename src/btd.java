import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class btd extends btg<bjb> {
   @Override
   public Set<bsc<?>> a() {
      return ImmutableSet.of(bsc.j, bsc.k, bsc.l);
   }

   @Override
   protected void a(akn $$0, bjb $$1) {
      List<cbp> $$2 = $$0.v().stream().filter(bio.f).filter($$1x -> $$1.a($$1x, 16.0)).sorted(Comparator.comparingDouble($$1::f)).collect(Collectors.toList());
      bkb<?> $$3 = $$1.dM();
      $$3.a(bsc.j, $$2);
      List<cbp> $$4 = $$2.stream().filter($$1x -> b($$1, $$1x)).collect(Collectors.toList());
      $$3.a(bsc.k, $$4.isEmpty() ? null : $$4.get(0));
      Optional<cbp> $$5 = $$4.stream().filter($$1x -> c($$1, $$1x)).findFirst();
      $$3.a(bsc.l, $$5);
   }
}
