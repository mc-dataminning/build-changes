import com.google.common.collect.ImmutableSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class cdl extends cdz<btp> {
   private static final int a = 200;
   private static final int c = 599;

   public cdl() {
      this(200);
   }

   public cdl(int $$0) {
      super($$0);
   }

   @Override
   protected void a(arf $$0, btp $$1) {
      a($$1);
   }

   @Override
   public Set<cct<?>> a() {
      return ImmutableSet.of(cct.g);
   }

   public static void a(btp $$0) {
      Optional<List<btp>> $$1 = $$0.dS().c(cct.g);
      if (!$$1.isEmpty()) {
         boolean $$2 = $$1.get().stream().anyMatch($$0x -> $$0x.ak().equals(bta.af));
         if ($$2) {
            b($$0);
         }
      }
   }

   public static void b(btp $$0) {
      $$0.dS().a(cct.F, true, 599L);
   }
}
