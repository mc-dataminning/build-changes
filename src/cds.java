import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class cds extends cea<bts> {
   private static final long c = 32L;
   private static final long d = 16L;
   public static final int a = 32;

   @Override
   public Set<ccu<?>> a() {
      return ImmutableSet.of(ccu.L);
   }

   protected void a(arf $$0, bts $$1) {
      bus<?> $$2 = $$1.dS();
      List<cji> $$3 = $$0.a(cji.class, $$1.cK().c(32.0, 16.0, 32.0), $$0x -> true);
      $$3.sort(Comparator.comparingDouble($$1::g));
      Optional<cji> $$4 = $$3.stream().filter($$1x -> $$1.k($$1x.p())).filter($$1x -> $$1x.a($$1, 32.0)).filter($$1::E).findFirst();
      $$2.a(ccu.L, $$4);
   }
}
