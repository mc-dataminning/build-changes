import com.google.common.collect.ImmutableSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class bwf extends bws<bml> {
   private static final int a = 200;
   private static final int c = 599;

   public bwf() {
      this(200);
   }

   public bwf(int $$0) {
      super($$0);
   }

   @Override
   protected void a(and $$0, bml $$1) {
      a($$1);
   }

   @Override
   public Set<bvn<?>> a() {
      return ImmutableSet.of(bvn.g);
   }

   public static void a(bml $$0) {
      Optional<List<bml>> $$1 = $$0.dO().c(bvn.g);
      if (!$$1.isEmpty()) {
         boolean $$2 = $$1.get().stream().anyMatch($$0x -> $$0x.ai().equals(blz.ad));
         if ($$2) {
            b($$0);
         }
      }
   }

   public static void b(bml $$0) {
      $$0.dO().a(bvn.F, true, 599L);
   }
}
