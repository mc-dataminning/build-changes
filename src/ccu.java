import com.google.common.collect.ImmutableSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class ccu extends cdi<bsy> {
   private static final int a = 200;
   private static final int c = 599;

   public ccu() {
      this(200);
   }

   public ccu(int $$0) {
      super($$0);
   }

   @Override
   protected void a(aqk $$0, bsy $$1) {
      a($$1);
   }

   @Override
   public Set<ccc<?>> a() {
      return ImmutableSet.of(ccc.g);
   }

   public static void a(bsy $$0) {
      Optional<List<bsy>> $$1 = $$0.dT().c(ccc.g);
      if (!$$1.isEmpty()) {
         boolean $$2 = $$1.get().stream().anyMatch($$0x -> $$0x.ak().equals(bsj.af));
         if ($$2) {
            b($$0);
         }
      }
   }

   public static void b(bsy $$0) {
      $$0.dT().a(ccc.F, true, 599L);
   }
}
