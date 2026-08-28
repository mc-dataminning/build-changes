import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class cfm extends cfk<bvi> {
   private static final cfr a = cfr.b().d();
   private final Predicate<cwb> b;

   public cfm(Predicate<cwb> $$0) {
      this.b = $$0;
   }

   protected void a(arn $$0, bvi $$1) {
      bwc<?> $$2 = $$1.ed();
      cfr $$3 = a.c().a((double)((float)$$1.h(bwi.E)));
      List<com> $$4 = $$0.x()
         .stream()
         .filter(buj.f)
         .filter($$2x -> $$3.a($$1, $$2x))
         .filter(this::a)
         .filter($$1x -> !$$1.y($$1x))
         .sorted(Comparator.comparingDouble($$1::g))
         .collect(Collectors.toList());
      if (!$$4.isEmpty()) {
         com $$5 = $$4.get(0);
         $$2.a(cee.O, $$5);
      } else {
         $$2.b(cee.O);
      }
   }

   private boolean a(com $$0) {
      return this.a($$0.fb()) || this.a($$0.fc());
   }

   private boolean a(cwb $$0) {
      return this.b.test($$0);
   }

   @Override
   public Set<cee<?>> a() {
      return ImmutableSet.of(cee.O);
   }
}
