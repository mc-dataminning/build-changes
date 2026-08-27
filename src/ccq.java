import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class ccq extends ccy<bsq> {
   private static final long c = 32L;
   private static final long d = 16L;
   public static final int a = 32;

   @Override
   public Set<cbs<?>> a() {
      return ImmutableSet.of(cbs.L);
   }

   protected void a(aqm $$0, bsq $$1) {
      btq<?> $$2 = $$1.dS();
      List<cig> $$3 = $$0.a(cig.class, $$1.cK().c(32.0, 16.0, 32.0), $$0x -> true);
      $$3.sort(Comparator.comparingDouble($$1::g));
      Optional<cig> $$4 = $$3.stream().filter($$1x -> $$1.k($$1x.p())).filter($$1x -> $$1x.a($$1, 32.0)).filter($$1::E).findFirst();
      $$2.a(cbs.L, $$4);
   }
}
