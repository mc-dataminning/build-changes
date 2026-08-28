import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class cgs extends cgq<bwo> {
   private static final cgx a = cgx.b().d();
   private final Predicate<cxp> b;

   public cgs(Predicate<cxp> $$0) {
      this.b = $$0;
   }

   protected void a(ash $$0, bwo $$1) {
      bxi<?> $$2 = $$1.ec();
      cgx $$3 = a.c().a((double)((float)$$1.h(bxo.E)));
      List<cpx> $$4 = $$0.y()
         .stream()
         .filter(bvp.f)
         .filter($$3x -> $$3.a($$0, $$1, $$3x))
         .filter(this::a)
         .filter($$1x -> !$$1.y($$1x))
         .sorted(Comparator.comparingDouble($$1::g))
         .collect(Collectors.toList());
      if (!$$4.isEmpty()) {
         cpx $$5 = $$4.get(0);
         $$2.a(cfk.O, $$5);
      } else {
         $$2.b(cfk.O);
      }
   }

   private boolean a(cpx $$0) {
      return this.a($$0.eZ()) || this.a($$0.fa());
   }

   private boolean a(cxp $$0) {
      return this.b.test($$0);
   }

   @Override
   public Set<cfk<?>> a() {
      return ImmutableSet.of(cfk.O);
   }
}
