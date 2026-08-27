import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class btf extends btn<bjk> {
   private static final long c = 32L;
   private static final long d = 16L;
   public static final int a = 32;

   @Override
   public Set<bsj<?>> a() {
      return ImmutableSet.of(bsj.K);
   }

   protected void a(aks $$0, bjk $$1) {
      bki<?> $$2 = $$1.dN();
      List<byp> $$3 = $$0.a(byp.class, $$1.cG().c(32.0, 16.0, 32.0), $$0x -> true);
      $$3.sort(Comparator.comparingDouble($$1::f));
      Optional<byp> $$4 = $$3.stream().filter($$1x -> $$1.k($$1x.q())).filter($$1x -> $$1x.a($$1, 32.0)).filter($$1::E).findFirst();
      $$2.a(bsj.K, $$4);
   }
}
