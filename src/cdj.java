import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterables;
import java.util.Collection;
import java.util.List;
import java.util.Set;

public class cdj extends cdt<cla> {
   public static final int a = 24;

   @Override
   public Set<ccu<?>> a() {
      return ImmutableSet.copyOf(Iterables.concat(super.a(), List.of(ccu.B)));
   }

   protected void a(arf $$0, cla $$1) {
      super.a($$0, $$1);
      $$1.dS()
         .c(ccu.g)
         .stream()
         .flatMap(Collection::stream)
         .filter(bta.e)
         .filter($$1x -> cea.c($$1, $$1x))
         .findFirst()
         .ifPresentOrElse($$1x -> $$1.dS().a(ccu.B, $$1x), () -> $$1.dS().b(ccu.B));
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
