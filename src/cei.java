import com.google.common.collect.ImmutableSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class cei extends cew<bun> {
   private static final int a = 200;
   private static final int b = 599;

   public cei() {
      this(200);
   }

   public cei(int $$0) {
      super($$0);
   }

   @Override
   protected void a(arj $$0, bun $$1) {
      a($$1);
   }

   @Override
   public Set<cdq<?>> a() {
      return ImmutableSet.of(cdq.g);
   }

   public static void a(bun $$0) {
      Optional<List<bun>> $$1 = $$0.dY().c(cdq.g);
      if (!$$1.isEmpty()) {
         boolean $$2 = $$1.get().stream().anyMatch($$0x -> $$0x.ao().equals(bty.af));
         if ($$2) {
            b($$0);
         }
      }
   }

   public static void b(bun $$0) {
      $$0.dY().a(cdq.F, true, 599L);
   }
}
