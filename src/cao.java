import com.google.common.collect.ImmutableSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class cao extends cbc<bqt> {
   private static final int a = 200;
   private static final int c = 599;

   public cao() {
      this(200);
   }

   public cao(int $$0) {
      super($$0);
   }

   @Override
   protected void a(apu $$0, bqt $$1) {
      a($$1);
   }

   @Override
   public Set<bzw<?>> a() {
      return ImmutableSet.of(bzw.g);
   }

   public static void a(bqt $$0) {
      Optional<List<bqt>> $$1 = $$0.dP().c(bzw.g);
      if (!$$1.isEmpty()) {
         boolean $$2 = $$1.get().stream().anyMatch($$0x -> $$0x.ai().equals(bqg.af));
         if ($$2) {
            b($$0);
         }
      }
   }

   public static void b(bqt $$0) {
      $$0.dP().a(bzw.F, true, 599L);
   }
}
