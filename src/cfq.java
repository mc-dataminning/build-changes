import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class cfq extends cfo<bvm> {
   private static final cfv a = cfv.b().d();
   private final Predicate<cwf> b;

   public cfq(Predicate<cwf> $$0) {
      this.b = $$0;
   }

   protected void a(arq $$0, bvm $$1) {
      bwg<?> $$2 = $$1.ee();
      cfv $$3 = a.c().a((double)((float)$$1.h(bwm.E)));
      List<cor> $$4 = $$0.x()
         .stream()
         .filter(bun.f)
         .filter($$2x -> $$3.a($$1, $$2x))
         .filter(this::a)
         .filter($$1x -> !$$1.y($$1x))
         .sorted(Comparator.comparingDouble($$1::g))
         .collect(Collectors.toList());
      if (!$$4.isEmpty()) {
         cor $$5 = $$4.get(0);
         $$2.a(cei.O, $$5);
      } else {
         $$2.b(cei.O);
      }
   }

   private boolean a(cor $$0) {
      return this.a($$0.fc()) || this.a($$0.fd());
   }

   private boolean a(cwf $$0) {
      return this.b.test($$0);
   }

   @Override
   public Set<cei<?>> a() {
      return ImmutableSet.of(cei.O);
   }
}
