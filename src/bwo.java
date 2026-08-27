import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class bwo extends bwm<bmo> {
   public static final int a = 10;
   private static final bwt c = bwt.b().a(10.0).d();
   private final cps d;

   public bwo(cps $$0) {
      this.d = $$0;
   }

   protected void a(amz $$0, bmo $$1) {
      bnf<?> $$2 = $$1.dO();
      List<cfb> $$3 = $$0.x()
         .stream()
         .filter(bls.f)
         .filter($$1x -> c.a($$1, $$1x))
         .filter($$1x -> $$1.a($$1x, 10.0))
         .filter(this::a)
         .filter($$1x -> !$$1.x($$1x))
         .sorted(Comparator.comparingDouble($$1::f))
         .collect(Collectors.toList());
      if (!$$3.isEmpty()) {
         cfb $$4 = $$3.get(0);
         $$2.a(bvh.N, $$4);
      } else {
         $$2.b(bvh.N);
      }
   }

   private boolean a(cfb $$0) {
      return this.a($$0.eT()) || this.a($$0.eU());
   }

   private boolean a(cmr $$0) {
      return this.d.a($$0);
   }

   @Override
   public Set<bvh<?>> a() {
      return ImmutableSet.of(bvh.N);
   }
}
