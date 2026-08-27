import com.google.common.collect.ImmutableSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class buq extends bvd<bky> {
   private static final int a = 200;
   private static final int c = 599;

   public buq() {
      this(200);
   }

   public buq(int $$0) {
      super($$0);
   }

   @Override
   protected void a(ama $$0, bky $$1) {
      a($$1);
   }

   @Override
   public Set<btz<?>> a() {
      return ImmutableSet.of(btz.g);
   }

   public static void a(bky $$0) {
      Optional<List<bky>> $$1 = $$0.dN().c(btz.g);
      if (!$$1.isEmpty()) {
         boolean $$2 = $$1.get().stream().anyMatch($$0x -> $$0x.ag().equals(bkm.ac));
         if ($$2) {
            b($$0);
         }
      }
   }

   public static void b(bky $$0) {
      $$0.dN().a(btz.F, true, 599L);
   }
}
