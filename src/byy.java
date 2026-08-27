import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class byy extends bzg<boz> {
   private static final long c = 32L;
   private static final long d = 16L;
   public static final int a = 32;

   @Override
   public Set<bya<?>> a() {
      return ImmutableSet.of(bya.L);
   }

   protected void a(apa $$0, boz $$1) {
      bpy<?> $$2 = $$1.dM();
      List<cel> $$3 = $$0.a(cel.class, $$1.cE().c(32.0, 16.0, 32.0), $$0x -> true);
      $$3.sort(Comparator.comparingDouble($$1::f));
      Optional<cel> $$4 = $$3.stream().filter($$1x -> $$1.k($$1x.q())).filter($$1x -> $$1x.a($$1, 32.0)).filter($$1::D).findFirst();
      $$2.a(bya.L, $$4);
   }
}
