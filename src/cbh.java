import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterables;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;

public class cbh extends cav<cje> {
   @Override
   public Set<bzw<?>> a() {
      return ImmutableSet.copyOf(Iterables.concat(super.a(), List.of(bzw.B)));
   }

   protected void a(apu $$0, cje $$1) {
      super.a($$0, $$1);
      a($$1, $$0x -> $$0x.ai() == bqg.bx)
         .or(() -> a($$1, $$0xx -> $$0xx.ai() != bqg.bx))
         .ifPresentOrElse($$1x -> $$1.dP().a(bzw.B, $$1x), () -> $$1.dP().b(bzw.B));
   }

   private static Optional<bqt> a(cje $$0, Predicate<bqt> $$1) {
      return $$0.dP().c(bzw.g).stream().flatMap(Collection::stream).filter($$0::b).filter($$1).findFirst();
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
