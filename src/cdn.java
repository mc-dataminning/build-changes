import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class cdn extends cdl<btk> {
   public static final int a = 10;
   private static final cds c = cds.b().a(10.0).d();
   private final Predicate<cuc> d;

   public cdn(Predicate<cuc> $$0) {
      this.d = $$0;
   }

   protected void a(aqm $$0, btk $$1) {
      bud<?> $$2 = $$1.dU();
      List<cmk> $$3 = $$0.x()
         .stream()
         .filter(bsl.f)
         .filter($$1x -> c.a($$1, $$1x))
         .filter($$1x -> $$1.a($$1x, 10.0))
         .filter(this::a)
         .filter($$1x -> !$$1.x($$1x))
         .sorted(Comparator.comparingDouble($$1::g))
         .collect(Collectors.toList());
      if (!$$3.isEmpty()) {
         cmk $$4 = $$3.get(0);
         $$2.a(ccf.O, $$4);
      } else {
         $$2.b(ccf.O);
      }
   }

   private boolean a(cmk $$0) {
      return this.a($$0.eU()) || this.a($$0.eV());
   }

   private boolean a(cuc $$0) {
      return this.d.test($$0);
   }

   @Override
   public Set<ccf<?>> a() {
      return ImmutableSet.of(ccf.O);
   }
}
