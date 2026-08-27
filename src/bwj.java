import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class bwj extends bwr<bmm> {
   private static final long c = 32L;
   private static final long d = 16L;
   public static final int a = 32;

   @Override
   public Set<bvm<?>> a() {
      return ImmutableSet.of(bvm.K);
   }

   protected void a(and $$0, bmm $$1) {
      bnk<?> $$2 = $$1.dO();
      List<cbt> $$3 = $$0.a(cbt.class, $$1.cH().c(32.0, 16.0, 32.0), $$0x -> true);
      $$3.sort(Comparator.comparingDouble($$1::f));
      Optional<cbt> $$4 = $$3.stream().filter($$1x -> $$1.k($$1x.q())).filter($$1x -> $$1x.a($$1, 32.0)).filter($$1::E).findFirst();
      $$2.a(bvm.K, $$4);
   }
}
