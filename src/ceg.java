import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterables;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;

public class ceg extends cdu<cmd> {
   @Override
   public Set<ccv<?>> a() {
      return ImmutableSet.copyOf(Iterables.concat(super.a(), List.of(ccv.B)));
   }

   protected void a(arf $$0, cmd $$1) {
      super.a($$0, $$1);
      a($$1, $$0x -> $$0x.ak() == btc.by)
         .or(() -> a($$1, $$0xx -> $$0xx.ak() != btc.by))
         .ifPresentOrElse($$1x -> $$1.dS().a(ccv.B, $$1x), () -> $$1.dS().b(ccv.B));
   }

   private static Optional<btr> a(cmd $$0, Predicate<btr> $$1) {
      return $$0.dS().c(ccv.g).stream().flatMap(Collection::stream).filter($$0::b).filter($$1).findFirst();
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
