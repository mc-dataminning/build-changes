import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class buq extends buo<bks> {
   public static final int a = 10;
   private static final buv c = buv.b().a(10.0).d();
   private final cnk d;

   public buq(cnk $$0) {
      this.d = $$0;
   }

   protected void a(alq $$0, bks $$1) {
      blj<?> $$2 = $$1.dN();
      List<ccx> $$3 = $$0.v()
         .stream()
         .filter(bjw.f)
         .filter($$1x -> c.a($$1, $$1x))
         .filter($$1x -> $$1.a($$1x, 10.0))
         .filter(this::a)
         .filter($$1x -> !$$1.x($$1x))
         .sorted(Comparator.comparingDouble($$1::f))
         .collect(Collectors.toList());
      if (!$$3.isEmpty()) {
         ccx $$4 = $$3.get(0);
         $$2.a(btk.N, $$4);
      } else {
         $$2.b(btk.N);
      }
   }

   private boolean a(ccx $$0) {
      return this.a($$0.eS()) || this.a($$0.eT());
   }

   private boolean a(ckj $$0) {
      return this.d.a($$0);
   }

   @Override
   public Set<btk<?>> a() {
      return ImmutableSet.of(btk.N);
   }
}
