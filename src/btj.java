import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class btj extends btr<bjo> {
   private static final long c = 32L;
   private static final long d = 16L;
   public static final int a = 32;

   @Override
   public Set<bsn<?>> a() {
      return ImmutableSet.of(bsn.K);
   }

   protected void a(akt $$0, bjo $$1) {
      bkm<?> $$2 = $$1.dN();
      List<byt> $$3 = $$0.a(byt.class, $$1.cG().c(32.0, 16.0, 32.0), $$0x -> true);
      $$3.sort(Comparator.comparingDouble($$1::f));
      Optional<byt> $$4 = $$3.stream().filter($$1x -> $$1.k($$1x.q())).filter($$1x -> $$1x.a($$1, 32.0)).filter($$1::E).findFirst();
      $$2.a(bsn.K, $$4);
   }
}
