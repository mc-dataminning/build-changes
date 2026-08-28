import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterables;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;

public class cgn extends cgb<cou> {
   @Override
   public Set<cfc<?>> a() {
      return ImmutableSet.copyOf(Iterables.concat(super.a(), List.of(cfc.B)));
   }

   protected void a(ard $$0, cou $$1) {
      super.a($$0, $$1);
      a($$1, $$0x -> $$0x.aq() == bvi.bR)
         .or(() -> a($$1, $$0xx -> $$0xx.aq() != bvi.bR))
         .ifPresentOrElse($$1x -> $$1.ea().a(cfc.B, $$1x), () -> $$1.ea().b(cfc.B));
   }

   private static Optional<bvy> a(cou $$0, Predicate<bvy> $$1) {
      return $$0.ea().c(cfc.g).stream().flatMap(Collection::stream).filter($$0::b).filter($$1).findFirst();
   }
}
