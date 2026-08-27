import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class buv extends bvd<bla> {
   private static final long c = 32L;
   private static final long d = 16L;
   public static final int a = 32;

   @Override
   public Set<btz<?>> a() {
      return ImmutableSet.of(btz.K);
   }

   protected void a(ama $$0, bla $$1) {
      bly<?> $$2 = $$1.dN();
      List<caf> $$3 = $$0.a(caf.class, $$1.cG().c(32.0, 16.0, 32.0), $$0x -> true);
      $$3.sort(Comparator.comparingDouble($$1::f));
      Optional<caf> $$4 = $$3.stream().filter($$1x -> $$1.k($$1x.q())).filter($$1x -> $$1x.a($$1, 32.0)).filter($$1::E).findFirst();
      $$2.a(btz.K, $$4);
   }
}
