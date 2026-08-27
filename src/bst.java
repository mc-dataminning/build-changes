import com.google.common.collect.ImmutableSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class bst extends btg<bjb> {
   private static final int a = 200;
   private static final int c = 599;

   public bst() {
      this(200);
   }

   public bst(int $$0) {
      super($$0);
   }

   @Override
   protected void a(akn $$0, bjb $$1) {
      a($$1);
   }

   @Override
   public Set<bsc<?>> a() {
      return ImmutableSet.of(bsc.g);
   }

   public static void a(bjb $$0) {
      Optional<List<bjb>> $$1 = $$0.dM().c(bsc.g);
      if (!$$1.isEmpty()) {
         boolean $$2 = $$1.get().stream().anyMatch($$0x -> $$0x.ag().equals(bip.ac));
         if ($$2) {
            b($$0);
         }
      }
   }

   public static void b(bjb $$0) {
      $$0.dM().a(bsc.F, true, 599L);
   }
}
