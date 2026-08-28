import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class cdy extends cdw<btu> {
   public static final int a = 10;
   private static final ced c = ced.b().a(10.0).d();
   private final Predicate<cuo> d;

   public cdy(Predicate<cuo> $$0) {
      this.d = $$0;
   }

   protected void a(aqt $$0, btu $$1) {
      buo<?> $$2 = $$1.dU();
      List<cmv> $$3 = $$0.x()
         .stream()
         .filter(bsv.f)
         .filter($$1x -> c.a($$1, $$1x))
         .filter($$1x -> $$1.a($$1x, 10.0))
         .filter(this::a)
         .filter($$1x -> !$$1.x($$1x))
         .sorted(Comparator.comparingDouble($$1::g))
         .collect(Collectors.toList());
      if (!$$3.isEmpty()) {
         cmv $$4 = $$3.get(0);
         $$2.a(ccq.O, $$4);
      } else {
         $$2.b(ccq.O);
      }
   }

   private boolean a(cmv $$0) {
      return this.a($$0.eU()) || this.a($$0.eV());
   }

   private boolean a(cuo $$0) {
      return this.d.test($$0);
   }

   @Override
   public Set<ccq<?>> a() {
      return ImmutableSet.of(ccq.O);
   }
}
