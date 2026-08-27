import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class bwu extends bws<bmu> {
   public static final int a = 10;
   private static final bwz c = bwz.b().a(10.0).d();
   private final cpz d;

   public bwu(cpz $$0) {
      this.d = $$0;
   }

   protected void a(and $$0, bmu $$1) {
      bnl<?> $$2 = $$1.dO();
      List<cfi> $$3 = $$0.x()
         .stream()
         .filter(bly.f)
         .filter($$1x -> c.a($$1, $$1x))
         .filter($$1x -> $$1.a($$1x, 10.0))
         .filter(this::a)
         .filter($$1x -> !$$1.x($$1x))
         .sorted(Comparator.comparingDouble($$1::f))
         .collect(Collectors.toList());
      if (!$$3.isEmpty()) {
         cfi $$4 = $$3.get(0);
         $$2.a(bvn.N, $$4);
      } else {
         $$2.b(bvn.N);
      }
   }

   private boolean a(cfi $$0) {
      return this.a($$0.eT()) || this.a($$0.eU());
   }

   private boolean a(cmy $$0) {
      return this.d.a($$0);
   }

   @Override
   public Set<bvn<?>> a() {
      return ImmutableSet.of(bvn.N);
   }
}
