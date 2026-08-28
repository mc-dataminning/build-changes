import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterables;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;

public class cdn extends cdb<cll> {
   @Override
   public Set<ccc<?>> a() {
      return ImmutableSet.copyOf(Iterables.concat(super.a(), List.of(ccc.B)));
   }

   protected void a(aqk $$0, cll $$1) {
      super.a($$0, $$1);
      a($$1, $$0x -> $$0x.ak() == bsj.by)
         .or(() -> a($$1, $$0xx -> $$0xx.ak() != bsj.by))
         .ifPresentOrElse($$1x -> $$1.dT().a(ccc.B, $$1x), () -> $$1.dT().b(ccc.B));
   }

   private static Optional<bsy> a(cll $$0, Predicate<bsy> $$1) {
      return $$0.dT().c(ccc.g).stream().flatMap(Collection::stream).filter($$0::b).filter($$1).findFirst();
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
