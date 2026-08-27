import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class bti extends btg<bjk> {
   public static final int a = 10;
   private static final btn c = btn.b().a(10.0).d();
   private final cmb d;

   public bti(cmb $$0) {
      this.d = $$0;
   }

   protected void a(akn $$0, bjk $$1) {
      bkb<?> $$2 = $$1.dM();
      List<cbp> $$3 = $$0.v()
         .stream()
         .filter(bio.f)
         .filter($$1x -> c.a($$1, $$1x))
         .filter($$1x -> $$1.a($$1x, 10.0))
         .filter(this::a)
         .filter($$1x -> !$$1.x($$1x))
         .sorted(Comparator.comparingDouble($$1::f))
         .collect(Collectors.toList());
      if (!$$3.isEmpty()) {
         cbp $$4 = $$3.get(0);
         $$2.a(bsc.N, $$4);
      } else {
         $$2.b(bsc.N);
      }
   }

   private boolean a(cbp $$0) {
      return this.a($$0.eR()) || this.a($$0.eS());
   }

   private boolean a(cja $$0) {
      return this.d.a($$0);
   }

   @Override
   public Set<bsc<?>> a() {
      return ImmutableSet.of(bsc.N);
   }
}
