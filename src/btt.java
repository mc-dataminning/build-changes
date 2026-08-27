import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class btt extends btr<bjv> {
   public static final int a = 10;
   private static final bty c = bty.b().a(10.0).d();
   private final cmm d;

   public btt(cmm $$0) {
      this.d = $$0;
   }

   protected void a(akt $$0, bjv $$1) {
      bkm<?> $$2 = $$1.dN();
      List<cca> $$3 = $$0.v()
         .stream()
         .filter(biz.f)
         .filter($$1x -> c.a($$1, $$1x))
         .filter($$1x -> $$1.a($$1x, 10.0))
         .filter(this::a)
         .filter($$1x -> !$$1.x($$1x))
         .sorted(Comparator.comparingDouble($$1::f))
         .collect(Collectors.toList());
      if (!$$3.isEmpty()) {
         cca $$4 = $$3.get(0);
         $$2.a(bsn.N, $$4);
      } else {
         $$2.b(bsn.N);
      }
   }

   private boolean a(cca $$0) {
      return this.a($$0.eS()) || this.a($$0.eT());
   }

   private boolean a(cjl $$0) {
      return this.d.a($$0);
   }

   @Override
   public Set<bsn<?>> a() {
      return ImmutableSet.of(bsn.N);
   }
}
