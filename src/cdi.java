import com.google.common.collect.ImmutableSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class cdi extends cdw<btl> {
   private static final int a = 200;
   private static final int c = 599;

   public cdi() {
      this(200);
   }

   public cdi(int $$0) {
      super($$0);
   }

   @Override
   protected void a(aqt $$0, btl $$1) {
      a($$1);
   }

   @Override
   public Set<ccq<?>> a() {
      return ImmutableSet.of(ccq.g);
   }

   public static void a(btl $$0) {
      Optional<List<btl>> $$1 = $$0.dU().c(ccq.g);
      if (!$$1.isEmpty()) {
         boolean $$2 = $$1.get().stream().anyMatch($$0x -> $$0x.am().equals(bsw.af));
         if ($$2) {
            b($$0);
         }
      }
   }

   public static void b(btl $$0) {
      $$0.dU().a(ccq.F, true, 599L);
   }
}
