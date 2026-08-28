import com.google.common.collect.ImmutableSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class cdk extends cdy<btn> {
   private static final int a = 200;
   private static final int c = 599;

   public cdk() {
      this(200);
   }

   public cdk(int $$0) {
      super($$0);
   }

   @Override
   protected void a(aqu $$0, btn $$1) {
      a($$1);
   }

   @Override
   public Set<ccs<?>> a() {
      return ImmutableSet.of(ccs.g);
   }

   public static void a(btn $$0) {
      Optional<List<btn>> $$1 = $$0.dT().c(ccs.g);
      if (!$$1.isEmpty()) {
         boolean $$2 = $$1.get().stream().anyMatch($$0x -> $$0x.am().equals(bsx.af));
         if ($$2) {
            b($$0);
         }
      }
   }

   public static void b(btn $$0) {
      $$0.dT().a(ccs.F, true, 599L);
   }
}
