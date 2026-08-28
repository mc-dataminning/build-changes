import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterables;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;

public class cfk extends cey<cnk> {
   @Override
   public Set<cdz<?>> a() {
      return ImmutableSet.copyOf(Iterables.concat(super.a(), List.of(cdz.B)));
   }

   protected void a(arm $$0, cnk $$1) {
      super.a($$0, $$1);
      a($$1, $$0x -> $$0x.aq() == bug.by)
         .or(() -> a($$1, $$0xx -> $$0xx.aq() != bug.by))
         .ifPresentOrElse($$1x -> $$1.ed().a(cdz.B, $$1x), () -> $$1.ed().b(cdz.B));
   }

   private static Optional<buv> a(cnk $$0, Predicate<buv> $$1) {
      return $$0.ed().c(cdz.g).stream().flatMap(Collection::stream).filter($$0::c).filter($$1).findFirst();
   }
}
