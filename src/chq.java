import com.google.common.collect.ImmutableSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class chq extends cie<bxw> {
   private static final int a = 200;
   private static final int b = 599;

   public chq() {
      this(200);
   }

   public chq(int $$0) {
      super($$0);
   }

   @Override
   protected void a(aru $$0, bxw $$1) {
      a($$1);
   }

   @Override
   public Set<cgy<?>> a() {
      return ImmutableSet.of(cgy.g);
   }

   public static void a(bxw $$0) {
      Optional<List<bxw>> $$1 = $$0.ec().c(cgy.g);
      if (!$$1.isEmpty()) {
         boolean $$2 = $$1.get().stream().anyMatch($$0x -> $$0x.an().equals(bxe.aq));
         if ($$2) {
            b($$0);
         }
      }
   }

   public static void b(bxw $$0) {
      $$0.ec().a(cgy.G, true, 599L);
   }
}
