import com.google.common.collect.ImmutableSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class cgw extends chk<bxc> {
   private static final int a = 200;
   private static final int b = 599;

   public cgw() {
      this(200);
   }

   public cgw(int $$0) {
      super($$0);
   }

   @Override
   protected void a(arq $$0, bxc $$1) {
      a($$1);
   }

   @Override
   public Set<cge<?>> a() {
      return ImmutableSet.of(cge.g);
   }

   public static void a(bxc $$0) {
      Optional<List<bxc>> $$1 = $$0.eb().c(cge.g);
      if (!$$1.isEmpty()) {
         boolean $$2 = $$1.get().stream().anyMatch($$0x -> $$0x.aq().equals(bwm.ap));
         if ($$2) {
            b($$0);
         }
      }
   }

   public static void b(bxc $$0) {
      $$0.eb().a(cge.G, true, 599L);
   }
}
