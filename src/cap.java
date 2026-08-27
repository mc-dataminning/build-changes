import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class cap extends cax<bqq> {
   private static final long c = 32L;
   private static final long d = 16L;
   public static final int a = 32;

   @Override
   public Set<bzr<?>> a() {
      return ImmutableSet.of(bzr.L);
   }

   protected void a(aps $$0, bqq $$1) {
      brp<?> $$2 = $$1.dP();
      List<cgd> $$3 = $$0.a(cgd.class, $$1.cH().c(32.0, 16.0, 32.0), $$0x -> true);
      $$3.sort(Comparator.comparingDouble($$1::g));
      Optional<cgd> $$4 = $$3.stream().filter($$1x -> $$1.k($$1x.p())).filter($$1x -> $$1x.a($$1, 32.0)).filter($$1::E).findFirst();
      $$2.a(bzr.L, $$4);
   }
}
