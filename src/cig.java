import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class cig extends cie<bye> {
   private static final cil a = cil.b().d();
   private final Predicate<daa> b;

   public cig(Predicate<daa> $$0) {
      this.b = $$0;
   }

   protected void a(aru $$0, bye $$1) {
      byw<?> $$2 = $$1.ec();
      cil $$3 = a.c().a((double)((float)$$1.h(bzc.E)));
      List<crz> $$4 = $$0.z()
         .stream()
         .filter(bxc.f)
         .filter($$3x -> $$3.a($$0, $$1, $$3x))
         .filter(this::a)
         .filter($$1x -> !$$1.y($$1x))
         .sorted(Comparator.comparingDouble($$1::g))
         .collect(Collectors.toList());
      if (!$$4.isEmpty()) {
         crz $$5 = $$4.get(0);
         $$2.a(cgy.P, $$5);
      } else {
         $$2.b(cgy.P);
      }
   }

   private boolean a(crz $$0) {
      return this.a($$0.fb()) || this.a($$0.fc());
   }

   private boolean a(daa $$0) {
      return this.b.test($$0);
   }

   @Override
   public Set<cgy<?>> a() {
      return ImmutableSet.of(cgy.P);
   }
}
