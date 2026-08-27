import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class bti extends btl<bjg> {
   @Override
   public Set<bsh<?>> a() {
      return ImmutableSet.of(bsh.j, bsh.k, bsh.l);
   }

   @Override
   protected void a(akq $$0, bjg $$1) {
      List<cbu> $$2 = $$0.v().stream().filter(bit.f).filter($$1x -> $$1.a($$1x, 16.0)).sorted(Comparator.comparingDouble($$1::f)).collect(Collectors.toList());
      bkg<?> $$3 = $$1.dN();
      $$3.a(bsh.j, $$2);
      List<cbu> $$4 = $$2.stream().filter($$1x -> b($$1, $$1x)).collect(Collectors.toList());
      $$3.a(bsh.k, $$4.isEmpty() ? null : $$4.get(0));
      Optional<cbu> $$5 = $$4.stream().filter($$1x -> c($$1, $$1x)).findFirst();
      $$3.a(bsh.l, $$5);
   }
}
