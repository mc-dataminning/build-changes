import com.google.common.collect.ImmutableSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class bsq extends btd<biy> {
   private static final int a = 200;
   private static final int c = 599;

   public bsq() {
      this(200);
   }

   public bsq(int $$0) {
      super($$0);
   }

   @Override
   protected void a(akk $$0, biy $$1) {
      a($$1);
   }

   @Override
   public Set<brz<?>> a() {
      return ImmutableSet.of(brz.g);
   }

   public static void a(biy $$0) {
      Optional<List<biy>> $$1 = $$0.dM().c(brz.g);
      if (!$$1.isEmpty()) {
         boolean $$2 = $$1.get().stream().anyMatch($$0x -> $$0x.ag().equals(bim.ac));
         if ($$2) {
            b($$0);
         }
      }
   }

   public static void b(biy $$0) {
      $$0.dM().a(brz.F, true, 599L);
   }
}
