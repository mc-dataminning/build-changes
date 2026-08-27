import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterables;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;

public class cac extends bzq<chw> {
   @Override
   public Set<byr<?>> a() {
      return ImmutableSet.copyOf(Iterables.concat(super.a(), List.of(byr.B)));
   }

   protected void a(apf $$0, chw $$1) {
      super.a($$0, $$1);
      a($$1, $$0x -> $$0x.ai() == bpc.bx)
         .or(() -> a($$1, $$0xx -> $$0xx.ai() != bpc.bx))
         .ifPresentOrElse($$1x -> $$1.dP().a(byr.B, $$1x), () -> $$1.dP().b(byr.B));
   }

   private static Optional<bpo> a(chw $$0, Predicate<bpo> $$1) {
      return $$0.dP().c(byr.g).stream().flatMap(Collection::stream).filter($$0::b).filter($$1).findFirst();
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
