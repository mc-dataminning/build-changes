import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class cdv extends cdy<bto> {
   @Override
   public Set<ccs<?>> a() {
      return ImmutableSet.of(ccs.j, ccs.k, ccs.l);
   }

   @Override
   protected void a(are $$0, bto $$1) {
      List<cmw> $$2 = $$0.x().stream().filter(bsy.f).filter($$1x -> $$1.a($$1x, 16.0)).sorted(Comparator.comparingDouble($$1::g)).collect(Collectors.toList());
      buq<?> $$3 = $$1.dS();
      $$3.a(ccs.j, $$2);
      List<cmw> $$4 = $$2.stream().filter($$1x -> b($$1, $$1x)).collect(Collectors.toList());
      $$3.a(ccs.k, $$4.isEmpty() ? null : $$4.get(0));
      Optional<cmw> $$5 = $$4.stream().filter($$1x -> c($$1, $$1x)).findFirst();
      $$3.a(ccs.l, $$5);
   }
}
