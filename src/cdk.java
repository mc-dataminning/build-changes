import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class cdk extends cdi<bth> {
   public static final int a = 10;
   private static final cdp c = cdp.b().a(10.0).d();
   private final Predicate<cua> d;

   public cdk(Predicate<cua> $$0) {
      this.d = $$0;
   }

   protected void a(aqk $$0, bth $$1) {
      bua<?> $$2 = $$1.dT();
      List<cmh> $$3 = $$0.x()
         .stream()
         .filter(bsi.f)
         .filter($$1x -> c.a($$1, $$1x))
         .filter($$1x -> $$1.a($$1x, 10.0))
         .filter(this::a)
         .filter($$1x -> !$$1.x($$1x))
         .sorted(Comparator.comparingDouble($$1::g))
         .collect(Collectors.toList());
      if (!$$3.isEmpty()) {
         cmh $$4 = $$3.get(0);
         $$2.a(ccc.O, $$4);
      } else {
         $$2.b(ccc.O);
      }
   }

   private boolean a(cmh $$0) {
      return this.a($$0.eT()) || this.a($$0.eU());
   }

   private boolean a(cua $$0) {
      return this.d.test($$0);
   }

   @Override
   public Set<ccc<?>> a() {
      return ImmutableSet.of(ccc.O);
   }
}
