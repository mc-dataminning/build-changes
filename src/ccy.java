import com.google.common.collect.ImmutableSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class ccy extends cdm<btc> {
   private static final int a = 200;
   private static final int c = 599;

   public ccy() {
      this(200);
   }

   public ccy(int $$0) {
      super($$0);
   }

   @Override
   protected void a(aqm $$0, btc $$1) {
      a($$1);
   }

   @Override
   public Set<ccg<?>> a() {
      return ImmutableSet.of(ccg.g);
   }

   public static void a(btc $$0) {
      Optional<List<btc>> $$1 = $$0.dV().c(ccg.g);
      if (!$$1.isEmpty()) {
         boolean $$2 = $$1.get().stream().anyMatch($$0x -> $$0x.am().equals(bsn.af));
         if ($$2) {
            b($$0);
         }
      }
   }

   public static void b(btc $$0) {
      $$0.dV().a(ccg.F, true, 599L);
   }
}
