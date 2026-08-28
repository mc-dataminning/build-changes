import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterables;
import java.util.Collection;
import java.util.List;
import java.util.Set;

public class cdx extends ceh<clr> {
   @Override
   public Set<cdi<?>> a() {
      return ImmutableSet.copyOf(Iterables.concat(super.a(), List.of(cdi.B)));
   }

   protected void a(arg $$0, clr $$1) {
      super.a($$0, $$1);
      $$1.dX()
         .c(cdi.g)
         .stream()
         .flatMap(Collection::stream)
         .filter(bto.e)
         .filter($$1x -> ceo.c($$1, $$1x))
         .findFirst()
         .ifPresentOrElse($$1x -> $$1.dX().a(cdi.B, $$1x), () -> $$1.dX().b(cdi.B));
   }
}
