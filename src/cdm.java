import com.google.common.collect.ImmutableSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class cdm extends cea<btq> {
   private static final int a = 200;
   private static final int c = 599;

   public cdm() {
      this(200);
   }

   public cdm(int $$0) {
      super($$0);
   }

   @Override
   protected void a(arf $$0, btq $$1) {
      a($$1);
   }

   @Override
   public Set<ccu<?>> a() {
      return ImmutableSet.of(ccu.g);
   }

   public static void a(btq $$0) {
      Optional<List<btq>> $$1 = $$0.dS().c(ccu.g);
      if (!$$1.isEmpty()) {
         boolean $$2 = $$1.get().stream().anyMatch($$0x -> $$0x.ak().equals(btb.af));
         if ($$2) {
            b($$0);
         }
      }
   }

   public static void b(btq $$0) {
      $$0.dS().a(ccu.F, true, 599L);
   }
}
