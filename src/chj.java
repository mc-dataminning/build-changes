import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class chj extends chr<bxl> {
   private static final long b = 32L;
   private static final long c = 16L;
   public static final int a = 32;

   @Override
   public Set<cgl<?>> a() {
      return ImmutableSet.of(cgl.M);
   }

   protected void a(arq $$0, bxl $$1) {
      byj<?> $$2 = $$1.eb();
      List<cnr> $$3 = $$0.a(cnr.class, $$1.cQ().c(32.0, 16.0, 32.0), $$0x -> true);
      $$3.sort(Comparator.comparingDouble($$1::g));
      Optional<cnr> $$4 = $$3.stream().filter($$2x -> $$1.c($$0, $$2x.f())).filter($$1x -> $$1x.a($$1, 32.0)).filter($$1::E).findFirst();
      $$2.a(cgl.M, $$4);
   }
}
