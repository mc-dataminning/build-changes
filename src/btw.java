import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterables;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;

public class btw extends btk<cbe> {
   @Override
   public Set<bsn<?>> a() {
      return ImmutableSet.copyOf(Iterables.concat(super.a(), List.of(bsn.B)));
   }

   protected void a(akt $$0, cbe $$1) {
      super.a($$0, $$1);
      a($$1, $$0x -> $$0x.ag() == bja.bt)
         .or(() -> a($$1, $$0xx -> $$0xx.ag() != bja.bt))
         .ifPresentOrElse($$1x -> $$1.dN().a(bsn.B, $$1x), () -> $$1.dN().b(bsn.B));
   }

   private static Optional<bjm> a(cbe $$0, Predicate<bjm> $$1) {
      return $$0.dN().c(bsn.g).stream().flatMap(Collection::stream).filter($$0::a).filter($$1).findFirst();
   }

   @Override
   protected int b() {
      return 24;
   }

   @Override
   protected int c() {
      return 24;
   }
}
