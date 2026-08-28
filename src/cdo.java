import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class cdo extends cdm<btl> {
   public static final int a = 10;
   private static final cdt c = cdt.b().a(10.0).d();
   private final Predicate<cud> d;

   public cdo(Predicate<cud> $$0) {
      this.d = $$0;
   }

   protected void a(aqm $$0, btl $$1) {
      bue<?> $$2 = $$1.dV();
      List<cml> $$3 = $$0.x()
         .stream()
         .filter(bsm.f)
         .filter($$1x -> c.a($$1, $$1x))
         .filter($$1x -> $$1.a($$1x, 10.0))
         .filter(this::a)
         .filter($$1x -> !$$1.x($$1x))
         .sorted(Comparator.comparingDouble($$1::g))
         .collect(Collectors.toList());
      if (!$$3.isEmpty()) {
         cml $$4 = $$3.get(0);
         $$2.a(ccg.O, $$4);
      } else {
         $$2.b(ccg.O);
      }
   }

   private boolean a(cml $$0) {
      return this.a($$0.eV()) || this.a($$0.eW());
   }

   private boolean a(cud $$0) {
      return this.d.test($$0);
   }

   @Override
   public Set<ccg<?>> a() {
      return ImmutableSet.of(ccg.O);
   }
}
