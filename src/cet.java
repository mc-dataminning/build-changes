import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterables;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;

public class cet extends ceh<cmt> {
   @Override
   public Set<cdi<?>> a() {
      return ImmutableSet.copyOf(Iterables.concat(super.a(), List.of(cdi.B)));
   }

   protected void a(arg $$0, cmt $$1) {
      super.a($$0, $$1);
      a($$1, $$0x -> $$0x.ao() == btq.by)
         .or(() -> a($$1, $$0xx -> $$0xx.ao() != btq.by))
         .ifPresentOrElse($$1x -> $$1.dX().a(cdi.B, $$1x), () -> $$1.dX().b(cdi.B));
   }

   private static Optional<buf> a(cmt $$0, Predicate<buf> $$1) {
      return $$0.dX().c(cdi.g).stream().flatMap(Collection::stream).filter($$0::c).filter($$1).findFirst();
   }
}
