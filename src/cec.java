import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class cec extends cea<btz> {
   public static final int a = 10;
   private static final ceh c = ceh.b().a(10.0).d();
   private final Predicate<cuq> d;

   public cec(Predicate<cuq> $$0) {
      this.d = $$0;
   }

   protected void a(arf $$0, btz $$1) {
      bus<?> $$2 = $$1.dS();
      List<cmy> $$3 = $$0.x()
         .stream()
         .filter(bta.f)
         .filter($$1x -> c.a($$1, $$1x))
         .filter($$1x -> $$1.a($$1x, 10.0))
         .filter(this::a)
         .filter($$1x -> !$$1.x($$1x))
         .sorted(Comparator.comparingDouble($$1::g))
         .collect(Collectors.toList());
      if (!$$3.isEmpty()) {
         cmy $$4 = $$3.get(0);
         $$2.a(ccu.O, $$4);
      } else {
         $$2.b(ccu.O);
      }
   }

   private boolean a(cmy $$0) {
      return this.a($$0.eX()) || this.a($$0.eY());
   }

   private boolean a(cuq $$0) {
      return this.d.test($$0);
   }

   @Override
   public Set<ccu<?>> a() {
      return ImmutableSet.of(ccu.O);
   }
}
