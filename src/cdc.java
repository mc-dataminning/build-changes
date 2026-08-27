import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class cdc extends cda<bsz> {
   public static final int a = 10;
   private static final cdh c = cdh.b().a(10.0).d();
   private final Predicate<ctq> d;

   public cdc(Predicate<ctq> $$0) {
      this.d = $$0;
   }

   protected void a(aqn $$0, bsz $$1) {
      bts<?> $$2 = $$1.dS();
      List<cly> $$3 = $$0.x()
         .stream()
         .filter(bsb.f)
         .filter($$1x -> c.a($$1, $$1x))
         .filter($$1x -> $$1.a($$1x, 10.0))
         .filter(this::a)
         .filter($$1x -> !$$1.x($$1x))
         .sorted(Comparator.comparingDouble($$1::g))
         .collect(Collectors.toList());
      if (!$$3.isEmpty()) {
         cly $$4 = $$3.get(0);
         $$2.a(cbu.O, $$4);
      } else {
         $$2.b(cbu.O);
      }
   }

   private boolean a(cly $$0) {
      return this.a($$0.eX()) || this.a($$0.eY());
   }

   private boolean a(ctq $$0) {
      return this.d.test($$0);
   }

   @Override
   public Set<cbu<?>> a() {
      return ImmutableSet.of(cbu.O);
   }
}
