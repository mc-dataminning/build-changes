import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class bsu extends btc<biy> {
   private static final long c = 32L;
   private static final long d = 16L;
   public static final int a = 32;

   @Override
   public Set<bry<?>> a() {
      return ImmutableSet.of(bry.K);
   }

   protected void a(aki $$0, biy $$1) {
      bjx<?> $$2 = $$1.dM();
      List<bye> $$3 = $$0.a(bye.class, $$1.cG().c(32.0, 16.0, 32.0), $$0x -> true);
      $$3.sort(Comparator.comparingDouble($$1::f));
      Optional<bye> $$4 = $$3.stream().filter($$1x -> $$1.k($$1x.j())).filter($$1x -> $$1x.a($$1, 32.0)).filter($$1::E).findFirst();
      $$2.a(bry.K, $$4);
   }
}
