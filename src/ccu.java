import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterables;
import java.util.Collection;
import java.util.List;
import java.util.Set;

public class ccu extends cde<ckm> {
   public static final int a = 24;

   @Override
   public Set<ccf<?>> a() {
      return ImmutableSet.copyOf(Iterables.concat(super.a(), List.of(ccf.B)));
   }

   protected void a(aqm $$0, ckm $$1) {
      super.a($$0, $$1);
      $$1.dU()
         .c(ccf.g)
         .stream()
         .flatMap(Collection::stream)
         .filter(bsl.e)
         .filter($$1x -> cdl.c($$1, $$1x))
         .findFirst()
         .ifPresentOrElse($$1x -> $$1.dU().a(ccf.B, $$1x), () -> $$1.dU().b(ccf.B));
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
