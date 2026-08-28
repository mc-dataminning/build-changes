import com.google.common.collect.ImmutableSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class cfb extends cfp<bvf> {
   private static final int a = 200;
   private static final int b = 599;

   public cfb() {
      this(200);
   }

   public cfb(int $$0) {
      super($$0);
   }

   @Override
   protected void a(arc $$0, bvf $$1) {
      a($$1);
   }

   @Override
   public Set<cej<?>> a() {
      return ImmutableSet.of(cej.g);
   }

   public static void a(bvf $$0) {
      Optional<List<bvf>> $$1 = $$0.ec().c(cej.g);
      if (!$$1.isEmpty()) {
         boolean $$2 = $$1.get().stream().anyMatch($$0x -> $$0x.aq().equals(buq.ap));
         if ($$2) {
            b($$0);
         }
      }
   }

   public static void b(bvf $$0) {
      $$0.ec().a(cej.F, true, 599L);
   }
}
