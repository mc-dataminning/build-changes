import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterables;
import java.util.Collection;
import java.util.List;
import java.util.Set;

public class cdi extends cds<ckz> {
   public static final int a = 24;

   @Override
   public Set<cct<?>> a() {
      return ImmutableSet.copyOf(Iterables.concat(super.a(), List.of(cct.B)));
   }

   protected void a(arf $$0, ckz $$1) {
      super.a($$0, $$1);
      $$1.dS()
         .c(cct.g)
         .stream()
         .flatMap(Collection::stream)
         .filter(bsz.e)
         .filter($$1x -> cdz.c($$1, $$1x))
         .findFirst()
         .ifPresentOrElse($$1x -> $$1.dS().a(cct.B, $$1x), () -> $$1.dS().b(cct.B));
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
