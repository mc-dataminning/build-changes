import com.google.common.collect.ImmutableSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class cfd extends cfr<bvh> {
   private static final int a = 200;
   private static final int b = 599;

   public cfd() {
      this(200);
   }

   public cfd(int $$0) {
      super($$0);
   }

   @Override
   protected void a(ard $$0, bvh $$1) {
      a($$1);
   }

   @Override
   public Set<cel<?>> a() {
      return ImmutableSet.of(cel.g);
   }

   public static void a(bvh $$0) {
      Optional<List<bvh>> $$1 = $$0.eb().c(cel.g);
      if (!$$1.isEmpty()) {
         boolean $$2 = $$1.get().stream().anyMatch($$0x -> $$0x.aq().equals(bus.ap));
         if ($$2) {
            b($$0);
         }
      }
   }

   public static void b(bvh $$0) {
      $$0.eb().a(cel.F, true, 599L);
   }
}
