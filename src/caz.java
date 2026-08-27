import com.google.common.collect.ImmutableSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class caz extends cbn<bre> {
   private static final int a = 200;
   private static final int c = 599;

   public caz() {
      this(200);
   }

   public caz(int $$0) {
      super($$0);
   }

   @Override
   protected void a(aqe $$0, bre $$1) {
      a($$1);
   }

   @Override
   public Set<cah<?>> a() {
      return ImmutableSet.of(cah.g);
   }

   public static void a(bre $$0) {
      Optional<List<bre>> $$1 = $$0.dQ().c(cah.g);
      if (!$$1.isEmpty()) {
         boolean $$2 = $$1.get().stream().anyMatch($$0x -> $$0x.ai().equals(bqr.af));
         if ($$2) {
            b($$0);
         }
      }
   }

   public static void b(bre $$0) {
      $$0.dQ().a(cah.F, true, 599L);
   }
}
