import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class ccb extends ccj<bsc> {
   private static final long c = 32L;
   private static final long d = 16L;
   public static final int a = 32;

   @Override
   public Set<cbd<?>> a() {
      return ImmutableSet.of(cbd.L);
   }

   protected void a(aqh $$0, bsc $$1) {
      btb<?> $$2 = $$1.dQ();
      List<chr> $$3 = $$0.a(chr.class, $$1.cI().c(32.0, 16.0, 32.0), $$0x -> true);
      $$3.sort(Comparator.comparingDouble($$1::g));
      Optional<chr> $$4 = $$3.stream().filter($$1x -> $$1.k($$1x.p())).filter($$1x -> $$1x.a($$1, 32.0)).filter($$1::E).findFirst();
      $$2.a(cbd.L, $$4);
   }
}
