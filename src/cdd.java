import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterables;
import java.util.Collection;
import java.util.List;
import java.util.Set;

public class cdd extends cdn<cku> {
   public static final int a = 24;

   @Override
   public Set<cco<?>> a() {
      return ImmutableSet.copyOf(Iterables.concat(super.a(), List.of(cco.B)));
   }

   protected void a(arb $$0, cku $$1) {
      super.a($$0, $$1);
      $$1.dS()
         .c(cco.g)
         .stream()
         .flatMap(Collection::stream)
         .filter(bsu.e)
         .filter($$1x -> cdu.c($$1, $$1x))
         .findFirst()
         .ifPresentOrElse($$1x -> $$1.dS().a(cco.B, $$1x), () -> $$1.dS().b(cco.B));
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
