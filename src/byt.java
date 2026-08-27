import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class byt extends byr<boq> {
   public static final int a = 10;
   private static final byy c = byy.b().a(10.0).d();
   private final csc d;

   public byt(csc $$0) {
      this.d = $$0;
   }

   protected void a(aow $$0, boq $$1) {
      bpj<?> $$2 = $$1.dO();
      List<chl> $$3 = $$0.x()
         .stream()
         .filter(bnv.f)
         .filter($$1x -> c.a($$1, $$1x))
         .filter($$1x -> $$1.a($$1x, 10.0))
         .filter(this::a)
         .filter($$1x -> !$$1.w($$1x))
         .sorted(Comparator.comparingDouble($$1::f))
         .collect(Collectors.toList());
      if (!$$3.isEmpty()) {
         chl $$4 = $$3.get(0);
         $$2.a(bxl.O, $$4);
      } else {
         $$2.b(bxl.O);
      }
   }

   private boolean a(chl $$0) {
      return this.a($$0.eT()) || this.a($$0.eU());
   }

   private boolean a(cpd $$0) {
      return this.d.a($$0);
   }

   @Override
   public Set<bxl<?>> a() {
      return ImmutableSet.of(bxl.O);
   }
}
