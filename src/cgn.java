import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class cgn extends cgl<bwj> {
   private static final cgs a = cgs.b().d();
   private final Predicate<cxk> b;

   public cgn(Predicate<cxk> $$0) {
      this.b = $$0;
   }

   protected void a(ash $$0, bwj $$1) {
      bxd<?> $$2 = $$1.eb();
      cgs $$3 = a.c().a((double)((float)$$1.h(bxj.E)));
      List<cps> $$4 = $$0.y()
         .stream()
         .filter(bvk.f)
         .filter($$3x -> $$3.a($$0, $$1, $$3x))
         .filter(this::a)
         .filter($$1x -> !$$1.y($$1x))
         .sorted(Comparator.comparingDouble($$1::g))
         .collect(Collectors.toList());
      if (!$$4.isEmpty()) {
         cps $$5 = $$4.get(0);
         $$2.a(cff.O, $$5);
      } else {
         $$2.b(cff.O);
      }
   }

   private boolean a(cps $$0) {
      return this.a($$0.eX()) || this.a($$0.eY());
   }

   private boolean a(cxk $$0) {
      return this.b.test($$0);
   }

   @Override
   public Set<cff<?>> a() {
      return ImmutableSet.of(cff.O);
   }
}
