import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterables;
import java.util.Collection;
import java.util.List;
import java.util.Set;

public class cch extends ccr<cjy> {
   public static final int a = 24;

   @Override
   public Set<cbs<?>> a() {
      return ImmutableSet.copyOf(Iterables.concat(super.a(), List.of(cbs.B)));
   }

   protected void a(aqm $$0, cjy $$1) {
      super.a($$0, $$1);
      $$1.dS()
         .c(cbs.g)
         .stream()
         .flatMap(Collection::stream)
         .filter(brz.e)
         .filter($$1x -> ccy.c($$1, $$1x))
         .findFirst()
         .ifPresentOrElse($$1x -> $$1.dS().a(cbs.B, $$1x), () -> $$1.dS().b(cbs.B));
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
