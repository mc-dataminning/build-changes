import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class cdo extends cdw<btn> {
   private static final long c = 32L;
   private static final long d = 16L;
   public static final int a = 32;

   @Override
   public Set<ccq<?>> a() {
      return ImmutableSet.of(ccq.L);
   }

   protected void a(aqt $$0, btn $$1) {
      buo<?> $$2 = $$1.dU();
      List<cjf> $$3 = $$0.a(cjf.class, $$1.cL().c(32.0, 16.0, 32.0), $$0x -> true);
      $$3.sort(Comparator.comparingDouble($$1::g));
      Optional<cjf> $$4 = $$3.stream().filter($$1x -> $$1.k($$1x.p())).filter($$1x -> $$1x.a($$1, 32.0)).filter($$1::F).findFirst();
      $$2.a(ccq.L, $$4);
   }
}
