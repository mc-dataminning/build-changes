import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterables;
import java.util.Collection;
import java.util.List;
import java.util.Set;

public class bvm extends bvv<ccv> {
   public static final int a = 24;

   @Override
   public Set<bux<?>> a() {
      return ImmutableSet.copyOf(Iterables.concat(super.a(), List.of(bux.B)));
   }

   protected void a(amp $$0, ccv $$1) {
      super.a($$0, $$1);
      $$1.dO()
         .c(bux.g)
         .stream()
         .flatMap(Collection::stream)
         .filter($$1x -> bwc.c($$1, $$1x))
         .findFirst()
         .ifPresentOrElse($$1x -> $$1.dO().a(bux.B, $$1x), () -> $$1.dO().b(bux.B));
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
