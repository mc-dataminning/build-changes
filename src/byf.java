import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class byf extends byn<boi> {
   private static final long c = 32L;
   private static final long d = 16L;
   public static final int a = 32;

   @Override
   public Set<bxh<?>> a() {
      return ImmutableSet.of(bxh.L);
   }

   protected void a(aov $$0, boi $$1) {
      bpf<?> $$2 = $$1.dO();
      List<cds> $$3 = $$0.a(cds.class, $$1.cH().c(32.0, 16.0, 32.0), $$0x -> true);
      $$3.sort(Comparator.comparingDouble($$1::f));
      Optional<cds> $$4 = $$3.stream().filter($$1x -> $$1.k($$1x.q())).filter($$1x -> $$1x.a($$1, 32.0)).filter($$1::D).findFirst();
      $$2.a(bxh.L, $$4);
   }
}
