import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ced extends ceb<bua> {
   public static final int a = 10;
   private static final cei c = cei.b().a(10.0).d();
   private final Predicate<cur> d;

   public ced(Predicate<cur> $$0) {
      this.d = $$0;
   }

   protected void a(arf $$0, bua $$1) {
      but<?> $$2 = $$1.dS();
      List<cmz> $$3 = $$0.x()
         .stream()
         .filter(btb.f)
         .filter($$1x -> c.a($$1, $$1x))
         .filter($$1x -> $$1.a($$1x, 10.0))
         .filter(this::a)
         .filter($$1x -> !$$1.x($$1x))
         .sorted(Comparator.comparingDouble($$1::g))
         .collect(Collectors.toList());
      if (!$$3.isEmpty()) {
         cmz $$4 = $$3.get(0);
         $$2.a(ccv.O, $$4);
      } else {
         $$2.b(ccv.O);
      }
   }

   private boolean a(cmz $$0) {
      return this.a($$0.eX()) || this.a($$0.eY());
   }

   private boolean a(cur $$0) {
      return this.d.test($$0);
   }

   @Override
   public Set<ccv<?>> a() {
      return ImmutableSet.of(ccv.O);
   }
}
