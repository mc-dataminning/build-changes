import com.google.common.collect.ImmutableSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class cgt extends chh<bwz> {
   private static final int a = 200;
   private static final int b = 599;

   public cgt() {
      this(200);
   }

   public cgt(int $$0) {
      super($$0);
   }

   @Override
   protected void a(aro $$0, bwz $$1) {
      a($$1);
   }

   @Override
   public Set<cgb<?>> a() {
      return ImmutableSet.of(cgb.g);
   }

   public static void a(bwz $$0) {
      Optional<List<bwz>> $$1 = $$0.eb().c(cgb.g);
      if (!$$1.isEmpty()) {
         boolean $$2 = $$1.get().stream().anyMatch($$0x -> $$0x.aq().equals(bwj.ap));
         if ($$2) {
            b($$0);
         }
      }
   }

   public static void b(bwz $$0) {
      $$0.eb().a(cgb.G, true, 599L);
   }
}
