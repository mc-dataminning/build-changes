import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterables;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;

public class bvv extends bvj<cdd> {
   @Override
   public Set<bum<?>> a() {
      return ImmutableSet.copyOf(Iterables.concat(super.a(), List.of(bum.B)));
   }

   protected void a(ami $$0, cdd $$1) {
      super.a($$0, $$1);
      a($$1, $$0x -> $$0x.ai() == bkz.bt)
         .or(() -> a($$1, $$0xx -> $$0xx.ai() != bkz.bt))
         .ifPresentOrElse($$1x -> $$1.dP().a(bum.B, $$1x), () -> $$1.dP().b(bum.B));
   }

   private static Optional<bll> a(cdd $$0, Predicate<bll> $$1) {
      return $$0.dP().c(bum.g).stream().flatMap(Collection::stream).filter($$0::a).filter($$1).findFirst();
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
