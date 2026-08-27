import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class bvf extends bvd<blh> {
   public static final int a = 10;
   private static final bvk c = bvk.b().a(10.0).d();
   private final coc d;

   public bvf(coc $$0) {
      this.d = $$0;
   }

   protected void a(ama $$0, blh $$1) {
      bly<?> $$2 = $$1.dN();
      List<cdm> $$3 = $$0.v()
         .stream()
         .filter(bkl.f)
         .filter($$1x -> c.a($$1, $$1x))
         .filter($$1x -> $$1.a($$1x, 10.0))
         .filter(this::a)
         .filter($$1x -> !$$1.x($$1x))
         .sorted(Comparator.comparingDouble($$1::f))
         .collect(Collectors.toList());
      if (!$$3.isEmpty()) {
         cdm $$4 = $$3.get(0);
         $$2.a(btz.N, $$4);
      } else {
         $$2.b(btz.N);
      }
   }

   private boolean a(cdm $$0) {
      return this.a($$0.eS()) || this.a($$0.eT());
   }

   private boolean a(clb $$0) {
      return this.d.a($$0);
   }

   @Override
   public Set<btz<?>> a() {
      return ImmutableSet.of(btz.N);
   }
}
