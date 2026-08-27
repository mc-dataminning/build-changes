import com.google.common.collect.ImmutableSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class bzj extends bzx<bpo> {
   private static final int a = 200;
   private static final int c = 599;

   public bzj() {
      this(200);
   }

   public bzj(int $$0) {
      super($$0);
   }

   @Override
   protected void a(apf $$0, bpo $$1) {
      a($$1);
   }

   @Override
   public Set<byr<?>> a() {
      return ImmutableSet.of(byr.g);
   }

   public static void a(bpo $$0) {
      Optional<List<bpo>> $$1 = $$0.dP().c(byr.g);
      if (!$$1.isEmpty()) {
         boolean $$2 = $$1.get().stream().anyMatch($$0x -> $$0x.ai().equals(bpc.af));
         if ($$2) {
            b($$0);
         }
      }
   }

   public static void b(bpo $$0) {
      $$0.dP().a(byr.F, true, 599L);
   }
}
