import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ccz extends ccx<bsw> {
   public static final int a = 10;
   private static final cde c = cde.b().a(10.0).d();
   private final Predicate<cuh> d;

   public ccz(Predicate<cuh> $$0) {
      this.d = $$0;
   }

   protected void a(aqt $$0, bsw $$1) {
      btp<?> $$2 = $$1.dZ();
      List<cly> $$3 = $$0.x()
         .stream()
         .filter(bsa.f)
         .filter($$1x -> c.a($$1, $$1x))
         .filter($$1x -> $$1.a($$1x, 10.0))
         .filter(this::a)
         .filter($$1x -> !$$1.x($$1x))
         .sorted(Comparator.comparingDouble($$1::g))
         .collect(Collectors.toList());
      if (!$$3.isEmpty()) {
         cly $$4 = $$3.get(0);
         $$2.a(cbr.O, $$4);
      } else {
         $$2.b(cbr.O);
      }
   }

   private boolean a(cly $$0) {
      return this.a($$0.fg()) || this.a($$0.fh());
   }

   private boolean a(cuh $$0) {
      return this.d.test($$0);
   }

   @Override
   public Set<cbr<?>> a() {
      return ImmutableSet.of(cbr.O);
   }
}
