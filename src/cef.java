import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterables;
import java.util.Collection;
import java.util.List;
import java.util.Set;

public class cef extends cep<clz> {
   @Override
   public Set<cdq<?>> a() {
      return ImmutableSet.copyOf(Iterables.concat(super.a(), List.of(cdq.B)));
   }

   protected void a(arj $$0, clz $$1) {
      super.a($$0, $$1);
      $$1.dY()
         .c(cdq.g)
         .stream()
         .flatMap(Collection::stream)
         .filter(btw.e)
         .filter($$1x -> cew.c($$1, $$1x))
         .findFirst()
         .ifPresentOrElse($$1x -> $$1.dY().a(cdq.B, $$1x), () -> $$1.dY().b(cdq.B));
   }
}
