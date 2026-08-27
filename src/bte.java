import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class bte extends btc<bjf> {
   public static final int a = 10;
   private static final btj c = btj.b().a(10.0).d();
   private final clw d;

   public bte(clw $$0) {
      this.d = $$0;
   }

   protected void a(aki $$0, bjf $$1) {
      bjx<?> $$2 = $$1.dM();
      List<cbl> $$3 = $$0.v()
         .stream()
         .filter(bij.f)
         .filter($$1x -> c.a($$1, $$1x))
         .filter($$1x -> $$1.a($$1x, 10.0))
         .filter(this::a)
         .filter($$1x -> !$$1.x($$1x))
         .sorted(Comparator.comparingDouble($$1::f))
         .collect(Collectors.toList());
      if (!$$3.isEmpty()) {
         cbl $$4 = $$3.get(0);
         $$2.a(bry.N, $$4);
      } else {
         $$2.b(bry.N);
      }
   }

   private boolean a(cbl $$0) {
      return this.a($$0.eR()) || this.a($$0.eS());
   }

   private boolean a(ciw $$0) {
      return this.d.a($$0);
   }

   @Override
   public Set<bry<?>> a() {
      return ImmutableSet.of(bry.N);
   }
}
