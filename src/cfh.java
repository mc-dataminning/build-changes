import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class cfh extends cff<bvd> {
   private static final cfm a = cfm.b().d();
   private final Predicate<cvx> b;

   public cfh(Predicate<cvx> $$0) {
      this.b = $$0;
   }

   protected void a(arm $$0, bvd $$1) {
      bvx<?> $$2 = $$1.ed();
      cfm $$3 = a.c().a((double)((float)$$1.h(bwd.E)));
      List<coh> $$4 = $$0.x()
         .stream()
         .filter(bue.f)
         .filter($$2x -> $$3.a($$1, $$2x))
         .filter(this::a)
         .filter($$1x -> !$$1.y($$1x))
         .sorted(Comparator.comparingDouble($$1::g))
         .collect(Collectors.toList());
      if (!$$4.isEmpty()) {
         coh $$5 = $$4.get(0);
         $$2.a(cdz.O, $$5);
      } else {
         $$2.b(cdz.O);
      }
   }

   private boolean a(coh $$0) {
      return this.a($$0.fb()) || this.a($$0.fc());
   }

   private boolean a(cvx $$0) {
      return this.b.test($$0);
   }

   @Override
   public Set<cdz<?>> a() {
      return ImmutableSet.of(cdz.O);
   }
}
