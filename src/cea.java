import com.google.common.collect.ImmutableSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class cea extends ceo<buf> {
   private static final int a = 200;
   private static final int b = 599;

   public cea() {
      this(200);
   }

   public cea(int $$0) {
      super($$0);
   }

   @Override
   protected void a(arg $$0, buf $$1) {
      a($$1);
   }

   @Override
   public Set<cdi<?>> a() {
      return ImmutableSet.of(cdi.g);
   }

   public static void a(buf $$0) {
      Optional<List<buf>> $$1 = $$0.dX().c(cdi.g);
      if (!$$1.isEmpty()) {
         boolean $$2 = $$1.get().stream().anyMatch($$0x -> $$0x.ao().equals(btq.af));
         if ($$2) {
            b($$0);
         }
      }
   }

   public static void b(buf $$0) {
      $$0.dX().a(cdi.F, true, 599L);
   }
}
