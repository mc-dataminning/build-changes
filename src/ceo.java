import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterables;
import java.util.Collection;
import java.util.List;
import java.util.Set;

public class ceo extends cey<cmi> {
   @Override
   public Set<cdz<?>> a() {
      return ImmutableSet.copyOf(Iterables.concat(super.a(), List.of(cdz.B)));
   }

   protected void a(arm $$0, cmi $$1) {
      super.a($$0, $$1);
      $$1.ed()
         .c(cdz.g)
         .stream()
         .flatMap(Collection::stream)
         .filter(bue.e)
         .filter($$1x -> cff.c($$1, $$1x))
         .findFirst()
         .ifPresentOrElse($$1x -> $$1.ed().a(cdz.B, $$1x), () -> $$1.ed().b(cdz.B));
   }
}
