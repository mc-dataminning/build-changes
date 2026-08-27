import com.google.common.collect.ImmutableSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class bta extends btn<bji> {
   private static final int a = 200;
   private static final int c = 599;

   public bta() {
      this(200);
   }

   public bta(int $$0) {
      super($$0);
   }

   @Override
   protected void a(aks $$0, bji $$1) {
      a($$1);
   }

   @Override
   public Set<bsj<?>> a() {
      return ImmutableSet.of(bsj.g);
   }

   public static void a(bji $$0) {
      Optional<List<bji>> $$1 = $$0.dN().c(bsj.g);
      if (!$$1.isEmpty()) {
         boolean $$2 = $$1.get().stream().anyMatch($$0x -> $$0x.ag().equals(biw.ac));
         if ($$2) {
            b($$0);
         }
      }
   }

   public static void b(bji $$0) {
      $$0.dN().a(bsj.F, true, 599L);
   }
}
