import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class cfs extends cfq<bvo> {
   private static final cfx a = cfx.b().d();
   private final Predicate<cwo> b;

   public cfs(Predicate<cwo> $$0) {
      this.b = $$0;
   }

   protected void a(ard $$0, bvo $$1) {
      bwi<?> $$2 = $$1.eb();
      cfx $$3 = a.c().a((double)((float)$$1.h(bwo.E)));
      List<cow> $$4 = $$0.z()
         .stream()
         .filter(bup.f)
         .filter($$3x -> $$3.a($$0, $$1, $$3x))
         .filter(this::a)
         .filter($$1x -> !$$1.y($$1x))
         .sorted(Comparator.comparingDouble($$1::g))
         .collect(Collectors.toList());
      if (!$$4.isEmpty()) {
         cow $$5 = $$4.get(0);
         $$2.a(cek.O, $$5);
      } else {
         $$2.b(cek.O);
      }
   }

   private boolean a(cow $$0) {
      return this.a($$0.eZ()) || this.a($$0.fa());
   }

   private boolean a(cwo $$0) {
      return this.b.test($$0);
   }

   @Override
   public Set<cek<?>> a() {
      return ImmutableSet.of(cek.O);
   }
}
