import com.google.common.collect.ImmutableSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class chz extends cin<byf> {
   private static final int a = 200;
   private static final int b = 599;

   public chz() {
      this(200);
   }

   public chz(int $$0) {
      super($$0);
   }

   @Override
   protected void a(asb $$0, byf $$1) {
      a($$1);
   }

   @Override
   public Set<chh<?>> a() {
      return ImmutableSet.of(chh.g);
   }

   public static void a(byf $$0) {
      Optional<List<byf>> $$1 = $$0.ec().c(chh.g);
      if (!$$1.isEmpty()) {
         boolean $$2 = $$1.get().stream().anyMatch($$0x -> $$0x.an().equals(bxn.aq));
         if ($$2) {
            b($$0);
         }
      }
   }

   public static void b(byf $$0) {
      $$0.ec().a(chh.G, true, 599L);
   }
}
