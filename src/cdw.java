import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class cdw extends cdu<btt> {
   public static final int a = 10;
   private static final ceb c = ceb.b().a(10.0).d();
   private final Predicate<cuk> d;

   public cdw(Predicate<cuk> $$0) {
      this.d = $$0;
   }

   protected void a(arb $$0, btt $$1) {
      bum<?> $$2 = $$1.dS();
      List<cms> $$3 = $$0.x()
         .stream()
         .filter(bsu.f)
         .filter($$1x -> c.a($$1, $$1x))
         .filter($$1x -> $$1.a($$1x, 10.0))
         .filter(this::a)
         .filter($$1x -> !$$1.x($$1x))
         .sorted(Comparator.comparingDouble($$1::g))
         .collect(Collectors.toList());
      if (!$$3.isEmpty()) {
         cms $$4 = $$3.get(0);
         $$2.a(cco.O, $$4);
      } else {
         $$2.b(cco.O);
      }
   }

   private boolean a(cms $$0) {
      return this.a($$0.eX()) || this.a($$0.eY());
   }

   private boolean a(cuk $$0) {
      return this.d.test($$0);
   }

   @Override
   public Set<cco<?>> a() {
      return ImmutableSet.of(cco.O);
   }
}
