import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterables;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;

public class cdc extends ccq<clc> {
   @Override
   public Set<cbr<?>> a() {
      return ImmutableSet.copyOf(Iterables.concat(super.a(), List.of(cbr.B)));
   }

   protected void a(aqt $$0, clc $$1) {
      super.a($$0, $$1);
      a($$1, $$0x -> $$0x.ak() == bsb.bE)
         .or(() -> a($$1, $$0xx -> $$0xx.ak() != bsb.bE))
         .ifPresentOrElse($$1x -> $$1.dZ().a(cbr.B, $$1x), () -> $$1.dZ().b(cbr.B));
   }

   private static Optional<bso> a(clc $$0, Predicate<bso> $$1) {
      return $$0.dZ().c(cbr.g).stream().flatMap(Collection::stream).filter($$0::b).filter($$1).findFirst();
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
