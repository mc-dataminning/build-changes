import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterables;
import java.util.Collection;
import java.util.List;
import java.util.Set;

public class bya extends byk<cfn> {
   public static final int a = 24;

   @Override
   public Set<bxl<?>> a() {
      return ImmutableSet.copyOf(Iterables.concat(super.a(), List.of(bxl.B)));
   }

   protected void a(aow $$0, cfn $$1) {
      super.a($$0, $$1);
      $$1.dO()
         .c(bxl.g)
         .stream()
         .flatMap(Collection::stream)
         .filter(bnv.e)
         .filter($$1x -> byr.c($$1, $$1x))
         .findFirst()
         .ifPresentOrElse($$1x -> $$1.dO().a(bxl.B, $$1x), () -> $$1.dO().b(bxl.B));
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
