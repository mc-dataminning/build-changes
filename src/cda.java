import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class cda extends cdi<bta> {
   private static final long c = 32L;
   private static final long d = 16L;
   public static final int a = 32;

   @Override
   public Set<ccc<?>> a() {
      return ImmutableSet.of(ccc.L);
   }

   protected void a(aqk $$0, bta $$1) {
      bua<?> $$2 = $$1.dT();
      List<cir> $$3 = $$0.a(cir.class, $$1.cK().c(32.0, 16.0, 32.0), $$0x -> true);
      $$3.sort(Comparator.comparingDouble($$1::g));
      Optional<cir> $$4 = $$3.stream().filter($$1x -> $$1.k($$1x.p())).filter($$1x -> $$1x.a($$1, 32.0)).filter($$1::F).findFirst();
      $$2.a(ccc.L, $$4);
   }
}
