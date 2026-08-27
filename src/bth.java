import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterables;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;

public class bth extends bsv<cap> {
   @Override
   public Set<bry<?>> a() {
      return ImmutableSet.copyOf(Iterables.concat(super.a(), List.of(bry.B)));
   }

   protected void a(aki $$0, cap $$1) {
      super.a($$0, $$1);
      a($$1, $$0x -> $$0x.ag() == bik.bt)
         .or(() -> a($$1, $$0xx -> $$0xx.ag() != bik.bt))
         .ifPresentOrElse($$1x -> $$1.dM().a(bry.B, $$1x), () -> $$1.dM().b(bry.B));
   }

   private static Optional<biw> a(cap $$0, Predicate<biw> $$1) {
      return $$0.dM().c(bry.g).stream().flatMap(Collection::stream).filter($$0::a).filter($$1).findFirst();
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
