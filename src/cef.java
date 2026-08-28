import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterables;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;

public class cef extends cdt<cmc> {
   @Override
   public Set<ccu<?>> a() {
      return ImmutableSet.copyOf(Iterables.concat(super.a(), List.of(ccu.B)));
   }

   protected void a(arf $$0, cmc $$1) {
      super.a($$0, $$1);
      a($$1, $$0x -> $$0x.ak() == btb.by)
         .or(() -> a($$1, $$0xx -> $$0xx.ak() != btb.by))
         .ifPresentOrElse($$1x -> $$1.dS().a(ccu.B, $$1x), () -> $$1.dS().b(ccu.B));
   }

   private static Optional<btq> a(cmc $$0, Predicate<btq> $$1) {
      return $$0.dS().c(ccu.g).stream().flatMap(Collection::stream).filter($$0::b).filter($$1).findFirst();
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
