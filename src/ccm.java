import com.google.common.collect.ImmutableSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class ccm extends cda<bsq> {
   private static final int a = 200;
   private static final int c = 599;

   public ccm() {
      this(200);
   }

   public ccm(int $$0) {
      super($$0);
   }

   @Override
   protected void a(aqn $$0, bsq $$1) {
      a($$1);
   }

   @Override
   public Set<cbu<?>> a() {
      return ImmutableSet.of(cbu.g);
   }

   public static void a(bsq $$0) {
      Optional<List<bsq>> $$1 = $$0.dS().c(cbu.g);
      if (!$$1.isEmpty()) {
         boolean $$2 = $$1.get().stream().anyMatch($$0x -> $$0x.ak().equals(bsc.af));
         if ($$2) {
            b($$0);
         }
      }
   }

   public static void b(bsq $$0) {
      $$0.dS().a(cbu.F, true, 599L);
   }
}
