import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterables;
import java.util.Collection;
import java.util.List;
import java.util.Set;

public class cey extends cfi<cms> {
   @Override
   public Set<cej<?>> a() {
      return ImmutableSet.copyOf(Iterables.concat(super.a(), List.of(cej.B)));
   }

   protected void a(arc $$0, cms $$1) {
      super.a($$0, $$1);
      $$1.ec()
         .c(cej.g)
         .stream()
         .flatMap(Collection::stream)
         .filter(buo.e)
         .filter($$2 -> cfp.c($$0, $$1, $$2))
         .findFirst()
         .ifPresentOrElse($$1x -> $$1.ec().a(cej.B, $$1x), () -> $$1.ec().b(cej.B));
   }
}
