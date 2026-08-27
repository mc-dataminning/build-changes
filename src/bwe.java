import com.google.common.collect.ImmutableSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class bwe extends bwr<bmk> {
   private static final int a = 200;
   private static final int c = 599;

   public bwe() {
      this(200);
   }

   public bwe(int $$0) {
      super($$0);
   }

   @Override
   protected void a(and $$0, bmk $$1) {
      a($$1);
   }

   @Override
   public Set<bvm<?>> a() {
      return ImmutableSet.of(bvm.g);
   }

   public static void a(bmk $$0) {
      Optional<List<bmk>> $$1 = $$0.dO().c(bvm.g);
      if (!$$1.isEmpty()) {
         boolean $$2 = $$1.get().stream().anyMatch($$0x -> $$0x.ai().equals(bly.ad));
         if ($$2) {
            b($$0);
         }
      }
   }

   public static void b(bmk $$0) {
      $$0.dO().a(bvm.F, true, 599L);
   }
}
