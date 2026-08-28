import com.google.common.collect.ImmutableSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class cer extends cff<buv> {
   private static final int a = 200;
   private static final int b = 599;

   public cer() {
      this(200);
   }

   public cer(int $$0) {
      super($$0);
   }

   @Override
   protected void a(arm $$0, buv $$1) {
      a($$1);
   }

   @Override
   public Set<cdz<?>> a() {
      return ImmutableSet.of(cdz.g);
   }

   public static void a(buv $$0) {
      Optional<List<buv>> $$1 = $$0.ed().c(cdz.g);
      if (!$$1.isEmpty()) {
         boolean $$2 = $$1.get().stream().anyMatch($$0x -> $$0x.aq().equals(bug.af));
         if ($$2) {
            b($$0);
         }
      }
   }

   public static void b(buv $$0) {
      $$0.ed().a(cdz.F, true, 599L);
   }
}
