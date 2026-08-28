import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterables;
import java.util.Collection;
import java.util.List;
import java.util.Set;

public class cdk extends cdu<clb> {
   public static final int a = 24;

   @Override
   public Set<ccv<?>> a() {
      return ImmutableSet.copyOf(Iterables.concat(super.a(), List.of(ccv.B)));
   }

   protected void a(arf $$0, clb $$1) {
      super.a($$0, $$1);
      $$1.dS()
         .c(ccv.g)
         .stream()
         .flatMap(Collection::stream)
         .filter(btb.e)
         .filter($$1x -> ceb.c($$1, $$1x))
         .findFirst()
         .ifPresentOrElse($$1x -> $$1.dS().a(ccv.B, $$1x), () -> $$1.dS().b(ccv.B));
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
