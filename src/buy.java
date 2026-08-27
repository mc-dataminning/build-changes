import com.google.common.collect.ImmutableSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class buy extends bvl<blg> {
   private static final int a = 200;
   private static final int c = 599;

   public buy() {
      this(200);
   }

   public buy(int $$0) {
      super($$0);
   }

   @Override
   protected void a(ame $$0, blg $$1) {
      a($$1);
   }

   @Override
   public Set<buh<?>> a() {
      return ImmutableSet.of(buh.g);
   }

   public static void a(blg $$0) {
      Optional<List<blg>> $$1 = $$0.dP().c(buh.g);
      if (!$$1.isEmpty()) {
         boolean $$2 = $$1.get().stream().anyMatch($$0x -> $$0x.ai().equals(bku.ac));
         if ($$2) {
            b($$0);
         }
      }
   }

   public static void b(blg $$0) {
      $$0.dP().a(buh.F, true, 599L);
   }
}
