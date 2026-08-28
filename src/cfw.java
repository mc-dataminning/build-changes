import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterables;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;

public class cfw extends cfk<cnw> {
   @Override
   public Set<cel<?>> a() {
      return ImmutableSet.copyOf(Iterables.concat(super.a(), List.of(cel.B)));
   }

   protected void a(arp $$0, cnw $$1) {
      super.a($$0, $$1);
      a($$1, $$0x -> $$0x.aq() == bus.bO)
         .or(() -> a($$1, $$0xx -> $$0xx.aq() != bus.bO))
         .ifPresentOrElse($$1x -> $$1.eb().a(cel.B, $$1x), () -> $$1.eb().b(cel.B));
   }

   private static Optional<bvh> a(cnw $$0, Predicate<bvh> $$1) {
      return $$0.eb().c(cel.g).stream().flatMap(Collection::stream).filter($$0::b).filter($$1).findFirst();
   }
}
