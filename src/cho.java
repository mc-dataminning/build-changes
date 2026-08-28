import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class cho extends chm<bxm> {
   private static final cht a = cht.b().d();
   private final Predicate<czd> b;

   public cho(Predicate<czd> $$0) {
      this.b = $$0;
   }

   protected void a(arq $$0, bxm $$1) {
      bye<?> $$2 = $$1.ec();
      cht $$3 = a.c().a((double)((float)$$1.h(byk.E)));
      List<crc> $$4 = $$0.z()
         .stream()
         .filter(bwm.f)
         .filter($$3x -> $$3.a($$0, $$1, $$3x))
         .filter(this::a)
         .filter($$1x -> !$$1.y($$1x))
         .sorted(Comparator.comparingDouble($$1::g))
         .collect(Collectors.toList());
      if (!$$4.isEmpty()) {
         crc $$5 = $$4.get(0);
         $$2.a(cgg.P, $$5);
      } else {
         $$2.b(cgg.P);
      }
   }

   private boolean a(crc $$0) {
      return this.a($$0.fb()) || this.a($$0.fc());
   }

   private boolean a(czd $$0) {
      return this.b.test($$0);
   }

   @Override
   public Set<cgg<?>> a() {
      return ImmutableSet.of(cgg.P);
   }
}
