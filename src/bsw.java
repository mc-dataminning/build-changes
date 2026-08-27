import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class bsw extends bte<bja> {
   private static final long c = 32L;
   private static final long d = 16L;
   public static final int a = 32;

   @Override
   public Set<bsa<?>> a() {
      return ImmutableSet.of(bsa.K);
   }

   protected void a(akk $$0, bja $$1) {
      bjz<?> $$2 = $$1.dM();
      List<byg> $$3 = $$0.a(byg.class, $$1.cG().c(32.0, 16.0, 32.0), $$0x -> true);
      $$3.sort(Comparator.comparingDouble($$1::f));
      Optional<byg> $$4 = $$3.stream().filter($$1x -> $$1.k($$1x.j())).filter($$1x -> $$1x.a($$1, 32.0)).filter($$1::E).findFirst();
      $$2.a(bsa.K, $$4);
   }
}
