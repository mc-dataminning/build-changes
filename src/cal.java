import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterables;
import java.util.Collection;
import java.util.List;
import java.util.Set;

public class cal extends cav<cic> {
   public static final int a = 24;

   @Override
   public Set<bzw<?>> a() {
      return ImmutableSet.copyOf(Iterables.concat(super.a(), List.of(bzw.B)));
   }

   protected void a(apu $$0, cic $$1) {
      super.a($$0, $$1);
      $$1.dP()
         .c(bzw.g)
         .stream()
         .flatMap(Collection::stream)
         .filter(bqf.e)
         .filter($$1x -> cbc.c($$1, $$1x))
         .findFirst()
         .ifPresentOrElse($$1x -> $$1.dP().a(bzw.B, $$1x), () -> $$1.dP().b(bzw.B));
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
