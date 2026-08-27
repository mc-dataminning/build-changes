import com.google.common.collect.ImmutableSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class bub extends buo<bkj> {
   private static final int a = 200;
   private static final int c = 599;

   public bub() {
      this(200);
   }

   public bub(int $$0) {
      super($$0);
   }

   @Override
   protected void a(alq $$0, bkj $$1) {
      a($$1);
   }

   @Override
   public Set<btk<?>> a() {
      return ImmutableSet.of(btk.g);
   }

   public static void a(bkj $$0) {
      Optional<List<bkj>> $$1 = $$0.dN().c(btk.g);
      if (!$$1.isEmpty()) {
         boolean $$2 = $$1.get().stream().anyMatch($$0x -> $$0x.ag().equals(bjx.ac));
         if ($$2) {
            b($$0);
         }
      }
   }

   public static void b(bkj $$0) {
      $$0.dN().a(btk.F, true, 599L);
   }
}
