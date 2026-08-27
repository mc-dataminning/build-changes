import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterables;
import java.util.Collection;
import java.util.List;
import java.util.Set;

public class bwf extends bwp<cds> {
   public static final int a = 24;

   @Override
   public Set<bvq<?>> a() {
      return ImmutableSet.copyOf(Iterables.concat(super.a(), List.of(bvq.B)));
   }

   protected void a(ane $$0, cds $$1) {
      super.a($$0, $$1);
      $$1.dN()
         .c(bvq.g)
         .stream()
         .flatMap(Collection::stream)
         .filter(bmb.e)
         .filter($$1x -> bww.c($$1, $$1x))
         .findFirst()
         .ifPresentOrElse($$1x -> $$1.dN().a(bvq.B, $$1x), () -> $$1.dN().b(bvq.B));
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
