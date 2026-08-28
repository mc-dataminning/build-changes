import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterables;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;

public class cfp extends cfd<cnp> {
   @Override
   public Set<cee<?>> a() {
      return ImmutableSet.copyOf(Iterables.concat(super.a(), List.of(cee.B)));
   }

   protected void a(arn $$0, cnp $$1) {
      super.a($$0, $$1);
      a($$1, $$0x -> $$0x.ar() == bul.by)
         .or(() -> a($$1, $$0xx -> $$0xx.ar() != bul.by))
         .ifPresentOrElse($$1x -> $$1.ed().a(cee.B, $$1x), () -> $$1.ed().b(cee.B));
   }

   private static Optional<bva> a(cnp $$0, Predicate<bva> $$1) {
      return $$0.ed().c(cee.g).stream().flatMap(Collection::stream).filter($$0::c).filter($$1).findFirst();
   }
}
