import com.google.common.collect.ImmutableSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class cck extends ccy<bso> {
   private static final int a = 200;
   private static final int c = 599;

   public cck() {
      this(200);
   }

   public cck(int $$0) {
      super($$0);
   }

   @Override
   protected void a(aqm $$0, bso $$1) {
      a($$1);
   }

   @Override
   public Set<cbs<?>> a() {
      return ImmutableSet.of(cbs.g);
   }

   public static void a(bso $$0) {
      Optional<List<bso>> $$1 = $$0.dS().c(cbs.g);
      if (!$$1.isEmpty()) {
         boolean $$2 = $$1.get().stream().anyMatch($$0x -> $$0x.ak().equals(bsa.af));
         if ($$2) {
            b($$0);
         }
      }
   }

   public static void b(bso $$0) {
      $$0.dS().a(cbs.F, true, 599L);
   }
}
