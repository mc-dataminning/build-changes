import com.google.common.collect.ImmutableSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class cfx extends cgl<bwb> {
   private static final int a = 200;
   private static final int b = 599;

   public cfx() {
      this(200);
   }

   public cfx(int $$0) {
      super($$0);
   }

   @Override
   protected void a(ash $$0, bwb $$1) {
      a($$1);
   }

   @Override
   public Set<cff<?>> a() {
      return ImmutableSet.of(cff.g);
   }

   public static void a(bwb $$0) {
      Optional<List<bwb>> $$1 = $$0.eb().c(cff.g);
      if (!$$1.isEmpty()) {
         boolean $$2 = $$1.get().stream().anyMatch($$0x -> $$0x.aq().equals(bvm.aq));
         if ($$2) {
            b($$0);
         }
      }
   }

   public static void b(bwb $$0) {
      $$0.eb().a(cff.F, true, 599L);
   }
}
