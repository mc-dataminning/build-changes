import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterables;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;

public class cfv extends cfj<cny> {
   @Override
   public Set<cek<?>> a() {
      return ImmutableSet.copyOf(Iterables.concat(super.a(), List.of(cek.B)));
   }

   protected void a(ard $$0, cny $$1) {
      super.a($$0, $$1);
      a($$1, $$0x -> $$0x.aq() == bur.bR)
         .or(() -> a($$1, $$0xx -> $$0xx.aq() != bur.bR))
         .ifPresentOrElse($$1x -> $$1.eb().a(cek.B, $$1x), () -> $$1.eb().b(cek.B));
   }

   private static Optional<bvg> a(cny $$0, Predicate<bvg> $$1) {
      return $$0.eb().c(cek.g).stream().flatMap(Collection::stream).filter($$0::b).filter($$1).findFirst();
   }
}
