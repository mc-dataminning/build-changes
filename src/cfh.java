import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class cfh extends cfp<bvh> {
   private static final long b = 32L;
   private static final long c = 16L;
   public static final int a = 32;

   @Override
   public Set<cej<?>> a() {
      return ImmutableSet.of(cej.L);
   }

   protected void a(arc $$0, bvh $$1) {
      bwh<?> $$2 = $$1.ec();
      List<cla> $$3 = $$0.a(cla.class, $$1.cR().c(32.0, 16.0, 32.0), $$0x -> true);
      $$3.sort(Comparator.comparingDouble($$1::g));
      Optional<cla> $$4 = $$3.stream().filter($$2x -> $$1.c($$0, $$2x.l())).filter($$1x -> $$1x.a($$1, 32.0)).filter($$1::E).findFirst();
      $$2.a(cej.L, $$4);
   }
}
