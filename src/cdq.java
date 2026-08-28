import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterables;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;

public class cdq extends cde<clo> {
   @Override
   public Set<ccf<?>> a() {
      return ImmutableSet.copyOf(Iterables.concat(super.a(), List.of(ccf.B)));
   }

   protected void a(aqm $$0, clo $$1) {
      super.a($$0, $$1);
      a($$1, $$0x -> $$0x.al() == bsm.by)
         .or(() -> a($$1, $$0xx -> $$0xx.al() != bsm.by))
         .ifPresentOrElse($$1x -> $$1.dU().a(ccf.B, $$1x), () -> $$1.dU().b(ccf.B));
   }

   private static Optional<btb> a(clo $$0, Predicate<btb> $$1) {
      return $$0.dU().c(ccf.g).stream().flatMap(Collection::stream).filter($$0::b).filter($$1).findFirst();
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
