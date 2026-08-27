import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class bug extends buo<bkl> {
   private static final long c = 32L;
   private static final long d = 16L;
   public static final int a = 32;

   @Override
   public Set<btk<?>> a() {
      return ImmutableSet.of(btk.K);
   }

   protected void a(alq $$0, bkl $$1) {
      blj<?> $$2 = $$1.dN();
      List<bzq> $$3 = $$0.a(bzq.class, $$1.cG().c(32.0, 16.0, 32.0), $$0x -> true);
      $$3.sort(Comparator.comparingDouble($$1::f));
      Optional<bzq> $$4 = $$3.stream().filter($$1x -> $$1.k($$1x.q())).filter($$1x -> $$1x.a($$1, 32.0)).filter($$1::E).findFirst();
      $$2.a(btk.K, $$4);
   }
}
