import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterables;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;

public class ceb extends cdp<clz> {
   @Override
   public Set<ccq<?>> a() {
      return ImmutableSet.copyOf(Iterables.concat(super.a(), List.of(ccq.B)));
   }

   protected void a(aqt $$0, clz $$1) {
      super.a($$0, $$1);
      a($$1, $$0x -> $$0x.am() == bsw.by)
         .or(() -> a($$1, $$0xx -> $$0xx.am() != bsw.by))
         .ifPresentOrElse($$1x -> $$1.dU().a(ccq.B, $$1x), () -> $$1.dU().b(ccq.B));
   }

   private static Optional<btl> a(clz $$0, Predicate<btl> $$1) {
      return $$0.dU().c(ccq.g).stream().flatMap(Collection::stream).filter($$0::b).filter($$1).findFirst();
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
