import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class cfu extends cfs<bvq> {
   private static final cfz a = cfz.b().d();
   private final Predicate<cwq> b;

   public cfu(Predicate<cwq> $$0) {
      this.b = $$0;
   }

   protected void a(ard $$0, bvq $$1) {
      bwk<?> $$2 = $$1.eb();
      cfz $$3 = a.c().a((double)((float)$$1.h(bwq.E)));
      List<coy> $$4 = $$0.z()
         .stream()
         .filter(bur.f)
         .filter($$3x -> $$3.a($$0, $$1, $$3x))
         .filter(this::a)
         .filter($$1x -> !$$1.y($$1x))
         .sorted(Comparator.comparingDouble($$1::g))
         .collect(Collectors.toList());
      if (!$$4.isEmpty()) {
         coy $$5 = $$4.get(0);
         $$2.a(cem.O, $$5);
      } else {
         $$2.b(cem.O);
      }
   }

   private boolean a(coy $$0) {
      return this.a($$0.eZ()) || this.a($$0.fa());
   }

   private boolean a(cwq $$0) {
      return this.b.test($$0);
   }

   @Override
   public Set<cem<?>> a() {
      return ImmutableSet.of(cem.O);
   }
}
