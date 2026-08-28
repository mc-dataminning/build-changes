import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class cdm extends cdu<btm> {
   private static final long c = 32L;
   private static final long d = 16L;
   public static final int a = 32;

   @Override
   public Set<cco<?>> a() {
      return ImmutableSet.of(cco.L);
   }

   protected void a(arb $$0, btm $$1) {
      bum<?> $$2 = $$1.dS();
      List<cjc> $$3 = $$0.a(cjc.class, $$1.cK().c(32.0, 16.0, 32.0), $$0x -> true);
      $$3.sort(Comparator.comparingDouble($$1::g));
      Optional<cjc> $$4 = $$3.stream().filter($$1x -> $$1.k($$1x.p())).filter($$1x -> $$1x.a($$1, 32.0)).filter($$1::E).findFirst();
      $$2.a(cco.L, $$4);
   }
}
