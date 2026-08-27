import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class bsy extends btg<bjd> {
   private static final long c = 32L;
   private static final long d = 16L;
   public static final int a = 32;

   @Override
   public Set<bsc<?>> a() {
      return ImmutableSet.of(bsc.K);
   }

   protected void a(akn $$0, bjd $$1) {
      bkb<?> $$2 = $$1.dM();
      List<byi> $$3 = $$0.a(byi.class, $$1.cG().c(32.0, 16.0, 32.0), $$0x -> true);
      $$3.sort(Comparator.comparingDouble($$1::f));
      Optional<byi> $$4 = $$3.stream().filter($$1x -> $$1.k($$1x.j())).filter($$1x -> $$1x.a($$1, 32.0)).filter($$1::E).findFirst();
      $$2.a(bsc.K, $$4);
   }
}
