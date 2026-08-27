import com.google.common.collect.ImmutableSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class bsp extends btc<biw> {
   private static final int a = 200;
   private static final int c = 599;

   public bsp() {
      this(200);
   }

   public bsp(int $$0) {
      super($$0);
   }

   @Override
   protected void a(aki $$0, biw $$1) {
      a($$1);
   }

   @Override
   public Set<bry<?>> a() {
      return ImmutableSet.of(bry.g);
   }

   public static void a(biw $$0) {
      Optional<List<biw>> $$1 = $$0.dM().c(bry.g);
      if ($$1.isPresent()) {
         boolean $$2 = $$1.get().stream().anyMatch($$0x -> $$0x.ag().equals(bik.ac));
         if ($$2) {
            b($$0);
         }
      }
   }

   public static void b(biw $$0) {
      $$0.dM().a(bry.F, true, 599L);
   }
}
