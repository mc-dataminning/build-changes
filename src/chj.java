import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class chj extends chh<bxh> {
   private static final cho a = cho.b().d();
   private final Predicate<cys> b;

   public chj(Predicate<cys> $$0) {
      this.b = $$0;
   }

   protected void a(aro $$0, bxh $$1) {
      bxz<?> $$2 = $$1.eb();
      cho $$3 = a.c().a((double)((float)$$1.h(byf.E)));
      List<cqs> $$4 = $$0.z()
         .stream()
         .filter(bwh.f)
         .filter($$3x -> $$3.a($$0, $$1, $$3x))
         .filter(this::a)
         .filter($$1x -> !$$1.y($$1x))
         .sorted(Comparator.comparingDouble($$1::g))
         .collect(Collectors.toList());
      if (!$$4.isEmpty()) {
         cqs $$5 = $$4.get(0);
         $$2.a(cgb.P, $$5);
      } else {
         $$2.b(cgb.P);
      }
   }

   private boolean a(cqs $$0) {
      return this.a($$0.fa()) || this.a($$0.fb());
   }

   private boolean a(cys $$0) {
      return this.b.test($$0);
   }

   @Override
   public Set<cgb<?>> a() {
      return ImmutableSet.of(cgb.P);
   }
}
