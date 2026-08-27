import com.google.common.collect.ImmutableSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class bwi extends bww<bmo> {
   private static final int a = 200;
   private static final int c = 599;

   public bwi() {
      this(200);
   }

   public bwi(int $$0) {
      super($$0);
   }

   @Override
   protected void a(ane $$0, bmo $$1) {
      a($$1);
   }

   @Override
   public Set<bvq<?>> a() {
      return ImmutableSet.of(bvq.g);
   }

   public static void a(bmo $$0) {
      Optional<List<bmo>> $$1 = $$0.dN().c(bvq.g);
      if (!$$1.isEmpty()) {
         boolean $$2 = $$1.get().stream().anyMatch($$0x -> $$0x.ai().equals(bmc.ae));
         if ($$2) {
            b($$0);
         }
      }
   }

   public static void b(bmo $$0) {
      $$0.dN().a(bvq.F, true, 599L);
   }
}
