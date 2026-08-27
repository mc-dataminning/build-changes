import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterables;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;

public class btl extends bsz<cat> {
   @Override
   public Set<bsc<?>> a() {
      return ImmutableSet.copyOf(Iterables.concat(super.a(), List.of(bsc.B)));
   }

   protected void a(akn $$0, cat $$1) {
      super.a($$0, $$1);
      a($$1, $$0x -> $$0x.ag() == bip.bt)
         .or(() -> a($$1, $$0xx -> $$0xx.ag() != bip.bt))
         .ifPresentOrElse($$1x -> $$1.dM().a(bsc.B, $$1x), () -> $$1.dM().b(bsc.B));
   }

   private static Optional<bjb> a(cat $$0, Predicate<bjb> $$1) {
      return $$0.dM().c(bsc.g).stream().flatMap(Collection::stream).filter($$0::a).filter($$1).findFirst();
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
