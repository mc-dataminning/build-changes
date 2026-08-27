import com.google.common.collect.ImmutableSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class bvp extends bwc<blv> {
   private static final int a = 200;
   private static final int c = 599;

   public bvp() {
      this(200);
   }

   public bvp(int $$0) {
      super($$0);
   }

   @Override
   protected void a(amp $$0, blv $$1) {
      a($$1);
   }

   @Override
   public Set<bux<?>> a() {
      return ImmutableSet.of(bux.g);
   }

   public static void a(blv $$0) {
      Optional<List<blv>> $$1 = $$0.dO().c(bux.g);
      if (!$$1.isEmpty()) {
         boolean $$2 = $$1.get().stream().anyMatch($$0x -> $$0x.ai().equals(blj.ad));
         if ($$2) {
            b($$0);
         }
      }
   }

   public static void b(blv $$0) {
      $$0.dO().a(bux.F, true, 599L);
   }
}
