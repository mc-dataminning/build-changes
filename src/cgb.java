import com.google.common.collect.ImmutableSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class cgb extends cgp<bwf> {
   private static final int a = 200;
   private static final int b = 599;

   public cgb() {
      this(200);
   }

   public cgb(int $$0) {
      super($$0);
   }

   @Override
   protected void a(ash $$0, bwf $$1) {
      a($$1);
   }

   @Override
   public Set<cfj<?>> a() {
      return ImmutableSet.of(cfj.g);
   }

   public static void a(bwf $$0) {
      Optional<List<bwf>> $$1 = $$0.ec().c(cfj.g);
      if (!$$1.isEmpty()) {
         boolean $$2 = $$1.get().stream().anyMatch($$0x -> $$0x.aq().equals(bvq.aq));
         if ($$2) {
            b($$0);
         }
      }
   }

   public static void b(bwf $$0) {
      $$0.ec().a(cfj.F, true, 599L);
   }
}
