import com.google.common.collect.ImmutableSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class cbv extends ccj<bsa> {
   private static final int a = 200;
   private static final int c = 599;

   public cbv() {
      this(200);
   }

   public cbv(int $$0) {
      super($$0);
   }

   @Override
   protected void a(aqh $$0, bsa $$1) {
      a($$1);
   }

   @Override
   public Set<cbd<?>> a() {
      return ImmutableSet.of(cbd.g);
   }

   public static void a(bsa $$0) {
      Optional<List<bsa>> $$1 = $$0.dQ().c(cbd.g);
      if (!$$1.isEmpty()) {
         boolean $$2 = $$1.get().stream().anyMatch($$0x -> $$0x.ai().equals(brn.af));
         if ($$2) {
            b($$0);
         }
      }
   }

   public static void b(bsa $$0) {
      $$0.dQ().a(cbd.F, true, 599L);
   }
}
