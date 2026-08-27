import com.google.common.collect.ImmutableSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class bxz extends byn<bog> {
   private static final int a = 200;
   private static final int c = 599;

   public bxz() {
      this(200);
   }

   public bxz(int $$0) {
      super($$0);
   }

   @Override
   protected void a(aov $$0, bog $$1) {
      a($$1);
   }

   @Override
   public Set<bxh<?>> a() {
      return ImmutableSet.of(bxh.g);
   }

   public static void a(bog $$0) {
      Optional<List<bog>> $$1 = $$0.dO().c(bxh.g);
      if (!$$1.isEmpty()) {
         boolean $$2 = $$1.get().stream().anyMatch($$0x -> $$0x.ai().equals(bnu.ae));
         if ($$2) {
            b($$0);
         }
      }
   }

   public static void b(bog $$0) {
      $$0.dO().a(bxh.F, true, 599L);
   }
}
