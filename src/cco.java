import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterables;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;

public class cco extends ccc<ckl> {
   @Override
   public Set<cbd<?>> a() {
      return ImmutableSet.copyOf(Iterables.concat(super.a(), List.of(cbd.B)));
   }

   protected void a(aqh $$0, ckl $$1) {
      super.a($$0, $$1);
      a($$1, $$0x -> $$0x.ai() == brn.bx)
         .or(() -> a($$1, $$0xx -> $$0xx.ai() != brn.bx))
         .ifPresentOrElse($$1x -> $$1.dQ().a(cbd.B, $$1x), () -> $$1.dQ().b(cbd.B));
   }

   private static Optional<bsa> a(ckl $$0, Predicate<bsa> $$1) {
      return $$0.dQ().c(cbd.g).stream().flatMap(Collection::stream).filter($$0::b).filter($$1).findFirst();
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
