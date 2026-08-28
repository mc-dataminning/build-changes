import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterables;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;

public class cij extends chx<crc> {
   @Override
   public Set<cgy<?>> a() {
      return ImmutableSet.copyOf(Iterables.concat(super.a(), List.of(cgy.C)));
   }

   protected void a(aru $$0, crc $$1) {
      super.a($$0, $$1);
      a($$1, $$0x -> $$0x.an() == bxe.bT)
         .or(() -> a($$1, $$0xx -> $$0xx.an() != bxe.bT))
         .ifPresentOrElse($$1x -> $$1.ec().a(cgy.C, $$1x), () -> $$1.ec().b(cgy.C));
   }

   private static Optional<bxw> a(crc $$0, Predicate<bxw> $$1) {
      return $$0.ec().c(cgy.g).stream().flatMap(Collection::stream).filter($$0::b).filter($$1).findFirst();
   }
}
