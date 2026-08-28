import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterables;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;

public class cey extends cem<cmy> {
   @Override
   public Set<cdn<?>> a() {
      return ImmutableSet.copyOf(Iterables.concat(super.a(), List.of(cdn.B)));
   }

   protected void a(arh $$0, cmy $$1) {
      super.a($$0, $$1);
      a($$1, $$0x -> $$0x.ao() == btv.by)
         .or(() -> a($$1, $$0xx -> $$0xx.ao() != btv.by))
         .ifPresentOrElse($$1x -> $$1.dX().a(cdn.B, $$1x), () -> $$1.dX().b(cdn.B));
   }

   private static Optional<buk> a(cmy $$0, Predicate<buk> $$1) {
      return $$0.dX().c(cdn.g).stream().flatMap(Collection::stream).filter($$0::c).filter($$1).findFirst();
   }
}
