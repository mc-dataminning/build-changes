import com.google.common.collect.ImmutableSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class bvz extends bwm<bmf> {
   private static final int a = 200;
   private static final int c = 599;

   public bvz() {
      this(200);
   }

   public bvz(int $$0) {
      super($$0);
   }

   @Override
   protected void a(amz $$0, bmf $$1) {
      a($$1);
   }

   @Override
   public Set<bvh<?>> a() {
      return ImmutableSet.of(bvh.g);
   }

   public static void a(bmf $$0) {
      Optional<List<bmf>> $$1 = $$0.dO().c(bvh.g);
      if (!$$1.isEmpty()) {
         boolean $$2 = $$1.get().stream().anyMatch($$0x -> $$0x.ai().equals(blt.ad));
         if ($$2) {
            b($$0);
         }
      }
   }

   public static void b(bmf $$0) {
      $$0.dO().a(bvh.F, true, 599L);
   }
}
