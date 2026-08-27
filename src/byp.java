import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class byp extends byn<boo> {
   public static final int a = 10;
   private static final byu c = byu.b().a(10.0).d();
   private final cry d;

   public byp(cry $$0) {
      this.d = $$0;
   }

   protected void a(aov $$0, boo $$1) {
      bpf<?> $$2 = $$1.dO();
      List<chh> $$3 = $$0.x()
         .stream()
         .filter(bnt.f)
         .filter($$1x -> c.a($$1, $$1x))
         .filter($$1x -> $$1.a($$1x, 10.0))
         .filter(this::a)
         .filter($$1x -> !$$1.w($$1x))
         .sorted(Comparator.comparingDouble($$1::f))
         .collect(Collectors.toList());
      if (!$$3.isEmpty()) {
         chh $$4 = $$3.get(0);
         $$2.a(bxh.O, $$4);
      } else {
         $$2.b(bxh.O);
      }
   }

   private boolean a(chh $$0) {
      return this.a($$0.eT()) || this.a($$0.eU());
   }

   private boolean a(coz $$0) {
      return this.d.a($$0);
   }

   @Override
   public Set<bxh<?>> a() {
      return ImmutableSet.of(bxh.O);
   }
}
