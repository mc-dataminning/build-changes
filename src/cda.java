import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class cda extends ccy<bsx> {
   public static final int a = 10;
   private static final cdf c = cdf.b().a(10.0).d();
   private final Predicate<cto> d;

   public cda(Predicate<cto> $$0) {
      this.d = $$0;
   }

   protected void a(aqm $$0, bsx $$1) {
      btq<?> $$2 = $$1.dS();
      List<clw> $$3 = $$0.x()
         .stream()
         .filter(brz.f)
         .filter($$1x -> c.a($$1, $$1x))
         .filter($$1x -> $$1.a($$1x, 10.0))
         .filter(this::a)
         .filter($$1x -> !$$1.x($$1x))
         .sorted(Comparator.comparingDouble($$1::g))
         .collect(Collectors.toList());
      if (!$$3.isEmpty()) {
         clw $$4 = $$3.get(0);
         $$2.a(cbs.O, $$4);
      } else {
         $$2.b(cbs.O);
      }
   }

   private boolean a(clw $$0) {
      return this.a($$0.eX()) || this.a($$0.eY());
   }

   private boolean a(cto $$0) {
      return this.d.test($$0);
   }

   @Override
   public Set<cbs<?>> a() {
      return ImmutableSet.of(cbs.O);
   }
}
