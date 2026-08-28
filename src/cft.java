import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterables;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;

public class cft extends cfh<cnt> {
   @Override
   public Set<cei<?>> a() {
      return ImmutableSet.copyOf(Iterables.concat(super.a(), List.of(cei.B)));
   }

   protected void a(arq $$0, cnt $$1) {
      super.a($$0, $$1);
      a($$1, $$0x -> $$0x.ar() == bup.by)
         .or(() -> a($$1, $$0xx -> $$0xx.ar() != bup.by))
         .ifPresentOrElse($$1x -> $$1.ee().a(cei.B, $$1x), () -> $$1.ee().b(cei.B));
   }

   private static Optional<bve> a(cnt $$0, Predicate<bve> $$1) {
      return $$0.ee().c(cei.g).stream().flatMap(Collection::stream).filter($$0::c).filter($$1).findFirst();
   }
}
