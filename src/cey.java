import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class cey extends cew<buv> {
   private static final cfd a = cfd.b().d();
   private final Predicate<cvs> b;

   public cey(Predicate<cvs> $$0) {
      this.b = $$0;
   }

   protected void a(arj $$0, buv $$1) {
      bvo<?> $$2 = $$1.dY();
      cfd $$3 = a.c().a((double)((float)$$1.h(bvu.E)));
      List<cnx> $$4 = $$0.x()
         .stream()
         .filter(btw.f)
         .filter($$2x -> $$3.a($$1, $$2x))
         .filter(this::a)
         .filter($$1x -> !$$1.y($$1x))
         .sorted(Comparator.comparingDouble($$1::g))
         .collect(Collectors.toList());
      if (!$$4.isEmpty()) {
         cnx $$5 = $$4.get(0);
         $$2.a(cdq.O, $$5);
      } else {
         $$2.b(cdq.O);
      }
   }

   private boolean a(cnx $$0) {
      return this.a($$0.eW()) || this.a($$0.eX());
   }

   private boolean a(cvs $$0) {
      return this.b.test($$0);
   }

   @Override
   public Set<cdq<?>> a() {
      return ImmutableSet.of(cdq.O);
   }
}
