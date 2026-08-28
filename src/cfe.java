import com.google.common.collect.ImmutableSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class cfe extends cfs<bvi> {
   private static final int a = 200;
   private static final int b = 599;

   public cfe() {
      this(200);
   }

   public cfe(int $$0) {
      super($$0);
   }

   @Override
   protected void a(ard $$0, bvi $$1) {
      a($$1);
   }

   @Override
   public Set<cem<?>> a() {
      return ImmutableSet.of(cem.g);
   }

   public static void a(bvi $$0) {
      Optional<List<bvi>> $$1 = $$0.eb().c(cem.g);
      if (!$$1.isEmpty()) {
         boolean $$2 = $$1.get().stream().anyMatch($$0x -> $$0x.aq().equals(but.ap));
         if ($$2) {
            b($$0);
         }
      }
   }

   public static void b(bvi $$0) {
      $$0.eb().a(cem.F, true, 599L);
   }
}
