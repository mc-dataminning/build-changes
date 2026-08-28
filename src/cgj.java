import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class cgj extends cgh<bwf> {
   private static final cgo a = cgo.b().d();
   private final Predicate<cxg> b;

   public cgj(Predicate<cxg> $$0) {
      this.b = $$0;
   }

   protected void a(arx $$0, bwf $$1) {
      bwz<?> $$2 = $$1.ec();
      cgo $$3 = a.c().a((double)((float)$$1.h(bxf.E)));
      List<cpo> $$4 = $$0.z()
         .stream()
         .filter(bvg.f)
         .filter($$3x -> $$3.a($$0, $$1, $$3x))
         .filter(this::a)
         .filter($$1x -> !$$1.y($$1x))
         .sorted(Comparator.comparingDouble($$1::g))
         .collect(Collectors.toList());
      if (!$$4.isEmpty()) {
         cpo $$5 = $$4.get(0);
         $$2.a(cfb.O, $$5);
      } else {
         $$2.b(cfb.O);
      }
   }

   private boolean a(cpo $$0) {
      return this.a($$0.eZ()) || this.a($$0.fa());
   }

   private boolean a(cxg $$0) {
      return this.b.test($$0);
   }

   @Override
   public Set<cfb<?>> a() {
      return ImmutableSet.of(cfb.O);
   }
}
