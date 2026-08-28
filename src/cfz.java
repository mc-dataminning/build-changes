import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class cfz extends cgh<bvz> {
   private static final long b = 32L;
   private static final long c = 16L;
   public static final int a = 32;

   @Override
   public Set<cfb<?>> a() {
      return ImmutableSet.of(cfb.L);
   }

   protected void a(arx $$0, bvz $$1) {
      bwz<?> $$2 = $$1.ec();
      List<cls> $$3 = $$0.a(cls.class, $$1.cR().c(32.0, 16.0, 32.0), $$0x -> true);
      $$3.sort(Comparator.comparingDouble($$1::g));
      Optional<cls> $$4 = $$3.stream().filter($$2x -> $$1.c($$0, $$2x.l())).filter($$1x -> $$1x.a($$1, 32.0)).filter($$1::E).findFirst();
      $$2.a(cfb.L, $$4);
   }
}
