import com.google.common.collect.ImmutableSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class bys extends bzg<box> {
   private static final int a = 200;
   private static final int c = 599;

   public bys() {
      this(200);
   }

   public bys(int $$0) {
      super($$0);
   }

   @Override
   protected void a(apa $$0, box $$1) {
      a($$1);
   }

   @Override
   public Set<bya<?>> a() {
      return ImmutableSet.of(bya.g);
   }

   public static void a(box $$0) {
      Optional<List<box>> $$1 = $$0.dM().c(bya.g);
      if (!$$1.isEmpty()) {
         boolean $$2 = $$1.get().stream().anyMatch($$0x -> $$0x.ai().equals(bol.ae));
         if ($$2) {
            b($$0);
         }
      }
   }

   public static void b(box $$0) {
      $$0.dM().a(bya.F, true, 599L);
   }
}
