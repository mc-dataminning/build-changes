import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterables;
import java.util.Collection;
import java.util.List;
import java.util.Set;

public class ccv extends cdf<ckn> {
   public static final int a = 24;

   @Override
   public Set<ccg<?>> a() {
      return ImmutableSet.copyOf(Iterables.concat(super.a(), List.of(ccg.B)));
   }

   protected void a(aqm $$0, ckn $$1) {
      super.a($$0, $$1);
      $$1.dV()
         .c(ccg.g)
         .stream()
         .flatMap(Collection::stream)
         .filter(bsm.e)
         .filter($$1x -> cdm.c($$1, $$1x))
         .findFirst()
         .ifPresentOrElse($$1x -> $$1.dV().a(ccg.B, $$1x), () -> $$1.dV().b(ccg.B));
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
