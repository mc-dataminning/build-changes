import com.google.common.collect.ImmutableSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class cdj extends cdx<btn> {
   private static final int a = 200;
   private static final int c = 599;

   public cdj() {
      this(200);
   }

   public cdj(int $$0) {
      super($$0);
   }

   @Override
   protected void a(are $$0, btn $$1) {
      a($$1);
   }

   @Override
   public Set<ccr<?>> a() {
      return ImmutableSet.of(ccr.g);
   }

   public static void a(btn $$0) {
      Optional<List<btn>> $$1 = $$0.dS().c(ccr.g);
      if (!$$1.isEmpty()) {
         boolean $$2 = $$1.get().stream().anyMatch($$0x -> $$0x.ak().equals(bsy.af));
         if ($$2) {
            b($$0);
         }
      }
   }

   public static void b(btn $$0) {
      $$0.dS().a(ccr.F, true, 599L);
   }
}
