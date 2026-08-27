import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class bzz extends bzx<bpw> {
   public static final int a = 10;
   private static final cae c = cae.b().a(10.0).d();
   private final ctk d;

   public bzz(ctk $$0) {
      this.d = $$0;
   }

   protected void a(apf $$0, bpw $$1) {
      bqp<?> $$2 = $$1.dP();
      List<cis> $$3 = $$0.x()
         .stream()
         .filter(bpb.f)
         .filter($$1x -> c.a($$1, $$1x))
         .filter($$1x -> $$1.a($$1x, 10.0))
         .filter(this::a)
         .filter($$1x -> !$$1.x($$1x))
         .sorted(Comparator.comparingDouble($$1::g))
         .collect(Collectors.toList());
      if (!$$3.isEmpty()) {
         cis $$4 = $$3.get(0);
         $$2.a(byr.O, $$4);
      } else {
         $$2.b(byr.O);
      }
   }

   private boolean a(cis $$0) {
      return this.a($$0.eU()) || this.a($$0.eV());
   }

   private boolean a(cqk $$0) {
      return this.d.a($$0);
   }

   @Override
   public Set<byr<?>> a() {
      return ImmutableSet.of(byr.O);
   }
}
