import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ceq extends ceo<bun> {
   private static final cev a = cev.b().d();
   private final Predicate<cvl> b;

   public ceq(Predicate<cvl> $$0) {
      this.b = $$0;
   }

   protected void a(arg $$0, bun $$1) {
      bvg<?> $$2 = $$1.dX();
      cev $$3 = a.c().a((double)((float)$$1.h(bvm.E)));
      List<cnp> $$4 = $$0.x()
         .stream()
         .filter(bto.f)
         .filter($$2x -> $$3.a($$1, $$2x))
         .filter(this::a)
         .filter($$1x -> !$$1.y($$1x))
         .sorted(Comparator.comparingDouble($$1::g))
         .collect(Collectors.toList());
      if (!$$4.isEmpty()) {
         cnp $$5 = $$4.get(0);
         $$2.a(cdi.O, $$5);
      } else {
         $$2.b(cdi.O);
      }
   }

   private boolean a(cnp $$0) {
      return this.a($$0.eW()) || this.a($$0.eX());
   }

   private boolean a(cvl $$0) {
      return this.b.test($$0);
   }

   @Override
   public Set<cdi<?>> a() {
      return ImmutableSet.of(cdi.O);
   }
}
