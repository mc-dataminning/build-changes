import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class bvn extends bvl<blp> {
   public static final int a = 10;
   private static final bvs c = bvs.b().a(10.0).d();
   private final cok d;

   public bvn(cok $$0) {
      this.d = $$0;
   }

   protected void a(ame $$0, blp $$1) {
      bmg<?> $$2 = $$1.dP();
      List<cdu> $$3 = $$0.w()
         .stream()
         .filter(bkt.f)
         .filter($$1x -> c.a($$1, $$1x))
         .filter($$1x -> $$1.a($$1x, 10.0))
         .filter(this::a)
         .filter($$1x -> !$$1.x($$1x))
         .sorted(Comparator.comparingDouble($$1::f))
         .collect(Collectors.toList());
      if (!$$3.isEmpty()) {
         cdu $$4 = $$3.get(0);
         $$2.a(buh.N, $$4);
      } else {
         $$2.b(buh.N);
      }
   }

   private boolean a(cdu $$0) {
      return this.a($$0.eU()) || this.a($$0.eV());
   }

   private boolean a(clj $$0) {
      return this.d.a($$0);
   }

   @Override
   public Set<buh<?>> a() {
      return ImmutableSet.of(buh.N);
   }
}
