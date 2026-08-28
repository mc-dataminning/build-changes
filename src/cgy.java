import com.google.common.collect.ImmutableSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class cgy extends chm<bxe> {
   private static final int a = 200;
   private static final int b = 599;

   public cgy() {
      this(200);
   }

   public cgy(int $$0) {
      super($$0);
   }

   @Override
   protected void a(arq $$0, bxe $$1) {
      a($$1);
   }

   @Override
   public Set<cgg<?>> a() {
      return ImmutableSet.of(cgg.g);
   }

   public static void a(bxe $$0) {
      Optional<List<bxe>> $$1 = $$0.ec().c(cgg.g);
      if (!$$1.isEmpty()) {
         boolean $$2 = $$1.get().stream().anyMatch($$0x -> $$0x.aq().equals(bwo.ap));
         if ($$2) {
            b($$0);
         }
      }
   }

   public static void b(bxe $$0) {
      $$0.ec().a(cgg.G, true, 599L);
   }
}
