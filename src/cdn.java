import com.google.common.collect.ImmutableSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class cdn extends ceb<btr> {
   private static final int a = 200;
   private static final int c = 599;

   public cdn() {
      this(200);
   }

   public cdn(int $$0) {
      super($$0);
   }

   @Override
   protected void a(arf $$0, btr $$1) {
      a($$1);
   }

   @Override
   public Set<ccv<?>> a() {
      return ImmutableSet.of(ccv.g);
   }

   public static void a(btr $$0) {
      Optional<List<btr>> $$1 = $$0.dS().c(ccv.g);
      if (!$$1.isEmpty()) {
         boolean $$2 = $$1.get().stream().anyMatch($$0x -> $$0x.ak().equals(btc.af));
         if ($$2) {
            b($$0);
         }
      }
   }

   public static void b(btr $$0) {
      $$0.dS().a(ccv.F, true, 599L);
   }
}
