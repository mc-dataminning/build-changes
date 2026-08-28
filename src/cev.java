import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class cev extends cet<bus> {
   private static final cfa a = cfa.b().d();
   private final Predicate<cvp> b;

   public cev(Predicate<cvp> $$0) {
      this.b = $$0;
   }

   protected void a(arh $$0, bus $$1) {
      bvl<?> $$2 = $$1.dX();
      cfa $$3 = a.c().a((double)((float)$$1.h(bvr.E)));
      List<cnu> $$4 = $$0.x()
         .stream()
         .filter(btt.f)
         .filter($$2x -> $$3.a($$1, $$2x))
         .filter(this::a)
         .filter($$1x -> !$$1.y($$1x))
         .sorted(Comparator.comparingDouble($$1::g))
         .collect(Collectors.toList());
      if (!$$4.isEmpty()) {
         cnu $$5 = $$4.get(0);
         $$2.a(cdn.O, $$5);
      } else {
         $$2.b(cdn.O);
      }
   }

   private boolean a(cnu $$0) {
      return this.a($$0.eW()) || this.a($$0.eX());
   }

   private boolean a(cvp $$0) {
      return this.b.test($$0);
   }

   @Override
   public Set<cdn<?>> a() {
      return ImmutableSet.of(cdn.O);
   }
}
