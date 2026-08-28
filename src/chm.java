import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class chm extends chk<bxk> {
   private static final chr a = chr.b().d();
   private final Predicate<cyy> b;

   public chm(Predicate<cyy> $$0) {
      this.b = $$0;
   }

   protected void a(arq $$0, bxk $$1) {
      byc<?> $$2 = $$1.eb();
      chr $$3 = a.c().a((double)((float)$$1.h(byi.E)));
      List<cqy> $$4 = $$0.z()
         .stream()
         .filter(bwk.f)
         .filter($$3x -> $$3.a($$0, $$1, $$3x))
         .filter(this::a)
         .filter($$1x -> !$$1.y($$1x))
         .sorted(Comparator.comparingDouble($$1::g))
         .collect(Collectors.toList());
      if (!$$4.isEmpty()) {
         cqy $$5 = $$4.get(0);
         $$2.a(cge.P, $$5);
      } else {
         $$2.b(cge.P);
      }
   }

   private boolean a(cqy $$0) {
      return this.a($$0.fa()) || this.a($$0.fb());
   }

   private boolean a(cyy $$0) {
      return this.b.test($$0);
   }

   @Override
   public Set<cge<?>> a() {
      return ImmutableSet.of(cge.P);
   }
}
