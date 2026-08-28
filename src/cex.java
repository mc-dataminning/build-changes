import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class cex extends cff<bux> {
   private static final long b = 32L;
   private static final long c = 16L;
   public static final int a = 32;

   @Override
   public Set<cdz<?>> a() {
      return ImmutableSet.of(cdz.L);
   }

   protected void a(arm $$0, bux $$1) {
      bvx<?> $$2 = $$1.ed();
      List<ckq> $$3 = $$0.a(ckq.class, $$1.cS().c(32.0, 16.0, 32.0), $$0x -> true);
      $$3.sort(Comparator.comparingDouble($$1::g));
      Optional<ckq> $$4 = $$3.stream().filter($$1x -> $$1.i($$1x.m())).filter($$1x -> $$1x.a($$1, 32.0)).filter($$1::G).findFirst();
      $$2.a(cdz.L, $$4);
   }
}
