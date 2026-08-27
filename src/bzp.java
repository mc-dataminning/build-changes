import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class bzp extends bzx<bpq> {
   private static final long c = 32L;
   private static final long d = 16L;
   public static final int a = 32;

   @Override
   public Set<byr<?>> a() {
      return ImmutableSet.of(byr.L);
   }

   protected void a(apf $$0, bpq $$1) {
      bqp<?> $$2 = $$1.dP();
      List<cfd> $$3 = $$0.a(cfd.class, $$1.cH().c(32.0, 16.0, 32.0), $$0x -> true);
      $$3.sort(Comparator.comparingDouble($$1::g));
      Optional<cfd> $$4 = $$3.stream().filter($$1x -> $$1.k($$1x.p())).filter($$1x -> $$1x.a($$1, 32.0)).filter($$1::E).findFirst();
      $$2.a(byr.L, $$4);
   }
}
