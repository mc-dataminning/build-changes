import com.google.common.collect.ImmutableSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class cdk extends cdy<bto> {
   private static final int a = 200;
   private static final int c = 599;

   public cdk() {
      this(200);
   }

   public cdk(int $$0) {
      super($$0);
   }

   @Override
   protected void a(are $$0, bto $$1) {
      a($$1);
   }

   @Override
   public Set<ccs<?>> a() {
      return ImmutableSet.of(ccs.g);
   }

   public static void a(bto $$0) {
      Optional<List<bto>> $$1 = $$0.dS().c(ccs.g);
      if (!$$1.isEmpty()) {
         boolean $$2 = $$1.get().stream().anyMatch($$0x -> $$0x.ak().equals(bsz.af));
         if ($$2) {
            b($$0);
         }
      }
   }

   public static void b(bto $$0) {
      $$0.dS().a(ccs.F, true, 599L);
   }
}
