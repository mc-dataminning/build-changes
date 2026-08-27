import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class bvs extends bvq<blu> {
   public static final int a = 10;
   private static final bvx c = bvx.b().a(10.0).d();
   private final coq d;

   public bvs(coq $$0) {
      this.d = $$0;
   }

   protected void a(ami $$0, blu $$1) {
      bml<?> $$2 = $$1.dP();
      List<cdz> $$3 = $$0.w()
         .stream()
         .filter(bky.f)
         .filter($$1x -> c.a($$1, $$1x))
         .filter($$1x -> $$1.a($$1x, 10.0))
         .filter(this::a)
         .filter($$1x -> !$$1.x($$1x))
         .sorted(Comparator.comparingDouble($$1::f))
         .collect(Collectors.toList());
      if (!$$3.isEmpty()) {
         cdz $$4 = $$3.get(0);
         $$2.a(bum.N, $$4);
      } else {
         $$2.b(bum.N);
      }
   }

   private boolean a(cdz $$0) {
      return this.a($$0.eU()) || this.a($$0.eV());
   }

   private boolean a(clo $$0) {
      return this.d.a($$0);
   }

   @Override
   public Set<bum<?>> a() {
      return ImmutableSet.of(bum.N);
   }
}
