import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class cbf extends cbn<brg> {
   private static final long c = 32L;
   private static final long d = 16L;
   public static final int a = 32;

   @Override
   public Set<cah<?>> a() {
      return ImmutableSet.of(cah.L);
   }

   protected void a(aqe $$0, brg $$1) {
      bsf<?> $$2 = $$1.dQ();
      List<cgv> $$3 = $$0.a(cgv.class, $$1.cI().c(32.0, 16.0, 32.0), $$0x -> true);
      $$3.sort(Comparator.comparingDouble($$1::g));
      Optional<cgv> $$4 = $$3.stream().filter($$1x -> $$1.k($$1x.p())).filter($$1x -> $$1x.a($$1, 32.0)).filter($$1::E).findFirst();
      $$2.a(cah.L, $$4);
   }
}
