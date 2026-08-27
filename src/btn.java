import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class btn extends btl<bjp> {
   public static final int a = 10;
   private static final bts c = bts.b().a(10.0).d();
   private final cmg d;

   public btn(cmg $$0) {
      this.d = $$0;
   }

   protected void a(akq $$0, bjp $$1) {
      bkg<?> $$2 = $$1.dN();
      List<cbu> $$3 = $$0.v()
         .stream()
         .filter(bit.f)
         .filter($$1x -> c.a($$1, $$1x))
         .filter($$1x -> $$1.a($$1x, 10.0))
         .filter(this::a)
         .filter($$1x -> !$$1.x($$1x))
         .sorted(Comparator.comparingDouble($$1::f))
         .collect(Collectors.toList());
      if (!$$3.isEmpty()) {
         cbu $$4 = $$3.get(0);
         $$2.a(bsh.N, $$4);
      } else {
         $$2.b(bsh.N);
      }
   }

   private boolean a(cbu $$0) {
      return this.a($$0.eS()) || this.a($$0.eT());
   }

   private boolean a(cjf $$0) {
      return this.d.a($$0);
   }

   @Override
   public Set<bsh<?>> a() {
      return ImmutableSet.of(bsh.N);
   }
}
