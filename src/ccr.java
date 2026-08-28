import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterables;
import java.util.Collection;
import java.util.List;
import java.util.Set;

public class ccr extends cdb<ckj> {
   public static final int a = 24;

   @Override
   public Set<ccc<?>> a() {
      return ImmutableSet.copyOf(Iterables.concat(super.a(), List.of(ccc.B)));
   }

   protected void a(aqk $$0, ckj $$1) {
      super.a($$0, $$1);
      $$1.dT()
         .c(ccc.g)
         .stream()
         .flatMap(Collection::stream)
         .filter(bsi.e)
         .filter($$1x -> cdi.c($$1, $$1x))
         .findFirst()
         .ifPresentOrElse($$1x -> $$1.dT().a(ccc.B, $$1x), () -> $$1.dT().b(ccc.B));
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
