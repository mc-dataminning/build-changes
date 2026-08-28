import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class cde extends cdm<bte> {
   private static final long c = 32L;
   private static final long d = 16L;
   public static final int a = 32;

   @Override
   public Set<ccg<?>> a() {
      return ImmutableSet.of(ccg.L);
   }

   protected void a(aqm $$0, bte $$1) {
      bue<?> $$2 = $$1.dV();
      List<civ> $$3 = $$0.a(civ.class, $$1.cM().c(32.0, 16.0, 32.0), $$0x -> true);
      $$3.sort(Comparator.comparingDouble($$1::g));
      Optional<civ> $$4 = $$3.stream().filter($$1x -> $$1.k($$1x.p())).filter($$1x -> $$1x.a($$1, 32.0)).filter($$1::F).findFirst();
      $$2.a(ccg.L, $$4);
   }
}
