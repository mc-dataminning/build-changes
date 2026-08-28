import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class cip extends cin<byn> {
   private static final ciu a = ciu.b().d();
   private final Predicate<dak> b;

   public cip(Predicate<dak> $$0) {
      this.b = $$0;
   }

   protected void a(asb $$0, byn $$1) {
      bzf<?> $$2 = $$1.ec();
      ciu $$3 = a.c().a((double)((float)$$1.h(bzl.E)));
      List<csi> $$4 = $$0.z()
         .stream()
         .filter(bxl.f)
         .filter($$3x -> $$3.a($$0, $$1, $$3x))
         .filter(this::a)
         .filter($$1x -> !$$1.y($$1x))
         .sorted(Comparator.comparingDouble($$1::g))
         .collect(Collectors.toList());
      if (!$$4.isEmpty()) {
         csi $$5 = $$4.get(0);
         $$2.a(chh.P, $$5);
      } else {
         $$2.b(chh.P);
      }
   }

   private boolean a(csi $$0) {
      return this.a($$0.fb()) || this.a($$0.fc());
   }

   private boolean a(dak $$0) {
      return this.b.test($$0);
   }

   @Override
   public Set<chh<?>> a() {
      return ImmutableSet.of(chh.P);
   }
}
