import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterables;
import java.util.Collection;
import java.util.List;
import java.util.Set;

public class bwb extends bwk<cdk> {
   public static final int a = 24;

   @Override
   public Set<bvm<?>> a() {
      return ImmutableSet.copyOf(Iterables.concat(super.a(), List.of(bvm.B)));
   }

   protected void a(and $$0, cdk $$1) {
      super.a($$0, $$1);
      $$1.dO()
         .c(bvm.g)
         .stream()
         .flatMap(Collection::stream)
         .filter($$1x -> bwr.c($$1, $$1x))
         .findFirst()
         .ifPresentOrElse($$1x -> $$1.dO().a(bvm.B, $$1x), () -> $$1.dO().b(bvm.B));
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
