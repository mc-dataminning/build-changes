import com.google.common.collect.ImmutableSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class cgc extends cgq<bwg> {
   private static final int a = 200;
   private static final int b = 599;

   public cgc() {
      this(200);
   }

   public cgc(int $$0) {
      super($$0);
   }

   @Override
   protected void a(ash $$0, bwg $$1) {
      a($$1);
   }

   @Override
   public Set<cfk<?>> a() {
      return ImmutableSet.of(cfk.g);
   }

   public static void a(bwg $$0) {
      Optional<List<bwg>> $$1 = $$0.ec().c(cfk.g);
      if (!$$1.isEmpty()) {
         boolean $$2 = $$1.get().stream().anyMatch($$0x -> $$0x.aq().equals(bvr.aq));
         if ($$2) {
            b($$0);
         }
      }
   }

   public static void b(bwg $$0) {
      $$0.ec().a(cfk.F, true, 599L);
   }
}
