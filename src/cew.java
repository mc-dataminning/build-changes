import com.google.common.collect.ImmutableSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class cew extends cfk<bva> {
   private static final int a = 200;
   private static final int b = 599;

   public cew() {
      this(200);
   }

   public cew(int $$0) {
      super($$0);
   }

   @Override
   protected void a(arn $$0, bva $$1) {
      a($$1);
   }

   @Override
   public Set<cee<?>> a() {
      return ImmutableSet.of(cee.g);
   }

   public static void a(bva $$0) {
      Optional<List<bva>> $$1 = $$0.ed().c(cee.g);
      if (!$$1.isEmpty()) {
         boolean $$2 = $$1.get().stream().anyMatch($$0x -> $$0x.ar().equals(bul.af));
         if ($$2) {
            b($$0);
         }
      }
   }

   public static void b(bva $$0) {
      $$0.ed().a(cee.F, true, 599L);
   }
}
