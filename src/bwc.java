import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterables;
import java.util.Collection;
import java.util.List;
import java.util.Set;

public class bwc extends bwl<cdl> {
   public static final int a = 24;

   @Override
   public Set<bvn<?>> a() {
      return ImmutableSet.copyOf(Iterables.concat(super.a(), List.of(bvn.B)));
   }

   protected void a(and $$0, cdl $$1) {
      super.a($$0, $$1);
      $$1.dO()
         .c(bvn.g)
         .stream()
         .flatMap(Collection::stream)
         .filter($$1x -> bws.c($$1, $$1x))
         .findFirst()
         .ifPresentOrElse($$1x -> $$1.dO().a(bvn.B, $$1x), () -> $$1.dO().b(bvn.B));
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
