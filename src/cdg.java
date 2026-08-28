import com.google.common.collect.ImmutableSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class cdg extends cdu<btk> {
   private static final int a = 200;
   private static final int c = 599;

   public cdg() {
      this(200);
   }

   public cdg(int $$0) {
      super($$0);
   }

   @Override
   protected void a(arb $$0, btk $$1) {
      a($$1);
   }

   @Override
   public Set<cco<?>> a() {
      return ImmutableSet.of(cco.g);
   }

   public static void a(btk $$0) {
      Optional<List<btk>> $$1 = $$0.dS().c(cco.g);
      if (!$$1.isEmpty()) {
         boolean $$2 = $$1.get().stream().anyMatch($$0x -> $$0x.ak().equals(bsv.af));
         if ($$2) {
            b($$0);
         }
      }
   }

   public static void b(btk $$0) {
      $$0.dS().a(cco.F, true, 599L);
   }
}
