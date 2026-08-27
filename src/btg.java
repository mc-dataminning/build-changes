import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class btg extends bte<bjh> {
   public static final int a = 10;
   private static final btl c = btl.b().a(10.0).d();
   private final cly d;

   public btg(cly $$0) {
      this.d = $$0;
   }

   protected void a(akk $$0, bjh $$1) {
      bjz<?> $$2 = $$1.dM();
      List<cbn> $$3 = $$0.v()
         .stream()
         .filter(bil.f)
         .filter($$1x -> c.a($$1, $$1x))
         .filter($$1x -> $$1.a($$1x, 10.0))
         .filter(this::a)
         .filter($$1x -> !$$1.x($$1x))
         .sorted(Comparator.comparingDouble($$1::f))
         .collect(Collectors.toList());
      if (!$$3.isEmpty()) {
         cbn $$4 = $$3.get(0);
         $$2.a(bsa.N, $$4);
      } else {
         $$2.b(bsa.N);
      }
   }

   private boolean a(cbn $$0) {
      return this.a($$0.eR()) || this.a($$0.eS());
   }

   private boolean a(ciy $$0) {
      return this.d.a($$0);
   }

   @Override
   public Set<bsa<?>> a() {
      return ImmutableSet.of(bsa.N);
   }
}
