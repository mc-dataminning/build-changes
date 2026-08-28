import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterables;
import java.util.Collection;
import java.util.List;
import java.util.Set;

public class cdf extends cdp<ckx> {
   public static final int a = 24;

   @Override
   public Set<ccq<?>> a() {
      return ImmutableSet.copyOf(Iterables.concat(super.a(), List.of(ccq.B)));
   }

   protected void a(aqt $$0, ckx $$1) {
      super.a($$0, $$1);
      $$1.dU()
         .c(ccq.g)
         .stream()
         .flatMap(Collection::stream)
         .filter(bsv.e)
         .filter($$1x -> cdw.c($$1, $$1x))
         .findFirst()
         .ifPresentOrElse($$1x -> $$1.dU().a(ccq.B, $$1x), () -> $$1.dU().b(ccq.B));
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
