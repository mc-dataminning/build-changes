import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class cgk extends cgi<bwg> {
   private static final cgp a = cgp.b().d();
   private final Predicate<cxh> b;

   public cgk(Predicate<cxh> $$0) {
      this.b = $$0;
   }

   protected void a(ard $$0, bwg $$1) {
      bxa<?> $$2 = $$1.ea();
      cgp $$3 = a.c().a((double)((float)$$1.h(bxg.E)));
      List<cpr> $$4 = $$0.z()
         .stream()
         .filter(bvg.f)
         .filter($$3x -> $$3.a($$0, $$1, $$3x))
         .filter(this::a)
         .filter($$1x -> !$$1.y($$1x))
         .sorted(Comparator.comparingDouble($$1::g))
         .collect(Collectors.toList());
      if (!$$4.isEmpty()) {
         cpr $$5 = $$4.get(0);
         $$2.a(cfc.O, $$5);
      } else {
         $$2.b(cfc.O);
      }
   }

   private boolean a(cpr $$0) {
      return this.a($$0.eZ()) || this.a($$0.fa());
   }

   private boolean a(cxh $$0) {
      return this.b.test($$0);
   }

   @Override
   public Set<cfc<?>> a() {
      return ImmutableSet.of(cfc.O);
   }
}
