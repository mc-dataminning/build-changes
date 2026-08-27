import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class caa extends bzy<bpx> {
   public static final int a = 10;
   private static final caf c = caf.b().a(10.0).d();
   private final ctm d;

   public caa(ctm $$0) {
      this.d = $$0;
   }

   protected void a(apf $$0, bpx $$1) {
      bqq<?> $$2 = $$1.dP();
      List<ciu> $$3 = $$0.x()
         .stream()
         .filter(bpc.f)
         .filter($$1x -> c.a($$1, $$1x))
         .filter($$1x -> $$1.a($$1x, 10.0))
         .filter(this::a)
         .filter($$1x -> !$$1.x($$1x))
         .sorted(Comparator.comparingDouble($$1::g))
         .collect(Collectors.toList());
      if (!$$3.isEmpty()) {
         ciu $$4 = $$3.get(0);
         $$2.a(bys.O, $$4);
      } else {
         $$2.b(bys.O);
      }
   }

   private boolean a(ciu $$0) {
      return this.a($$0.eU()) || this.a($$0.eV());
   }

   private boolean a(cqm $$0) {
      return this.d.a($$0);
   }

   @Override
   public Set<bys<?>> a() {
      return ImmutableSet.of(bys.O);
   }
}
