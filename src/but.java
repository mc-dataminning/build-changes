import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterables;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;

public class but extends buh<ccb> {
   @Override
   public Set<btk<?>> a() {
      return ImmutableSet.copyOf(Iterables.concat(super.a(), List.of(btk.B)));
   }

   protected void a(alq $$0, ccb $$1) {
      super.a($$0, $$1);
      a($$1, $$0x -> $$0x.ag() == bjx.bt)
         .or(() -> a($$1, $$0xx -> $$0xx.ag() != bjx.bt))
         .ifPresentOrElse($$1x -> $$1.dN().a(btk.B, $$1x), () -> $$1.dN().b(btk.B));
   }

   private static Optional<bkj> a(ccb $$0, Predicate<bkj> $$1) {
      return $$0.dN().c(btk.g).stream().flatMap(Collection::stream).filter($$0::a).filter($$1).findFirst();
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
