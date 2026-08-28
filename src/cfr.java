import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class cfr extends cfp<bvn> {
   private static final cfw a = cfw.b().d();
   private final Predicate<cwn> b;

   public cfr(Predicate<cwn> $$0) {
      this.b = $$0;
   }

   protected void a(arc $$0, bvn $$1) {
      bwh<?> $$2 = $$1.ec();
      cfw $$3 = a.c().a((double)((float)$$1.h(bwn.E)));
      List<cov> $$4 = $$0.z()
         .stream()
         .filter(buo.f)
         .filter($$3x -> $$3.a($$0, $$1, $$3x))
         .filter(this::a)
         .filter($$1x -> !$$1.y($$1x))
         .sorted(Comparator.comparingDouble($$1::g))
         .collect(Collectors.toList());
      if (!$$4.isEmpty()) {
         cov $$5 = $$4.get(0);
         $$2.a(cej.O, $$5);
      } else {
         $$2.b(cej.O);
      }
   }

   private boolean a(cov $$0) {
      return this.a($$0.eZ()) || this.a($$0.fa());
   }

   private boolean a(cwn $$0) {
      return this.b.test($$0);
   }

   @Override
   public Set<cej<?>> a() {
      return ImmutableSet.of(cej.O);
   }
}
