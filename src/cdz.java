import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class cdz extends cdx<btw> {
   public static final int a = 10;
   private static final cee c = cee.b().a(10.0).d();
   private final Predicate<cun> d;

   public cdz(Predicate<cun> $$0) {
      this.d = $$0;
   }

   protected void a(are $$0, btw $$1) {
      bup<?> $$2 = $$1.dS();
      List<cmv> $$3 = $$0.x()
         .stream()
         .filter(bsx.f)
         .filter($$1x -> c.a($$1, $$1x))
         .filter($$1x -> $$1.a($$1x, 10.0))
         .filter(this::a)
         .filter($$1x -> !$$1.x($$1x))
         .sorted(Comparator.comparingDouble($$1::g))
         .collect(Collectors.toList());
      if (!$$3.isEmpty()) {
         cmv $$4 = $$3.get(0);
         $$2.a(ccr.O, $$4);
      } else {
         $$2.b(ccr.O);
      }
   }

   private boolean a(cmv $$0) {
      return this.a($$0.eX()) || this.a($$0.eY());
   }

   private boolean a(cun $$0) {
      return this.d.test($$0);
   }

   @Override
   public Set<ccr<?>> a() {
      return ImmutableSet.of(ccr.O);
   }
}
