import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class ceo extends cew<bup> {
   private static final long b = 32L;
   private static final long c = 16L;
   public static final int a = 32;

   @Override
   public Set<cdq<?>> a() {
      return ImmutableSet.of(cdq.L);
   }

   protected void a(arj $$0, bup $$1) {
      bvo<?> $$2 = $$1.dY();
      List<ckh> $$3 = $$0.a(ckh.class, $$1.cO().c(32.0, 16.0, 32.0), $$0x -> true);
      $$3.sort(Comparator.comparingDouble($$1::g));
      Optional<ckh> $$4 = $$3.stream().filter($$1x -> $$1.j($$1x.m())).filter($$1x -> $$1x.a($$1, 32.0)).filter($$1::G).findFirst();
      $$2.a(cdq.L, $$4);
   }
}
