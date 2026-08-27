import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class cbp extends cbn<brm> {
   public static final int a = 10;
   private static final cbu c = cbu.b().a(10.0).d();
   private final cwd d;

   public cbp(cwd $$0) {
      this.d = $$0;
   }

   protected void a(aqe $$0, brm $$1) {
      bsf<?> $$2 = $$1.dQ();
      List<ckl> $$3 = $$0.x()
         .stream()
         .filter(bqq.f)
         .filter($$1x -> c.a($$1, $$1x))
         .filter($$1x -> $$1.a($$1x, 10.0))
         .filter(this::a)
         .filter($$1x -> !$$1.x($$1x))
         .sorted(Comparator.comparingDouble($$1::g))
         .collect(Collectors.toList());
      if (!$$3.isEmpty()) {
         ckl $$4 = $$3.get(0);
         $$2.a(cah.O, $$4);
      } else {
         $$2.b(cah.O);
      }
   }

   private boolean a(ckl $$0) {
      return this.a($$0.eV()) || this.a($$0.eW());
   }

   private boolean a(csd $$0) {
      return this.d.a($$0);
   }

   @Override
   public Set<cah<?>> a() {
      return ImmutableSet.of(cah.O);
   }
}
