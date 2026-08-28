import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class cea extends cdy<btw> {
   public static final int a = 10;
   private static final cef c = cef.b().a(10.0).d();
   private final Predicate<cuq> d;

   public cea(Predicate<cuq> $$0) {
      this.d = $$0;
   }

   protected void a(aqu $$0, btw $$1) {
      buq<?> $$2 = $$1.dT();
      List<cmx> $$3 = $$0.x()
         .stream()
         .filter(bsw.f)
         .filter($$1x -> c.a($$1, $$1x))
         .filter($$1x -> $$1.a($$1x, 10.0))
         .filter(this::a)
         .filter($$1x -> !$$1.x($$1x))
         .sorted(Comparator.comparingDouble($$1::g))
         .collect(Collectors.toList());
      if (!$$3.isEmpty()) {
         cmx $$4 = $$3.get(0);
         $$2.a(ccs.O, $$4);
      } else {
         $$2.b(ccs.O);
      }
   }

   private boolean a(cmx $$0) {
      return this.a($$0.eT()) || this.a($$0.eU());
   }

   private boolean a(cuq $$0) {
      return this.d.test($$0);
   }

   @Override
   public Set<ccs<?>> a() {
      return ImmutableSet.of(ccs.O);
   }
}
