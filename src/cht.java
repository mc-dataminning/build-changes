import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class cht extends chr<bxr> {
   private static final chy a = chy.b().d();
   private final Predicate<czk> b;

   public cht(Predicate<czk> $$0) {
      this.b = $$0;
   }

   protected void a(arq $$0, bxr $$1) {
      byj<?> $$2 = $$1.eb();
      chy $$3 = a.c().a((double)((float)$$1.h(byp.E)));
      List<crj> $$4 = $$0.z()
         .stream()
         .filter(bwp.f)
         .filter($$3x -> $$3.a($$0, $$1, $$3x))
         .filter(this::a)
         .filter($$1x -> !$$1.y($$1x))
         .sorted(Comparator.comparingDouble($$1::g))
         .collect(Collectors.toList());
      if (!$$4.isEmpty()) {
         crj $$5 = $$4.get(0);
         $$2.a(cgl.P, $$5);
      } else {
         $$2.b(cgl.P);
      }
   }

   private boolean a(crj $$0) {
      return this.a($$0.fa()) || this.a($$0.fb());
   }

   private boolean a(czk $$0) {
      return this.b.test($$0);
   }

   @Override
   public Set<cgl<?>> a() {
      return ImmutableSet.of(cgl.P);
   }
}
