import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class cie extends cic<byc> {
   private static final cij a = cij.b().d();
   private final Predicate<czy> b;

   public cie(Predicate<czy> $$0) {
      this.b = $$0;
   }

   protected void a(ars $$0, byc $$1) {
      byu<?> $$2 = $$1.ec();
      cij $$3 = a.c().a((double)((float)$$1.h(bza.E)));
      List<crx> $$4 = $$0.z()
         .stream()
         .filter(bxa.f)
         .filter($$3x -> $$3.a($$0, $$1, $$3x))
         .filter(this::a)
         .filter($$1x -> !$$1.y($$1x))
         .sorted(Comparator.comparingDouble($$1::g))
         .collect(Collectors.toList());
      if (!$$4.isEmpty()) {
         crx $$5 = $$4.get(0);
         $$2.a(cgw.P, $$5);
      } else {
         $$2.b(cgw.P);
      }
   }

   private boolean a(crx $$0) {
      return this.a($$0.fb()) || this.a($$0.fc());
   }

   private boolean a(czy $$0) {
      return this.b.test($$0);
   }

   @Override
   public Set<cgw<?>> a() {
      return ImmutableSet.of(cgw.P);
   }
}
