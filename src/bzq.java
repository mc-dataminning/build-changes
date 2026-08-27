import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class bzq extends bzy<bpr> {
   private static final long c = 32L;
   private static final long d = 16L;
   public static final int a = 32;

   @Override
   public Set<bys<?>> a() {
      return ImmutableSet.of(bys.L);
   }

   protected void a(apf $$0, bpr $$1) {
      bqq<?> $$2 = $$1.dP();
      List<cfe> $$3 = $$0.a(cfe.class, $$1.cH().c(32.0, 16.0, 32.0), $$0x -> true);
      $$3.sort(Comparator.comparingDouble($$1::g));
      Optional<cfe> $$4 = $$3.stream().filter($$1x -> $$1.k($$1x.p())).filter($$1x -> $$1x.a($$1, 32.0)).filter($$1::E).findFirst();
      $$2.a(bys.L, $$4);
   }
}
