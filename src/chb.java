import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class chb extends cgz<bwz> {
   private static final chg a = chg.b().d();
   private final Predicate<cxy> b;

   public chb(Predicate<cxy> $$0) {
      this.b = $$0;
   }

   protected void a(arn $$0, bwz $$1) {
      bxr<?> $$2 = $$1.eb();
      chg $$3 = a.c().a((double)((float)$$1.h(bxx.E)));
      List<cqi> $$4 = $$0.z()
         .stream()
         .filter(bvz.f)
         .filter($$3x -> $$3.a($$0, $$1, $$3x))
         .filter(this::a)
         .filter($$1x -> !$$1.y($$1x))
         .sorted(Comparator.comparingDouble($$1::g))
         .collect(Collectors.toList());
      if (!$$4.isEmpty()) {
         cqi $$5 = $$4.get(0);
         $$2.a(cft.P, $$5);
      } else {
         $$2.b(cft.P);
      }
   }

   private boolean a(cqi $$0) {
      return this.a($$0.fa()) || this.a($$0.fb());
   }

   private boolean a(cxy $$0) {
      return this.b.test($$0);
   }

   @Override
   public Set<cft<?>> a() {
      return ImmutableSet.of(cft.P);
   }
}
