import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class bwe extends bwc<bme> {
   public static final int a = 10;
   private static final bwj c = bwj.b().a(10.0).d();
   private final cpi d;

   public bwe(cpi $$0) {
      this.d = $$0;
   }

   protected void a(amp $$0, bme $$1) {
      bmv<?> $$2 = $$1.dO();
      List<cer> $$3 = $$0.w()
         .stream()
         .filter(bli.f)
         .filter($$1x -> c.a($$1, $$1x))
         .filter($$1x -> $$1.a($$1x, 10.0))
         .filter(this::a)
         .filter($$1x -> !$$1.x($$1x))
         .sorted(Comparator.comparingDouble($$1::f))
         .collect(Collectors.toList());
      if (!$$3.isEmpty()) {
         cer $$4 = $$3.get(0);
         $$2.a(bux.N, $$4);
      } else {
         $$2.b(bux.N);
      }
   }

   private boolean a(cer $$0) {
      return this.a($$0.eT()) || this.a($$0.eU());
   }

   private boolean a(cmh $$0) {
      return this.d.a($$0);
   }

   @Override
   public Set<bux<?>> a() {
      return ImmutableSet.of(bux.N);
   }
}
