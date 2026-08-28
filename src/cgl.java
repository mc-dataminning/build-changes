import com.google.common.collect.ImmutableSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class cgl extends cgz<bwr> {
   private static final int a = 200;
   private static final int b = 599;

   public cgl() {
      this(200);
   }

   public cgl(int $$0) {
      super($$0);
   }

   @Override
   protected void a(arn $$0, bwr $$1) {
      a($$1);
   }

   @Override
   public Set<cft<?>> a() {
      return ImmutableSet.of(cft.g);
   }

   public static void a(bwr $$0) {
      Optional<List<bwr>> $$1 = $$0.eb().c(cft.g);
      if (!$$1.isEmpty()) {
         boolean $$2 = $$1.get().stream().anyMatch($$0x -> $$0x.aq().equals(bwb.ap));
         if ($$2) {
            b($$0);
         }
      }
   }

   public static void b(bwr $$0) {
      $$0.eb().a(cft.G, true, 599L);
   }
}
