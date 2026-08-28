import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class ceg extends ceo<buh> {
   private static final long b = 32L;
   private static final long c = 16L;
   public static final int a = 32;

   @Override
   public Set<cdi<?>> a() {
      return ImmutableSet.of(cdi.L);
   }

   protected void a(arg $$0, buh $$1) {
      bvg<?> $$2 = $$1.dX();
      List<cjz> $$3 = $$0.a(cjz.class, $$1.cO().c(32.0, 16.0, 32.0), $$0x -> true);
      $$3.sort(Comparator.comparingDouble($$1::g));
      Optional<cjz> $$4 = $$3.stream().filter($$1x -> $$1.l($$1x.m())).filter($$1x -> $$1x.a($$1, 32.0)).filter($$1::G).findFirst();
      $$2.a(cdi.L, $$4);
   }
}
