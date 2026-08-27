import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class byj extends byr<bok> {
   private static final long c = 32L;
   private static final long d = 16L;
   public static final int a = 32;

   @Override
   public Set<bxl<?>> a() {
      return ImmutableSet.of(bxl.L);
   }

   protected void a(aow $$0, bok $$1) {
      bpj<?> $$2 = $$1.dO();
      List<cdw> $$3 = $$0.a(cdw.class, $$1.cH().c(32.0, 16.0, 32.0), $$0x -> true);
      $$3.sort(Comparator.comparingDouble($$1::f));
      Optional<cdw> $$4 = $$3.stream().filter($$1x -> $$1.k($$1x.q())).filter($$1x -> $$1x.a($$1, 32.0)).filter($$1::D).findFirst();
      $$2.a(bxl.L, $$4);
   }
}
