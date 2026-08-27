import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class bzd extends bzg<box> {
   @Override
   public Set<bya<?>> a() {
      return ImmutableSet.of(bya.j, bya.k, bya.l);
   }

   @Override
   protected void a(apa $$0, box $$1) {
      List<cia> $$2 = $$0.x().stream().filter(bok.f).filter($$1x -> $$1.a($$1x, 16.0)).sorted(Comparator.comparingDouble($$1::f)).collect(Collectors.toList());
      bpy<?> $$3 = $$1.dM();
      $$3.a(bya.j, $$2);
      List<cia> $$4 = $$2.stream().filter($$1x -> b($$1, $$1x)).collect(Collectors.toList());
      $$3.a(bya.k, $$4.isEmpty() ? null : $$4.get(0));
      Optional<cia> $$5 = $$4.stream().filter($$1x -> c($$1, $$1x)).findFirst();
      $$3.a(bya.l, $$5);
   }
}
