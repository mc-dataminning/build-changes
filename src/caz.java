import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class caz extends cax<bqw> {
   public static final int a = 10;
   private static final cbe c = cbe.b().a(10.0).d();
   private final cvg d;

   public caz(cvg $$0) {
      this.d = $$0;
   }

   protected void a(aps $$0, bqw $$1) {
      brp<?> $$2 = $$1.dP();
      List<cjt> $$3 = $$0.x()
         .stream()
         .filter(bqa.f)
         .filter($$1x -> c.a($$1, $$1x))
         .filter($$1x -> $$1.a($$1x, 10.0))
         .filter(this::a)
         .filter($$1x -> !$$1.x($$1x))
         .sorted(Comparator.comparingDouble($$1::g))
         .collect(Collectors.toList());
      if (!$$3.isEmpty()) {
         cjt $$4 = $$3.get(0);
         $$2.a(bzr.O, $$4);
      } else {
         $$2.b(bzr.O);
      }
   }

   private boolean a(cjt $$0) {
      return this.a($$0.eU()) || this.a($$0.eV());
   }

   private boolean a(crj $$0) {
      return this.d.a($$0);
   }

   @Override
   public Set<bzr<?>> a() {
      return ImmutableSet.of(bzr.O);
   }
}
