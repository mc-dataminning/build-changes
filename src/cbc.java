import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterables;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;

public class cbc extends caq<cix> {
   @Override
   public Set<bzr<?>> a() {
      return ImmutableSet.copyOf(Iterables.concat(super.a(), List.of(bzr.B)));
   }

   protected void a(aps $$0, cix $$1) {
      super.a($$0, $$1);
      a($$1, $$0x -> $$0x.ai() == bqb.bx)
         .or(() -> a($$1, $$0xx -> $$0xx.ai() != bqb.bx))
         .ifPresentOrElse($$1x -> $$1.dP().a(bzr.B, $$1x), () -> $$1.dP().b(bzr.B));
   }

   private static Optional<bqo> a(cix $$0, Predicate<bqo> $$1) {
      return $$0.dP().c(bzr.g).stream().flatMap(Collection::stream).filter($$0::b).filter($$1).findFirst();
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
