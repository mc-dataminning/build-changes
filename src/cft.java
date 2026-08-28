import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class cft extends cfr<bvp> {
   private static final cfy a = cfy.b().d();
   private final Predicate<cwp> b;

   public cft(Predicate<cwp> $$0) {
      this.b = $$0;
   }

   protected void a(ard $$0, bvp $$1) {
      bwj<?> $$2 = $$1.eb();
      cfy $$3 = a.c().a((double)((float)$$1.h(bwp.E)));
      List<cox> $$4 = $$0.z()
         .stream()
         .filter(buq.f)
         .filter($$3x -> $$3.a($$0, $$1, $$3x))
         .filter(this::a)
         .filter($$1x -> !$$1.y($$1x))
         .sorted(Comparator.comparingDouble($$1::g))
         .collect(Collectors.toList());
      if (!$$4.isEmpty()) {
         cox $$5 = $$4.get(0);
         $$2.a(cel.O, $$5);
      } else {
         $$2.b(cel.O);
      }
   }

   private boolean a(cox $$0) {
      return this.a($$0.eZ()) || this.a($$0.fa());
   }

   private boolean a(cwp $$0) {
      return this.b.test($$0);
   }

   @Override
   public Set<cel<?>> a() {
      return ImmutableSet.of(cel.O);
   }
}
