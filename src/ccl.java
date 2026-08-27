import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ccl extends ccj<bsi> {
   public static final int a = 10;
   private static final ccq c = ccq.b().a(10.0).d();
   private final Predicate<csz> d;

   public ccl(Predicate<csz> $$0) {
      this.d = $$0;
   }

   protected void a(aqh $$0, bsi $$1) {
      btb<?> $$2 = $$1.dQ();
      List<clh> $$3 = $$0.x()
         .stream()
         .filter(brm.f)
         .filter($$1x -> c.a($$1, $$1x))
         .filter($$1x -> $$1.a($$1x, 10.0))
         .filter(this::a)
         .filter($$1x -> !$$1.x($$1x))
         .sorted(Comparator.comparingDouble($$1::g))
         .collect(Collectors.toList());
      if (!$$3.isEmpty()) {
         clh $$4 = $$3.get(0);
         $$2.a(cbd.O, $$4);
      } else {
         $$2.b(cbd.O);
      }
   }

   private boolean a(clh $$0) {
      return this.a($$0.eV()) || this.a($$0.eW());
   }

   private boolean a(csz $$0) {
      return this.d.test($$0);
   }

   @Override
   public Set<cbd<?>> a() {
      return ImmutableSet.of(cbd.O);
   }
}
