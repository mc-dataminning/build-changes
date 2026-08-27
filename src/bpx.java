import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class bpx extends bqf<bgb> {
   private static final long c = 32L;
   private static final long d = 16L;
   public static final int a = 32;

   @Override
   public Set<bpb<?>> a() {
      return ImmutableSet.of(bpb.K);
   }

   protected void a(aif $$0, bgb $$1) {
      bha<?> $$2 = $$1.dK();
      List<bvh> $$3 = $$0.a(bvh.class, $$1.cE().c(32.0, 16.0, 32.0), $$0x -> true);
      $$3.sort(Comparator.comparingDouble($$1::f));
      Optional<bvh> $$4 = $$3.stream().filter($$1x -> $$1.k($$1x.j())).filter($$1x -> $$1x.a($$1, 32.0)).filter($$1::B).findFirst();
      $$2.a(bpb.K, $$4);
   }
}
