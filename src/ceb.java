import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ceb extends cdz<bty> {
   public static final int a = 10;
   private static final ceg c = ceg.b().a(10.0).d();
   private final Predicate<cup> d;

   public ceb(Predicate<cup> $$0) {
      this.d = $$0;
   }

   protected void a(arf $$0, bty $$1) {
      bur<?> $$2 = $$1.dS();
      List<cmx> $$3 = $$0.x()
         .stream()
         .filter(bsz.f)
         .filter($$1x -> c.a($$1, $$1x))
         .filter($$1x -> $$1.a($$1x, 10.0))
         .filter(this::a)
         .filter($$1x -> !$$1.x($$1x))
         .sorted(Comparator.comparingDouble($$1::g))
         .collect(Collectors.toList());
      if (!$$3.isEmpty()) {
         cmx $$4 = $$3.get(0);
         $$2.a(cct.O, $$4);
      } else {
         $$2.b(cct.O);
      }
   }

   private boolean a(cmx $$0) {
      return this.a($$0.eX()) || this.a($$0.eY());
   }

   private boolean a(cup $$0) {
      return this.d.test($$0);
   }

   @Override
   public Set<cct<?>> a() {
      return ImmutableSet.of(cct.O);
   }
}
