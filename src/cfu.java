import com.google.common.collect.ImmutableSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class cfu extends cgi<bvy> {
   private static final int a = 200;
   private static final int b = 599;

   public cfu() {
      this(200);
   }

   public cfu(int $$0) {
      super($$0);
   }

   @Override
   protected void a(ard $$0, bvy $$1) {
      a($$1);
   }

   @Override
   public Set<cfc<?>> a() {
      return ImmutableSet.of(cfc.g);
   }

   public static void a(bvy $$0) {
      Optional<List<bvy>> $$1 = $$0.ea().c(cfc.g);
      if (!$$1.isEmpty()) {
         boolean $$2 = $$1.get().stream().anyMatch($$0x -> $$0x.aq().equals(bvi.ap));
         if ($$2) {
            b($$0);
         }
      }
   }

   public static void b(bvy $$0) {
      $$0.ea().a(cfc.F, true, 599L);
   }
}
