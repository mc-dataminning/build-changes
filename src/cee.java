import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterables;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;

public class cee extends cds<cmb> {
   @Override
   public Set<cct<?>> a() {
      return ImmutableSet.copyOf(Iterables.concat(super.a(), List.of(cct.B)));
   }

   protected void a(arf $$0, cmb $$1) {
      super.a($$0, $$1);
      a($$1, $$0x -> $$0x.ak() == bta.by)
         .or(() -> a($$1, $$0xx -> $$0xx.ak() != bta.by))
         .ifPresentOrElse($$1x -> $$1.dS().a(cct.B, $$1x), () -> $$1.dS().b(cct.B));
   }

   private static Optional<btp> a(cmb $$0, Predicate<btp> $$1) {
      return $$0.dS().c(cct.g).stream().flatMap(Collection::stream).filter($$0::b).filter($$1).findFirst();
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
