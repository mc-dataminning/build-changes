import com.google.common.collect.ImmutableSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class byd extends byr<boi> {
   private static final int a = 200;
   private static final int c = 599;

   public byd() {
      this(200);
   }

   public byd(int $$0) {
      super($$0);
   }

   @Override
   protected void a(aow $$0, boi $$1) {
      a($$1);
   }

   @Override
   public Set<bxl<?>> a() {
      return ImmutableSet.of(bxl.g);
   }

   public static void a(boi $$0) {
      Optional<List<boi>> $$1 = $$0.dO().c(bxl.g);
      if (!$$1.isEmpty()) {
         boolean $$2 = $$1.get().stream().anyMatch($$0x -> $$0x.ai().equals(bnw.ae));
         if ($$2) {
            b($$0);
         }
      }
   }

   public static void b(boi $$0) {
      $$0.dO().a(bxl.F, true, 599L);
   }
}
