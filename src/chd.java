import com.google.common.collect.ImmutableSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class chd extends chr<bxj> {
   private static final int a = 200;
   private static final int b = 599;

   public chd() {
      this(200);
   }

   public chd(int $$0) {
      super($$0);
   }

   @Override
   protected void a(arq $$0, bxj $$1) {
      a($$1);
   }

   @Override
   public Set<cgl<?>> a() {
      return ImmutableSet.of(cgl.g);
   }

   public static void a(bxj $$0) {
      Optional<List<bxj>> $$1 = $$0.eb().c(cgl.g);
      if (!$$1.isEmpty()) {
         boolean $$2 = $$1.get().stream().anyMatch($$0x -> $$0x.an().equals(bwr.ap));
         if ($$2) {
            b($$0);
         }
      }
   }

   public static void b(bxj $$0) {
      $$0.eb().a(cgl.G, true, 599L);
   }
}
