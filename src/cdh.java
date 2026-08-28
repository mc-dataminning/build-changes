import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterables;
import java.util.Collection;
import java.util.List;
import java.util.Set;

public class cdh extends cdr<cky> {
   public static final int a = 24;

   @Override
   public Set<ccs<?>> a() {
      return ImmutableSet.copyOf(Iterables.concat(super.a(), List.of(ccs.B)));
   }

   protected void a(are $$0, cky $$1) {
      super.a($$0, $$1);
      $$1.dS()
         .c(ccs.g)
         .stream()
         .flatMap(Collection::stream)
         .filter(bsy.e)
         .filter($$1x -> cdy.c($$1, $$1x))
         .findFirst()
         .ifPresentOrElse($$1x -> $$1.dS().a(ccs.B, $$1x), () -> $$1.dS().b(ccs.B));
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
