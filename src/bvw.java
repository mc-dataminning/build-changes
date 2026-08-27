import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterables;
import java.util.Collection;
import java.util.List;
import java.util.Set;

public class bvw extends bwf<cdf> {
   public static final int a = 24;

   @Override
   public Set<bvh<?>> a() {
      return ImmutableSet.copyOf(Iterables.concat(super.a(), List.of(bvh.B)));
   }

   protected void a(amz $$0, cdf $$1) {
      super.a($$0, $$1);
      $$1.dO()
         .c(bvh.g)
         .stream()
         .flatMap(Collection::stream)
         .filter($$1x -> bwm.c($$1, $$1x))
         .findFirst()
         .ifPresentOrElse($$1x -> $$1.dO().a(bvh.B, $$1x), () -> $$1.dO().b(bvh.B));
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
