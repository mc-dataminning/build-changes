import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class bzi extends bzg<bpf> {
   public static final int a = 10;
   private static final bzn c = bzn.b().a(10.0).d();
   private final csp d;

   public bzi(csp $$0) {
      this.d = $$0;
   }

   protected void a(apa $$0, bpf $$1) {
      bpy<?> $$2 = $$1.dM();
      List<cia> $$3 = $$0.x()
         .stream()
         .filter(bok.f)
         .filter($$1x -> c.a($$1, $$1x))
         .filter($$1x -> $$1.a($$1x, 10.0))
         .filter(this::a)
         .filter($$1x -> !$$1.w($$1x))
         .sorted(Comparator.comparingDouble($$1::f))
         .collect(Collectors.toList());
      if (!$$3.isEmpty()) {
         cia $$4 = $$3.get(0);
         $$2.a(bya.O, $$4);
      } else {
         $$2.b(bya.O);
      }
   }

   private boolean a(cia $$0) {
      return this.a($$0.eR()) || this.a($$0.eS());
   }

   private boolean a(cpq $$0) {
      return this.d.a($$0);
   }

   @Override
   public Set<bya<?>> a() {
      return ImmutableSet.of(bya.O);
   }
}
