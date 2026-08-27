import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class cbe extends cbc<brb> {
   public static final int a = 10;
   private static final cbj c = cbj.b().a(10.0).d();
   private final cvp d;

   public cbe(cvp $$0) {
      this.d = $$0;
   }

   protected void a(apu $$0, brb $$1) {
      bru<?> $$2 = $$1.dP();
      List<cka> $$3 = $$0.x()
         .stream()
         .filter(bqf.f)
         .filter($$1x -> c.a($$1, $$1x))
         .filter($$1x -> $$1.a($$1x, 10.0))
         .filter(this::a)
         .filter($$1x -> !$$1.x($$1x))
         .sorted(Comparator.comparingDouble($$1::g))
         .collect(Collectors.toList());
      if (!$$3.isEmpty()) {
         cka $$4 = $$3.get(0);
         $$2.a(bzw.O, $$4);
      } else {
         $$2.b(bzw.O);
      }
   }

   private boolean a(cka $$0) {
      return this.a($$0.eU()) || this.a($$0.eV());
   }

   private boolean a(crs $$0) {
      return this.d.a($$0);
   }

   @Override
   public Set<bzw<?>> a() {
      return ImmutableSet.of(bzw.O);
   }
}
