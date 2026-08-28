import com.google.common.collect.ImmutableSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class ccx extends cdl<btb> {
   private static final int a = 200;
   private static final int c = 599;

   public ccx() {
      this(200);
   }

   public ccx(int $$0) {
      super($$0);
   }

   @Override
   protected void a(aqm $$0, btb $$1) {
      a($$1);
   }

   @Override
   public Set<ccf<?>> a() {
      return ImmutableSet.of(ccf.g);
   }

   public static void a(btb $$0) {
      Optional<List<btb>> $$1 = $$0.dU().c(ccf.g);
      if (!$$1.isEmpty()) {
         boolean $$2 = $$1.get().stream().anyMatch($$0x -> $$0x.al().equals(bsm.af));
         if ($$2) {
            b($$0);
         }
      }
   }

   public static void b(btb $$0) {
      $$0.dU().a(ccf.F, true, 599L);
   }
}
